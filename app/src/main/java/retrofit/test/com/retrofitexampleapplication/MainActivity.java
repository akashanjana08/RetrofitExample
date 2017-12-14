package retrofit.test.com.retrofitexampleapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.google.gson.Gson;
import org.json.JSONObject;
import java.io.InputStream;
import java.util.List;

import retrofit.test.com.retrofitexampleapplication.model.BTAResponseModel;
import retrofit.test.com.retrofitexampleapplication.model.VodContentList;
import retrofit.test.com.retrofitexampleapplication.model.XMlBtaResponse;
import retrofit.test.com.retrofitexampleapplication.xmlparsingretrofit.XMLApiClient;
import retrofit.test.com.retrofitexampleapplication.xmlparsingretrofit.XMLtoJsonString;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            InputStream assestFileInputStream  =   getAssets().open("bta_details.xml");
            int length = assestFileInputStream.available();
            byte[] data = new byte[length];
            assestFileInputStream.read(data);
            String assetString = new String(data).toString();
            JSONObject js = XMLtoJsonString.XMLtoJsonString(assetString);
            Gson gson = new Gson();
            BTAResponseModel bTAResponseModel = gson.fromJson(js.toString(), BTAResponseModel.class);
            String datas = js.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        /* ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
         Call<VodContentList> call = apiService.getVodContentList();
         call.enqueue(new Callback<VodContentList>() {
             @Override
             public void onResponse(Call<VodContentList> call, Response<VodContentList> response) {
                 Toast.makeText(MainActivity.this,"Res",Toast.LENGTH_LONG).show();
                 VodContentList.VodContentBean  mapData= response.body().getVodContent();
                 String data = "shdgsgd";
             }

             @Override
             public void onFailure(Call<VodContentList> call, Throwable t) {
                 Log.d("RetrofitFail",t.toString());
                 Toast.makeText(MainActivity.this,"Fail",Toast.LENGTH_LONG).show();
             }
         });*/


        ApiInterface apiService = XMLApiClient.getApiClient().create(ApiInterface.class);
        Call<XMlBtaResponse> call = apiService.getBTAResponse();
        call.enqueue(new Callback<XMlBtaResponse>() {
            @Override
            public void onResponse(Call<XMlBtaResponse> call, Response<XMlBtaResponse> response) {
                Toast.makeText(MainActivity.this,"Res",Toast.LENGTH_LONG).show();
                List<XMlBtaResponse.Movie> mapData= response.body().getMovie();
                String data = "shdgsgd";
            }

            @Override
            public void onFailure(Call<XMlBtaResponse> call, Throwable t) {

                Log.d("RetrofitFail",t.toString());
                Toast.makeText(MainActivity.this,"Fail",Toast.LENGTH_LONG).show();
            }
        });

    }
}
