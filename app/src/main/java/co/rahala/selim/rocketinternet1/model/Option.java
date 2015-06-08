
package co.rahala.selim.rocketinternet1.model;

 import com.google.gson.annotations.Expose;


public class Option {

    @Expose
    private String val;
    @Expose
    private Integer products_count;

    /**
     * 
     * @return
     *     The val
     */
    public String getVal() {
        return val;
    }

    /**
     * 
     * @param val
     *     The val
     */
    public void setVal(String val) {
        this.val = val;
    }

    /**
     * 
     * @return
     *     The products_count
     */
    public Integer getProducts_count() {
        return products_count;
    }

    /**
     * 
     * @param products_count
     *     The products_count
     */
    public void setProducts_count(Integer products_count) {
        this.products_count = products_count;
    }

}
