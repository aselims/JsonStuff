
package co.rahala.selim.rocketinternet1.model;

import java.util.ArrayList;
import java.util.List;
 import com.google.gson.annotations.Expose;


public class Category {

    @Expose
    private String val;
    @Expose
    private String name;
    @Expose
    private String id;
    @Expose
    private List<Child> children = new ArrayList<Child>();

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

    /**
     * 
     * @return
     *     The children
     */
    public List<Child> getChildren() {
        return children;
    }

    /**
     * 
     * @param children
     *     The children
     */
    public void setChildren(List<Child> children) {
        this.children = children;
    }

}
