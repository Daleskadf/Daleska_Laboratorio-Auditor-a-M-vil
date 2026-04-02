package com.google.android.gms.internal.p002firebaseauthapi;

import a4.AbstractC0467p;
import a4.Q;
import b4.C0599g;
import b4.InterfaceC0608p;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabx  reason: invalid package */
/* loaded from: classes.dex */
public final class zzabx extends zzaeg<Void, InterfaceC0608p> {
    public zzabx() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "delete";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        Q q2 = (Q) ((InterfaceC0608p) this.zze);
        FirebaseAuth firebaseAuth = q2.f7004b;
        AbstractC0467p abstractC0467p = firebaseAuth.f;
        if (abstractC0467p != null && ((C0599g) abstractC0467p).f8254b.f8241a.equalsIgnoreCase(((C0599g) q2.f7003a).f8254b.f8241a)) {
            firebaseAuth.r();
        }
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(((C0599g) this.zzd).f8253a.zzf(), this.zzb);
    }
}
