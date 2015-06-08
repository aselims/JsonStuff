
package co.rahala.selim.rocketinternet1.model;

import java.util.ArrayList;
import java.util.List;
 import com.google.gson.annotations.Expose;


public class Filter {

    @Expose
    private String id;
    @Expose
    private String label;
    @Expose
    private Boolean multi;
    @Expose
    private List<Option> options = new ArrayList<Option>();

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
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The multi
     */
    public Boolean getMulti() {
        return multi;
    }

    /**
     * 
     * @param multi
     *     The multi
     */
    public void setMulti(Boolean multi) {
        this.multi = multi;
    }

    /**
     * 
     * @return
     *     The options
     */
    public List<Option> getOptions() {
        return options;
    }

    /**
     * 
     * @param options
     *     The options
     */
    public void setOptions(List<Option> options) {
        this.options = options;
    }

}
