package o2;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import i2.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m6.p;
/* renamed from: o2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1554f {

    /* renamed from: a  reason: collision with root package name */
    public final k f14558a;

    public C1554f() {
        k verificationMode = k.QUIET;
        kotlin.jvm.internal.j.e(verificationMode, "verificationMode");
        this.f14558a = verificationMode;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (kotlin.jvm.internal.j.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState != null && sidecarDeviceState2 != null && AbstractC1549a.b(sidecarDeviceState) == AbstractC1549a.b(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.j.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.j.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!b((SidecarDisplayFeature) list.get(i7), (SidecarDisplayFeature) list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (kotlin.jvm.internal.j.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(AbstractC1549a.c(sidecarWindowLayoutInfo), AbstractC1549a.c(sidecarWindowLayoutInfo2));
    }

    public final ArrayList e(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l2.c g3 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g3 != null) {
                arrayList.add(g3);
            }
        }
        return arrayList;
    }

    public final l2.k f(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        kotlin.jvm.internal.j.e(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new l2.k(p.f14074a);
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        AbstractC1549a.d(sidecarDeviceState, AbstractC1549a.b(state));
        return new l2.k(e(AbstractC1549a.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r6 == 4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l2.c g(androidx.window.sidecar.SidecarDisplayFeature r5, androidx.window.sidecar.SidecarDeviceState r6) {
        /*
            r4 = this;
            java.lang.String r0 = "feature"
            kotlin.jvm.internal.j.e(r5, r0)
            i2.k r0 = r4.f14558a
            i2.j r0 = i2.C1101a.a(r5, r0)
            o2.b r1 = o2.C1550b.f14554a
            java.lang.String r2 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            i2.i r0 = r0.d(r2, r1)
            o2.c r1 = o2.C1551c.f14555a
            java.lang.String r2 = "Feature bounds must not be 0"
            i2.i r0 = r0.d(r2, r1)
            o2.d r1 = o2.C1552d.f14556a
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            i2.i r0 = r0.d(r2, r1)
            o2.e r1 = o2.C1553e.f14557a
            java.lang.String r2 = "Feature be pinned to either left or top"
            i2.i r0 = r0.d(r2, r1)
            java.lang.Object r0 = r0.a()
            androidx.window.sidecar.SidecarDisplayFeature r0 = (androidx.window.sidecar.SidecarDisplayFeature) r0
            r1 = 0
            if (r0 != 0) goto L35
            return r1
        L35:
            int r0 = r0.getType()
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L43
            if (r0 == r2) goto L40
            return r1
        L40:
            l2.b r0 = l2.b.f13815Y
            goto L45
        L43:
            l2.b r0 = l2.b.f13814X
        L45:
            int r6 = o2.AbstractC1549a.b(r6)
            if (r6 == 0) goto L6e
            if (r6 == r3) goto L6e
            if (r6 == r2) goto L58
            l2.b r2 = l2.b.f13818e
            r3 = 3
            if (r6 == r3) goto L5a
            r3 = 4
            if (r6 == r3) goto L6e
            goto L5a
        L58:
            l2.b r2 = l2.b.f
        L5a:
            l2.c r6 = new l2.c
            i2.b r1 = new i2.b
            android.graphics.Rect r5 = r5.getRect()
            java.lang.String r3 = "feature.rect"
            kotlin.jvm.internal.j.d(r5, r3)
            r1.<init>(r5)
            r6.<init>(r1, r0, r2)
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.C1554f.g(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):l2.c");
    }
}
