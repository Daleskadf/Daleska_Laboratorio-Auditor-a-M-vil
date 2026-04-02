package n3;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: n3.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1477J implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator<EnumC1477J> CREATOR = new U(9);
    private final String zzb;

    EnumC1477J(String str) {
        this.zzb = str;
    }

    public static EnumC1477J a(String str) {
        EnumC1477J[] values;
        for (EnumC1477J enumC1477J : values()) {
            if (str.equals(enumC1477J.zzb)) {
                return enumC1477J;
            }
        }
        throw new Exception(AbstractC0059i.M("TokenBindingStatus ", str, " not supported"));
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
