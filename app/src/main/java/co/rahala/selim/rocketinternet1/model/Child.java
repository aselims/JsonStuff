
package co.rahala.selim.rocketinternet1.model;

 import com.google.gson.annotations.Expose;


public class Child {

    @Expose
    private String val;
    @Expose
    private String name;
    @Expose
    private String id;

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
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

}
