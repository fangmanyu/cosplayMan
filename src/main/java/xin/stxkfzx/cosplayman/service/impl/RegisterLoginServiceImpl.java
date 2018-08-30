package xin.stxkfzx.cosplayman.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.stxkfzx.cosplayman.domain.User;
import xin.stxkfzx.cosplayman.exception.RegisterException;
import xin.stxkfzx.cosplayman.mapper.UserMapper;
import xin.stxkfzx.cosplayman.service.RegisterLoginService;

/**
 * @author fmy
 * @date 2018-07-21 22:15
 */
@Service
public class RegisterLoginServiceImpl implements RegisterLoginService {

    private final UserMapper userMapper;


    @Override
    public User login(String phone, String password) {
        return userMapper.queryUserByPhoneAndPassword(phone, password);
    }

    @Override
    @Transactional(rollbackFor = RegisterException.class)
    public void register(User user) throws RegisterException {
        User user1 = userMapper.queryByPhone(user.getPhone());

        if (user1 != null) {
            throw new RegisterException("该号码已被注册");
        }

        try {
            // TODO 用户密码加密

            int effectedNum = userMapper.insert(user);

            if (effectedNum <= 0) {
                throw new RegisterException("注册失败, 服务器内部错误");
            }
        } catch (Exception e) {
            throw new RegisterException("RegisterLoginService error: " + e.getMessage());
        }

    }


    @Autowired
    public RegisterLoginServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
