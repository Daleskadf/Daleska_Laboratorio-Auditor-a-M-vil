package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzql;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DebugKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzkt extends zznd {
    private static String zza(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.zznd
    protected final boolean zzc() {
        return false;
    }

    public zzkt(zzni zzniVar) {
        super(zzniVar);
    }

    public final byte[] zza(zzbd zzbdVar, String str) {
        zznv zznvVar;
        Bundle bundle;
        zzfu.zzj.zza zzaVar;
        zzfu.zzi.zzb zzbVar;
        zzg zzgVar;
        byte[] bArr;
        long j;
        zzaz zza;
        zzt();
        this.zzu.zzy();
        Preconditions.checkNotNull(zzbdVar);
        Preconditions.checkNotEmpty(str);
        if (!zze().zze(str, zzbf.zzbf)) {
            zzj().zzc().zza("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if (!"_iap".equals(zzbdVar.zza) && !"_iapx".equals(zzbdVar.zza)) {
            zzj().zzc().zza("Generating a payload for this event is not available. package_name, event_name", str, zzbdVar.zza);
            return null;
        } else {
            zzfu.zzi.zzb zzb = zzfu.zzi.zzb();
            zzh().zzp();
            try {
                zzg zze = zzh().zze(str);
                if (zze == null) {
                    zzj().zzc().zza("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!zze.zzar()) {
                    zzj().zzc().zza("Log and bundle disabled. package_name", str);
                    return new byte[0];
                } else {
                    zzfu.zzj.zza zzp = zzfu.zzj.zzv().zzh(1).zzp("android");
                    if (!TextUtils.isEmpty(zze.zzac())) {
                        zzp.zzb(zze.zzac());
                    }
                    if (!TextUtils.isEmpty(zze.zzae())) {
                        zzp.zzd((String) Preconditions.checkNotNull(zze.zzae()));
                    }
                    if (!TextUtils.isEmpty(zze.zzaf())) {
                        zzp.zze((String) Preconditions.checkNotNull(zze.zzaf()));
                    }
                    if (zze.zze() != -2147483648L) {
                        zzp.zze((int) zze.zze());
                    }
                    zzp.zzf(zze.zzq()).zzd(zze.zzo());
                    String zzah = zze.zzah();
                    String zzaa = zze.zzaa();
                    if (!TextUtils.isEmpty(zzah)) {
                        zzp.zzm(zzah);
                    } else if (!TextUtils.isEmpty(zzaa)) {
                        zzp.zza(zzaa);
                    }
                    zzp.zzj(zze.zzw());
                    zziq zzb2 = this.zzf.zzb(str);
                    zzp.zzc(zze.zzn());
                    if (this.zzu.zzac() && zze().zzk(zzp.zzt()) && zzb2.zzi() && !TextUtils.isEmpty(null)) {
                        zzp.zzj((String) null);
                    }
                    zzp.zzg(zzb2.zzg());
                    if (zzb2.zzi() && zze.zzaq()) {
                        Pair<String, Boolean> zza2 = zzn().zza(zze.zzac(), zzb2);
                        if (zze.zzaq() && zza2 != null && !TextUtils.isEmpty((CharSequence) zza2.first)) {
                            zzp.zzq(zza((String) zza2.first, Long.toString(zzbdVar.zzd)));
                            if (zza2.second != null) {
                                zzp.zzc(((Boolean) zza2.second).booleanValue());
                            }
                        }
                    }
                    zzf().zzac();
                    zzfu.zzj.zza zzi = zzp.zzi(Build.MODEL);
                    zzf().zzac();
                    zzi.zzo(Build.VERSION.RELEASE).zzj((int) zzf().zzg()).zzs(zzf().zzh());
                    if (zzb2.zzj() && zze.zzad() != null) {
                        zzp.zzc(zza((String) Preconditions.checkNotNull(zze.zzad()), Long.toString(zzbdVar.zzd)));
                    }
                    if (!TextUtils.isEmpty(zze.zzag())) {
                        zzp.zzl((String) Preconditions.checkNotNull(zze.zzag()));
                    }
                    String zzac = zze.zzac();
                    List<zznv> zzk = zzh().zzk(zzac);
                    Iterator<zznv> it = zzk.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zznvVar = null;
                            break;
                        }
                        zznvVar = it.next();
                        if ("_lte".equals(zznvVar.zzc)) {
                            break;
                        }
                    }
                    if (zznvVar == null || zznvVar.zze == null) {
                        zznv zznvVar2 = new zznv(zzac, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzb().currentTimeMillis(), 0L);
                        zzk.add(zznvVar2);
                        zzh().zza(zznvVar2);
                    }
                    zzfu.zzn[] zznVarArr = new zzfu.zzn[zzk.size()];
                    for (int i = 0; i < zzk.size(); i++) {
                        zzfu.zzn.zza zzb3 = zzfu.zzn.zze().zza(zzk.get(i).zzc).zzb(zzk.get(i).zzd);
                        g_().zza(zzb3, zzk.get(i).zze);
                        zznVarArr[i] = (zzfu.zzn) ((com.google.android.gms.internal.measurement.zzjv) zzb3.zzah());
                    }
                    zzp.zze(Arrays.asList(zznVarArr));
                    g_().zza(zzp);
                    this.zzf.zza(zze, zzp);
                    zzgd zza3 = zzgd.zza(zzbdVar);
                    zzq().zza(zza3.zzb, zzh().zzd(str));
                    zzq().zza(zza3, zze().zzb(str));
                    Bundle bundle2 = zza3.zzb;
                    bundle2.putLong("_c", 1L);
                    zzj().zzc().zza("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", zzbdVar.zzc);
                    if (zzq().zzd(zzp.zzt(), zze.zzam())) {
                        zzq().zza(bundle2, "_dbg", (Object) 1L);
                        zzq().zza(bundle2, "_r", (Object) 1L);
                    }
                    zzaz zzd = zzh().zzd(str, zzbdVar.zza);
                    if (zzd == null) {
                        bundle = bundle2;
                        zzaVar = zzp;
                        zzbVar = zzb;
                        zzgVar = zze;
                        bArr = null;
                        zza = new zzaz(str, zzbdVar.zza, 0L, 0L, zzbdVar.zzd, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        bundle = bundle2;
                        zzaVar = zzp;
                        zzbVar = zzb;
                        zzgVar = zze;
                        bArr = null;
                        j = zzd.zzf;
                        zza = zzd.zza(zzbdVar.zzd);
                    }
                    zzh().zza(zza);
                    zzba zzbaVar = new zzba(this.zzu, zzbdVar.zzc, str, zzbdVar.zza, zzbdVar.zzd, j, bundle);
                    zzfu.zze.zza zza4 = zzfu.zze.zze().zzb(zzbaVar.zzc).zza(zzbaVar.zzb).zza(zzbaVar.zzd);
                    Iterator<String> it2 = zzbaVar.zze.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        zzfu.zzg.zza zza5 = zzfu.zzg.zze().zza(next);
                        Object zzc = zzbaVar.zze.zzc(next);
                        if (zzc != null) {
                            g_().zza(zza5, zzc);
                            zza4.zza(zza5);
                        }
                    }
                    zzfu.zzj.zza zzaVar2 = zzaVar;
                    zzaVar2.zza(zza4).zza(zzfu.zzk.zza().zza(zzfu.zzf.zza().zza(zza.zzc).zza(zzbdVar.zza)));
                    zzaVar2.zza(zzg().zza(zzgVar.zzac(), Collections.emptyList(), zzaVar2.zzab(), Long.valueOf(zza4.zzc()), Long.valueOf(zza4.zzc())));
                    if (zza4.zzg()) {
                        zzaVar2.zzi(zza4.zzc()).zze(zza4.zzc());
                    }
                    long zzs = zzgVar.zzs();
                    int i2 = (zzs > 0L ? 1 : (zzs == 0L ? 0 : -1));
                    if (i2 != 0) {
                        zzaVar2.zzg(zzs);
                    }
                    long zzu = zzgVar.zzu();
                    if (zzu != 0) {
                        zzaVar2.zzh(zzu);
                    } else if (i2 != 0) {
                        zzaVar2.zzh(zzs);
                    }
                    String zzal = zzgVar.zzal();
                    if (zzql.zza() && zze().zze(str, zzbf.zzbs) && zzal != null) {
                        zzaVar2.zzr(zzal);
                    }
                    zzgVar.zzap();
                    zzfu.zzj.zza zzk2 = zzaVar2.zzf((int) zzgVar.zzt()).zzl(92000L).zzk(zzb().currentTimeMillis());
                    Boolean bool = Boolean.TRUE;
                    zzk2.zzd(true);
                    if (zze().zza(zzbf.zzbx)) {
                        this.zzf.zza(zzaVar2.zzt(), zzaVar2);
                    }
                    zzfu.zzi.zzb zzbVar2 = zzbVar;
                    zzbVar2.zza(zzaVar2);
                    zzg zzgVar2 = zzgVar;
                    zzgVar2.zzr(zzaVar2.zzf());
                    zzgVar2.zzp(zzaVar2.zze());
                    zzh().zza(zzgVar2, false, false);
                    zzh().zzw();
                    try {
                        return g_().zzb(((zzfu.zzi) ((com.google.android.gms.internal.measurement.zzjv) zzbVar2.zzah())).zzbx());
                    } catch (IOException e) {
                        zzj().zzg().zza("Data loss. Failed to bundle and serialize. appId", zzfz.zza(str), e);
                        return bArr;
                    }
                }
            } catch (SecurityException e2) {
                zzj().zzc().zza("app instance id encryption failed", e2.getMessage());
                return new byte[0];
            } catch (SecurityException e3) {
                zzj().zzc().zza("Resettable device id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                zzh().zzu();
            }
        }
    }
}
