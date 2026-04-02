package x1;

import H0.C0137q;
import H0.E;
import H0.G;
import H0.I;
import H0.r;
import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s3.C1770E;
/* renamed from: x1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1985a implements G {
    public static final Parcelable.Creator<C1985a> CREATOR;

    /* renamed from: X  reason: collision with root package name */
    public static final r f16490X;

    /* renamed from: Y  reason: collision with root package name */
    public static final r f16491Y;

    /* renamed from: a  reason: collision with root package name */
    public final String f16492a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16493b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16494c;

    /* renamed from: d  reason: collision with root package name */
    public final long f16495d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f16496e;
    public int f;

    static {
        C0137q c0137q = new C0137q();
        c0137q.f1850l = I.l("application/id3");
        f16490X = new r(c0137q);
        C0137q c0137q2 = new C0137q();
        c0137q2.f1850l = I.l("application/x-scte35");
        f16491Y = new r(c0137q2);
        CREATOR = new C1770E(23);
    }

    public C1985a(String str, String str2, long j, long j8, byte[] bArr) {
        this.f16492a = str;
        this.f16493b = str2;
        this.f16494c = j;
        this.f16495d = j8;
        this.f16496e = bArr;
    }

    @Override // H0.G
    public final r b() {
        String str = this.f16492a;
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c8 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c8 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c8 = 2;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return f16491Y;
            case 1:
            case 2:
                return f16490X;
            default:
                return null;
        }
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
        if (obj == null || C1985a.class != obj.getClass()) {
            return false;
        }
        C1985a c1985a = (C1985a) obj;
        if (this.f16494c == c1985a.f16494c && this.f16495d == c1985a.f16495d && x.a(this.f16492a, c1985a.f16492a) && x.a(this.f16493b, c1985a.f16493b) && Arrays.equals(this.f16496e, c1985a.f16496e)) {
            return true;
        }
        return false;
    }

    @Override // H0.G
    public final byte[] h() {
        if (b() != null) {
            return this.f16496e;
        }
        return null;
    }

    public final int hashCode() {
        int i7;
        if (this.f == 0) {
            int i8 = 0;
            String str = this.f16492a;
            if (str != null) {
                i7 = str.hashCode();
            } else {
                i7 = 0;
            }
            int i9 = (527 + i7) * 31;
            String str2 = this.f16493b;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            long j = this.f16494c;
            long j8 = this.f16495d;
            this.f = Arrays.hashCode(this.f16496e) + ((((((i9 + i8) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f16492a + ", id=" + this.f16495d + ", durationMs=" + this.f16494c + ", value=" + this.f16493b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f16492a);
        parcel.writeString(this.f16493b);
        parcel.writeLong(this.f16494c);
        parcel.writeLong(this.f16495d);
        parcel.writeByteArray(this.f16496e);
    }

    public C1985a(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f16492a = readString;
        this.f16493b = parcel.readString();
        this.f16494c = parcel.readLong();
        this.f16495d = parcel.readLong();
        this.f16496e = parcel.createByteArray();
    }
}
