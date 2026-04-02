package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzkw implements zzlz {
    private static final zzlf zza = new zzkv();
    private final zzlf zzb;

    private static zzlf zza() {
        try {
            return (zzlf) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zza;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlz
    public final <T> zzma<T> zza(Class<T> cls) {
        zzmc.zza((Class<?>) cls);
        zzlg zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            if (zzjv.class.isAssignableFrom(cls)) {
                return zzlo.zza(zzmc.zzb(), zzjm.zzb(), zza2.zza());
            }
            return zzlo.zza(zzmc.zza(), zzjm.zza(), zza2.zza());
        } else if (zzjv.class.isAssignableFrom(cls)) {
            if (zza(zza2)) {
                return zzlm.zza(cls, zza2, zzls.zzb(), zzkn.zzb(), zzmc.zzb(), zzjm.zzb(), zzld.zzb());
            }
            return zzlm.zza(cls, zza2, zzls.zzb(), zzkn.zzb(), zzmc.zzb(), (zzjk<?>) null, zzld.zzb());
        } else if (zza(zza2)) {
            return zzlm.zza(cls, zza2, zzls.zza(), zzkn.zza(), zzmc.zza(), zzjm.zza(), zzld.zza());
        } else {
            return zzlm.zza(cls, zza2, zzls.zza(), zzkn.zza(), zzmc.zza(), (zzjk<?>) null, zzld.zza());
        }
    }

    public zzkw() {
        this(new zzkx(zzjt.zza(), zza()));
    }

    private zzkw(zzlf zzlfVar) {
        this.zzb = (zzlf) zzjy.zza(zzlfVar, "messageInfoFactory");
    }

    private static boolean zza(zzlg zzlgVar) {
        return zzky.zza[zzlgVar.zzb().ordinal()] != 1;
    }
}
