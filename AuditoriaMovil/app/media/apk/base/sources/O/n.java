package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.example.appecoactivate.R;
import h0.AbstractC1066z;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14487a;

    /* renamed from: b  reason: collision with root package name */
    public final MenuC1545i f14488b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14489c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14490d;

    /* renamed from: e  reason: collision with root package name */
    public View f14491e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14492g;

    /* renamed from: h  reason: collision with root package name */
    public o f14493h;

    /* renamed from: i  reason: collision with root package name */
    public k f14494i;
    public l j;
    public int f = 8388611;

    /* renamed from: k  reason: collision with root package name */
    public final l f14495k = new l(this);

    public n(int i7, Context context, View view, MenuC1545i menuC1545i, boolean z7) {
        this.f14487a = context;
        this.f14488b = menuC1545i;
        this.f14491e = view;
        this.f14489c = z7;
        this.f14490d = i7;
    }

    public final k a() {
        k sVar;
        if (this.f14494i == null) {
            Context context = this.f14487a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            m.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new View$OnKeyListenerC1542f(context, this.f14491e, this.f14490d, this.f14489c);
            } else {
                View view = this.f14491e;
                Context context2 = this.f14487a;
                boolean z7 = this.f14489c;
                sVar = new s(this.f14490d, context2, view, this.f14488b, z7);
            }
            sVar.l(this.f14488b);
            sVar.r(this.f14495k);
            sVar.n(this.f14491e);
            sVar.f(this.f14493h);
            sVar.o(this.f14492g);
            sVar.p(this.f);
            this.f14494i = sVar;
        }
        return this.f14494i;
    }

    public final boolean b() {
        k kVar = this.f14494i;
        if (kVar != null && kVar.i()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f14494i = null;
        l lVar = this.j;
        if (lVar != null) {
            lVar.onDismiss();
        }
    }

    public final void d(int i7, int i8, boolean z7, boolean z8) {
        k a7 = a();
        a7.s(z8);
        if (z7) {
            int i9 = this.f;
            View view = this.f14491e;
            Field field = AbstractC1066z.f11214a;
            if ((Gravity.getAbsoluteGravity(i9, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f14491e.getWidth();
            }
            a7.q(i7);
            a7.t(i8);
            int i10 = (int) ((this.f14487a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a7.f14485a = new Rect(i7 - i10, i8 - i10, i7 + i10, i8 + i10);
        }
        a7.b();
    }
}
