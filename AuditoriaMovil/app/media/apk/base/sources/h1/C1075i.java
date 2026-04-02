package h1;

import A3.K;
import H0.Y;
import K0.x;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;
/* renamed from: h1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1075i extends Y {

    /* renamed from: r  reason: collision with root package name */
    public boolean f11263r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11264s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11265t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11266u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f11267v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11268w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11269x;

    /* renamed from: y  reason: collision with root package name */
    public final SparseArray f11270y;

    /* renamed from: z  reason: collision with root package name */
    public final SparseBooleanArray f11271z;

    public C1075i(Context context) {
        CaptioningManager captioningManager;
        String locale;
        Point point;
        String E4;
        String[] split;
        int i7 = x.f2529a;
        if ((i7 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f1757o = 1088;
            Locale locale2 = captioningManager.getLocale();
            if (locale2 != null) {
                if (i7 >= 21) {
                    locale = locale2.toLanguageTag();
                } else {
                    locale = locale2.toString();
                }
                this.f1756n = K.u(locale);
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && x.L(context)) {
            if (i7 < 28) {
                E4 = x.E("sys.display-size");
            } else {
                E4 = x.E("vendor.display-size");
            }
            if (!TextUtils.isEmpty(E4)) {
                try {
                    split = E4.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        a(point.x, point.y);
                        this.f11270y = new SparseArray();
                        this.f11271z = new SparseBooleanArray();
                        b();
                    }
                }
                K0.a.n("Util", "Invalid display size: " + E4);
            }
            if ("Sony".equals(x.f2531c) && x.f2532d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                a(point.x, point.y);
                this.f11270y = new SparseArray();
                this.f11271z = new SparseBooleanArray();
                b();
            }
        }
        point = new Point();
        if (i7 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else {
            display.getRealSize(point);
        }
        a(point.x, point.y);
        this.f11270y = new SparseArray();
        this.f11271z = new SparseBooleanArray();
        b();
    }

    @Override // H0.Y
    public final Y a(int i7, int i8) {
        super.a(i7, i8);
        return this;
    }

    public final void b() {
        this.f11263r = true;
        this.f11264s = true;
        this.f11265t = true;
        this.f11266u = true;
        this.f11267v = true;
        this.f11268w = true;
        this.f11269x = true;
    }

    public C1075i() {
        this.f11270y = new SparseArray();
        this.f11271z = new SparseBooleanArray();
        b();
    }
}
