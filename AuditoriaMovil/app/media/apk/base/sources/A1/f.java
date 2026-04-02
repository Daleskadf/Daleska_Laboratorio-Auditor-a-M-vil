package A1;

import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s3.C1772G;
/* loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new C1772G(6);

    /* renamed from: b  reason: collision with root package name */
    public final String f53b;

    /* renamed from: c  reason: collision with root package name */
    public final String f54c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f56e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f53b = str;
        this.f54c = str2;
        this.f55d = str3;
        this.f56e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (x.a(this.f53b, fVar.f53b) && x.a(this.f54c, fVar.f54c) && x.a(this.f55d, fVar.f55d) && Arrays.equals(this.f56e, fVar.f56e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = 0;
        String str = this.f53b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (527 + i7) * 31;
        String str2 = this.f54c;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f55d;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return Arrays.hashCode(this.f56e) + ((i11 + i9) * 31);
    }

    @Override // A1.i
    public final String toString() {
        return this.f62a + ": mimeType=" + this.f53b + ", filename=" + this.f54c + ", description=" + this.f55d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f53b);
        parcel.writeString(this.f54c);
        parcel.writeString(this.f55d);
        parcel.writeByteArray(this.f56e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f53b = readString;
        this.f54c = parcel.readString();
        this.f55d = parcel.readString();
        this.f56e = parcel.createByteArray();
    }
}
