package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class D1 extends AbstractC1340x0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f13031h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f13032i;
    final /* synthetic */ Object j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Object f13033k;

    public /* synthetic */ D1(EnumC1244d3 enumC1244d3, Object obj, Object obj2, Object obj3, int i7) {
        this.f13031h = i7;
        this.j = obj;
        this.f13033k = obj2;
        this.f13032i = obj3;
    }

    @Override // j$.util.stream.AbstractC1340x0
    public final T1 e0() {
        switch (this.f13031h) {
            case 0:
                return new A1((Supplier) this.f13032i, (ObjLongConsumer) this.f13033k, (C1305q) this.j);
            case 1:
                return new G1((Supplier) this.f13032i, (ObjDoubleConsumer) this.f13033k, (C1305q) this.j);
            case 2:
                return new I1(this.f13032i, (BiFunction) this.f13033k, (BinaryOperator) this.j);
            case 3:
                return new M1((Supplier) this.f13032i, (BiConsumer) this.f13033k, (BiConsumer) this.j);
            default:
                return new Q1((Supplier) this.f13032i, (ObjIntConsumer) this.f13033k, (C1305q) this.j);
        }
    }
}
