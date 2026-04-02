package Q2;

import S.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import d3.C0896a;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class d extends zzbz {
    public static final Parcelable.Creator<d> CREATOR = new N2.f(4);

    /* renamed from: X  reason: collision with root package name */
    public static final S.f f4370X;

    /* renamed from: a  reason: collision with root package name */
    public final int f4371a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f4372b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f4373c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f4374d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f4375e;
    public ArrayList f;

    /* JADX WARN: Type inference failed for: r0v1, types: [S.k, S.f] */
    static {
        ?? kVar = new k(0);
        f4370X = kVar;
        kVar.put("registered", C0896a.k(2, "registered"));
        kVar.put("in_progress", C0896a.k(3, "in_progress"));
        kVar.put("success", C0896a.k(4, "success"));
        kVar.put("failed", C0896a.k(5, "failed"));
        kVar.put("escrowed", C0896a.k(6, "escrowed"));
    }

    public d(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f4371a = i7;
        this.f4372b = arrayList;
        this.f4373c = arrayList2;
        this.f4374d = arrayList3;
        this.f4375e = arrayList4;
        this.f = arrayList5;
    }

    @Override // d3.AbstractC0897b
    public final Map getFieldMappings() {
        return f4370X;
    }

    @Override // d3.AbstractC0897b
    public final Object getFieldValue(C0896a c0896a) {
        switch (c0896a.f10297X) {
            case 1:
                return Integer.valueOf(this.f4371a);
            case 2:
                return this.f4372b;
            case 3:
                return this.f4373c;
            case 4:
                return this.f4374d;
            case 5:
                return this.f4375e;
            case 6:
                return this.f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + c0896a.f10297X);
        }
    }

    @Override // d3.AbstractC0897b
    public final boolean isFieldSet(C0896a c0896a) {
        return true;
    }

    @Override // d3.AbstractC0897b
    public final void setStringsInternal(C0896a c0896a, String str, ArrayList arrayList) {
        int i7 = c0896a.f10297X;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        if (i7 == 6) {
                            this.f = arrayList;
                            return;
                        }
                        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i7)));
                    }
                    this.f4375e = arrayList;
                    return;
                }
                this.f4374d = arrayList;
                return;
            }
            this.f4373c = arrayList;
            return;
        }
        this.f4372b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f4371a);
        m5.d.D(parcel, 2, this.f4372b);
        m5.d.D(parcel, 3, this.f4373c);
        m5.d.D(parcel, 4, this.f4374d);
        m5.d.D(parcel, 5, this.f4375e);
        m5.d.D(parcel, 6, this.f);
        m5.d.J(G2, parcel);
    }
}
