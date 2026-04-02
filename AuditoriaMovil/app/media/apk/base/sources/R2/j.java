package R2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class j extends X2.a {
    public static final Parcelable.Creator<j> CREATOR = new N2.f(13);

    /* renamed from: a  reason: collision with root package name */
    public final String f4710a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4711b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4712c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4713d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4714e;
    public final int f;

    public j(String str, String str2, String str3, String str4, boolean z7, int i7) {
        I.i(str);
        this.f4710a = str;
        this.f4711b = str2;
        this.f4712c = str3;
        this.f4713d = str4;
        this.f4714e = z7;
        this.f = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!I.m(this.f4710a, jVar.f4710a) || !I.m(this.f4713d, jVar.f4713d) || !I.m(this.f4711b, jVar.f4711b) || !I.m(Boolean.valueOf(this.f4714e), Boolean.valueOf(jVar.f4714e)) || this.f != jVar.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4710a, this.f4711b, this.f4713d, Boolean.valueOf(this.f4714e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f4710a, false);
        m5.d.B(parcel, 2, this.f4711b, false);
        m5.d.B(parcel, 3, this.f4712c, false);
        m5.d.B(parcel, 4, this.f4713d, false);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f4714e ? 1 : 0);
        m5.d.K(parcel, 6, 4);
        parcel.writeInt(this.f);
        m5.d.J(G2, parcel);
    }
}
