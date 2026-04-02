package com.google.android.gms.internal.p002firebaseauthapi;

import a4.v;
import b4.C0599g;
import b4.M;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadj  reason: invalid package */
/* loaded from: classes.dex */
public final class zzadj extends zzaeg<Void, M> {
    private final v zzu;

    public zzadj(v vVar) {
        super(2);
        I.i(vVar);
        this.zzu = vVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "updatePhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        ((M) this.zze).a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(new zzaha(((C0599g) this.zzd).f8253a.zzf(), zzaex.zza(this.zzu)), this.zzb);
    }
}
