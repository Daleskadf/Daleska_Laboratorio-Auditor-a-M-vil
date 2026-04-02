package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1302p1 extends C1297o1 implements A0 {
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1293n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC1340x0.i(this, l8);
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

    @Override // j$.util.stream.A0, j$.util.stream.B0
    public final H0 a() {
        int i7 = this.f13323b;
        long[] jArr = this.f13322a;
        if (i7 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f13323b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        long[] jArr = this.f13322a;
        if (j != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(jArr.length)));
        }
        this.f13323b = 0;
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        int i7 = this.f13323b;
        long[] jArr = this.f13322a;
        if (i7 < jArr.length) {
            this.f13323b = 1 + i7;
            jArr[i7] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void k() {
        int i7 = this.f13323b;
        long[] jArr = this.f13322a;
        if (i7 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f13323b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.C1297o1
    public final String toString() {
        long[] jArr = this.f13322a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f13323b), Arrays.toString(jArr));
    }
}
