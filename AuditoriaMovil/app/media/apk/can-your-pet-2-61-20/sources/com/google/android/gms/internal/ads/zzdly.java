package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdly {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfgi zzc;
    private final zzdld zzd;
    private final zzdky zze;
    private final zzdmk zzf;
    private final zzdms zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbgt zzj;
    private final zzdkv zzk;

    public zzdly(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfgi zzfgiVar, zzdld zzdldVar, zzdky zzdkyVar, zzdmk zzdmkVar, zzdms zzdmsVar, Executor executor, Executor executor2, zzdkv zzdkvVar) {
        this.zzb = zzgVar;
        this.zzc = zzfgiVar;
        this.zzj = zzfgiVar.zzi;
        this.zzd = zzdldVar;
        this.zze = zzdkyVar;
        this.zzf = zzdmkVar;
        this.zzg = zzdmsVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdkvVar;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View zzg;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            zzg = this.zze.zzf();
        } else {
            zzg = this.zze.zzg();
        }
        if (zzg == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzg.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzg.getParent()).removeView(zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdL)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzg, layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdky zzdkyVar = this.zze;
        if (zzdkyVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdkyVar.zzc() == 2 || zzdkyVar.zzc() == 1) {
                this.zzb.zzH(this.zzc.zzf, String.valueOf(zzdkyVar.zzc()), z);
            } else if (zzdkyVar.zzc() == 6) {
                this.zzb.zzH(this.zzc.zzf, "2", z);
                this.zzb.zzH(this.zzc.zzf, "1", z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzdmu zzdmuVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbhb zza2;
        Drawable drawable;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzg = zzdmuVar.zzg(strArr[i]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdmuVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdky zzdkyVar = this.zze;
        if (zzdkyVar.zze() != null) {
            zzbgt zzbgtVar = this.zzj;
            view = zzdkyVar.zze();
            if (zzbgtVar != null && viewGroup == null) {
                zzh(layoutParams, zzbgtVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdkyVar.zzl() instanceof zzbgo) {
            zzbgo zzbgoVar = (zzbgo) zzdkyVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbgoVar.zzc());
                viewGroup = null;
            }
            View zzbgpVar = new zzbgp(context, zzbgoVar, layoutParams);
            zzbgpVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdJ));
            view = zzbgpVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdmuVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdmuVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdmuVar.zzq(zzdmuVar.zzk(), view, true);
        }
        zzfzn zzfznVar = zzdlu.zza;
        int size = zzfznVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdmuVar.zzg((String) zzfznVar.get(i2));
            i2++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlv
            @Override // java.lang.Runnable
            public final void run() {
                zzdly.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            zzdky zzdkyVar2 = this.zze;
            if (zzdkyVar2.zzs() != null) {
                zzdkyVar2.zzs().zzap(new zzdlx(zzdmuVar, viewGroup2));
            }
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjQ)).booleanValue() && zzi(viewGroup2, false)) {
            zzdky zzdkyVar3 = this.zze;
            if (zzdkyVar3.zzq() != null) {
                zzdkyVar3.zzq().zzap(new zzdlx(zzdmuVar, viewGroup2));
            }
        } else {
            viewGroup2.removeAllViews();
            View zzf = zzdmuVar.zzf();
            Context context2 = zzf != null ? zzf.getContext() : null;
            if (context2 == null || (zza2 = this.zzk.zza()) == null) {
                return;
            }
            try {
                IObjectWrapper zzi = zza2.zzi();
                if (zzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzj = zzdmuVar.zzj();
                if (zzj != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgl)).booleanValue()) {
                        imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj));
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                imageView.setScaleType(zza);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get main image drawable");
            }
        }
    }

    public final void zzc(zzdmu zzdmuVar) {
        if (zzdmuVar == null || this.zzf == null || zzdmuVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdmuVar.zzh().addView(this.zzf.zza());
        } catch (zzcgy e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdmu zzdmuVar) {
        if (zzdmuVar == null) {
            return;
        }
        Context context = zzdmuVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbz.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Activity context is needed for policy validator.");
            } else if (this.zzg == null || zzdmuVar.zzh() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.zzg.zza(zzdmuVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbz.zzb());
                } catch (zzcgy e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
                }
            }
        }
    }

    public final void zze(final zzdmu zzdmuVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlw
            @Override // java.lang.Runnable
            public final void run() {
                zzdly.this.zzb(zzdmuVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        }
    }
}
