package com.google.android.gms.internal.p002firebaseauthapi;

import b4.M;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadc  reason: invalid package */
/* loaded from: classes.dex */
public final class zzadc extends zzaeg<Void, M> {
    private final String zzu;
    private final String zzv;
    private final String zzw;

    public zzadc(String str, String str2, String str3) {
        super(2);
        I.e(str);
        this.zzu = str;
        I.e(str2);
        this.zzv = str2;
        this.zzw = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "unenrollMfa";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        ((M) this.zze).a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzv, this.zzw, this.zzb);
    }
}
