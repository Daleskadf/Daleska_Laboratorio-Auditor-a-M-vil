package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznx  reason: invalid package */
/* loaded from: classes.dex */
public final class zznx {
    private ArrayList<zznw> zza = new ArrayList<>();
    private zznr zzb = zznr.zza;
    private Integer zzc = null;

    public final zznx zza(zzbq zzbqVar, int i7, String str, String str2) {
        ArrayList<zznw> arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zznw(zzbqVar, i7, str, str2));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zznx zza(zznr zznrVar) {
        if (this.zza != null) {
            this.zzb = zznrVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zznx zza(int i7) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i7);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zznu zza() {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList<zznw> arrayList = this.zza;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    zznw zznwVar = arrayList.get(i7);
                    i7++;
                    if (zznwVar.zza() == intValue) {
                        zznu zznuVar = new zznu(this.zzb, DesugarCollections.unmodifiableList(this.zza), this.zzc);
                        this.zza = null;
                        return zznuVar;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zznu zznuVar2 = new zznu(this.zzb, DesugarCollections.unmodifiableList(this.zza), this.zzc);
            this.zza = null;
            return zznuVar2;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
