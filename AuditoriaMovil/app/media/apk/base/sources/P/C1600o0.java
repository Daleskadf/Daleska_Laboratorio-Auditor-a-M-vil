package p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import d2.C0891e;
/* renamed from: p.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1600o0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14857a;

    public /* synthetic */ C1600o0(int i7) {
        this.f14857a = i7;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f14857a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C1600o0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    l.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e7) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e7);
                    return null;
                }
            case 1:
                try {
                    return k.e.c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e8) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e8);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C0891e c0891e = new C0891e(context);
                    c0891e.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return c0891e;
                } catch (Exception e9) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e9);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    d2.q qVar = new d2.q();
                    qVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return qVar;
                } catch (Exception e10) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                    return null;
                }
        }
    }
}
