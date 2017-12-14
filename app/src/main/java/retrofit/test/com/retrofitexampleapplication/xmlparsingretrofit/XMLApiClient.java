package retrofit.test.com.retrofitexampleapplication.xmlparsingretrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by akash.sharma on 12/14/2017.
 */

public class XMLApiClient {
    private static Retrofit retrofit = null;
    private static String base_url_Get = "http://10.67.194.30:8085/";
    public static Retrofit getApiClient()
    {
        if(retrofit==null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(base_url_Get)
                    .client(new OkHttpClient())
                    .addConverterFactory(SimpleXmlConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}


