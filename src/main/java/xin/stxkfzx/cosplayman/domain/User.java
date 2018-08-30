package xin.stxkfzx.cosplayman.domain;

public class User {
    private Integer userId;

    private String phone;

    private String password;

    private String nickName;

    private String headImage;

    /** 被关注数*/
    private Integer attentionCount;

    /** 发表文章数*/
    private Integer publishCount;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Integer getAttentionCount() {
        return attentionCount;
    }

    public void setAttentionCount(Integer attentionCount) {
        this.attentionCount = attentionCount;
    }

    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", nickName=").append(nickName);
        sb.append(", headImage=").append(headImage);
        sb.append(", attentionCount=").append(attentionCount);
        sb.append(", publishCount=").append(publishCount);
        sb.append("]");
        return sb.toString();
    }
}