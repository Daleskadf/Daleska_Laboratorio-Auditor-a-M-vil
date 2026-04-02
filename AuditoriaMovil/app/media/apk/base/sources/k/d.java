package k;

import android.animation.TimeInterpolator;
/* loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public int[] f13515a;

    /* renamed from: b  reason: collision with root package name */
    public int f13516b;

    /* renamed from: c  reason: collision with root package name */
    public int f13517c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f4;
        int i7 = (int) ((f * this.f13517c) + 0.5f);
        int i8 = this.f13516b;
        int[] iArr = this.f13515a;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = iArr[i9];
            if (i7 < i10) {
                break;
            }
            i7 -= i10;
            i9++;
        }
        if (i9 < i8) {
            f4 = i7 / this.f13517c;
        } else {
            f4 = 0.0f;
        }
        return (i9 / i8) + f4;
    }
}
