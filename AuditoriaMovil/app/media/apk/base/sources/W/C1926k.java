package w;

import D.C0070u;
import D.C0072w;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.core.impl.C0499b;
import androidx.camera.core.impl.InterfaceC0519v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p.C1608t;
import x.C1967a;
/* renamed from: w.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1926k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16232a;

    /* renamed from: b  reason: collision with root package name */
    public final B.a f16233b;

    /* renamed from: c  reason: collision with root package name */
    public final C0499b f16234c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.camera.core.impl.B f16235d;

    /* renamed from: e  reason: collision with root package name */
    public final x.p f16236e;
    public final ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public final C1904N f16237g;

    /* renamed from: h  reason: collision with root package name */
    public final long f16238h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f16239i = new HashMap();

    public C1926k(Context context, C0499b c0499b, C0070u c0070u, long j) {
        String str;
        this.f16232a = context;
        this.f16234c = c0499b;
        x.p a7 = x.p.a(context, c0499b.f7605b);
        this.f16236e = a7;
        this.f16237g = C1904N.b(context);
        try {
            ArrayList arrayList = new ArrayList();
            C1608t c1608t = a7.f16413a;
            c1608t.getClass();
            try {
                List<String> asList = Arrays.asList(((CameraManager) c1608t.f14880b).getCameraIdList());
                if (c0070u == null) {
                    for (String str2 : asList) {
                        arrayList.add(str2);
                    }
                } else {
                    try {
                        str = org.slf4j.helpers.i.m(a7, c0070u.b(), asList);
                    } catch (IllegalStateException unused) {
                        str = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : asList) {
                        if (!str3.equals(str)) {
                            arrayList2.add(b(str3));
                        }
                    }
                    for (InterfaceC0519v interfaceC0519v : c0070u.a(arrayList2)) {
                        arrayList.add(interfaceC0519v.c());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    if (!str4.equals("0") && !str4.equals("1")) {
                        if (m5.d.k(str4, this.f16236e)) {
                            arrayList3.add(str4);
                        } else {
                            org.slf4j.helpers.i.l("Camera2CameraFactory", "Camera " + str4 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                        }
                    } else {
                        arrayList3.add(str4);
                    }
                }
                this.f = arrayList3;
                B.a aVar = new B.a(this.f16236e);
                this.f16233b = aVar;
                androidx.camera.core.impl.B b5 = new androidx.camera.core.impl.B(aVar);
                this.f16235d = b5;
                ((ArrayList) aVar.f224b).add(b5);
                this.f16238h = j;
            } catch (CameraAccessException e7) {
                throw new C1967a(e7);
            }
        } catch (C0072w e8) {
            throw new Exception(e8);
        } catch (C1967a e9) {
            throw new Exception(new Exception(e9));
        }
    }

    public final C1936u a(String str) {
        if (this.f.contains(str)) {
            C1939x b5 = b(str);
            C0499b c0499b = this.f16234c;
            Executor executor = c0499b.f7604a;
            return new C1936u(this.f16232a, this.f16236e, str, b5, this.f16233b, this.f16235d, executor, c0499b.f7605b, this.f16237g, this.f16238h);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public final C1939x b(String str) {
        HashMap hashMap = this.f16239i;
        try {
            C1939x c1939x = (C1939x) hashMap.get(str);
            if (c1939x == null) {
                C1939x c1939x2 = new C1939x(str, this.f16236e);
                hashMap.put(str, c1939x2);
                return c1939x2;
            }
            return c1939x;
        } catch (C1967a e7) {
            throw new Exception(e7);
        }
    }
}
