package com.google.android.gms.internal.common;
/* loaded from: classes.dex */
final class zzae extends zzz {
    private final zzag zza;

    public zzae(zzag zzagVar, int i7) {
        super(zzagVar.size(), i7);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final Object zza(int i7) {
        return this.zza.get(i7);
    }
}
