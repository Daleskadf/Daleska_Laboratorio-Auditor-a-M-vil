package com.mobile.brasiltv.view.adView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.advertlib.bean.AdInfo;
import com.msandroid.mobile.R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import w6.i;
/* loaded from: classes3.dex */
public class AdvertImageView extends ImageView implements IAdView {
    private final String TAG;
    public Map<Integer, View> _$_findViewCache;
    private boolean isCountAsOnce;
    private boolean isKeep;
    private Integer lastHeight;
    private Integer lastWidth;
    private AdInfo mAdInfo;
    private String mAdType;
    private Disposable mAutoRefreshAdD;
    private long mAutoRefreshAdTime;
    private boolean mIsAutoRefresh;
    private boolean mIsHostVisible;
    private boolean mIsVisible;
    private s9.p mShowAdListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvertImageView(Context context) {
        this(context, null, 0, 6, null);
        t9.i.g(context, com.umeng.analytics.pro.f.X);
    }

    private final void refreshAd() {
        stopAutoTask();
        if (this.mAdType != null) {
            s1.m mVar = s1.m.f18686a;
            Context context = getContext();
            t9.i.f(context, com.umeng.analytics.pro.f.X);
            String str = this.mAdType;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            i.c cVar = w6.i.f19214g;
            List A = mVar.A(context, str2, cVar.I(), this.isCountAsOnce, cVar.r());
            if (A != null && !A.isEmpty()) {
                if (A.size() > 1 && this.mIsAutoRefresh) {
                    startAutoTask();
                } else {
                    showAd();
                }
            }
        }
    }

    public static /* synthetic */ void setAdtype$default(AdvertImageView advertImageView, String str, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            advertImageView.setAdtype(str, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAdtype");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAd() {
        String str;
        String str2;
        s1.m mVar = s1.m.f18686a;
        Context context = getContext();
        t9.i.f(context, com.umeng.analytics.pro.f.X);
        String str3 = this.mAdType;
        if (str3 == null) {
            str = "";
        } else {
            str = str3;
        }
        i.c cVar = w6.i.f19214g;
        AdInfo H = mVar.H(context, str, "picture", cVar.I(), this.isCountAsOnce, cVar.r());
        this.mAdInfo = H;
        if (H != null) {
            Context context2 = getContext();
            t9.i.f(context2, com.umeng.analytics.pro.f.X);
            String str4 = this.mAdType;
            if (str4 == null) {
                str2 = "";
            } else {
                str2 = str4;
            }
            s1.m.h0(mVar, context2, this, str2, this.mAdInfo, Integer.valueOf((int) R.drawable.column_image_placeholder), new AdvertImageView$showAd$1(this), null, false, 0, 448, null);
            return;
        }
        stopAutoTask();
    }

    private final void startAutoTask() {
        Observable<Long> observeOn = Observable.interval(0L, this.mAutoRefreshAdTime, TimeUnit.SECONDS).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread());
        final AdvertImageView$startAutoTask$1 advertImageView$startAutoTask$1 = new AdvertImageView$startAutoTask$1(this);
        Consumer<? super Long> consumer = new Consumer() { // from class: com.mobile.brasiltv.view.adView.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AdvertImageView.startAutoTask$lambda$1(s9.l.this, obj);
            }
        };
        final AdvertImageView$startAutoTask$2 advertImageView$startAutoTask$2 = AdvertImageView$startAutoTask$2.INSTANCE;
        this.mAutoRefreshAdD = observeOn.subscribe(consumer, new Consumer() { // from class: com.mobile.brasiltv.view.adView.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AdvertImageView.startAutoTask$lambda$2(s9.l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAutoTask$lambda$1(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAutoTask$lambda$2(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    private final void stopAutoTask() {
        boolean z10;
        Disposable disposable;
        Disposable disposable2 = this.mAutoRefreshAdD;
        if (disposable2 != null) {
            z10 = disposable2.isDisposed();
        } else {
            z10 = true;
        }
        if (!z10 && (disposable = this.mAutoRefreshAdD) != null) {
            disposable.dispose();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view == null) {
            View findViewById = findViewById(i10);
            if (findViewById != null) {
                map.put(Integer.valueOf(i10), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final AdInfo getAdInfo() {
        return this.mAdInfo;
    }

    public final String getAdType() {
        return this.mAdType;
    }

    @Override // com.mobile.brasiltv.view.adView.IAdView
    public void hostVisibilityChange(boolean z10, boolean z11) {
        boolean z12;
        this.mIsHostVisible = z10;
        if (z11) {
            if (this.mIsVisible && z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            visibilityChanged(z12);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAutoTask();
        setImageResource(0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        boolean z11 = true;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mIsVisible = z10;
        visibilityChanged((z10 && this.mIsHostVisible) ? false : false);
    }

    public final void setAdtype(String str, boolean z10) {
        boolean z11;
        this.mAdType = str;
        this.isCountAsOnce = z10;
        if (this.mIsVisible && this.mIsHostVisible) {
            z11 = true;
        } else {
            z11 = false;
        }
        visibilityChanged(z11);
    }

    public final void setAutoRefreshTime(long j10) {
        boolean z10;
        this.mAutoRefreshAdTime = j10;
        if (this.mIsVisible && this.mIsHostVisible) {
            z10 = true;
        } else {
            z10 = false;
        }
        visibilityChanged(z10);
    }

    public final void setKeep(boolean z10) {
        this.isKeep = z10;
    }

    public final void setShowAdListener(s9.p pVar) {
        t9.i.g(pVar, "showAdListener");
        this.mShowAdListener = pVar;
    }

    public void visibilityChanged(boolean z10) {
        if (z10) {
            refreshAd();
        } else {
            stopAutoTask();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvertImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t9.i.g(context, com.umeng.analytics.pro.f.X);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t9.i.g(context, com.umeng.analytics.pro.f.X);
        this._$_findViewCache = new LinkedHashMap();
        this.TAG = "AdvertImageView";
        this.mAutoRefreshAdTime = 10L;
        this.mIsHostVisible = true;
        this.mIsAutoRefresh = true;
    }

    public /* synthetic */ AdvertImageView(Context context, AttributeSet attributeSet, int i10, int i11, t9.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
