package D;

import android.util.Size;
/* loaded from: classes.dex */
public final class o0 extends G {

    /* renamed from: X  reason: collision with root package name */
    public final int f757X;

    /* renamed from: d  reason: collision with root package name */
    public final Object f758d;

    /* renamed from: e  reason: collision with root package name */
    public final Y f759e;
    public final int f;

    public o0(b0 b0Var, Size size, Y y2) {
        super(b0Var);
        this.f758d = new Object();
        if (size == null) {
            this.f = this.f615b.getWidth();
            this.f757X = this.f615b.getHeight();
        } else {
            this.f = size.getWidth();
            this.f757X = size.getHeight();
        }
        this.f759e = y2;
    }

    @Override // D.G, D.b0
    public final int getHeight() {
        return this.f757X;
    }

    @Override // D.G, D.b0
    public final int getWidth() {
        return this.f;
    }

    @Override // D.G, D.b0
    public final Y h() {
        return this.f759e;
    }
}
