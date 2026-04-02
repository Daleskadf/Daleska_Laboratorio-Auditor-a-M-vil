package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import com.google.android.gms.internal.p002firebaseauthapi.zzjq;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjs  reason: invalid package */
/* loaded from: classes.dex */
public final class zzjs extends zzkv {
    private final zzjq zza;
    private final ECPoint zzb;
    private final zzzn zzc;
    private final zzzn zzd;
    private final Integer zze;

    private zzjs(zzjq zzjqVar, ECPoint eCPoint, zzzn zzznVar, zzzn zzznVar2, Integer num) {
        this.zza = zzjqVar;
        this.zzb = eCPoint;
        this.zzc = zzznVar;
        this.zzd = zzznVar2;
        this.zze = num;
    }

    public static zzjs zza(zzjq zzjqVar, zzzn zzznVar, Integer num) {
        if (zzjqVar.zzd().equals(zzjq.zza.zzd)) {
            zzb(zzjqVar.zzg(), num);
            if (zzznVar.zza() == 32) {
                return new zzjs(zzjqVar, null, zzznVar, zza(zzjqVar.zzg(), num), num);
            }
            throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
        }
        throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
    }

    public final zzjq zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkv
    public final zzzn zzc() {
        return this.zzd;
    }

    public final zzzn zzd() {
        return this.zzc;
    }

    public final ECPoint zze() {
        return this.zzb;
    }

    private static void zzb(zzjq.zze zzeVar, Integer num) {
        zzjq.zze zzeVar2 = zzjq.zze.zzc;
        if (!zzeVar.equals(zzeVar2) && num == null) {
            throw new GeneralSecurityException(AbstractC0059i.M("'idRequirement' must be non-null for ", String.valueOf(zzeVar), " variant."));
        }
        if (zzeVar.equals(zzeVar2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public static zzjs zza(zzjq zzjqVar, ECPoint eCPoint, Integer num) {
        EllipticCurve curve;
        if (!zzjqVar.zzd().equals(zzjq.zza.zzd)) {
            zzb(zzjqVar.zzg(), num);
            zzjq.zza zzd = zzjqVar.zzd();
            if (zzd == zzjq.zza.zza) {
                curve = zzmt.zza.getCurve();
            } else if (zzd == zzjq.zza.zzb) {
                curve = zzmt.zzb.getCurve();
            } else if (zzd == zzjq.zza.zzc) {
                curve = zzmt.zzc.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzd)));
            }
            zzmt.zza(eCPoint, curve);
            return new zzjs(zzjqVar, eCPoint, null, zza(zzjqVar.zzg(), num), num);
        }
        throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
    }

    private static zzzn zza(zzjq.zze zzeVar, Integer num) {
        if (zzeVar == zzjq.zze.zzc) {
            return zzor.zza;
        }
        if (num != null) {
            if (zzeVar == zzjq.zze.zzb) {
                return zzor.zza(num.intValue());
            }
            if (zzeVar == zzjq.zze.zza) {
                return zzor.zzb(num.intValue());
            }
            throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(zzeVar)));
        }
        throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(zzeVar)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zze;
    }
}
