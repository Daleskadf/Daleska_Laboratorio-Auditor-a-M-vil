package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zziq;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.checkerframework.dataflow.qual.Pure;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zznr extends zznd {
    @Override // com.google.android.gms.measurement.internal.zznd
    protected final boolean zzc() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzfu.zzj.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i = 0; i < zzaVar.zzd(); i++) {
            if (str.equals(zzaVar.zzk(i).zzg())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zza(str.getBytes(Charset.forName("UTF-8")));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzq().zzt();
        MessageDigest zzu = zzny.zzu();
        if (zzu == null) {
            zzj().zzg().zza("Failed to get MD5");
            return 0L;
        }
        return zzny.zza(zzu.digest(bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    private static Bundle zzb(List<zzfu.zzg> list) {
        Bundle bundle = new Bundle();
        for (zzfu.zzg zzgVar : list) {
            String zzg = zzgVar.zzg();
            if (zzgVar.zzj()) {
                bundle.putString(zzg, String.valueOf(zzgVar.zza()));
            } else if (zzgVar.zzk()) {
                bundle.putString(zzg, String.valueOf(zzgVar.zzb()));
            } else if (zzgVar.zzn()) {
                bundle.putString(zzg, zzgVar.zzh());
            } else if (zzgVar.zzl()) {
                bundle.putString(zzg, String.valueOf(zzgVar.zzd()));
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle zza(List<zzfu.zzg> list) {
        Bundle bundle = new Bundle();
        for (zzfu.zzg zzgVar : list) {
            String zzg = zzgVar.zzg();
            if (zzgVar.zzj()) {
                bundle.putDouble(zzg, zzgVar.zza());
            } else if (zzgVar.zzk()) {
                bundle.putFloat(zzg, zzgVar.zzb());
            } else if (zzgVar.zzn()) {
                bundle.putString(zzg, zzgVar.zzh());
            } else if (zzgVar.zzl()) {
                bundle.putLong(zzg, zzgVar.zzd());
            }
        }
        return bundle;
    }

    private final Bundle zza(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(zza((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    private static Bundle zzc(List<zzfu.zzn> list) {
        Bundle bundle = new Bundle();
        for (zzfu.zzn zznVar : list) {
            String zzg = zznVar.zzg();
            if (zznVar.zzi()) {
                bundle.putString(zzg, String.valueOf(zznVar.zza()));
            } else if (zznVar.zzj()) {
                bundle.putString(zzg, String.valueOf(zznVar.zzb()));
            } else if (zznVar.zzm()) {
                bundle.putString(zzg, zznVar.zzh());
            } else if (zznVar.zzk()) {
                bundle.putString(zzg, String.valueOf(zznVar.zzc()));
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends Parcelable> T zza(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzj().zzg().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbd zza(com.google.android.gms.internal.measurement.zzad zzadVar) {
        Object obj;
        Bundle zza = zza(zzadVar.zzc(), true);
        String obj2 = (!zza.containsKey("_o") || (obj = zza.get("_o")) == null) ? "app" : obj.toString();
        String zzb = zziu.zzb(zzadVar.zzb());
        if (zzb == null) {
            zzb = zzadVar.zzb();
        }
        return new zzbd(zzb, new zzbc(zza), obj2, zzadVar.zza());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzna zza(java.lang.String r9, com.google.android.gms.internal.measurement.zzfu.zzj.zza r10, com.google.android.gms.internal.measurement.zzfu.zze.zza r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznr.zza(java.lang.String, com.google.android.gms.internal.measurement.zzfu$zzj$zza, com.google.android.gms.internal.measurement.zzfu$zze$zza, java.lang.String):com.google.android.gms.measurement.internal.zzna");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzna zza(java.lang.String r9, com.google.android.gms.internal.measurement.zzfu.zzj r10, com.google.android.gms.internal.measurement.zzfu.zze.zza r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznr.zza(java.lang.String, com.google.android.gms.internal.measurement.zzfu$zzj, com.google.android.gms.internal.measurement.zzfu$zze$zza, java.lang.String):com.google.android.gms.measurement.internal.zzna");
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
    public final zzfu.zze zza(zzba zzbaVar) {
        zzfu.zze.zza zza = zzfu.zze.zze().zza(zzbaVar.zzd);
        Iterator<String> it = zzbaVar.zze.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfu.zzg.zza zza2 = zzfu.zzg.zze().zza(next);
            Object zzc = zzbaVar.zze.zzc(next);
            Preconditions.checkNotNull(zzc);
            zza(zza2, zzc);
            zza.zza(zza2);
        }
        return (zzfu.zze) ((com.google.android.gms.internal.measurement.zzjv) zza.zzah());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfu.zzg zza(zzfu.zze zzeVar, String str) {
        for (zzfu.zzg zzgVar : zzeVar.zzh()) {
            if (zzgVar.zzg().equals(str)) {
                return zzgVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <BuilderT extends com.google.android.gms.internal.measurement.zzlh> BuilderT zza(BuilderT buildert, byte[] bArr) throws com.google.android.gms.internal.measurement.zzkd {
        com.google.android.gms.internal.measurement.zzji zza = com.google.android.gms.internal.measurement.zzji.zza();
        if (zza != null) {
            return (BuilderT) buildert.zza(bArr, zza);
        }
        return (BuilderT) buildert.zza(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzb(zzfu.zze zzeVar, String str) {
        zzfu.zzg zza = zza(zzeVar, str);
        if (zza != null) {
            if (zza.zzn()) {
                return zza.zzh();
            }
            if (zza.zzl()) {
                return Long.valueOf(zza.zzd());
            }
            if (zza.zzj()) {
                return Double.valueOf(zza.zza());
            }
            if (zza.zzc() > 0) {
                List<zzfu.zzg> zzi = zza.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzfu.zzg zzgVar : zzi) {
                    if (zzgVar != null) {
                        Bundle bundle = new Bundle();
                        for (zzfu.zzg zzgVar2 : zzgVar.zzi()) {
                            if (zzgVar2.zzn()) {
                                bundle.putString(zzgVar2.zzg(), zzgVar2.zzh());
                            } else if (zzgVar2.zzl()) {
                                bundle.putLong(zzgVar2.zzg(), zzgVar2.zzd());
                            } else if (zzgVar2.zzj()) {
                                bundle.putDouble(zzgVar2.zzg(), zzgVar2.zza());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzfu.zzi zziVar) {
        zzfu.zzb zzu;
        if (zziVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (zzqr.zza() && zze().zza(zzbf.zzbt) && zziVar.zza() > 0) {
            zzq();
            if (zzny.zzf(zziVar.zza(0).zzy()) && zziVar.zzf()) {
                zza(sb, 0, "UploadSubdomain", zziVar.zzd());
            }
        }
        for (zzfu.zzj zzjVar : zziVar.zze()) {
            if (zzjVar != null) {
                zza(sb, 1);
                sb.append("bundle {\n");
                if (zzjVar.zzbm()) {
                    zza(sb, 1, "protocol_version", Integer.valueOf(zzjVar.zzf()));
                }
                if (zzql.zza() && zze().zze(zzjVar.zzy(), zzbf.zzbs) && zzjVar.zzbp()) {
                    zza(sb, 1, "session_stitching_token", zzjVar.zzan());
                }
                zza(sb, 1, "platform", zzjVar.zzal());
                if (zzjVar.zzbh()) {
                    zza(sb, 1, "gmp_version", Long.valueOf(zzjVar.zzn()));
                }
                if (zzjVar.zzbu()) {
                    zza(sb, 1, "uploading_gmp_version", Long.valueOf(zzjVar.zzt()));
                }
                if (zzjVar.zzbf()) {
                    zza(sb, 1, "dynamite_version", Long.valueOf(zzjVar.zzl()));
                }
                if (zzjVar.zzaz()) {
                    zza(sb, 1, "config_version", Long.valueOf(zzjVar.zzj()));
                }
                zza(sb, 1, "gmp_app_id", zzjVar.zzai());
                zza(sb, 1, "admob_app_id", zzjVar.zzx());
                zza(sb, 1, "app_id", zzjVar.zzy());
                zza(sb, 1, "app_version", zzjVar.zzab());
                if (zzjVar.zzaw()) {
                    zza(sb, 1, "app_version_major", Integer.valueOf(zzjVar.zzb()));
                }
                zza(sb, 1, "firebase_instance_id", zzjVar.zzah());
                if (zzjVar.zzbe()) {
                    zza(sb, 1, "dev_cert_hash", Long.valueOf(zzjVar.zzk()));
                }
                zza(sb, 1, "app_store", zzjVar.zzaa());
                if (zzjVar.zzbt()) {
                    zza(sb, 1, "upload_timestamp_millis", Long.valueOf(zzjVar.zzs()));
                }
                if (zzjVar.zzbq()) {
                    zza(sb, 1, "start_timestamp_millis", Long.valueOf(zzjVar.zzq()));
                }
                if (zzjVar.zzbg()) {
                    zza(sb, 1, "end_timestamp_millis", Long.valueOf(zzjVar.zzm()));
                }
                if (zzjVar.zzbl()) {
                    zza(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzjVar.zzp()));
                }
                if (zzjVar.zzbk()) {
                    zza(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzjVar.zzo()));
                }
                zza(sb, 1, "app_instance_id", zzjVar.zzz());
                zza(sb, 1, "resettable_device_id", zzjVar.zzam());
                zza(sb, 1, "ds_id", zzjVar.zzag());
                if (zzjVar.zzbj()) {
                    zza(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzjVar.zzau()));
                }
                zza(sb, 1, "os_version", zzjVar.zzak());
                zza(sb, 1, "device_model", zzjVar.zzaf());
                zza(sb, 1, "user_default_language", zzjVar.zzao());
                if (zzjVar.zzbs()) {
                    zza(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzjVar.zzh()));
                }
                if (zzjVar.zzay()) {
                    zza(sb, 1, "bundle_sequential_index", Integer.valueOf(zzjVar.zzc()));
                }
                if (zzqr.zza()) {
                    zzq();
                    if (zzny.zzf(zzjVar.zzy()) && zze().zza(zzbf.zzbt) && zzjVar.zzbd()) {
                        zza(sb, 1, "delivery_index", Integer.valueOf(zzjVar.zzd()));
                    }
                }
                if (zzjVar.zzbo()) {
                    zza(sb, 1, "service_upload", Boolean.valueOf(zzjVar.zzav()));
                }
                zza(sb, 1, "health_monitor", zzjVar.h_());
                if (zzjVar.zzbn()) {
                    zza(sb, 1, "retry_counter", Integer.valueOf(zzjVar.zzg()));
                }
                if (zzjVar.zzbb()) {
                    zza(sb, 1, "consent_signals", zzjVar.zzad());
                }
                if (zzjVar.zzbi()) {
                    zza(sb, 1, "is_dma_region", Boolean.valueOf(zzjVar.zzat()));
                }
                if (zzjVar.zzbc()) {
                    zza(sb, 1, "core_platform_services", zzjVar.zzae());
                }
                if (zzjVar.zzba()) {
                    zza(sb, 1, "consent_diagnostics", zzjVar.zzac());
                }
                if (zzjVar.zzbr()) {
                    zza(sb, 1, "target_os_version", Long.valueOf(zzjVar.zzr()));
                }
                if (zzpz.zza() && zze().zze(zzjVar.zzy(), zzbf.zzce)) {
                    zza(sb, 1, "ad_services_version", Integer.valueOf(zzjVar.zza()));
                    if (zzjVar.zzax() && (zzu = zzjVar.zzu()) != null) {
                        zza(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        zza(sb, 2, "eligible", Boolean.valueOf(zzu.zzf()));
                        zza(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzu.zzh()));
                        zza(sb, 2, "pre_r", Boolean.valueOf(zzu.zzi()));
                        zza(sb, 2, "r_extensions_too_old", Boolean.valueOf(zzu.zzj()));
                        zza(sb, 2, "adservices_extension_too_old", Boolean.valueOf(zzu.zze()));
                        zza(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(zzu.zzd()));
                        zza(sb, 2, "measurement_manager_disabled", Boolean.valueOf(zzu.zzg()));
                        zza(sb, 2);
                        sb.append("}\n");
                    }
                }
                List<zzfu.zzn> zzar = zzjVar.zzar();
                if (zzar != null) {
                    for (zzfu.zzn zznVar : zzar) {
                        if (zznVar != null) {
                            zza(sb, 2);
                            sb.append("user_property {\n");
                            zza(sb, 2, "set_timestamp_millis", zznVar.zzl() ? Long.valueOf(zznVar.zzd()) : null);
                            zza(sb, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzi().zzc(zznVar.zzg()));
                            zza(sb, 2, "string_value", zznVar.zzh());
                            zza(sb, 2, "int_value", zznVar.zzk() ? Long.valueOf(zznVar.zzc()) : null);
                            zza(sb, 2, "double_value", zznVar.zzi() ? Double.valueOf(zznVar.zza()) : null);
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfu.zzc> zzap = zzjVar.zzap();
                zzjVar.zzy();
                if (zzap != null) {
                    for (zzfu.zzc zzcVar : zzap) {
                        if (zzcVar != null) {
                            zza(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzcVar.zzg()) {
                                zza(sb, 2, "audience_id", Integer.valueOf(zzcVar.zza()));
                            }
                            if (zzcVar.zzh()) {
                                zza(sb, 2, "new_audience", Boolean.valueOf(zzcVar.zzf()));
                            }
                            zza(sb, 2, "current_data", zzcVar.zzd());
                            if (zzcVar.zzi()) {
                                zza(sb, 2, "previous_data", zzcVar.zze());
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfu.zze> zzaq = zzjVar.zzaq();
                if (zzaq != null) {
                    for (zzfu.zze zzeVar : zzaq) {
                        if (zzeVar != null) {
                            zza(sb, 2);
                            sb.append("event {\n");
                            zza(sb, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzi().zza(zzeVar.zzg()));
                            if (zzeVar.zzk()) {
                                zza(sb, 2, "timestamp_millis", Long.valueOf(zzeVar.zzd()));
                            }
                            if (zzeVar.zzj()) {
                                zza(sb, 2, "previous_timestamp_millis", Long.valueOf(zzeVar.zzc()));
                            }
                            if (zzeVar.zzi()) {
                                zza(sb, 2, "count", Integer.valueOf(zzeVar.zza()));
                            }
                            if (zzeVar.zzb() != 0) {
                                zza(sb, 2, zzeVar.zzh());
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zza(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzfi.zzb zzbVar) {
        if (zzbVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzbVar.zzl()) {
            zza(sb, 0, "filter_id", Integer.valueOf(zzbVar.zzb()));
        }
        zza(sb, 0, "event_name", zzi().zza(zzbVar.zzf()));
        String zza = zza(zzbVar.zzh(), zzbVar.zzi(), zzbVar.zzj());
        if (!zza.isEmpty()) {
            zza(sb, 0, "filter_type", zza);
        }
        if (zzbVar.zzk()) {
            zza(sb, 1, "event_count_filter", zzbVar.zze());
        }
        if (zzbVar.zza() > 0) {
            sb.append("  filters {\n");
            for (zzfi.zzc zzcVar : zzbVar.zzg()) {
                zza(sb, 2, zzcVar);
            }
        }
        zza(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    private static String zza(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzfi.zze zzeVar) {
        if (zzeVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzeVar.zzi()) {
            zza(sb, 0, "filter_id", Integer.valueOf(zzeVar.zza()));
        }
        zza(sb, 0, "property_name", zzi().zzc(zzeVar.zze()));
        String zza = zza(zzeVar.zzf(), zzeVar.zzg(), zzeVar.zzh());
        if (!zza.isEmpty()) {
            zza(sb, 0, "filter_type", zza);
        }
        zza(sb, 1, zzeVar.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Long> zza(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().zzu().zza("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().zzu().zza("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Integer> zzu() {
        Map<String, String> zza = zzbf.zza(this.zzf.zza());
        if (zza == null || zza.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = zzbf.zzap.zza(null).intValue();
        for (Map.Entry<String, String> entry : zza.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().zzu().zza("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    zzj().zzu().zza("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Long> zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, Object> zza(Bundle bundle, boolean z) {
        Parcelable[] parcelableArr;
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zza((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zza((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zza((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznr(zzni zzniVar) {
        super(zzniVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzfu.zze.zza zzaVar, String str, Object obj) {
        List<zzfu.zzg> zzf = zzaVar.zzf();
        int i = 0;
        while (true) {
            if (i >= zzf.size()) {
                i = -1;
                break;
            } else if (str.equals(zzf.get(i).zzg())) {
                break;
            } else {
                i++;
            }
        }
        zzfu.zzg.zza zza = zzfu.zzg.zze().zza(str);
        if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            zzaVar.zza(i, zza);
        } else {
            zzaVar.zza(zza);
        }
    }

    private static void zza(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                zza(builder, str3, string, set);
            }
        }
    }

    private static void zza(StringBuilder sb, int i, String str, zzfu.zzl zzlVar) {
        if (zzlVar == null) {
            return;
        }
        zza(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzlVar.zzb() != 0) {
            zza(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : zzlVar.zzi()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zzlVar.zzd() != 0) {
            zza(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : zzlVar.zzk()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zzlVar.zza() != 0) {
            zza(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (zzfu.zzd zzdVar : zzlVar.zzh()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(zzdVar.zzf() ? Integer.valueOf(zzdVar.zza()) : null);
                sb.append(":");
                sb.append(zzdVar.zze() ? Long.valueOf(zzdVar.zzb()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zzlVar.zzc() != 0) {
            zza(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (zzfu.zzm zzmVar : zzlVar.zzj()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(zzmVar.zzf() ? Integer.valueOf(zzmVar.zzb()) : null);
                sb.append(": [");
                int i10 = 0;
                for (Long l3 : zzmVar.zze()) {
                    long longValue = l3.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        zza(sb, 3);
        sb.append("}\n");
    }

    private final void zza(StringBuilder sb, int i, List<zzfu.zzg> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (zzfu.zzg zzgVar : list) {
            if (zzgVar != null) {
                zza(sb, i2);
                sb.append("param {\n");
                zza(sb, i2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzgVar.zzm() ? zzi().zzb(zzgVar.zzg()) : null);
                zza(sb, i2, "string_value", zzgVar.zzn() ? zzgVar.zzh() : null);
                zza(sb, i2, "int_value", zzgVar.zzl() ? Long.valueOf(zzgVar.zzd()) : null);
                zza(sb, i2, "double_value", zzgVar.zzj() ? Double.valueOf(zzgVar.zza()) : null);
                if (zzgVar.zzc() > 0) {
                    zza(sb, i2, zzgVar.zzi());
                }
                zza(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private final void zza(StringBuilder sb, int i, zzfi.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        zza(sb, i);
        sb.append("filter {\n");
        if (zzcVar.zzg()) {
            zza(sb, i, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            zza(sb, i, "param_name", zzi().zzb(zzcVar.zze()));
        }
        if (zzcVar.zzj()) {
            int i2 = i + 1;
            zzfi.zzf zzd = zzcVar.zzd();
            if (zzd != null) {
                zza(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (zzd.zzj()) {
                    zza(sb, i2, "match_type", zzd.zzb().name());
                }
                if (zzd.zzi()) {
                    zza(sb, i2, "expression", zzd.zze());
                }
                if (zzd.zzh()) {
                    zza(sb, i2, "case_sensitive", Boolean.valueOf(zzd.zzg()));
                }
                if (zzd.zza() > 0) {
                    zza(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str : zzd.zzf()) {
                        zza(sb, i2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zza(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzcVar.zzh()) {
            zza(sb, i + 1, "number_filter", zzcVar.zzc());
        }
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void zza(StringBuilder sb, int i, String str, zzfi.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        zza(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzdVar.zzh()) {
            zza(sb, i, "comparison_type", zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            zza(sb, i, "match_as_float", Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            zza(sb, i, "comparison_value", zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            zza(sb, i, "min_comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            zza(sb, i, "max_comparison_value", zzdVar.zze());
        }
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzfu.zzj.zza zzaVar) {
        zzj().zzp().zza("Checking account type status for ad personalization signals");
        if (zzc(zzaVar.zzt())) {
            zzj().zzc().zza("Turning off ad personalization due to account type");
            zzfu.zzn zznVar = (zzfu.zzn) ((com.google.android.gms.internal.measurement.zzjv) zzfu.zzn.zze().zza("_npa").zzb(zzf().zzc()).zza(1L).zzah());
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= zzaVar.zzd()) {
                    break;
                } else if ("_npa".equals(zzaVar.zzk(i).zzg())) {
                    zzaVar.zza(i, zznVar);
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                zzaVar.zza(zznVar);
            }
            zzah zza = zzah.zza(zzaVar.zzv());
            zza.zza(zziq.zza.AD_PERSONALIZATION, zzak.CHILD_ACCOUNT);
            zzaVar.zzf(zza.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzfu.zzg.zza zzaVar, Object obj) {
        Bundle[] bundleArr;
        Preconditions.checkNotNull(obj);
        zzaVar.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
        } else if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfu.zzg.zza zze = zzfu.zzg.zze();
                    for (String str : bundle.keySet()) {
                        zzfu.zzg.zza zza = zzfu.zzg.zze().zza(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zza.zza(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zza.zzb((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zza.zza(((Double) obj2).doubleValue());
                        }
                        zze.zza(zza);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzfu.zzg) ((com.google.android.gms.internal.measurement.zzjv) zze.zzah()));
                    }
                }
            }
            zzaVar.zza(arrayList);
        } else {
            zzj().zzg().zza("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzfu.zzn.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zzc().zzb().zza();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
        } else if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            zzj().zzg().zza("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(zzbd zzbdVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbdVar);
        Preconditions.checkNotNull(zzoVar);
        return (TextUtils.isEmpty(zzoVar.zzb) && TextUtils.isEmpty(zzoVar.zzp)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzb().currentTimeMillis() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc(String str) {
        if (zzok.zza() && zze().zza(zzbf.zzcv)) {
            return false;
        }
        Preconditions.checkNotNull(str);
        zzg zze = zzh().zze(str);
        return zze != null && zzf().zzn() && zze.zzaq() && zzm().zzk(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzb(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzj().zzg().zza("Failed to gzip content", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzc(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            zzj().zzg().zza("Failed to ungzip content", e);
            throw e;
        }
    }
}
