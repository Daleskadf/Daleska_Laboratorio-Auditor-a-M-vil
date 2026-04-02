package n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: n3.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511z extends X2.a {
    public static final Parcelable.Creator<C1511z> CREATOR;

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1472E f14264a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14265b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f14266c;

    static {
        zzbc.zzk(zzh.zza, zzh.zzb);
        CREATOR = new U(2);
    }

    public C1511z(String str, byte[] bArr, ArrayList arrayList) {
        com.google.android.gms.common.internal.I.i(str);
        try {
            this.f14264a = EnumC1472E.a(str);
            com.google.android.gms.common.internal.I.i(bArr);
            this.f14265b = bArr;
            this.f14266c = arrayList;
        } catch (C1471D e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1511z)) {
            return false;
        }
        C1511z c1511z = (C1511z) obj;
        if (!this.f14264a.equals(c1511z.f14264a) || !Arrays.equals(this.f14265b, c1511z.f14265b)) {
            return false;
        }
        ArrayList arrayList = this.f14266c;
        ArrayList arrayList2 = c1511z.f14266c;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || !arrayList.containsAll(arrayList2) || !arrayList2.containsAll(arrayList)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14264a, Integer.valueOf(Arrays.hashCode(this.f14265b)), this.f14266c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 2, this.f14264a.toString(), false);
        m5.d.r(parcel, 3, this.f14265b, false);
        m5.d.F(parcel, 4, this.f14266c, false);
        m5.d.J(G2, parcel);
    }
}
