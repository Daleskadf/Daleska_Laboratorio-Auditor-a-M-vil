package H0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import s3.C1772G;
/* renamed from: H0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134n implements Parcelable {
    public static final Parcelable.Creator<C0134n> CREATOR = new C1772G(23);

    /* renamed from: a  reason: collision with root package name */
    public int f1822a;

    /* renamed from: b  reason: collision with root package name */
    public final UUID f1823b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1824c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1825d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f1826e;

    public C0134n(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f1823b = uuid;
        this.f1824c = str;
        str2.getClass();
        this.f1825d = I.l(str2);
        this.f1826e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0134n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0134n c0134n = (C0134n) obj;
        if (!K0.x.a(this.f1824c, c0134n.f1824c) || !K0.x.a(this.f1825d, c0134n.f1825d) || !K0.x.a(this.f1823b, c0134n.f1823b) || !Arrays.equals(this.f1826e, c0134n.f1826e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f1822a == 0) {
            int hashCode2 = this.f1823b.hashCode() * 31;
            String str = this.f1824c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = this.f1825d.hashCode();
            this.f1822a = Arrays.hashCode(this.f1826e) + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31);
        }
        return this.f1822a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f1823b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f1824c);
        parcel.writeString(this.f1825d);
        parcel.writeByteArray(this.f1826e);
    }

    public C0134n(Parcel parcel) {
        this.f1823b = new UUID(parcel.readLong(), parcel.readLong());
        this.f1824c = parcel.readString();
        String readString = parcel.readString();
        int i7 = K0.x.f2529a;
        this.f1825d = readString;
        this.f1826e = parcel.createByteArray();
    }
}
