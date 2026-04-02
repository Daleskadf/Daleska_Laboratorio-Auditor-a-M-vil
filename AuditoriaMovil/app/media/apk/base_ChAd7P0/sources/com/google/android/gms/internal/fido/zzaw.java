package com.google.android.gms.internal.fido;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaw extends zzar {
    private final zzaz zza;

    public zzaw(zzaz zzazVar, int i7) {
        super(zzazVar.size(), i7);
        this.zza = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzar
    public final Object zza(int i7) {
        return this.zza.get(i7);
    }
}
