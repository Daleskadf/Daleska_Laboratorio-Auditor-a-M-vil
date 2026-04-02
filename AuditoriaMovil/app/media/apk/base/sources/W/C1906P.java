package w;

import D.AbstractC0059i;
import D.n0;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.core.impl.C0501c;
import v.C1878a;
import z.AbstractC2038a;
/* renamed from: w.P  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1906P extends C1891A {

    /* renamed from: b  reason: collision with root package name */
    public static final C1906P f16110b = new Object();

    @Override // w.C1891A
    public final void a(androidx.camera.core.impl.N n7, n0 n0Var) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        super.a(n7, n0Var);
        if (n7 instanceof androidx.camera.core.impl.N) {
            androidx.camera.core.impl.W b5 = androidx.camera.core.impl.W.b();
            C0501c c0501c = androidx.camera.core.impl.N.f7568b;
            if (AbstractC0059i.a(n7, c0501c)) {
                int intValue = ((Integer) AbstractC0059i.p(n7, c0501c)).intValue();
                if (((ImageCapturePixelHDRPlusQuirk) AbstractC2038a.f16621a.a0(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                    if (intValue == 0) {
                        key = CaptureRequest.CONTROL_ENABLE_ZSL;
                        b5.j(C1878a.o0(key), Boolean.TRUE);
                    } else if (intValue == 1) {
                        key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        b5.j(C1878a.o0(key2), Boolean.FALSE);
                    }
                }
            }
            n0Var.d(new A.m(androidx.camera.core.impl.Z.a(b5), 2));
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
