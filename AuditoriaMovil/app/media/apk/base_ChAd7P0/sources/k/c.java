package k;

import G.i;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import l.AbstractC1409a;
/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: b  reason: collision with root package name */
    public final ObjectAnimator f13513b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13514c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [k.d, android.animation.TimeInterpolator, java.lang.Object] */
    public c(AnimationDrawable animationDrawable, boolean z7, boolean z8) {
        int i7;
        int i8;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i9 = z7 ? numberOfFrames - 1 : 0;
        if (z7) {
            i7 = 0;
        } else {
            i7 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f13516b = numberOfFrames2;
        int[] iArr = obj.f13515a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f13515a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f13515a;
        int i10 = 0;
        for (int i11 = 0; i11 < numberOfFrames2; i11++) {
            if (z7) {
                i8 = (numberOfFrames2 - i11) - 1;
            } else {
                i8 = i11;
            }
            int duration = animationDrawable.getDuration(i8);
            iArr2[i11] = duration;
            i10 += duration;
        }
        obj.f13517c = i10;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i9, i7);
        AbstractC1409a.a(ofInt, true);
        ofInt.setDuration(obj.f13517c);
        ofInt.setInterpolator(obj);
        this.f13514c = z8;
        this.f13513b = ofInt;
    }

    @Override // G.i
    public final void E() {
        this.f13513b.reverse();
    }

    @Override // G.i
    public final void G() {
        this.f13513b.start();
    }

    @Override // G.i
    public final void H() {
        this.f13513b.cancel();
    }

    @Override // G.i
    public final boolean c() {
        return this.f13514c;
    }
}
