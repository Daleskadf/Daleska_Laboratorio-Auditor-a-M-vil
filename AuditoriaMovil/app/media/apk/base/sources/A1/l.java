package A1;

import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s3.C1772G;
/* loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new C1772G(8);

    /* renamed from: b  reason: collision with root package name */
    public final int f67b;

    /* renamed from: c  reason: collision with root package name */
    public final int f68c;

    /* renamed from: d  reason: collision with root package name */
    public final int f69d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f70e;
    public final int[] f;

    public l(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f67b = i7;
        this.f68c = i8;
        this.f69d = i9;
        this.f70e = iArr;
        this.f = iArr2;
    }

    @Override // A1.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f67b == lVar.f67b && this.f68c == lVar.f68c && this.f69d == lVar.f69d && Arrays.equals(this.f70e, lVar.f70e) && Arrays.equals(this.f, lVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f70e);
        return Arrays.hashCode(this.f) + ((hashCode + ((((((527 + this.f67b) * 31) + this.f68c) * 31) + this.f69d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f67b);
        parcel.writeInt(this.f68c);
        parcel.writeInt(this.f69d);
        parcel.writeIntArray(this.f70e);
        parcel.writeIntArray(this.f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f67b = parcel.readInt();
        this.f68c = parcel.readInt();
        this.f69d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i7 = x.f2529a;
        this.f70e = createIntArray;
        this.f = parcel.createIntArray();
    }
}
