package r3;

import D.AbstractC0055e;
import D.AbstractC0059i;
import F3.o;
import H0.J;
import H4.W;
import H4.e1;
import H4.p1;
import K0.q;
import L5.n;
import M0.x;
import W2.i;
import X5.C0377c;
import X5.C0380f;
import X5.C0392s;
import a6.u0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.camera.core.impl.AbstractC0508j;
import androidx.camera.core.impl.AbstractC0509k;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.auth.FirebaseAuth;
import d4.j;
import io.flutter.plugins.firebase.auth.r;
import j$.util.DesugarCollections;
import j3.C1367d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m1.l;
import n4.AbstractC1530p;
import n4.C1519e;
import n4.C1529o;
import n4.EnumC1518d;
import n4.EnumC1528n;
import n4.u;
import o6.C1566b;
import o6.C1567c;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.XMLReaderUtils;
import p.C1602p0;
import p6.AbstractC1698a;
import p6.AbstractC1700c;
import w.C1899I;
import w.C1940y;
import w6.p;
/* renamed from: r3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1740d {

    /* renamed from: a  reason: collision with root package name */
    public static Class f15481a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f15482b;

    /* renamed from: c  reason: collision with root package name */
    public static u0 f15483c;

    /* renamed from: d  reason: collision with root package name */
    public static u0 f15484d;

    /* renamed from: e  reason: collision with root package name */
    public static u0 f15485e;
    public static j f;

    /* renamed from: g  reason: collision with root package name */
    public static Executor f15486g;

    /* renamed from: h  reason: collision with root package name */
    public static Context f15487h;

    /* renamed from: i  reason: collision with root package name */
    public static C1741e f15488i;

    public static String A(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c8 = charArray[i7];
                    if (c8 >= 'A' && c8 <= 'Z') {
                        charArray[i7] = (char) (c8 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String B(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c8 = charArray[i7];
                    if (c8 >= 'a' && c8 <= 'z') {
                        charArray[i7] = (char) (c8 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static ArrayList C(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof r) {
            r rVar = (r) th;
            arrayList.add(rVar.f11890a);
            arrayList.add(rVar.getMessage());
            arrayList.add(rVar.f11891b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static Parcelable D(String str, Bundle bundle) {
        ClassLoader classLoader = AbstractC1740d.class.getClassLoader();
        I.i(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static C1741e E(Context context, q3.g gVar) {
        I.i(context);
        Log.d("d", "preferredRenderer: ".concat(String.valueOf(gVar)));
        C1741e c1741e = f15488i;
        if (c1741e == null) {
            AtomicBoolean atomicBoolean = i.f6175a;
            int b5 = i.b(context, 13400000);
            if (b5 == 0) {
                C1741e I7 = I(context, gVar);
                f15488i = I7;
                try {
                    Parcel zzJ = I7.zzJ(9, I7.zza());
                    int readInt = zzJ.readInt();
                    zzJ.recycle();
                    if (readInt == 2) {
                        try {
                            C1741e c1741e2 = f15488i;
                            i3.b bVar = new i3.b(G(context, gVar));
                            Parcel zza = c1741e2.zza();
                            zzc.zze(zza, bVar);
                            c1741e2.zzc(11, zza);
                        } catch (RemoteException e7) {
                            throw new RuntimeException(e7);
                        } catch (UnsatisfiedLinkError unused) {
                            Log.w("d", "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                            f15487h = null;
                            f15488i = I(context, q3.g.LEGACY);
                        }
                    }
                    try {
                        C1741e c1741e3 = f15488i;
                        Context G2 = G(context, gVar);
                        G2.getClass();
                        i3.b bVar2 = new i3.b(G2.getResources());
                        Parcel zza2 = c1741e3.zza();
                        zzc.zze(zza2, bVar2);
                        zza2.writeInt(18020000);
                        c1741e3.zzc(6, zza2);
                        return f15488i;
                    } catch (RemoteException e8) {
                        throw new RuntimeException(e8);
                    }
                } catch (RemoteException e9) {
                    throw new RuntimeException(e9);
                }
            }
            throw new W2.g(b5);
        }
        return c1741e;
    }

    public static void F(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable D4 = D("MapOptions", bundle);
            if (D4 != null) {
                H(bundle2, "MapOptions", D4);
            }
            Parcelable D7 = D("StreetViewPanoramaOptions", bundle);
            if (D7 != null) {
                H(bundle2, "StreetViewPanoramaOptions", D7);
            }
            Parcelable D8 = D("camera", bundle);
            if (D8 != null) {
                H(bundle2, "camera", D8);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static Context G(Context context, q3.g gVar) {
        String str;
        Context context2;
        Context context3 = f15487h;
        if (context3 == null) {
            if (gVar == q3.g.LEGACY) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else {
                str = "com.google.android.gms.maps_core_dynamite";
            }
            try {
                context2 = C1367d.c(context, C1367d.f13426b, str).f13437a;
            } catch (Exception e7) {
                try {
                    if (!str.equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("d", "Attempting to load maps_dynamite again.");
                            context2 = C1367d.c(context, C1367d.f13426b, "com.google.android.gms.maps_dynamite").f13437a;
                        } catch (Exception e8) {
                            Log.e("d", "Failed to load maps module, use pre-Chimera", e8);
                            AtomicBoolean atomicBoolean = i.f6175a;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("d", "Failed to load maps module, use pre-Chimera", e7);
                        AtomicBoolean atomicBoolean2 = i.f6175a;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f15487h = context2;
            return context2;
        }
        return context3;
    }

    public static void H(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = AbstractC1740d.class.getClassLoader();
        I.i(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [r3.e, com.google.android.gms.internal.maps.zza] */
    public static C1741e I(Context context, q3.g gVar) {
        Class cls;
        Class cls2;
        Log.i("d", "Making Creator dynamically");
        ClassLoader classLoader = G(context, gVar).getClassLoader();
        try {
            I.i(classLoader);
            try {
                try {
                    IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    if (queryLocalInterface instanceof C1741e) {
                        return (C1741e) queryLocalInterface;
                    }
                    return new zza(iBinder, "com.google.android.gms.maps.internal.ICreator");
                } catch (InstantiationException e7) {
                    throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls2.getName()), e7);
                }
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e9);
        }
    }

    public static AbstractC1530p a(AbstractC1530p abstractC1530p) {
        EnumC1518d enumC1518d;
        e(abstractC1530p);
        if (abstractC1530p instanceof C1529o) {
            return abstractC1530p;
        }
        C1519e c1519e = (C1519e) abstractC1530p;
        List<AbstractC1530p> unmodifiableList = DesugarCollections.unmodifiableList(c1519e.f14335a);
        if (unmodifiableList.size() == 1) {
            return a((AbstractC1530p) unmodifiableList.get(0));
        }
        Iterator it = c1519e.f14335a.iterator();
        while (it.hasNext()) {
            if (((AbstractC1530p) it.next()) instanceof C1519e) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC1530p abstractC1530p2 : unmodifiableList) {
                    arrayList.add(a(abstractC1530p2));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    enumC1518d = c1519e.f14336b;
                    if (!hasNext) {
                        break;
                    }
                    AbstractC1530p abstractC1530p3 = (AbstractC1530p) it2.next();
                    if (abstractC1530p3 instanceof C1529o) {
                        arrayList2.add(abstractC1530p3);
                    } else if (abstractC1530p3 instanceof C1519e) {
                        C1519e c1519e2 = (C1519e) abstractC1530p3;
                        if (c1519e2.f14336b.equals(enumC1518d)) {
                            arrayList2.addAll(DesugarCollections.unmodifiableList(c1519e2.f14335a));
                        } else {
                            arrayList2.add(c1519e2);
                        }
                    }
                }
                if (arrayList2.size() == 1) {
                    return (AbstractC1530p) arrayList2.get(0);
                }
                return new C1519e(arrayList2, enumC1518d);
            }
        }
        return c1519e;
    }

    public static C1519e b(C1529o c1529o, C1519e c1519e) {
        boolean e7 = c1519e.e();
        ArrayList arrayList = c1519e.f14335a;
        if (e7) {
            List singletonList = Collections.singletonList(c1529o);
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(singletonList);
            return new C1519e(arrayList2, c1519e.f14336b);
        }
        ArrayList arrayList3 = new ArrayList();
        for (AbstractC1530p abstractC1530p : DesugarCollections.unmodifiableList(arrayList)) {
            arrayList3.add(c(c1529o, abstractC1530p));
        }
        return new C1519e(arrayList3, EnumC1518d.OR);
    }

    public static AbstractC1530p c(AbstractC1530p abstractC1530p, AbstractC1530p abstractC1530p2) {
        C1519e c1519e;
        C1519e c1519e2;
        C1519e c1519e3;
        boolean z7 = true;
        e(abstractC1530p);
        e(abstractC1530p2);
        boolean z8 = abstractC1530p instanceof C1529o;
        if (z8 && (abstractC1530p2 instanceof C1529o)) {
            c1519e3 = new C1519e(Arrays.asList((C1529o) abstractC1530p, (C1529o) abstractC1530p2), EnumC1518d.AND);
        } else if (z8 && (abstractC1530p2 instanceof C1519e)) {
            c1519e3 = b((C1529o) abstractC1530p, (C1519e) abstractC1530p2);
        } else if ((abstractC1530p instanceof C1519e) && (abstractC1530p2 instanceof C1529o)) {
            c1519e3 = b((C1529o) abstractC1530p2, (C1519e) abstractC1530p);
        } else {
            C1519e c1519e4 = (C1519e) abstractC1530p;
            C1519e c1519e5 = (C1519e) abstractC1530p2;
            m5.d.i("Found an empty composite filter", (DesugarCollections.unmodifiableList(c1519e4.f14335a).isEmpty() || DesugarCollections.unmodifiableList(c1519e5.f14335a).isEmpty()) ? false : false, new Object[0]);
            boolean e7 = c1519e4.e();
            EnumC1518d enumC1518d = c1519e4.f14336b;
            if (e7 && c1519e5.e()) {
                List unmodifiableList = DesugarCollections.unmodifiableList(c1519e5.f14335a);
                ArrayList arrayList = new ArrayList(c1519e4.f14335a);
                arrayList.addAll(unmodifiableList);
                c1519e2 = new C1519e(arrayList, enumC1518d);
            } else {
                EnumC1518d enumC1518d2 = EnumC1518d.OR;
                if (enumC1518d == enumC1518d2) {
                    c1519e = c1519e4;
                } else {
                    c1519e = c1519e5;
                }
                if (enumC1518d == enumC1518d2) {
                    c1519e4 = c1519e5;
                }
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC1530p abstractC1530p3 : DesugarCollections.unmodifiableList(c1519e.f14335a)) {
                    arrayList2.add(c(abstractC1530p3, c1519e4));
                }
                c1519e2 = new C1519e(arrayList2, EnumC1518d.OR);
            }
            c1519e3 = c1519e2;
        }
        return a(c1519e3);
    }

    public static List d(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new D3.b(0, iArr.length, iArr);
    }

    public static void e(AbstractC1530p abstractC1530p) {
        boolean z7;
        if (!(abstractC1530p instanceof C1529o) && !(abstractC1530p instanceof C1519e)) {
            z7 = false;
        } else {
            z7 = true;
        }
        m5.d.i("Only field filters and composite filters are accepted.", z7, new Object[0]);
    }

    public static boolean f(l lVar) {
        q qVar = new q(8);
        int i7 = T1.e.b(lVar, qVar).f5318a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        lVar.q(qVar.f2513a, 0, 4, false);
        qVar.G(0);
        int h8 = qVar.h();
        if (h8 != 1463899717) {
            K0.a.n("WavHeaderReader", "Unsupported form type: " + h8);
            return false;
        }
        return true;
    }

    public static int g(long j) {
        boolean z7;
        int i7 = (int) j;
        if (i7 == j) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.h(z7, "Out of range: %s", j);
        return i7;
    }

    public static AbstractC1530p h(AbstractC1530p abstractC1530p) {
        boolean z7;
        e(abstractC1530p);
        if (abstractC1530p instanceof C1529o) {
            return abstractC1530p;
        }
        C1519e c1519e = (C1519e) abstractC1530p;
        if (DesugarCollections.unmodifiableList(c1519e.f14335a).size() == 1) {
            return h((AbstractC1530p) abstractC1530p.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC1530p abstractC1530p2 : DesugarCollections.unmodifiableList(c1519e.f14335a)) {
            arrayList.add(h(abstractC1530p2));
        }
        AbstractC1530p a7 = a(new C1519e(arrayList, c1519e.f14336b));
        if (r(a7)) {
            return a7;
        }
        m5.d.i("field filters are already in DNF form.", a7 instanceof C1519e, new Object[0]);
        C1519e c1519e2 = (C1519e) a7;
        m5.d.i("Disjunction of filters all of which are already in DNF form is itself in DNF form.", c1519e2.e(), new Object[0]);
        ArrayList arrayList2 = c1519e2.f14335a;
        if (DesugarCollections.unmodifiableList(arrayList2).size() > 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Single-filter composite filters are already in DNF form.", z7, new Object[0]);
        AbstractC1530p abstractC1530p3 = (AbstractC1530p) DesugarCollections.unmodifiableList(arrayList2).get(0);
        for (int i7 = 1; i7 < DesugarCollections.unmodifiableList(arrayList2).size(); i7++) {
            abstractC1530p3 = c(abstractC1530p3, (AbstractC1530p) DesugarCollections.unmodifiableList(arrayList2).get(i7));
        }
        return abstractC1530p3;
    }

    public static AbstractC1530p i(AbstractC1530p abstractC1530p) {
        e(abstractC1530p);
        ArrayList arrayList = new ArrayList();
        if (abstractC1530p instanceof C1529o) {
            if (abstractC1530p instanceof u) {
                u uVar = (u) abstractC1530p;
                for (p1 p1Var : uVar.f14350b.G().a()) {
                    EnumC1528n enumC1528n = EnumC1528n.EQUAL;
                    arrayList.add(C1529o.e(uVar.f14351c, enumC1528n, p1Var));
                }
                return new C1519e(arrayList, EnumC1518d.OR);
            }
            return abstractC1530p;
        }
        C1519e c1519e = (C1519e) abstractC1530p;
        for (AbstractC1530p abstractC1530p2 : DesugarCollections.unmodifiableList(c1519e.f14335a)) {
            arrayList.add(i(abstractC1530p2));
        }
        return new C1519e(arrayList, c1519e.f14336b);
    }

    public static int j(int i7) {
        if (i7 != 0) {
            if (i7 != 90) {
                if (i7 != 180) {
                    if (i7 == 270) {
                        return 3;
                    }
                    throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Invalid rotation: "));
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static n6.d k(n6.d dVar, n6.d dVar2, p pVar) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof AbstractC1698a) {
            return ((AbstractC1698a) pVar).create(dVar, dVar2);
        }
        n6.i context = dVar2.getContext();
        if (context == n6.j.f14394a) {
            return new C1566b(dVar2, dVar, pVar);
        }
        return new C1567c(dVar2, context, pVar, dVar);
    }

    public static byte[] l(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i7 = 0; i7 < 16; i7++) {
                byte b5 = (byte) ((bArr[i7] << 1) & 254);
                bArr2[i7] = b5;
                if (i7 < 15) {
                    bArr2[i7] = (byte) (((byte) ((bArr[i7 + 1] >> 7) & 1)) | b5);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static boolean m(String str, String str2) {
        char charAt;
        char charAt2;
        char c8;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            if (str.charAt(i7) != str2.charAt(i7) && ((c8 = (char) ((charAt | ' ') - 97)) >= 26 || c8 != ((char) ((charAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static int n(byte[] bArr) {
        boolean z7;
        if (bArr.length >= 4) {
            z7 = true;
        } else {
            z7 = false;
        }
        int length = bArr.length;
        if (z7) {
            byte b5 = bArr[0];
            byte b7 = bArr[1];
            return (bArr[3] & ForkServer.ERROR) | ((bArr[2] & ForkServer.ERROR) << 8) | (b5 << 24) | ((b7 & ForkServer.ERROR) << 16);
        }
        throw new IllegalArgumentException(W.z("array too small: %s < %s", Integer.valueOf(length), 4));
    }

    public static Drawable o(Context context, int i7) {
        return C1602p0.d().f(context, i7);
    }

    public static int p(int i7, int i8, int i9, int[] iArr) {
        while (i8 < i9) {
            if (iArr[i8] == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static n6.d q(n6.d dVar) {
        AbstractC1700c abstractC1700c;
        n6.d intercepted;
        kotlin.jvm.internal.j.e(dVar, "<this>");
        if (dVar instanceof AbstractC1700c) {
            abstractC1700c = (AbstractC1700c) dVar;
        } else {
            abstractC1700c = null;
        }
        if (abstractC1700c != null && (intercepted = abstractC1700c.intercepted()) != null) {
            return intercepted;
        }
        return dVar;
    }

    public static boolean r(AbstractC1530p abstractC1530p) {
        if (!(abstractC1530p instanceof C1529o) && !s(abstractC1530p)) {
            if (abstractC1530p instanceof C1519e) {
                C1519e c1519e = (C1519e) abstractC1530p;
                if (c1519e.f14336b == EnumC1518d.OR) {
                    for (AbstractC1530p abstractC1530p2 : DesugarCollections.unmodifiableList(c1519e.f14335a)) {
                        if ((abstractC1530p2 instanceof C1529o) || s(abstractC1530p2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean s(AbstractC1530p abstractC1530p) {
        if (abstractC1530p instanceof C1519e) {
            C1519e c1519e = (C1519e) abstractC1530p;
            Iterator it = c1519e.f14335a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AbstractC1530p) it.next()) instanceof C1519e) {
                        break;
                    }
                } else if (c1519e.e()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static x t(String str, FirebaseAuth firebaseAuth) {
        I.e(str);
        I.i(firebaseAuth);
        if ("facebook.com".equals(str) && !zzafm.zza(firebaseAuth.f9703a)) {
            throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
        }
        return new x(str, firebaseAuth);
    }

    public static int u(long j) {
        if (j > 2147483647L) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void v(L5.f binaryMessenger, final C0377c c0377c) {
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        l6.g gVar = C0380f.f6483b;
        E.e eVar = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (n) gVar.a(), null, 4);
        if (c0377c != null) {
            eVar.h0(new L5.b() { // from class: X5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List E4;
                    List E7;
                    switch (r2) {
                        case 0:
                            C0377c c0377c2 = c0377c;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            Long l8 = (Long) obj2;
                            long longValue = l8.longValue();
                            try {
                                c0377c2.f();
                                Object e7 = c0377c2.e(longValue);
                                if (e7 instanceof m0) {
                                    ((m0) e7).destroy();
                                }
                                c0377c2.f6460d.remove(l8);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        default:
                            C0377c c0377c3 = c0377c;
                            try {
                                c0377c3.f6458b.clear();
                                c0377c3.f6459c.clear();
                                c0377c3.f6460d.clear();
                                c0377c3.f.clear();
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (n) gVar.a(), null, 4);
        if (c0377c != null) {
            eVar2.h0(new L5.b() { // from class: X5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List E4;
                    List E7;
                    switch (r2) {
                        case 0:
                            C0377c c0377c2 = c0377c;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            Long l8 = (Long) obj2;
                            long longValue = l8.longValue();
                            try {
                                c0377c2.f();
                                Object e7 = c0377c2.e(longValue);
                                if (e7 instanceof m0) {
                                    ((m0) e7).destroy();
                                }
                                c0377c2.f6460d.remove(l8);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        default:
                            C0377c c0377c3 = c0377c;
                            try {
                                c0377c3.f6458b.clear();
                                c0377c3.f6459c.clear();
                                c0377c3.f6460d.clear();
                                c0377c3.f.clear();
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
    }

    public static void w(L5.f binaryMessenger, final C0392s c0392s) {
        Object obj;
        o oVar;
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        if (c0392s != null && (oVar = c0392s.f6530a) != null) {
            obj = oVar.j();
        } else {
            obj = new Object();
        }
        E.e eVar = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", obj, null, 4);
        if (c0392s != null) {
            eVar.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", obj, null, 4);
        if (c0392s != null) {
            eVar2.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", obj, null, 4);
        if (c0392s != null) {
            eVar3.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
        E.e eVar4 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", obj, null, 4);
        if (c0392s != null) {
            eVar4.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar4.h0(null);
        }
        E.e eVar5 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", obj, null, 4);
        if (c0392s != null) {
            eVar5.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar5.h0(null);
        }
        E.e eVar6 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", obj, null, 4);
        if (c0392s != null) {
            eVar6.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar6.h0(null);
        }
        E.e eVar7 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", obj, null, 4);
        if (c0392s != null) {
            eVar7.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar7.h0(null);
        }
        E.e eVar8 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", obj, null, 4);
        if (c0392s != null) {
            eVar8.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar8.h0(null);
        }
        E.e eVar9 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", obj, null, 4);
        if (c0392s != null) {
            eVar9.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar9.h0(null);
        }
        E.e eVar10 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", obj, null, 4);
        if (c0392s != null) {
            eVar10.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar10.h0(null);
        }
        E.e eVar11 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", obj, null, 4);
        if (c0392s != null) {
            eVar11.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar11.h0(null);
        }
        E.e eVar12 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", obj, null, 4);
        if (c0392s != null) {
            eVar12.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar12.h0(null);
        }
        E.e eVar13 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", obj, null, 4);
        if (c0392s != null) {
            eVar13.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar13.h0(null);
        }
        E.e eVar14 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", obj, null, 4);
        if (c0392s != null) {
            eVar14.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar14.h0(null);
        }
        E.e eVar15 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", obj, null, 4);
        if (c0392s != null) {
            eVar15.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar15.h0(null);
        }
        E.e eVar16 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", obj, null, 4);
        if (c0392s != null) {
            eVar16.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar16.h0(null);
        }
        E.e eVar17 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", obj, null, 4);
        if (c0392s != null) {
            eVar17.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar17.h0(null);
        }
        E.e eVar18 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", obj, null, 4);
        if (c0392s != null) {
            eVar18.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar18.h0(null);
        }
        E.e eVar19 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", obj, null, 4);
        if (c0392s != null) {
            eVar19.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar19.h0(null);
        }
        E.e eVar20 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", obj, null, 4);
        if (c0392s != null) {
            eVar20.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar20.h0(null);
        }
        E.e eVar21 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", obj, null, 4);
        if (c0392s != null) {
            eVar21.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar21.h0(null);
        }
        E.e eVar22 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", obj, null, 4);
        if (c0392s != null) {
            eVar22.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar22.h0(null);
        }
        E.e eVar23 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", obj, null, 4);
        if (c0392s != null) {
            eVar23.h0(new L5.b() { // from class: X5.O
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    List E22;
                    List E23;
                    List E24;
                    List E25;
                    List E26;
                    List E27;
                    switch (r2) {
                        case 0:
                            C0392s c0392s2 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s2.f6530a.f1179c).a(c0392s2.a(), ((Long) obj3).longValue());
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0392s c0392s3 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0392s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0392s c0392s4 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0377c) c0392s4.f6530a.f1179c).a(webView2.getSettings(), ((Long) obj6).longValue());
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0392s c0392s5 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            b0 b0Var = (b0) list3.get(1);
                            try {
                                c0392s5.getClass();
                                webView3.setWebChromeClient(b0Var);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0392s c0392s6 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0392s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0392s c0392s7 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c0392s7.getClass();
                                webView5.destroy();
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0392s c0392s8 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0392s8.getClass();
                                webView6.loadData(str, str2, str3);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0392s c0392s9 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0392s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0392s c0392s10 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c0392s10.getClass();
                                webView8.loadUrl(str9, map);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0392s c0392s11 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c0392s11.getClass();
                                webView9.postUrl(str10, bArr);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0392s c0392s12 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c0392s12.getClass();
                                E16 = G.i.A(webView10.getUrl());
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0392s c0392s13 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c0392s13.getClass();
                                webView11.goForward();
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0392s c0392s14 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c0392s14.getClass();
                                E18 = G.i.A(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0392s c0392s15 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c0392s15.getClass();
                                E19 = G.i.A(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0392s c0392s16 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c0392s16.getClass();
                                webView14.goBack();
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        case 15:
                            C0392s c0392s17 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c0392s17.getClass();
                                webView15.reload();
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            C0392s c0392s18 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c0392s18.getClass();
                                webView16.clearCache(booleanValue);
                                E22 = G.i.A(null);
                            } catch (Throwable th17) {
                                E22 = AbstractC0055e.E(th17);
                            }
                            fVar.h(E22);
                            return;
                        case 17:
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            D d7 = new D(fVar, 1);
                            c0392s.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new C0387m(d7, 1));
                            return;
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            C0392s c0392s19 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c0392s19.getClass();
                                E23 = G.i.A(webView17.getTitle());
                            } catch (Throwable th18) {
                                E23 = AbstractC0055e.E(th18);
                            }
                            fVar.h(E23);
                            return;
                        case 19:
                            C0392s c0392s20 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c0392s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                E24 = G.i.A(null);
                            } catch (Throwable th19) {
                                E24 = AbstractC0055e.E(th19);
                            }
                            fVar.h(E24);
                            return;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0392s c0392s21 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0392s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                E25 = G.i.A(null);
                            } catch (Throwable th20) {
                                E25 = AbstractC0055e.E(th20);
                            }
                            fVar.h(E25);
                            return;
                        case 21:
                            C0392s c0392s22 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0397x c0397x = (C0397x) obj35;
                            try {
                                c0392s22.getClass();
                                webView19.addJavascriptInterface(c0397x, c0397x.f6534a);
                                E26 = G.i.A(null);
                            } catch (Throwable th21) {
                                E26 = AbstractC0055e.E(th21);
                            }
                            fVar.h(E26);
                            return;
                        default:
                            C0392s c0392s23 = c0392s;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c0392s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                E27 = G.i.A(null);
                            } catch (Throwable th22) {
                                E27 = AbstractC0055e.E(th22);
                            }
                            fVar.h(E27);
                            return;
                    }
                }
            });
        } else {
            eVar23.h0(null);
        }
    }

    public static T1.e x(int i7, l lVar, q qVar) {
        T1.e b5 = T1.e.b(lVar, qVar);
        while (true) {
            int i8 = b5.f5318a;
            if (i8 != i7) {
                AbstractC0059i.J("Ignoring unknown WAV chunk: ", i8, "WavHeaderReader");
                long j = b5.f5319b;
                long j8 = 8 + j;
                if (j % 2 != 0) {
                    j8 = 9 + j;
                }
                if (j8 <= 2147483647L) {
                    lVar.m((int) j8);
                    b5 = T1.e.b(lVar, qVar);
                } else {
                    throw J.c("Chunk is too large (~2GB+) to skip; id: " + i8);
                }
            } else {
                return b5;
            }
        }
    }

    public static int[] y(Collection collection) {
        if (collection instanceof D3.b) {
            D3.b bVar = (D3.b) collection;
            return Arrays.copyOfRange(bVar.f860a, bVar.f861b, bVar.f862c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static void z(AbstractC0508j abstractC0508j, ArrayList arrayList) {
        if (!(abstractC0508j instanceof AbstractC0509k)) {
            if (abstractC0508j instanceof C1899I) {
                arrayList.add(((C1899I) abstractC0508j).f16075a);
                return;
            } else {
                arrayList.add(new C1940y(abstractC0508j));
                return;
            }
        }
        ((AbstractC0509k) abstractC0508j).getClass();
        throw null;
    }
}
