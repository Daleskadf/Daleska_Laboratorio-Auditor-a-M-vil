package o3;

import android.os.Parcel;
import android.os.Parcelable;
import n3.c0;
/* loaded from: classes.dex */
public final class c extends X2.a {
    public static final Parcelable.Creator<c> CREATOR = new c0(4);

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1556a f14571a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14572b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14573c;

    static {
        new c();
    }

    public c() {
        this.f14571a = EnumC1556a.ABSENT;
        this.f14573c = null;
        this.f14572b = null;
    }

    public static EnumC1556a k(int i7) {
        EnumC1556a[] values;
        int i8;
        for (EnumC1556a enumC1556a : EnumC1556a.values()) {
            i8 = enumC1556a.zzb;
            if (i7 == i8) {
                return enumC1556a;
            }
        }
        throw new Exception(io.flutter.plugins.pathprovider.b.f("ChannelIdValueType ", i7, " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        EnumC1556a enumC1556a = cVar.f14571a;
        EnumC1556a enumC1556a2 = this.f14571a;
        if (!enumC1556a2.equals(enumC1556a)) {
            return false;
        }
        int ordinal = enumC1556a2.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return false;
            }
            return this.f14573c.equals(cVar.f14573c);
        }
        return this.f14572b.equals(cVar.f14572b);
    }

    public final int hashCode() {
        int i7;
        int hashCode;
        EnumC1556a enumC1556a = this.f14571a;
        int hashCode2 = enumC1556a.hashCode() + 31;
        int ordinal = enumC1556a.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return hashCode2;
            }
            i7 = hashCode2 * 31;
            hashCode = this.f14573c.hashCode();
        } else {
            i7 = hashCode2 * 31;
            hashCode = this.f14572b.hashCode();
        }
        return hashCode + i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8;
        int G2 = m5.d.G(20293, parcel);
        i8 = this.f14571a.zzb;
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(i8);
        m5.d.B(parcel, 3, this.f14572b, false);
        m5.d.B(parcel, 4, this.f14573c, false);
        m5.d.J(G2, parcel);
    }

    public c(String str, int i7, String str2) {
        try {
            this.f14571a = k(i7);
            this.f14572b = str;
            this.f14573c = str2;
        } catch (C1557b e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
