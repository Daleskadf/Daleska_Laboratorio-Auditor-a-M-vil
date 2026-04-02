package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@VisibleForTesting
/* loaded from: classes.dex */
public class zzd extends zzp {
    private final List<zzat> zzb;

    public zzd(String str, String str2, String str3) {
        super(str, "MediaControlChannel", null);
        this.zzb = Collections.synchronizedList(new ArrayList());
    }

    public final List<zzat> zza() {
        return this.zzb;
    }

    public final void zzb() {
        synchronized (this.zzb) {
            for (zzat zzatVar : this.zzb) {
                zzatVar.zzc(CastStatusCodes.CANCELED);
            }
        }
    }

    public final void zzc(zzat zzatVar) {
        this.zzb.add(zzatVar);
    }
}
