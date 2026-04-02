package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import v.C1878a;
import w.C1899I;
import z.AbstractC2038a;
/* loaded from: classes.dex */
public final class j0 extends i0 {
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.camera.core.impl.i0, androidx.camera.core.impl.j0] */
    public static j0 d(y0 y0Var, Size size) {
        if (y0Var.L() != null) {
            ?? i0Var = new i0();
            o0 S7 = y0Var.S();
            Z z7 = Z.f7595c;
            int i7 = o0.a().f7656g.f7537c;
            if (S7 != null) {
                i7 = S7.f7656g.f7537c;
                for (CameraDevice.StateCallback stateCallback : S7.f7653c) {
                    ArrayList arrayList = i0Var.f7640c;
                    if (!arrayList.contains(stateCallback)) {
                        arrayList.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : S7.f7654d) {
                    ArrayList arrayList2 = i0Var.f7641d;
                    if (!arrayList2.contains(stateCallback2)) {
                        arrayList2.add(stateCallback2);
                    }
                }
                i0Var.f7639b.a(S7.f7656g.f7538d);
                z7 = S7.f7656g.f7536b;
            }
            D.n0 n0Var = i0Var.f7639b;
            n0Var.getClass();
            n0Var.f755d = W.c(z7);
            if (y0Var instanceof C0498a0) {
                Rational rational = A.g.f12a;
                if (((PreviewPixelHDRnetQuirk) AbstractC2038a.f16621a.a0(PreviewPixelHDRnetQuirk.class)) != null && !A.g.f12a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    W b5 = W.b();
                    b5.j(C1878a.o0(CaptureRequest.TONEMAP_MODE), 2);
                    i0Var.f7639b.d(new A.m(Z.a(b5), 2));
                }
            }
            i0Var.f7639b.f752a = ((Integer) y0Var.f0(C1878a.f16028c, Integer.valueOf(i7))).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) y0Var.f0(C1878a.f16030e, new CameraDevice.StateCallback());
            ArrayList arrayList3 = i0Var.f7640c;
            if (!arrayList3.contains(stateCallback3)) {
                arrayList3.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) y0Var.f0(C1878a.f, new CameraCaptureSession.StateCallback());
            ArrayList arrayList4 = i0Var.f7641d;
            if (!arrayList4.contains(stateCallback4)) {
                arrayList4.add(stateCallback4);
            }
            C1899I c1899i = new C1899I((CameraCaptureSession.CaptureCallback) y0Var.f0(C1878a.f16026X, new CameraCaptureSession.CaptureCallback()));
            i0Var.f7639b.b(c1899i);
            ArrayList arrayList5 = i0Var.f7642e;
            if (!arrayList5.contains(c1899i)) {
                arrayList5.add(c1899i);
            }
            int g3 = y0Var.g();
            if (g3 != 0) {
                D.n0 n0Var2 = i0Var.f7639b;
                n0Var2.getClass();
                if (g3 != 0) {
                    ((W) n0Var2.f755d).j(y0.f7693S, Integer.valueOf(g3));
                }
            }
            int A7 = y0Var.A();
            if (A7 != 0) {
                D.n0 n0Var3 = i0Var.f7639b;
                n0Var3.getClass();
                if (A7 != 0) {
                    ((W) n0Var3.f755d).j(y0.f7692R, Integer.valueOf(A7));
                }
            }
            W b7 = W.b();
            C0501c c0501c = C1878a.f16027Y;
            b7.j(c0501c, (String) y0Var.f0(c0501c, null));
            C0501c c0501c2 = C1878a.f16029d;
            Long l8 = (Long) y0Var.f0(c0501c2, -1L);
            l8.getClass();
            b7.j(c0501c2, l8);
            i0Var.f7639b.d(b7);
            i0Var.f7639b.d(C5.i.k0(y0Var).j0());
            return i0Var;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + y0Var.X(y0Var.toString()));
    }

    public final void a(G g3) {
        this.f7639b.d(g3);
    }

    public final void b(J j, D.D d7, int i7) {
        F3.o a7 = C0503e.a(j);
        if (d7 != null) {
            a7.f = d7;
            a7.f1180d = Integer.valueOf(i7);
            this.f7638a.add(a7.e());
            ((HashSet) this.f7639b.f754c).add(j);
            return;
        }
        throw new NullPointerException("Null dynamicRange");
    }

    public final o0 c() {
        return new o0(new ArrayList(this.f7638a), new ArrayList(this.f7640c), new ArrayList(this.f7641d), new ArrayList(this.f7642e), this.f7639b.e(), this.f, this.f7643g, this.f7644h);
    }
}
