package com.distriqt.extension.adverts.platforms.admob;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.R;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.AdvertViewParams;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAdOptions;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAdTemplateStyle;
import com.distriqt.extension.adverts.events.NativeAdEvent;
import com.distriqt.extension.adverts.platforms.admob.nativeads.AdMobNativeAdView;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
/* loaded from: classes.dex */
public class GoogleAdMobNativeAd extends AdListener implements AdvertNativeAd, NativeAd.OnNativeAdLoadedListener {
    private static final String TAG = "GoogleAdMobNativeAd";
    private AdLoader _adLoader;
    private String _adUnitId;
    private FrameLayout _adView;
    private IExtensionContext _extContext;
    private final String _identifier;
    private NativeAd _loadedAd;
    private boolean _visible = true;
    private AdvertViewParams _adViewParams = new AdvertViewParams();

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
    }

    public GoogleAdMobNativeAd(IExtensionContext iExtensionContext, String str, String str2, AdvertNativeAdOptions advertNativeAdOptions) {
        this._extContext = iExtensionContext;
        this._identifier = str;
        this._adUnitId = str2;
        this._adLoader = new AdLoader.Builder(this._extContext.getActivity(), this._adUnitId).forNativeAd(this).withAdListener(this).withNativeAdOptions(GoogleAdMobUtils.toNativeAdOptions(advertNativeAdOptions)).build();
    }

    public void destroy() {
        visible(false);
        NativeAd nativeAd = this._loadedAd;
        if (nativeAd != null) {
            nativeAd.destroy();
            this._loadedAd = null;
        }
        this._adLoader = null;
        this._adView = null;
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd
    public boolean isLoaded() {
        AdLoader adLoader = this._adLoader;
        return (adLoader == null || adLoader.isLoading() || this._loadedAd == null) ? false : true;
    }

    @Override // com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd
    public boolean isLoading() {
        AdLoader adLoader = this._adLoader;
        if (adLoader != null) {
            return adLoader.isLoading();
        }
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd
    public void loadAd(AdvertRequest advertRequest) {
        Logger.d(TAG, "[%s]: loadAd()", this._identifier);
        AdLoader adLoader = this._adLoader;
        if (adLoader != null) {
            adLoader.loadAd(GoogleAdMobUtils.toAdRequest(advertRequest));
        }
    }

    @Override // com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd
    public void loadAds(AdvertRequest advertRequest, int i) {
        Logger.d(TAG, "[%s]: loadAds()", this._identifier);
        AdLoader adLoader = this._adLoader;
        if (adLoader != null) {
            adLoader.loadAds(GoogleAdMobUtils.toAdRequest(advertRequest), i);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd
    public boolean showWithCustom(String str, AdvertViewParams advertViewParams) {
        String str2 = TAG;
        Object[] objArr = new Object[3];
        objArr[0] = this._identifier;
        objArr[1] = str;
        objArr[2] = advertViewParams == null ? "null" : advertViewParams.toString();
        Logger.d(str2, "[%s]: showWithCustom( %s, %s )", objArr);
        try {
            NativeAd nativeAd = this._loadedAd;
            if (nativeAd != null) {
                if (this._adView == null) {
                    this._adView = AdMobNativeAdView.createNativeAd(this._extContext, str, nativeAd);
                }
                if (advertViewParams != null) {
                    this._adViewParams = advertViewParams;
                }
                this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobNativeAd$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        GoogleAdMobNativeAd.this.m231x1e28aa0b();
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
    /* renamed from: lambda$showWithCustom$0$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobNativeAd  reason: not valid java name */
    public /* synthetic */ void m231x1e28aa0b() {
        if (this._adView.getParent() != null) {
            ((ViewGroup) this._adView.getParent()).removeView(this._adView);
        }
        visible(true);
    }

    @Override // com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd
    public boolean showWithTemplate(String str, AdvertViewParams advertViewParams, AdvertNativeAdTemplateStyle advertNativeAdTemplateStyle) {
        String next;
        char c;
        String str2 = TAG;
        Object[] objArr = new Object[4];
        objArr[0] = this._identifier;
        objArr[1] = str;
        objArr[2] = advertViewParams == null ? "null" : advertViewParams.toString();
        objArr[3] = advertNativeAdTemplateStyle.toString();
        Logger.d(str2, "[%s]: showWithTemplate( %s, %s, %s )", objArr);
        try {
            if (this._loadedAd != null) {
                if (this._adView == null) {
                    LayoutInflater layoutInflater = this._extContext.getActivity().getLayoutInflater();
                    if (str.equals(FirebaseAnalytics.Param.MEDIUM)) {
                        this._adView = (FrameLayout) layoutInflater.inflate(R.layout.distriqt_adverts_nativead_medium, (ViewGroup) null);
                    } else {
                        this._adView = (FrameLayout) layoutInflater.inflate(R.layout.distriqt_adverts_nativead_small, (ViewGroup) null);
                    }
                    this._adView.setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
                    NativeTemplateStyle.Builder builder = new NativeTemplateStyle.Builder();
                    Iterator<String> keys = advertNativeAdTemplateStyle.json.keys();
                    while (keys.hasNext()) {
                        try {
                            next = keys.next();
                            switch (next.hashCode()) {
                                case -2052936245:
                                    if (next.equals("secondaryTextTypefaceColor")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1989855936:
                                    if (next.equals("tertiaryTextSize")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1950589891:
                                    if (next.equals("callToActionTypefaceColor")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1399984467:
                                    if (next.equals("tertiaryTextTypefaceColor")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -786861946:
                                    if (next.equals("primaryTextBackgroundColor")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -35049219:
                                    if (next.equals("callToActionTextSize")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 90242813:
                                    if (next.equals("primaryTextTypefaceColor")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 249531120:
                                    if (next.equals("primaryTextSize")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 544628700:
                                    if (next.equals("mainBackgroundColor")) {
                                        c = '\r';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 772963782:
                                    if (next.equals("callToActionBackgroundColor")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1202365396:
                                    if (next.equals("secondaryTextBackgroundColor")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1623798838:
                                    if (next.equals("tertiaryTextBackgroundColor")) {
                                        c = '\f';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2001558626:
                                    if (next.equals("secondaryTextSize")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                        } catch (Exception e) {
                            Errors.handleException(e);
                        }
                        switch (c) {
                            case 1:
                                Logger.d(TAG, "NativeTemplateStyle: %s = %d", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withCallToActionTextSize((float) advertNativeAdTemplateStyle.json.getDouble(next));
                                continue;
                            case 2:
                                Logger.d(TAG, "NativeTemplateStyle: %s = #%08X", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withCallToActionTypefaceColor(advertNativeAdTemplateStyle.json.getInt(next));
                                continue;
                            case 3:
                                Logger.d(TAG, "NativeTemplateStyle: %s = #%08X", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withCallToActionBackgroundColor(new ColorDrawable(advertNativeAdTemplateStyle.json.getInt(next)));
                                continue;
                            case 4:
                                Logger.d(TAG, "NativeTemplateStyle: %s = %d", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withPrimaryTextSize((float) advertNativeAdTemplateStyle.json.getDouble(next));
                                continue;
                            case 5:
                                Logger.d(TAG, "NativeTemplateStyle: %s = #%08X", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withPrimaryTextTypefaceColor(advertNativeAdTemplateStyle.json.getInt(next));
                                continue;
                            case 6:
                                Logger.d(TAG, "NativeTemplateStyle: %s = #%08X", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withPrimaryTextBackgroundColor(new ColorDrawable(advertNativeAdTemplateStyle.json.getInt(next)));
                                continue;
                            case 7:
                                Logger.d(TAG, "NativeTemplateStyle: %s = %d", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withSecondaryTextSize(advertNativeAdTemplateStyle.json.getInt(next));
                                continue;
                            case '\b':
                                Logger.d(TAG, "NativeTemplateStyle: %s = #%08X", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withSecondaryTextTypefaceColor(advertNativeAdTemplateStyle.json.getInt(next));
                                continue;
                            case '\t':
                                Logger.d(TAG, "NativeTemplateStyle: %s = #%08X", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withSecondaryTextBackgroundColor(new ColorDrawable(advertNativeAdTemplateStyle.json.getInt(next)));
                                continue;
                            case '\n':
                                Logger.d(TAG, "NativeTemplateStyle: %s = %d", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withTertiaryTextSize(advertNativeAdTemplateStyle.json.getInt(next));
                                continue;
                            case 11:
                                Logger.d(TAG, "NativeTemplateStyle: %s = #%08X", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withTertiaryTextTypefaceColor(advertNativeAdTemplateStyle.json.getInt(next));
                                continue;
                            case '\f':
                                Logger.d(TAG, "NativeTemplateStyle: %s = #%08X", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withTertiaryTextBackgroundColor(new ColorDrawable(advertNativeAdTemplateStyle.json.getInt(next)));
                                continue;
                            case '\r':
                                Logger.d(TAG, "NativeTemplateStyle: %s = #%08X", next, Integer.valueOf(advertNativeAdTemplateStyle.json.getInt(next)));
                                builder.withMainBackgroundColor(new ColorDrawable(advertNativeAdTemplateStyle.json.getInt(next)));
                                this._adView.setBackgroundColor(advertNativeAdTemplateStyle.json.getInt(next));
                                continue;
                            default:
                                Logger.d(TAG, "NativeTemplateStyle: UNHANDLED:%s", next);
                                continue;
                        }
                        Errors.handleException(e);
                    }
                    TemplateView templateView = (TemplateView) this._adView.findViewById(R.id.ad_template);
                    templateView.setNativeAd(this._loadedAd);
                    templateView.setStyles(builder.build());
                }
                if (advertViewParams != null) {
                    this._adViewParams = advertViewParams;
                }
                this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobNativeAd$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        GoogleAdMobNativeAd.this.m232xa102db01();
                    }
                });
                return true;
            }
        } catch (Exception e2) {
            Errors.handleException(e2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$showWithTemplate$1$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobNativeAd  reason: not valid java name */
    public /* synthetic */ void m232xa102db01() {
        if (this._adView.getParent() != null) {
            ((ViewGroup) this._adView.getParent()).removeView(this._adView);
        }
        visible(true);
    }

    @Override // com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd
    public boolean isVisible() {
        try {
            FrameLayout frameLayout = this._adView;
            if (frameLayout != null) {
                return frameLayout.getParent() != null;
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd
    public void visible(final boolean z) {
        String str = TAG;
        Object[] objArr = new Object[2];
        objArr[0] = this._identifier;
        objArr[1] = z ? "true" : "false";
        Logger.d(str, "[%s]: visible( %s )", objArr);
        try {
            this._visible = z;
            if (this._adView != null) {
                final Activity activity = this._extContext.getActivity();
                activity.runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobNativeAd$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        GoogleAdMobNativeAd.this.m233x74d5f5e5(z, activity);
                    }
                });
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$visible$2$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobNativeAd  reason: not valid java name */
    public /* synthetic */ void m233x74d5f5e5(boolean z, Activity activity) {
        try {
            if (z) {
                if (this._adView.getParent() == null) {
                    ((ViewGroup) activity.findViewById(16908290)).addView(this._adView);
                    setViewParams(this._adViewParams);
                }
            } else if (this._adView.getParent() != null) {
                ((ViewGroup) this._adView.getParent()).removeView(this._adView);
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd
    public void setViewParams(AdvertViewParams advertViewParams) {
        Logger.d(TAG, "[%s]: setViewParams( %s )", this._identifier, advertViewParams.toString());
        try {
            this._adViewParams = advertViewParams;
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobNativeAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobNativeAd.this.m230xb051fb49();
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setViewParams$3$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobNativeAd  reason: not valid java name */
    public /* synthetic */ void m230xb051fb49() {
        if (this._adView != null) {
            this._adView.setLayoutParams(this._adViewParams.toLayoutParams());
        }
    }

    @Override // com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd
    public AdvertViewParams getViewParams() {
        TemplateView templateView;
        try {
            FrameLayout frameLayout = this._adView;
            if (frameLayout != null && (templateView = (TemplateView) frameLayout.findViewById(R.id.ad_template)) != null) {
                this._adViewParams.width = templateView.getWidth();
                this._adViewParams.height = templateView.getHeight();
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return this._adViewParams;
    }

    public void onResume() {
        Logger.d(TAG, "[%s]: onResume()", this._identifier);
        try {
            FrameLayout frameLayout = this._adView;
            if (frameLayout != null) {
                if (frameLayout.getParent() != null) {
                    ((ViewGroup) this._adView.getParent()).removeView(this._adView);
                }
                visible(this._visible);
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void onPause() {
        Logger.d(TAG, "[%s]: onPause()", this._identifier);
        try {
            FrameLayout frameLayout = this._adView;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            ((ViewGroup) this._adView.getParent()).removeView(this._adView);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        Logger.d(TAG, "[%s]: onNativeAdLoaded()", this._identifier);
        this._loadedAd = nativeAd;
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext != null) {
            iExtensionContext.dispatchEvent(NativeAdEvent.LOADED, NativeAdEvent.formatForEvent(this._identifier));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        Logger.d(TAG, "[%s]: onAdClosed()", this._identifier);
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext != null) {
            iExtensionContext.dispatchEvent(NativeAdEvent.CLOSED, NativeAdEvent.formatForEvent(this._identifier));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        Logger.d(TAG, "[%s]: onAdOpened()", this._identifier);
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext != null) {
            iExtensionContext.dispatchEvent(NativeAdEvent.OPENED, NativeAdEvent.formatForEvent(this._identifier));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        Logger.d(TAG, "[%s]: onAdClicked()", this._identifier);
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext != null) {
            iExtensionContext.dispatchEvent(NativeAdEvent.CLICKED, NativeAdEvent.formatForEvent(this._identifier));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        Logger.d(TAG, "[%s]: onAdFailedToLoad()", this._identifier);
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext != null) {
            iExtensionContext.dispatchEvent(NativeAdEvent.ERROR, NativeAdEvent.formatForErrorEvent(this._identifier, loadAdError.getCode(), loadAdError.getMessage()));
        }
    }
}
