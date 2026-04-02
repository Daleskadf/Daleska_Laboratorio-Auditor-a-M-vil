package j$.util.function;

import java.util.function.Function;
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12956a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function f12957b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function f12958c;

    public /* synthetic */ c(Function function, Function function2, int i7) {
        this.f12956a = i7;
        this.f12957b = function;
        this.f12958c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f12956a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f12956a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f12956a) {
            case 0:
                return this.f12958c.apply(this.f12957b.apply(obj));
            default:
                return this.f12957b.apply(this.f12958c.apply(obj));
        }
    }
}
