package l2;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h0.AbstractC1028H;
import h0.C1023C;
import h0.C1025E;
import h0.C1026F;
import h0.C1027G;
import h0.C1036P;
import i0.AbstractC1093b;
import i2.C1102b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import m6.C1444e;
import p2.C1658a;
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f13845b = 0;

    static {
        new ArrayList(new C1444e(new Integer[]{1, 2, 4, 8, 16, 32, 64, Integer.valueOf((int) RecognitionOptions.ITF)}, true));
    }

    public static l a(Activity activity) {
        Rect rect;
        int i7;
        boolean isInMultiWindowMode;
        int i8;
        AbstractC1028H c1023c;
        C1036P b5;
        WindowMetrics currentWindowMetrics;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            kotlin.jvm.internal.j.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i9 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                kotlin.jvm.internal.j.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e7) {
                Log.w("o", e7);
                rect = b(activity);
            } catch (NoSuchFieldException e8) {
                Log.w("o", e8);
                rect = b(activity);
            } catch (NoSuchMethodException e9) {
                Log.w("o", e9);
                rect = b(activity);
            } catch (InvocationTargetException e10) {
                Log.w("o", e10);
                rect = b(activity);
            }
        } else if (i9 >= 28) {
            rect = b(activity);
        } else if (i9 >= 24) {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            isInMultiWindowMode = activity.isInMultiWindowMode();
            if (!isInMultiWindowMode) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i8 = resources.getDimensionPixelSize(identifier);
                } else {
                    i8 = 0;
                }
                int i10 = rect.bottom + i8;
                if (i10 == point.y) {
                    rect.bottom = i10;
                } else {
                    int i11 = rect.right + i8;
                    if (i11 == point.x) {
                        rect.right = i11;
                    }
                }
            }
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            kotlin.jvm.internal.j.d(defaultDisplay2, "defaultDisplay");
            Point point2 = new Point();
            defaultDisplay2.getRealSize(point2);
            Rect rect2 = new Rect();
            int i12 = point2.x;
            if (i12 != 0 && (i7 = point2.y) != 0) {
                rect2.right = i12;
                rect2.bottom = i7;
            } else {
                defaultDisplay2.getRectSize(rect2);
            }
            rect = rect2;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            if (i13 >= 30) {
                b5 = C1658a.f15081a.a(activity);
            } else {
                throw new Exception("Incompatible SDK version");
            }
        } else {
            if (i13 >= 34) {
                c1023c = new C1027G();
            } else if (i13 >= 30) {
                c1023c = new C1026F();
            } else if (i13 >= 29) {
                c1023c = new C1025E();
            } else {
                c1023c = new C1023C();
            }
            b5 = c1023c.b();
            kotlin.jvm.internal.j.d(b5, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new l(new C1102b(rect), b5);
    }

    public static Rect b(Activity activity) {
        boolean isInMultiWindowMode;
        boolean isInMultiWindowMode2;
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        int i7;
        boolean isInMultiWindowMode3;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            isInMultiWindowMode3 = activity.isInMultiWindowMode();
            if (isInMultiWindowMode3) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                kotlin.jvm.internal.j.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                kotlin.jvm.internal.j.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e7) {
            Log.w("o", e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e8) {
            Log.w("o", e8);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e9) {
            Log.w("o", e9);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e10) {
            Log.w("o", e10);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        kotlin.jvm.internal.j.d(currentDisplay, "currentDisplay");
        currentDisplay.getRealSize(point);
        isInMultiWindowMode = activity.isInMultiWindowMode();
        if (!isInMultiWindowMode) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i7 = resources.getDimensionPixelSize(identifier);
            } else {
                i7 = 0;
            }
            int i8 = rect.bottom + i7;
            if (i8 == point.y) {
                rect.bottom = i8;
            } else {
                int i9 = rect.right + i7;
                if (i9 == point.x) {
                    rect.right = i9;
                } else if (rect.left == i7) {
                    rect.left = 0;
                }
            }
        }
        if (rect.width() < point.x || rect.height() < point.y) {
            isInMultiWindowMode2 = activity.isInMultiWindowMode();
            if (!isInMultiWindowMode2) {
                try {
                    Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                    constructor.setAccessible(true);
                    Object newInstance = constructor.newInstance(null);
                    Method declaredMethod = currentDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(currentDisplay, newInstance);
                    Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(newInstance);
                    if (AbstractC1093b.m(obj2)) {
                        displayCutout = AbstractC1093b.e(obj2);
                    }
                } catch (ClassNotFoundException e11) {
                    Log.w("o", e11);
                } catch (IllegalAccessException e12) {
                    Log.w("o", e12);
                } catch (InstantiationException e13) {
                    Log.w("o", e13);
                } catch (NoSuchFieldException e14) {
                    Log.w("o", e14);
                } catch (NoSuchMethodException e15) {
                    Log.w("o", e15);
                } catch (InvocationTargetException e16) {
                    Log.w("o", e16);
                }
                if (displayCutout != null) {
                    int i10 = rect.left;
                    safeInsetLeft = displayCutout.getSafeInsetLeft();
                    if (i10 == safeInsetLeft) {
                        rect.left = 0;
                    }
                    int i11 = point.x - rect.right;
                    safeInsetRight = displayCutout.getSafeInsetRight();
                    if (i11 == safeInsetRight) {
                        int i12 = rect.right;
                        safeInsetRight2 = displayCutout.getSafeInsetRight();
                        rect.right = safeInsetRight2 + i12;
                    }
                    int i13 = rect.top;
                    safeInsetTop = displayCutout.getSafeInsetTop();
                    if (i13 == safeInsetTop) {
                        rect.top = 0;
                    }
                    int i14 = point.y - rect.bottom;
                    safeInsetBottom = displayCutout.getSafeInsetBottom();
                    if (i14 == safeInsetBottom) {
                        int i15 = rect.bottom;
                        safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                        rect.bottom = safeInsetBottom2 + i15;
                    }
                }
            }
        }
        return rect;
    }
}
