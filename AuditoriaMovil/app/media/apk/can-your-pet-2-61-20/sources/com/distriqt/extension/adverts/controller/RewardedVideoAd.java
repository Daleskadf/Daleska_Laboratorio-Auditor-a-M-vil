package com.distriqt.extension.adverts.controller;
/* loaded from: classes.dex */
public interface RewardedVideoAd {
    void destroy();

    String getAdUnitId();

    String getUserId();

    boolean isLoaded();

    void load(AdvertRequest advertRequest);

    void setAdUnitId(String str);

    void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    void setUserId(String str);

    boolean show();
}
