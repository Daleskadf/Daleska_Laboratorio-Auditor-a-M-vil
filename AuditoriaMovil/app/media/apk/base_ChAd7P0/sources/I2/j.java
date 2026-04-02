package i2;
/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11465a;

    /* renamed from: b  reason: collision with root package name */
    public final k f11466b;

    /* renamed from: c  reason: collision with root package name */
    public final C1101a f11467c;

    public j(Object value, k kVar, C1101a c1101a) {
        kotlin.jvm.internal.j.e(value, "value");
        this.f11465a = value;
        this.f11466b = kVar;
        this.f11467c = c1101a;
    }

    @Override // i2.i
    public final Object a() {
        return this.f11465a;
    }

    @Override // i2.i
    public final i d(String str, w6.l lVar) {
        Object obj = this.f11465a;
        if (((Boolean) lVar.invoke(obj)).booleanValue()) {
            return this;
        }
        return new C1108h(obj, str, this.f11467c, this.f11466b);
    }
}
