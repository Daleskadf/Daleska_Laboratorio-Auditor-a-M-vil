package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzz  reason: invalid package */
/* loaded from: classes.dex */
final class zzz extends zzac {
    private final /* synthetic */ zzm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzaa zzaaVar, zzv zzvVar, CharSequence charSequence, zzm zzmVar) {
        super(zzvVar, charSequence);
        this.zzb = zzmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzac
    public final int zza(int i7) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzac
    public final int zzb(int i7) {
        if (this.zzb.zza(i7)) {
            return this.zzb.zzb();
        }
        return -1;
    }
}
