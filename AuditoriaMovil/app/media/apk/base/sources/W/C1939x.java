package w;

import D.AbstractC0055e;
import D.C0056f;
import D.EnumC0071v;
import a.AbstractC0412a;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0519v;
import h3.AbstractC1079a;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* renamed from: w.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1939x implements InterfaceC0519v {

    /* renamed from: a  reason: collision with root package name */
    public final String f16303a;

    /* renamed from: b  reason: collision with root package name */
    public final x.j f16304b;

    /* renamed from: c  reason: collision with root package name */
    public final A4.c f16305c;

    /* renamed from: e  reason: collision with root package name */
    public C1925j f16307e;

    /* renamed from: h  reason: collision with root package name */
    public final C1938w f16309h;

    /* renamed from: i  reason: collision with root package name */
    public final A.m f16310i;

    /* renamed from: d  reason: collision with root package name */
    public final Object f16306d = new Object();
    public C1938w f = null;

    /* renamed from: g  reason: collision with root package name */
    public C1938w f16308g = null;

    public C1939x(String str, x.p pVar) {
        str.getClass();
        this.f16303a = str;
        x.j b5 = pVar.b(str);
        this.f16304b = b5;
        A4.c cVar = new A4.c(4, false);
        cVar.f218b = this;
        this.f16305c = cVar;
        this.f16310i = AbstractC1079a.i(b5);
        new HashMap();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            org.slf4j.helpers.i.O("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
        }
        this.f16309h = new C1938w(new C0056f(EnumC0071v.CLOSED, null));
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final int a() {
        return e(0);
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final int b() {
        boolean z7;
        Integer num = (Integer) this.f16304b.a(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.a("Unable to get the lens facing of the camera.", z7);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("The given lens facing integer: ", intValue, " can not be recognized."));
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final String c() {
        return this.f16303a;
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final androidx.lifecycle.C d() {
        synchronized (this.f16306d) {
            try {
                C1925j c1925j = this.f16307e;
                if (c1925j == null) {
                    if (this.f == null) {
                        this.f = new C1938w(0);
                    }
                    return this.f;
                }
                C1938w c1938w = this.f;
                if (c1938w != null) {
                    return c1938w;
                }
                return c1925j.f16214Z.f16185b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final int e(int i7) {
        Integer num = (Integer) this.f16304b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int W7 = AbstractC0412a.W(i7);
        boolean z7 = true;
        if (1 != b()) {
            z7 = false;
        }
        return AbstractC0412a.t(W7, intValue, z7);
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final boolean f() {
        x.j jVar = this.f16304b;
        Objects.requireNonNull(jVar);
        return AbstractC0055e.n(new X5.E(jVar, 25));
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final InterfaceC0519v g() {
        return this;
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final A.m h() {
        return this.f16310i;
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final List i(int i7) {
        Size[] k2 = this.f16304b.b().k(i7);
        if (k2 != null) {
            return Arrays.asList(k2);
        }
        return Collections.emptyList();
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final androidx.lifecycle.C j() {
        synchronized (this.f16306d) {
            try {
                C1925j c1925j = this.f16307e;
                if (c1925j == null) {
                    if (this.f16308g == null) {
                        g0 b5 = Q0.A.b(this.f16304b);
                        h0 h0Var = new h0(b5.h(), b5.n());
                        h0Var.f(1.0f);
                        this.f16308g = new C1938w(I.b.e(h0Var));
                    }
                    return this.f16308g;
                }
                C1938w c1938w = this.f16308g;
                if (c1938w != null) {
                    return c1938w;
                }
                return (androidx.lifecycle.C) c1925j.f16213Y.f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0519v
    public final androidx.lifecycle.C k() {
        return this.f16309h;
    }

    public final void l(C1925j c1925j) {
        String str;
        synchronized (this.f16306d) {
            try {
                this.f16307e = c1925j;
                C1938w c1938w = this.f16308g;
                if (c1938w != null) {
                    c1938w.m((androidx.lifecycle.C) c1925j.f16213Y.f);
                }
                C1938w c1938w2 = this.f;
                if (c1938w2 != null) {
                    c1938w2.m(this.f16307e.f16214Z.f16185b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Integer num = (Integer) this.f16304b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            str = io.flutter.plugins.pathprovider.b.e(intValue, "Unknown value: ");
                        } else {
                            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                        }
                    } else {
                        str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    }
                } else {
                    str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                }
            } else {
                str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            }
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        }
        String h8 = io.flutter.plugins.pathprovider.b.h("Device Level: ", str);
        String N7 = org.slf4j.helpers.i.N("Camera2CameraInfo");
        if (org.slf4j.helpers.i.E(4, N7)) {
            Log.i(N7, h8);
        }
    }
}
