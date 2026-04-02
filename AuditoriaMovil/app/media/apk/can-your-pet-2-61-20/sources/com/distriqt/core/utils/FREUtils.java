package com.distriqt.core.utils;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.adobe.fre.FREArray;
import com.adobe.fre.FREContext;
/* loaded from: classes.dex */
public class FREUtils {
    public static final String TAG = "FREUtils";
    public static Boolean DEBUG_ENABLED = true;
    @Deprecated
    public static Boolean DEBUG_OUTPUTS_ENABLED = true;
    @Deprecated
    public static String ID = "com.distriqt.EXTENSION";
    @Deprecated
    public static FREContext context = null;

    @Deprecated
    public static void log(String str, String str2, Object... objArr) {
        LogUtil.d("com.distriqt.corelibraries", str, str2, objArr);
    }

    @Deprecated
    public static void handleException(Throwable th) {
        handleException(context, th);
    }

    public static void handleException(FREContext fREContext, Throwable th) {
        try {
            if (DEBUG_ENABLED.booleanValue()) {
                th.printStackTrace();
            }
            if (fREContext != null) {
                String str = "unknown";
                if (th != null) {
                    try {
                        str = th.getMessage();
                    } catch (Throwable unused) {
                    }
                }
                fREContext.dispatchStatusEventAsync("extension:error", str);
            }
        } catch (Throwable unused2) {
        }
    }

    public static String[] GetObjectAsArrayOfStrings(FREArray fREArray) {
        try {
            int length = (int) fREArray.getLength();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = fREArray.getObjectAt(i).getAsString();
            }
            return strArr;
        } catch (Exception unused) {
            return new String[0];
        }
    }

    public static int[] GetObjectAsArrayOfNumbers(FREArray fREArray) {
        try {
            int length = (int) fREArray.getLength();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = fREArray.getObjectAt(i).getAsInt();
            }
            return iArr;
        } catch (Exception unused) {
            return new int[0];
        }
    }

    public static double[] GetObjectAsArrayOfDoubles(FREArray fREArray) {
        try {
            int length = (int) fREArray.getLength();
            double[] dArr = new double[length];
            for (int i = 0; i < length; i++) {
                dArr[i] = fREArray.getObjectAt(i).getAsDouble();
            }
            return dArr;
        } catch (Exception unused) {
            return new double[0];
        }
    }

    public static boolean[] GetObjectAsArrayOfBooleans(FREArray fREArray) {
        try {
            int length = (int) fREArray.getLength();
            boolean[] zArr = new boolean[length];
            for (int i = 0; i < length; i++) {
                zArr[i] = fREArray.getObjectAt(i).getAsBool();
            }
            return zArr;
        } catch (Exception unused) {
            return new boolean[0];
        }
    }

    public static void listViews(ViewGroup viewGroup, String str) {
        String str2 = str + viewGroup.getClass().getName() + "/";
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            LogUtil.d("com.distriqt.corelibraries", TAG, "%s%s", str2, childAt.getClass().getName());
            if (ViewGroup.class.isAssignableFrom(childAt.getClass())) {
                listViews((ViewGroup) childAt, str2);
            }
        }
    }

    public static View findViewByClassName(ViewGroup viewGroup, String str) {
        View findViewByClassName;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().equals(str)) {
                return childAt;
            }
            if (ViewGroup.class.isAssignableFrom(childAt.getClass()) && (findViewByClassName = findViewByClassName((ViewGroup) childAt, str)) != null) {
                return findViewByClassName;
            }
        }
        return null;
    }

    @Deprecated
    public static View getAIRWindowSurfaceView() {
        return getAIRWindowSurfaceView(context);
    }

    public static View getAIRWindowSurfaceView(FREContext fREContext) {
        if (fREContext != null) {
            return getAIRWindowSurfaceView(fREContext.getActivity());
        }
        return null;
    }

    public static View getAIRWindowSurfaceView(Activity activity) {
        if (activity != null) {
            return findViewByClassName((ViewGroup) activity.findViewById(16908290), "com.adobe.air.AIRWindowSurfaceView");
        }
        return null;
    }

    @Deprecated
    public static void addViewToAIR(View view, FrameLayout.LayoutParams layoutParams) {
        addViewToAIR(context, view, layoutParams);
    }

    public static void addViewToAIR(FREContext fREContext, View view, FrameLayout.LayoutParams layoutParams) {
        if (fREContext != null) {
            ((ViewGroup) fREContext.getActivity().findViewById(16908290)).addView(view, layoutParams);
        }
    }

    public static void addViewToAIR(IExtensionContext iExtensionContext, View view, FrameLayout.LayoutParams layoutParams) {
        if (iExtensionContext != null) {
            ((ViewGroup) iExtensionContext.getActivity().findViewById(16908290)).addView(view, layoutParams);
        }
    }

    public static void moveToBack(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int indexOfChild = viewGroup.indexOfChild(view);
        for (int i = 0; i < indexOfChild; i++) {
            viewGroup.bringChildToFront(viewGroup.getChildAt(0));
        }
    }

    @Deprecated
    public static int getDeviceDefaultOrientation() {
        return getDeviceDefaultOrientation(context);
    }

    public static int getDeviceDefaultOrientation(FREContext fREContext) {
        if (fREContext != null) {
            Configuration configuration = fREContext.getActivity().getResources().getConfiguration();
            int rotation = ((WindowManager) fREContext.getActivity().getSystemService("window")).getDefaultDisplay().getRotation();
            return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
        }
        return 0;
    }
}
