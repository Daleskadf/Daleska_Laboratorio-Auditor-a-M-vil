package com.google.android.gms.internal.p002firebaseauthapi;

import b4.M;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabv  reason: invalid package */
/* loaded from: classes.dex */
public final class zzabv extends zzaeg<Void, M> {
    private final zzahd zzu;

    public zzabv(String str, String str2, String str3) {
        super(4);
        I.f(str, "code cannot be null or empty");
        I.f(str2, "new password cannot be null or empty");
        this.zzu = new zzahd(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "confirmPasswordReset";
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
