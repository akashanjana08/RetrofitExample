package retrofit.test.com.retrofitexampleapplication.xmlparsingretrofit;


import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;


/**
 * Created by Akash.Sharma on 12/11/2017.
 */

public class XMLtoJsonString {

    public static JSONObject XMLtoJsonString(String xml)
    {
        JSONObject jsonObj = null;
        try {
            jsonObj = XML.toJSONObject(xml);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return  jsonObj;
    }
}