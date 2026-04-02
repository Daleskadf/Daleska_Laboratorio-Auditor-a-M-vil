package z0;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import h0.ViewTreeObserver$OnPreDrawListenerC1049i;
/* renamed from: z0.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2065z extends AnimationSet implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f16862a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16863b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16864c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16865d;

    public RunnableC2065z(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.f16865d = true;
        this.f16862a = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f16865d = true;
        if (this.f16863b) {
            return !this.f16864c;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f16863b = true;
            ViewTreeObserver$OnPreDrawListenerC1049i.a(this.f16862a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7 = this.f16863b;
        ViewGroup viewGroup = this.f16862a;
        if (!z7 && this.f16865d) {
            this.f16865d = false;
            viewGroup.post(this);
            return;
        }
        viewGroup.endViewTransition(null);
        this.f16864c = true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f16865d = true;
        if (this.f16863b) {
            return !this.f16864c;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f16863b = true;
            ViewTreeObserver$OnPreDrawListenerC1049i.a(this.f16862a, this);
        }
        return true;
    }
}
