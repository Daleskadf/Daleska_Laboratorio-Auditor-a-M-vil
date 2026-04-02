package A1;

import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s3.C1772G;
/* loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new C1772G(9);

    /* renamed from: b  reason: collision with root package name */
    public final String f71b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f72c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f71b = str;
        this.f72c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (x.a(this.f71b, mVar.f71b) && Arrays.equals(this.f72c, mVar.f72c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f71b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f72c) + ((527 + i7) * 31);
    }

    @Override // A1.i
    public final String toString() {
        return this.f62a + ": owner=" + this.f71b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f71b);
        parcel.writeByteArray(this.f72c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f71b = readString;
        this.f72c = parcel.createByteArray();
    }
}
