
package co.rahala.selim.rocketinternet1.model;

import java.util.ArrayList;
import java.util.List;
 import com.google.gson.annotations.Expose;


public class Messages {

    @Expose
    private List<String> success = new ArrayList<String>();

    /**
     * 
     * @return
     *     The success
     */
    public List<String> getSuccess() {
        return success;
    }

    /**
     * 
     * @param success
     *     The success
     */
    public void setSuccess(List<String> success) {
        this.success = success;
    }

}
