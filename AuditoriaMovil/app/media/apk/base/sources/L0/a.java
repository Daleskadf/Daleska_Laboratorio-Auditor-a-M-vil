package L0;

import H0.E;
import H0.G;
import H0.r;
import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import r3.AbstractC1740d;
import s3.C1772G;
/* loaded from: classes.dex */
public final class a implements G {
    public static final Parcelable.Creator<a> CREATOR = new C1772G(26);

    /* renamed from: a  reason: collision with root package name */
    public final String f2820a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2821b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2822c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2823d;

    public a(String str, byte[] bArr, int i7, int i8) {
        this.f2820a = str;
        this.f2821b = bArr;
        this.f2822c = i7;
        this.f2823d = i8;
    }

    @Override // H0.G
    public final /* synthetic */ r b() {
        return null;
    }

    @Override // H0.G
    public final /* synthetic */ void c(E e7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2820a.equals(aVar.f2820a) && Arrays.equals(this.f2821b, aVar.f2821b) && this.f2822c == aVar.f2822c && this.f2823d == aVar.f2823d) {
            return true;
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f2821b) + ((this.f2820a.hashCode() + 527) * 31)) * 31) + this.f2822c) * 31) + this.f2823d;
    }

    public final String toString() {
        String p7;
        byte[] bArr = this.f2821b;
        int i7 = this.f2823d;
        if (i7 != 1) {
            if (i7 != 23) {
                if (i7 != 67) {
                    p7 = x.Y(bArr);
                } else {
                    p7 = String.valueOf(AbstractC1740d.n(bArr));
                }
            } else {
                p7 = String.valueOf(Float.intBitsToFloat(AbstractC1740d.n(bArr)));
            }
        } else {
            p7 = x.p(bArr);
        }
        return "mdta: key=" + this.f2820a + ", value=" + p7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f2820a);
        parcel.writeByteArray(this.f2821b);
        parcel.writeInt(this.f2822c);
        parcel.writeInt(this.f2823d);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f2820a = readString;
        this.f2821b = parcel.createByteArray();
        this.f2822c = parcel.readInt();
        this.f2823d = parcel.readInt();
    }
}
