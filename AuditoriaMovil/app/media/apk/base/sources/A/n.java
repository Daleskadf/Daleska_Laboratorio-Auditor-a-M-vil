package A;

import D.n0;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.Z;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.C1878a;
import z.AbstractC2038a;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f29a;

    public n(int i7) {
        boolean z7;
        boolean z8;
        boolean z9;
        switch (i7) {
            case 2:
                if (AbstractC2038a.f16621a.a0(TorchIsClosedAfterImageCapturingQuirk.class) != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.f29a = z7;
                return;
            case 3:
                if (J.a.f2288a.a0(SurfaceOrderQuirk.class) != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f29a = z8;
                return;
            default:
                if (((StillCaptureFlashStopRepeatingQuirk) AbstractC2038a.f16621a.a0(StillCaptureFlashStopRepeatingQuirk.class)) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f29a = z9;
                return;
        }
    }

    public static E b(E e7) {
        n0 n0Var = new n0();
        n0Var.f752a = e7.f7537c;
        for (J j : DesugarCollections.unmodifiableList(e7.f7535a)) {
            ((HashSet) n0Var.f754c).add(j);
        }
        n0Var.d(e7.f7536b);
        W b5 = W.b();
        b5.j(C1878a.o0(CaptureRequest.FLASH_MODE), 0);
        n0Var.d(new m(Z.a(b5), 2));
        return n0Var.e();
    }

    public synchronized void a() {
        this.f29a = false;
    }

    public boolean c(ArrayList arrayList, boolean z7) {
        if (this.f29a && z7) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public synchronized boolean d() {
        if (this.f29a) {
            return false;
        }
        this.f29a = true;
        notifyAll();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(java.util.ArrayList r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f29a
            r1 = 0
            if (r0 == 0) goto L2c
            if (r4 != 0) goto L8
            goto L2c
        L8:
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = 2
            if (r4 == r0) goto L2a
            r0 = 3
            if (r4 != r0) goto Lc
        L2a:
            r3 = 1
            return r3
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A.n.e(java.util.ArrayList, boolean):boolean");
    }
}
