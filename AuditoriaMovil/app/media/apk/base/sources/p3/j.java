package p3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import n3.c0;
/* loaded from: classes.dex */
public final class j extends X2.a {
    public static final Parcelable.Creator<j> CREATOR = new c0(28);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15105a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15106b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15107c;

    public j(int i7, String str, ArrayList arrayList) {
        this.f15105a = arrayList;
        this.f15106b = i7;
        this.f15107c = str;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15105a);
        int length = valueOf.length();
        int i7 = this.f15106b;
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(i7).length() + 1);
        sb.append("GeofencingRequest[geofences=");
        sb.append(valueOf);
        sb.append(", initialTrigger=");
        sb.append(i7);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.F(parcel, 1, this.f15105a, false);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15106b);
        m5.d.B(parcel, 4, this.f15107c, false);
        m5.d.J(G2, parcel);
    }
}
