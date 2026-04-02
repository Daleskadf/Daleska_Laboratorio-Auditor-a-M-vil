package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1257g1 extends C1252f1 implements InterfaceC1350z0 {
    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void accept(double d7) {
        AbstractC1340x0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC1340x0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1288m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC1340x0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.B0
    public final /* bridge */ /* synthetic */ J0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC1350z0, j$.util.stream.B0
    public final F0 a() {
        int i7 = this.f13268b;
        int[] iArr = this.f13267a;
        if (i7 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f13268b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        int[] iArr = this.f13267a;
        if (j != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
        }
        this.f13268b = 0;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        int i8 = this.f13268b;
        int[] iArr = this.f13267a;
        if (i8 < iArr.length) {
            this.f13268b = 1 + i8;
            iArr[i8] = i7;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void k() {
        int i7 = this.f13268b;
        int[] iArr = this.f13267a;
        if (i7 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f13268b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.C1252f1
    public final String toString() {
        int[] iArr = this.f13267a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f13268b), Arrays.toString(iArr));
    }
}
