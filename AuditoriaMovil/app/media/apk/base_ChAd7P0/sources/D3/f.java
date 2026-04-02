package d3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class f extends X2.a {
    public static final Parcelable.Creator<f> CREATOR = new android.support.v4.media.session.b(16);

    /* renamed from: a  reason: collision with root package name */
    public final int f10313a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10314b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f10315c;

    public f(int i7, String str, ArrayList arrayList) {
        this.f10313a = i7;
        this.f10314b = str;
        this.f10315c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f10313a);
        m5.d.B(parcel, 2, this.f10314b, false);
        m5.d.F(parcel, 3, this.f10315c, false);
        m5.d.J(G2, parcel);
    }

    public f(String str, Map map) {
        ArrayList arrayList;
        this.f10313a = 1;
        this.f10314b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g((C0896a) map.get(str2), str2));
            }
        }
        this.f10315c = arrayList;
    }
}
