package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC1109a;
/* loaded from: classes.dex */
public final class zzym extends zza implements zzyo {
    public zzym(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzyo
    public final zzyl zzd(InterfaceC1109a interfaceC1109a, zzyd zzydVar) {
        zzyl zzylVar;
        Parcel zza = zza();
        zzc.zzb(zza, interfaceC1109a);
        zzc.zza(zza, zzydVar);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzylVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            if (queryLocalInterface instanceof zzyl) {
                zzylVar = (zzyl) queryLocalInterface;
            } else {
                zzylVar = new zzyl(readStrongBinder);
            }
        }
        zzb.recycle();
        return zzylVar;
    }
}
