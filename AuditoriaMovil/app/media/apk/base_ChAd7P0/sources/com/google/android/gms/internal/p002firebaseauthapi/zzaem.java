package com.google.android.gms.internal.p002firebaseauthapi;

import a4.y;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaem  reason: invalid package */
/* loaded from: classes.dex */
final class zzaem implements zzaen {
    private final /* synthetic */ String zza;

    public zzaem(zzaei zzaeiVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaen
    public final void zza(y yVar, Object... objArr) {
        yVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
