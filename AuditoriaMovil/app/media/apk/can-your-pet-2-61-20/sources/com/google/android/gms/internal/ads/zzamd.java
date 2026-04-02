package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.distriqt.extension.inappbilling.controller.SubscriptionPhase;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzamd {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfzs zze = zzfzs.zzp(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, SubscriptionPhase.RECURRENCE_MODE_NONE);
    private static final zzfzs zzf = zzfzs.zzq("dot", "sesame", "circle");
    private static final zzfzs zzg = zzfzs.zzp("filled", "open");
    private static final zzfzs zzh = zzfzs.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzamd(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzamd zza(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String zza = zzfvx.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzfzs zzm = zzfzs.zzm(TextUtils.split(zza, zzd));
        String str2 = (String) zzfzt.zza(zzgbp.zzb(zzh, zzm), "outside");
        int hashCode = str2.hashCode();
        int i = -1;
        int i2 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str2.equals("outside")) {
                c = 1;
            }
            c = 65535;
        }
        int i3 = c != 0 ? c != 1 ? 1 : -2 : 2;
        zzgbo zzb = zzgbp.zzb(zze, zzm);
        if (!zzb.isEmpty()) {
            String str3 = (String) zzb.iterator().next();
            if (((str3.hashCode() == 3387192 && str3.equals(SubscriptionPhase.RECURRENCE_MODE_NONE)) ? (char) 0 : (char) 65535) == 0) {
                i = 0;
            }
        } else {
            zzgbo zzb2 = zzgbp.zzb(zzg, zzm);
            zzgbo zzb3 = zzgbp.zzb(zzf, zzm);
            if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                String str4 = (String) zzfzt.zza(zzb2, "filled");
                int i4 = ((str4.hashCode() == 3417674 && str4.equals("open")) ? (char) 0 : (char) 65535) != 0 ? 1 : 2;
                String str5 = (String) zzfzt.zza(zzb3, "circle");
                int hashCode2 = str5.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str5.equals("dot")) {
                        i = 0;
                    }
                } else if (str5.equals("sesame")) {
                    i = 1;
                }
                if (i == 0) {
                    i2 = i4;
                    i = 2;
                } else if (i != 1) {
                    i2 = i4;
                    i = 1;
                } else {
                    i = 3;
                    i2 = i4;
                }
            }
        }
        return new zzamd(i, i2, i3);
    }
}
