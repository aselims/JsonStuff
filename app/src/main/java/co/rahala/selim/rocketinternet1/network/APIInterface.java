package co.rahala.selim.rocketinternet1.network;


import java.util.List;

import co.rahala.selim.rocketinternet1.model.Items;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by ssalman on 12/7/2014.
 */
public interface APIInterface {


    //    //https://www.zalora.com.my/mobile-api/women/clothing?maxitems=24&page=1&sort=price&dir=desc

    @GET("/?maxitems=24&page=1")
    void getItems(@Query("sort") String sort, @Query("dir") String dir, Callback<Items> cb);


}
