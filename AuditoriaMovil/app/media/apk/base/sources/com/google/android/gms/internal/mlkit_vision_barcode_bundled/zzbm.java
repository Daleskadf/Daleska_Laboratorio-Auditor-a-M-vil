package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import i3.b;
import java.util.List;
/* loaded from: classes.dex */
public abstract class zzbm extends zzb implements zzbn {
    public zzbm() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            return false;
                        }
                        zzc.zzb(parcel);
                        zze((zzbe) zzc.zza(parcel, zzbe.CREATOR));
                        parcel2.writeNoException();
                    } else {
                        zzc.zzb(parcel);
                        List zzc = zzc(b.b(parcel.readStrongBinder()), (zzcc) zzc.zza(parcel, zzcc.CREATOR), (zzbc) zzc.zza(parcel, zzbc.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeTypedList(zzc);
                    }
                } else {
                    zzc.zzb(parcel);
                    List zzb = zzb(b.b(parcel.readStrongBinder()), (zzcc) zzc.zza(parcel, zzcc.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedList(zzb);
                }
            } else {
                zzf();
                parcel2.writeNoException();
            }
        } else {
            zzd();
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public void zze(zzbe zzbeVar) {
        zzd();
    }
}
