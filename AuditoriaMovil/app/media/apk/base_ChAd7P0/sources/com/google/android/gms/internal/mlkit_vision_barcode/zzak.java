package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC1109a;
/* loaded from: classes.dex */
public final class zzak extends zza implements zzam {
    public zzak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzam
    public final zzaj zzd(InterfaceC1109a interfaceC1109a, zzah zzahVar) {
        zzaj zzajVar;
        Parcel zza = zza();
        zzc.zzb(zza, interfaceC1109a);
        zzc.zza(zza, zzahVar);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzajVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof zzaj) {
                zzajVar = (zzaj) queryLocalInterface;
            } else {
                zzajVar = new zzaj(readStrongBinder);
            }
        }
        zzb.recycle();
        return zzajVar;
    }
}
