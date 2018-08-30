package xin.stxkfzx.cosplayman.domain;

public class ShopInformation {
    private Integer informationId;

    private String informationTitle;

    private String informationContent;

    private Integer shopId;

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public String getInformationTitle() {
        return informationTitle;
    }

    public void setInformationTitle(String informationTitle) {
        this.informationTitle = informationTitle;
    }

    public String getInformationContent() {
        return informationContent;
    }

    public void setInformationContent(String informationContent) {
        this.informationContent = informationContent;
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
        sb.append(", informationId=").append(informationId);
        sb.append(", informationTitle=").append(informationTitle);
        sb.append(", informationContent=").append(informationContent);
        sb.append(", shopId=").append(shopId);
        sb.append("]");
        return sb.toString();
    }
}