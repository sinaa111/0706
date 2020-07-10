package entity;

import java.util.Date;

public class AllProductPrice {
    private Integer ofpId;
    private Date effetiveStartDate;
    private Date effetiveEndDate;
    private Integer proId;
    private Double price;
    private String typecd;
    private Integer sku;
    private String title;
    public AllProductPrice(){}

    public Integer getOfpId() {
        return ofpId;
    }

    public void setOfpId(Integer ofpId) {
        this.ofpId = ofpId;
    }

    public Date getEffetiveStartDate() {
        return effetiveStartDate;
    }

    public void setEffetiveStartDate(Date effetiveStartDate) {
        this.effetiveStartDate = effetiveStartDate;
    }

    public Date getEffetiveEndDate() {
        return effetiveEndDate;
    }

    public void setEffetiveEndDate(Date effetiveEndDate) {
        this.effetiveEndDate = effetiveEndDate;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTypecd() {
        return typecd;
    }

    public void setTypecd(String typecd) {
        this.typecd = typecd;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }
   public AllProductPrice(Integer ofpId,int sku,String title,Date effetiveStartDate, Date effetiveEndDate, Integer proId, Double price, String typecd){
        this.ofpId=ofpId;
        this.sku=sku;
        this.title=title;
        this.effetiveStartDate=effetiveStartDate;
        this.effetiveEndDate=effetiveEndDate;
        this.proId=proId;
        this.price=price;
        this.typecd=typecd;
    }

   @Override
    public String toString() {
        return "  商品ID："+proId+"  商品编号："+sku+"商品促销ID："+ofpId+"  商品："+title+"      开始日期："+effetiveStartDate+"    结束日期："+effetiveEndDate+"   价格："+price+"  是否优惠： "+typecd+"\n";
    }
}
