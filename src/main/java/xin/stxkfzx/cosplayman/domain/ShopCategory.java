package xin.stxkfzx.cosplayman.domain;

import java.util.Date;

public class ShopCategory {
    private Integer shopCategoryId;

    private String categoryName;

    private Date createTime;

    private Integer parentId;

    public Integer getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Integer shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopCategoryId=").append(shopCategoryId);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", createTime=").append(createTime);
        sb.append(", parentId=").append(parentId);
        sb.append("]");
        return sb.toString();
    }
}