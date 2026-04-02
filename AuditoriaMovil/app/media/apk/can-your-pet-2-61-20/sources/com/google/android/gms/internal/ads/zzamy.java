package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzamy implements zzalh {
    private final zzfo zza = new zzfo();
    private final zzamo zzb = new zzamo();

    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zza(byte[] bArr, int i, int i2, zzalg zzalgVar, zzep zzepVar) {
        this.zza.zzI(bArr, i2 + i);
        this.zza.zzK(i);
        ArrayList arrayList = new ArrayList();
        try {
            zzfo zzfoVar = this.zza;
            int zzd = zzfoVar.zzd();
            String zzy = zzfoVar.zzy(zzfwd.zzc);
            if (zzy == null || !zzy.startsWith("WEBVTT")) {
                zzfoVar.zzK(zzd);
                throw zzcc.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzfoVar.zzy(zzfwd.zzc))), null);
            }
            do {
            } while (!TextUtils.isEmpty(this.zza.zzy(zzfwd.zzc)));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzfo zzfoVar2 = this.zza;
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = zzfoVar2.zzd();
                    String zzy2 = zzfoVar2.zzy(zzfwd.zzc);
                    if (zzy2 == null) {
                        c = 0;
                    } else if ("STYLE".equals(zzy2)) {
                        c = 2;
                    } else {
                        c = zzy2.startsWith("NOTE") ? (char) 1 : (char) 3;
                    }
                }
                zzfoVar2.zzK(i3);
                if (c == 0) {
                    zzalb.zza(new zzanb(arrayList2), zzalgVar, zzepVar);
                    return;
                } else if (c == 1) {
                    do {
                    } while (!TextUtils.isEmpty(this.zza.zzy(zzfwd.zzc)));
                } else if (c == 2) {
                    if (arrayList2.isEmpty()) {
                        this.zza.zzy(zzfwd.zzc);
                        arrayList.addAll(this.zzb.zzb(this.zza));
                    } else {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                } else {
                    zzamq zzc = zzamx.zzc(this.zza, arrayList);
                    if (zzc != null) {
                        arrayList2.add(zzc);
                    }
                }
            }
        } catch (zzcc e) {
            throw new IllegalArgumentException(e);
        }
    }
}
