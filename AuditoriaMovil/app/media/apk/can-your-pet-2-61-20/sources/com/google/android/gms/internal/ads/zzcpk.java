package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcpk {
    zzbvu zza;
    zzbvu zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzegf zze;
    private final zzdrn zzf;
    private final zzgep zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpk(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzegf zzegfVar, zzdrn zzdrnVar, zzgep zzgepVar, zzgep zzgepVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzegfVar;
        this.zzf = zzdrnVar;
        this.zzg = zzgepVar;
        this.zzh = zzgepVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjV));
    }

    private final ListenableFuture zzk(final String str, @Nullable final InputEvent inputEvent, Random random) {
        if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjV)) || this.zzd.zzO()) {
            return zzgee.zzh(str);
        }
        final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjW), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
        if (inputEvent == null) {
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjX), "11");
            return zzgee.zzh(buildUpon.toString());
        }
        return zzgee.zzf(zzgee.zzn(zzgdv.zzu(this.zze.zza()), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcpe
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzcpk.this.zzd(buildUpon, str, inputEvent, (Integer) obj);
            }
        }, this.zzh), Throwable.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcpf
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzcpk.this.zze(buildUpon, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final ListenableFuture zzb(final String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzgee.zzh(str);
        }
        return zzgee.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcpb
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzcpk.this.zzc(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(String str, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpd
            @Override // java.lang.Runnable
            public final void run() {
                zzcpk.this.zzg(th);
            }
        });
        return zzgee.zzh(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjY), "1");
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjX), "12");
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjZ))) {
                buildUpon.authority((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzka));
            }
            return zzgee.zzn(zzgdv.zzu(this.zze.zzb(buildUpon.build(), inputEvent)), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzcpg
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    zzbdq zzbdqVar = zzbdz.zzjX;
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdqVar), "12");
                    return zzgee.zzh(builder2.toString());
                }
            }, this.zzh);
        }
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjX), "10");
        return zzgee.zzh(builder.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zze(Uri.Builder builder, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpc
            @Override // java.lang.Runnable
            public final void run() {
                zzcpk.this.zzh(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjX), "9");
        return zzgee.zzh(builder.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkc)).booleanValue()) {
            zzbvu zzc = zzbvs.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzg(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
            return;
        }
        zzbvu zza = zzbvs.zza(this.zzc);
        this.zza = zza;
        zza.zzg(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkc)).booleanValue()) {
            zzbvu zzc = zzbvs.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzg(th, "AttributionReporting");
            return;
        }
        zzbvu zza = zzbvs.zza(this.zzc);
        this.zza = zza;
        zza.zzg(th, "AttributionReportingSampled");
    }

    public final void zzi(String str, zzfmt zzfmtVar, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ListenableFuture zzk = zzk(str, this.zzf.zza(), random);
        zzbdq zzbdqVar = zzbdz.zzkb;
        zzgee.zzr(zzgee.zzo(zzk, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdqVar)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcpj(this, zzfmtVar, str), this.zzg);
    }
}
