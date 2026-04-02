package com.distriqt.extension.adverts.controller;
/* loaded from: classes.dex */
public interface AdvertView {
    void destroy();

    AdvertSize getAdSize();

    String getAdUnitId();

    boolean hide();

    boolean isLoading();

    void load(AdvertRequest advertRequest);

    void setAdSize(AdvertSize advertSize);

    void setAdUnitId(String str);

    void setAdaptiveAdSize(int i, String str);

    void setInlineAdaptiveAdSize(int i, String str);

    void setInlineAdaptiveAdSizeWithMaxHeight(int i, int i2);

    void setViewParams(AdvertViewParams advertViewParams);

    boolean show();
}
