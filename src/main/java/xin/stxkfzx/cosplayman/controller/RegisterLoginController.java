package xin.stxkfzx.cosplayman.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xin.stxkfzx.cosplayman.domain.User;
import xin.stxkfzx.cosplayman.exception.RegisterException;
import xin.stxkfzx.cosplayman.service.RegisterLoginService;
import xin.stxkfzx.cosplayman.util.CheckUtils;
import xin.stxkfzx.cosplayman.vo.JSONResponse;
import xin.stxkfzx.cosplayman.vo.LoginInfoVO;
import xin.stxkfzx.cosplayman.vo.RegisterVO;

import javax.servlet.http.HttpSession;

/**
 * 注册登录 Controller
 *
 * @author fmy
 * @date 2018-07-21 23:49
 */
@Api(description = "登录注册接口API")
@RestController
public class RegisterLoginController {

    private final RegisterLoginService registerLoginService;
    private static final Logger log = LogManager.getLogger(RegisterLoginController.class);

    @ApiOperation(value = "用户登录", notes = "根据用户的电话号码和密码进行登录")
    @PostMapping("/login")
    public JSONResponse login(@RequestBody @ApiParam LoginInfoVO loginInfo,
                              HttpSession session) {
        log.debug("登录信息: {}", loginInfo);

        if (!CheckUtils.checkVerifyCode(loginInfo.getVerifyCodeActual(), session)) {
            return new JSONResponse(false, "验证码错误");
        }

        if (!CheckUtils.checkPhone(loginInfo.getPhone()) || StringUtils.isEmpty(loginInfo.getPassword())) {
            return new JSONResponse(false, "手机或密码错误");
        }

        User user = registerLoginService.login(loginInfo.getPhone(), loginInfo.getPassword());
        if (user != null) {
            session.setAttribute("currentUser", user);
            return new JSONResponse(true, "登陆成功");
        }

        return new JSONResponse(false, "登陆失败，服务器内部错误");

    }

    @ApiOperation(value = "注册用户", produces = "application/json")
    @PostMapping("/register")
    public JSONResponse register(@RequestBody @ApiParam RegisterVO userInfo,
                                 HttpSession session) {
        if (userInfo == null || StringUtils.isAnyEmpty(userInfo.getPhone(), userInfo.getPassword())) {
            return new JSONResponse(false, "用户信息为空");
        }

        String smsCode = userInfo.getSmsCode();
        if (StringUtils.isEmpty(smsCode) || !CheckUtils.checkSmsCode(smsCode, session)) {
            return new JSONResponse(false, "手机验证码错误");
        }

        User user = new User();
        BeanUtils.copyProperties(userInfo, user);
        log.debug("注册信息: {}", user);

        try {
            registerLoginService.register(user);
            return new JSONResponse(true, "注册成功");
        } catch (RegisterException e) {
            return new JSONResponse(false, e.getMessage());
        }
    }


    @Autowired
    public RegisterLoginController(RegisterLoginService registerLoginService) {
        this.registerLoginService = registerLoginService;
    }
}
