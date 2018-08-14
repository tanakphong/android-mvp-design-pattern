package com.patchanok.learning.mvpandroid.view;

import com.patchanok.learning.mvpandroid.model.ProductDetail;

import java.util.ArrayList;

/**
 * Created by patchanok on 9/2/2017 AD.
 */

public interface IProductView {
    void setProductlist(ArrayList<ProductDetail> productDetailList);
}
