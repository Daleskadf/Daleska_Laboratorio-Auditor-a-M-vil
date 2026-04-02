package L4;
/* loaded from: classes.dex */
public final class f0 implements I4.H {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f2949a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f2950b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ I4.G f2951c;

    public f0(Class cls, Class cls2, I4.G g3) {
        this.f2949a = cls;
        this.f2950b = cls2;
        this.f2951c = g3;
    }

    @Override // I4.H
    public final I4.G create(I4.n nVar, P4.a aVar) {
        Class cls = aVar.f4022a;
        if (cls != this.f2949a && cls != this.f2950b) {
            return null;
        }
        return this.f2951c;
    }

    public final String toString() {
        return "Factory[type=" + this.f2950b.getName() + "+" + this.f2949a.getName() + ",adapter=" + this.f2951c + "]";
    }
}
