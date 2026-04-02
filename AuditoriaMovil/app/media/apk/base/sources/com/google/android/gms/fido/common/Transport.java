package com.google.android.gms.fido.common;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
/* loaded from: classes.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable");
    
    public static final Parcelable.Creator<Transport> CREATOR = new b(22);
    private final String zzb;

    Transport(String str) {
        this.zzb = str;
    }

    public static Transport a(String str) {
        Transport[] values;
        for (Transport transport : values()) {
            if (str.equals(transport.zzb)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        throw new Exception(AbstractC0059i.M("Transport ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.zzb);
    }
}
