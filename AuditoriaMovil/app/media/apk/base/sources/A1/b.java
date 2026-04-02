package A1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s3.C1772G;
/* loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new C1772G(2);

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f40b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f40b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f62a.equals(bVar.f62a) && Arrays.equals(this.f40b, bVar.f40b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40b) + ((this.f62a.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f62a);
        parcel.writeByteArray(this.f40b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = K0.x.f2529a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f40b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.b.<init>(android.os.Parcel):void");
    }
}
