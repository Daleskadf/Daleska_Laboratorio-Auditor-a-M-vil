package I4;
/* loaded from: classes.dex */
public final class j extends G {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2205a;

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        switch (this.f2205a) {
            case 0:
                if (aVar.D() == Q4.b.NULL) {
                    aVar.z();
                    return null;
                }
                return Double.valueOf(aVar.u());
            case 1:
                if (aVar.D() == Q4.b.NULL) {
                    aVar.z();
                    return null;
                }
                return Float.valueOf((float) aVar.u());
            default:
                aVar.K();
                return null;
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        switch (this.f2205a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    cVar.o();
                    return;
                }
                double doubleValue = number.doubleValue();
                n.a(doubleValue);
                cVar.t(doubleValue);
                return;
            case 1:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    cVar.o();
                    return;
                }
                float floatValue = number2.floatValue();
                n.a(floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                cVar.w(number2);
                return;
            default:
                cVar.o();
                return;
        }
    }

    public String toString() {
        switch (this.f2205a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
