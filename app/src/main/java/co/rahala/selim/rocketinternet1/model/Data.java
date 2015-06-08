
package co.rahala.selim.rocketinternet1.model;

 import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

    @Expose
    private String sku;
    @Expose
    private String name;
    @SerializedName("new-product")
    @Expose
    private Boolean new_product;
    @Expose
    private String url;

    @Expose
    private String brand;
    @Expose
    private String max_price;
    @Expose
    private String price;

    /**
     * 
     * @return
     *     The sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * 
     * @param sku
     *     The sku
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The new_product
     */
    public Boolean getNew_product() {
        return new_product;
    }

    /**
     * 
     * @param new_product
     *     The new-product
     */
    public void setNew_product(Boolean new_product) {
        this.new_product = new_product;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * 
     * @return
     *     The brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 
     * @param brand
     *     The brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return
     *     The max_price
     */
    public String getMax_price() {
        return max_price;
    }

    /**
     * 
     * @param max_price
     *     The max_price
     */
    public void setMax_price(String max_price) {
        this.max_price = max_price;
    }

    /**
     * 
     * @return
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

}
