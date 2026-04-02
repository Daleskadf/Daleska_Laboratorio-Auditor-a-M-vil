package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1247e1 extends M0 implements B0 {
    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void accept(double d7) {
        AbstractC1340x0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void accept(int i7) {
        AbstractC1340x0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC1340x0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.B0
    public final J0 a() {
        int i7 = this.f13099b;
        Object[] objArr = this.f13098a;
        if (i7 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f13099b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        Object[] objArr = this.f13098a;
        if (j != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
        }
        this.f13099b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i7 = this.f13099b;
        Object[] objArr = this.f13098a;
        if (i7 < objArr.length) {
            this.f13099b = 1 + i7;
            objArr[i7] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void k() {
        int i7 = this.f13099b;
        Object[] objArr = this.f13098a;
        if (i7 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f13099b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.M0
    public final String toString() {
        Object[] objArr = this.f13098a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f13099b), Arrays.toString(objArr));
    }
}
