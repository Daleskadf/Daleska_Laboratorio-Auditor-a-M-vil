package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgbi extends zzfxo {
    final Iterator zza;
    final /* synthetic */ zzgbj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbi(zzgbj zzgbjVar) {
        this.zzb = zzgbjVar;
        this.zza = zzgbjVar.zza.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    @CheckForNull
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            Set set = this.zzb.zzb;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
