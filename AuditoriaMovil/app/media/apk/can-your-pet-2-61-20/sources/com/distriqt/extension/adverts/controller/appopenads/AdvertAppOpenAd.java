package com.distriqt.extension.adverts.controller.appopenads;

import com.distriqt.extension.adverts.controller.AdvertRequest;
/* loaded from: classes.dex */
public interface AdvertAppOpenAd {
    void destroy();

    String getAdUnitId();

    boolean isLoaded();

    void load(AdvertRequest advertRequest, int i);

    void setAdUnitId(String str);

    boolean show();
}
