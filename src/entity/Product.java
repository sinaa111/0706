package entity;

public class Product {
    private Integer proId;
    private Integer sku;
    private String title;
    public  Product(){
    }
    public  Product(int proId,int sku,String title){
        this.proId=proId;
        this.sku=sku;
        this.title=title;
    }


    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return ""+proId+""+sku+""+title;
    }
}
