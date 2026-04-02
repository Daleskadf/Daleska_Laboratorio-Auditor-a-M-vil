package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.view.Surface;
/* loaded from: classes.dex */
public abstract class zzci extends zzb implements zzcj {
    public zzci() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return false;
                        }
                        zze(zzc.zzf(parcel));
                    } else {
                        zzc();
                    }
                } else {
                    zzf();
                }
            } else {
                zzd(parcel.readInt());
            }
        } else {
            zzb(parcel.readInt(), parcel.readInt(), (Surface) zzc.zza(parcel, Surface.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
