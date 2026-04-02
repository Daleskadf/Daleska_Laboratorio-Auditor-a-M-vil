package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiz  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaiz extends zzajb {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzaiw zzc;

    public zzaiz(zzaiw zzaiwVar) {
        this.zzc = zzaiwVar;
        this.zzb = zzaiwVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza < this.zzb) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajc
    public final byte zza() {
        int i7 = this.zza;
        if (i7 < this.zzb) {
            this.zza = i7 + 1;
            return this.zzc.zzb(i7);
        }
        throw new NoSuchElementException();
    }
}
