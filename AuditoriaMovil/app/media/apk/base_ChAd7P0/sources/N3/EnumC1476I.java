package n3;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: n3.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1476I implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");
    
    public static final Parcelable.Creator<EnumC1476I> CREATOR = new U(8);
    private final String zzb;

    EnumC1476I(String str) {
        this.zzb = str;
    }

    public static EnumC1476I a(String str) {
        EnumC1476I[] values;
        for (EnumC1476I enumC1476I : values()) {
            if (str.equals(enumC1476I.zzb)) {
                return enumC1476I;
            }
        }
        throw new Exception(AbstractC0059i.M("Resident key requirement ", str, " not supported"));
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
