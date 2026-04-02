package A;

import A3.H;
import D.b0;
import D.g0;
import G1.u;
import H0.C0126f;
import H0.F;
import H0.K;
import H0.N;
import H4.e1;
import H4.p1;
import K4.p;
import K4.x;
import O0.C0244f;
import O0.E;
import X0.y;
import X0.z;
import X5.C0375a;
import X5.C0382h;
import android.util.Log;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e1.r;
import h3.AbstractC1079a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.json.JSONException;
import org.json.JSONObject;
import s.InterfaceC1749a;
/* loaded from: classes.dex */
public final /* synthetic */ class j implements U.j, S, z3.i, K0.c, p, L5.c, K0.h, H.a, InterfaceC1749a, V6.b, y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19b;

    public /* synthetic */ j(P0.a aVar, r rVar, b1.g gVar, IOException iOException, boolean z7) {
        this.f18a = 21;
        this.f19b = gVar;
    }

    @Override // X0.y
    public int a(Object obj) {
        boolean z7;
        X0.m mVar = (X0.m) obj;
        mVar.getClass();
        H0.r rVar = (H0.r) this.f19b;
        String str = rVar.f1886m;
        String str2 = mVar.f6287b;
        if (!str2.equals(str) && !str2.equals(z.b(rVar))) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7 && mVar.c(rVar, false)) {
            return 1;
        }
        return 0;
    }

    @Override // K0.c
    public void accept(Object obj) {
        J1.a aVar = (J1.a) obj;
        switch (this.f18a) {
            case 6:
                J1.h hVar = (J1.h) this.f19b;
                hVar.getClass();
                J1.g gVar = new J1.g(aVar.f2355b, e5.b.q(aVar.f2354a, aVar.f2356c));
                hVar.f2368c.add(gVar);
                long j = hVar.j;
                if (j == -9223372036854775807L || aVar.f2355b >= j) {
                    hVar.b(gVar);
                    return;
                }
                return;
            default:
                ((H) this.f19b).a(aVar);
                return;
        }
    }

    @Override // z3.i
    public E3.b apply(Object obj) {
        return (E3.b) ((E6.l) this.f19b).invoke(obj);
    }

    @Override // androidx.camera.core.impl.S
    public void b(T t7) {
        switch (this.f18a) {
            case 3:
                g0 g0Var = (g0) this.f19b;
                synchronized (g0Var.f705a) {
                    g0Var.f707c++;
                }
                g0Var.e(t7);
                return;
            default:
                ((f) this.f19b).getClass();
                try {
                    b0 acquireLatestImage = t7.acquireLatestImage();
                    if (acquireLatestImage != null) {
                        AbstractC1079a.e();
                        org.slf4j.helpers.i.O("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + acquireLatestImage);
                        acquireLatestImage.close();
                        return;
                    }
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }

    @Override // K4.p
    public Object c() {
        Object obj = this.f19b;
        switch (this.f18a) {
            case 9:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e7) {
                    org.slf4j.helpers.i iVar = N4.c.f3448a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
                } catch (InstantiationException e8) {
                    throw new RuntimeException("Failed to invoke constructor '" + N4.c.b(constructor) + "' with no args", e8);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException("Failed to invoke constructor '" + N4.c.b(constructor) + "' with no args", e9.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return x.f2695a.a(cls);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
                }
        }
    }

    @Override // V6.b
    public Object e(X6.b bVar) {
        return (X6.c) this.f19b;
    }

    @Override // L5.c
    public void h(Object obj) {
        switch (this.f18a) {
            case 11:
                boolean z7 = false;
                if (obj != null) {
                    try {
                        z7 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e7) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e7);
                    }
                }
                ((l) ((j) this.f19b).f19b).i(z7);
                return;
            default:
                boolean z8 = obj instanceof List;
                long j = ((C0382h) this.f19b).f6494a;
                if (z8) {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        org.slf4j.helpers.i.j(new C0375a((String) obj2, (String) obj3, (String) list.get(2)));
                        Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j);
                        return;
                    }
                    return;
                }
                org.slf4j.helpers.i.j(new C0375a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", StringUtils.EMPTY));
                Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j);
                return;
        }
    }

    @Override // U.j
    public Object i(U.i iVar) {
        switch (this.f18a) {
            case 0:
                k kVar = (k) this.f19b;
                kVar.f22c = iVar;
                return "RequestCompleteListener[" + kVar + "]";
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                M.l lVar = (M.l) this.f19b;
                lVar.f3100p = iVar;
                return "SettableFuture hashCode: " + lVar.hashCode();
            default:
                ((M.n) this.f19b).f3125f0 = iVar;
                return "SurfaceOutputImpl close future complete";
        }
    }

    @Override // K0.h
    public void invoke(Object obj) {
        switch (this.f18a) {
            case 14:
                ((N) obj).l((F) this.f19b);
                return;
            case 15:
                ((N) obj).m((C0126f) this.f19b);
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                ((N) obj).u((J0.c) this.f19b);
                return;
            case 17:
                ((N) obj).l(((E) this.f19b).f3482a.f3492F0);
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ((N) obj).w((H0.H) this.f19b);
                return;
            case 19:
            default:
                ((P0.i) obj).f3937n = (K) this.f19b;
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                P0.i iVar = (P0.i) obj;
                int i7 = iVar.f3947x;
                C0244f c0244f = (C0244f) this.f19b;
                iVar.f3947x = i7 + c0244f.f3736g;
                iVar.f3948y += c0244f.f3735e;
                return;
            case 21:
                P0.i iVar2 = (P0.i) obj;
                iVar2.getClass();
                iVar2.f3945v = ((b1.g) this.f19b).f8135a;
                return;
        }
    }

    public /* synthetic */ j(P0.a aVar, Object obj, int i7) {
        this.f18a = i7;
        this.f19b = obj;
    }

    public /* synthetic */ j(Object obj, int i7) {
        this.f18a = i7;
        this.f19b = obj;
    }

    @Override // z3.i
    public Object apply(Object obj) {
        switch (this.f18a) {
            case 5:
                u uVar = (u) obj;
                ((G1.n) this.f19b).getClass();
                return uVar;
            default:
                return (R.e) ((E6.l) this.f19b).invoke(obj);
        }
    }
}
