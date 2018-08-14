package com.patchanok.learning.mvpandroid.model;

import java.util.ArrayList;

/**
 * Created by patchanok on 9/2/2017 AD.
 */

public class Product {

    private int status = 0;
    private String message = "";
    private ArrayList<ProductDetail> result = new ArrayList<>();

    public Product(int status, String message, ArrayList<ProductDetail> result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<ProductDetail> getResult() {
        return result;
    }
}
