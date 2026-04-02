package com.distriqt.extension.adverts.controller.nativeads;

import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.AdvertViewParams;
/* loaded from: classes.dex */
public interface AdvertNativeAd {
    AdvertViewParams getViewParams();

    boolean isLoaded();

    boolean isLoading();

    boolean isVisible();

    void loadAd(AdvertRequest advertRequest);

    void loadAds(AdvertRequest advertRequest, int i);

    void setViewParams(AdvertViewParams advertViewParams);

    boolean showWithCustom(String str, AdvertViewParams advertViewParams);

    boolean showWithTemplate(String str, AdvertViewParams advertViewParams, AdvertNativeAdTemplateStyle advertNativeAdTemplateStyle);

    void visible(boolean z);
}
