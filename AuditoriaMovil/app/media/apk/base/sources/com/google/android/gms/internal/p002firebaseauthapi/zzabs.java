package com.google.android.gms.internal.p002firebaseauthapi;

import b4.M;
import b4.U;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabs  reason: invalid package */
/* loaded from: classes.dex */
public final class zzabs extends zzaeg<U, M> {
    private final String zzu;
    private final String zzv;

    public zzabs(String str, String str2) {
        super(4);
        I.f(str, "code cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "checkActionCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(new U(this.zzm));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzd(this.zzu, this.zzv, this.zzb);
    }
}
