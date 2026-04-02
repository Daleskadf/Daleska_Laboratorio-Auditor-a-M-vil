package W2;

import K0.x;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.firebase.firestore.Z;
import k6.InterfaceC1408a;
import w.C1908S;
/* loaded from: classes.dex */
public final class j implements X0.i {

    /* renamed from: b  reason: collision with root package name */
    public static j f6180b;

    /* renamed from: a  reason: collision with root package name */
    public Context f6181a;

    public j(Context context, int i7) {
        switch (i7) {
            case 2:
                this.f6181a = context;
                return;
            default:
                this.f6181a = context.getApplicationContext();
                return;
        }
    }

    public static j b(Context context) {
        I.i(context);
        synchronized (j.class) {
            try {
                if (f6180b == null) {
                    r.a(context);
                    f6180b = new j(context, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6180b;
    }

    public static final o c(PackageInfo packageInfo, o... oVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            p pVar = new p(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < oVarArr.length; i7++) {
                if (oVarArr[i7].equals(pVar)) {
                    return oVarArr[i7];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            W2.o[] r4 = W2.q.f6193a
            W2.o r4 = c(r2, r4)
            goto L45
        L39:
            W2.o[] r4 = W2.q.f6193a
            r4 = r4[r1]
            W2.o[] r5 = new W2.o[r0]
            r5[r1] = r4
            W2.o r4 = c(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.j.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, D2.c] */
    public D2.c a() {
        Context context = this.f6181a;
        if (context != null) {
            ?? obj = new Object();
            obj.f838a = F2.a.a(D2.f.f845a);
            F2.c cVar = new F2.c(context);
            obj.f839b = cVar;
            obj.f840c = F2.a.a(new A.f(9, cVar, new A4.c(cVar, 9)));
            InterfaceC1408a a7 = F2.a.a(new C5.i(new A.m(obj.f839b, 7), 11));
            obj.f841d = a7;
            Z z7 = new Z(5);
            F2.c cVar2 = obj.f839b;
            V2.k kVar = new V2.k(cVar2, a7, z7, 16);
            InterfaceC1408a interfaceC1408a = obj.f838a;
            InterfaceC1408a interfaceC1408a2 = obj.f840c;
            obj.f842e = F2.a.a(new V2.k(new F3.o(interfaceC1408a, interfaceC1408a2, kVar, a7, a7, 2), new C1908S(cVar2, interfaceC1408a2, a7, kVar, interfaceC1408a, a7), new E.e(interfaceC1408a, a7, kVar, a7, 2), 8));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v4.d, java.lang.Object] */
    @Override // X0.i
    public X0.j f(X0.h hVar) {
        Context context;
        int i7 = x.f2529a;
        if (i7 >= 23 && (i7 >= 31 || ((context = this.f6181a) != null && i7 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int g3 = H0.I.g(hVar.f6282c.f1886m);
            K0.a.r("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + x.F(g3));
            return new M0.x(g3).f(hVar);
        }
        return new Object().f(hVar);
    }
}
