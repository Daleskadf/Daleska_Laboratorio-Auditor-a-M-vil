package n3;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: n3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1490e implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<EnumC1490e> CREATOR = new U(14);
    private final String zzb;

    EnumC1490e(String str) {
        this.zzb = str;
    }

    public static EnumC1490e a(String str) {
        EnumC1490e[] values;
        for (EnumC1490e enumC1490e : values()) {
            if (str.equals(enumC1490e.zzb)) {
                return enumC1490e;
            }
        }
        throw new Exception(AbstractC0059i.M("Attestation conveyance preference ", str, " not supported"));
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
