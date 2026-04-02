package com.google.android.gms.internal.p002firebaseauthapi;

import a4.y;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzael  reason: invalid package */
/* loaded from: classes.dex */
final class zzael implements zzaen {
    private final /* synthetic */ Status zza;

    public zzael(zzaei zzaeiVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaen
    public final void zza(y yVar, Object... objArr) {
        yVar.onVerificationFailed(zzadr.zza(this.zza));
    }
}
