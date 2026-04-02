package A;

import D.AbstractC0059i;
import D.C0054d;
import D.b0;
import D.o0;
import H0.AbstractC0128h;
import H0.J;
import K5.r;
import K5.w;
import K5.z;
import L5.p;
import L5.q;
import Q0.C0276m;
import Q0.L;
import Q0.RunnableC0275l;
import T5.A;
import Y1.K;
import Y1.s;
import Y1.t;
import a4.AbstractC0467p;
import a4.C0453b;
import a4.C0454c;
import a4.C0468q;
import a6.e0;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.InterfaceC0500b0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.f0;
import androidx.camera.core.impl.u0;
import b4.C0599g;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import g1.C1006c;
import j6.AbstractC1371b;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import o6.EnumC1565a;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import z.AbstractC2038a;
/* loaded from: classes.dex */
public class m implements f0, T, U.j, K2.b, F2.b, p, N6.b, i1.o, S3.i, I6.d, K, Continuation, H.c, i1.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27a;

    /* renamed from: b  reason: collision with root package name */
    public Object f28b;

    public /* synthetic */ m(Object obj, int i7) {
        this.f27a = i7;
        this.f28b = obj;
    }

    public static o0 W(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        return new o0(b0Var, new Size(b0Var.getWidth(), b0Var.getHeight()), new I.c(new Q.h(null, u0.f7673b, b0Var.h().b())));
    }

    public static String m0(m mVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mVar.f28b).iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC0500b0) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    @Override // S3.i
    public Object B(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 2; i7++) {
            Provider provider = Security.getProvider(strArr[i7]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            S3.k kVar = (S3.k) this.f28b;
            if (hasNext) {
                try {
                    return kVar.g(str, (Provider) it.next());
                } catch (Exception e7) {
                    if (exc == null) {
                        exc = e7;
                    }
                }
            } else {
                return kVar.g(str, null);
            }
        }
    }

    @Override // Y1.K
    public View C(int i7) {
        return ((s) this.f28b).o(i7);
    }

    @Override // Y1.K
    public int D() {
        return ((s) this.f28b).s();
    }

    @Override // androidx.camera.core.impl.T
    public int E() {
        return ((C0054d) this.f28b).E();
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ Object G(C0501c c0501c) {
        return AbstractC0059i.p(this, c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ Set H() {
        return AbstractC0059i.n(this);
    }

    @Override // Y1.K
    public int I(View view) {
        ((s) this.f28b).getClass();
        return view.getRight() + ((t) view.getLayoutParams()).f6691a.right + ((ViewGroup.MarginLayoutParams) ((t) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.camera.core.impl.T
    public b0 M() {
        return W(((C0054d) this.f28b).M());
    }

    @Override // androidx.camera.core.impl.T
    public void N(S s7, Executor executor) {
        ((C0054d) this.f28b).N(new A4.d(5, this, s7), executor);
    }

    public boolean T(Class cls) {
        Iterator it = ((ArrayList) this.f28b).iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((InterfaceC0500b0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ Set U(C0501c c0501c) {
        return AbstractC0059i.g(this, c0501c);
    }

    @Override // i1.o
    public void a() {
        R0.h hVar = (R0.h) this.f28b;
        hVar.f4591v0.a();
        R0.a aVar = hVar.f4593x0;
        if (aVar == null) {
            return;
        }
        throw aVar;
    }

    public InterfaceC0500b0 a0(Class cls) {
        Iterator it = ((ArrayList) this.f28b).iterator();
        while (it.hasNext()) {
            InterfaceC0500b0 interfaceC0500b0 = (InterfaceC0500b0) it.next();
            if (interfaceC0500b0.getClass() == cls) {
                return interfaceC0500b0;
            }
        }
        return null;
    }

    @Override // androidx.camera.core.impl.T
    public b0 acquireLatestImage() {
        return W(((C0054d) this.f28b).acquireLatestImage());
    }

    @Override // Y1.K
    public int b() {
        s sVar = (s) this.f28b;
        return sVar.f - sVar.t();
    }

    public N0.a b0() {
        return null;
    }

    @Override // androidx.camera.core.impl.T
    public int c() {
        return ((C0054d) this.f28b).c();
    }

    @Override // I6.d
    public Object c0(I6.e eVar, n6.d dVar) {
        Object c02 = ((I6.d) this.f28b).c0(new A(eVar, 0), dVar);
        if (c02 == EnumC1565a.COROUTINE_SUSPENDED) {
            return c02;
        }
        return l6.j.f13876a;
    }

    @Override // androidx.camera.core.impl.T
    public void close() {
        ((C0054d) this.f28b).close();
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ F e0(C0501c c0501c) {
        return AbstractC0059i.e(this, c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ Object f0(C0501c c0501c, Object obj) {
        return AbstractC0059i.q(this, c0501c, obj);
    }

    public T0.b g0() {
        return (T0.b) this.f28b;
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        J2.d.f2400a.get();
        Integer num = 4;
        return new J2.l(num.intValue(), (Context) ((F2.c) this.f28b).f1160a, "com.google.android.datatransport.events");
    }

    @Override // androidx.camera.core.impl.T
    public int getHeight() {
        return ((C0054d) this.f28b).getHeight();
    }

    @Override // androidx.camera.core.impl.T
    public Surface getSurface() {
        return ((C0054d) this.f28b).getSurface();
    }

    @Override // androidx.camera.core.impl.T
    public int getWidth() {
        return ((C0054d) this.f28b).getWidth();
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ boolean h(C0501c c0501c) {
        return AbstractC0059i.a(this, c0501c);
    }

    public UUID h0() {
        return AbstractC0128h.f1800a;
    }

    @Override // U.j
    public Object i(U.i iVar) {
        boolean z7;
        H.m mVar = (H.m) this.f28b;
        if (mVar.f == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g("The result can only set once!", z7);
        mVar.f = iVar;
        return "ListFuture[" + this + "]";
    }

    public int i0() {
        return 1;
    }

    @Override // i1.p
    public Object j(Uri uri, M0.j jVar) {
        try {
            XmlPullParser newPullParser = ((XmlPullParserFactory) this.f28b).newPullParser();
            newPullParser.setInput(jVar, null);
            return (d1.c) new d1.h(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e7) {
            throw J.b(null, e7);
        }
    }

    public void j0(Exception exc) {
        K0.a.o("MediaCodecAudioRenderer", "Audio sink error", exc);
        C0276m c0276m = ((L) this.f28b).f4229A1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new RunnableC0275l(c0276m, exc, 5));
        }
    }

    @Override // Y1.K
    public int k(View view) {
        ((s) this.f28b).getClass();
        return (view.getLeft() - ((t) view.getLayoutParams()).f6691a.left) - ((ViewGroup.MarginLayoutParams) ((t) view.getLayoutParams())).leftMargin;
    }

    public boolean l0(String str) {
        return false;
    }

    @Override // androidx.camera.core.impl.G
    public void m(A4.d dVar) {
        u().m(dVar);
    }

    @Override // androidx.camera.core.impl.G
    public /* synthetic */ Object n(C0501c c0501c, F f) {
        return AbstractC0059i.r(this, c0501c, f);
    }

    public void n0(e0 e0Var, byte[] bArr) {
        AbstractC1371b.c();
        try {
            String str = "/" + ((String) ((d6.m) this.f28b).j.f4138d);
            if (bArr != null) {
                ((d6.m) this.f28b).f10432q = true;
                str = str + "?" + B3.e.f266c.c(bArr);
            }
            synchronized (((d6.m) this.f28b).f10429n.f10421w) {
                d6.l.k(((d6.m) this.f28b).f10429n, e0Var, str);
            }
            AbstractC1371b.f13458a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1371b.f13458a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // L5.p
    public void onMethodCall(L5.o oVar, q qVar) {
        char c8;
        boolean z7;
        ByteBuffer byteBuffer;
        K5.n nVar;
        double d7;
        double d8;
        char c9;
        Bundle bundle;
        int i7 = 0;
        switch (this.f27a) {
            case 8:
                ((v4.d) this.f28b).getClass();
                return;
            case 9:
                c cVar = (c) this.f28b;
                if (((C5.i) cVar.f4b) != null) {
                    String str = oVar.f3038a;
                    try {
                        if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                            try {
                                ((C5.i) cVar.f4b).g0((String) ((HashMap) oVar.f3039b).get("kind"));
                                ((r) qVar).a(Boolean.TRUE);
                            } catch (Exception e7) {
                                ((r) qVar).b(null, "error", "Error when setting cursors: " + e7.getMessage());
                            }
                        }
                        return;
                    } catch (Exception e8) {
                        ((r) qVar).b(null, "error", "Unhandled error: " + e8.getMessage());
                        return;
                    }
                }
                return;
            case 10:
                f fVar = (f) this.f28b;
                if (((io.flutter.plugin.platform.n) fVar.f11c) != null) {
                    String str2 = oVar.f3038a;
                    str2.getClass();
                    Object obj = oVar.f3039b;
                    switch (str2.hashCode()) {
                        case -1352294148:
                            if (str2.equals("create")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1019779949:
                            if (str2.equals(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR)) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -934437708:
                            if (str2.equals("resize")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -756050293:
                            if (str2.equals("clearFocus")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -308988850:
                            if (str2.equals("synchronizeToNativeViewHierarchy")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 110550847:
                            if (str2.equals("touch")) {
                                c8 = 5;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 576796989:
                            if (str2.equals("setDirection")) {
                                c8 = 6;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1671767583:
                            if (str2.equals("dispose")) {
                                c8 = 7;
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                            Map map = (Map) obj;
                            if (map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue()) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (map.containsKey("params")) {
                                byteBuffer = ByteBuffer.wrap((byte[]) map.get("params"));
                            } else {
                                byteBuffer = null;
                            }
                            try {
                                if (z7) {
                                    K5.o oVar2 = new K5.o(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), K5.n.HYBRID_ONLY, byteBuffer);
                                    io.flutter.plugin.platform.o oVar3 = (io.flutter.plugin.platform.o) ((io.flutter.plugin.platform.n) fVar.f11c).f11714a;
                                    oVar3.getClass();
                                    io.flutter.plugin.platform.o.d(19);
                                    io.flutter.plugin.platform.o.a(oVar3, oVar2);
                                    oVar3.b(oVar2, false);
                                    io.flutter.plugin.platform.o.d(19);
                                    ((r) qVar).a(null);
                                    return;
                                }
                                if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                    i7 = 1;
                                }
                                if (i7 != 0) {
                                    nVar = K5.n.TEXTURE_WITH_HYBRID_FALLBACK;
                                } else {
                                    nVar = K5.n.TEXTURE_WITH_VIRTUAL_FALLBACK;
                                }
                                K5.n nVar2 = nVar;
                                int intValue = ((Integer) map.get("id")).intValue();
                                String str3 = (String) map.get("viewType");
                                if (map.containsKey("top")) {
                                    d7 = ((Double) map.get("top")).doubleValue();
                                } else {
                                    d7 = 0.0d;
                                }
                                if (map.containsKey("left")) {
                                    d8 = ((Double) map.get("left")).doubleValue();
                                } else {
                                    d8 = 0.0d;
                                }
                                long d9 = ((io.flutter.plugin.platform.n) fVar.f11c).d(new K5.o(intValue, str3, d7, d8, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), nVar2, byteBuffer));
                                if (d9 == -2) {
                                    if (i7 != 0) {
                                        ((r) qVar).a(null);
                                        return;
                                    }
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                ((r) qVar).a(Long.valueOf(d9));
                                return;
                            } catch (IllegalStateException e9) {
                                ((r) qVar).b(null, "error", Log.getStackTraceString(e9));
                                return;
                            }
                        case 1:
                            Map map2 = (Map) obj;
                            try {
                                ((io.flutter.plugin.platform.n) fVar.f11c).g(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                                ((r) qVar).a(null);
                                return;
                            } catch (IllegalStateException e10) {
                                ((r) qVar).b(null, "error", Log.getStackTraceString(e10));
                                return;
                            }
                        case 2:
                            Map map3 = (Map) obj;
                            try {
                                ((io.flutter.plugin.platform.n) fVar.f11c).j(new K5.p(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new K5.m((r) qVar, 0));
                                return;
                            } catch (IllegalStateException e11) {
                                ((r) qVar).b(null, "error", Log.getStackTraceString(e11));
                                return;
                            }
                        case 3:
                            try {
                                ((io.flutter.plugin.platform.n) fVar.f11c).c(((Integer) obj).intValue());
                                ((r) qVar).a(null);
                                return;
                            } catch (IllegalStateException e12) {
                                ((r) qVar).b(null, "error", Log.getStackTraceString(e12));
                                return;
                            }
                        case 4:
                            try {
                                ((io.flutter.plugin.platform.o) ((io.flutter.plugin.platform.n) fVar.f11c).f11714a).f11730q = ((Boolean) obj).booleanValue();
                                ((r) qVar).a(null);
                                return;
                            } catch (IllegalStateException e13) {
                                ((r) qVar).b(null, "error", Log.getStackTraceString(e13));
                                return;
                            }
                        case 5:
                            List list = (List) obj;
                            try {
                                ((io.flutter.plugin.platform.n) fVar.f11c).h(new K5.q(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                                ((r) qVar).a(null);
                                return;
                            } catch (IllegalStateException e14) {
                                ((r) qVar).b(null, "error", Log.getStackTraceString(e14));
                                return;
                            }
                        case 6:
                            Map map4 = (Map) obj;
                            try {
                                ((io.flutter.plugin.platform.n) fVar.f11c).k(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                                ((r) qVar).a(null);
                                return;
                            } catch (IllegalStateException e15) {
                                ((r) qVar).b(null, "error", Log.getStackTraceString(e15));
                                return;
                            }
                        case 7:
                            try {
                                ((io.flutter.plugin.platform.n) fVar.f11c).e(((Integer) ((Map) obj).get("id")).intValue());
                                ((r) qVar).a(null);
                                return;
                            } catch (IllegalStateException e16) {
                                ((r) qVar).b(null, "error", Log.getStackTraceString(e16));
                                return;
                            }
                        default:
                            ((r) qVar).c();
                            return;
                    }
                }
                return;
            default:
                f fVar2 = (f) this.f28b;
                if (((C1006c) fVar2.f11c) != null) {
                    String str4 = oVar.f3038a;
                    str4.getClass();
                    Object obj2 = oVar.f3039b;
                    switch (str4.hashCode()) {
                        case -1779068172:
                            if (str4.equals("TextInput.setPlatformViewClient")) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1015421462:
                            if (str4.equals("TextInput.setEditingState")) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -37561188:
                            if (str4.equals("TextInput.setClient")) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 270476819:
                            if (str4.equals("TextInput.hide")) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 270803918:
                            if (str4.equals("TextInput.show")) {
                                c9 = 4;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 649192816:
                            if (str4.equals("TextInput.sendAppPrivateCommand")) {
                                c9 = 5;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1204752139:
                            if (str4.equals("TextInput.setEditableSizeAndTransform")) {
                                c9 = 6;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1727570905:
                            if (str4.equals("TextInput.finishAutofillContext")) {
                                c9 = 7;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1904427655:
                            if (str4.equals("TextInput.clearClient")) {
                                c9 = '\b';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2113369584:
                            if (str4.equals("TextInput.requestAutofill")) {
                                c9 = '\t';
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    switch (c9) {
                        case 0:
                            try {
                                JSONObject jSONObject = (JSONObject) obj2;
                                ((C1006c) fVar2.f11c).I(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                                ((r) qVar).a(null);
                                return;
                            } catch (JSONException e17) {
                                ((r) qVar).b(null, "error", e17.getMessage());
                                return;
                            }
                        case 1:
                            try {
                                ((C1006c) fVar2.f11c).G(z.a((JSONObject) obj2));
                                ((r) qVar).a(null);
                                return;
                            } catch (JSONException e18) {
                                ((r) qVar).b(null, "error", e18.getMessage());
                                return;
                            }
                        case 2:
                            try {
                                JSONArray jSONArray = (JSONArray) obj2;
                                ((C1006c) fVar2.f11c).E(jSONArray.getInt(0), w.a(jSONArray.getJSONObject(1)));
                                ((r) qVar).a(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e19) {
                                ((r) qVar).b(null, "error", e19.getMessage());
                                return;
                            }
                        case 3:
                            io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) ((C1006c) fVar2.f11c).f11091a;
                            if (((io.flutter.plugin.editing.j) kVar.f11666e.f336c) == io.flutter.plugin.editing.j.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                                kVar.d();
                            } else {
                                kVar.d();
                                kVar.f11663b.hideSoftInputFromWindow(kVar.f11662a.getApplicationWindowToken(), 0);
                            }
                            ((r) qVar).a(null);
                            return;
                        case 4:
                            io.flutter.plugin.editing.k kVar2 = (io.flutter.plugin.editing.k) ((C1006c) fVar2.f11c).f11091a;
                            View view = kVar2.f11662a;
                            w wVar = kVar2.f;
                            InputMethodManager inputMethodManager = kVar2.f11663b;
                            if (wVar != null && wVar.f2750g.f2755a == K5.A.NONE) {
                                kVar2.d();
                                inputMethodManager.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
                            } else {
                                view.requestFocus();
                                inputMethodManager.showSoftInput(view, 0);
                            }
                            ((r) qVar).a(null);
                            return;
                        case 5:
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj2;
                                String string = jSONObject2.getString("action");
                                String string2 = jSONObject2.getString("data");
                                if (string2 != null && !string2.isEmpty()) {
                                    bundle = new Bundle();
                                    bundle.putString("data", string2);
                                } else {
                                    bundle = null;
                                }
                                io.flutter.plugin.editing.k kVar3 = (io.flutter.plugin.editing.k) ((C1006c) fVar2.f11c).f11091a;
                                kVar3.f11663b.sendAppPrivateCommand(kVar3.f11662a, string, bundle);
                                ((r) qVar).a(null);
                                return;
                            } catch (JSONException e20) {
                                ((r) qVar).b(null, "error", e20.getMessage());
                                return;
                            }
                        case 6:
                            try {
                                JSONObject jSONObject3 = (JSONObject) obj2;
                                double d10 = jSONObject3.getDouble("width");
                                double d11 = jSONObject3.getDouble("height");
                                JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                                double[] dArr = new double[16];
                                while (i7 < 16) {
                                    dArr[i7] = jSONArray2.getDouble(i7);
                                    i7++;
                                }
                                ((C1006c) fVar2.f11c).F(d10, d11, dArr);
                                ((r) qVar).a(null);
                                return;
                            } catch (JSONException e21) {
                                ((r) qVar).b(null, "error", e21.getMessage());
                                return;
                            }
                        case 7:
                            C1006c c1006c = (C1006c) fVar2.f11c;
                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = ((io.flutter.plugin.editing.k) c1006c.f11091a).f11664c;
                                if (autofillManager != null) {
                                    if (booleanValue) {
                                        io.flutter.plugin.editing.i.t(autofillManager);
                                    } else {
                                        io.flutter.plugin.editing.i.D(autofillManager);
                                    }
                                }
                            } else {
                                c1006c.getClass();
                            }
                            ((r) qVar).a(null);
                            return;
                        case '\b':
                            io.flutter.plugin.editing.k kVar4 = (io.flutter.plugin.editing.k) ((C1006c) fVar2.f11c).f11091a;
                            io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) kVar4.f11666e.f336c;
                            io.flutter.plugin.editing.j jVar2 = io.flutter.plugin.editing.j.VIRTUAL_DISPLAY_PLATFORM_VIEW;
                            if (jVar != jVar2) {
                                kVar4.f11668h.e(kVar4);
                                kVar4.d();
                                kVar4.f = null;
                                kVar4.e(null);
                                io.flutter.plugin.editing.j jVar3 = io.flutter.plugin.editing.j.NO_TARGET;
                                kVar4.f11666e = new B5.S(jVar3, 0, 10);
                                if (jVar3 == jVar2) {
                                    kVar4.f11674o = false;
                                }
                                kVar4.f11671l = null;
                            }
                            ((r) qVar).a(null);
                            return;
                        case '\t':
                            int i8 = Build.VERSION.SDK_INT;
                            io.flutter.plugin.editing.k kVar5 = (io.flutter.plugin.editing.k) ((C1006c) fVar2.f11c).f11091a;
                            if (i8 >= 26) {
                                if (kVar5.f11664c != null && kVar5.f11667g != null) {
                                    int[] iArr = new int[2];
                                    View view2 = kVar5.f11662a;
                                    view2.getLocationOnScreen(iArr);
                                    Rect rect = new Rect(kVar5.f11671l);
                                    rect.offset(iArr[0], iArr[1]);
                                    kVar5.f11664c.notifyViewEntered(view2, ((String) kVar5.f.j.f920b).hashCode(), rect);
                                }
                            } else {
                                kVar5.getClass();
                            }
                            ((r) qVar).a(null);
                            return;
                        default:
                            ((r) qVar).c();
                            return;
                    }
                }
                return;
        }
    }

    @Override // H.c
    public void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        ((U.i) this.f28b).a(new ArrayList(list));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C0454c c0454c;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(U3.h.e(((C0599g) ((AbstractC0467p) this.f28b)).f8255c));
        String str = ((C0468q) task.getResult()).f7043a;
        I.i(str);
        firebaseAuth.getClass();
        I.e(str);
        String str2 = firebaseAuth.f9710i;
        if (str2 != null) {
            c0454c = new C0454c(new C0453b());
            c0454c.f7016Y = str2;
        } else {
            c0454c = null;
        }
        return firebaseAuth.f9707e.zza(firebaseAuth.f9703a, c0454c, str);
    }

    @Override // androidx.camera.core.impl.f0
    public G u() {
        return (G) this.f28b;
    }

    @Override // K2.b
    public Object w() {
        I2.h hVar = (I2.h) this.f28b;
        SQLiteDatabase a7 = ((J2.i) hVar.f2194b).a();
        a7.beginTransaction();
        try {
            List<D2.b> list = (List) J2.i.j(a7.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), J2.f.f2405c);
            a7.setTransactionSuccessful();
            a7.endTransaction();
            for (D2.b bVar : list) {
                hVar.f2195c.a(bVar, 1, false);
            }
            return null;
        } catch (Throwable th) {
            a7.endTransaction();
            throw th;
        }
    }

    @Override // androidx.camera.core.impl.T
    public void y() {
        ((C0054d) this.f28b).y();
    }

    @Override // H.c
    public void z(Throwable th) {
        boolean z7 = th instanceof TimeoutException;
        U.i iVar = (U.i) this.f28b;
        if (z7) {
            iVar.b(th);
        } else {
            iVar.a(Collections.emptyList());
        }
    }

    public m(List list) {
        this.f27a = 24;
        this.f28b = new ArrayList(list);
    }

    public m(int i7) {
        this.f27a = i7;
        switch (i7) {
            case 19:
                this.f28b = new SparseArray();
                return;
            case 28:
                try {
                    this.f28b = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e7) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
                }
            default:
                this.f28b = (ExtraCroppingQuirk) AbstractC2038a.f16621a.a0(ExtraCroppingQuirk.class);
                return;
        }
    }

    public m(D5.b bVar) {
        this.f27a = 11;
        new L5.r(bVar, "flutter/scribe", L5.m.f3037a, null).b(new C5.i(this, 15));
    }

    public m(UUID uuid, int i7, byte[] bArr) {
        this.f27a = 4;
        this.f28b = uuid;
    }

    public void R(T0.d dVar) {
    }

    public void k0(T0.d dVar) {
    }
}
