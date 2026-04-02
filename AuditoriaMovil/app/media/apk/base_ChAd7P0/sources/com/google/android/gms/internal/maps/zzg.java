package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC1109a;
import io.flutter.plugins.pathprovider.b;
import s3.C1790r;
/* loaded from: classes.dex */
public final class zzg extends zza implements zzi {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC1109a zzd() {
        return b.d(zzJ(4, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC1109a zze(float f) {
        Parcel zza = zza();
        zza.writeFloat(f);
        return b.d(zzJ(5, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC1109a zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        return b.d(zzJ(2, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC1109a zzg(Bitmap bitmap) {
        Parcel zza = zza();
        zzc.zzd(zza, bitmap);
        return b.d(zzJ(6, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC1109a zzh(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        return b.d(zzJ(3, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC1109a zzi(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        return b.d(zzJ(7, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC1109a zzj(C1790r c1790r) {
        Parcel zza = zza();
        zzc.zzd(zza, c1790r);
        return b.d(zzJ(8, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final InterfaceC1109a zzk(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        return b.d(zzJ(1, zza));
    }
}
