package Q2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import d3.C0896a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* loaded from: classes.dex */
public final class f extends zzbz {
    public static final Parcelable.Creator<f> CREATOR = new N2.f(6);

    /* renamed from: Y  reason: collision with root package name */
    public static final HashMap f4382Y;

    /* renamed from: X  reason: collision with root package name */
    public final a f4383X;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f4384a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4385b;

    /* renamed from: c  reason: collision with root package name */
    public String f4386c;

    /* renamed from: d  reason: collision with root package name */
    public int f4387d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f4388e;
    public final PendingIntent f;

    static {
        HashMap hashMap = new HashMap();
        f4382Y = hashMap;
        hashMap.put("accountType", new C0896a(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new C0896a(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new C0896a(8, false, 8, false, "transferBytes", 4, null));
    }

    public f(HashSet hashSet, int i7, String str, int i8, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f4384a = hashSet;
        this.f4385b = i7;
        this.f4386c = str;
        this.f4387d = i8;
        this.f4388e = bArr;
        this.f = pendingIntent;
        this.f4383X = aVar;
    }

    @Override // d3.AbstractC0897b
    public final /* synthetic */ Map getFieldMappings() {
        return f4382Y;
    }

    @Override // d3.AbstractC0897b
    public final Object getFieldValue(C0896a c0896a) {
        int i7 = c0896a.f10297X;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return this.f4388e;
                    }
                    throw new IllegalStateException("Unknown SafeParcelable id=" + c0896a.f10297X);
                }
                return Integer.valueOf(this.f4387d);
            }
            return this.f4386c;
        }
        return Integer.valueOf(this.f4385b);
    }

    @Override // d3.AbstractC0897b
    public final boolean isFieldSet(C0896a c0896a) {
        return this.f4384a.contains(Integer.valueOf(c0896a.f10297X));
    }

    @Override // d3.AbstractC0897b
    public final void setDecodedBytesInternal(C0896a c0896a, String str, byte[] bArr) {
        int i7 = c0896a.f10297X;
        if (i7 == 4) {
            this.f4388e = bArr;
            this.f4384a.add(Integer.valueOf(i7));
            return;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Field with id=", i7, " is not known to be a byte array."));
    }

    @Override // d3.AbstractC0897b
    public final void setIntegerInternal(C0896a c0896a, String str, int i7) {
        int i8 = c0896a.f10297X;
        if (i8 == 3) {
            this.f4387d = i7;
            this.f4384a.add(Integer.valueOf(i8));
            return;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Field with id=", i8, " is not known to be an int."));
    }

    @Override // d3.AbstractC0897b
    public final void setStringInternal(C0896a c0896a, String str, String str2) {
        int i7 = c0896a.f10297X;
        if (i7 == 2) {
            this.f4386c = str2;
            this.f4384a.add(Integer.valueOf(i7));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i7)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        HashSet hashSet = this.f4384a;
        if (hashSet.contains(1)) {
            m5.d.K(parcel, 1, 4);
            parcel.writeInt(this.f4385b);
        }
        if (hashSet.contains(2)) {
            m5.d.B(parcel, 2, this.f4386c, true);
        }
        if (hashSet.contains(3)) {
            int i8 = this.f4387d;
            m5.d.K(parcel, 3, 4);
            parcel.writeInt(i8);
        }
        if (hashSet.contains(4)) {
            m5.d.r(parcel, 4, this.f4388e, true);
        }
        if (hashSet.contains(5)) {
            m5.d.A(parcel, 5, this.f, i7, true);
        }
        if (hashSet.contains(6)) {
            m5.d.A(parcel, 6, this.f4383X, i7, true);
        }
        m5.d.J(G2, parcel);
    }
}
