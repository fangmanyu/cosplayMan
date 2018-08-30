package xin.stxkfzx.cosplayman.domain;

import java.util.Date;

public class ShopSpecification {
    private Integer specificationId;

    private String specificationName;

    private Date createTime;

    private Integer shopId;

    public Integer getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Integer specificationId) {
        this.specificationId = specificationId;
    }

    public String getSpecificationName() {
        return specificationName;
    }

    public void setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
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
        sb.append(", specificationId=").append(specificationId);
        sb.append(", specificationName=").append(specificationName);
        sb.append(", createTime=").append(createTime);
        sb.append(", shopId=").append(shopId);
        sb.append("]");
        return sb.toString();
    }
}