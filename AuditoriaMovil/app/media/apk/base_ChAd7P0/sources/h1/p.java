package h1;

import A3.C0026y;
import A3.K;
import A3.d0;
import A3.e0;
import H0.C0126f;
import H0.W;
import K0.x;
import O0.N;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import c5.C0639a;
import e1.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class p extends u {

    /* renamed from: i  reason: collision with root package name */
    public static final d0 f11309i = new C0026y(new K1.d(9));

    /* renamed from: c  reason: collision with root package name */
    public final Object f11310c;

    /* renamed from: d  reason: collision with root package name */
    public final C0639a f11311d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11312e;
    public final C1076j f;

    /* renamed from: g  reason: collision with root package name */
    public final K5.d f11313g;

    /* renamed from: h  reason: collision with root package name */
    public C0126f f11314h;

    /* JADX WARN: Type inference failed for: r0v0, types: [c5.a, java.lang.Object] */
    public p(Context context) {
        Spatializer spatializer;
        K5.d dVar;
        ?? obj = new Object();
        int i7 = C1076j.f11272A;
        C1076j c1076j = new C1076j(new C1075i(context));
        this.f11310c = new Object();
        context.getApplicationContext();
        this.f11311d = obj;
        this.f = c1076j;
        this.f11314h = C0126f.f1797c;
        boolean L6 = x.L(context);
        this.f11312e = L6;
        if (!L6 && x.f2529a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                dVar = new K5.d(spatializer);
            } else {
                dVar = null;
            }
            this.f11313g = dVar;
        }
    }

    public static int c(int i7, int i8) {
        if (i7 != 0 && i7 == i8) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return Integer.bitCount(i7 & i8);
    }

    public static int d(H0.r rVar, String str, boolean z7) {
        if (!TextUtils.isEmpty(str) && str.equals(rVar.f1879d)) {
            return 4;
        }
        String f = f(str);
        String f4 = f(rVar.f1879d);
        if (f4 != null && f != null) {
            if (!f4.startsWith(f) && !f.startsWith(f4)) {
                int i7 = x.f2529a;
                if (!f4.split("-", 2)[0].equals(f.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z7 || f4 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair h(int i7, t tVar, int[][][] iArr, m mVar, Comparator comparator) {
        RandomAccess randomAccess;
        boolean z7;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < tVar2.f11317a) {
            if (i7 == ((int[]) tVar2.f11318b)[i8]) {
                b0 b0Var = ((b0[]) tVar2.f11320d)[i8];
                for (int i9 = 0; i9 < b0Var.f10780a; i9++) {
                    W a7 = b0Var.a(i9);
                    e0 e7 = mVar.e(i8, a7, iArr[i8][i9]);
                    int i10 = a7.f1739a;
                    boolean[] zArr = new boolean[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        n nVar = (n) e7.get(i11);
                        int a8 = nVar.a();
                        if (!zArr[i11] && a8 != 0) {
                            if (a8 == 1) {
                                randomAccess = K.u(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                for (int i12 = i11 + 1; i12 < i10; i12++) {
                                    n nVar2 = (n) e7.get(i12);
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        z7 = true;
                                        zArr[i12] = true;
                                    } else {
                                        z7 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i8++;
            tVar2 = tVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((n) list.get(i13)).f11293c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(nVar3.f11292b, iArr2), Integer.valueOf(nVar3.f11291a));
    }

    @Override // h1.u
    public final void a() {
        K5.d dVar;
        k kVar;
        synchronized (this.f11310c) {
            try {
                if (x.f2529a >= 32 && (dVar = this.f11313g) != null && (kVar = (k) dVar.f2701e) != null && ((Handler) dVar.f2700d) != null) {
                    ((Spatializer) dVar.f2699c).removeOnSpatializerStateChangedListener(kVar);
                    ((Handler) dVar.f2700d).removeCallbacksAndMessages(null);
                    dVar.f2700d = null;
                    dVar.f2701e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11322a = null;
        this.f11323b = null;
    }

    @Override // h1.u
    public final void b(C0126f c0126f) {
        boolean equals;
        synchronized (this.f11310c) {
            equals = this.f11314h.equals(c0126f);
            this.f11314h = c0126f;
        }
        if (!equals) {
            e();
        }
    }

    public final void e() {
        boolean z7;
        N n7;
        K5.d dVar;
        synchronized (this.f11310c) {
            try {
                if (this.f.f11277v && !this.f11312e && x.f2529a >= 32 && (dVar = this.f11313g) != null && dVar.f2698b) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7 && (n7 = this.f11322a) != null) {
            n7.f3576Y.e(10);
        }
    }

    public final void g() {
        synchronized (this.f11310c) {
            this.f.getClass();
        }
    }
}
