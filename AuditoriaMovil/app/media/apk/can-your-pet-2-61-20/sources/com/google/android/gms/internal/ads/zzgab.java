package com.google.android.gms.internal.ads;

import java.util.ListIterator;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgab extends zzgbs {
    final /* synthetic */ zzgac zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgab(zzgac zzgacVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzgacVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgbr
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
