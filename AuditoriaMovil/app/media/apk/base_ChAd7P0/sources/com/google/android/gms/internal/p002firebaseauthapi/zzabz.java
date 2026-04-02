package com.google.android.gms.internal.p002firebaseauthapi;

import a4.t;
import b4.M;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabz  reason: invalid package */
/* loaded from: classes.dex */
public final class zzabz extends zzaeg<Void, M> {
    private final t zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzabz(t tVar, String str, String str2, String str3) {
        super(2);
        I.i(tVar);
        this.zzu = tVar;
        I.e(str);
        this.zzv = str;
        this.zzw = str2;
        this.zzx = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        ((M) this.zze).a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
