package A4;

import A3.AbstractC0021t;
import A3.C0025x;
import A3.a0;
import A3.b0;
import D.AbstractC0059i;
import D.C0060j;
import J1.l;
import J2.g;
import K0.q;
import K0.x;
import K5.r;
import K5.s;
import L5.f;
import L5.m;
import L5.p;
import L5.y;
import Q.e;
import S3.i;
import S3.k;
import T4.h;
import a1.C0437n;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.accessibility.AccessibilityEvent;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.x0;
import androidx.camera.core.impl.y0;
import io.flutter.plugins.googlemaps.C1177j;
import io.flutter.plugins.googlemaps.C1186t;
import io.flutter.view.o;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
import s.InterfaceC1749a;
import s3.C1786n;
/* loaded from: classes.dex */
public final class c implements H.c, f, F2.b, H.a, g, L5.b, p, x0, l, i, q3.d, W0.c {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f216c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f217a;

    /* renamed from: b  reason: collision with root package name */
    public Object f218b;

    public /* synthetic */ c(int i7, boolean z7) {
        this.f217a = i7;
    }

    public static int r(int i7, int i8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i9++;
            if (i9 == i8) {
                i10++;
                i9 = 0;
            } else if (i9 > i8) {
                i10++;
                i9 = 1;
            }
        }
        if (i9 + 1 > i8) {
            return i10 + 1;
        }
        return i10;
    }

    @Override // S3.i
    public Object B(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 3; i7++) {
            Provider provider = Security.getProvider(strArr[i7]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((k) this.f218b).g(str, (Provider) it.next());
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // D.E
    public V M() {
        return (W) this.f218b;
    }

    @Override // J1.l
    public /* synthetic */ void a() {
    }

    @Override // androidx.camera.core.impl.x0
    public y0 a0() {
        return new e(Z.a((W) this.f218b));
    }

    @Override // H.a, J2.g
    public E3.b apply(Object obj) {
        return H.i.c(((InterfaceC1749a) this.f218b).apply(obj));
    }

    public void b(String str, String str2) {
        String b5 = C0437n.b(str.trim());
        String trim = str2.trim();
        A.c cVar = (A.c) this.f218b;
        cVar.getClass();
        AbstractC0021t.d(b5, trim);
        C0025x c0025x = (C0025x) cVar.f4b;
        Collection collection = (Collection) c0025x.get(b5);
        if (collection == null) {
            collection = new ArrayList();
            c0025x.put(b5, collection);
        }
        collection.add(trim);
    }

    public void c(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            int i8 = x.f2529a;
            String[] split = ((String) list.get(i7)).split(":\\s?", 2);
            if (split.length == 2) {
                b(split[0], split[1]);
            }
        }
    }

    public void d(int i7, boolean z7) {
        A.l lVar = (A.l) this.f218b;
        if (z7) {
            lVar.a(i7);
        } else {
            lVar.getClass();
        }
    }

    @Override // q3.d
    public boolean e(C1786n c1786n) {
        h hVar = (h) this.f218b;
        C1177j c1177j = hVar.f5381q;
        if (c1177j != null) {
            if (c1177j.f12204n0.b(((C1186t) hVar.j.f3247b.get(c1786n)).f12277c)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        switch (this.f217a) {
            case 7:
                return ((C0060j) this.f218b).equals(obj);
            default:
                return super.equals(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, L5.m] */
    @Override // L5.f
    public com.google.firebase.firestore.Z f() {
        return ((D5.i) this.f218b).b(new Object());
    }

    @Override // J1.l
    public /* synthetic */ J1.d g(byte[] bArr, int i7, int i8) {
        return AbstractC0059i.o(this, bArr, i8);
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        return new E2.e((Context) ((F2.c) this.f218b).f1160a, new e5.b(7), new com.google.firebase.firestore.Z(7));
    }

    @Override // L5.f
    public void h(String str, ByteBuffer byteBuffer, L5.e eVar) {
        ((D5.i) this.f218b).h(str, byteBuffer, eVar);
    }

    public int hashCode() {
        switch (this.f217a) {
            case 7:
                return ((C0060j) this.f218b).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // L5.f
    public void i(String str, L5.d dVar, com.google.firebase.firestore.Z z7) {
        ((D5.i) this.f218b).i(str, dVar, z7);
    }

    @Override // L5.b
    public void j(Object obj, A.f fVar) {
        V2.k kVar = (V2.k) this.f218b;
        if (((io.flutter.view.a) kVar.f5967d) == null) {
            fVar.h(null);
            return;
        }
        HashMap hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        HashMap hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1140076541:
                if (str.equals("tooltip")) {
                    c8 = 0;
                    break;
                }
                break;
            case -649620375:
                if (str.equals("announce")) {
                    c8 = 1;
                    break;
                }
                break;
            case 114595:
                if (str.equals("tap")) {
                    c8 = 2;
                    break;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c8 = 3;
                    break;
                }
                break;
            case 114203431:
                if (str.equals("longPress")) {
                    c8 = 4;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.a aVar = (io.flutter.view.a) kVar.f5967d;
                    if (Build.VERSION.SDK_INT >= 28) {
                        aVar.getClass();
                        break;
                    } else {
                        o oVar = (o) aVar.f12430a;
                        AccessibilityEvent d7 = oVar.d(0, 32);
                        d7.getText().add(str2);
                        oVar.h(d7);
                        break;
                    }
                }
                break;
            case 1:
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    ((o) ((io.flutter.view.a) kVar.f5967d).f12430a).f12497a.announceForAccessibility(str3);
                    break;
                }
                break;
            case 2:
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    ((o) ((io.flutter.view.a) kVar.f5967d).f12430a).g(num.intValue(), 1);
                    break;
                }
                break;
            case 3:
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    ((o) ((io.flutter.view.a) kVar.f5967d).f12430a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case 4:
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    ((o) ((io.flutter.view.a) kVar.f5967d).f12430a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        fVar.h(null);
    }

    @Override // L5.f
    public void k(String str, ByteBuffer byteBuffer) {
        ((D5.i) this.f218b).h(str, byteBuffer, null);
    }

    @Override // J1.l
    public void l(byte[] bArr, int i7, int i8, J1.k kVar, K0.c cVar) {
        boolean z7;
        J0.b a7;
        boolean z8;
        q qVar = (q) this.f218b;
        qVar.E(bArr, i7 + i8);
        qVar.G(i7);
        ArrayList arrayList = new ArrayList();
        while (qVar.a() > 0) {
            if (qVar.a() >= 8) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.d("Incomplete Mp4Webvtt Top Level box header found.", z7);
            int h8 = qVar.h();
            if (qVar.h() == 1987343459) {
                int i9 = h8 - 8;
                CharSequence charSequence = null;
                J0.a aVar = null;
                while (i9 > 0) {
                    if (i9 >= 8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    K0.a.d("Incomplete vtt cue box header found.", z8);
                    int h9 = qVar.h();
                    int h10 = qVar.h();
                    int i10 = h9 - 8;
                    byte[] bArr2 = qVar.f2513a;
                    int i11 = qVar.f2514b;
                    int i12 = x.f2529a;
                    String str = new String(bArr2, i11, i10, z3.h.f16886c);
                    qVar.H(i10);
                    i9 = (i9 - 8) - i10;
                    if (h10 == 1937011815) {
                        R1.g gVar = new R1.g();
                        R1.h.e(str, gVar);
                        aVar = gVar.a();
                    } else if (h10 == 1885436268) {
                        charSequence = R1.h.f(null, Collections.emptyList(), str.trim());
                    }
                }
                if (charSequence == null) {
                    charSequence = StringUtils.EMPTY;
                }
                if (aVar != null) {
                    aVar.f2289a = charSequence;
                    a7 = aVar.a();
                } else {
                    Pattern pattern = R1.h.f4676a;
                    R1.g gVar2 = new R1.g();
                    gVar2.f4669c = charSequence;
                    a7 = gVar2.a().a();
                }
                arrayList.add(a7);
            } else {
                qVar.H(h8 - 8);
            }
        }
        cVar.accept(new J1.a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // J1.l
    public int m() {
        return 2;
    }

    @Override // L5.f
    public void n(String str, L5.d dVar) {
        ((D5.i) this.f218b).i(str, dVar, null);
    }

    public b0 o() {
        Map f = ((AbstractC0021t) this.f218b).f();
        a0 a0Var = new a0();
        b0 b0Var = new b0(f);
        b0Var.f = a0Var;
        return b0Var;
    }

    @Override // L5.p
    public void onMethodCall(L5.o oVar, L5.q qVar) {
        String str = oVar.f3038a;
        str.getClass();
        s sVar = (s) this.f218b;
        if (!str.equals("get")) {
            if (!str.equals("put")) {
                ((r) qVar).c();
                return;
            }
            sVar.f2738d = (byte[]) oVar.f3039b;
            ((r) qVar).a(null);
            return;
        }
        sVar.f2737c = true;
        if (!sVar.f2736b && sVar.f2735a) {
            sVar.f = (r) qVar;
            return;
        }
        ((r) qVar).a(s.c((byte[]) sVar.f2738d));
    }

    @Override // H.c
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Void r12 = (Void) obj;
    }

    public C0437n p() {
        return new C0437n(this);
    }

    public Set q() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f218b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f218b);
        }
        return unmodifiableSet;
    }

    public String s(String str, String str2) {
        M5.a aVar = (M5.a) this.f218b;
        Context context = aVar.f3269b;
        if (str2 != null) {
            Locale a7 = M5.a.a(str2);
            Configuration configuration = new Configuration(aVar.f3269b.getResources().getConfiguration());
            configuration.setLocale(a7);
            context = aVar.f3269b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", aVar.f3269b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        if (r2 >= 26) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
        if (r2 >= 34) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int t(H0.r r7) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            java.lang.String r2 = r7.f1886m
            r3 = 0
            if (r2 == 0) goto L84
            boolean r2 = H0.I.i(r2)
            if (r2 != 0) goto Lf
            goto L84
        Lf:
            int r2 = K0.x.f2529a
            java.lang.String r7 = r7.f1886m
            r7.getClass()
            int r2 = K0.x.f2529a
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1487656890: goto L63;
                case -1487464693: goto L58;
                case -1487464690: goto L4d;
                case -1487394660: goto L42;
                case -1487018032: goto L37;
                case -879272239: goto L2c;
                case -879258763: goto L21;
                default: goto L20;
            }
        L20:
            goto L6d
        L21:
            java.lang.String r5 = "image/png"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L2a
            goto L6d
        L2a:
            r4 = 6
            goto L6d
        L2c:
            java.lang.String r5 = "image/bmp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L35
            goto L6d
        L35:
            r4 = 5
            goto L6d
        L37:
            java.lang.String r5 = "image/webp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L40
            goto L6d
        L40:
            r4 = r0
            goto L6d
        L42:
            java.lang.String r5 = "image/jpeg"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L4b
            goto L6d
        L4b:
            r4 = 3
            goto L6d
        L4d:
            java.lang.String r5 = "image/heif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L56
            goto L6d
        L56:
            r4 = 2
            goto L6d
        L58:
            java.lang.String r5 = "image/heic"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L61
            goto L6d
        L61:
            r4 = r1
            goto L6d
        L63:
            java.lang.String r5 = "image/avif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L6c
            goto L6d
        L6c:
            r4 = r3
        L6d:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L7a;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                default: goto L70;
            }
        L70:
            goto L7f
        L71:
            r7 = 26
            if (r2 < r7) goto L7f
            goto L7a
        L76:
            r7 = 34
            if (r2 < r7) goto L7f
        L7a:
            int r7 = D.AbstractC0059i.s(r0, r3, r3, r3)
            goto L83
        L7f:
            int r7 = D.AbstractC0059i.s(r1, r3, r3, r3)
        L83:
            return r7
        L84:
            int r7 = D.AbstractC0059i.s(r3, r3, r3, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.c.t(H0.r):int");
    }

    public String toString() {
        switch (this.f217a) {
            case 7:
                return ((C0060j) this.f218b).toString();
            default:
                return super.toString();
        }
    }

    @Override // H.c
    public void z(Throwable th) {
        ((D.b0) this.f218b).close();
    }

    public /* synthetic */ c(Object obj, int i7) {
        this.f217a = i7;
        this.f218b = obj;
    }

    @Override // J2.g
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        A2.b bVar = J2.i.f2409e;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Long valueOf = Long.valueOf(j);
            HashMap hashMap = (HashMap) this.f218b;
            Set set = (Set) hashMap.get(valueOf);
            if (set == null) {
                set = new HashSet();
                hashMap.put(Long.valueOf(j), set);
            }
            set.add(new J2.h(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [L5.p, java.lang.Object] */
    public c(D5.b bVar, int i7) {
        this.f217a = i7;
        switch (i7) {
            case 17:
                new L5.r(bVar, "flutter/spellcheck", y.f3047b, null).b(new A.c(this, 12));
                return;
            default:
                ?? obj = new Object();
                L5.r rVar = new L5.r(bVar, "flutter/navigation", m.f3037a, null);
                this.f218b = rVar;
                rVar.b(obj);
                return;
        }
    }

    public c(int i7) {
        this.f217a = i7;
        switch (i7) {
            case 11:
                this.f218b = new A.l();
                return;
            case 21:
                this.f218b = new q();
                return;
            case 24:
                this.f218b = new LinkedHashMap(5, 1.0f, false);
                return;
            case 25:
                this.f218b = new P0.b(27);
                return;
            case 27:
                this.f218b = new SparseIntArray();
                return;
            case 29:
                this.f218b = new A.c(1);
                return;
            default:
                this.f218b = new HashSet();
                return;
        }
    }

    public c(A.m mVar, int i7) {
        this.f217a = i7;
        switch (i7) {
            case 2:
                this.f218b = (CaptureSessionOnClosedNotCalledQuirk) mVar.a0(CaptureSessionOnClosedNotCalledQuirk.class);
                return;
            default:
                AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) mVar.a0(AeFpsRangeLegacyQuirk.class);
                if (aeFpsRangeLegacyQuirk == null) {
                    this.f218b = null;
                    return;
                } else {
                    this.f218b = aeFpsRangeLegacyQuirk.f7491a;
                    return;
                }
        }
    }

    public c(f fVar) {
        this.f217a = 14;
        new L5.r(fVar, "flutter/keyboard", y.f3047b, null).b(new A.f(this));
    }

    public c(W w2) {
        Object obj;
        this.f217a = 19;
        this.f218b = w2;
        Object obj2 = null;
        try {
            obj = w2.G(I.l.j);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls != null && !cls.equals(Q.d.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        ((W) this.f218b).j(y0.f7691Q, A0.STREAM_SHARING);
        C0501c c0501c = I.l.j;
        W w7 = (W) this.f218b;
        w7.j(c0501c, Q.d.class);
        try {
            obj2 = w7.G(I.l.f2121i);
        } catch (IllegalArgumentException unused2) {
        }
        if (obj2 == null) {
            w7.j(I.l.f2121i, Q.d.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public c(Size size, Rect rect, int i7) {
        this.f217a = 7;
        this.f218b = new C0060j(size, rect, i7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, int i7) {
        this(29);
        this.f217a = 29;
        b("User-Agent", str);
        b("CSeq", String.valueOf(i7));
        if (str2 != null) {
            b("Session", str2);
        }
    }
}
