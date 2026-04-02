package com.google.android.gms.internal.p002firebaseauthapi;

import a4.v;
import a4.y;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaej  reason: invalid package */
/* loaded from: classes.dex */
final class zzaej implements zzaen {
    private final /* synthetic */ v zza;

    public zzaej(zzaei zzaeiVar, v vVar) {
        this.zza = vVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaen
    public final void zza(y yVar, Object... objArr) {
        yVar.onVerificationCompleted(this.zza);
    }
}
