package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzcdb extends FrameLayout implements zzccs {
    final zzcdp zza;
    private final zzcdn zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbeo zze;
    private final long zzf;
    private final zzcct zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcdb(Context context, zzcdn zzcdnVar, int i, boolean z, zzbeo zzbeoVar, zzcdm zzcdmVar) {
        super(context);
        zzcct zzccrVar;
        this.zzb = zzcdnVar;
        this.zze = zzbeoVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcdnVar.zzj());
        zzccu zzccuVar = zzcdnVar.zzj().zza;
        zzcdo zzcdoVar = new zzcdo(context, zzcdnVar.zzn(), zzcdnVar.zzdi(), zzbeoVar, zzcdnVar.zzk());
        if (i != 2) {
            zzccrVar = new zzccr(context, zzcdnVar, z, zzcdf.zza(zzcdnVar), zzcdmVar, new zzcdo(context, zzcdnVar.zzn(), zzcdnVar.zzdi(), zzbeoVar, zzcdnVar.zzk()));
        } else {
            zzccrVar = new zzcef(context, zzcdoVar, zzcdnVar, z, zzcdf.zza(zzcdnVar), zzcdmVar);
        }
        this.zzg = zzccrVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzccrVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzF)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzC)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzI)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzE)).booleanValue();
        this.zzk = booleanValue;
        if (zzbeoVar != null) {
            zzbeoVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcdp(this);
        zzccrVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcct zzcctVar = this.zzg;
            if (zzcctVar != null) {
                zzgep zzgepVar = zzcbr.zze;
                Objects.requireNonNull(zzcctVar);
                zzgepVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcct.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccx
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzq(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzccs
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcda(this, z));
    }

    public final void zzA(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzz(i);
    }

    public final void zzB(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzA(i);
    }

    public final void zzC(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzF)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzB(i);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzb.zze(f);
        zzcctVar.zzn();
    }

    public final void zzH(float f, float f2) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar != null) {
            zzcctVar.zzu(f, f2);
        }
    }

    public final void zzI() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzb.zzd(false);
        zzcctVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbS)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbS)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar != null && this.zzm == 0) {
            zzcct zzcctVar2 = this.zzg;
            zzK("canplaythrough", TypedValues.TransitionType.S_DURATION, String.valueOf(zzcctVar.zzc() / 1000.0f), "videoWidth", String.valueOf(zzcctVar2.zze()), "videoHeight", String.valueOf(zzcctVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccw
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccy(this));
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccz(this));
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            int max = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzH)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzH)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
        }
        if (elapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbeo zzbeoVar = this.zze;
            if (zzbeoVar != null) {
                zzbeoVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar != null) {
            return zzcctVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        TextView textView = new TextView(zzcctVar.getContext());
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        textView.setText(String.valueOf(zze == null ? "AdMob - " : zze.getString(R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcct zzcctVar = this.zzg;
        if (zzcctVar != null) {
            zzcctVar.zzt();
        }
        zzJ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(boolean z) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzn)) {
            this.zzg.zzC(this.zzn, this.zzo, num);
        } else {
            zzK("no_src", new String[0]);
        }
    }

    public final void zzs() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzb.zzd(true);
        zzcctVar.zzn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        long zza = zzcctVar.zza();
        if (this.zzl == zza || zza <= 0) {
            return;
        }
        float f = ((float) zza) / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = zza;
    }

    public final void zzu() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzo();
    }

    public final void zzv() {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzp();
    }

    public final void zzw(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzq(i);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzx(i);
    }

    public final void zzz(int i) {
        zzcct zzcctVar = this.zzg;
        if (zzcctVar == null) {
            return;
        }
        zzcctVar.zzy(i);
    }
}
