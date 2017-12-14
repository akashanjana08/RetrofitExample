package retrofit.test.com.retrofitexampleapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Akash.Sharma on 11/16/2017.
 */

public class MaidReviewModel {


    /**
     * status : Success
     * maidReviewList : [{"rating":5,"review":"Good work.","date":1509122614171,"userName":"Santy Mani","userPhoto":"https://scontent.xx.fbcdn.net/v/t1.0-1/p120x120/12924466_1143330635697595_1865176927915732552_n.jpg?oh=8cf10491d404d89062c1c3d124ecdc14&oe=5A7B1E25"},{"rating":5,"review":"Cool","date":1508924256070,"userName":"nipun sachdeva","userPhoto":"https://lh6.googleusercontent.com/-2BQqHmzozD8/AAAAAAAAAAI/AAAAAAAAAGA/XK8Vv5TVI_8/photo.jpg"}]
     */

    @SerializedName("status")
    private String status;

    @SerializedName("maidReviewList")
    private List<MaidReviewListBean> maidReviewList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<MaidReviewListBean> getMaidReviewList() {
        return maidReviewList;
    }

    public void setMaidReviewList(List<MaidReviewListBean> maidReviewList) {
        this.maidReviewList = maidReviewList;
    }

    public static class MaidReviewListBean {
        /**
         * rating : 5
         * review : Good work.
         * date : 1509122614171
         * userName : Santy Mani
         * userPhoto : https://scontent.xx.fbcdn.net/v/t1.0-1/p120x120/12924466_1143330635697595_1865176927915732552_n.jpg?oh=8cf10491d404d89062c1c3d124ecdc14&oe=5A7B1E25
         */

        @SerializedName("rating")
        private int rating;

        @SerializedName("review")
        private String review;

        @SerializedName("date")
        private long date;

        @SerializedName("userName")
        private String userName;

        @SerializedName("userPhoto")
        private String userPhoto;

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getReview() {
            return review;
        }

        public void setReview(String review) {
            this.review = review;
        }

        public long getDate() {
            return date;
        }

        public void setDate(long date) {
            this.date = date;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserPhoto() {
            return userPhoto;
        }

        public void setUserPhoto(String userPhoto) {
            this.userPhoto = userPhoto;
        }
    }
}
