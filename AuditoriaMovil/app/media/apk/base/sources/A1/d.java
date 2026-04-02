package A1;

import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s3.C1772G;
/* loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new C1772G(4);

    /* renamed from: b  reason: collision with root package name */
    public final String f46b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f47c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f48d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f49e;
    public final i[] f;

    public d(String str, boolean z7, boolean z8, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f46b = str;
        this.f47c = z7;
        this.f48d = z8;
        this.f49e = strArr;
        this.f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f47c == dVar.f47c && this.f48d == dVar.f48d && x.a(this.f46b, dVar.f46b) && Arrays.equals(this.f49e, dVar.f49e) && Arrays.equals(this.f, dVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = (((527 + (this.f47c ? 1 : 0)) * 31) + (this.f48d ? 1 : 0)) * 31;
        String str = this.f46b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i8 + i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f46b);
        parcel.writeByte(this.f47c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f49e);
        i[] iVarArr = this.f;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f46b = readString;
        this.f47c = parcel.readByte() != 0;
        this.f48d = parcel.readByte() != 0;
        this.f49e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new i[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f[i8] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
