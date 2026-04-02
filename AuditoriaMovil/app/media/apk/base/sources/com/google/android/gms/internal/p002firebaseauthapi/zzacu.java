package com.google.android.gms.internal.p002firebaseauthapi;

import a4.AbstractC0456e;
import b4.C0599g;
import b4.M;
import b4.W;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.slf4j.helpers.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacu  reason: invalid package */
/* loaded from: classes.dex */
public final class zzacu extends zzaeg<W, M> {
    private final zzaic zzu;

    public zzacu(AbstractC0456e abstractC0456e, String str) {
        super(2);
        I.j(abstractC0456e, "credential cannot be null");
        this.zzu = i.S(abstractC0456e, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "signInWithCredential";
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
