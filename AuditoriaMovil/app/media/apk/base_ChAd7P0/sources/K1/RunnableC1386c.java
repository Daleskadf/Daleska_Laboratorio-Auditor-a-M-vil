package k1;

import H0.e0;
/* renamed from: k1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1386c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13571a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f13572b;

    public /* synthetic */ RunnableC1386c(C1387d c1387d, u uVar, int i7) {
        this.f13571a = i7;
        this.f13572b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13571a) {
            case 0:
                this.f13572b.getClass();
                return;
            case 1:
                this.f13572b.m();
                return;
            default:
                this.f13572b.h();
                return;
        }
    }

    public /* synthetic */ RunnableC1386c(C1387d c1387d, u uVar, e0 e0Var) {
        this.f13571a = 0;
        this.f13572b = uVar;
    }
}
