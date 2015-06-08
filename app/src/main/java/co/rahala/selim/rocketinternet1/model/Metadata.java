
package co.rahala.selim.rocketinternet1.model;

import java.util.ArrayList;
import java.util.List;
 import com.google.gson.annotations.Expose;


public class Metadata {

    @Expose
    private String product_count;
    @Expose
    private String category_ids;
    @Expose
    private List<Result> results = new ArrayList<Result>();
    @Expose
    private List<Category> categories = new ArrayList<Category>();
    @Expose
    private List<Filter> filters = new ArrayList<Filter>();

    /**
     * 
     * @return
     *     The product_count
     */
    public String getProduct_count() {
        return product_count;
    }

    /**
     * 
     * @param product_count
     *     The product_count
     */
    public void setProduct_count(String product_count) {
        this.product_count = product_count;
    }

    /**
     * 
     * @return
     *     The category_ids
     */
    public String getCategory_ids() {
        return category_ids;
    }

    /**
     * 
     * @param category_ids
     *     The category_ids
     */
    public void setCategory_ids(String category_ids) {
        this.category_ids = category_ids;
    }

    /**
     * 
     * @return
     *     The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     * 
     * @return
     *     The categories
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     * 
     * @return
     *     The filters
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * 
     * @param filters
     *     The filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

}
