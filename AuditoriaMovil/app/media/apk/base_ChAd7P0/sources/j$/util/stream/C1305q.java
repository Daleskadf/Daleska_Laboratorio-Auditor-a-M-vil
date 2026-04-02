package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
/* renamed from: j$.util.stream.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1305q implements BinaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13332a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BiConsumer f13333b;

    public /* synthetic */ C1305q(BiConsumer biConsumer, int i7) {
        this.f13332a = i7;
        this.f13333b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f13332a) {
            case 0:
                return j$.com.android.tools.r8.a.b(this, function);
            case 1:
                return j$.com.android.tools.r8.a.b(this, function);
            default:
                return j$.com.android.tools.r8.a.b(this, function);
        }
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f13332a) {
            case 0:
                this.f13333b.accept(obj, obj2);
                return obj;
            case 1:
                this.f13333b.accept(obj, obj2);
                return obj;
            default:
                this.f13333b.accept(obj, obj2);
                return obj;
        }
    }
}
