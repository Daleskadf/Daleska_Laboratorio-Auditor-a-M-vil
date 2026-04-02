package com.google.android.gms.tagmanager;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzbc {
    final String zza;
    final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbc(String str, byte[] bArr) {
        this.zza = str;
        this.zzb = bArr;
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.zzb);
        return "KeyAndSerialized: key = " + this.zza + " serialized hash = " + hashCode;
    }
}
