package com.patchanok.learning.mvpandroid.presenter;

import android.util.Log;

import com.patchanok.learning.mvpandroid.model.Product;
import com.patchanok.learning.mvpandroid.service.ApiService;
import com.patchanok.learning.mvpandroid.view.IProductView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by patchanok on 9/2/2017 AD.
 */

public class ProductPresenter implements IProductPresenter {

    private ApiService apiService;
    private IProductView productView;

    public ProductPresenter(IProductView productView) {
        this.productView = productView;
        this.apiService = new ApiService();
    }

    @Override
    public void loadDateApi() {
        this.apiService.createService().getAllProduct(1).enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                Log.e("ProductPresenter","onResponse : "+response.body().getResult().size());
                productView.setProductlist(response.body().getResult());
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {

            }
        });
    }
}
