package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class x2 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1708b = false;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f1709a;

    public x2(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1709a = new WeakReference(context);
    }

    public static boolean a() {
        return f1708b;
    }

    public static boolean b() {
        if (a() && Build.VERSION.SDK_INT <= 20) {
            return true;
        }
        return false;
    }

    public final Drawable c(int i10) {
        return super.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Context context = (Context) this.f1709a.get();
        if (context != null) {
            return e2.h().t(context, this, i10);
        }
        return super.getDrawable(i10);
    }
}
