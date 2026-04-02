package com.mobile.brasiltv.view.shortvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mobile.brasiltv.R$id;
import com.mobile.brasiltv.bean.event.ToggleShowTitleBarEvent;
import com.mobile.brasiltv.view.shortvideo.ShortVideoSeekBar;
import com.msandroid.mobile.R;
import com.umeng.analytics.pro.f;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import t9.i;
/* loaded from: classes3.dex */
public final class TikTokView extends AutoFrameLayout {
    public Map<Integer, View> _$_findViewCache;
    private boolean isPrepared;
    private boolean isSeeking;
    private boolean isShowTitleBar;
    private int mScaledTouchSlop;
    private int mStartX;
    private int mStartY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TikTokView(Context context) {
        super(context);
        i.g(context, f.X);
        this._$_findViewCache = new LinkedHashMap();
        initView();
    }

    private final void hideThumbViews() {
        int i10 = R$id.mIvThumb;
        if (((ImageView) _$_findCachedViewById(i10)).getVisibility() == 0) {
            ((ImageView) _$_findCachedViewById(i10)).setVisibility(8);
            ((ProgressBar) _$_findCachedViewById(R$id.mProgressBar)).setVisibility(8);
        }
    }

    private final void initView() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_tiktok_controller, (ViewGroup) this, true);
        setOnClickListener(new View.OnClickListener() { // from class: com.mobile.brasiltv.view.shortvideo.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TikTokView.initView$lambda$0(TikTokView.this, view);
            }
        });
        this.mScaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        ((ShortVideoSeekBar) _$_findCachedViewById(R$id.mShortVideoSeekBar)).setSeekListener(new ShortVideoSeekBar.OnSeekListener() { // from class: com.mobile.brasiltv.view.shortvideo.TikTokView$initView$2
            @Override // com.mobile.brasiltv.view.shortvideo.ShortVideoSeekBar.OnSeekListener
            public void onSeekReset() {
                ((TextView) TikTokView.this._$_findCachedViewById(R$id.mTvTitle)).setVisibility(0);
                ((TextView) TikTokView.this._$_findCachedViewById(R$id.mTvAuthor)).setVisibility(0);
            }

            @Override // com.mobile.brasiltv.view.shortvideo.ShortVideoSeekBar.OnSeekListener
            public void onSeekStart() {
                TikTokView.this.isSeeking = true;
                ((TextView) TikTokView.this._$_findCachedViewById(R$id.mTvTitle)).setVisibility(8);
                ((TextView) TikTokView.this._$_findCachedViewById(R$id.mTvAuthor)).setVisibility(8);
            }

            @Override // com.mobile.brasiltv.view.shortvideo.ShortVideoSeekBar.OnSeekListener
            public void onSeekStop(int i10) {
                TikTokView.this.isSeeking = false;
            }

            @Override // com.mobile.brasiltv.view.shortvideo.ShortVideoSeekBar.OnSeekListener
            public void onSeeking(int i10) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(TikTokView tikTokView, View view) {
        int i10;
        i.g(tikTokView, "this$0");
        if (!tikTokView.isPrepared) {
            tikTokView.isShowTitleBar = !tikTokView.isShowTitleBar;
            ImageView imageView = (ImageView) tikTokView._$_findCachedViewById(R$id.mIvTopShadow);
            if (tikTokView.isShowTitleBar) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
            xa.c.c().j(new ToggleShowTitleBarEvent(tikTokView.isShowTitleBar));
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

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        i.g(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                int y10 = (int) motionEvent.getY();
                if (Math.abs(((int) motionEvent.getX()) - this.mStartX) < this.mScaledTouchSlop && Math.abs(y10 - this.mStartY) < this.mScaledTouchSlop) {
                    performClick();
                    return false;
                }
                return false;
            }
            return false;
        }
        this.mStartX = (int) motionEvent.getX();
        this.mStartY = (int) motionEvent.getY();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TikTokView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.g(context, f.X);
        this._$_findViewCache = new LinkedHashMap();
        initView();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TikTokView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i.g(context, f.X);
        this._$_findViewCache = new LinkedHashMap();
        initView();
    }
}
