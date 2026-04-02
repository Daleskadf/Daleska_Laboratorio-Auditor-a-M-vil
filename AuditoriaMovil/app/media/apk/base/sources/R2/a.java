package R2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a extends X2.a {
    public static final Parcelable.Creator<a> CREATOR = new N2.f(9);

    /* renamed from: a  reason: collision with root package name */
    public final String f4685a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4686b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4687c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f4688d;

    /* renamed from: e  reason: collision with root package name */
    public final GoogleSignInAccount f4689e;
    public final PendingIntent f;

    public a(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f4685a = str;
        this.f4686b = str2;
        this.f4687c = str3;
        I.i(arrayList);
        this.f4688d = arrayList;
        this.f = pendingIntent;
        this.f4689e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!I.m(this.f4685a, aVar.f4685a) || !I.m(this.f4686b, aVar.f4686b) || !I.m(this.f4687c, aVar.f4687c) || !I.m(this.f4688d, aVar.f4688d) || !I.m(this.f, aVar.f) || !I.m(this.f4689e, aVar.f4689e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4685a, this.f4686b, this.f4687c, this.f4688d, this.f, this.f4689e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f4685a, false);
        m5.d.B(parcel, 2, this.f4686b, false);
        m5.d.B(parcel, 3, this.f4687c, false);
        m5.d.D(parcel, 4, this.f4688d);
        m5.d.A(parcel, 5, this.f4689e, i7, false);
        m5.d.A(parcel, 6, this.f, i7, false);
        m5.d.J(G2, parcel);
    }
}
