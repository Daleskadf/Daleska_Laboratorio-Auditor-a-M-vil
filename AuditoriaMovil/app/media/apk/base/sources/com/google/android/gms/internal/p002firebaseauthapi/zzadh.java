package com.google.android.gms.internal.p002firebaseauthapi;

import b4.C0599g;
import b4.M;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadh  reason: invalid package */
/* loaded from: classes.dex */
public final class zzadh extends zzaeg<Void, M> {
    private final String zzu;

    public zzadh(String str) {
        super(2);
        I.f(str, "email cannot be null or empty");
        this.zzu = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "updateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        ((M) this.zze).a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzb(((C0599g) this.zzd).f8253a.zzf(), this.zzu, this.zzb);
    }
}
