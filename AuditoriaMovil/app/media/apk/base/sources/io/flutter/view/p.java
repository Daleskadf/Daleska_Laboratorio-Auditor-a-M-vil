package io.flutter.view;

import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Method f12520a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f12521b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f12522c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f12523d;

    /* renamed from: e  reason: collision with root package name */
    public final Field f12524e;
    public final Method f;

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Field field;
        Method method5;
        Method method6 = null;
        try {
            method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused) {
            Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused2) {
            Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        if (Build.VERSION.SDK_INT <= 26) {
            try {
                method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", null);
            } catch (NoSuchMethodException unused3) {
                Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
                method5 = null;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                method4 = null;
            } catch (NoSuchMethodException unused4) {
                Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
                method3 = null;
                method4 = null;
            }
            field = method4;
            method6 = method5;
        } else {
            try {
                Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                declaredField.setAccessible(true);
                method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                method3 = null;
                field = declaredField;
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused5) {
                Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method3 = null;
                method4 = null;
                field = null;
            }
        }
        this.f12520a = method;
        this.f12521b = method6;
        this.f12522c = method2;
        this.f12523d = method3;
        this.f12524e = field;
        this.f = method4;
    }

    public static Long a(p pVar, AccessibilityRecord accessibilityRecord) {
        Method method = pVar.f12522c;
        if (method == null) {
            return null;
        }
        try {
            return (Long) method.invoke(accessibilityRecord, null);
        } catch (IllegalAccessException e7) {
            Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e7);
            return null;
        } catch (InvocationTargetException e8) {
            Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e8);
            return null;
        }
    }

    public static boolean b(int i7, long j) {
        if ((j & (1 << i7)) != 0) {
            return true;
        }
        return false;
    }
}
