package com.distriqt.extension.adverts.platforms.admob;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.AdvertSize;
import com.distriqt.extension.adverts.controller.AdvertView;
import com.distriqt.extension.adverts.controller.AdvertViewParams;
import com.distriqt.extension.adverts.events.AdViewEvent;
import com.distriqt.extension.adverts.events.PaidEvent;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
/* loaded from: classes.dex */
public class GoogleAdMobAdvertView extends AdListener implements AdvertView, OnPaidEventListener {
    private static final String TAG = "GoogleAdMobAdvertView";
    private AdView _adView;
    private IExtensionContext _extContext;
    private Handler _handler;
    private final String _identifier;
    private AdvertViewParams _position;
    private String _adUnitId = null;
    private boolean _addOnResume = false;

    public GoogleAdMobAdvertView(IExtensionContext iExtensionContext, String str) {
        this._extContext = iExtensionContext;
        this._identifier = str;
        final Activity activity = iExtensionContext.getActivity();
        activity.runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                GoogleAdMobAdvertView.this.m221xd9846178(activity);
            }
        });
        this._position = new AdvertViewParams();
        this._handler = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    public /* synthetic */ void m221xd9846178(Activity activity) {
        try {
            AdView adView = new AdView(activity);
            this._adView = adView;
            adView.setAdListener(this);
            this._adView.setOnPaidEventListener(this);
            this._extContext.dispatchEvent(AdViewEvent.CREATED, AdViewEvent.formatForEvent(this._identifier));
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void destroy() {
        Logger.d(TAG, "[%s]: destroy()", this._identifier);
        if (this._adView != null) {
            hide();
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobAdvertView.this.m217x46c8dbfd();
                }
            });
        }
        Handler handler = this._handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this._handler = null;
        }
        this._extContext = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$destroy$1$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    public /* synthetic */ void m217x46c8dbfd() {
        this._adView.destroy();
        this._adView = null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setAdSize(final AdvertSize advertSize) {
        Logger.d(TAG, "[%s]: setAdSize( [%dx%d:%s] )", this._identifier, Integer.valueOf(advertSize.width), Integer.valueOf(advertSize.height), advertSize.type);
        if (this._adView == null) {
            return;
        }
        try {
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobAdvertView.this.m222x1ab7c610(advertSize);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setAdSize$2$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    public /* synthetic */ void m222x1ab7c610(AdvertSize advertSize) {
        this._adView.setAdSize(toAdSize(advertSize));
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setAdaptiveAdSize(final int i, final String str) {
        Logger.d(TAG, "[%s]: setAdaptiveAdSize( %d, %s )", this._identifier, Integer.valueOf(i), str);
        if (this._adView == null) {
            return;
        }
        try {
            final Activity activity = this._extContext.getActivity();
            activity.runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobAdvertView.this.m223x6a4bb4d9(i, activity, str);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r0 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        r7 = com.google.android.gms.ads.AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        r7 = com.google.android.gms.ads.AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(r8, r7);
     */
    /* renamed from: lambda$setAdaptiveAdSize$3$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m223x6a4bb4d9(int r7, android.app.Activity r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = -1
            if (r7 != r0) goto L1a
            android.view.WindowManager r7 = r8.getWindowManager()     // Catch: java.lang.Exception -> L88
            android.view.Display r7 = r7.getDefaultDisplay()     // Catch: java.lang.Exception -> L88
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics     // Catch: java.lang.Exception -> L88
            r1.<init>()     // Catch: java.lang.Exception -> L88
            r7.getMetrics(r1)     // Catch: java.lang.Exception -> L88
            int r7 = r1.widthPixels     // Catch: java.lang.Exception -> L88
            float r7 = (float) r7     // Catch: java.lang.Exception -> L88
            float r1 = r1.density     // Catch: java.lang.Exception -> L88
            float r7 = r7 / r1
            int r7 = (int) r7     // Catch: java.lang.Exception -> L88
        L1a:
            int r1 = r9.hashCode()     // Catch: java.lang.Exception -> L88
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            r3 = 0
            r4 = 3
            r5 = 2
            if (r1 == r2) goto L45
            r2 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            if (r1 == r2) goto L3b
            r2 = 1430647483(0x5545f2bb, float:1.36028944E13)
            if (r1 == r2) goto L31
            goto L4e
        L31:
            java.lang.String r1 = "landscape"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Exception -> L88
            if (r9 == 0) goto L4e
            r0 = 3
            goto L4e
        L3b:
            java.lang.String r1 = "portrait"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Exception -> L88
            if (r9 == 0) goto L4e
            r0 = 2
            goto L4e
        L45:
            java.lang.String r1 = "auto"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Exception -> L88
            if (r9 == 0) goto L4e
            r0 = 0
        L4e:
            if (r0 == r5) goto L5c
            if (r0 == r4) goto L57
            com.google.android.gms.ads.AdSize r7 = com.google.android.gms.ads.AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(r8, r7)     // Catch: java.lang.Exception -> L88
            goto L60
        L57:
            com.google.android.gms.ads.AdSize r7 = com.google.android.gms.ads.AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(r8, r7)     // Catch: java.lang.Exception -> L88
            goto L60
        L5c:
            com.google.android.gms.ads.AdSize r7 = com.google.android.gms.ads.AdSize.getPortraitAnchoredAdaptiveBannerAdSize(r8, r7)     // Catch: java.lang.Exception -> L88
        L60:
            java.lang.String r9 = com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView.TAG     // Catch: java.lang.Exception -> L88
            java.lang.String r0 = "[%s]: setAdaptiveAdSize(): setAdSize([%dx%d])"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L88
            java.lang.String r2 = r6._identifier     // Catch: java.lang.Exception -> L88
            r1[r3] = r2     // Catch: java.lang.Exception -> L88
            int r2 = r7.getWidthInPixels(r8)     // Catch: java.lang.Exception -> L88
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L88
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.Exception -> L88
            int r8 = r7.getHeightInPixels(r8)     // Catch: java.lang.Exception -> L88
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L88
            r1[r5] = r8     // Catch: java.lang.Exception -> L88
            com.distriqt.extension.adverts.utils.Logger.d(r9, r0, r1)     // Catch: java.lang.Exception -> L88
            com.google.android.gms.ads.AdView r8 = r6._adView     // Catch: java.lang.Exception -> L88
            r8.setAdSize(r7)     // Catch: java.lang.Exception -> L88
            goto L8c
        L88:
            r7 = move-exception
            com.distriqt.extension.adverts.utils.Errors.handleException(r7)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView.m223x6a4bb4d9(int, android.app.Activity, java.lang.String):void");
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setInlineAdaptiveAdSize(final int i, final String str) {
        Logger.d(TAG, "[%s]: setInlineAdaptiveAdSize( %d, %s )", this._identifier, Integer.valueOf(i), str);
        if (this._adView == null) {
            return;
        }
        try {
            final Activity activity = this._extContext.getActivity();
            activity.runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobAdvertView.this.m224xa82f6c1f(i, activity, str);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r0 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        r7 = com.google.android.gms.ads.AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        r7 = com.google.android.gms.ads.AdSize.getLandscapeInlineAdaptiveBannerAdSize(r8, r7);
     */
    /* renamed from: lambda$setInlineAdaptiveAdSize$4$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m224xa82f6c1f(int r7, android.app.Activity r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = -1
            if (r7 != r0) goto L1a
            android.view.WindowManager r7 = r8.getWindowManager()     // Catch: java.lang.Exception -> L88
            android.view.Display r7 = r7.getDefaultDisplay()     // Catch: java.lang.Exception -> L88
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics     // Catch: java.lang.Exception -> L88
            r1.<init>()     // Catch: java.lang.Exception -> L88
            r7.getMetrics(r1)     // Catch: java.lang.Exception -> L88
            int r7 = r1.widthPixels     // Catch: java.lang.Exception -> L88
            float r7 = (float) r7     // Catch: java.lang.Exception -> L88
            float r1 = r1.density     // Catch: java.lang.Exception -> L88
            float r7 = r7 / r1
            int r7 = (int) r7     // Catch: java.lang.Exception -> L88
        L1a:
            int r1 = r9.hashCode()     // Catch: java.lang.Exception -> L88
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            r3 = 0
            r4 = 3
            r5 = 2
            if (r1 == r2) goto L45
            r2 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            if (r1 == r2) goto L3b
            r2 = 1430647483(0x5545f2bb, float:1.36028944E13)
            if (r1 == r2) goto L31
            goto L4e
        L31:
            java.lang.String r1 = "landscape"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Exception -> L88
            if (r9 == 0) goto L4e
            r0 = 3
            goto L4e
        L3b:
            java.lang.String r1 = "portrait"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Exception -> L88
            if (r9 == 0) goto L4e
            r0 = 2
            goto L4e
        L45:
            java.lang.String r1 = "auto"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Exception -> L88
            if (r9 == 0) goto L4e
            r0 = 0
        L4e:
            if (r0 == r5) goto L5c
            if (r0 == r4) goto L57
            com.google.android.gms.ads.AdSize r7 = com.google.android.gms.ads.AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(r8, r7)     // Catch: java.lang.Exception -> L88
            goto L60
        L57:
            com.google.android.gms.ads.AdSize r7 = com.google.android.gms.ads.AdSize.getLandscapeInlineAdaptiveBannerAdSize(r8, r7)     // Catch: java.lang.Exception -> L88
            goto L60
        L5c:
            com.google.android.gms.ads.AdSize r7 = com.google.android.gms.ads.AdSize.getPortraitInlineAdaptiveBannerAdSize(r8, r7)     // Catch: java.lang.Exception -> L88
        L60:
            java.lang.String r9 = com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView.TAG     // Catch: java.lang.Exception -> L88
            java.lang.String r0 = "[%s]: setInlineAdaptiveAdSize(): setAdSize([%dx%d])"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L88
            java.lang.String r2 = r6._identifier     // Catch: java.lang.Exception -> L88
            r1[r3] = r2     // Catch: java.lang.Exception -> L88
            int r2 = r7.getWidthInPixels(r8)     // Catch: java.lang.Exception -> L88
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L88
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.Exception -> L88
            int r8 = r7.getHeightInPixels(r8)     // Catch: java.lang.Exception -> L88
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L88
            r1[r5] = r8     // Catch: java.lang.Exception -> L88
            com.distriqt.extension.adverts.utils.Logger.d(r9, r0, r1)     // Catch: java.lang.Exception -> L88
            com.google.android.gms.ads.AdView r8 = r6._adView     // Catch: java.lang.Exception -> L88
            r8.setAdSize(r7)     // Catch: java.lang.Exception -> L88
            goto L8c
        L88:
            r7 = move-exception
            com.distriqt.extension.adverts.utils.Errors.handleException(r7)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView.m224xa82f6c1f(int, android.app.Activity, java.lang.String):void");
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setInlineAdaptiveAdSizeWithMaxHeight(final int i, final int i2) {
        Logger.d(TAG, "[%s]: setInlineAdaptiveAdSizeWithMaxHeight( %d, %d )", this._identifier, Integer.valueOf(i), Integer.valueOf(i2));
        if (this._adView == null) {
            return;
        }
        try {
            final Activity activity = this._extContext.getActivity();
            activity.runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobAdvertView.this.m225xd1ffa1a9(activity, i2, i);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setInlineAdaptiveAdSizeWithMaxHeight$5$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    public /* synthetic */ void m225xd1ffa1a9(Activity activity, int i, int i2) {
        try {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            float f = displayMetrics.density;
            if (i == -1) {
                i = (int) (displayMetrics.widthPixels / f);
            }
            int i3 = (int) (i2 / f);
            String str = TAG;
            Logger.d(str, "[%s]: setInlineAdaptiveAdSizeWithMaxHeight: AdSize.getInlineAdaptiveBannerAdSize( %d, %d )", this._identifier, Integer.valueOf(i), Integer.valueOf(i3));
            AdSize inlineAdaptiveBannerAdSize = AdSize.getInlineAdaptiveBannerAdSize(i, i3);
            Logger.d(str, "[%s]: setInlineAdaptiveAdSizeWithMaxHeight(): setAdSize([%dx%d])", this._identifier, Integer.valueOf(inlineAdaptiveBannerAdSize.getWidthInPixels(activity)), Integer.valueOf(inlineAdaptiveBannerAdSize.getHeightInPixels(activity)));
            this._adView.setAdSize(inlineAdaptiveBannerAdSize);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public AdvertSize getAdSize() {
        Logger.d(TAG, "[%s]: getAdSize()", this._identifier);
        if (this._adView == null) {
            return null;
        }
        final AdSize[] adSizeArr = new AdSize[1];
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            adSizeArr[0] = this._adView.getAdSize();
        } else {
            Runnable runnable = new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView.1
                @Override // java.lang.Runnable
                public void run() {
                    adSizeArr[0] = GoogleAdMobAdvertView.this._adView.getAdSize();
                    synchronized (this) {
                        notify();
                    }
                }
            };
            try {
                synchronized (runnable) {
                    this._extContext.getActivity().runOnUiThread(runnable);
                    runnable.wait();
                }
            } catch (Exception e) {
                Errors.handleException(e);
                return null;
            }
        }
        return fromAdSize(this._extContext.getActivity(), adSizeArr[0]);
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setAdUnitId(String str) {
        Logger.d(TAG, "[%s]: setAdUnitId( %s )", this._identifier, str);
        if (str == null) {
            return;
        }
        this._adUnitId = str;
        AdView adView = this._adView;
        if (adView == null) {
            return;
        }
        try {
            adView.setAdUnitId(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public String getAdUnitId() {
        Logger.d(TAG, "[%s]: getAdUnitId()", this._identifier);
        String str = this._adUnitId;
        return str == null ? "" : str;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public boolean isLoading() {
        Logger.d(TAG, "[%s]: isLoading()", this._identifier);
        if (this._adView == null) {
            return false;
        }
        final boolean[] zArr = new boolean[1];
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            zArr[0] = this._adView.isLoading();
        } else {
            Runnable runnable = new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView.2
                @Override // java.lang.Runnable
                public void run() {
                    zArr[0] = GoogleAdMobAdvertView.this._adView.isLoading();
                    synchronized (this) {
                        notify();
                    }
                }
            };
            try {
                synchronized (runnable) {
                    this._extContext.getActivity().runOnUiThread(runnable);
                    runnable.wait();
                }
            } catch (Exception e) {
                Errors.handleException(e);
                return false;
            }
        }
        return zArr[0];
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void load(AdvertRequest advertRequest) {
        Logger.d(TAG, "[%s]: load()", this._identifier);
        if (this._adView == null) {
            return;
        }
        try {
            final AdRequest adRequest = GoogleAdMobUtils.toAdRequest(advertRequest);
            this._handler.postDelayed(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobAdvertView.this.m220xd9b37571(adRequest);
                }
            }, 1000L);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$load$7$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    public /* synthetic */ void m220xd9b37571(final AdRequest adRequest) {
        try {
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobAdvertView.this.m219xa0d314d2(adRequest);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$load$6$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    public /* synthetic */ void m219xa0d314d2(AdRequest adRequest) {
        try {
            this._adView.loadAd(adRequest);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public void setViewParams(AdvertViewParams advertViewParams) {
        Logger.d(TAG, "[%s]: setViewParams( %s )", this._identifier, advertViewParams.toString());
        this._position = advertViewParams;
        if (this._adView == null) {
            return;
        }
        try {
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobAdvertView.this.m226x4b67d4a3();
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setViewParams$8$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    public /* synthetic */ void m226x4b67d4a3() {
        this._adView.setLayoutParams(this._position.toLayoutParams());
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public boolean show() {
        Logger.d(TAG, "[%s]: show()", this._identifier);
        if (this._adView == null) {
            return false;
        }
        try {
            final Activity activity = this._extContext.getActivity();
            activity.runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobAdvertView.this.m227x8a52a0b8(activity);
                }
            });
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$show$9$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    public /* synthetic */ void m227x8a52a0b8(Activity activity) {
        try {
            if (this._adView.getParent() != null) {
                ((ViewGroup) this._adView.getParent()).removeView(this._adView);
            }
            this._adView.resume();
            ((ViewGroup) activity.findViewById(16908290)).addView(this._adView);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertView
    public boolean hide() {
        Logger.d(TAG, "[%s]: hide()", this._identifier);
        if (this._adView == null) {
            return false;
        }
        try {
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobAdvertView$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobAdvertView.this.m218x6382c8c3();
                }
            });
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$hide$10$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobAdvertView  reason: not valid java name */
    public /* synthetic */ void m218x6382c8c3() {
        if (this._adView.getParent() != null) {
            this._adView.pause();
            ((ViewGroup) this._adView.getParent()).removeView(this._adView);
        }
    }

    public void onResume() {
        Logger.d(TAG, "[%s]: onResume()", this._identifier);
        try {
            if (this._addOnResume) {
                this._addOnResume = false;
                show();
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void onPause() {
        Logger.d(TAG, "[%s]: onPause()", this._identifier);
        try {
            AdView adView = this._adView;
            if (adView == null || adView.getParent() == null) {
                return;
            }
            this._addOnResume = true;
            hide();
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        Logger.d(TAG, "[%s]: onAdLoaded()", this._identifier);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(AdViewEvent.LOADED, AdViewEvent.formatForEvent(this._identifier));
                this._adView.setLayoutParams(this._position.toLayoutParams());
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        Logger.d(TAG, "[%s]: onAdFailedToLoad()", this._identifier);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(AdViewEvent.ERROR, AdViewEvent.formatForErrorEvent(this._identifier, loadAdError.getCode()));
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        Logger.d(TAG, "[%s]: onAdClicked()", this._identifier);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        Logger.d(TAG, "[%s]: onAdImpression()", this._identifier);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        Logger.d(TAG, "[%s]: onAdOpened()", this._identifier);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(AdViewEvent.OPENED, AdViewEvent.formatForEvent(this._identifier));
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        Logger.d(TAG, "[%s]: onAdClosed()", this._identifier);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(AdViewEvent.CLOSED, AdViewEvent.formatForEvent(this._identifier));
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        this._extContext.dispatchEvent(PaidEvent.PAID, PaidEvent.formatForEvent(this._identifier, adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType(), this._adView.getResponseInfo() != null ? this._adView.getResponseInfo().getMediationAdapterClassName() : ""));
    }

    public static AdSize toAdSize(AdvertSize advertSize) {
        char c;
        try {
            String str = advertSize.type;
            switch (str.hashCode()) {
                case -2029282337:
                    if (str.equals("728x90_as")) {
                        c = 4;
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
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -793214366:
                    if (str.equals("smart_banner")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 97532362:
                    if (str.equals("fluid")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 367982857:
                    if (str.equals("300x250_as")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1014794471:
                    if (str.equals("320x100_as")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1771617237:
                    if (str.equals("468x60_as")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1778207859:
                    if (str.equals("search_v2")) {
                        c = 6;
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
                    return AdSize.BANNER;
                case 1:
                    return AdSize.FLUID;
                case 2:
                    return AdSize.FULL_BANNER;
                case 3:
                    return AdSize.LARGE_BANNER;
                case 4:
                    return AdSize.LEADERBOARD;
                case 5:
                    return AdSize.MEDIUM_RECTANGLE;
                case 6:
                    return AdSize.SEARCH;
                case 7:
                    return AdSize.SMART_BANNER;
                case '\b':
                    return AdSize.WIDE_SKYSCRAPER;
                default:
                    return new AdSize(advertSize.width, advertSize.height);
            }
        } catch (Exception e) {
            Errors.handleException(e);
            return AdSize.SMART_BANNER;
        }
    }

    public static AdvertSize fromAdSize(Activity activity, AdSize adSize) {
        if (adSize == null) {
            return null;
        }
        AdvertSize advertSize = new AdvertSize();
        advertSize.width = adSize.getWidth();
        advertSize.height = adSize.getHeight();
        advertSize.widthInPixels = adSize.getWidthInPixels(activity);
        advertSize.heightInPixels = adSize.getHeightInPixels(activity);
        return advertSize;
    }
}
