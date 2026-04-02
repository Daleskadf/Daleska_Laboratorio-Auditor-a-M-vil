package a6;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s0 f7193a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H2.a f7194b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7195c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u0 f7196d;

    public r0(u0 u0Var, s0 s0Var, H2.a aVar, long j) {
        this.f7196d = u0Var;
        this.f7193a = s0Var;
        this.f7194b = aVar;
        this.f7195c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7196d.execute(this.f7193a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7194b.toString());
        sb.append("(scheduled in SynchronizationContext with delay of ");
        return AbstractC0059i.C(sb, this.f7195c, ")");
    }
}
