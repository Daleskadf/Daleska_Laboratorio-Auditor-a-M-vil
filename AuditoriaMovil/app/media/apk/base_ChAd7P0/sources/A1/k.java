package A1;

import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import s3.C1772G;
/* loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new C1772G(7);

    /* renamed from: b  reason: collision with root package name */
    public final String f64b;

    /* renamed from: c  reason: collision with root package name */
    public final String f65c;

    /* renamed from: d  reason: collision with root package name */
    public final String f66d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f64b = str;
        this.f65c = str2;
        this.f66d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (x.a(this.f65c, kVar.f65c) && x.a(this.f64b, kVar.f64b) && x.a(this.f66d, kVar.f66d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = 0;
        String str = this.f64b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (527 + i7) * 31;
        String str2 = this.f65c;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f66d;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }

    @Override // A1.i
    public final String toString() {
        return this.f62a + ": domain=" + this.f64b + ", description=" + this.f65c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f62a);
        parcel.writeString(this.f64b);
        parcel.writeString(this.f66d);
    }

    public k(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f64b = readString;
        this.f65c = parcel.readString();
        this.f66d = parcel.readString();
    }
}
