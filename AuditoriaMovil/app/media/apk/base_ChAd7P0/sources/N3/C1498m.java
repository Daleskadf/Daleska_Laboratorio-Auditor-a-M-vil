package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1498m extends X2.a {
    public static final Parcelable.Creator<C1498m> CREATOR = new U(24);

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1488c f14234a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f14235b;

    /* renamed from: c  reason: collision with root package name */
    public final W f14236c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC1476I f14237d;

    public C1498m(String str, Boolean bool, String str2, String str3) {
        EnumC1488c a7;
        W a8;
        EnumC1476I enumC1476I = null;
        if (str == null) {
            a7 = null;
        } else {
            try {
                a7 = EnumC1488c.a(str);
            } catch (C1475H | V | C1487b e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        this.f14234a = a7;
        this.f14235b = bool;
        if (str2 == null) {
            a8 = null;
        } else {
            a8 = W.a(str2);
        }
        this.f14236c = a8;
        if (str3 != null) {
            enumC1476I = EnumC1476I.a(str3);
        }
        this.f14237d = enumC1476I;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1498m)) {
            return false;
        }
        C1498m c1498m = (C1498m) obj;
        if (!com.google.android.gms.common.internal.I.m(this.f14234a, c1498m.f14234a) || !com.google.android.gms.common.internal.I.m(this.f14235b, c1498m.f14235b) || !com.google.android.gms.common.internal.I.m(this.f14236c, c1498m.f14236c) || !com.google.android.gms.common.internal.I.m(k(), c1498m.k())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14234a, this.f14235b, this.f14236c, k()});
    }

    public final EnumC1476I k() {
        EnumC1476I enumC1476I = this.f14237d;
        if (enumC1476I == null) {
            Boolean bool = this.f14235b;
            if (bool == null || !bool.booleanValue()) {
                return null;
            }
            return EnumC1476I.RESIDENT_KEY_REQUIRED;
        }
        return enumC1476I;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String enumC1488c;
        String w2;
        int G2 = m5.d.G(20293, parcel);
        String str = null;
        EnumC1488c enumC1488c2 = this.f14234a;
        if (enumC1488c2 == null) {
            enumC1488c = null;
        } else {
            enumC1488c = enumC1488c2.toString();
        }
        m5.d.B(parcel, 2, enumC1488c, false);
        Boolean bool = this.f14235b;
        if (bool != null) {
            m5.d.K(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        W w7 = this.f14236c;
        if (w7 == null) {
            w2 = null;
        } else {
            w2 = w7.toString();
        }
        m5.d.B(parcel, 4, w2, false);
        if (k() != null) {
            str = k().toString();
        }
        m5.d.B(parcel, 5, str, false);
        m5.d.J(G2, parcel);
    }
}
