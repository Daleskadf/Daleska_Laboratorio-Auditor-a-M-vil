package n3;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: n3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1488c implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<EnumC1488c> CREATOR = new android.support.v4.media.session.b(23);
    private final String zzb;

    EnumC1488c(String str) {
        this.zzb = str;
    }

    public static EnumC1488c a(String str) {
        EnumC1488c[] values;
        for (EnumC1488c enumC1488c : values()) {
            if (str.equals(enumC1488c.zzb)) {
                return enumC1488c;
            }
        }
        throw new Exception(AbstractC0059i.M("Attachment ", str, " not supported"));
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
