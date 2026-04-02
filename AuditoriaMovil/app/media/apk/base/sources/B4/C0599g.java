package b4;

import a4.AbstractC0467p;
import a4.C0448A;
import a4.C0451D;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
/* renamed from: b4.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599g extends AbstractC0467p {
    public static final Parcelable.Creator<C0599g> CREATOR = new C0595c(1);

    /* renamed from: X  reason: collision with root package name */
    public String f8250X;

    /* renamed from: Y  reason: collision with root package name */
    public Boolean f8251Y;

    /* renamed from: Z  reason: collision with root package name */
    public C0600h f8252Z;

    /* renamed from: a  reason: collision with root package name */
    public zzagw f8253a;

    /* renamed from: b  reason: collision with root package name */
    public C0596d f8254b;

    /* renamed from: c  reason: collision with root package name */
    public String f8255c;

    /* renamed from: d  reason: collision with root package name */
    public String f8256d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f8257e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f8258e0;
    public ArrayList f;

    /* renamed from: f0  reason: collision with root package name */
    public a4.K f8259f0;

    /* renamed from: g0  reason: collision with root package name */
    public z f8260g0;

    /* renamed from: h0  reason: collision with root package name */
    public List f8261h0;

    public C0599g(U3.h hVar, ArrayList arrayList) {
        com.google.android.gms.common.internal.I.i(hVar);
        hVar.a();
        this.f8255c = hVar.f5750b;
        this.f8256d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f8250X = "2";
        n(arrayList);
    }

    @Override // a4.F
    public final String a() {
        return this.f8254b.f8241a;
    }

    @Override // a4.F
    public final String d() {
        return this.f8254b.f;
    }

    @Override // a4.F
    public final Uri e() {
        return this.f8254b.e();
    }

    @Override // a4.F
    public final boolean f() {
        return this.f8254b.f8239Y;
    }

    @Override // a4.F
    public final String g() {
        return this.f8254b.f8238X;
    }

    @Override // a4.F
    public final String i() {
        return this.f8254b.f8243c;
    }

    @Override // a4.F
    public final String j() {
        return this.f8254b.f8242b;
    }

    @Override // a4.AbstractC0467p
    public final String k() {
        Map map;
        zzagw zzagwVar = this.f8253a;
        if (zzagwVar == null || zzagwVar.zzc() == null || (map = (Map) y.a(this.f8253a.zzc()).f7044b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // a4.AbstractC0467p
    public final boolean l() {
        String str;
        Boolean bool = this.f8251Y;
        if (bool == null || bool.booleanValue()) {
            zzagw zzagwVar = this.f8253a;
            if (zzagwVar != null) {
                Map map = (Map) y.a(zzagwVar.zzc()).f7044b.get("firebase");
                if (map != null) {
                    str = (String) map.get("sign_in_provider");
                } else {
                    str = null;
                }
            } else {
                str = StringUtils.EMPTY;
            }
            boolean z7 = true;
            if (this.f8257e.size() > 1 || (str != null && str.equals("custom"))) {
                z7 = false;
            }
            this.f8251Y = Boolean.valueOf(z7);
        }
        return this.f8251Y.booleanValue();
    }

    @Override // a4.AbstractC0467p
    public final synchronized C0599g n(ArrayList arrayList) {
        try {
            com.google.android.gms.common.internal.I.i(arrayList);
            this.f8257e = new ArrayList(arrayList.size());
            this.f = new ArrayList(arrayList.size());
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                a4.F f = (a4.F) arrayList.get(i7);
                if (f.j().equals("firebase")) {
                    this.f8254b = (C0596d) f;
                } else {
                    this.f.add(f.j());
                }
                this.f8257e.add((C0596d) f);
            }
            if (this.f8254b == null) {
                this.f8254b = (C0596d) this.f8257e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // a4.AbstractC0467p
    public final void o(ArrayList arrayList) {
        z zVar;
        if (arrayList.isEmpty()) {
            zVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a4.u uVar = (a4.u) it.next();
                if (uVar instanceof C0448A) {
                    arrayList2.add((C0448A) uVar);
                } else if (uVar instanceof C0451D) {
                    arrayList3.add((C0451D) uVar);
                }
            }
            zVar = new z(arrayList2, arrayList3);
        }
        this.f8260g0 = zVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 1, this.f8253a, i7, false);
        m5.d.A(parcel, 2, this.f8254b, i7, false);
        m5.d.B(parcel, 3, this.f8255c, false);
        m5.d.B(parcel, 4, this.f8256d, false);
        m5.d.F(parcel, 5, this.f8257e, false);
        m5.d.D(parcel, 6, this.f);
        m5.d.B(parcel, 7, this.f8250X, false);
        boolean l8 = l();
        m5.d.K(parcel, 8, 4);
        parcel.writeInt(l8 ? 1 : 0);
        m5.d.A(parcel, 9, this.f8252Z, i7, false);
        boolean z7 = this.f8258e0;
        m5.d.K(parcel, 10, 4);
        parcel.writeInt(z7 ? 1 : 0);
        m5.d.A(parcel, 11, this.f8259f0, i7, false);
        m5.d.A(parcel, 12, this.f8260g0, i7, false);
        m5.d.F(parcel, 13, this.f8261h0, false);
        m5.d.J(G2, parcel);
    }
}
