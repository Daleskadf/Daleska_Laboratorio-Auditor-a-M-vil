package com.google.android.gms.internal.p002firebaseauthapi;

import U3.i;
import a4.v;
import a4.x;
import a4.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzafb extends y {
    private final /* synthetic */ y zza;
    private final /* synthetic */ String zzb;

    public zzafb(y yVar, String str) {
        this.zza = yVar;
        this.zzb = str;
    }

    @Override // a4.y
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzafc.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // a4.y
    public final void onCodeSent(String str, x xVar) {
        this.zza.onCodeSent(str, xVar);
    }

    @Override // a4.y
    public final void onVerificationCompleted(v vVar) {
        zzafc.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(vVar);
    }

    @Override // a4.y
    public final void onVerificationFailed(i iVar) {
        zzafc.zza.remove(this.zzb);
        this.zza.onVerificationFailed(iVar);
    }
}
