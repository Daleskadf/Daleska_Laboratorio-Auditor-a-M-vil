package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.b;
/* loaded from: classes.dex */
public abstract class zzbp extends zzb implements zzbq {
    public zzbp() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static zzbq asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof zzbq) {
            return (zzbq) queryLocalInterface;
        }
        return new zzbo(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzc.zzb(parcel);
            zzbn newBarcodeScanner = newBarcodeScanner(b.b(parcel.readStrongBinder()), (zzba) zzc.zza(parcel, zzba.CREATOR));
            parcel2.writeNoException();
            if (newBarcodeScanner == null) {
                parcel2.writeStrongBinder(null);
            } else {
                parcel2.writeStrongBinder(newBarcodeScanner.asBinder());
            }
            return true;
        }
        return false;
    }
}
