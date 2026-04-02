package e;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.k implements InterfaceC1959a {

    /* renamed from: a  reason: collision with root package name */
    public static final r f10570a = new kotlin.jvm.internal.k(0);

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new t(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return s.f10571a;
        }
    }
}
