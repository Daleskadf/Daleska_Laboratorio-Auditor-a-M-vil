package y1;

import H0.E;
import H0.G;
import H0.I;
import H0.r;
import K0.q;
import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s3.C1770E;
import z3.h;
/* renamed from: y1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2033a implements G {
    public static final Parcelable.Creator<C2033a> CREATOR = new C1770E(24);

    /* renamed from: X  reason: collision with root package name */
    public final int f16604X;

    /* renamed from: Y  reason: collision with root package name */
    public final byte[] f16605Y;

    /* renamed from: a  reason: collision with root package name */
    public final int f16606a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16607b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16608c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16609d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16610e;
    public final int f;

    public C2033a(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f16606a = i7;
        this.f16607b = str;
        this.f16608c = str2;
        this.f16609d = i8;
        this.f16610e = i9;
        this.f = i10;
        this.f16604X = i11;
        this.f16605Y = bArr;
    }

    public static C2033a a(q qVar) {
        int h8 = qVar.h();
        String l8 = I.l(qVar.s(qVar.h(), h.f16884a));
        String s7 = qVar.s(qVar.h(), h.f16886c);
        int h9 = qVar.h();
        int h10 = qVar.h();
        int h11 = qVar.h();
        int h12 = qVar.h();
        int h13 = qVar.h();
        byte[] bArr = new byte[h13];
        qVar.f(bArr, 0, h13);
        return new C2033a(h8, l8, s7, h9, h10, h11, h12, bArr);
    }

    @Override // H0.G
    public final /* synthetic */ r b() {
        return null;
    }

    @Override // H0.G
    public final void c(E e7) {
        e7.a(this.f16605Y, this.f16606a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2033a.class != obj.getClass()) {
            return false;
        }
        C2033a c2033a = (C2033a) obj;
        if (this.f16606a == c2033a.f16606a && this.f16607b.equals(c2033a.f16607b) && this.f16608c.equals(c2033a.f16608c) && this.f16609d == c2033a.f16609d && this.f16610e == c2033a.f16610e && this.f == c2033a.f && this.f16604X == c2033a.f16604X && Arrays.equals(this.f16605Y, c2033a.f16605Y)) {
            return true;
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.f16607b.hashCode();
        int hashCode2 = this.f16608c.hashCode();
        return Arrays.hashCode(this.f16605Y) + ((((((((((hashCode2 + ((hashCode + ((527 + this.f16606a) * 31)) * 31)) * 31) + this.f16609d) * 31) + this.f16610e) * 31) + this.f) * 31) + this.f16604X) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f16607b + ", description=" + this.f16608c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f16606a);
        parcel.writeString(this.f16607b);
        parcel.writeString(this.f16608c);
        parcel.writeInt(this.f16609d);
        parcel.writeInt(this.f16610e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.f16604X);
        parcel.writeByteArray(this.f16605Y);
    }

    public C2033a(Parcel parcel) {
        this.f16606a = parcel.readInt();
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f16607b = readString;
        this.f16608c = parcel.readString();
        this.f16609d = parcel.readInt();
        this.f16610e = parcel.readInt();
        this.f = parcel.readInt();
        this.f16604X = parcel.readInt();
        this.f16605Y = parcel.createByteArray();
    }
}
