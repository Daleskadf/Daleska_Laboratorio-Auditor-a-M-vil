package n3;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public enum W implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<W> CREATOR = new U(12);
    private final String zze;

    W(String str) {
        this.zze = str;
    }

    public static W a(String str) {
        W[] values;
        for (W w2 : values()) {
            if (str.equals(w2.zze)) {
                return w2;
            }
        }
        throw new Exception(AbstractC0059i.M("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.zze);
    }
}
