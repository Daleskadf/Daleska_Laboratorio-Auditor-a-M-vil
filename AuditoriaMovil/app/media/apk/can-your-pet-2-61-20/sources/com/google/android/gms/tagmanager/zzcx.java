package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzcx extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzN.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzr.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzbE.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.zzbI.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.zzaY.toString();

    public zzcx() {
        super(zza, zzb);
    }

    private static final void zzc(Set set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    private static final String zzd(String str, int i, Set set) {
        int i2 = i - 1;
        if (i2 == 1) {
            try {
                return zzfx.zza(str);
            } catch (UnsupportedEncodingException e) {
                Log.e("GoogleTagManager", "Joiner: unsupported encoding", e);
                return str;
            }
        } else if (i2 != 2) {
            return str;
        } else {
            String replace = str.replace("\\", "\\\\");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String ch = ((Character) it.next()).toString();
                replace = replace.replace(ch, "\\".concat(String.valueOf(ch)));
            }
            return replace;
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        int i;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar == null) {
            return zzfu.zza();
        }
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        String zzm = zzamVar2 != null ? zzfu.zzm(zzfu.zzk(zzamVar2)) : "";
        com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
        String zzm2 = zzamVar3 != null ? zzfu.zzm(zzfu.zzk(zzamVar3)) : "=";
        com.google.android.gms.internal.gtm.zzam zzamVar4 = (com.google.android.gms.internal.gtm.zzam) map.get(zze);
        HashSet hashSet = null;
        boolean z = true;
        if (zzamVar4 != null) {
            String zzm3 = zzfu.zzm(zzfu.zzk(zzamVar4));
            if (ImagesContract.URL.equals(zzm3)) {
                i = 2;
            } else if ("backslash".equals(zzm3)) {
                hashSet = new HashSet();
                zzc(hashSet, zzm);
                zzc(hashSet, zzm2);
                hashSet.remove('\\');
                i = 3;
            } else {
                Log.e("GoogleTagManager", "Joiner: unsupported escape type: ".concat(String.valueOf(zzm3)));
                return zzfu.zza();
            }
        } else {
            i = 1;
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.zza;
        int ordinal = zzamVar.zzh().ordinal();
        if (ordinal == 1) {
            for (com.google.android.gms.internal.gtm.zzam zzamVar5 : zzamVar.zzs()) {
                if (!z) {
                    sb.append(zzm);
                }
                sb.append(zzd(zzfu.zzm(zzfu.zzk(zzamVar5)), i, hashSet));
                z = false;
            }
        } else if (ordinal == 2) {
            for (int i2 = 0; i2 < zzamVar.zzc(); i2++) {
                if (i2 > 0) {
                    sb.append(zzm);
                }
                String zzm4 = zzfu.zzm(zzfu.zzk(zzamVar.zzl(i2)));
                String zzm5 = zzfu.zzm(zzfu.zzk(zzamVar.zzm(i2)));
                sb.append(zzd(zzm4, i, hashSet));
                sb.append(zzm2);
                sb.append(zzd(zzm5, i, hashSet));
            }
        } else {
            sb.append(zzd(zzfu.zzm(zzfu.zzk(zzamVar)), i, hashSet));
        }
        return zzfu.zzb(sb.toString());
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
