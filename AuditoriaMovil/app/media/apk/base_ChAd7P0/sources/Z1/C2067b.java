package z1;

import H0.E;
import H0.G;
import H0.r;
import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import z0.P;
/* renamed from: z1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2067b implements G {
    public static final Parcelable.Creator<C2067b> CREATOR = new P(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f16869a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16870b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16871c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16872d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16873e;
    public final int f;

    public C2067b(int i7, String str, String str2, String str3, boolean z7, int i8) {
        K0.a.e(i8 == -1 || i8 > 0);
        this.f16869a = i7;
        this.f16870b = str;
        this.f16871c = str2;
        this.f16872d = str3;
        this.f16873e = z7;
        this.f = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z1.C2067b a(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C2067b.a(java.util.Map):z1.b");
    }

    @Override // H0.G
    public final /* synthetic */ r b() {
        return null;
    }

    @Override // H0.G
    public final void c(E e7) {
        String str = this.f16871c;
        if (str != null) {
            e7.f1667v = str;
        }
        String str2 = this.f16870b;
        if (str2 != null) {
            e7.f1666u = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2067b.class != obj.getClass()) {
            return false;
        }
        C2067b c2067b = (C2067b) obj;
        if (this.f16869a == c2067b.f16869a && x.a(this.f16870b, c2067b.f16870b) && x.a(this.f16871c, c2067b.f16871c) && x.a(this.f16872d, c2067b.f16872d) && this.f16873e == c2067b.f16873e && this.f == c2067b.f) {
            return true;
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = (527 + this.f16869a) * 31;
        int i10 = 0;
        String str = this.f16870b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (i9 + i7) * 31;
        String str2 = this.f16871c;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (i11 + i8) * 31;
        String str3 = this.f16872d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((i12 + i10) * 31) + (this.f16873e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f16871c + "\", genre=\"" + this.f16870b + "\", bitrate=" + this.f16869a + ", metadataInterval=" + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f16869a);
        parcel.writeString(this.f16870b);
        parcel.writeString(this.f16871c);
        parcel.writeString(this.f16872d);
        int i8 = x.f2529a;
        parcel.writeInt(this.f16873e ? 1 : 0);
        parcel.writeInt(this.f);
    }

    public C2067b(Parcel parcel) {
        this.f16869a = parcel.readInt();
        this.f16870b = parcel.readString();
        this.f16871c = parcel.readString();
        this.f16872d = parcel.readString();
        int i7 = x.f2529a;
        this.f16873e = parcel.readInt() != 0;
        this.f = parcel.readInt();
    }
}
