package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC1109a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzyl extends zza implements IInterface {
    public zzyl(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final List zzd(InterfaceC1109a interfaceC1109a, zzyu zzyuVar) {
        Parcel zza = zza();
        zzc.zzb(zza, interfaceC1109a);
        zzc.zza(zza, zzyuVar);
        Parcel zzb = zzb(3, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzyb.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void zze() {
        zzc(1, zza());
    }

    public final void zzf() {
        zzc(2, zza());
    }
}
