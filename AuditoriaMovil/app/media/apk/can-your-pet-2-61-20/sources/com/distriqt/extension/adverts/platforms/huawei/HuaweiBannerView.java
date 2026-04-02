package com.distriqt.extension.adverts.platforms.huawei;

import android.app.Activity;
import android.view.ViewGroup;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.AdvertSize;
import com.distriqt.extension.adverts.controller.AdvertView;
import com.distriqt.extension.adverts.controller.AdvertViewParams;
import com.distriqt.extension.adverts.events.AdViewEvent;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.huawei.hms.ads.AdListener;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;
/* loaded from: classes.dex */
public class HuaweiBannerView extends AdListener implements AdvertView {
    private static final String TAG = "HuaweiBannerView";
    private BannerView _adView;
    private IExtensionContext _extContext;
    private String _identifier;
    private AdvertViewParams _position;

    public HuaweiBannerView(IExtensionContext iExtensionContext, String str) {
        this._extContext = iExtensionContext;
        this._identifier = str;
        BannerView bannerView = new BannerView(this._extContext.getActivity());
        this._adView = bannerView;
        bannerView.setAdListener(this);
        this._position = new AdvertViewParams();
        this._extContext.dispatchEvent(AdViewEvent.CREATED, AdViewEvent.formatForEvent(this._identifier));
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void destroy() {
        Logger.d(TAG, "[%s]: destroy()", this._identifier);
        if (this._adView != null) {
            hide();
            this._adView.setAdListener((AdListener) null);
            this._adView.destroy();
            this._adView = null;
        }
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setAdSize(AdvertSize advertSize) {
        Logger.d(TAG, "[%s]: setAdSize( [%dx%d:%s] )", this._identifier, Integer.valueOf(advertSize.width), Integer.valueOf(advertSize.height), advertSize.type);
        try {
            this._adView.setBannerAdSize(toAdSize(advertSize));
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setAdaptiveAdSize(int i, String str) {
        Logger.d(TAG, "[%s]: setAdaptiveAdSize( %d, %s )", this._identifier, Integer.valueOf(i), str);
        try {
            this._adView.setBannerAdSize(BannerAdSize.BANNER_SIZE_ADVANCED);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setInlineAdaptiveAdSize(int i, String str) {
        Logger.d(TAG, "[%s]: setInlineAdaptiveAdSize( %d, %s )", this._identifier, Integer.valueOf(i), str);
        setAdaptiveAdSize(i, str);
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setInlineAdaptiveAdSizeWithMaxHeight(int i, int i2) {
        Logger.d(TAG, "[%s]: setInlineAdaptiveAdSizeWithMaxHeight( %d, %d )", this._identifier, Integer.valueOf(i), Integer.valueOf(i2));
        try {
            this._adView.setBannerAdSize(BannerAdSize.BANNER_SIZE_SMART);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public AdvertSize getAdSize() {
        Logger.d(TAG, "[%s]: getAdSize()", this._identifier);
        try {
            return fromAdSize(this._extContext.getActivity(), this._adView.getBannerAdSize());
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setAdUnitId(String str) {
        BannerView bannerView = this._adView;
        if (bannerView != null) {
            bannerView.setAdId(str);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public String getAdUnitId() {
        BannerView bannerView = this._adView;
        return bannerView != null ? bannerView.getAdId() : "";
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public boolean isLoading() {
        BannerView bannerView = this._adView;
        if (bannerView != null) {
            return bannerView.isLoading();
        }
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void load(AdvertRequest advertRequest) {
        Logger.d(TAG, "[%s]: load()", this._identifier);
        try {
            if (this._adView != null) {
                this._adView.loadAd(HuaweiAdsUtils.toAdParam(advertRequest));
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setViewParams(AdvertViewParams advertViewParams) {
        Logger.d(TAG, "[%s]: setViewParams( %s )", this._identifier, advertViewParams.toString());
        try {
            this._position = advertViewParams;
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.huawei.HuaweiBannerView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    HuaweiBannerView.this.m252x3858903c();
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setViewParams$0$com-distriqt-extension-adverts-platforms-huawei-HuaweiBannerView  reason: not valid java name */
    public /* synthetic */ void m252x3858903c() {
        BannerView bannerView = this._adView;
        if (bannerView != null) {
            bannerView.setLayoutParams(this._position.toLayoutParams());
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public boolean show() {
        Logger.d(TAG, "[%s]: show()", this._identifier);
        try {
            if (this._adView != null) {
                this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.huawei.HuaweiBannerView$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        HuaweiBannerView.this.m253x334eaed1();
                    }
                });
                return true;
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$show$1$com-distriqt-extension-adverts-platforms-huawei-HuaweiBannerView  reason: not valid java name */
    public /* synthetic */ void m253x334eaed1() {
        if (this._adView.getParent() != null) {
            ((ViewGroup) this._adView.getParent()).removeView(this._adView);
        }
        ((ViewGroup) this._extContext.getActivity().findViewById(16908290)).addView(this._adView);
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public boolean hide() {
        Logger.d(TAG, "[%s]: hide()", this._identifier);
        try {
            if (this._adView != null) {
                this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.huawei.HuaweiBannerView$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        HuaweiBannerView.this.m251xb540fa8b();
                    }
                });
                return true;
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$hide$2$com-distriqt-extension-adverts-platforms-huawei-HuaweiBannerView  reason: not valid java name */
    public /* synthetic */ void m251xb540fa8b() {
        if (this._adView.getParent() != null) {
            ((ViewGroup) this._adView.getParent()).removeView(this._adView);
        }
    }

    public void onAdClosed() {
        Logger.d(TAG, "onAdClosed()", new Object[0]);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(AdViewEvent.CLOSED, AdViewEvent.formatForEvent(this._identifier));
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void onAdFailed(int i) {
        Logger.d(TAG, "onAdFailed( %d )", Integer.valueOf(i));
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(AdViewEvent.ERROR, AdViewEvent.formatForErrorEvent(this._identifier, i));
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void onAdLeave() {
        Logger.d(TAG, "onAdLeave()", new Object[0]);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(AdViewEvent.LEFT_APPLICATION, AdViewEvent.formatForEvent(this._identifier));
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void onAdOpened() {
        Logger.d(TAG, "onAdOpened()", new Object[0]);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(AdViewEvent.OPENED, AdViewEvent.formatForEvent(this._identifier));
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void onAdLoaded() {
        Logger.d(TAG, "onAdLoaded()", new Object[0]);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(AdViewEvent.LOADED, AdViewEvent.formatForEvent(this._identifier));
                setViewParams(this._position);
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void onAdClicked() {
        Logger.d(TAG, "onAdClicked()", new Object[0]);
    }

    public void onAdImpression() {
        Logger.d(TAG, "onAdImpression()", new Object[0]);
    }

    public static BannerAdSize toAdSize(AdvertSize advertSize) {
        char c;
        try {
            String str = advertSize.type;
            switch (str.hashCode()) {
                case -2029282337:
                    if (str.equals("728x90_as")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1903187662:
                    if (str.equals("320x50_mb")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1383883320:
                    if (str.equals("160x600_as")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -793214366:
                    if (str.equals("smart_banner")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 97532362:
                    if (str.equals("fluid")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 367982857:
                    if (str.equals("300x250_as")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1014794471:
                    if (str.equals("320x100_as")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1771617237:
                    if (str.equals("468x60_as")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1778207859:
                    if (str.equals("search_v2")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return BannerAdSize.BANNER_SIZE_320_50;
                case 1:
                    return BannerAdSize.BANNER_SIZE_468_60;
                case 2:
                    return BannerAdSize.BANNER_SIZE_320_100;
                case 3:
                    return BannerAdSize.BANNER_SIZE_728_90;
                case 4:
                    return BannerAdSize.BANNER_SIZE_300_250;
                case 5:
                    return BannerAdSize.BANNER_SIZE_SMART;
                case 6:
                    return BannerAdSize.BANNER_SIZE_160_600;
                case 7:
                case '\b':
                    break;
                default:
                    return new BannerAdSize(advertSize.width, advertSize.height);
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return BannerAdSize.BANNER_SIZE_SMART;
    }

    public static AdvertSize fromAdSize(Activity activity, BannerAdSize bannerAdSize) {
        AdvertSize advertSize = new AdvertSize();
        advertSize.width = bannerAdSize.getWidth();
        advertSize.height = bannerAdSize.getHeight();
        advertSize.widthInPixels = bannerAdSize.getWidthPx(activity);
        advertSize.heightInPixels = bannerAdSize.getHeightPx(activity);
        return advertSize;
    }
}
