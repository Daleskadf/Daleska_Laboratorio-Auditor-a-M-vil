package p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f14707a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f14708b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f14709c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f14710d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f14707a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f14708b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f14709c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f14710d = true;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
        }
    }
}
