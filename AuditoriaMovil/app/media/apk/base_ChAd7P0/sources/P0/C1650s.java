package p0;
/* renamed from: p0.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1650s extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public C1635c f15048a;

    /* renamed from: b  reason: collision with root package name */
    public int f15049b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f15050c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ N f15051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1650s(N n7, n6.d dVar) {
        super(2, dVar);
        this.f15051d = n7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C1650s c1650s = new C1650s(this.f15051d, dVar);
        c1650s.f15050c = obj;
        return c1650s;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1650s) create((I6.e) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    @Override // p6.AbstractC1698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1650s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
