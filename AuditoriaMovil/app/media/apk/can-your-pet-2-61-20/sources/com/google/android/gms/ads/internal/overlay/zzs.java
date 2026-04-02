package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbdz;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzs extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzae zzb;

    public zzs(Context context, zzr zzrVar, zzae zzaeVar) {
        super(context);
        this.zzb = zzaeVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zzb();
        int zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zzrVar.zza);
        zzay.zzb();
        int zzy2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, 0);
        zzay.zzb();
        int zzy3 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zzrVar.zzb);
        zzay.zzb();
        imageButton.setPadding(zzy, zzy2, zzy3, com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zzrVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zzb();
        int zzy4 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zzrVar.zzd + zzrVar.zza + zzrVar.zzb);
        zzay.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(zzy4, com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zzrVar.zzd + zzrVar.zzc), 17));
        long longValue = ((Long) zzba.zzc().zza(zzbdz.zzbc)).longValue();
        if (longValue <= 0) {
            return;
        }
        zzq zzqVar = ((Boolean) zzba.zzc().zza(zzbdz.zzbd)).booleanValue() ? new zzq(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzqVar);
    }

    private final void zzc() {
        String str = (String) zzba.zzc().zza(zzbdz.zzbb);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.zza.setImageResource(17301527);
            return;
        }
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        if (zze != null) {
            Drawable drawable = null;
            try {
                if ("white".equals(str)) {
                    drawable = zze.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                } else if ("black".equals(str)) {
                    drawable = zze.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                }
            } catch (Resources.NotFoundException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Close button resource not found, falling back to default.");
            }
            if (drawable == null) {
                this.zza.setImageResource(17301527);
                return;
            }
            this.zza.setImageDrawable(drawable);
            this.zza.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        this.zza.setImageResource(17301527);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzae zzaeVar = this.zzb;
        if (zzaeVar != null) {
            zzaeVar.zzj();
        }
    }

    public final void zzb(boolean z) {
        if (z) {
            this.zza.setVisibility(8);
            if (((Long) zzba.zzc().zza(zzbdz.zzbc)).longValue() > 0) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
                return;
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}
