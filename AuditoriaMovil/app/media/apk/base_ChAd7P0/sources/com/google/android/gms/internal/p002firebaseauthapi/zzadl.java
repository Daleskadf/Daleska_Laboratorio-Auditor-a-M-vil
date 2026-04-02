package com.google.android.gms.internal.p002firebaseauthapi;

import a4.C0454c;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadl  reason: invalid package */
/* loaded from: classes.dex */
public final class zzadl extends zzaeg<Void, Void> {
    private final zzagn zzu;

    public zzadl(String str, String str2, C0454c c0454c) {
        super(6);
        I.e(str);
        I.e(str2);
        I.i(c0454c);
        this.zzu = zzagn.zza(c0454c, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzc(this.zzu, this.zzb);
    }
}
