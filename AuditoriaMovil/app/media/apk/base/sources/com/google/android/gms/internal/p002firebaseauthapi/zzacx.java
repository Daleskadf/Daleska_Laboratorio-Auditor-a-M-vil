package com.google.android.gms.internal.p002firebaseauthapi;

import b4.C0599g;
import b4.M;
import b4.W;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacx  reason: invalid package */
/* loaded from: classes.dex */
public final class zzacx extends zzaeg<W, M> {
    private final zzaid zzu;

    public zzacx(String str, String str2) {
        super(2);
        I.f(str, "token cannot be null or empty");
        this.zzu = new zzaid(str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "signInWithCustomToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        C0599g zza = zzabq.zza(this.zzc, this.zzk);
        ((M) this.zze).a(this.zzj, zza);
        zzb(new W(zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
