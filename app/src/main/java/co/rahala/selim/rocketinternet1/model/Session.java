
package co.rahala.selim.rocketinternet1.model;

 import com.google.gson.annotations.Expose;


public class Session {

    @Expose
    private String id;
    @Expose
    private String expire;
    @Expose
    private String YII_CSRF_TOKEN;

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
     *     The expire
     */
    public String getExpire() {
        return expire;
    }

    /**
     * 
     * @param expire
     *     The expire
     */
    public void setExpire(String expire) {
        this.expire = expire;
    }

    /**
     * 
     * @return
     *     The YII_CSRF_TOKEN
     */
    public String getYII_CSRF_TOKEN() {
        return YII_CSRF_TOKEN;
    }

    /**
     * 
     * @param YII_CSRF_TOKEN
     *     The YII_CSRF_TOKEN
     */
    public void setYII_CSRF_TOKEN(String YII_CSRF_TOKEN) {
        this.YII_CSRF_TOKEN = YII_CSRF_TOKEN;
    }

}
