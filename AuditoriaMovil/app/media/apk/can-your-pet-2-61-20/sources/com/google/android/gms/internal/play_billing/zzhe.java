package com.google.android.gms.internal.play_billing;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzhe extends zzdd implements zzel {
    private static final zzhe zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzhe zzheVar = new zzhe();
        zzb = zzheVar;
        zzdd.zzt(zzhe.class, zzheVar);
    }

    private zzhe() {
    }

    public static /* synthetic */ void zzB(zzhe zzheVar, boolean z) {
        zzheVar.zzd |= 2;
        zzheVar.zzf = false;
    }

    public static zzhd zzz() {
        return (zzhd) zzb.zzh();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final Object zzy(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzhd(null);
                }
                return new zzhe();
            }
            return zzq(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
