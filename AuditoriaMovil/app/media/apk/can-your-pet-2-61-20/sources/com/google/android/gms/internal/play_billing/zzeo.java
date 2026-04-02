package com.google.android.gms.internal.play_billing;

import java.io.IOException;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzeo implements zzev {
    private final zzek zza;
    private final zzfm zzb;
    private final boolean zzc;
    private final zzcq zzd;

    private zzeo(zzfm zzfmVar, zzcq zzcqVar, zzek zzekVar) {
        this.zzb = zzfmVar;
        this.zzc = zzcqVar.zzc(zzekVar);
        this.zzd = zzcqVar;
        this.zza = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeo zzc(zzfm zzfmVar, zzcq zzcqVar, zzek zzekVar) {
        return new zzeo(zzfmVar, zzcqVar, zzekVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zza(Object obj) {
        zzfm zzfmVar = this.zzb;
        int zzb = zzfmVar.zzb(zzfmVar.zzd(obj));
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final Object zze() {
        zzek zzekVar = this.zza;
        if (zzekVar instanceof zzdd) {
            return ((zzdd) zzekVar).zzj();
        }
        return zzekVar.zzo().zze();
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzf(Object obj) {
        this.zzb.zzg(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzg(Object obj, Object obj2) {
        zzex.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzbp zzbpVar) throws IOException {
        zzdd zzddVar = (zzdd) obj;
        if (zzddVar.zzc == zzfn.zzc()) {
            zzddVar.zzc = zzfn.zzf();
        }
        zzda zzdaVar = (zzda) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzi(Object obj, zzge zzgeVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final boolean zzj(Object obj, Object obj2) {
        zzfm zzfmVar = this.zzb;
        if (zzfmVar.zzd(obj).equals(zzfmVar.zzd(obj2))) {
            if (this.zzc) {
                this.zzd.zza(obj);
                this.zzd.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }
}
