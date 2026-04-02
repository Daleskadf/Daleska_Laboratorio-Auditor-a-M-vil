package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n3.C1469B;
import n3.C1510y;
/* loaded from: classes.dex */
public final class zzs extends zza implements IInterface {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, C1510y c1510y) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, c1510y);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, C1469B c1469b) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, c1469b);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
