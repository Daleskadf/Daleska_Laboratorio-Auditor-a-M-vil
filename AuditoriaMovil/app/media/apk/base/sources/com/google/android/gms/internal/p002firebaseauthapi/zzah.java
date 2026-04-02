package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzah  reason: invalid package */
/* loaded from: classes.dex */
public class zzah<E> extends zzak<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzah(int i7) {
        zzag.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzah<E> zza(E e7) {
        zzw.zza(e7);
        Object[] objArr = this.zza;
        int zza = zzak.zza(objArr.length, this.zzb + 1);
        if (zza > objArr.length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zza);
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        objArr2[i7] = e7;
        return this;
    }
}
