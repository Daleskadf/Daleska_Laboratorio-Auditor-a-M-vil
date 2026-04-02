package com.google.android.gms.internal.gtm;

import com.google.android.gms.tagmanager.zzfu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzrx {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private String zzc = "";
    private int zzd = 0;

    private zzrx() {
    }

    public final zzrv zza() {
        return new zzrv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzrx zzb(zzrr zzrrVar) {
        String zzm = zzfu.zzm(zzfu.zzk((zzam) zzrrVar.zzc().get(zzb.zzbA.toString())));
        List list = (List) this.zzb.get(zzm);
        if (list == null) {
            list = new ArrayList();
            this.zzb.put(zzm, list);
        }
        list.add(zzrrVar);
        return this;
    }

    public final zzrx zzc(zzrz zzrzVar) {
        this.zza.add(zzrzVar);
        return this;
    }

    public final zzrx zzd(int i) {
        this.zzd = i;
        return this;
    }

    public final zzrx zze(String str) {
        this.zzc = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzrx(zzrw zzrwVar) {
    }
}
