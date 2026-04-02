package w;

import android.content.Context;
import android.util.ArrayMap;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.u0;
import androidx.camera.core.impl.y0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* renamed from: w.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1893C implements B0 {

    /* renamed from: b  reason: collision with root package name */
    public final C1904N f16069b;

    public C1893C(Context context) {
        this.f16069b = C1904N.b(context);
    }

    @Override // androidx.camera.core.impl.B0
    public final androidx.camera.core.impl.G a(A0 a02, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj;
        androidx.camera.core.impl.W b5 = androidx.camera.core.impl.W.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        androidx.camera.core.impl.W b7 = androidx.camera.core.impl.W.b();
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.Y a7 = androidx.camera.core.impl.Y.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int[] iArr = AbstractC1915Z.f16168a;
        int i12 = iArr[a02.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                i9 = 1;
            } else {
                i9 = 3;
            }
        } else {
            if (i7 == 2) {
                i8 = 5;
            } else {
                i8 = 1;
            }
            i9 = i8;
        }
        C0501c c0501c = y0.f7683I;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        androidx.camera.core.impl.Z a8 = androidx.camera.core.impl.Z.a(b7);
        ArrayList arrayList10 = new ArrayList(arrayList);
        u0 u0Var = u0.f7673b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a7.f7674a;
        for (Iterator it = arrayMap2.keySet().iterator(); it.hasNext(); it = it) {
            String str = (String) it.next();
            arrayMap.put(str, arrayMap2.get(str));
        }
        b5.j(c0501c, new o0(arrayList5, arrayList6, arrayList7, arrayList8, new androidx.camera.core.impl.E(arrayList9, a8, i9, arrayList10, false, new u0(arrayMap), null), null, null, null));
        b5.j(y0.f7685K, C1892B.f16068a);
        HashSet hashSet2 = new HashSet();
        androidx.camera.core.impl.W b8 = androidx.camera.core.impl.W.b();
        ArrayList arrayList11 = new ArrayList();
        androidx.camera.core.impl.Y a9 = androidx.camera.core.impl.Y.a();
        int i13 = iArr[a02.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                i11 = 1;
            } else {
                i11 = 3;
            }
        } else {
            if (i7 == 2) {
                i10 = 5;
            } else {
                i10 = 2;
            }
            i11 = i10;
        }
        C0501c c0501c2 = y0.f7684J;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        androidx.camera.core.impl.Z a10 = androidx.camera.core.impl.Z.a(b8);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        u0 u0Var2 = u0.f7673b;
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = a9.f7674a;
        for (String str2 : arrayMap4.keySet()) {
            arrayMap3.put(str2, arrayMap4.get(str2));
        }
        b5.j(c0501c2, new androidx.camera.core.impl.E(arrayList12, a10, i11, arrayList13, false, new u0(arrayMap3), null));
        C0501c c0501c3 = y0.f7686L;
        if (a02 == A0.IMAGE_CAPTURE) {
            obj = C1906P.f16110b;
        } else {
            obj = C1891A.f16067a;
        }
        b5.j(c0501c3, obj);
        A0 a03 = A0.PREVIEW;
        C1904N c1904n = this.f16069b;
        if (a02 == a03) {
            b5.j(androidx.camera.core.impl.Q.f7581E, c1904n.e());
        }
        b5.j(androidx.camera.core.impl.Q.f7586z, Integer.valueOf(c1904n.c(true).getRotation()));
        if (a02 == A0.VIDEO_CAPTURE || a02 == A0.STREAM_SHARING) {
            b5.j(y0.f7689O, Boolean.TRUE);
        }
        return androidx.camera.core.impl.Z.a(b5);
    }
}
