package retrofit.test.com.retrofitexampleapplication;

import java.util.List;

import retrofit.test.com.retrofitexampleapplication.model.BTAResponseModel;
import retrofit.test.com.retrofitexampleapplication.model.EmployeeDataModel;
import retrofit.test.com.retrofitexampleapplication.model.VodContentList;
import retrofit.test.com.retrofitexampleapplication.model.XMlBtaResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Akash.Sharma on 11/16/2017.
 */

public interface ApiInterface {

    @GET("posts")
    Call<List<EmployeeDataModel>> getMapDetails();

    @GET("broker/bta/getDetails?fc_Language=nl&fc_CategoryID=83802703-d3d1-42a7-b7c6-f25f1a593d84&fc_HDCapable=true&c_ContentTypes=CoD&fc_StartIndex=0&fc_HowMany=60&fc_UnlockedPackagesOnly=true&fc_Sort=categoryPrimary&ac_InvoicePrices=true&MAC=0022CEC5725B")
    Call<XMlBtaResponse> getBTAResponse();

    @GET("hpg/vod/getContentList?externalCategoryId=a7236104-619e-4968-8553-f58c7b11a428&lang=fr&displayName=Preview++KIDS&MAC=14987D74CEAD&fc_HowMany=60&fc_StartIndex=0")
    Call<VodContentList> getVodContentList();

    /*@Headers("Content-Type: application/json")
    @POST("homemade/maidReviewList.php")
    Call<MaidReviewModel> getMaidreviewList(@Body String reqJson);*/
}
