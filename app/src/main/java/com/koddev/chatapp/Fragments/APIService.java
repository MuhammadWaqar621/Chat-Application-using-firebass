package com.koddev.chatapp.Fragments;

import com.koddev.chatapp.Notifications.MyResponse;
import com.koddev.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAt75Y2pE:APA91bHO2K9APWJK8Osc7DmThXBvlvOHa2LhKDVpItx_lMB1OmE8-OdESGB5m0KeDcfghaQ7RFGwumPBSbQmVE5a42XCZsjP5vDMt2O5jL2c7AGWbhFPUuc1rybXNglE2TVfjOpjdwHk"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
