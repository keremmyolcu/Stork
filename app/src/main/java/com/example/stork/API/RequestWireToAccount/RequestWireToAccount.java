package com.example.stork.API.RequestWireToAccount;


import com.example.stork.API.RequestWireToAccount.Request.Request;
import com.example.stork.API.RequestWireToAccount.Response.Response;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RequestWireToAccount {
    @Headers({
            "Ocp-Apim-Subscription-Key: ae040c4d3b784271a6791bb00d61428c",
            "Content-Type:application/json"
    })
    @POST("moneytransfers/RequestWireToAccount")
    Call<Response> GetPostValue(@Body Request Request);
}
