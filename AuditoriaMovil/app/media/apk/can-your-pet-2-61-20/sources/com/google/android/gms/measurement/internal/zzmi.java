package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.dataflow.qual.Pure;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzmi extends zznd {
    public final zzgp zza;
    public final zzgp zzb;
    public final zzgp zzc;
    public final zzgp zzd;
    public final zzgp zze;
    private final Map<String, zzmh> zzg;

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zznd
    protected final boolean zzc() {
        return false;
    }

    @Deprecated
    private final Pair<String, Boolean> zza(String str) {
        zzmh zzmhVar;
        AdvertisingIdClient.Info info;
        zzt();
        long elapsedRealtime = zzb().elapsedRealtime();
        zzmh zzmhVar2 = this.zzg.get(str);
        if (zzmhVar2 != null && elapsedRealtime < zzmhVar2.zzc) {
            return new Pair<>(zzmhVar2.zza, Boolean.valueOf(zzmhVar2.zzb));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long zzd = zze().zzd(str) + elapsedRealtime;
        try {
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            } catch (PackageManager.NameNotFoundException unused) {
                if (zzmhVar2 != null && elapsedRealtime < zzmhVar2.zzc + zze().zzc(str, zzbf.zzb)) {
                    return new Pair<>(zzmhVar2.zza, Boolean.valueOf(zzmhVar2.zzb));
                }
                info = null;
            }
        } catch (Exception e) {
            zzj().zzc().zza("Unable to get advertising id", e);
            zzmhVar = new zzmh("", false, zzd);
        }
        if (info == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", false);
        }
        String id = info.getId();
        if (id != null) {
            zzmhVar = new zzmh(id, info.isLimitAdTrackingEnabled(), zzd);
        } else {
            zzmhVar = new zzmh("", info.isLimitAdTrackingEnabled(), zzd);
        }
        this.zzg.put(str, zzmhVar);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(zzmhVar.zza, Boolean.valueOf(zzmhVar.zzb));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair<String, Boolean> zza(String str, zziq zziqVar) {
        if (zziqVar.zzi()) {
            return zza(str);
        }
        return new Pair<>("", false);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final String zza(String str, boolean z) {
        zzt();
        String str2 = z ? (String) zza(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest zzu = zzny.zzu();
        if (zzu == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzu.digest(str2.getBytes())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmi(zzni zzniVar) {
        super(zzniVar);
        this.zzg = new HashMap();
        zzgo zzk = zzk();
        Objects.requireNonNull(zzk);
        this.zza = new zzgp(zzk, "last_delete_stale", 0L);
        zzgo zzk2 = zzk();
        Objects.requireNonNull(zzk2);
        this.zzb = new zzgp(zzk2, "backoff", 0L);
        zzgo zzk3 = zzk();
        Objects.requireNonNull(zzk3);
        this.zzc = new zzgp(zzk3, "last_upload", 0L);
        zzgo zzk4 = zzk();
        Objects.requireNonNull(zzk4);
        this.zzd = new zzgp(zzk4, "last_upload_attempt", 0L);
        zzgo zzk5 = zzk();
        Objects.requireNonNull(zzk5);
        this.zze = new zzgp(zzk5, "midnight_offset", 0L);
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
