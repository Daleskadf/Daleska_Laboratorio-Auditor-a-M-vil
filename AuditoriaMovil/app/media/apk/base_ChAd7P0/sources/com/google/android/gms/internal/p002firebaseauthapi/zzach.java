package com.google.android.gms.internal.p002firebaseauthapi;

import a4.AbstractC0467p;
import a4.C0457f;
import b4.C0599g;
import b4.M;
import b4.W;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzach  reason: invalid package */
/* loaded from: classes.dex */
public final class zzach extends zzaeg<W, M> {
    private final C0457f zzu;

    public zzach(C0457f c0457f) {
        super(2);
        I.j(c0457f, "credential cannot be null");
        this.zzu = c0457f;
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
        AbstractC0467p abstractC0467p = this.zzd;
        c0457f.getClass();
        c0457f.f7032d = ((C0599g) abstractC0467p).f8253a.zzf();
        c0457f.f7033e = true;
        zzadoVar.zza(new zzafy(c0457f, null, null), this.zzb);
    }
}
