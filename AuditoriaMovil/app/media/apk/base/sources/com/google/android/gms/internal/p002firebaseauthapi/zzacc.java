package com.google.android.gms.internal.p002firebaseauthapi;

import a4.C0457f;
import b4.C0599g;
import b4.M;
import b4.W;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacc  reason: invalid package */
/* loaded from: classes.dex */
public final class zzacc extends zzaeg<W, M> {
    private final C0457f zzu;
    private final String zzv;

    public zzacc(C0457f c0457f, String str) {
        super(2);
        I.j(c0457f, "credential cannot be null");
        this.zzu = c0457f;
        I.f(c0457f.f7029a, "email cannot be null");
        I.f(c0457f.f7030b, "password cannot be null");
        this.zzv = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "linkEmailAuthCredential";
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
        C0457f c0457f = this.zzu;
        String str = c0457f.f7029a;
        String str2 = c0457f.f7030b;
        I.e(str2);
        zzadoVar.zza(str, str2, ((C0599g) this.zzd).f8253a.zzf(), this.zzd.k(), this.zzv, this.zzb);
    }
}
