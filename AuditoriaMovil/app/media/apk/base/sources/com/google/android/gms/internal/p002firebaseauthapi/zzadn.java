package com.google.android.gms.internal.p002firebaseauthapi;

import a4.y;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadn  reason: invalid package */
/* loaded from: classes.dex */
public final class zzadn extends zzaeg<Void, y> {
    private final zzahk zzu;

    public zzadn(zzahk zzahkVar) {
        super(8);
        I.i(zzahkVar);
        this.zzu = zzahkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "verifyPhoneNumber";
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
