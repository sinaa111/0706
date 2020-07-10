package entity;

import java.util.Date;

public class OfferPrice {
    private Integer ofpId;
    private Date effetiveStartDate;
    private Date effetiveEndDate;
    private Integer prold;
    private Double price;
    private String typecd;
    private Double sku;
    private String title;
    public OfferPrice(){}
    public OfferPrice(Integer ofpId, Date effetiveStartDate, Date effetiveEndDate, Integer prold, Double price, String typecd){
        this.ofpId=ofpId;
        this.effetiveStartDate=effetiveStartDate;
        this.effetiveEndDate=effetiveEndDate;
        this.prold=prold;
        this.price=price;
        this.typecd=typecd;
    }


    public Integer getOfpId() {
        return ofpId;
    }

    public void setOfpId(Integer ofpId) {
        this.ofpId = ofpId;
    }

    public Integer getProld() {
        return prold;
    }

    public void setProld(Integer prold) {
        this.prold = prold;
    }

    public String getTypecd() {
        return typecd;
    }

    public void setTypecd(String typecd) {
        this.typecd = typecd;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }



    public Double getSku() {
        return sku;
    }

    public void setSku(Double sku) {
        this.sku = sku;
    }
    @Override
    public String toString() {
        return ofpId+""+effetiveStartDate+""+effetiveEndDate+""+prold+""+price+""+typecd;
    }
}
