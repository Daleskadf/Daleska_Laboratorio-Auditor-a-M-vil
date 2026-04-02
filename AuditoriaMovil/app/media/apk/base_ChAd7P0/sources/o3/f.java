package o3;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
import n3.c0;
/* loaded from: classes.dex */
public enum f implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");
    
    public static final Parcelable.Creator<f> CREATOR = new c0(6);
    private final String zzb;

    f(String str) {
        this.zzb = str;
    }

    public static f a(String str) {
        f[] values;
        if (str == null) {
            return UNKNOWN;
        }
        for (f fVar : values()) {
            if (str.equals(fVar.zzb)) {
                return fVar;
            }
        }
        throw new Exception(AbstractC0059i.M("Protocol version ", str, " not supported"));
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
