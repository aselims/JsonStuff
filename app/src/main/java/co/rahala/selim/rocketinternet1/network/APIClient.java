package co.rahala.selim.rocketinternet1.network;

import retrofit.RestAdapter;

/**
 * Created by ssalman on 12/7/2014.
 */
public class APIClient {


    private static APIInterface sApiInterface;

    //https://www.zalora.com.my/mobile-api/women/clothing

    private static final String endPoint = "https://www.zalora.com.my/mobile-api/women/clothing";

    public static APIInterface getsApiInterface() {
        if (sApiInterface == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(endPoint)
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();

            sApiInterface = restAdapter.create(APIInterface.class);
        }
        return sApiInterface;
    }
}
