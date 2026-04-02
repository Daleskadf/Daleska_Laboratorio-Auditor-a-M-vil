package com.google.android.gms.internal.mlkit_vision_barcode;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcq extends zzbd {
    private final zzcs zza;

    public zzcq(zzcs zzcsVar, int i7) {
        super(zzcsVar.size(), i7);
        this.zza = zzcsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbd
    public final Object zza(int i7) {
        return this.zza.get(i7);
    }
}
