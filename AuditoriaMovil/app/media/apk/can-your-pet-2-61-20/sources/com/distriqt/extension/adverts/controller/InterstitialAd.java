package com.distriqt.extension.adverts.controller;
/* loaded from: classes.dex */
public interface InterstitialAd {
    void destroy();

    String getAdUnitId();

    boolean hide();

    boolean isLoaded();

    boolean isLoading();

    void load(AdvertRequest advertRequest);

    void setAdUnitId(String str);

    boolean show();
}
