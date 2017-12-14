package retrofit.test.com.retrofitexampleapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Akash.Sharma on 11/15/2017.
 */

public class ApiClient {

    private static Retrofit retrofit;
    private static String base_url_Get = "https://jsonplaceholder.typicode.com/";
    //private static String base_url_post = "http://homemade.hostzi.com/";

    public static Retrofit getClient()
    {
        if(retrofit==null)
        {
            retrofit = new  Retrofit.Builder().baseUrl(base_url_Get).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return  retrofit;
    }
}
