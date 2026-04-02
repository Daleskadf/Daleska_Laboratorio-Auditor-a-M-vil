package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public abstract class zzao extends com.google.android.gms.internal.cast.zzb implements zzap {
    public zzao() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                } else {
                    String zzc = zzc();
                    parcel2.writeNoException();
                    parcel2.writeString(zzc);
                }
            } else {
                boolean zzd = zzd();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.zzc.zzb(parcel2, zzd);
            }
        } else {
            IObjectWrapper zzb = zzb(parcel.readString());
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zze(parcel2, zzb);
        }
        return true;
    }
}
