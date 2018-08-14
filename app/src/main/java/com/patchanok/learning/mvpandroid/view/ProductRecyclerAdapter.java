package com.patchanok.learning.mvpandroid.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.patchanok.learning.mvpandroid.R;
import com.patchanok.learning.mvpandroid.databinding.ProductItemBinding;
import com.patchanok.learning.mvpandroid.model.ProductDetail;

import java.util.ArrayList;

/**
 * Created by patchanok on 9/3/2017 AD.
 */

public class ProductRecyclerAdapter extends RecyclerView.Adapter<ProductRecyclerAdapter.ViewHolder> {

    private ArrayList<ProductDetail> productDetails = new ArrayList<>();

    @Override
    public ProductRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ProductItemBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.product_item,
                        parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ProductRecyclerAdapter.ViewHolder holder, int position) {
        ProductDetail item = productDetails.get(position);
        holder.binding.setProductItem(item);
    }

    @Override
    public int getItemCount() {
        Log.e(""," size : "+productDetails+"  , count : "+productDetails.size());
        return productDetails == null ? 0 : productDetails.size();
    }

    public void setItemview(ArrayList<ProductDetail> productDetails){
        this.productDetails = productDetails;
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ProductItemBinding binding;

        public ViewHolder(ProductItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
