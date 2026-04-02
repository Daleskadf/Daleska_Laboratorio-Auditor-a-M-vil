package com.google.android.gms.internal.play_billing;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzec implements zzew {
    private static final zzei zza = new zzea();
    private final zzei zzb;

    public zzec() {
        zzei zzeiVar;
        zzei[] zzeiVarArr = new zzei[2];
        zzeiVarArr[0] = zzcy.zza();
        try {
            zzeiVar = (zzei) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzeiVar = zza;
        }
        zzeiVarArr[1] = zzeiVar;
        zzeb zzebVar = new zzeb(zzeiVarArr);
        byte[] bArr = zzdl.zzd;
        this.zzb = zzebVar;
    }

    private static boolean zzb(zzeh zzehVar) {
        return zzehVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzew
    public final zzev zza(Class cls) {
        zzex.zzq(cls);
        zzeh zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            if (zzdd.class.isAssignableFrom(cls)) {
                if (zzb(zzb)) {
                    return zzen.zzl(cls, zzb, zzeq.zzb(), zzdy.zzd(), zzex.zzn(), zzcs.zzb(), zzeg.zzb());
                }
                return zzen.zzl(cls, zzb, zzeq.zzb(), zzdy.zzd(), zzex.zzn(), null, zzeg.zzb());
            } else if (zzb(zzb)) {
                return zzen.zzl(cls, zzb, zzeq.zza(), zzdy.zzc(), zzex.zzm(), zzcs.zza(), zzeg.zza());
            } else {
                return zzen.zzl(cls, zzb, zzeq.zza(), zzdy.zzc(), zzex.zzm(), null, zzeg.zza());
            }
        } else if (zzdd.class.isAssignableFrom(cls)) {
            return zzeo.zzc(zzex.zzn(), zzcs.zzb(), zzb.zza());
        } else {
            return zzeo.zzc(zzex.zzm(), zzcs.zza(), zzb.zza());
        }
    }
}
