package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcth extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcth(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcth zza(Context context, View view, zzffn zzffnVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcth zzcthVar = new zzcth(context);
        if (!zzffnVar.zzv.isEmpty() && (resources = zzcthVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzffo zzffoVar = (zzffo) zzffnVar.zzv.get(0);
            zzcthVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzffoVar.zza * displayMetrics.density), (int) (zzffoVar.zzb * displayMetrics.density)));
        }
        zzcthVar.zzb = view;
        zzcthVar.addView(view);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzcce.zzb(zzcthVar, zzcthVar);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzcce.zza(zzcthVar, zzcthVar);
        JSONObject jSONObject = zzffnVar.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcthVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcthVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcthVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcthVar.addView(relativeLayout);
        return zzcthVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
