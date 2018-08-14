package com.patchanok.learning.mvpandroid.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by patchanok on 9/2/2017 AD.
 */

public class ProductDetail {

    private int id = 0;
    private boolean is_dead;
    private String name;
    private String tags;
    private String origin;
    private String varietal;
    private String style;
    @SerializedName("price_in_cents")
    private int priceInCents = 0;
    @SerializedName("regular_price_in_cents")
    private int regularPriceInCents = 0;
    @SerializedName("stock_type")
    private String stockType;
    @SerializedName("primary_category")
    private String primaryCategory;
    @SerializedName("secondary_category")
    private String secondaryCategory;
    @SerializedName("alcohol_content")
    private int alcoholContent;
    @SerializedName("image_thumb_url")
    private String imageThumbUrl;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("product_no")
    private int productNo;

    public ProductDetail(int id, boolean is_dead, String name, String tags, int priceInCents,
                         int regularPriceInCents, String stockType, String primaryCategory,
                         String secondaryCategory, String origin, int alcoholContent,
                         String imageThumbUrl, String imageUrl, String varietal, String style, int productNo) {
        this.id = id;
        this.is_dead = is_dead;
        this.name = name;
        this.tags = tags;
        this.priceInCents = priceInCents;
        this.regularPriceInCents = regularPriceInCents;
        this.stockType = stockType;
        this.primaryCategory = primaryCategory;
        this.secondaryCategory = secondaryCategory;
        this.origin = origin;
        this.alcoholContent = alcoholContent;
        this.imageThumbUrl = imageThumbUrl;
        this.imageUrl = imageUrl;
        this.varietal = varietal;
        this.style = style;
        this.productNo = productNo;
    }

    public int getId() {
        return id;
    }

    public boolean is_dead() {
        return is_dead;
    }

    public String getName() {
        return name;
    }

    public String getTags() {
        return tags;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public int getRegularPriceInCents() {
        return regularPriceInCents;
    }

    public String getStockType() {
        return stockType;
    }

    public String getPrimaryCategory() {
        return primaryCategory;
    }

    public String getSecondaryCategory() {
        return secondaryCategory;
    }

    public String getOrigin() {
        return origin;
    }

    public int getAlcoholContent() {
        return alcoholContent;
    }

    public String getImageThumbUrl() {
        return imageThumbUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVarietal() {
        return varietal;
    }

    public String getStyle() {
        return style;
    }

    public int getProductNo() {
        return productNo;
    }
}
