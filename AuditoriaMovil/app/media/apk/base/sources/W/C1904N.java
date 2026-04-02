package w;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.core.impl.t0;
import java.util.Locale;
/* renamed from: w.N  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1904N {

    /* renamed from: e  reason: collision with root package name */
    public static final Size f16095e = new Size(1920, 1080);
    public static final Size f = new Size(320, 240);

    /* renamed from: g  reason: collision with root package name */
    public static final Size f16096g = new Size(640, 480);

    /* renamed from: h  reason: collision with root package name */
    public static final Object f16097h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static volatile C1904N f16098i;

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f16099a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Size f16100b = null;

    /* renamed from: c  reason: collision with root package name */
    public final C5.i f16101c = new C5.i(2);

    /* renamed from: d  reason: collision with root package name */
    public final C5.i f16102d = new C5.i(1);

    public C1904N(Context context) {
        this.f16099a = (DisplayManager) context.getSystemService("display");
    }

    public static C1904N b(Context context) {
        if (f16098i == null) {
            synchronized (f16097h) {
                try {
                    if (f16098i == null) {
                        f16098i = new C1904N(context);
                    }
                } finally {
                }
            }
        }
        return f16098i;
    }

    public static Display d(Display[] displayArr, boolean z7) {
        Display display = null;
        int i7 = -1;
        for (Display display2 : displayArr) {
            if (!z7 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i8 = point.x * point.y;
                if (i8 > i7) {
                    display = display2;
                    i7 = i8;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size b5;
        Size size;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        Size size3 = L.a.f2815a;
        if (size2.getHeight() * size2.getWidth() < L.a.a(f)) {
            if (((SmallDisplaySizeQuirk) this.f16102d.f593b) != null) {
                size = (Size) SmallDisplaySizeQuirk.f7515a.get(Build.MODEL.toUpperCase(Locale.US));
            } else {
                size = null;
            }
            size2 = size;
            if (size2 == null) {
                size2 = f16096g;
            }
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        int height = size2.getHeight() * size2.getWidth();
        Size size4 = f16095e;
        if (height > size4.getHeight() * size4.getWidth()) {
            size2 = size4;
        }
        if (((ExtraCroppingQuirk) this.f16101c.f593b) != null && (b5 = ExtraCroppingQuirk.b(t0.PRIV)) != null) {
            if (b5.getHeight() * b5.getWidth() > size2.getHeight() * size2.getWidth()) {
                return b5;
            }
            return size2;
        }
        return size2;
    }

    public final Display c(boolean z7) {
        Display[] displays = this.f16099a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display d7 = d(displays, z7);
        if (d7 == null && z7) {
            d7 = d(displays, false);
        }
        if (d7 != null) {
            return d7;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.f16100b != null) {
            return this.f16100b;
        }
        this.f16100b = a();
        return this.f16100b;
    }
}
