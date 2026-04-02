package A1;

import H0.E;
import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s3.C1772G;
/* loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C1772G(1);

    /* renamed from: b  reason: collision with root package name */
    public final String f36b;

    /* renamed from: c  reason: collision with root package name */
    public final String f37c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f39e;

    public a(int i7, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f36b = str;
        this.f37c = str2;
        this.f38d = i7;
        this.f39e = bArr;
    }

    @Override // A1.i, H0.G
    public final void c(E e7) {
        e7.a(this.f39e, this.f38d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f38d == aVar.f38d && x.a(this.f36b, aVar.f36b) && x.a(this.f37c, aVar.f37c) && Arrays.equals(this.f39e, aVar.f39e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = (527 + this.f38d) * 31;
        int i9 = 0;
        String str = this.f36b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (i8 + i7) * 31;
        String str2 = this.f37c;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return Arrays.hashCode(this.f39e) + ((i10 + i9) * 31);
    }

    @Override // A1.i
    public final String toString() {
        return this.f62a + ": mimeType=" + this.f36b + ", description=" + this.f37c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f36b);
        parcel.writeString(this.f37c);
        parcel.writeInt(this.f38d);
        parcel.writeByteArray(this.f39e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f36b = readString;
        this.f37c = parcel.readString();
        this.f38d = parcel.readInt();
        this.f39e = parcel.createByteArray();
    }
}
