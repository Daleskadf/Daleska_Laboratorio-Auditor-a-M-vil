package A;

import B5.K;
import B5.L;
import B5.N;
import D.AbstractC0059i;
import D.C0063m;
import D.RunnableC0053c;
import D.u0;
import K5.t;
import L5.p;
import L5.r;
import L5.y;
import M3.q;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.lifecycle.InterfaceC0568u;
import androidx.lifecycle.X;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g0.InterfaceC1003a;
import h3.AbstractC1079a;
import io.flutter.view.FlutterCallbackInformation;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.s;
import org.apache.tika.metadata.ClimateForcast;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.XMLReaderUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p.Y0;
import z.AbstractC2038a;
/* loaded from: classes.dex */
public final class f implements N, H.c, F2.b, K2.b, I6.d, J2.g, p, L5.c, L5.d, M0.g {

    /* renamed from: d  reason: collision with root package name */
    public static f f8d;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9a;

    /* renamed from: b  reason: collision with root package name */
    public Object f10b;

    /* renamed from: c  reason: collision with root package name */
    public Object f11c;

    public /* synthetic */ f(int i7) {
        this.f9a = i7;
    }

    public static ArrayList c(f fVar, JSONArray jSONArray) {
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            int i8 = K5.e.f2703b[K5.l.a(jSONArray.getString(i7)).ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    arrayList.add(K5.l.BOTTOM_OVERLAYS);
                }
            } else {
                arrayList.add(K5.l.TOP_OVERLAYS);
            }
        }
        return arrayList;
    }

    public static K5.k d(f fVar, String str) {
        fVar.getClass();
        int i7 = K5.e.f2704c[K5.k.a(str).ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        return K5.k.EDGE_TO_EDGE;
                    }
                    return K5.k.EDGE_TO_EDGE;
                }
                return K5.k.IMMERSIVE_STICKY;
            }
            return K5.k.IMMERSIVE;
        }
        return K5.k.LEAN_BACK;
    }

    public static Y0 e(f fVar, JSONObject jSONObject) {
        Integer num;
        K5.f fVar2;
        Boolean bool;
        Integer num2;
        K5.f fVar3;
        Integer num3;
        fVar.getClass();
        Boolean bool2 = null;
        if (!jSONObject.isNull("statusBarColor")) {
            num = Integer.valueOf(jSONObject.getInt("statusBarColor"));
        } else {
            num = null;
        }
        if (!jSONObject.isNull("statusBarIconBrightness")) {
            fVar2 = K5.f.a(jSONObject.getString("statusBarIconBrightness"));
        } else {
            fVar2 = null;
        }
        if (!jSONObject.isNull("systemStatusBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced"));
        } else {
            bool = null;
        }
        if (!jSONObject.isNull("systemNavigationBarColor")) {
            num2 = Integer.valueOf(jSONObject.getInt("systemNavigationBarColor"));
        } else {
            num2 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarIconBrightness")) {
            fVar3 = K5.f.a(jSONObject.getString("systemNavigationBarIconBrightness"));
        } else {
            fVar3 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarDividerColor")) {
            num3 = Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor"));
        } else {
            num3 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool2 = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new Y0(num, fVar2, bool, num2, fVar3, num3, bool2);
    }

    public static String f(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public static HashMap g(String str, int i7, int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        AbstractC0059i.G(i7, hashMap, "selectionBase", i8, "selectionExtent");
        AbstractC0059i.G(i9, hashMap, "composingBase", i10, "composingExtent");
        return hashMap;
    }

    @Override // M0.g
    public M0.h a() {
        return new M0.m((Context) this.f10b, ((H1.e) this.f11c).a());
    }

    @Override // J2.g
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        A2.b bVar = J2.i.f2409e;
        J2.i iVar = (J2.i) this.f10b;
        iVar.getClass();
        ArrayList arrayList = new ArrayList();
        D2.b bVar2 = (D2.b) this.f11c;
        Long b5 = J2.i.b(sQLiteDatabase, bVar2);
        if (b5 != null) {
            J2.i.j(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b5.toString()}, null, null, null, String.valueOf(iVar.f2413d.f2393b)), new V2.k(iVar, arrayList, bVar2, 18));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            sb.append(((J2.b) arrayList.get(i7)).f2397a);
            if (i7 < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        J2.i.j(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR}, sb.toString(), null, null, null, null), new A4.c(hashMap, 12));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            J2.b bVar3 = (J2.b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(bVar3.f2397a))) {
                q c8 = bVar3.f2399c.c();
                long j = bVar3.f2397a;
                for (J2.h hVar : (Set) hashMap.get(Long.valueOf(j))) {
                    c8.h(hVar.f2407a, hVar.f2408b);
                }
                listIterator.set(new J2.b(j, bVar3.f2398b, c8.k()));
            }
        }
        return arrayList;
    }

    @Override // B5.N
    public void b(KeyEvent keyEvent, l lVar) {
        String str;
        int action = keyEvent.getAction();
        boolean z7 = true;
        if (action != 0 && action != 1) {
            lVar.i(false);
            return;
        }
        Character a7 = ((L) this.f11c).a(keyEvent.getUnicodeChar());
        if (action == 0) {
            z7 = false;
        }
        j jVar = new j(lVar, 1);
        c cVar = (c) this.f10b;
        HashMap hashMap = new HashMap();
        if (z7) {
            str = "keyup";
        } else {
            str = "keydown";
        }
        hashMap.put("type", str);
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a7.toString());
        hashMap.put(ClimateForcast.SOURCE, Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        ((E.e) cVar.f4b).f0(hashMap, new j(jVar, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.internal.o, java.lang.Object] */
    @Override // I6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c0(I6.e r7, n6.d r8) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.f.c0(I6.e, n6.d):java.lang.Object");
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        return new E2.f((Context) ((F2.c) this.f10b).f1160a, (E2.e) ((A4.c) this.f11c).get());
    }

    @Override // L5.c
    public void h(Object obj) {
        switch (this.f9a) {
            case 23:
                V2.k kVar = (V2.k) this.f11c;
                t tVar = (t) this.f10b;
                ((ConcurrentLinkedQueue) kVar.f5965b).remove(tVar);
                if (!((ConcurrentLinkedQueue) kVar.f5965b).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(tVar.f2741a));
                    return;
                }
                return;
            default:
                ((D5.f) this.f10b).a(((L5.n) ((E.e) ((f) this.f11c).f11c).f922d).a(obj));
                return;
        }
    }

    public void i(String str, PrintWriter printWriter) {
        boolean z7;
        D0.c cVar = (D0.c) this.f11c;
        if (cVar.f828b.f4837c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i7 = 0;
            while (true) {
                S.l lVar = cVar.f828b;
                if (i7 < lVar.f4837c) {
                    D0.a aVar = (D0.a) lVar.f4836b[i7];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(cVar.f828b.f4835a[i7]);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    printWriter.println((Object) null);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(aVar.f822l);
                    V2.d dVar = aVar.f822l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f5948a);
                    if (dVar.f5949b || dVar.f5952e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f5949b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f5952e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f5950c || dVar.f5951d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f5950c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.f5951d);
                    }
                    if (dVar.f5953g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f5953g);
                        printWriter.print(" waiting=");
                        dVar.f5953g.getClass();
                        printWriter.println(false);
                    }
                    if (dVar.f5954h != null) {
                        printWriter.print(str3);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(dVar.f5954h);
                        printWriter.print(" waiting=");
                        dVar.f5954h.getClass();
                        printWriter.println(false);
                    }
                    if (aVar.f824n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f824n);
                        D0.b bVar = aVar.f824n;
                        bVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(bVar.f826b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    V2.d dVar2 = aVar.f822l;
                    Object d7 = aVar.d();
                    dVar2.getClass();
                    StringBuilder sb = new StringBuilder(64);
                    if (d7 == null) {
                        sb.append("null");
                    } else {
                        Class<?> cls = d7.getClass();
                        sb.append(cls.getSimpleName());
                        sb.append("{");
                        sb.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb.append("}");
                    }
                    printWriter.println(sb.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    if (aVar.f7882c > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    printWriter.println(z7);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K4.p j(P4.a r9) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.f.j(P4.a):K4.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory k(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.f.k(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // L5.d
    public void l(ByteBuffer byteBuffer, D5.f fVar) {
        switch (this.f9a) {
            case 26:
                E.e eVar = (E.e) this.f11c;
                try {
                    ((L5.b) this.f10b).j(((L5.n) eVar.f922d).b(byteBuffer), new f(this, fVar, 25, false));
                    return;
                } catch (RuntimeException e7) {
                    Log.e("BasicMessageChannel#" + ((String) eVar.f921c), "Failed to handle message", e7);
                    fVar.a(null);
                    return;
                }
            default:
                r rVar = (r) this.f11c;
                try {
                    ((p) this.f10b).onMethodCall(rVar.f3042c.e(byteBuffer), new K5.r(1, this, fVar));
                    return;
                } catch (RuntimeException e8) {
                    Log.e("MethodChannel#" + rVar.f3041b, "Failed to handle method call", e8);
                    fVar.a(rVar.f3042c.c(e8.getMessage(), Log.getStackTraceString(e8)));
                    return;
                }
        }
    }

    @Override // L5.p
    public void onMethodCall(L5.o oVar, L5.q qVar) {
        A4.c cVar = (A4.c) this.f11c;
        if (((V2.k) cVar.f218b) == null) {
            ((K5.r) qVar).a((Map) this.f10b);
            return;
        }
        String str = oVar.f3038a;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            ((K5.r) qVar).c();
            return;
        }
        try {
            this.f10b = DesugarCollections.unmodifiableMap(((K) ((N[]) ((V2.k) cVar.f218b).f5965b)[0]).f324b);
        } catch (IllegalStateException e7) {
            ((K5.r) qVar).b(null, "error", e7.getMessage());
        }
        ((K5.r) qVar).a((Map) this.f10b);
    }

    @Override // H.c
    public void onSuccess(Object obj) {
        switch (this.f9a) {
            case 3:
                Void r52 = (Void) obj;
                g0.c.g(null, ((U.i) this.f10b).a(null));
                return;
            case 4:
                Void r53 = (Void) obj;
                ((InterfaceC1003a) this.f10b).accept(new C0063m(0, (Surface) this.f11c));
                return;
            default:
                M.n nVar = (M.n) obj;
                nVar.getClass();
                M.e eVar = (M.e) ((V2.k) this.f11c).f5965b;
                if (eVar.f3071e.get()) {
                    nVar.close();
                    return;
                }
                RunnableC0053c runnableC0053c = new RunnableC0053c(5, eVar, nVar);
                Objects.requireNonNull(nVar);
                eVar.b(runnableC0053c, new C.b(nVar, 8));
                return;
        }
    }

    public String toString() {
        switch (this.f9a) {
            case 5:
                StringBuilder sb = new StringBuilder((int) RecognitionOptions.ITF);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((InterfaceC0568u) this.f10b).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            case 6:
                StringBuilder sb2 = new StringBuilder("DartCallback( bundle path: ");
                sb2.append((String) this.f10b);
                sb2.append(", library path: ");
                FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) this.f11c;
                sb2.append(flutterCallbackInformation.callbackLibraryPath);
                sb2.append(", function: ");
                return AbstractC0059i.D(sb2, flutterCallbackInformation.callbackName, " )");
            case 17:
                return ((HashMap) this.f10b).toString();
            default:
                return super.toString();
        }
    }

    @Override // K2.b
    public Object w() {
        J2.i iVar = (J2.i) ((I2.g) this.f10b).f2189c;
        iVar.getClass();
        return (Iterable) iVar.c(new f(16, iVar, (D2.b) this.f11c));
    }

    @Override // H.c
    public void z(Throwable th) {
        switch (this.f9a) {
            case 3:
                if (th instanceof u0) {
                    g0.c.g(null, ((U.l) this.f11c).cancel(false));
                    return;
                } else {
                    g0.c.g(null, ((U.i) this.f10b).a(null));
                    return;
                }
            case 4:
                g0.c.g("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof u0);
                ((InterfaceC1003a) this.f10b).accept(new C0063m(1, (Surface) this.f11c));
                return;
            default:
                int i7 = ((M.m) this.f10b).f;
                if (i7 == 2 && (th instanceof CancellationException)) {
                    org.slf4j.helpers.i.l("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                org.slf4j.helpers.i.P("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + AbstractC1079a.k(i7), th);
                return;
        }
    }

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.f9a = i7;
        this.f10b = obj;
        this.f11c = obj2;
    }

    public /* synthetic */ f(Object obj, Object obj2, int i7, boolean z7) {
        this.f9a = i7;
        this.f11c = obj;
        this.f10b = obj2;
    }

    public f(c cVar) {
        this.f9a = 1;
        this.f11c = new L();
        this.f10b = cVar;
    }

    public f(A4.c cVar) {
        this.f9a = 18;
        this.f11c = cVar;
        this.f10b = new HashMap();
    }

    public f(InterfaceC0568u interfaceC0568u, X store) {
        this.f9a = 5;
        this.f10b = interfaceC0568u;
        t2.i iVar = D0.c.f827d;
        kotlin.jvm.internal.j.e(store, "store");
        B0.a defaultCreationExtras = B0.a.f228b;
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        V2.k kVar = new V2.k(store, iVar, defaultCreationExtras);
        kotlin.jvm.internal.e a7 = s.a(D0.c.class);
        String b5 = a7.b();
        if (b5 != null) {
            this.f11c = (D0.c) kVar.v(a7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b5));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public f(String str) {
        this.f9a = 0;
        this.f10b = (ExtraSupportedOutputSizeQuirk) AbstractC2038a.f16621a.a0(ExtraSupportedOutputSizeQuirk.class);
        this.f11c = new b(str);
    }

    public f() {
        this.f9a = 2;
        this.f10b = new LongSparseArray();
        this.f11c = new PriorityQueue();
    }

    public f(D5.b bVar, int i7) {
        this.f9a = i7;
        switch (i7) {
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                C5.i iVar = new C5.i(this, 14);
                r rVar = new r(bVar, "flutter/platform", L5.m.f3037a, null);
                this.f10b = rVar;
                rVar.b(iVar);
                return;
            case 21:
                m mVar = new m(this, 10);
                r rVar2 = new r(bVar, "flutter/platform_views", y.f3047b, null);
                this.f10b = rVar2;
                rVar2.b(mVar);
                return;
            case 22:
            case 23:
            default:
                C5.i iVar2 = new C5.i(this, 13);
                r rVar3 = new r(bVar, "flutter/localization", L5.m.f3037a, null);
                this.f10b = rVar3;
                rVar3.b(iVar2);
                return;
            case 24:
                m mVar2 = new m(this, 12);
                r rVar4 = new r(bVar, "flutter/textinput", L5.m.f3037a, null);
                this.f10b = rVar4;
                rVar4.b(mVar2);
                return;
        }
    }

    public f(D5.b bVar, PackageManager packageManager) {
        this.f9a = 22;
        c cVar = new c(this, 11);
        this.f10b = packageManager;
        new r(bVar, "flutter/processtext", y.f3047b, null).b(cVar);
    }

    public f(Context context, H1.e eVar) {
        this.f9a = 29;
        this.f10b = context.getApplicationContext();
        this.f11c = eVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i7) {
        this(context, new H1.e(1));
        this.f9a = i7;
        switch (i7) {
            case 29:
                return;
            default:
                this.f11c = null;
                this.f10b = context;
                return;
        }
    }

    public f(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
        this.f9a = 6;
        this.f10b = str;
        this.f11c = flutterCallbackInformation;
    }
}
