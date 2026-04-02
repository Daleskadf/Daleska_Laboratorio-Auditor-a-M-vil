package R1;

import A3.AbstractC0021t;
import A3.E;
import A3.I;
import A3.K;
import A3.e0;
import B5.AbstractActivityC0032e;
import D.C0054d;
import D.RunnableC0053c;
import E6.m;
import H0.C0137q;
import H0.J;
import H4.t1;
import K0.q;
import K0.v;
import K0.x;
import K6.w;
import S1.C;
import S1.H;
import T5.C0347f;
import T5.C0349h;
import T5.InterfaceC0348g;
import T5.L;
import T5.N;
import Y1.AbstractC0400a;
import a.AbstractC0412a;
import a1.C0415A;
import a4.AbstractC0467p;
import a4.C0453b;
import a4.C0454c;
import a4.C0468q;
import a6.AbstractC0471A;
import a6.C0490t;
import a6.f0;
import a6.n0;
import a6.o0;
import a6.t0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import androidx.datastore.preferences.protobuf.Y;
import androidx.recyclerview.widget.RecyclerView;
import b3.C0585f;
import b4.C0599g;
import c1.RunnableC0626c;
import c6.C0692o0;
import c6.C0697q;
import c6.C0702s;
import c6.C0708u;
import c6.EnumC0714w;
import c6.InterfaceC0717x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.S;
import com.google.firebase.firestore.Z;
import com.google.protobuf.X;
import d0.AbstractC0884b;
import e0.C0927b;
import e1.M;
import f5.C0993a;
import g.C0996a;
import h1.t;
import io.flutter.plugins.googlemaps.C0;
import io.flutter.plugins.googlemaps.E0;
import io.flutter.plugins.googlemaps.s0;
import io.flutter.plugins.googlemaps.u0;
import io.flutter.plugins.urllauncher.WebViewActivity;
import j$.util.DesugarCollections;
import j6.AbstractC1371b;
import j6.C1372c;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLSocket;
import l2.k;
import l4.C1419c;
import l4.C1421e;
import l4.C1422f;
import m1.G;
import m1.l;
import m1.o;
import m1.r;
import m6.AbstractC1447h;
import n4.C1533t;
import o6.EnumC1565a;
import org.apache.tika.utils.StringUtils;
import org.xmlpull.v1.XmlPullParserException;
import p.C1608t;
import p4.B;
import p4.C1673c;
import p4.C1675e;
import p4.C1690u;
import p4.C1691v;
import p4.C1692w;
import p4.InterfaceC1672b;
import p4.P;
import p4.Q;
import p4.W;
import q4.p;
import r3.AbstractC1740d;
import s3.BinderC1771F;
import s3.C1767B;
import s3.InterfaceC1768C;
import s3.z;
import t0.C1805d;
/* loaded from: classes.dex */
public class j implements J1.d, C, InterfaceC0348g, I6.d, X0.j, Continuation, InterfaceC0717x, InterfaceC1768C, W, B, InterfaceC1672b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4681a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4682b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4683c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4684d;

    public /* synthetic */ j() {
        this.f4681a = 12;
    }

    public static j J0(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new j(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    public static Bundle o0(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static Method z0(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return z0(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    @Override // X0.j
    public MediaFormat A() {
        return ((MediaCodec) this.f4682b).getOutputFormat();
    }

    public View A0(int i7) {
        return ((RecyclerView) ((C5.i) this.f4682b).f593b).getChildAt(i7);
    }

    @Override // T5.InterfaceC0348g
    public Map B(List list, C0349h c0349h) {
        Set set;
        Object value;
        Map<String, ?> all = k0(c0349h).getAll();
        kotlin.jvm.internal.j.d(all, "preferences.all");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value2 = entry.getValue();
            if (list != null) {
                set = AbstractC1447h.b0(list);
            } else {
                set = null;
            }
            if (L.b(key, value2, set) && (value = entry.getValue()) != null) {
                String key2 = entry.getKey();
                Object c8 = L.c(value, (C0993a) this.f4684d);
                kotlin.jvm.internal.j.c(c8, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key2, c8);
            }
        }
        return hashMap;
    }

    public int B0() {
        return ((RecyclerView) ((C5.i) this.f4682b).f593b).getChildCount();
    }

    @Override // T5.InterfaceC0348g
    public void C(String str, String str2, C0349h c0349h) {
        k0(c0349h).edit().putString(str, str2).apply();
    }

    public boolean C0() {
        String trim;
        if (((String) this.f4684d) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f4683c;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f4684d = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f4682b).readLine();
            this.f4684d = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.f4684d = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    @Override // p4.B
    public void D(q4.h hVar) {
        ((HashSet) this.f4684d).add(hVar);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [A3.H, A3.E] */
    public void D0(M0.h hVar, Uri uri, Map map, long j, long j8, M m7) {
        boolean z7;
        boolean z8 = true;
        l lVar = new l(hVar, j, j8);
        this.f4684d = lVar;
        if (((o) this.f4683c) != null) {
            return;
        }
        o[] a7 = ((r) this.f4682b).a(uri, map);
        int length = a7.length;
        I i7 = K.f98b;
        AbstractC0021t.e(length, "expectedSize");
        ?? e7 = new E(length);
        if (a7.length == 1) {
            this.f4683c = a7[0];
        } else {
            int length2 = a7.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length2) {
                    break;
                }
                o oVar = a7[i8];
                try {
                } catch (EOFException unused) {
                    if (((o) this.f4683c) == null && lVar.f13974d != j) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                } catch (Throwable th) {
                    if (((o) this.f4683c) == null && lVar.f13974d != j) {
                        z8 = false;
                    }
                    K0.a.j(z8);
                    lVar.f = 0;
                    throw th;
                }
                if (oVar.e(lVar)) {
                    this.f4683c = oVar;
                    lVar.f = 0;
                    break;
                }
                e7.d(oVar.f());
                if (((o) this.f4683c) == null && lVar.f13974d != j) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                K0.a.j(z7);
                lVar.f = 0;
                i8++;
            }
            if (((o) this.f4683c) == null) {
                uri.getClass();
                e0 g3 = e7.g();
                J j9 = new J("None of the available extractors (" + new w(", ", 1).b(AbstractC0021t.w(K.q(a7), new com.it_nomads.fluttersecurestorage.ciphers.d(5))) + ") could read the stream.", null, false, 1);
                K.p(g3);
                throw j9;
            }
        }
        ((o) this.f4683c).g(m7);
    }

    @Override // X0.j
    public ByteBuffer E(int i7) {
        if (x.f2529a >= 21) {
            return ((MediaCodec) this.f4682b).getInputBuffer(i7);
        }
        return ((ByteBuffer[]) this.f4683c)[i7];
    }

    public Object E0(SSLSocket sSLSocket, Object... objArr) {
        Method x02 = x0(sSLSocket.getClass());
        if (x02 != null) {
            try {
                return x02.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException e7) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + x02);
                assertionError.initCause(e7);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + ((String) this.f4683c) + " not supported for object " + sSLSocket);
    }

    @Override // X0.j
    public void F(Surface surface) {
        ((MediaCodec) this.f4682b).setOutputSurface(surface);
    }

    public void F0(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method x02 = x0(sSLSocket.getClass());
            if (x02 != null) {
                try {
                    x02.invoke(sSLSocket, objArr);
                } catch (IllegalAccessException unused) {
                }
            }
        } catch (InvocationTargetException e7) {
            Throwable targetException = e7.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // T5.InterfaceC0348g
    public List G(List list, C0349h c0349h) {
        Set set;
        Map<String, ?> all = k0(c0349h).getAll();
        kotlin.jvm.internal.j.d(all, "preferences.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            kotlin.jvm.internal.j.d(key, "it.key");
            String str = key;
            Object value = entry.getValue();
            if (list != null) {
                set = AbstractC1447h.b0(list);
            } else {
                set = null;
            }
            if (L.b(str, value, set)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC1447h.Y(linkedHashMap.keySet());
    }

    public Object G0(SSLSocket sSLSocket, Object... objArr) {
        try {
            return E0(sSLSocket, objArr);
        } catch (InvocationTargetException e7) {
            Throwable targetException = e7.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // p4.B
    public void H(q4.h hVar) {
        ((HashSet) this.f4684d).remove(hVar);
    }

    public boolean H0(q4.h hVar) {
        C1691v c1691v = (C1691v) this.f4683c;
        if (c1691v.j.f15306b.v(hVar)) {
            return true;
        }
        for (C1690u c1690u : c1691v.f15298g.values()) {
            c1690u.getClass();
            boolean z7 = false;
            e4.d f = c1690u.f15294b.f(new C1673c(hVar, 0));
            if (((Iterator) f.f10875b).hasNext()) {
                z7 = ((C1673c) f.next()).f15244a.equals(hVar);
                continue;
            }
            if (z7) {
                return true;
            }
        }
        C1608t c1608t = (C1608t) this.f4682b;
        if (c1608t != null && c1608t.v(hVar)) {
            return true;
        }
        return false;
    }

    @Override // p4.InterfaceC1672b
    public void I(int i7) {
        ((Q) this.f4682b).Q("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", (String) this.f4684d, Integer.valueOf(i7));
    }

    public String I0() {
        if (C0()) {
            String str = (String) this.f4684d;
            this.f4684d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // T5.InterfaceC0348g
    public void J(String str, List list, C0349h c0349h) {
        k0(c0349h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((C0993a) this.f4684d).h(list))).apply();
    }

    @Override // X0.j
    public ByteBuffer K(int i7) {
        if (x.f2529a >= 21) {
            return ((MediaCodec) this.f4682b).getOutputBuffer(i7);
        }
        return ((ByteBuffer[]) this.f4684d)[i7];
    }

    public void K0(Activity activity, k kVar) {
        kotlin.jvm.internal.j.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f4683c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f4684d;
        try {
            if (kVar.equals((k) weakHashMap.get(activity))) {
                return;
            }
            k kVar2 = (k) weakHashMap.put(activity, kVar);
            reentrantLock.unlock();
            Iterator it = ((o2.j) ((C0927b) this.f4682b).f10587a).f14570b.iterator();
            while (it.hasNext()) {
                o2.i iVar = (o2.i) it.next();
                if (iVar.f14564a.equals(activity)) {
                    iVar.f14566c = kVar;
                    iVar.f14565b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p4.InterfaceC1672b
    public r4.d L(q4.h hVar) {
        String x7 = G.i.x((p) hVar.f15357a.k());
        String f = hVar.f15357a.f();
        P R7 = ((Q) this.f4682b).R("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?");
        R7.a((String) this.f4684d, x7, f);
        Cursor s7 = R7.s();
        try {
            if (s7.moveToFirst()) {
                r4.d l02 = l0(s7.getBlob(0), s7.getInt(1));
                s7.close();
                return l02;
            }
            s7.close();
            return null;
        } catch (Throwable th) {
            if (s7 != null) {
                try {
                    s7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Boolean L0(String str, Boolean bool, U5.e eVar, U5.a aVar) {
        if (((AbstractActivityC0032e) this.f4684d) != null) {
            Bundle o02 = o0(eVar.f5782c);
            if (bool.booleanValue()) {
                Iterator it = eVar.f5782c.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                        lowerCase.getClass();
                        char c8 = 65535;
                        switch (lowerCase.hashCode()) {
                            case -1423461112:
                                if (lowerCase.equals("accept")) {
                                    c8 = 0;
                                    continue;
                                } else {
                                    continue;
                                }
                            case -1229727188:
                                if (lowerCase.equals("content-language")) {
                                    c8 = 1;
                                    continue;
                                } else {
                                    continue;
                                }
                            case 785670158:
                                if (lowerCase.equals("content-type")) {
                                    c8 = 2;
                                    continue;
                                } else {
                                    continue;
                                }
                            case 802785917:
                                if (lowerCase.equals("accept-language")) {
                                    c8 = 3;
                                    continue;
                                } else {
                                    continue;
                                }
                        }
                        switch (c8) {
                        }
                    } else {
                        Uri parse = Uri.parse(str);
                        AbstractActivityC0032e abstractActivityC0032e = (AbstractActivityC0032e) this.f4684d;
                        K5.d dVar = new K5.d(5);
                        ((Intent) dVar.f2699c).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", aVar.f5775a.booleanValue() ? 1 : 0);
                        C1608t e7 = dVar.e();
                        Intent intent = (Intent) e7.f14880b;
                        intent.putExtra("com.android.browser.headers", o02);
                        try {
                            intent.setData(parse);
                            X.d.startActivity(abstractActivityC0032e, intent, (Bundle) e7.f14881c);
                            return Boolean.TRUE;
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                }
            }
            boolean booleanValue = eVar.f5780a.booleanValue();
            boolean booleanValue2 = eVar.f5781b.booleanValue();
            int i7 = WebViewActivity.f12392e;
            try {
                ((AbstractActivityC0032e) this.f4684d).startActivity(new Intent((AbstractActivityC0032e) this.f4684d, WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", booleanValue).putExtra("enableDomStorage", booleanValue2).putExtra("com.android.browser.headers", o02));
                return Boolean.TRUE;
            } catch (ActivityNotFoundException unused2) {
                return Boolean.FALSE;
            }
        }
        throw new U5.b();
    }

    @Override // J1.d
    public List M(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = (List) this.f4682b;
            if (i7 >= list.size()) {
                break;
            }
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f4683c;
            if (jArr[i8] <= j && j < jArr[i8 + 1]) {
                c cVar = (c) list.get(i7);
                J0.b bVar = cVar.f4655a;
                if (bVar.f2327e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new K1.d(3));
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            J0.b bVar2 = ((c) arrayList2.get(i9)).f4655a;
            arrayList.add(new J0.b(bVar2.f2323a, bVar2.f2324b, bVar2.f2325c, bVar2.f2326d, (-1) - i9, 1, bVar2.f2328g, bVar2.f2329h, bVar2.f2330i, bVar2.f2334n, bVar2.f2335o, bVar2.j, bVar2.f2331k, bVar2.f2332l, bVar2.f2333m, bVar2.f2336p, bVar2.f2337q));
        }
        return arrayList;
    }

    public void M0(u4.f fVar, final Map map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int i7 = cursor.getInt(1);
        Executor executor = fVar;
        if (cursor.isLast()) {
            executor = u4.k.f16005b;
        }
        executor.execute(new Runnable() { // from class: p4.D
            @Override // java.lang.Runnable
            public final void run() {
                R1.j jVar = R1.j.this;
                byte[] bArr = blob;
                int i8 = i7;
                Map map2 = map;
                r4.d l02 = jVar.l0(bArr, i8);
                synchronized (map2) {
                    map2.put(l02.f15491b.f15496a, l02);
                }
            }
        });
    }

    @Override // p4.B
    public void N(q4.h hVar) {
        ((HashSet) this.f4684d).add(hVar);
    }

    public void N0(HashMap hashMap, u4.f fVar, p pVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        t tVar = new t((Q) this.f4682b, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList((String) this.f4684d, G.i.x(pVar)), arrayList, ")");
        while (((Iterator) tVar.f).hasNext()) {
            Cursor s7 = tVar.q().s();
            while (s7.moveToNext()) {
                try {
                    M0(fVar, hashMap, s7);
                } catch (Throwable th) {
                    if (s7 != null) {
                        try {
                            s7.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            s7.close();
        }
    }

    @Override // c6.InterfaceC0717x
    public void O(o0 o0Var, EnumC0714w enumC0714w, a6.e0 e0Var) {
        AbstractC1371b.c();
        try {
            C1372c c1372c = ((C0708u) this.f4684d).f8996b;
            AbstractC1371b.a();
            j0(o0Var, e0Var);
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

    public void O0() {
        ((TypedArray) this.f4683c).recycle();
    }

    @Override // T5.InterfaceC0348g
    public ArrayList P(String str, C0349h c0349h) {
        List list;
        SharedPreferences k02 = k0(c0349h);
        ArrayList arrayList = null;
        if (k02.contains(str)) {
            String string = k02.getString(str, StringUtils.EMPTY);
            kotlin.jvm.internal.j.b(string);
            if (m.e0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !m.e0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) L.c(k02.getString(str, StringUtils.EMPTY), (C0993a) this.f4684d)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        r4 = r3.f335b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r4 >= r6.length) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        r6[r4] = r2;
        r3.f335b = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P0(java.util.ArrayList r8) {
        /*
            r7 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L42
            java.lang.Object r2 = r8.get(r1)
            Y1.a r2 = (Y1.AbstractC0400a) r2
            r2.getClass()
            java.lang.Object r3 = r7.f4682b
            B5.S r3 = (B5.S) r3
            r3.getClass()
            java.lang.String r4 = "instance"
            kotlin.jvm.internal.j.e(r2, r4)
            int r4 = r3.f335b
            r5 = 0
        L1f:
            java.lang.Object r6 = r3.f336c
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            if (r5 >= r4) goto L34
            r6 = r6[r5]
            if (r6 == r2) goto L2c
            int r5 = r5 + 1
            goto L1f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r8.<init>(r0)
            throw r8
        L34:
            int r4 = r3.f335b
            int r5 = r6.length
            if (r4 >= r5) goto L3f
            r6[r4] = r2
            int r4 = r4 + 1
            r3.f335b = r4
        L3f:
            int r1 = r1 + 1
            goto L5
        L42:
            r8.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.j.P0(java.util.ArrayList):void");
    }

    @Override // c6.InterfaceC0717x
    public void Q(a6.e0 e0Var) {
        C0708u c0708u = (C0708u) this.f4684d;
        AbstractC1371b.c();
        try {
            C1372c c1372c = c0708u.f8996b;
            AbstractC1371b.a();
            AbstractC1371b.b();
            c0708u.f8997c.execute(new C0697q(this, e0Var));
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

    public C0054d Q0() {
        return new C0054d(this, q4.k.f15361c, false);
    }

    @Override // T5.InterfaceC0348g
    public Long R(String str, C0349h c0349h) {
        long j;
        SharedPreferences k02 = k0(c0349h);
        if (k02.contains(str)) {
            try {
                j = k02.getLong(str, 0L);
            } catch (ClassCastException unused) {
                j = k02.getInt(str, 0);
            }
            return Long.valueOf(j);
        }
        return null;
    }

    public Boolean R0() {
        ArrayList arrayList;
        String str;
        List emptyList = Collections.emptyList();
        PackageManager packageManager = ((Context) this.f4682b).getPackageManager();
        if (emptyList == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = emptyList;
        }
        boolean z7 = false;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str2 = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (emptyList != null) {
                arrayList2.addAll(emptyList);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        if (str != null) {
            z7 = true;
        }
        return Boolean.valueOf(z7);
    }

    @Override // p4.B
    public long S() {
        return -1L;
    }

    public synchronized Task S0() {
        Task d7;
        n0();
        d7 = ((C1533t) this.f4683c).d();
        ((u4.e) this.f4684d).f15988a.f15984a.setCorePoolSize(0);
        return d7;
    }

    @Override // X0.j
    public void T(int i7, long j) {
        ((MediaCodec) this.f4682b).releaseOutputBuffer(i7, j);
    }

    public void T0() {
        Object parcelable;
        Integer num;
        e.l lVar = (e.l) this.f4682b;
        lVar.getClass();
        String key = (String) this.f4683c;
        kotlin.jvm.internal.j.e(key, "key");
        if (!lVar.f10541d.contains(key) && (num = (Integer) lVar.f10539b.remove(key)) != null) {
            lVar.f10538a.remove(num);
        }
        lVar.f10542e.remove(key);
        LinkedHashMap linkedHashMap = lVar.f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder m7 = Y.m("Dropping pending result for request ", key, ": ");
            m7.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", m7.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = lVar.f10543g;
        if (bundle.containsKey(key)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = AbstractC0884b.a(key, bundle);
            } else {
                parcelable = bundle.getParcelable(key);
                if (!C0996a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C0996a) parcelable));
            bundle.remove(key);
        }
        if (lVar.f10540c.get(key) == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override // T5.InterfaceC0348g
    public Double U(String str, C0349h c0349h) {
        SharedPreferences k02 = k0(c0349h);
        if (k02.contains(str)) {
            Object c8 = L.c(k02.getString(str, StringUtils.EMPTY), (C0993a) this.f4684d);
            kotlin.jvm.internal.j.c(c8, "null cannot be cast to non-null type kotlin.Double");
            return (Double) c8;
        }
        return null;
    }

    @Override // X0.j
    public int V() {
        return ((MediaCodec) this.f4682b).dequeueInputBuffer(0L);
    }

    @Override // T5.InterfaceC0348g
    public void W(String str, boolean z7, C0349h c0349h) {
        k0(c0349h).edit().putBoolean(str, z7).apply();
    }

    @Override // c6.InterfaceC0717x
    public void X(C0415A c0415a) {
        C0708u c0708u = (C0708u) this.f4684d;
        AbstractC1371b.c();
        try {
            C1372c c1372c = c0708u.f8996b;
            AbstractC1371b.a();
            AbstractC1371b.b();
            c0708u.f8997c.execute(new C0697q(this, c0415a));
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

    @Override // T5.InterfaceC0348g
    public void Y(String str, double d7, C0349h c0349h) {
        SharedPreferences.Editor edit = k0(c0349h).edit();
        edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d7).apply();
    }

    @Override // T5.InterfaceC0348g
    public String Z(String str, C0349h c0349h) {
        SharedPreferences k02 = k0(c0349h);
        if (k02.contains(str)) {
            return k02.getString(str, StringUtils.EMPTY);
        }
        return null;
    }

    @Override // X0.j
    public void a(Bundle bundle) {
        ((MediaCodec) this.f4682b).setParameters(bundle);
    }

    @Override // T5.InterfaceC0348g
    public Boolean a0(String str, C0349h c0349h) {
        SharedPreferences k02 = k0(c0349h);
        if (k02.contains(str)) {
            return Boolean.valueOf(k02.getBoolean(str, true));
        }
        return null;
    }

    @Override // S1.C
    public void b(q qVar) {
        long d7;
        long j;
        K0.a.k((v) this.f4683c);
        int i7 = x.f2529a;
        v vVar = (v) this.f4683c;
        synchronized (vVar) {
            try {
                long j8 = vVar.f2525c;
                if (j8 != -9223372036854775807L) {
                    d7 = j8 + vVar.f2524b;
                } else {
                    d7 = vVar.d();
                }
                j = d7;
            } finally {
            }
        }
        long e7 = ((v) this.f4683c).e();
        if (j != -9223372036854775807L && e7 != -9223372036854775807L) {
            H0.r rVar = (H0.r) this.f4682b;
            if (e7 != rVar.f1891r) {
                C0137q a7 = rVar.a();
                a7.f1855q = e7;
                H0.r rVar2 = new H0.r(a7);
                this.f4682b = rVar2;
                ((G) this.f4684d).c(rVar2);
            }
            int a8 = qVar.a();
            ((G) this.f4684d).d(a8, qVar);
            ((G) this.f4684d).e(j, 1, a8, 0, null);
        }
    }

    @Override // X0.j
    public /* synthetic */ boolean b0(X0.r rVar) {
        return false;
    }

    @Override // S1.C
    public void c(v vVar, m1.q qVar, H h8) {
        this.f4683c = vVar;
        h8.a();
        h8.d();
        G s7 = qVar.s(h8.f4959c, 5);
        this.f4684d = s7;
        s7.c((H0.r) this.f4682b);
    }

    @Override // I6.d
    public Object c0(I6.e eVar, n6.d dVar) {
        Object c02 = ((I6.d) this.f4682b).c0(new I6.l(eVar, (C1805d) this.f4683c, (T5.K) this.f4684d), dVar);
        if (c02 == EnumC1565a.COROUTINE_SUSPENDED) {
            return c02;
        }
        return l6.j.f13876a;
    }

    @Override // X0.j
    public void d(int i7, N0.b bVar, long j, int i8) {
        ((MediaCodec) this.f4682b).queueSecureInputBuffer(i7, 0, bVar.f3344i, j, i8);
    }

    @Override // X0.j
    public void d0(k1.j jVar, Handler handler) {
        ((MediaCodec) this.f4682b).setOnFrameRenderedListener(new X0.a(this, jVar, 1), handler);
    }

    @Override // X0.j
    public void e(int i7, int i8, long j, int i9) {
        ((MediaCodec) this.f4682b).queueInputBuffer(i7, 0, i8, j, i9);
    }

    @Override // J1.d
    public int e0() {
        return ((long[]) this.f4684d).length;
    }

    @Override // X0.j
    public int f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f4682b;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && x.f2529a < 21) {
                this.f4684d = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public void f0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0927b c0927b = new C0927b(5);
            String D4 = AbstractC0412a.D((u0) it.next(), c0927b);
            j jVar = new j((t0) this.f4683c, D4);
            C1767B c1767b = (C1767B) c0927b.f10587a;
            c1767b.f15576a = new BinderC1771F(jVar);
            ((HashMap) this.f4682b).put(D4, new C0(((C1608t) this.f4684d).r(c1767b)));
        }
    }

    @Override // X0.j
    public void flush() {
        ((MediaCodec) this.f4682b).flush();
    }

    @Override // J1.d
    public int g(long j) {
        long[] jArr = (long[]) this.f4684d;
        int b5 = x.b(jArr, j, false);
        if (b5 >= jArr.length) {
            return -1;
        }
        return b5;
    }

    public String g0(String str, long j, long j8, int i7) {
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f4683c;
            int size = arrayList.size();
            ArrayList arrayList2 = (ArrayList) this.f4682b;
            if (i8 < size) {
                sb.append((String) arrayList2.get(i8));
                if (((Integer) arrayList.get(i8)).intValue() == 1) {
                    sb.append(str);
                } else {
                    int intValue = ((Integer) arrayList.get(i8)).intValue();
                    ArrayList arrayList3 = (ArrayList) this.f4684d;
                    if (intValue == 2) {
                        sb.append(String.format(Locale.US, (String) arrayList3.get(i8), Long.valueOf(j)));
                    } else if (((Integer) arrayList.get(i8)).intValue() == 3) {
                        sb.append(String.format(Locale.US, (String) arrayList3.get(i8), Integer.valueOf(i7)));
                    } else if (((Integer) arrayList.get(i8)).intValue() == 4) {
                        sb.append(String.format(Locale.US, (String) arrayList3.get(i8), Long.valueOf(j8)));
                    }
                }
                i8++;
            } else {
                sb.append((String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
        }
    }

    @Override // p4.InterfaceC1672b
    public HashMap h(p pVar, int i7) {
        HashMap hashMap = new HashMap();
        u4.f fVar = new u4.f();
        P R7 = ((Q) this.f4682b).R("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?");
        R7.a((String) this.f4684d, G.i.x(pVar), Integer.valueOf(i7));
        Cursor s7 = R7.s();
        while (s7.moveToNext()) {
            try {
                M0(fVar, hashMap, s7);
            } catch (Throwable th) {
                if (s7 != null) {
                    try {
                        s7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        s7.close();
        fVar.a();
        return hashMap;
    }

    public Boolean h0(String str) {
        String shortString;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(((Context) ((A.j) this.f4683c).f19b).getPackageManager());
        if (resolveActivity == null) {
            shortString = null;
        } else {
            shortString = resolveActivity.toShortString();
        }
        if (shortString == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString));
    }

    @Override // p4.InterfaceC1672b
    public void i(int i7, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            q4.h hVar = (q4.h) entry.getKey();
            r4.h hVar2 = (r4.h) entry.getValue();
            if (hVar2 != null) {
                p pVar = hVar.f15357a;
                String g3 = pVar.g(pVar.f15351a.size() - 2);
                p pVar2 = hVar.f15357a;
                ((Q) this.f4682b).Q("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", (String) this.f4684d, g3, G.i.x((p) pVar2.k()), pVar2.f(), Integer.valueOf(i7), ((C1608t) ((C0585f) this.f4683c).f8171b).W(hVar2).d());
            } else {
                Locale locale = Locale.US;
                throw new NullPointerException("null value for key: " + hVar);
            }
        }
    }

    public void i0(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f4683c;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f4684d).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p4.B
    public void j(q4.h hVar) {
        if (H0(hVar)) {
            ((HashSet) this.f4684d).remove(hVar);
        } else {
            ((HashSet) this.f4684d).add(hVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j0(o0 o0Var, a6.e0 e0Var) {
        C0708u c0708u = (C0708u) this.f4684d;
        C0490t c0490t = c0708u.f9002i.f7132a;
        c0708u.f.getClass();
        if (c0490t == null) {
            c0490t = null;
        }
        a6.e0 e0Var2 = e0Var;
        e0Var2 = e0Var;
        if (o0Var.f7183a == n0.CANCELLED && c0490t != null) {
            e0Var2 = e0Var;
            if (c0490t.a()) {
                C0692o0 c0692o0 = new C0692o0(0);
                c0708u.j.d(c0692o0);
                o0 o0Var2 = o0.f7175h;
                o0Var = o0Var2.a("ClientCall was cancelled at or after deadline. " + c0692o0);
                e0Var2 = new Object();
            }
        }
        AbstractC1371b.b();
        c0708u.f8997c.execute(new c6.r(this, o0Var, e0Var2));
    }

    @Override // p4.B
    public void k(p4.Y y2) {
        int i7 = y2.f15236b;
        C1692w c1692w = ((C1691v) this.f4683c).j;
        Iterator it = c1692w.f15306b.m0(i7).iterator();
        while (true) {
            e4.d dVar = (e4.d) it;
            if (((Iterator) dVar.f10875b).hasNext()) {
                ((HashSet) this.f4684d).add((q4.h) dVar.next());
            } else {
                c1692w.f15305a.remove(y2.f15235a);
                c1692w.f15306b.o0(y2.f15236b);
                return;
            }
        }
    }

    public SharedPreferences k0(C0349h c0349h) {
        String str = c0349h.f5436a;
        Context context = (Context) this.f4683c;
        if (str == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
            kotlin.jvm.internal.j.d(sharedPreferences, "{\n      PreferenceManage…references(context)\n    }");
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
        kotlin.jvm.internal.j.d(sharedPreferences2, "{\n      context.getShare…ntext.MODE_PRIVATE)\n    }");
        return sharedPreferences2;
    }

    @Override // T5.InterfaceC0348g
    public T5.P l(String str, C0349h c0349h) {
        SharedPreferences k02 = k0(c0349h);
        if (!k02.contains(str)) {
            return null;
        }
        String string = k02.getString(str, StringUtils.EMPTY);
        kotlin.jvm.internal.j.b(string);
        if (m.e0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new T5.P(string, N.JSON_ENCODED);
        }
        if (m.e0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            return new T5.P(null, N.PLATFORM_ENCODED);
        }
        return new T5.P(null, N.UNEXPECTED_STRING);
    }

    public r4.d l0(byte[] bArr, int i7) {
        try {
            return new r4.d(i7, ((C1608t) ((C0585f) this.f4683c).f8171b).A(t1.P(bArr)));
        } catch (X e7) {
            m5.d.g("Overlay failed to parse: %s", e7);
            throw null;
        }
    }

    @Override // T5.InterfaceC0348g
    public void m(String str, long j, C0349h c0349h) {
        k0(c0349h).edit().putLong(str, j).apply();
    }

    public byte[] m0(byte[] bArr) {
        int w02 = w0();
        byte[] bArr2 = new byte[w02];
        ((SecureRandom) this.f4683c).nextBytes(bArr2);
        AlgorithmParameterSpec y02 = y0(bArr2);
        Cipher cipher = (Cipher) this.f4682b;
        cipher.init(1, (Key) this.f4684d, y02);
        byte[] doFinal = cipher.doFinal(bArr);
        byte[] bArr3 = new byte[doFinal.length + w02];
        System.arraycopy(bArr2, 0, bArr3, 0, w02);
        System.arraycopy(doFinal, 0, bArr3, w02, doFinal.length);
        return bArr3;
    }

    @Override // c6.InterfaceC0717x
    public void n() {
        C0708u c0708u = (C0708u) this.f4684d;
        f0 f0Var = (f0) c0708u.f8995a.f4137c;
        f0Var.getClass();
        if (f0Var != f0.UNARY && f0Var != f0.SERVER_STREAMING) {
            AbstractC1371b.c();
            try {
                AbstractC1371b.a();
                AbstractC1371b.b();
                c0708u.f8997c.execute(new C0702s(this));
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
    }

    public synchronized void n0() {
        boolean z7;
        if (((C1533t) this.f4683c) != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            this.f4683c = (C1533t) ((com.google.firebase.firestore.E) this.f4682b).apply((u4.e) this.f4684d);
        }
    }

    @Override // X0.j
    public void o(int i7, boolean z7) {
        ((MediaCodec) this.f4682b).releaseOutputBuffer(i7, z7);
    }

    @Override // T5.InterfaceC0348g
    public void p(String str, String str2, C0349h c0349h) {
        k0(c0349h).edit().putString(str, str2).apply();
    }

    public int p0(int i7, int i8) {
        ArrayList arrayList = (ArrayList) this.f4684d;
        int size = arrayList.size();
        while (i8 < size) {
            ((AbstractC0400a) arrayList.get(i8)).getClass();
            i8++;
        }
        return i7;
    }

    @Override // T5.InterfaceC0348g
    public void q(List list, C0349h c0349h) {
        Set set;
        SharedPreferences k02 = k0(c0349h);
        SharedPreferences.Editor edit = k02.edit();
        kotlin.jvm.internal.j.d(edit, "preferences.edit()");
        Map<String, ?> all = k02.getAll();
        kotlin.jvm.internal.j.d(all, "preferences.all");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            Object obj = all.get(str);
            if (list != null) {
                set = AbstractC1447h.b0(list);
            } else {
                set = null;
            }
            if (L.b(str, obj, set)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    public String q0() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    public Cipher r0() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // X0.j
    public void release() {
        MediaCodec mediaCodec = (MediaCodec) this.f4682b;
        this.f4683c = null;
        this.f4684d = null;
        try {
            int i7 = x.f2529a;
            if (i7 >= 30 && i7 < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    @Override // p4.B
    public void s(C1608t c1608t) {
        this.f4682b = c1608t;
    }

    public ColorStateList s0(int i7) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f4683c;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0 && (colorStateList = X.d.getColorStateList((Context) this.f4682b, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i7);
    }

    @Override // p4.W
    public void start() {
        long j = C1675e.f;
        this.f4682b = ((u4.e) this.f4683c).b(u4.d.INDEX_BACKFILL, j, new RunnableC0626c(this, 12));
    }

    @Override // p4.W
    public void stop() {
        P p7 = (P) this.f4682b;
        if (p7 != null) {
            p7.b();
        }
    }

    @Override // p4.InterfaceC1672b
    public HashMap t(TreeSet treeSet) {
        boolean z7;
        if (treeSet.comparator() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("getOverlays() requires natural order", z7, new Object[0]);
        HashMap hashMap = new HashMap();
        u4.f fVar = new u4.f();
        p pVar = p.f15369b;
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            q4.h hVar = (q4.h) it.next();
            if (!pVar.equals(hVar.d())) {
                N0(hashMap, fVar, pVar, arrayList);
                pVar = hVar.d();
                arrayList.clear();
            }
            arrayList.add(hVar.f15357a.f());
        }
        N0(hashMap, fVar, pVar, arrayList);
        fVar.a();
        return hashMap;
    }

    public long t0() {
        l lVar = (l) this.f4684d;
        if (lVar != null) {
            return lVar.f13974d;
        }
        return -1L;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(U3.h.e(((C0599g) ((AbstractC0467p) this.f4684d)).f8255c));
        String str = ((C0468q) task.getResult()).f7043a;
        com.google.android.gms.common.internal.I.i(str);
        firebaseAuth.getClass();
        com.google.android.gms.common.internal.I.e(str);
        String str2 = (String) this.f4682b;
        com.google.android.gms.common.internal.I.e(str2);
        C0454c c0454c = (C0454c) this.f4683c;
        if (c0454c == null) {
            c0454c = new C0454c(new C0453b());
        }
        String str3 = firebaseAuth.f9710i;
        if (str3 != null) {
            c0454c.f7016Y = str3;
        }
        return firebaseAuth.f9707e.zza(str, str2, c0454c);
    }

    public String toString() {
        switch (this.f4681a) {
            case 9:
                return ((J2.e) this.f4683c).toString() + ", hidden list:" + ((ArrayList) this.f4684d).size();
            default:
                return super.toString();
        }
    }

    @Override // X0.j
    public void u(int i7) {
        ((MediaCodec) this.f4682b).setVideoScalingMode(i7);
    }

    public Drawable u0(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f4683c;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0) {
            return AbstractC1740d.o((Context) this.f4682b, resourceId);
        }
        return typedArray.getDrawable(i7);
    }

    @Override // p4.InterfaceC1672b
    public HashMap v(int i7, int i8, String str) {
        final HashMap hashMap = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final u4.f fVar = new u4.f();
        Q q2 = (Q) this.f4682b;
        P R7 = q2.R("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?");
        R7.a((String) this.f4684d, str, Integer.valueOf(i7), Integer.valueOf(i8));
        R7.e(new u4.g() { // from class: p4.E
            @Override // u4.g
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                R1.j jVar = R1.j.this;
                jVar.getClass();
                iArr[0] = cursor.getInt(1);
                strArr[0] = cursor.getString(2);
                strArr2[0] = cursor.getString(3);
                jVar.M0(fVar, hashMap, cursor);
            }
        });
        if (strArr[0] == null) {
            return hashMap;
        }
        P R8 = q2.R("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = strArr[0];
        R8.a((String) this.f4684d, str, str2, str2, strArr2[0], Integer.valueOf(iArr[0]));
        Cursor s7 = R8.s();
        while (s7.moveToNext()) {
            try {
                M0(fVar, hashMap, s7);
            } catch (Throwable th) {
                if (s7 != null) {
                    try {
                        s7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        s7.close();
        fVar.a();
        return hashMap;
    }

    public Typeface v0(int i7, int i8, G1.g gVar) {
        int resourceId = ((TypedArray) this.f4683c).getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f4684d) == null) {
            this.f4684d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f4684d;
        ThreadLocal threadLocal = Y.j.f6573a;
        Context context = (Context) this.f4682b;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                gVar.b();
                return null;
            }
            int i9 = typedValue.assetCookie;
            S.j jVar = Z.f.f6717b;
            Typeface typeface = (Typeface) jVar.get(Z.f.b(resources, resourceId, charSequence2, i9, i8));
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0053c(22, gVar, typeface));
                return typeface;
            }
            try {
                if (charSequence2.toLowerCase().endsWith(".xml")) {
                    Y.d i10 = Y.b.i(resources.getXml(resourceId), resources);
                    if (i10 == null) {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        gVar.b();
                        return null;
                    }
                    return Z.f.a(context, i10, resources, resourceId, charSequence2, typedValue.assetCookie, i8, gVar);
                }
                int i11 = typedValue.assetCookie;
                Typeface g3 = Z.f.f6716a.g(context, resources, resourceId, charSequence2, i8);
                if (g3 != null) {
                    jVar.put(Z.f.b(resources, resourceId, charSequence2, i11, i8), g3);
                }
                if (g3 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0053c(22, gVar, g3));
                } else {
                    gVar.b();
                }
                return g3;
            } catch (IOException e7) {
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e7);
                gVar.b();
                return null;
            } catch (XmlPullParserException e8) {
                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e8);
                gVar.b();
                return null;
            }
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
    }

    @Override // p4.B
    public void w() {
        C1691v c1691v = (C1691v) this.f4683c;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashSet) this.f4684d).iterator();
        while (it.hasNext()) {
            q4.h hVar = (q4.h) it.next();
            if (!H0(hVar)) {
                arrayList.add(hVar);
            }
        }
        c1691v.f15302l.c(arrayList);
        this.f4684d = null;
    }

    public int w0() {
        return 16;
    }

    @Override // J1.d
    public long x(int i7) {
        boolean z7;
        boolean z8 = false;
        if (i7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        long[] jArr = (long[]) this.f4684d;
        if (i7 < jArr.length) {
            z8 = true;
        }
        K0.a.e(z8);
        return jArr[i7];
    }

    public Method x0(Class cls) {
        Class cls2;
        Method z02 = z0(cls, (String) this.f4683c, (Class[]) this.f4684d);
        if (z02 != null && (cls2 = (Class) this.f4682b) != null && !cls2.isAssignableFrom(z02.getReturnType())) {
            return null;
        }
        return z02;
    }

    @Override // p4.B
    public void y() {
        this.f4684d = new HashSet();
    }

    public AlgorithmParameterSpec y0(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [io.flutter.plugins.googlemaps.o0, java.lang.Object] */
    @Override // s3.InterfaceC1768C
    public z z(int i7, int i8, int i9) {
        E0 e02 = new E0(this, i7, i8, i9);
        int i10 = e02.f12050c;
        z zVar = InterfaceC1768C.f15581d0;
        int i11 = e02.f12048a;
        Long valueOf = Long.valueOf(i11);
        int i12 = e02.f12049b;
        Long valueOf2 = Long.valueOf(i12);
        ?? obj = new Object();
        obj.f12244a = valueOf;
        obj.f12245b = valueOf2;
        ((Handler) this.f4684d).post(new S(15, e02, (Object) obj));
        try {
            ((CountDownLatch) e02.f12051d).await();
            try {
                s0 s0Var = (s0) e02.f12052e;
                if (s0Var == null) {
                    Log.e("TileProviderController", String.format("Did not receive tile data for tile: x = %d, y= %d, zoom = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10)));
                } else {
                    zVar = new z(s0Var.f12274c, s0Var.f12272a.intValue(), s0Var.f12273b.intValue());
                }
            } catch (Exception e7) {
                Log.e("TileProviderController", "Can't parse tile data", e7);
            }
        } catch (InterruptedException e8) {
            Log.e("TileProviderController", String.format("countDownLatch: can't get tile: x = %d, y= %d, zoom = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10)), e8);
        }
        return zVar;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i7) {
        this.f4681a = i7;
        this.f4682b = obj;
        this.f4683c = obj2;
        this.f4684d = obj3;
    }

    public j(AbstractC0467p abstractC0467p, String str, C0454c c0454c) {
        this.f4681a = 10;
        this.f4682b = str;
        this.f4683c = c0454c;
        this.f4684d = abstractC0467p;
    }

    public j(t0 t0Var) {
        this.f4681a = 19;
        this.f4682b = new HashMap();
        this.f4683c = t0Var;
    }

    public j(t0 t0Var, Context context) {
        this.f4681a = 15;
        this.f4683c = new SecureRandom();
        String q0 = q0();
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String string = sharedPreferences.getString(q0, null);
        this.f4682b = r0();
        if (string != null) {
            try {
                this.f4684d = t0Var.X(Base64.decode(string, 0));
                return;
            } catch (Exception e7) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e7);
            }
        }
        byte[] bArr = new byte[16];
        ((SecureRandom) this.f4683c).nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f4684d = secretKeySpec;
        t0Var.getClass();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) t0Var.f7209b;
        Certificate certificate = keyStore.getCertificate(str);
        if (certificate != null) {
            PublicKey publicKey = certificate.getPublicKey();
            if (publicKey != null) {
                Cipher G2 = t0Var.G();
                G2.init(3, publicKey, t0Var.A());
                edit.putString(q0, Base64.encodeToString(G2.wrap(secretKeySpec), 0));
                edit.apply();
                return;
            }
            throw new Exception(io.flutter.plugins.pathprovider.b.h("No key found under alias: ", str));
        }
        throw new Exception(io.flutter.plugins.pathprovider.b.h("No certificate found under alias: ", str));
    }

    public j(t0 t0Var, String str) {
        this.f4681a = 20;
        this.f4684d = new Handler(Looper.getMainLooper());
        this.f4682b = str;
        this.f4683c = t0Var;
    }

    public j(C1691v c1691v) {
        this.f4681a = 28;
        this.f4683c = c1691v;
    }

    public j(ArrayList arrayList) {
        this.f4681a = 0;
        this.f4682b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f4683c = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            c cVar = (c) arrayList.get(i7);
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f4683c;
            jArr[i8] = cVar.f4656b;
            jArr[i8 + 1] = cVar.f4657c;
        }
        long[] jArr2 = (long[]) this.f4683c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f4684d = copyOf;
        Arrays.sort(copyOf);
    }

    public j(Q q2, C0585f c0585f, C1422f c1422f) {
        this.f4681a = 29;
        this.f4682b = q2;
        this.f4683c = c0585f;
        String str = c1422f.f13857a;
        this.f4684d = str == null ? StringUtils.EMPTY : str;
    }

    public j(String str) {
        this.f4681a = 2;
        C0137q c0137q = new C0137q();
        c0137q.f1850l = H0.I.l(str);
        this.f4682b = new H0.r(c0137q);
    }

    public j(C5.i iVar) {
        this.f4681a = 9;
        this.f4682b = iVar;
        this.f4683c = new J2.e(3);
        this.f4684d = new ArrayList();
    }

    public j(Context context) {
        this.f4681a = 5;
        A.j jVar = new A.j(context, 27);
        this.f4682b = context;
        this.f4683c = jVar;
    }

    public j(r rVar) {
        this.f4681a = 16;
        this.f4682b = rVar;
    }

    public j(com.google.firebase.firestore.E e7) {
        this.f4681a = 14;
        this.f4682b = e7;
        this.f4684d = new u4.e();
    }

    public j(Runnable runnable) {
        this.f4681a = 18;
        this.f4683c = new CopyOnWriteArrayList();
        this.f4684d = new HashMap();
        this.f4682b = runnable;
    }

    public j(Context context, TypedArray typedArray) {
        this.f4681a = 26;
        this.f4682b = context;
        this.f4683c = typedArray;
    }

    public j(C1675e c1675e, u4.e eVar) {
        this.f4681a = 27;
        this.f4684d = c1675e;
        this.f4683c = eVar;
    }

    public j(Z z7) {
        this.f4681a = 8;
        this.f4682b = new B5.S(30);
        this.f4683c = new ArrayList();
        this.f4684d = new ArrayList();
    }

    public j(n4.P p7) {
        this.f4681a = 24;
        this.f4682b = p7;
        this.f4683c = new HashSet();
        this.f4684d = new ArrayList();
    }

    public j(MediaCodec mediaCodec) {
        this.f4681a = 7;
        this.f4682b = mediaCodec;
        if (x.f2529a < 21) {
            this.f4683c = mediaCodec.getInputBuffers();
            this.f4684d = mediaCodec.getOutputBuffers();
        }
    }

    public j(Context context, u4.e eVar, K5.d dVar, C1422f c1422f, C1421e c1421e, C1419c c1419c, t4.j jVar) {
        this.f4681a = 23;
        this.f4682b = context;
        this.f4683c = eVar;
        this.f4684d = dVar;
    }

    public j(L5.f messenger, Context context, C0993a c0993a) {
        this.f4681a = 3;
        kotlin.jvm.internal.j.e(messenger, "messenger");
        kotlin.jvm.internal.j.e(context, "context");
        this.f4682b = messenger;
        this.f4683c = context;
        this.f4684d = c0993a;
        try {
            InterfaceC0348g.f5435n.getClass();
            C0347f.b(messenger, this, "shared_preferences");
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e7);
        }
    }

    public j(C0927b c0927b) {
        this.f4681a = 25;
        this.f4682b = c0927b;
        this.f4683c = new ReentrantLock();
        this.f4684d = new WeakHashMap();
    }

    public j(C0708u c0708u, AbstractC0471A abstractC0471A) {
        this.f4681a = 11;
        this.f4684d = c0708u;
        this.f4682b = abstractC0471A;
    }

    public j(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f4681a = 6;
        this.f4683c = arrayDeque;
        this.f4682b = bufferedReader;
    }
}
