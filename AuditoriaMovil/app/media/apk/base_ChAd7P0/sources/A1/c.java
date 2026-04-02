package A1;

import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s3.C1772G;
/* loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new C1772G(3);

    /* renamed from: X  reason: collision with root package name */
    public final i[] f41X;

    /* renamed from: b  reason: collision with root package name */
    public final String f42b;

    /* renamed from: c  reason: collision with root package name */
    public final int f43c;

    /* renamed from: d  reason: collision with root package name */
    public final int f44d;

    /* renamed from: e  reason: collision with root package name */
    public final long f45e;
    public final long f;

    public c(String str, int i7, int i8, long j, long j8, i[] iVarArr) {
        super("CHAP");
        this.f42b = str;
        this.f43c = i7;
        this.f44d = i8;
        this.f45e = j;
        this.f = j8;
        this.f41X = iVarArr;
    }

    @Override // A1.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f43c == cVar.f43c && this.f44d == cVar.f44d && this.f45e == cVar.f45e && this.f == cVar.f && x.a(this.f42b, cVar.f42b) && Arrays.equals(this.f41X, cVar.f41X)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = (((((((527 + this.f43c) * 31) + this.f44d) * 31) + ((int) this.f45e)) * 31) + ((int) this.f)) * 31;
        String str = this.f42b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i8 + i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f42b);
        parcel.writeInt(this.f43c);
        parcel.writeInt(this.f44d);
        parcel.writeLong(this.f45e);
        parcel.writeLong(this.f);
        i[] iVarArr = this.f41X;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f42b = readString;
        this.f43c = parcel.readInt();
        this.f44d = parcel.readInt();
        this.f45e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f41X = new i[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f41X[i8] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
