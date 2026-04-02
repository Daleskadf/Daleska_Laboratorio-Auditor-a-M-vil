package A1;

import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import s3.C1772G;
/* loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new C1772G(5);

    /* renamed from: b  reason: collision with root package name */
    public final String f50b;

    /* renamed from: c  reason: collision with root package name */
    public final String f51c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f50b = str;
        this.f51c = str2;
        this.f52d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (x.a(this.f51c, eVar.f51c) && x.a(this.f50b, eVar.f50b) && x.a(this.f52d, eVar.f52d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = 0;
        String str = this.f50b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (527 + i7) * 31;
        String str2 = this.f51c;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f52d;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }

    @Override // A1.i
    public final String toString() {
        return this.f62a + ": language=" + this.f50b + ", description=" + this.f51c + ", text=" + this.f52d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f62a);
        parcel.writeString(this.f50b);
        parcel.writeString(this.f52d);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f50b = readString;
        this.f51c = parcel.readString();
        this.f52d = parcel.readString();
    }
}
