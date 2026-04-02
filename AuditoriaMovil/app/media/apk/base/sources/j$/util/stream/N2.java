package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class N2 extends B2 {

    /* renamed from: c  reason: collision with root package name */
    private long[] f13111c;

    /* renamed from: d  reason: collision with root package name */
    private int f13112d;

    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f13111c = new long[(int) j];
    }

    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public final void k() {
        int i7 = 0;
        Arrays.sort(this.f13111c, 0, this.f13112d);
        InterfaceC1298o2 interfaceC1298o2 = this.f13287a;
        interfaceC1298o2.l(this.f13112d);
        if (!this.f13022b) {
            while (i7 < this.f13112d) {
                interfaceC1298o2.accept(this.f13111c[i7]);
                i7++;
            }
        } else {
            while (i7 < this.f13112d && !interfaceC1298o2.n()) {
                interfaceC1298o2.accept(this.f13111c[i7]);
                i7++;
            }
        }
        interfaceC1298o2.k();
        this.f13111c = null;
    }

    @Override // j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        long[] jArr = this.f13111c;
        int i7 = this.f13112d;
        this.f13112d = i7 + 1;
        jArr[i7] = j;
    }
}
