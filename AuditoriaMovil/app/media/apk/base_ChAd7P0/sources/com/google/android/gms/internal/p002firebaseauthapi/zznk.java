package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznk  reason: invalid package */
/* loaded from: classes.dex */
public final class zznk<P> extends zznl<P> implements zzci<P> {
    public zznk(String str, Class<P> cls, zzalw<? extends zzaln> zzalwVar) {
        super(str, cls, zzwb.zza.ASYMMETRIC_PRIVATE, zzalwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final zzwb zzc(zzaiw zzaiwVar) {
        zzbo zza = zzom.zza().zza((zzom) zzpn.zza(this.zza, zzaiwVar, this.zzb, zzxd.RAW, null), zzbl.zza());
        if (zza instanceof zzcf) {
            zzpn zzpnVar = (zzpn) zzom.zza().zza(((zzcf) zza).zzb(), zzpn.class, zzbl.zza());
            return (zzwb) ((zzakg) zzwb.zza().zza(zzpnVar.zzf()).zza(zzpnVar.zzd()).zza(zzpnVar.zza()).zze());
        }
        throw new GeneralSecurityException("Key not private key");
    }
}
