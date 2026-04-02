package com.google.android.gms.internal.p002firebaseauthapi;

import Z2.a;
import com.google.android.gms.tasks.OnFailureListener;
import io.flutter.plugins.pathprovider.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaff  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaff implements OnFailureListener {
    public zzaff(zzafd zzafdVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        a aVar;
        aVar = zzafd.zza;
        aVar.c(b.h("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
