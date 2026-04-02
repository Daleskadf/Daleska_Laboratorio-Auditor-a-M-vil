package N2;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import s3.C1772G;
/* loaded from: classes.dex */
public final class a extends X2.a {
    public static final Parcelable.Creator<a> CREATOR = new C1772G(29);

    /* renamed from: a  reason: collision with root package name */
    public final int f3381a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3382b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3383c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3384d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3385e;
    public final String f;

    public a(int i7, long j, String str, int i8, int i9, String str2) {
        this.f3381a = i7;
        this.f3382b = j;
        I.i(str);
        this.f3383c = str;
        this.f3384d = i8;
        this.f3385e = i9;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        if (this.f3381a != aVar.f3381a || this.f3382b != aVar.f3382b || !I.m(this.f3383c, aVar.f3383c) || this.f3384d != aVar.f3384d || this.f3385e != aVar.f3385e || !I.m(this.f, aVar.f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3381a), Long.valueOf(this.f3382b), this.f3383c, Integer.valueOf(this.f3384d), Integer.valueOf(this.f3385e), this.f});
    }

    public final String toString() {
        String str;
        int i7 = this.f3384d;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "RENAMED_TO";
                    }
                } else {
                    str = "RENAMED_FROM";
                }
            } else {
                str = "REMOVED";
            }
        } else {
            str = "ADDED";
        }
        StringBuilder sb = new StringBuilder("AccountChangeEvent {accountName = ");
        sb.append(this.f3383c);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(this.f);
        sb.append(", eventIndex = ");
        return AbstractC0059i.B(sb, this.f3385e, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f3381a);
        m5.d.K(parcel, 2, 8);
        parcel.writeLong(this.f3382b);
        m5.d.B(parcel, 3, this.f3383c, false);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f3384d);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f3385e);
        m5.d.B(parcel, 6, this.f, false);
        m5.d.J(G2, parcel);
    }
}
