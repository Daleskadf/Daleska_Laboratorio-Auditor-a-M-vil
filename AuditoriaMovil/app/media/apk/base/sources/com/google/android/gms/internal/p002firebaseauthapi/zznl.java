package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznl  reason: invalid package */
/* loaded from: classes.dex */
public class zznl<P> implements zzbn<P> {
    final String zza;
    final zzwb.zza zzb;
    private final Class<P> zzc;

    public zznl(String str, Class<P> cls, zzwb.zza zzaVar, zzalw<? extends zzaln> zzalwVar) {
        this.zza = str;
        this.zzc = cls;
        this.zzb = zzaVar;
    }

    public static <P> zzbn<P> zza(String str, Class<P> cls, zzwb.zza zzaVar, zzalw<? extends zzaln> zzalwVar) {
        return new zznl(str, cls, zzaVar, zzalwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbn
    public final P zzb(zzaiw zzaiwVar) {
        return (P) zzon.zza().zza((zzon) zzom.zza().zza((zzom) zzpn.zza(this.zza, zzaiwVar, this.zzb, zzxd.RAW, null), zzbl.zza()), (Class<Object>) this.zzc);
    }

    public static <P> zzci<P> zza(String str, Class<P> cls, zzalw<? extends zzaln> zzalwVar) {
        return new zznk(str, cls, zzalwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbn
    public final zzwb zza(zzaiw zzaiwVar) {
        zzpn zzpnVar = (zzpn) zzom.zza().zza(zzoc.zza().zza(zzom.zza().zza((zzom) zzpm.zza((zzwf) ((zzakg) zzwf.zza().zza(this.zza).zza(zzaiwVar).zza(zzxd.RAW).zze()))), (Integer) null), zzpn.class, zzbl.zza());
        return (zzwb) ((zzakg) zzwb.zza().zza(zzpnVar.zzf()).zza(zzpnVar.zzd()).zza(zzpnVar.zza()).zze());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbn
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbn
    public final Class<P> zza() {
        return this.zzc;
    }
}
