package e1;
/* renamed from: e1.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0932B implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10615a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ T0.d f10616b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10617c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f10618d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b1.g f10619e;

    public /* synthetic */ RunnableC0932B(T0.d dVar, InterfaceC0934D interfaceC0934D, r rVar, b1.g gVar, int i7) {
        this.f10615a = i7;
        this.f10616b = dVar;
        this.f10617c = interfaceC0934D;
        this.f10618d = rVar;
        this.f10619e = gVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, e1.D] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, e1.D] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, e1.D] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10615a) {
            case 0:
                T0.d dVar = this.f10616b;
                int i7 = dVar.f5287a;
                this.f10617c.d(i7, dVar.f5288b, this.f10618d, this.f10619e);
                return;
            case 1:
                T0.d dVar2 = this.f10616b;
                int i8 = dVar2.f5287a;
                this.f10617c.e(i8, dVar2.f5288b, this.f10618d, this.f10619e);
                return;
            default:
                T0.d dVar3 = this.f10616b;
                int i9 = dVar3.f5287a;
                this.f10617c.o(i9, dVar3.f5288b, this.f10618d, this.f10619e);
                return;
        }
    }
}
