package com.google.android.gms.internal.p002firebaseauthapi;

import a4.C0448A;
import a4.y;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadd  reason: invalid package */
/* loaded from: classes.dex */
public final class zzadd extends zzaeg<Void, y> {
    private final zzzq zzu;

    public zzadd(C0448A c0448a, String str, String str2, long j, boolean z7, boolean z8, String str3, String str4, String str5, boolean z9) {
        super(8);
        I.i(c0448a);
        I.e(str);
        this.zzu = new zzzq(c0448a, str, str2, j, z7, z8, str3, str4, str5, z9);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
