package s3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* renamed from: s3.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1788p extends X2.a {
    public static final Parcelable.Creator<C1788p> CREATOR = new C1770E(14);

    /* renamed from: a  reason: collision with root package name */
    public final int f15644a;

    /* renamed from: b  reason: collision with root package name */
    public final Float f15645b;

    public C1788p(int i7, Float f) {
        boolean z7 = true;
        if (i7 != 1 && (f == null || f.floatValue() < 0.0f)) {
            z7 = false;
        }
        I.a("Invalid PatternItem: type=" + i7 + " length=" + f, z7);
        this.f15644a = i7;
        this.f15645b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1788p)) {
            return false;
        }
        C1788p c1788p = (C1788p) obj;
        if (this.f15644a == c1788p.f15644a && I.m(this.f15645b, c1788p.f15645b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15644a), this.f15645b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f15644a + " length=" + this.f15645b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15644a);
        m5.d.u(parcel, 3, this.f15645b);
        m5.d.J(G2, parcel);
    }
}
