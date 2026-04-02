package com.google.android.gms.internal.p002firebaseauthapi;

import b4.C0603k;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzada  reason: invalid package */
/* loaded from: classes.dex */
public final class zzada extends zzaeg<zzahs, Void> {
    private final zzahv zzu;

    public zzada(C0603k c0603k, String str) {
        super(12);
        I.i(c0603k);
        String str2 = c0603k.f8270a;
        I.e(str2);
        this.zzu = zzahv.zza(str2, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(this.zzt);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
