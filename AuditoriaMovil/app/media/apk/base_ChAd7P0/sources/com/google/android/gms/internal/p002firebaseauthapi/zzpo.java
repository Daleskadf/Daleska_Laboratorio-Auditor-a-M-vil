package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.SecureRandom;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpo  reason: invalid package */
/* loaded from: classes.dex */
final class zzpo extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ SecureRandom initialValue() {
        return zzpp.zza();
    }
}
