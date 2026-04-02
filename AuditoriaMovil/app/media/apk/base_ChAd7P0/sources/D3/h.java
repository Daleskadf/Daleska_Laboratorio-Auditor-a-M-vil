package d3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class h extends X2.a {
    public static final Parcelable.Creator<h> CREATOR = new android.support.v4.media.session.b(15);

    /* renamed from: a  reason: collision with root package name */
    public final int f10319a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f10320b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10321c;

    public h(int i7, String str, ArrayList arrayList) {
        this.f10319a = i7;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            f fVar = (f) arrayList.get(i8);
            String str2 = fVar.f10314b;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = fVar.f10315c;
            I.i(arrayList2);
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                g gVar = (g) arrayList2.get(i9);
                hashMap2.put(gVar.f10317b, gVar.f10318c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f10320b = hashMap;
        I.i(str);
        this.f10321c = str;
        for (String str3 : hashMap.keySet()) {
            Map map = (Map) hashMap.get(str3);
            for (String str4 : map.keySet()) {
                ((C0896a) map.get(str4)).f10305e0 = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = this.f10320b;
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f10319a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f10320b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new f(str, (Map) hashMap.get(str)));
        }
        m5.d.F(parcel, 2, arrayList, false);
        m5.d.B(parcel, 3, this.f10321c, false);
        m5.d.J(G2, parcel);
    }
}
