
package co.rahala.selim.rocketinternet1.model;

 import com.google.gson.annotations.Expose;


public class Items {

    @Expose
    private Boolean success;
    @Expose
    private Messages messages;
    @Expose
    private Session session;
    @Expose
    private Metadata metadata;

    /**
     * 
     * @return
     *     The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * 
     * @param success
     *     The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * 
     * @return
     *     The messages
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The messages
     */
    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    /**
     * 
     * @return
     *     The session
     */
    public Session getSession() {
        return session;
    }

    /**
     * 
     * @param session
     *     The session
     */
    public void setSession(Session session) {
        this.session = session;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

}
