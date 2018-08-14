package com.patchanok.learning.mvpandroid.service;

import android.util.Log;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by patchanok on 9/2/2017 AD.
 */

public class ApiService {

    private IGetService iGetService;

    public IGetService createService() {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("http://lcboapi.com/")
                .build();
        iGetService = retrofit.create(IGetService.class);

        return iGetService;
    }


}
