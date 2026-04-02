package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
/* renamed from: j$.util.stream.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1296o0 implements Supplier, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13319a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13320b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13321c;

    public /* synthetic */ C1296o0(int i7, Object obj, Object obj2) {
        this.f13319a = i7;
        this.f13320b = obj;
        this.f13321c = obj2;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f13319a) {
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C1301p0((EnumC1325u0) this.f13320b, (Predicate) this.f13321c);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f13319a) {
            case 1:
                ((C1284l3) this.f13320b).b((Consumer) this.f13321c, obj);
                return;
            case 2:
                if (obj == null) {
                    ((AtomicBoolean) this.f13320b).set(true);
                    return;
                }
                ((ConcurrentHashMap) this.f13321c).putIfAbsent(obj, Boolean.TRUE);
                return;
            default:
                ((BiConsumer) this.f13320b).accept(this.f13321c, obj);
                return;
        }
    }
}
