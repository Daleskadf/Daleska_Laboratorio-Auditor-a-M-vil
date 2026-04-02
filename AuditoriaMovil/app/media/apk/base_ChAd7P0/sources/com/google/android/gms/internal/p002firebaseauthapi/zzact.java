package com.google.android.gms.internal.p002firebaseauthapi;

import a4.C0454c;
import b4.M;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzact  reason: invalid package */
/* loaded from: classes.dex */
public final class zzact extends zzaeg<Void, M> {
    private final zzagn zzu;
    private final String zzv;

    public zzact(String str, C0454c c0454c, String str2, String str3, String str4) {
        super(4);
        I.f(str, "email cannot be null or empty");
        zzagn zzagnVar = new zzagn(c0454c.f7017Z);
        this.zzu = zzagnVar;
        zzagnVar.zzb(str);
        zzagnVar.zza(c0454c);
        zzagnVar.zzc(str2);
        zzagnVar.zza(str3);
        this.zzv = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzb(this.zzu, this.zzb);
    }
}
