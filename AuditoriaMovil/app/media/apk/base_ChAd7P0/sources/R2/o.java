package R2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import n3.C1509x;
/* loaded from: classes.dex */
public final class o extends X2.a {
    public static final Parcelable.Creator<o> CREATOR = new N2.f(22);

    /* renamed from: X  reason: collision with root package name */
    public final String f4720X;

    /* renamed from: Y  reason: collision with root package name */
    public final String f4721Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1509x f4722Z;

    /* renamed from: a  reason: collision with root package name */
    public final String f4723a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4724b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4725c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4726d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f4727e;
    public final String f;

    public o(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C1509x c1509x) {
        I.i(str);
        this.f4723a = str;
        this.f4724b = str2;
        this.f4725c = str3;
        this.f4726d = str4;
        this.f4727e = uri;
        this.f = str5;
        this.f4720X = str6;
        this.f4721Y = str7;
        this.f4722Z = c1509x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!I.m(this.f4723a, oVar.f4723a) || !I.m(this.f4724b, oVar.f4724b) || !I.m(this.f4725c, oVar.f4725c) || !I.m(this.f4726d, oVar.f4726d) || !I.m(this.f4727e, oVar.f4727e) || !I.m(this.f, oVar.f) || !I.m(this.f4720X, oVar.f4720X) || !I.m(this.f4721Y, oVar.f4721Y) || !I.m(this.f4722Z, oVar.f4722Z)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4723a, this.f4724b, this.f4725c, this.f4726d, this.f4727e, this.f, this.f4720X, this.f4721Y, this.f4722Z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f4723a, false);
        m5.d.B(parcel, 2, this.f4724b, false);
        m5.d.B(parcel, 3, this.f4725c, false);
        m5.d.B(parcel, 4, this.f4726d, false);
        m5.d.A(parcel, 5, this.f4727e, i7, false);
        m5.d.B(parcel, 6, this.f, false);
        m5.d.B(parcel, 7, this.f4720X, false);
        m5.d.B(parcel, 8, this.f4721Y, false);
        m5.d.A(parcel, 9, this.f4722Z, i7, false);
        m5.d.J(G2, parcel);
    }
}
