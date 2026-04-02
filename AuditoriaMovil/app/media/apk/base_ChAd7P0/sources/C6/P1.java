package c6;
/* loaded from: classes.dex */
public final class P1 implements R1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.protobuf.J f8562a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ N0 f8563b;

    public P1(N0 n02, com.google.protobuf.J j) {
        this.f8563b = n02;
        this.f8562a = j;
    }

    @Override // c6.R1
    public final void a(Y1 y12) {
        y12.f8657a.g(this.f8563b.f8522a.g(this.f8562a));
        y12.f8657a.flush();
    }
}
