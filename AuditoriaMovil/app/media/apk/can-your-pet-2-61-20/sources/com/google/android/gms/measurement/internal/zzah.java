package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zziq;
import java.util.EnumMap;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzah {
    private final EnumMap<zziq.zza, zzak> zza;

    public final zzak zza(zziq.zza zzaVar) {
        zzak zzakVar = this.zza.get(zzaVar);
        return zzakVar == null ? zzak.UNSET : zzakVar;
    }

    public static zzah zza(String str) {
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        if (str.length() >= zziq.zza.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                zziq.zza[] values = zziq.zza.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((EnumMap) values[i], (zziq.zza) zzak.zza(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new zzah(enumMap);
            }
        }
        return new zzah();
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder("1");
        for (zziq.zza zzaVar : zziq.zza.values()) {
            zzak zzakVar = this.zza.get(zzaVar);
            if (zzakVar == null) {
                zzakVar = zzak.UNSET;
            }
            c = zzakVar.zzl;
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah() {
        this.zza = new EnumMap<>(zziq.zza.class);
    }

    private zzah(EnumMap<zziq.zza, zzak> enumMap) {
        EnumMap<zziq.zza, zzak> enumMap2 = new EnumMap<>(zziq.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public final void zza(zziq.zza zzaVar, int i) {
        zzak zzakVar = zzak.UNSET;
        if (i == -30) {
            zzakVar = zzak.TCF;
        } else {
            if (i != -20) {
                if (i == -10) {
                    zzakVar = zzak.MANIFEST;
                } else if (i != 0) {
                    if (i == 30) {
                        zzakVar = zzak.INITIALIZATION;
                    }
                }
            }
            zzakVar = zzak.API;
        }
        this.zza.put((EnumMap<zziq.zza, zzak>) zzaVar, (zziq.zza) zzakVar);
    }

    public final void zza(zziq.zza zzaVar, zzak zzakVar) {
        this.zza.put((EnumMap<zziq.zza, zzak>) zzaVar, (zziq.zza) zzakVar);
    }
}
