package h0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
/* renamed from: h0.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1057q {

    /* renamed from: a  reason: collision with root package name */
    public int f11206a;

    /* renamed from: b  reason: collision with root package name */
    public int f11207b;

    /* renamed from: c  reason: collision with root package name */
    public int f11208c;

    /* renamed from: d  reason: collision with root package name */
    public Object f11209d;

    /* JADX WARN: Type inference failed for: r0v1, types: [v4.d, java.lang.Object] */
    public AbstractC1057q() {
        if (v4.d.f16064b == null) {
            v4.d.f16064b = new Object();
        }
    }

    public int a(int i7) {
        if (i7 < this.f11208c) {
            return ((ByteBuffer) this.f11209d).getShort(this.f11207b + i7);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, CharSequence charSequence);

    public void d(View view, CharSequence charSequence) {
        Object tag;
        C1042b c1042b;
        if (Build.VERSION.SDK_INT >= this.f11207b) {
            c(view, charSequence);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f11207b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f11206a);
            if (!((Class) this.f11209d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, charSequence)) {
            View.AccessibilityDelegate b5 = AbstractC1066z.b(view);
            if (b5 == null) {
                c1042b = null;
            } else if (b5 instanceof C1041a) {
                c1042b = ((C1041a) b5).f11176a;
            } else {
                c1042b = new C1042b(b5);
            }
            if (c1042b == null) {
                c1042b = new C1042b();
            }
            AbstractC1066z.e(view, c1042b);
            view.setTag(this.f11206a, charSequence);
            AbstractC1066z.c(view, this.f11208c);
        }
    }

    public abstract boolean e(Object obj, CharSequence charSequence);
}
