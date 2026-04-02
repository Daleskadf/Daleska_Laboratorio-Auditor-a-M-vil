package a6;

import D.AbstractC0055e;
/* renamed from: a6.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481j {

    /* renamed from: a  reason: collision with root package name */
    public final C0476e f7158a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7159b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7160c;

    public C0481j(C0476e c0476e, int i7, boolean z7) {
        G.i.j(c0476e, "callOptions");
        this.f7158a = c0476e;
        this.f7159b = i7;
        this.f7160c = z7;
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f7158a, "callOptions");
        C7.d("previousAttempts", String.valueOf(this.f7159b));
        C7.c("isTransparentRetry", this.f7160c);
        return C7.toString();
    }
}
