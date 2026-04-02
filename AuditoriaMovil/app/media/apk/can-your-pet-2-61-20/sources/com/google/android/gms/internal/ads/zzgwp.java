package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgwp implements zzgwu {
    private final zzgxd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgwp(zzgxd zzgxdVar, zzgwo zzgwoVar) {
        this.zza = zzgxdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwu
    public final Object zza(String str) throws GeneralSecurityException {
        for (Provider provider : zzgwv.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
