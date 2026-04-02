package com.google.android.gms.internal.play_billing;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzhb extends zzdd implements zzel {
    private static final zzhb zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzhb zzhbVar = new zzhb();
        zzb = zzhbVar;
        zzdd.zzt(zzhb.class, zzhbVar);
    }

    private zzhb() {
    }

    public static /* synthetic */ void zzB(zzhb zzhbVar, String str) {
        str.getClass();
        zzhbVar.zzd |= 1;
        zzhbVar.zze = str;
    }

    public static /* synthetic */ void zzC(zzhb zzhbVar, String str) {
        str.getClass();
        zzhbVar.zzd |= 2;
        zzhbVar.zzf = str;
    }

    public static zzha zzz() {
        return (zzha) zzb.zzh();
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
                    return new zzha(null);
                }
                return new zzhb();
            }
            return zzq(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
