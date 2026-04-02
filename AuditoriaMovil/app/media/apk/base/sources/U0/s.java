package U0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new N2.f(27);

    /* renamed from: a  reason: collision with root package name */
    public final int f5698a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5699b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5700c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5701d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5702e;
    public final String f;

    public s(int i7, int i8, String str, String str2, String str3, String str4) {
        this.f5698a = i7;
        this.f5699b = i8;
        this.f5700c = str;
        this.f5701d = str2;
        this.f5702e = str3;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f5698a == sVar.f5698a && this.f5699b == sVar.f5699b && TextUtils.equals(this.f5700c, sVar.f5700c) && TextUtils.equals(this.f5701d, sVar.f5701d) && TextUtils.equals(this.f5702e, sVar.f5702e) && TextUtils.equals(this.f, sVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int i10 = ((this.f5698a * 31) + this.f5699b) * 31;
        int i11 = 0;
        String str = this.f5700c;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f5701d;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i13 = (i12 + i8) * 31;
        String str3 = this.f5702e;
        if (str3 != null) {
            i9 = str3.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (i13 + i9) * 31;
        String str4 = this.f;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return i14 + i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f5698a);
        parcel.writeInt(this.f5699b);
        parcel.writeString(this.f5700c);
        parcel.writeString(this.f5701d);
        parcel.writeString(this.f5702e);
        parcel.writeString(this.f);
    }

    public s(Parcel parcel) {
        this.f5698a = parcel.readInt();
        this.f5699b = parcel.readInt();
        this.f5700c = parcel.readString();
        this.f5701d = parcel.readString();
        this.f5702e = parcel.readString();
        this.f = parcel.readString();
    }
}
