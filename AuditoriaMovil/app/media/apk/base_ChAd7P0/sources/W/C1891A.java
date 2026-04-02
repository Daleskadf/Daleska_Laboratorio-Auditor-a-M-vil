package w;

import D.n0;
import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.u0;
import androidx.camera.core.impl.y0;
import java.util.ArrayList;
import java.util.HashSet;
import v.C1878a;
/* renamed from: w.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1891A {

    /* renamed from: a  reason: collision with root package name */
    public static final C1891A f16067a = new Object();

    public void a(androidx.camera.core.impl.N n7, n0 n0Var) {
        androidx.camera.core.impl.E e7 = (androidx.camera.core.impl.E) n7.f0(y0.f7684J, null);
        androidx.camera.core.impl.Z z7 = androidx.camera.core.impl.Z.f7595c;
        C0501c c0501c = androidx.camera.core.impl.E.f7533h;
        HashSet hashSet = new HashSet();
        androidx.camera.core.impl.W b5 = androidx.camera.core.impl.W.b();
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.Y a7 = androidx.camera.core.impl.Y.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        androidx.camera.core.impl.Z a8 = androidx.camera.core.impl.Z.a(b5);
        ArrayList arrayList3 = new ArrayList(arrayList);
        u0 u0Var = u0.f7673b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a7.f7674a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        u0 u0Var2 = new u0(arrayMap);
        int i7 = -1;
        new androidx.camera.core.impl.E(arrayList2, a8, -1, arrayList3, false, u0Var2, null);
        if (e7 != null) {
            n0Var.a(e7.f7538d);
            z7 = e7.f7536b;
            i7 = e7.f7537c;
        }
        n0Var.f755d = androidx.camera.core.impl.W.c(z7);
        n0Var.f752a = ((Integer) n7.f0(C1878a.f16028c, Integer.valueOf(i7))).intValue();
        n0Var.b(new C1899I((CameraCaptureSession.CaptureCallback) n7.f0(C1878a.f16026X, new CameraCaptureSession.CaptureCallback())));
        n0Var.d(C5.i.k0(n7).j0());
    }
}
