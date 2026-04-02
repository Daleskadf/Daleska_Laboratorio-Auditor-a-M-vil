package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzbj extends zzaz implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(String str, String str2) {
        MessageDigest zzc = zzc("SHA-256");
        this.zza = zzc;
        this.zzb = zzc.getDigestLength();
        this.zzd = "Hashing.sha256()";
        this.zzc = zzd(zzc);
    }

    private static MessageDigest zzc(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean zzd(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbd
    public final zzbe zzb() {
        if (this.zzc) {
            try {
                return new zzbi((MessageDigest) this.zza.clone(), this.zzb, null);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzbi(zzc(this.zza.getAlgorithm()), this.zzb, null);
    }
}
