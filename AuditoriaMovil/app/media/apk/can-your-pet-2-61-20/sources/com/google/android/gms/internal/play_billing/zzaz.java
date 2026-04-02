package com.google.android.gms.internal.play_billing;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public abstract class zzaz implements zzbd {
    @Override // com.google.android.gms.internal.play_billing.zzbd
    public final zzbc zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i = length + length;
        if (i >= 0) {
            zzbe zzb = zzb();
            int length2 = charSequence.length();
            for (int i2 = 0; i2 < length2; i2++) {
                ((zzba) zzb).zza(charSequence.charAt(i2));
            }
            return zzb.zzc();
        }
        throw new IllegalArgumentException(zzab.zza("expectedInputSize must be >= 0 but was %s", Integer.valueOf(i)));
    }
}
