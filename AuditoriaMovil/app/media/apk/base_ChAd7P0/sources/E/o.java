package e;

import D.C0054d;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0570w;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.InterfaceC0568u;
import c1.RunnableC0626c;
import com.example.appecoactivate.R;
/* loaded from: classes.dex */
public final class o extends Dialog implements InterfaceC0568u, InterfaceC0919E, Z1.e {

    /* renamed from: a  reason: collision with root package name */
    public C0570w f10563a;

    /* renamed from: b  reason: collision with root package name */
    public final C0054d f10564b;

    /* renamed from: c  reason: collision with root package name */
    public final C0918D f10565c;

    public o(Context context, int i7) {
        super(context, i7);
        this.f10564b = new C0054d((Z1.e) this);
        this.f10565c = new C0918D(new RunnableC0626c(this, 7));
    }

    public static void b(o this$0) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // e.InterfaceC0919E
    public final C0918D a() {
        return this.f10565c;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // Z1.e
    public final K5.s c() {
        return (K5.s) this.f10564b.f690c;
    }

    public final C0570w d() {
        C0570w c0570w = this.f10563a;
        if (c0570w == null) {
            C0570w c0570w2 = new C0570w(this);
            this.f10563a = c0570w2;
            return c0570w2;
        }
        return c0570w;
    }

    public final void e() {
        Window window = getWindow();
        kotlin.jvm.internal.j.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.j.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.j.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.j.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.j.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0568u
    public final C0570w h() {
        return d();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f10565c.b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.j.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0918D c0918d = this.f10565c;
            c0918d.getClass();
            c0918d.f10515e = onBackInvokedDispatcher;
            c0918d.c(c0918d.f10516g);
        }
        this.f10564b.m(bundle);
        d().e(EnumC0562n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.j.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f10564b.n(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        d().e(EnumC0562n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        d().e(EnumC0562n.ON_DESTROY);
        this.f10563a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i7) {
        e();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        kotlin.jvm.internal.j.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
