package h1;

import H0.W;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final W f11315a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f11316b;

    public q(W w2, int[] iArr) {
        if (iArr.length == 0) {
            K0.a.o("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f11315a = w2;
        this.f11316b = iArr;
    }
}
