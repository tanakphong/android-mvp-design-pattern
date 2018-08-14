package com.patchanok.learning.mvpandroid.view;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.patchanok.learning.mvpandroid.R;
import com.patchanok.learning.mvpandroid.model.ProductDetail;
import com.patchanok.learning.mvpandroid.presenter.IProductPresenter;
import com.patchanok.learning.mvpandroid.presenter.ProductPresenter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IProductView {

    private SwipeRefreshLayout swipeRefresh;
    private RecyclerView recyclerView;
    private ProgressBar progressRecyclerview;

    private IProductPresenter productPresenter;
    private ProductRecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productPresenter = new ProductPresenter(this);
        initialView();
        loadData();
    }

    @Override
    public void setProductlist(ArrayList<ProductDetail> productDetailList) {
        progressRecyclerview.setVisibility(View.GONE);
        recyclerAdapter.setItemview(productDetailList);
    }

    private void initialView() {
        int column = 2;
        progressRecyclerview = (ProgressBar) findViewById(R.id.progressRecyclerview);
        progressRecyclerview.setVisibility(View.VISIBLE);

        swipeRefresh = (SwipeRefreshLayout) findViewById(R.id.swipeRefresh);
        swipeRefresh.setEnabled(true);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadData();
                swipeRefresh.setEnabled(false);
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, column));
        recyclerAdapter = new ProductRecyclerAdapter();
        recyclerView.setAdapter(recyclerAdapter);

    }

    private void loadData(){
        if (productPresenter != null){
            productPresenter.loadDateApi();
        }
    }
}
