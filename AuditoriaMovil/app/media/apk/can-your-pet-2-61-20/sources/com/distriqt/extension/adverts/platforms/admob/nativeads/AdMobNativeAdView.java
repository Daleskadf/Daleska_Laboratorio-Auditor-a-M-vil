package com.distriqt.extension.adverts.platforms.admob.nativeads;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.R;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
/* loaded from: classes.dex */
public class AdMobNativeAdView extends FrameLayout {
    private static final String TAG = "AdMobNativeAdView";
    private ConstraintLayout background;
    private Button callToActionView;
    private ImageView iconView;
    private MediaView mediaView;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private TextView primaryView;
    private RatingBar ratingBar;
    private TextView secondaryView;
    private NativeTemplateStyle styles;
    private TextView tertiaryView;

    public AdMobNativeAdView(Context context) {
        super(context);
    }

    public AdMobNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context, attributeSet);
    }

    public AdMobNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context, attributeSet);
    }

    public AdMobNativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context, attributeSet);
    }

    protected void initView(Context context, AttributeSet attributeSet) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.distriqt_adverts_nativead_custom_medium, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public static FrameLayout createNativeAd(IExtensionContext iExtensionContext, String str, NativeAd nativeAd) {
        String packageName;
        Resources resources;
        FrameLayout frameLayout;
        NativeAdView nativeAdView;
        FrameLayout frameLayout2 = null;
        try {
            packageName = iExtensionContext.getActivity().getPackageName();
            LayoutInflater layoutInflater = iExtensionContext.getActivity().getLayoutInflater();
            resources = iExtensionContext.getActivity().getResources();
            frameLayout = (FrameLayout) layoutInflater.inflate(resources.getIdentifier(str, "layout", packageName), (ViewGroup) null);
        } catch (Exception e) {
            e = e;
        }
        try {
            if (frameLayout == null) {
                Logger.d(TAG, "Failed to create ad view - check the custom view identifier [%s]", str);
                return null;
            }
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
            int identifier = resources.getIdentifier("native_ad_view", "id", packageName);
            if (identifier == 0 || (nativeAdView = (NativeAdView) frameLayout.findViewById(identifier)) == null) {
                return frameLayout;
            }
            constructNativeAdView(nativeAdView, frameLayout, resources, packageName);
            populateNativeAdView(nativeAd, nativeAdView);
            return frameLayout;
        } catch (Exception e2) {
            e = e2;
            frameLayout2 = frameLayout;
            Errors.handleException(e);
            return frameLayout2;
        }
    }

    public static void constructNativeAdView(NativeAdView nativeAdView, FrameLayout frameLayout, Resources resources, String str) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        View findViewById7;
        View findViewById8;
        MediaView mediaView;
        if (nativeAdView != null) {
            try {
                int identifier = resources.getIdentifier("ad_media_view", "id", str);
                if (identifier != 0 && (mediaView = (MediaView) frameLayout.findViewById(identifier)) != null) {
                    nativeAdView.setMediaView(mediaView);
                }
                int identifier2 = resources.getIdentifier("ad_headline", "id", str);
                if (identifier2 != 0 && (findViewById8 = frameLayout.findViewById(identifier2)) != null) {
                    nativeAdView.setHeadlineView(findViewById8);
                }
                int identifier3 = resources.getIdentifier("ad_body", "id", str);
                if (identifier3 != 0 && (findViewById7 = frameLayout.findViewById(identifier3)) != null) {
                    nativeAdView.setBodyView(findViewById7);
                }
                int identifier4 = resources.getIdentifier("ad_call_to_action", "id", str);
                if (identifier4 != 0 && (findViewById6 = frameLayout.findViewById(identifier4)) != null) {
                    nativeAdView.setCallToActionView(findViewById6);
                }
                int identifier5 = resources.getIdentifier("ad_icon", "id", str);
                if (identifier5 != 0 && (findViewById5 = frameLayout.findViewById(identifier5)) != null) {
                    nativeAdView.setIconView(findViewById5);
                }
                int identifier6 = resources.getIdentifier("ad_price", "id", str);
                if (identifier6 != 0 && (findViewById4 = frameLayout.findViewById(identifier6)) != null) {
                    nativeAdView.setPriceView(findViewById4);
                }
                int identifier7 = resources.getIdentifier("ad_rating_bar", "id", str);
                if (identifier7 != 0 && (findViewById3 = frameLayout.findViewById(identifier7)) != null) {
                    nativeAdView.setStarRatingView(findViewById3);
                }
                int identifier8 = resources.getIdentifier("ad_store", "id", str);
                if (identifier8 != 0 && (findViewById2 = frameLayout.findViewById(identifier8)) != null) {
                    nativeAdView.setStoreView(findViewById2);
                }
                int identifier9 = resources.getIdentifier("ad_advertiser", "id", str);
                if (identifier9 == 0 || (findViewById = frameLayout.findViewById(identifier9)) == null) {
                    return;
                }
                nativeAdView.setAdvertiserView(findViewById);
            } catch (Exception e) {
                Errors.handleException(e);
            }
        }
    }

    public static void populateNativeAdView(NativeAd nativeAd, NativeAdView nativeAdView) {
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
        ((Button) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
        NativeAd.Image icon = nativeAd.getIcon();
        if (icon == null) {
            nativeAdView.getIconView().setVisibility(4);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(icon.getDrawable());
            nativeAdView.getIconView().setVisibility(0);
        }
        if (nativeAd.getPrice() == null) {
            nativeAdView.getPriceView().setVisibility(4);
        } else {
            nativeAdView.getPriceView().setVisibility(0);
            ((TextView) nativeAdView.getPriceView()).setText(nativeAd.getPrice());
        }
        if (nativeAd.getStore() == null) {
            nativeAdView.getStoreView().setVisibility(4);
        } else {
            nativeAdView.getStoreView().setVisibility(0);
            ((TextView) nativeAdView.getStoreView()).setText(nativeAd.getStore());
        }
        if (nativeAd.getStarRating() == null) {
            nativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) nativeAdView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            nativeAdView.getStarRatingView().setVisibility(0);
        }
        if (nativeAd.getAdvertiser() == null) {
            nativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            nativeAdView.getAdvertiserView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
    }
}
