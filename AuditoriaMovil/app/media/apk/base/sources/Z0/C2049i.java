package z0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import e.C0921b;
import p.C1608t;
/* renamed from: z0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2049i extends X {

    /* renamed from: b  reason: collision with root package name */
    public final C2047g f16772b;

    /* renamed from: c  reason: collision with root package name */
    public AnimatorSet f16773c;

    public C2049i(C2047g c2047g) {
        this.f16772b = c2047g;
    }

    @Override // z0.X
    public final void a(ViewGroup container) {
        kotlin.jvm.internal.j.e(container, "container");
        AnimatorSet animatorSet = this.f16773c;
        animatorSet.getClass();
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // z0.X
    public final void b(C0921b backEvent, ViewGroup container) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        kotlin.jvm.internal.j.e(container, "container");
        this.f16773c.getClass();
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        throw null;
    }

    @Override // z0.X
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.j.e(container, "container");
        C2047g c2047g = this.f16772b;
        if (c2047g.B()) {
            return;
        }
        Context context = container.getContext();
        kotlin.jvm.internal.j.d(context, "context");
        C1608t i02 = c2047g.i0(context);
        AnimatorSet animatorSet = null;
        if (i02 != null) {
            animatorSet = (AnimatorSet) i02.f14881c;
        }
        this.f16773c = animatorSet;
        throw null;
    }
}
