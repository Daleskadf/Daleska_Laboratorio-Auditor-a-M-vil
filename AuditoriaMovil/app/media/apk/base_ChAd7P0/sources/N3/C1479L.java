package n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;
/* renamed from: n3.L  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479L extends X2.a {
    public static final Parcelable.Creator<C1479L> CREATOR = new U(10);

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1477J f14184a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14185b;

    static {
        new C1479L(EnumC1477J.SUPPORTED.toString(), null);
        new C1479L(EnumC1477J.NOT_SUPPORTED.toString(), null);
    }

    public C1479L(String str, String str2) {
        com.google.android.gms.common.internal.I.i(str);
        try {
            this.f14184a = EnumC1477J.a(str);
            this.f14185b = str2;
        } catch (C1478K e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1479L)) {
            return false;
        }
        C1479L c1479l = (C1479L) obj;
        if (!zzao.zza(this.f14184a, c1479l.f14184a) || !zzao.zza(this.f14185b, c1479l.f14185b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14184a, this.f14185b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 2, this.f14184a.toString(), false);
        m5.d.B(parcel, 3, this.f14185b, false);
        m5.d.J(G2, parcel);
    }
}
