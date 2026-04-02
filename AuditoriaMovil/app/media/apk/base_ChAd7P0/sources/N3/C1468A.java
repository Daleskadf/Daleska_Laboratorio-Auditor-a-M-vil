package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1468A extends X2.a {
    public static final Parcelable.Creator<C1468A> CREATOR = new U(3);

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1472E f14167a;

    /* renamed from: b  reason: collision with root package name */
    public final C1503r f14168b;

    public C1468A(String str, int i7) {
        com.google.android.gms.common.internal.I.i(str);
        try {
            this.f14167a = EnumC1472E.a(str);
            try {
                this.f14168b = C1503r.a(i7);
            } catch (C1502q e7) {
                throw new IllegalArgumentException(e7);
            }
        } catch (C1471D e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1468A)) {
            return false;
        }
        C1468A c1468a = (C1468A) obj;
        if (!this.f14167a.equals(c1468a.f14167a) || !this.f14168b.equals(c1468a.f14168b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14167a, this.f14168b});
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, n3.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 2, this.f14167a.toString(), false);
        m5.d.y(parcel, 3, Integer.valueOf(this.f14168b.f14244a.a()));
        m5.d.J(G2, parcel);
    }
}
