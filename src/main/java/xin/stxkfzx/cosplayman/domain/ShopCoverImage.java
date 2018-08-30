package xin.stxkfzx.cosplayman.domain;

import java.util.Date;

public class ShopCoverImage {
    private Integer coverImageId;

    private String imageAddr;

    private Date createTime;

    private Integer shopId;

    public Integer getCoverImageId() {
        return coverImageId;
    }

    public void setCoverImageId(Integer coverImageId) {
        this.coverImageId = coverImageId;
    }

    public String getImageAddr() {
        return imageAddr;
    }

    public void setImageAddr(String imageAddr) {
        this.imageAddr = imageAddr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", coverImageId=").append(coverImageId);
        sb.append(", imageAddr=").append(imageAddr);
        sb.append(", createTime=").append(createTime);
        sb.append(", shopId=").append(shopId);
        sb.append("]");
        return sb.toString();
    }
}