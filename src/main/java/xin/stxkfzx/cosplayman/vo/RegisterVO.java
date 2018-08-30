package xin.stxkfzx.cosplayman.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 注册信息封装
 *
 * @author fmy
 * @date 2018-08-30 15:50
 */
@ApiModel(description = "注册信息", value = "registerInfo")
public class RegisterVO {

    @ApiModelProperty(value = "电话号码", required = true)
    private String phone;
    @ApiModelProperty(value = "短信验证码", required = true)
    private String smsCode;
    @ApiModelProperty(value = "昵称", required = true)
    private String nickName;
    @ApiModelProperty(value = "密码", required = true)
    private String password;

    @Override
    public String toString() {
        return "RegisterVO{" +
                "phone='" + phone + '\'' +
                ", smsCode='" + smsCode + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
