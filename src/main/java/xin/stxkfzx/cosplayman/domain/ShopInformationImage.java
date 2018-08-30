package xin.stxkfzx.cosplayman.domain;

import java.util.Date;

public class ShopInformationImage {
    private Integer informationImageId;

    private String informationImageAddr;

    private Date createTime;

    private Integer informationId;

    public Integer getInformationImageId() {
        return informationImageId;
    }

    public void setInformationImageId(Integer informationImageId) {
        this.informationImageId = informationImageId;
    }

    public String getInformationImageAddr() {
        return informationImageAddr;
    }

    public void setInformationImageAddr(String informationImageAddr) {
        this.informationImageAddr = informationImageAddr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", informationImageId=").append(informationImageId);
        sb.append(", informationImageAddr=").append(informationImageAddr);
        sb.append(", createTime=").append(createTime);
        sb.append(", informationId=").append(informationId);
        sb.append("]");
        return sb.toString();
    }
}