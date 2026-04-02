package com.google.android.gms.internal.p002firebaseauthapi;

import b4.M;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacs  reason: invalid package */
/* loaded from: classes.dex */
final class zzacs extends zzaeg<Void, M> {
    private final zzaho zzu;

    public zzacs(String str) {
        super(9);
        this.zzu = new zzaho(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "setFirebaseUIVersion";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
