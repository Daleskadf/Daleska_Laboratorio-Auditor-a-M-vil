package e;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class t extends q {

    /* renamed from: a  reason: collision with root package name */
    public final Field f10572a;

    /* renamed from: b  reason: collision with root package name */
    public final Field f10573b;

    /* renamed from: c  reason: collision with root package name */
    public final Field f10574c;

    public t(Field field, Field field2, Field field3) {
        this.f10572a = field;
        this.f10573b = field2;
        this.f10574c = field3;
    }

    @Override // e.q
    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.f10574c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // e.q
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f10572a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // e.q
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f10573b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
