package com.google.android.gms.internal.p002firebaseauthapi;

import a4.AbstractC0467p;
import a4.t;
import b4.C0599g;
import b4.M;
import b4.W;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaby  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaby extends zzaeg<W, M> {
    private final t zzu;
    private final String zzv;
    private final String zzw;

    public zzaby(t tVar, String str, String str2) {
        super(2);
        I.i(tVar);
        this.zzu = tVar;
        I.e(str);
        this.zzv = str;
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        C0599g zza = zzabq.zza(this.zzc, this.zzk);
        AbstractC0467p abstractC0467p = this.zzd;
        if (abstractC0467p != null && !((C0599g) abstractC0467p).f8254b.f8241a.equalsIgnoreCase(zza.f8254b.f8241a)) {
            zza(new Status(17024, null, null, null));
            return;
        }
        ((M) this.zze).a(this.zzj, zza);
        zzb(new W(zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzv, this.zzu, this.zzw, this.zzb);
    }
}
