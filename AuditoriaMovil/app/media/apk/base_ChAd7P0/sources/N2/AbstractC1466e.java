package n2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import h0.AbstractC1028H;
import h0.C1023C;
import h0.C1025E;
import h0.C1026F;
import h0.C1027G;
import h0.C1036P;
import i2.C1102b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import l2.k;
import l2.l;
import l2.o;
/* renamed from: n2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1466e {
    public static l2.c a(l lVar, FoldingFeature foldingFeature) {
        l2.b bVar;
        l2.b bVar2;
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            bVar = l2.b.f13815Y;
        } else {
            bVar = l2.b.f13814X;
        }
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            bVar2 = l2.b.f;
        } else {
            bVar2 = l2.b.f13818e;
        }
        Rect bounds = foldingFeature.getBounds();
        j.d(bounds, "oemFeature.bounds");
        C1102b c1102b = new C1102b(bounds);
        Rect c8 = lVar.f13841a.c();
        if (c1102b.a() == 0 && c1102b.b() == 0) {
            return null;
        }
        if (c1102b.b() != c8.width() && c1102b.a() != c8.height()) {
            return null;
        }
        if (c1102b.b() < c8.width() && c1102b.a() < c8.height()) {
            return null;
        }
        if (c1102b.b() == c8.width() && c1102b.a() == c8.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        j.d(bounds2, "oemFeature.bounds");
        return new l2.c(new C1102b(bounds2), bVar, bVar2);
    }

    public static k b(Context context, WindowLayoutInfo info) {
        AbstractC1028H c1023c;
        l lVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        j.e(info, "info");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            int i8 = o.f13845b;
            if (i7 >= 30) {
                WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                C1036P c8 = C1036P.c(null, windowInsets);
                currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
                bounds = currentWindowMetrics2.getBounds();
                j.d(bounds, "wm.currentWindowMetrics.bounds");
                lVar = new l(bounds, c8);
            } else {
                Context context2 = context;
                while (context2 instanceof ContextWrapper) {
                    boolean z7 = context2 instanceof Activity;
                    if (!z7 && !(context2 instanceof InputMethodService)) {
                        ContextWrapper contextWrapper = (ContextWrapper) context2;
                        if (contextWrapper.getBaseContext() != null) {
                            context2 = contextWrapper.getBaseContext();
                            j.d(context2, "iterator.baseContext");
                        }
                    }
                    if (z7) {
                        lVar = o.a((Activity) context);
                    } else if (context2 instanceof InputMethodService) {
                        Object systemService = context.getSystemService("window");
                        j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                        j.d(defaultDisplay, "wm.defaultDisplay");
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        Rect rect = new Rect(0, 0, point.x, point.y);
                        int i9 = Build.VERSION.SDK_INT;
                        if (i9 >= 34) {
                            c1023c = new C1027G();
                        } else if (i9 >= 30) {
                            c1023c = new C1026F();
                        } else if (i9 >= 29) {
                            c1023c = new C1025E();
                        } else {
                            c1023c = new C1023C();
                        }
                        C1036P b5 = c1023c.b();
                        j.d(b5, "Builder().build()");
                        lVar = new l(rect, b5);
                    } else {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                }
                throw new IllegalArgumentException("Context " + context + " is not a UiContext");
            }
            return c(lVar, info);
        } else if (i7 >= 29 && (context instanceof Activity)) {
            int i10 = o.f13845b;
            return c(o.a((Activity) context), info);
        } else {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
    }

    public static k c(l lVar, WindowLayoutInfo info) {
        l2.c cVar;
        j.e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        j.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                j.d(feature, "feature");
                cVar = a(lVar, feature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new k(arrayList);
    }
}
