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

    /*@GET("/?method=artist.gettopalbums&api_key=01590856c264cfd360839494df12dec5&format=json")
    Album1 album1(@Query("artist") String name);*/

    //    //https://www.zalora.com.my/mobile-api/women/clothing?maxitems=24&page=1&sort=price&dir=desc

    @GET("/?maxitems=24&page=1")
    void getItems(@Query("sort") String sort, @Query("dir") String dir, Callback<Items> cb);

    /*//http://api.goeuro.com/api/v2/position/suggest/{locale}/{term}
    @GET("/{locale}/{term}")
    void getPlaces(@Path("locale") String locale, @Path("term") String term, Callback<List<Place>> cb);

*/
   /* @GET("/?method=artist.gettopalbums&api_key=01590856c264cfd360839494df12dec5&format=json")
    void getAlbums(@Query("artist") String name, Callback<Album1> cb);*/

   /* @POST("/")
    void sendBarcode(@Body Barcode body, Callback<BarcodeData> callBack);
*/
}
