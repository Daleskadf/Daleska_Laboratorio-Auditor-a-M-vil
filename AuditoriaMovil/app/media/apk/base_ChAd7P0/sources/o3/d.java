package o3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.datastore.preferences.protobuf.Y;
import java.util.ArrayList;
import java.util.Arrays;
import n3.c0;
/* loaded from: classes.dex */
public final class d extends X2.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f14574a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14575b;

    /* renamed from: c  reason: collision with root package name */
    public final f f14576c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f14577d;

    public d(int i7, byte[] bArr, String str, ArrayList arrayList) {
        this.f14574a = i7;
        this.f14575b = bArr;
        try {
            this.f14576c = f.a(str);
            this.f14577d = arrayList;
        } catch (e e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Arrays.equals(this.f14575b, dVar.f14575b) || !this.f14576c.equals(dVar.f14576c)) {
            return false;
        }
        ArrayList arrayList = this.f14577d;
        ArrayList arrayList2 = dVar.f14577d;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f14575b)), this.f14576c, this.f14577d});
    }

    public final String toString() {
        String obj;
        String encodeToString;
        ArrayList arrayList = this.f14577d;
        if (arrayList == null) {
            obj = "null";
        } else {
            obj = arrayList.toString();
        }
        byte[] bArr = this.f14575b;
        if (bArr == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bArr, 0);
        }
        StringBuilder m7 = Y.m("{keyHandle: ", encodeToString, ", version: ");
        m7.append(this.f14576c);
        m7.append(", transports: ");
        m7.append(obj);
        m7.append("}");
        return m7.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f14574a);
        m5.d.r(parcel, 2, this.f14575b, false);
        m5.d.B(parcel, 3, this.f14576c.toString(), false);
        m5.d.F(parcel, 4, this.f14577d, false);
        m5.d.J(G2, parcel);
    }
}
