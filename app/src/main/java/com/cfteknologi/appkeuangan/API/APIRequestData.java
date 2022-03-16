package com.cfteknologi.appkeuangan.API;

import com.cfteknologi.appkeuangan.Models.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("retrieve.php")
    Call<ResponseModel> ardRetrieveData();
}
