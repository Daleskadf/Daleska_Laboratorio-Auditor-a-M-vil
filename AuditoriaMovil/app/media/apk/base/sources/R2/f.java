package R2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class f extends X2.a {
    public static final Parcelable.Creator<f> CREATOR = new N2.f(10);

    /* renamed from: X  reason: collision with root package name */
    public final c f4702X;

    /* renamed from: a  reason: collision with root package name */
    public final e f4703a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4704b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4705c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4706d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4707e;
    public final d f;

    public f(e eVar, b bVar, String str, boolean z7, int i7, d dVar, c cVar) {
        I.i(eVar);
        this.f4703a = eVar;
        I.i(bVar);
        this.f4704b = bVar;
        this.f4705c = str;
        this.f4706d = z7;
        this.f4707e = i7;
        this.f = dVar == null ? new d(false, null, null) : dVar;
        this.f4702X = cVar == null ? new c(null, false) : cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!I.m(this.f4703a, fVar.f4703a) || !I.m(this.f4704b, fVar.f4704b) || !I.m(this.f, fVar.f) || !I.m(this.f4702X, fVar.f4702X) || !I.m(this.f4705c, fVar.f4705c) || this.f4706d != fVar.f4706d || this.f4707e != fVar.f4707e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4703a, this.f4704b, this.f, this.f4702X, this.f4705c, Boolean.valueOf(this.f4706d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 1, this.f4703a, i7, false);
        m5.d.A(parcel, 2, this.f4704b, i7, false);
        m5.d.B(parcel, 3, this.f4705c, false);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f4706d ? 1 : 0);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f4707e);
        m5.d.A(parcel, 6, this.f, i7, false);
        m5.d.A(parcel, 7, this.f4702X, i7, false);
        m5.d.J(G2, parcel);
    }
}
