package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import d3.AbstractC0897b;
import d3.C0896a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* loaded from: classes.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new N2.f(5);

    /* renamed from: X  reason: collision with root package name */
    public static final HashMap f4376X;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f4377a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4378b;

    /* renamed from: c  reason: collision with root package name */
    public f f4379c;

    /* renamed from: d  reason: collision with root package name */
    public String f4380d;

    /* renamed from: e  reason: collision with root package name */
    public String f4381e;
    public final String f;

    static {
        HashMap hashMap = new HashMap();
        f4376X = hashMap;
        hashMap.put("authenticatorInfo", new C0896a(11, false, 11, false, "authenticatorInfo", 2, f.class));
        hashMap.put("signature", new C0896a(7, false, 7, false, "signature", 3, null));
        hashMap.put("package", new C0896a(7, false, 7, false, "package", 4, null));
    }

    public e(HashSet hashSet, int i7, f fVar, String str, String str2, String str3) {
        this.f4377a = hashSet;
        this.f4378b = i7;
        this.f4379c = fVar;
        this.f4380d = str;
        this.f4381e = str2;
        this.f = str3;
    }

    @Override // d3.AbstractC0897b
    public final void addConcreteTypeInternal(C0896a c0896a, String str, AbstractC0897b abstractC0897b) {
        int i7 = c0896a.f10297X;
        if (i7 == 2) {
            this.f4379c = (f) abstractC0897b;
            this.f4377a.add(Integer.valueOf(i7));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i7), abstractC0897b.getClass().getCanonicalName()));
    }

    @Override // d3.AbstractC0897b
    public final /* synthetic */ Map getFieldMappings() {
        return f4376X;
    }

    @Override // d3.AbstractC0897b
    public final Object getFieldValue(C0896a c0896a) {
        int i7 = c0896a.f10297X;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return this.f4381e;
                    }
                    throw new IllegalStateException("Unknown SafeParcelable id=" + c0896a.f10297X);
                }
                return this.f4380d;
            }
            return this.f4379c;
        }
        return Integer.valueOf(this.f4378b);
    }

    @Override // d3.AbstractC0897b
    public final boolean isFieldSet(C0896a c0896a) {
        return this.f4377a.contains(Integer.valueOf(c0896a.f10297X));
    }

    @Override // d3.AbstractC0897b
    public final void setStringInternal(C0896a c0896a, String str, String str2) {
        int i7 = c0896a.f10297X;
        if (i7 != 3) {
            if (i7 == 4) {
                this.f4381e = str2;
            } else {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i7)));
            }
        } else {
            this.f4380d = str2;
        }
        this.f4377a.add(Integer.valueOf(i7));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        HashSet hashSet = this.f4377a;
        if (hashSet.contains(1)) {
            m5.d.K(parcel, 1, 4);
            parcel.writeInt(this.f4378b);
        }
        if (hashSet.contains(2)) {
            m5.d.A(parcel, 2, this.f4379c, i7, true);
        }
        if (hashSet.contains(3)) {
            m5.d.B(parcel, 3, this.f4380d, true);
        }
        if (hashSet.contains(4)) {
            m5.d.B(parcel, 4, this.f4381e, true);
        }
        if (hashSet.contains(5)) {
            m5.d.B(parcel, 5, this.f, true);
        }
        m5.d.J(G2, parcel);
    }
}
