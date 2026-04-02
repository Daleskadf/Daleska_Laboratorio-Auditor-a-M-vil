package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.j3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1274j3 extends AbstractC1279k3 implements Consumer {

    /* renamed from: b  reason: collision with root package name */
    final Object[] f13288b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1274j3(int i7) {
        this.f13288b = new Object[i7];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i7 = this.f13296a;
        this.f13296a = i7 + 1;
        this.f13288b[i7] = obj;
    }
}
