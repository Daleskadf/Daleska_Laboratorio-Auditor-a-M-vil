package A1;

import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import s3.C1772G;
/* loaded from: classes.dex */
public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new C1772G(11);

    /* renamed from: b  reason: collision with root package name */
    public final String f75b;

    /* renamed from: c  reason: collision with root package name */
    public final String f76c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f75b = str2;
        this.f76c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f62a.equals(oVar.f62a) && x.a(this.f75b, oVar.f75b) && x.a(this.f76c, oVar.f76c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (this.f62a.hashCode() + 527) * 31;
        int i8 = 0;
        String str = this.f75b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = (hashCode + i7) * 31;
        String str2 = this.f76c;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    @Override // A1.i
    public final String toString() {
        return this.f62a + ": url=" + this.f76c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f62a);
        parcel.writeString(this.f75b);
        parcel.writeString(this.f76c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = K0.x.f2529a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f75b = r0
            java.lang.String r3 = r3.readString()
            r2.f76c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.o.<init>(android.os.Parcel):void");
    }
}
