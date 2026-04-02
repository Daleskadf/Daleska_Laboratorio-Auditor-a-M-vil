package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzat {
    public final String zza;
    public final Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzat(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzat) {
            zzat zzatVar = (zzat) obj;
            if (this.zza.equals(zzatVar.zza)) {
                Object obj2 = this.zzb;
                if (obj2 == null && zzatVar.zzb == null) {
                    return true;
                }
                return obj2 != null && obj2.equals(zzatVar.zzb);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Preconditions.checkNotNull(this.zzb);
        return Arrays.hashCode(new Integer[]{Integer.valueOf(this.zza.hashCode()), Integer.valueOf(this.zzb.hashCode())});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        return "Key: " + this.zza + " value: " + valueOf;
    }
}
