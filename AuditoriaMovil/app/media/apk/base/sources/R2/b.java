package R2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* loaded from: classes.dex */
public final class b extends X2.a {
    public static final Parcelable.Creator<b> CREATOR = new N2.f(14);

    /* renamed from: X  reason: collision with root package name */
    public final boolean f4690X;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4691a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4692b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4693c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4694d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4695e;
    public final ArrayList f;

    public b(boolean z7, String str, String str2, boolean z8, String str3, ArrayList arrayList, boolean z9) {
        boolean z10 = true;
        if (z8 && z9) {
            z10 = false;
        }
        I.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z10);
        this.f4691a = z7;
        if (z7) {
            I.j(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f4692b = str;
        this.f4693c = str2;
        this.f4694d = z8;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f = arrayList2;
        this.f4695e = str3;
        this.f4690X = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4691a != bVar.f4691a || !I.m(this.f4692b, bVar.f4692b) || !I.m(this.f4693c, bVar.f4693c) || this.f4694d != bVar.f4694d || !I.m(this.f4695e, bVar.f4695e) || !I.m(this.f, bVar.f) || this.f4690X != bVar.f4690X) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f4691a);
        Boolean valueOf2 = Boolean.valueOf(this.f4694d);
        Boolean valueOf3 = Boolean.valueOf(this.f4690X);
        return Arrays.hashCode(new Object[]{valueOf, this.f4692b, this.f4693c, valueOf2, this.f4695e, this.f, valueOf3});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f4691a ? 1 : 0);
        m5.d.B(parcel, 2, this.f4692b, false);
        m5.d.B(parcel, 3, this.f4693c, false);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f4694d ? 1 : 0);
        m5.d.B(parcel, 5, this.f4695e, false);
        m5.d.D(parcel, 6, this.f);
        m5.d.K(parcel, 7, 4);
        parcel.writeInt(this.f4690X ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
