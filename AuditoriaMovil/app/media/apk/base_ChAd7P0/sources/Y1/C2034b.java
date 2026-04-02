package y1;

import H0.E;
import H0.G;
import H0.r;
import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import r3.AbstractC1740d;
import s3.C1770E;
/* renamed from: y1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2034b implements G {
    public static final Parcelable.Creator<C2034b> CREATOR = new C1770E(25);

    /* renamed from: a  reason: collision with root package name */
    public final String f16611a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16612b;

    public C2034b(String str, String str2) {
        this.f16611a = AbstractC1740d.B(str);
        this.f16612b = str2;
    }

    @Override // H0.G
    public final /* synthetic */ r b() {
        return null;
    }

    @Override // H0.G
    public final void c(E e7) {
        String str = this.f16611a;
        str.getClass();
        String str2 = this.f16612b;
        char c8 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c8 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c8 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c8 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c8 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c8 = 4;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                e7.f1650c = str2;
                return;
            case 1:
                e7.f1648a = str2;
                return;
            case 2:
                e7.f1652e = str2;
                return;
            case 3:
                e7.f1651d = str2;
                return;
            case 4:
                e7.f1649b = str2;
                return;
            default:
                return;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2034b c2034b = (C2034b) obj;
        if (this.f16611a.equals(c2034b.f16611a) && this.f16612b.equals(c2034b.f16612b)) {
            return true;
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        return this.f16612b.hashCode() + ((this.f16611a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return "VC: " + this.f16611a + "=" + this.f16612b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f16611a);
        parcel.writeString(this.f16612b);
    }

    public C2034b(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = x.f2529a;
        this.f16611a = readString;
        this.f16612b = parcel.readString();
    }
}
