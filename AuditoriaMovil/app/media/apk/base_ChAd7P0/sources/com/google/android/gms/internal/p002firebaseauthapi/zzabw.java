package com.google.android.gms.internal.p002firebaseauthapi;

import b4.C0605m;
import b4.M;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabw  reason: invalid package */
/* loaded from: classes.dex */
public final class zzabw extends zzaeg<C0605m, M> {
    private final String zzu;
    private final String zzv;

    public zzabw(String str, String str2) {
        super(3);
        I.f(str, "email cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        List<String> zza;
        if (this.zzl.zza() == null) {
            zza = zzaj.zzh();
        } else {
            zza = this.zzl.zza();
            I.i(zza);
        }
        zzb(new C0605m(zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zze(this.zzu, this.zzv, this.zzb);
    }
}
