package retrofit.test.com.retrofitexampleapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Akash.Sharma on 11/15/2017.
 */

public class UserDataModel {


    /**
     * Status : Success
     * Map_Data : [{"latitude":"28.5848924","longitude":"77.3846578","deviceID":"90701faefa7d5722","fullName":"Akash Sharma","mobNumber":"9718785822","dateTime":"2017-09-24 00:00:36.000"},{"latitude":"28.5848924","longitude":"77.3846578","deviceID":"90701faefa7d5722","fullName":"Akash Sharma","mobNumber":"9718785822","dateTime":"2017-09-24 00:00:36.000"},{"latitude":"28.5848924","longitude":"77.3846578","deviceID":"90701faefa7d5722","fullName":"Akash Sharma","mobNumber":"9718785822","dateTime":"2017-09-24 00:00:36.000"},{"latitude":"28.6509878","longitude":"77.1260448","deviceID":"706cb60e26109d47","fullName":"khurseed carpenter","mobNumber":"989967132","dateTime":"2017-09-25 22:04:10.000"},{"latitude":"28.6509878","longitude":"77.1260448","deviceID":"706cb60e26109d47","fullName":"khurseed karpenter","mobNumber":"989967132","dateTime":"2017-09-25 22:06:18.000"},{"latitude":"28.5863552","longitude":"77.3970018","deviceID":"90701faefa7d5722","fullName":"Akash Sharma","mobNumber":"9718785822","dateTime":"2017-09-24 00:00:36.000"},{"latitude":"28.5863552","longitude":"77.3970018","deviceID":"90701faefa7d5722","fullName":"Akash Sharma","mobNumber":"9718785822","dateTime":"2017-09-24 00:00:36.000"},{"latitude":"28.5863552","longitude":"77.3970018","deviceID":"90701faefa7d5722","fullName":"Akash Sharma","mobNumber":"9718785822","dateTime":"2017-09-24 00:00:36.000"},{"latitude":"28.6752592","longitude":"77.2620647","deviceID":"706cb60e26109d47","fullName":"khurseed carpenter","mobNumber":"989967132","dateTime":"2017-09-25 22:04:10.000"},{"latitude":"28.6752592","longitude":"77.2620647","deviceID":"706cb60e26109d47","fullName":"khurseed karpenter","mobNumber":"989967132","dateTime":"2017-09-25 22:06:18.000"},{"latitude":"28.6752592","longitude":"77.2620647","deviceID":"706cb60e26109d47","fullName":"khurseed carpenter","mobNumber":"989967132","dateTime":"2017-09-25 22:04:10.000"},{"latitude":"28.6752592","longitude":"77.2620647","deviceID":"706cb60e26109d47","fullName":"khurseed karpenter","mobNumber":"989967132","dateTime":"2017-09-25 22:06:18.000"},{"latitude":"28.4393502","longitude":"77.0838657","deviceID":"7b00f6e3dbe74e7a","fullName":"Gopal","mobNumber":"9990211321","dateTime":"2017-09-27 18:01:22.000"},{"latitude":"28.4417528","longitude":"77.086125","deviceID":"ed5014e7777e938f","fullName":"saty","mobNumber":"9811442405","dateTime":"2017-09-27 18:06:13.000"},{"latitude":"28.4417528","longitude":"77.086125","deviceID":"ed5014e7777e938f","fullName":"saty","mobNumber":"9873000768","dateTime":"2017-09-27 18:20:27.000"},{"latitude":"13.0336067","longitude":"80.2438066","deviceID":"7d5afad4b4798ba7","fullName":"A.VINOTH KUMAR","mobNumber":"9094532161","dateTime":"2017-09-29 00:10:27.000"},{"latitude":"31.0938793","longitude":"75.5935514","deviceID":"fc4bd4cfea193390","fullName":"Gurvinder","mobNumber":"9915671041","dateTime":"2017-10-01 15:22:41.000"},{"latitude":"31.0938793","longitude":"75.5935514","deviceID":"fc4bd4cfea193390","fullName":"Gurvinder","mobNumber":"9915671041","dateTime":"2017-10-01 15:22:41.000"},{"latitude":"31.0912103","longitude":"75.595178","deviceID":"fc4bd4cfea193390","fullName":"Gurvinder","mobNumber":"9915671041","dateTime":"2017-10-01 15:22:41.000"},{"latitude":"31.0961112","longitude":"75.5962948","deviceID":"fc4bd4cfea193390","fullName":"Gurvinder","mobNumber":"9915671041","dateTime":"2017-10-01 15:22:41.000"},{"latitude":"31.0961112","longitude":"75.5962948","deviceID":"fc4bd4cfea193390","fullName":"Gurvinder","mobNumber":"9915671041","dateTime":"2017-10-01 15:22:41.000"},{"latitude":"28.3834246","longitude":"77.0951171","deviceID":"ed5014e7777e938f","fullName":"saty","mobNumber":"9811442405","dateTime":"2017-09-27 18:06:13.000"},{"latitude":"28.3834246","longitude":"77.0951171","deviceID":"ed5014e7777e938f","fullName":"saty","mobNumber":"9873000768","dateTime":"2017-09-27 18:20:27.000"},{"latitude":"10.0540373","longitude":"77.0669444","deviceID":"1bb99cef86d8c003","fullName":"Asif khan","mobNumber":"9048485283","dateTime":"2017-10-05 11:26:21.000"},{"latitude":"10.0456153","longitude":"77.0546006","deviceID":"1bb99cef86d8c003","fullName":"Asif khan","mobNumber":"9048485283","dateTime":"2017-10-05 11:26:21.000"},{"latitude":"10.0540373","longitude":"77.0669444","deviceID":"1bb99cef86d8c003","fullName":"Asif khan","mobNumber":"9048485283","dateTime":"2017-10-05 11:26:21.000"},{"latitude":"10.0540373","longitude":"77.0669444","deviceID":"1bb99cef86d8c003","fullName":"Asif khan","mobNumber":"9048485283","dateTime":"2017-10-05 11:26:21.000"},{"latitude":"31.0938793","longitude":"75.5935514","deviceID":"fc4bd4cfea193390","fullName":"Gurvinder","mobNumber":"9915671041","dateTime":"2017-10-01 15:22:41.000"},{"latitude":"28.4505627","longitude":"77.0441905","deviceID":"a005b352679f8bc","fullName":"Raghvendra Singh ","mobNumber":"9711834774","dateTime":"2017-10-21 12:13:44.000"},{"latitude":"28.4408326","longitude":"77.0465733","deviceID":"a005b352679f8bc","fullName":"Raghvendra Singh ","mobNumber":"9711834774","dateTime":"2017-10-21 12:13:44.000"},{"latitude":"28.4381301","longitude":"77.0634732","deviceID":"4389acbb8a0ad820","fullName":"Sandeep goswami","mobNumber":"8708400735","dateTime":"2017-10-23 10:55:48.000"},{"latitude":"28.4381301","longitude":"77.0634732","deviceID":"4389acbb8a0ad820","fullName":"Sandeep goswami","mobNumber":"8708400735","dateTime":"2017-10-23 10:55:48.000"},{"latitude":"28.4381301","longitude":"77.0634732","deviceID":"4389acbb8a0ad820","fullName":"Sandeep goswami","mobNumber":"8708400735","dateTime":"2017-10-23 10:55:48.000"},{"latitude":"28.4381236","longitude":"77.0634058","deviceID":"4389acbb8a0ad820","fullName":"Sandeep goswami","mobNumber":"8708400735","dateTime":"2017-10-23 10:55:48.000"},{"latitude":"28.5516291","longitude":"75.8582541","deviceID":"53c489ab7bd50734","fullName":"Yogesh karan","mobNumber":"8053646894","dateTime":"2017-10-25 21:17:41.000"},{"latitude":"28.5516291","longitude":"75.8582541","deviceID":"53c489ab7bd50734","fullName":"Yogesh karan","mobNumber":"8053646894","dateTime":"2017-10-25 21:17:41.000"},{"latitude":"31.0939571","longitude":"75.5937026","deviceID":"fc4bd4cfea193390","fullName":"Gurvinder","mobNumber":"9915671041","dateTime":"2017-10-01 15:22:41.000"},{"latitude":"31.0943548","longitude":"75.6045449","deviceID":"fc4bd4cfea193390","fullName":"Gurvinder","mobNumber":"9915671041","dateTime":"2017-10-01 15:22:41.000"},{"latitude":"28.4381257","longitude":"77.0634283","deviceID":"4389acbb8a0ad820","fullName":"Sandeep goswami","mobNumber":"8708400735","dateTime":"2017-10-23 10:55:48.000"},{"latitude":"28.4381257","longitude":"77.0634283","deviceID":"4389acbb8a0ad820","fullName":"Sandeep goswami","mobNumber":"8708400735","dateTime":"2017-10-23 10:55:48.000"},{"latitude":"28.4128018","longitude":"77.0425376","deviceID":"27f0fc89d20c9b44","fullName":"atiur rahm ","mobNumber":"8851658552","dateTime":"2017-11-09 17:33:35.000"},{"latitude":"28.4128792","longitude":"77.0425263","deviceID":"27f0fc89d20c9b44","fullName":"atiur rahm ","mobNumber":"8851658552","dateTime":"2017-11-09 17:33:35.000"},{"latitude":"28.4138427","longitude":"77.0319847","deviceID":"27f0fc89d20c9b44","fullName":"atiur rahm ","mobNumber":"8851658552","dateTime":"2017-11-09 17:33:35.000"},{"latitude":"41.8262367","longitude":"59.9931508","deviceID":"a2f6c8eb834b8d8c","fullName":"здравствуйте ","mobNumber":"863282577","dateTime":"2017-11-09 11:49:14.000"},{"latitude":"28.4138427","longitude":"77.0319847","deviceID":"27f0fc89d20c9b44","fullName":"atiur rahm ","mobNumber":"8851658552","dateTime":"2017-11-09 17:33:35.000"},{"latitude":"28.412869","longitude":"77.0424804","deviceID":"27f0fc89d20c9b44","fullName":"atiur rahm ","mobNumber":"8851658552","dateTime":"2017-11-09 17:33:35.000"},{"latitude":"28.6611191","longitude":"77.1898665","deviceID":"25edb73b208a9cd1","fullName":"Abhay ","mobNumber":"9999755067","dateTime":"2017-11-10 20:04:08.000"},{"latitude":"28.6611189","longitude":"77.1898666","deviceID":"25edb73b208a9cd1","fullName":"Abhay ","mobNumber":"9999755067","dateTime":"2017-11-10 20:04:08.000"},{"latitude":"28.4261214","longitude":"77.0398392","deviceID":"c34edf84768c8fb2","fullName":"Manish Chaudhari","mobNumber":"9836789993","dateTime":"2017-11-11 08:27:21.000"},{"latitude":"19.1903641","longitude":"72.9791019","deviceID":"5e9e7142b018d731","fullName":"Munir. z. khan","mobNumber":"9892978583","dateTime":"2017-11-13 13:19:33.000"},{"latitude":"19.1903479","longitude":"72.9790949","deviceID":"5e9e7142b018d731","fullName":"Munir. z. khan","mobNumber":"9892978583","dateTime":"2017-11-13 13:19:33.000"},{"latitude":"19.1903479","longitude":"72.9790949","deviceID":"5e9e7142b018d731","fullName":"Munir. z. khan","mobNumber":"9892978583","dateTime":"2017-11-13 13:19:33.000"},{"latitude":"19.1903479","longitude":"72.9790949","deviceID":"5e9e7142b018d731","fullName":"Munir. z. khan","mobNumber":"9892978583","dateTime":"2017-11-13 13:19:33.000"},{"latitude":"19.1907029","longitude":"72.9785771","deviceID":"5e9e7142b018d731","fullName":"Munir. z. khan","mobNumber":"9892978583","dateTime":"2017-11-13 13:19:33.000"},{"latitude":"19.1907029","longitude":"72.9785771","deviceID":"5e9e7142b018d731","fullName":"Munir. z. khan","mobNumber":"9892978583","dateTime":"2017-11-13 13:19:33.000"}]
     */
    @SerializedName("Status")
    private String Status;

    @SerializedName("Map_Data")
    private List<MapDataBean> Map_Data;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public List<MapDataBean> getMap_Data() {
        return Map_Data;
    }

    public void setMap_Data(List<MapDataBean> Map_Data) {
        this.Map_Data = Map_Data;
    }

    public static class MapDataBean {
        /**
         * latitude : 28.5848924
         * longitude : 77.3846578
         * deviceID : 90701faefa7d5722
         * fullName : Akash Sharma
         * mobNumber : 9718785822
         * dateTime : 2017-09-24 00:00:36.000
         */
        @SerializedName("latitude")
        private String latitude;

        @SerializedName("longitude")
        private String longitude;

        @SerializedName("deviceID")
        private String deviceID;

        @SerializedName("fullName")
        private String fullName;

        @SerializedName("mobNumber")
        private String mobNumber;

        @SerializedName("dateTime")
        private String dateTime;

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getDeviceID() {
            return deviceID;
        }

        public void setDeviceID(String deviceID) {
            this.deviceID = deviceID;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getMobNumber() {
            return mobNumber;
        }

        public void setMobNumber(String mobNumber) {
            this.mobNumber = mobNumber;
        }

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }
    }
}
