package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import d3.AbstractC0897b;
import d3.C0896a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* loaded from: classes.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new N2.f(3);
    public static final HashMap f;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f4365a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4366b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f4367c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4368d;

    /* renamed from: e  reason: collision with root package name */
    public d f4369e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("authenticatorData", new C0896a(11, true, 11, true, "authenticatorData", 2, e.class));
        hashMap.put("progress", new C0896a(11, false, 11, false, "progress", 4, d.class));
    }

    public b(HashSet hashSet, int i7, ArrayList arrayList, int i8, d dVar) {
        this.f4365a = hashSet;
        this.f4366b = i7;
        this.f4367c = arrayList;
        this.f4368d = i8;
        this.f4369e = dVar;
    }

    @Override // d3.AbstractC0897b
    public final void addConcreteTypeArrayInternal(C0896a c0896a, String str, ArrayList arrayList) {
        int i7 = c0896a.f10297X;
        if (i7 == 2) {
            this.f4367c = arrayList;
            this.f4365a.add(Integer.valueOf(i7));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i7), arrayList.getClass().getCanonicalName()));
    }

    @Override // d3.AbstractC0897b
    public final void addConcreteTypeInternal(C0896a c0896a, String str, AbstractC0897b abstractC0897b) {
        int i7 = c0896a.f10297X;
        if (i7 == 4) {
            this.f4369e = (d) abstractC0897b;
            this.f4365a.add(Integer.valueOf(i7));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i7), abstractC0897b.getClass().getCanonicalName()));
    }

    @Override // d3.AbstractC0897b
    public final /* synthetic */ Map getFieldMappings() {
        return f;
    }

    @Override // d3.AbstractC0897b
    public final Object getFieldValue(C0896a c0896a) {
        int i7 = c0896a.f10297X;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 4) {
                    return this.f4369e;
                }
                throw new IllegalStateException("Unknown SafeParcelable id=" + c0896a.f10297X);
            }
            return this.f4367c;
        }
        return Integer.valueOf(this.f4366b);
    }

    @Override // d3.AbstractC0897b
    public final boolean isFieldSet(C0896a c0896a) {
        return this.f4365a.contains(Integer.valueOf(c0896a.f10297X));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        HashSet hashSet = this.f4365a;
        if (hashSet.contains(1)) {
            m5.d.K(parcel, 1, 4);
            parcel.writeInt(this.f4366b);
        }
        if (hashSet.contains(2)) {
            m5.d.F(parcel, 2, this.f4367c, true);
        }
        if (hashSet.contains(3)) {
            m5.d.K(parcel, 3, 4);
            parcel.writeInt(this.f4368d);
        }
        if (hashSet.contains(4)) {
            m5.d.A(parcel, 4, this.f4369e, i7, true);
        }
        m5.d.J(G2, parcel);
    }
}
