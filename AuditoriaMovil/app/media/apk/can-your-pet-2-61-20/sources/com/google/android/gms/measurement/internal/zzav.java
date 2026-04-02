package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.distriqt.core.auth.AuthorisationStatus;
import com.google.android.gms.measurement.internal.zziq;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzav {
    public static final zzav zza = new zzav(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zziq.zza, zzit> zzf;

    public final int zza() {
        return this.zzb;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.zzd;
        if (bool == null) {
            i = 3;
        } else {
            i = bool == Boolean.TRUE ? 7 : 13;
        }
        String str = this.zze;
        return this.zzc.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zziq.zza, zzit> entry : this.zzf.entrySet()) {
            String zzb = zziq.zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public static zzav zza(Bundle bundle, int i) {
        zziq.zza[] zza2;
        if (bundle == null) {
            return new zzav(null, i);
        }
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        for (zziq.zza zzaVar : zzis.DMA.zza()) {
            enumMap.put((EnumMap) zzaVar, (zziq.zza) zziq.zza(bundle.getString(zzaVar.zze)));
        }
        return new zzav(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzav zza(zzit zzitVar, int i) {
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        enumMap.put((EnumMap) zziq.zza.AD_USER_DATA, (zziq.zza) zzitVar);
        return new zzav(enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzav zza(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        zziq.zza[] zza2 = zzis.DMA.zza();
        int length = zza2.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) zza2[i2], (zziq.zza) zziq.zza(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new zzav(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public final zzit zzc() {
        zzit zzitVar = this.zzf.get(zziq.zza.AD_USER_DATA);
        return zzitVar == null ? zzit.UNINITIALIZED : zzitVar;
    }

    public static Boolean zza(Bundle bundle) {
        zzit zza2;
        if (bundle == null || (zza2 = zziq.zza(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = zzay.zza[zza2.ordinal()];
        if (i != 3) {
            return i != 4 ? null : true;
        }
        return false;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    private final String zzh() {
        zziq.zza[] zza2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zziq.zza zzaVar : zzis.DMA.zza()) {
            sb.append(":");
            sb.append(zziq.zza(this.zzf.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String toString() {
        zziq.zza[] zza2;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zziq.zza(this.zzb));
        for (zziq.zza zzaVar : zzis.DMA.zza()) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append("=");
            zzit zzitVar = this.zzf.get(zzaVar);
            if (zzitVar == null) {
                sb.append("uninitialized");
            } else {
                int i = zzay.zza[zzitVar.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("default");
                } else if (i == 3) {
                    sb.append(AuthorisationStatus.DENIED);
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        if (this.zzd != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.zze);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zziq.zza, zzit> enumMap = new EnumMap<>(zziq.zza.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap<zziq.zza, zzit>) zziq.zza.AD_USER_DATA, (zziq.zza) zziq.zza(bool));
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    private zzav(EnumMap<zziq.zza, zzit> enumMap, int i, Boolean bool, String str) {
        EnumMap<zziq.zza, zzit> enumMap2 = new EnumMap<>(zziq.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzav) {
            zzav zzavVar = (zzav) obj;
            if (this.zzc.equalsIgnoreCase(zzavVar.zzc) && Objects.equals(this.zzd, zzavVar.zzd)) {
                return Objects.equals(this.zze, zzavVar.zze);
            }
            return false;
        }
        return false;
    }

    public final boolean zzg() {
        for (zzit zzitVar : this.zzf.values()) {
            if (zzitVar != zzit.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }
}
