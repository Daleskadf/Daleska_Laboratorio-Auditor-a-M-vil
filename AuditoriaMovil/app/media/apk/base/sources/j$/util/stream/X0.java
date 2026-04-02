package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class X0 extends W0 implements InterfaceC1345y0 {
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1283l2
    public final /* synthetic */ void p(Double d7) {
        AbstractC1340x0.e(this, d7);
    }

    @Override // j$.util.stream.B0
    public final /* bridge */ /* synthetic */ J0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC1345y0, j$.util.stream.B0
    public final D0 a() {
        int i7 = this.f13173b;
        double[] dArr = this.f13172a;
        if (i7 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f13173b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        double[] dArr = this.f13172a;
        if (j != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(dArr.length)));
        }
        this.f13173b = 0;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        int i7 = this.f13173b;
        double[] dArr = this.f13172a;
        if (i7 < dArr.length) {
            this.f13173b = 1 + i7;
            dArr[i7] = d7;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void k() {
        int i7 = this.f13173b;
        double[] dArr = this.f13172a;
        if (i7 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f13173b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.W0
    public final String toString() {
        double[] dArr = this.f13172a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f13173b), Arrays.toString(dArr));
    }
}
