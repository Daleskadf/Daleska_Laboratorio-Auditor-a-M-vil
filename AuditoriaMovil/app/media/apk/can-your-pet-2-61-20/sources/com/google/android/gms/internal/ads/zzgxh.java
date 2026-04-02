package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgxh extends ThreadLocal {
    final /* synthetic */ zzgxi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgxh(zzgxi zzgxiVar) {
        this.zza = zzgxiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgwv zzgwvVar = zzgwv.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzgwvVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
