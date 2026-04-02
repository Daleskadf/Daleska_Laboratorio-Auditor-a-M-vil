package L4;
/* loaded from: classes.dex */
public final class d0 implements I4.H {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2946a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2947b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ I4.G f2948c;

    public /* synthetic */ d0(Object obj, I4.G g3, int i7) {
        this.f2946a = i7;
        this.f2947b = obj;
        this.f2948c = g3;
    }

    @Override // I4.H
    public final I4.G create(I4.n nVar, P4.a aVar) {
        switch (this.f2946a) {
            case 0:
                if (aVar.f4022a == ((Class) this.f2947b)) {
                    return this.f2948c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f4022a;
                if (!((Class) this.f2947b).isAssignableFrom(cls)) {
                    return null;
                }
                return new C0211c(this, cls);
            default:
                if (aVar.equals((P4.a) this.f2947b)) {
                    return this.f2948c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f2946a) {
            case 0:
                return "Factory[type=" + ((Class) this.f2947b).getName() + ",adapter=" + this.f2948c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f2947b).getName() + ",adapter=" + this.f2948c + "]";
            default:
                return super.toString();
        }
    }
}
