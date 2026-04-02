package w;

import D.AbstractC0055e;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Looper;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final C1925j f16184a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.C f16185b = new androidx.lifecycle.C(0);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f16186c;

    /* renamed from: d  reason: collision with root package name */
    public final G.k f16187d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16188e;
    public U.i f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16189g;

    public c0(C1925j c1925j, x.j jVar, G.k kVar) {
        this.f16184a = c1925j;
        this.f16187d = kVar;
        this.f16186c = AbstractC0055e.n(new X5.E(jVar, 25));
        c1925j.a(new InterfaceC1924i() { // from class: w.a0
            @Override // w.InterfaceC1924i
            public final boolean b(TotalCaptureResult totalCaptureResult) {
                boolean z7;
                c0 c0Var = c0.this;
                if (c0Var.f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if (num != null && num.intValue() == 2) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7 == c0Var.f16189g) {
                        c0Var.f.a(null);
                        c0Var.f = null;
                    }
                }
                return false;
            }
        });
    }

    public static void a(androidx.lifecycle.C c8, Integer num) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c8.l(num);
        } else {
            c8.i(num);
        }
    }
}
