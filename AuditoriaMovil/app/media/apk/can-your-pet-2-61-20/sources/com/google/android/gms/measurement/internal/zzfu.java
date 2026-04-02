package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzfu extends com.google.android.gms.internal.measurement.zzbu implements zzfs {
    @Override // com.google.android.gms.measurement.internal.zzfs
    public final zzaj zza(zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        Parcel zza = zza(21, a_);
        zzaj zzajVar = (zzaj) com.google.android.gms.internal.measurement.zzbw.zza(zza, zzaj.CREATOR);
        zza.recycle();
        return zzajVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final String zzb(zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        Parcel zza = zza(11, a_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zzna> zza(zzo zzoVar, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, bundle);
        Parcel zza = zza(24, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzna.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zznt> zza(zzo zzoVar, boolean z) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, z);
        Parcel zza = zza(7, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zznt.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zzae> zza(String str, String str2, zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        Parcel zza = zza(16, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzae.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zzae> zza(String str, String str2, String str3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        Parcel zza = zza(17, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzae.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zznt> zza(String str, String str2, boolean z, zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, z);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        Parcel zza = zza(14, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zznt.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zznt> zza(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, z);
        Parcel zza = zza(15, a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zznt.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zzc(zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        zzb(4, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(zzbd zzbdVar, zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzbdVar);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        zzb(1, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(zzbd zzbdVar, String str, String str2) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzbdVar);
        a_.writeString(str);
        a_.writeString(str2);
        zzb(5, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zzd(zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        zzb(18, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(zzae zzaeVar, zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzaeVar);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        zzb(12, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(zzae zzaeVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzaeVar);
        zzb(13, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zze(zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        zzb(20, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(long j, String str, String str2, String str3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        zzb(10, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(Bundle bundle, zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, bundle);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        zzb(19, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zzf(zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        zzb(26, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zzg(zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        zzb(6, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zzh(zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        zzb(25, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(zznt zzntVar, zzo zzoVar) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzntVar);
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzoVar);
        zzb(2, a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final byte[] zza(zzbd zzbdVar, String str) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.measurement.zzbw.zza(a_, zzbdVar);
        a_.writeString(str);
        Parcel zza = zza(9, a_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }
}
