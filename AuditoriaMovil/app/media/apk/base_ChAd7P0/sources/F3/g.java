package F3;

import M3.v;
import R3.A0;
import R3.C0322u0;
import R3.C0326w0;
import R3.E0;
import R3.EnumC0324v0;
import R3.EnumC0328x0;
import R3.F0;
import R3.G0;
import R3.H0;
import R3.X0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0774a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.C0784k;
import com.google.crypto.tink.shaded.protobuf.F;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f1166c = new g("ENABLED", 0);

    /* renamed from: d  reason: collision with root package name */
    public static final g f1167d = new g("DISABLED", 0);

    /* renamed from: e  reason: collision with root package name */
    public static final g f1168e = new g("DESTROYED", 0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1169a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1170b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f1169a = i7;
        this.f1170b = obj;
    }

    public synchronized void a(A0 a02) {
        G0 e7 = e(a02);
        E0 e02 = (E0) this.f1170b;
        e02.e();
        H0.z((H0) e02.f9699b, e7);
    }

    public synchronized G0 b(C0326w0 c0326w0, X0 x02) {
        F0 H7;
        int g3 = g();
        if (x02 != X0.UNKNOWN_PREFIX) {
            H7 = G0.H();
            H7.e();
            G0.y((G0) H7.f9699b, c0326w0);
            H7.e();
            G0.B((G0) H7.f9699b, g3);
            EnumC0328x0 enumC0328x0 = EnumC0328x0.ENABLED;
            H7.e();
            G0.A((G0) H7.f9699b, enumC0328x0);
            H7.e();
            G0.z((G0) H7.f9699b, x02);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (G0) H7.b();
    }

    public synchronized V2.k c() {
        return V2.k.q((H0) ((E0) this.f1170b).b());
    }

    public synchronized boolean d(int i7) {
        for (G0 g02 : DesugarCollections.unmodifiableList(((H0) ((E0) this.f1170b).f9699b).C())) {
            if (g02.D() == i7) {
                return true;
            }
        }
        return false;
    }

    public synchronized G0 e(A0 a02) {
        return b(s.e(a02), a02.C());
    }

    public C0326w0 f(AbstractC0781h abstractC0781h) {
        M3.d dVar = (M3.d) this.f1170b;
        try {
            B0.b e7 = dVar.e();
            AbstractC0774a p7 = e7.p(abstractC0781h);
            e7.v(p7);
            AbstractC0774a a7 = e7.a(p7);
            C0322u0 F7 = C0326w0.F();
            String c8 = dVar.c();
            F7.e();
            C0326w0.y((C0326w0) F7.f9699b, c8);
            try {
                int b5 = ((AbstractC0797y) a7).b(null);
                byte[] bArr = new byte[b5];
                C0784k c0784k = new C0784k(bArr, b5);
                a7.f(c0784k);
                if (c0784k.f - c0784k.f9676g == 0) {
                    C0780g c0780g = new C0780g(bArr);
                    F7.e();
                    C0326w0.z((C0326w0) F7.f9699b, c0780g);
                    EnumC0324v0 f = dVar.f();
                    F7.e();
                    C0326w0.A((C0326w0) F7.f9699b, f);
                    return (C0326w0) F7.b();
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e8) {
                throw new RuntimeException(a7.c("ByteString"), e8);
            }
        } catch (F e9) {
            throw new GeneralSecurityException("Unexpected proto", e9);
        }
    }

    public synchronized int g() {
        int a7;
        a7 = v.a();
        while (d(a7)) {
            a7 = v.a();
        }
        return a7;
    }

    public synchronized void h(int i7) {
        for (int i8 = 0; i8 < ((H0) ((E0) this.f1170b).f9699b).B(); i8++) {
            try {
                G0 A7 = ((H0) ((E0) this.f1170b).f9699b).A(i8);
                if (A7.D() == i7) {
                    if (A7.F().equals(EnumC0328x0.ENABLED)) {
                        E0 e02 = (E0) this.f1170b;
                        e02.e();
                        H0.y((H0) e02.f9699b, i7);
                    } else {
                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        throw new GeneralSecurityException("key not found: " + i7);
    }

    public String toString() {
        switch (this.f1169a) {
            case 0:
                return (String) this.f1170b;
            default:
                return super.toString();
        }
    }

    public g(M3.d dVar, Class cls) {
        this.f1169a = 2;
        if (!((Map) dVar.f3231c).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.i("Given internalKeyMananger ", dVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f1170b = dVar;
    }
}
