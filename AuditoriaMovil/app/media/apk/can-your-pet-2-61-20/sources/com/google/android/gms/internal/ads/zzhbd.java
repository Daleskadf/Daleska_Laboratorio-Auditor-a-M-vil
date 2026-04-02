package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhbd implements zzhch {
    private static final zzhbj zza = new zzhbb();
    private final zzhbj zzb;

    public zzhbd() {
        zzhbj zzhbjVar;
        zzhbj[] zzhbjVarArr = new zzhbj[2];
        zzhbjVarArr[0] = zzgzo.zza();
        try {
            zzhbjVar = (zzhbj) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzhbjVar = zza;
        }
        zzhbjVarArr[1] = zzhbjVar;
        zzhbc zzhbcVar = new zzhbc(zzhbjVarArr);
        byte[] bArr = zzhai.zzd;
        this.zzb = zzhbcVar;
    }

    private static boolean zzb(zzhbi zzhbiVar) {
        return zzhbiVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhch
    public final zzhcg zza(Class cls) {
        zzhci.zzs(cls);
        zzhbi zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            if (zzgzv.class.isAssignableFrom(cls)) {
                if (zzb(zzb)) {
                    return zzhbo.zzl(cls, zzb, zzhbs.zzb(), zzhaz.zze(), zzhci.zzn(), zzgzi.zzb(), zzhbh.zzb());
                }
                return zzhbo.zzl(cls, zzb, zzhbs.zzb(), zzhaz.zze(), zzhci.zzn(), null, zzhbh.zzb());
            } else if (zzb(zzb)) {
                return zzhbo.zzl(cls, zzb, zzhbs.zza(), zzhaz.zzd(), zzhci.zzm(), zzgzi.zza(), zzhbh.zza());
            } else {
                return zzhbo.zzl(cls, zzb, zzhbs.zza(), zzhaz.zzd(), zzhci.zzm(), null, zzhbh.zza());
            }
        } else if (zzgzv.class.isAssignableFrom(cls)) {
            return zzhbp.zzc(zzhci.zzn(), zzgzi.zzb(), zzb.zza());
        } else {
            return zzhbp.zzc(zzhci.zzm(), zzgzi.zza(), zzb.zza());
        }
    }
}
