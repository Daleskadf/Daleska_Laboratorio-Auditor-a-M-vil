package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaa  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaa implements zzab {
    private final /* synthetic */ zzl zza;

    public zzaa(zzl zzlVar) {
        this.zza = zzlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
    public final /* synthetic */ Iterator zza(zzv zzvVar, CharSequence charSequence) {
        return new zzz(this, zzvVar, charSequence, this.zza.zza(charSequence));
    }
}
