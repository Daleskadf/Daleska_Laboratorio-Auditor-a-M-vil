package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaes {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzby zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = zzfx.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzfe.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzagi.zzb(new zzfo(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzfe.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzaia(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby(arrayList);
    }

    public static zzaep zzc(zzfo zzfoVar, boolean z, boolean z2) throws zzcc {
        if (z) {
            zzd(3, zzfoVar, false);
        }
        String zzA = zzfoVar.zzA((int) zzfoVar.zzs(), zzfwd.zzc);
        int length = zzA.length();
        long zzs = zzfoVar.zzs();
        String[] strArr = new String[(int) zzs];
        int i = length + 15;
        for (int i2 = 0; i2 < zzs; i2++) {
            String zzA2 = zzfoVar.zzA((int) zzfoVar.zzs(), zzfwd.zzc);
            strArr[i2] = zzA2;
            i = i + 4 + zzA2.length();
        }
        if (z2 && (zzfoVar.zzm() & 1) == 0) {
            throw zzcc.zza("framing bit expected to be set", null);
        }
        return new zzaep(zzA, strArr, i + 1);
    }

    public static boolean zzd(int i, zzfo zzfoVar, boolean z) throws zzcc {
        if (zzfoVar.zzb() < 7) {
            if (z) {
                return false;
            }
            int zzb = zzfoVar.zzb();
            throw zzcc.zza("too short header: " + zzb, null);
        } else if (zzfoVar.zzm() != i) {
            if (z) {
                return false;
            }
            throw zzcc.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        } else if (zzfoVar.zzm() == 118 && zzfoVar.zzm() == 111 && zzfoVar.zzm() == 114 && zzfoVar.zzm() == 98 && zzfoVar.zzm() == 105 && zzfoVar.zzm() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzcc.zza("expected characters 'vorbis'", null);
        }
    }
}
