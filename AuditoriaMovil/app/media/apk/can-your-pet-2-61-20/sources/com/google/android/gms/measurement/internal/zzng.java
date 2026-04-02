package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzqr;
import java.util.HashMap;
import org.checkerframework.dataflow.qual.Pure;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzng extends zzne {
    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Uri.Builder zza(String str) {
        String zzf = zzm().zzf(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(zze().zzd(str, zzbf.zzax));
        if (!TextUtils.isEmpty(zzf)) {
            String zzd = zze().zzd(str, zzbf.zzay);
            builder.authority(zzf + "." + zzd);
        } else {
            builder.authority(zze().zzd(str, zzbf.zzay));
        }
        builder.path(zze().zzd(str, zzbf.zzaz));
        return builder;
    }

    public final Pair<zznf, Boolean> zzb(String str) {
        zzg zze;
        boolean z = true;
        if (zzqr.zza() && zze().zza(zzbf.zzbt)) {
            zzq();
            if (zzny.zzf(str)) {
                zzj().zzp().zza("sgtm feature flag enabled.");
                zzg zze2 = zzh().zze(str);
                if (zze2 != null) {
                    String zzad = zze2.zzad();
                    zzfo.zzd zzc = zzm().zzc(str);
                    if (zzc == null || (zze = zzh().zze(str)) == null || ((!zzc.zzr() || zzc.zzh().zza() != 100) && !zzq().zzd(str, zze.zzam()) && (TextUtils.isEmpty(zzad) || zzad.hashCode() % 100 >= zzc.zzh().zza()))) {
                        z = false;
                    }
                    if (z) {
                        zznf zznfVar = null;
                        if (zze2.zzat()) {
                            zzj().zzp().zza("sgtm upload enabled in manifest.");
                            zzfo.zzd zzc2 = zzm().zzc(zze2.zzac());
                            if (zzc2 != null && zzc2.zzr()) {
                                String zze3 = zzc2.zzh().zze();
                                if (!TextUtils.isEmpty(zze3)) {
                                    String zzd = zzc2.zzh().zzd();
                                    zzj().zzp().zza("sgtm configured with upload_url, server_info", zze3, TextUtils.isEmpty(zzd) ? "Y" : "N");
                                    if (TextUtils.isEmpty(zzd)) {
                                        zznfVar = new zznf(zze3);
                                    } else {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("x-sgtm-server-info", zzd);
                                        if (!TextUtils.isEmpty(zze2.zzam())) {
                                            hashMap.put("x-gtm-server-preview", zze2.zzam());
                                        }
                                        zznfVar = new zznf(zze3, hashMap);
                                    }
                                }
                            }
                        }
                        if (zznfVar != null) {
                            return Pair.create(zznfVar, false);
                        }
                    } else {
                        return Pair.create(new zznf(zzc(str)), true);
                    }
                } else {
                    return Pair.create(new zznf(zzc(str)), true);
                }
            }
        }
        return Pair.create(new zznf(zzc(str)), true);
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzu zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzfy zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzfz zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzgz zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzhj zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzmi zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzng zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zznr g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzny zzq() {
        return super.zzq();
    }

    private final String zzc(String str) {
        String zzf = zzm().zzf(str);
        if (!TextUtils.isEmpty(zzf)) {
            Uri parse = Uri.parse(zzbf.zzq.zza(null));
            Uri.Builder buildUpon = parse.buildUpon();
            String authority = parse.getAuthority();
            buildUpon.authority(zzf + "." + authority);
            return buildUpon.build().toString();
        }
        return zzbf.zzq.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzng(zzni zzniVar) {
        super(zzniVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }
}
