package com.google.android.gms.internal.cast;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpw implements zzqq {
    private static final zzqc zza = new zzpu();
    private final zzqc zzb;

    public zzpw() {
        zzqc zzqcVar;
        zzqc[] zzqcVarArr = new zzqc[2];
        zzqcVarArr[0] = zzou.zza();
        try {
            zzqcVar = (zzqc) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzqcVar = zza;
        }
        zzqcVarArr[1] = zzqcVar;
        zzpv zzpvVar = new zzpv(zzqcVarArr);
        zzph.zzf(zzpvVar, "messageInfoFactory");
        this.zzb = zzpvVar;
    }

    private static boolean zzb(zzqb zzqbVar) {
        if (zzqbVar.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzqq
    public final <T> zzqp<T> zza(Class<T> cls) {
        zzqr.zzE(cls);
        zzqb zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzoy.class.isAssignableFrom(cls)) {
                return zzqi.zzg(zzqr.zzB(), zzoq.zzb(), zzb.zza());
            }
            return zzqi.zzg(zzqr.zzz(), zzoq.zza(), zzb.zza());
        } else if (zzoy.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzqh.zzg(cls, zzb, zzqk.zzb(), zzps.zzd(), zzqr.zzB(), zzoq.zzb(), zzqa.zzb());
            }
            return zzqh.zzg(cls, zzb, zzqk.zzb(), zzps.zzd(), zzqr.zzB(), null, zzqa.zzb());
        } else if (zzb(zzb)) {
            return zzqh.zzg(cls, zzb, zzqk.zza(), zzps.zzc(), zzqr.zzz(), zzoq.zza(), zzqa.zza());
        } else {
            return zzqh.zzg(cls, zzb, zzqk.zza(), zzps.zzc(), zzqr.zzA(), null, zzqa.zza());
        }
    }
}
