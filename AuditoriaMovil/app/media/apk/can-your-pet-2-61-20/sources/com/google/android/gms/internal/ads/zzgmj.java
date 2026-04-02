package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgmj extends ThreadLocal {
    protected static final Cipher zza() {
        boolean zze;
        try {
            Cipher cipher = (Cipher) zzgwv.zza.zza("AES/GCM-SIV/NoPadding");
            zze = zzgmk.zze(cipher);
            if (zze) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
