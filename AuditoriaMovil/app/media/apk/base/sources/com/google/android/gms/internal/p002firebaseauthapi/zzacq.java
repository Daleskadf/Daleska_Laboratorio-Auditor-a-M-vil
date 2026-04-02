package com.google.android.gms.internal.p002firebaseauthapi;

import a4.C0454c;
import b4.M;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacq  reason: invalid package */
/* loaded from: classes.dex */
public final class zzacq extends zzaeg<Void, M> {
    private final zzagn zzu;

    public zzacq(String str, C0454c c0454c) {
        super(6);
        I.f(str, "token cannot be null or empty");
        zzagn zzagnVar = new zzagn(4);
        this.zzu = zzagnVar;
        zzagnVar.zzd(str);
        if (c0454c != null) {
            zzagnVar.zza(c0454c);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
