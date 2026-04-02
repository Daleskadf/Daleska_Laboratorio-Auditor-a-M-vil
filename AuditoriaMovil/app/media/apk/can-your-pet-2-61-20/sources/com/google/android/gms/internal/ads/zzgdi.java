package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgdi extends zzgdf {
    private zzgdi() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgdi(zzgdh zzgdhVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgdf
    public final int zza(zzgdj zzgdjVar) {
        int i;
        int i2;
        synchronized (zzgdjVar) {
            i = zzgdjVar.remaining;
            i2 = i - 1;
            zzgdjVar.remaining = i2;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgdf
    public final void zzb(zzgdj zzgdjVar, @CheckForNull Set set, Set set2) {
        Set set3;
        synchronized (zzgdjVar) {
            set3 = zzgdjVar.seenExceptions;
            if (set3 == null) {
                zzgdjVar.seenExceptions = set2;
            }
        }
    }
}
