package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class F2 extends B2 {

    /* renamed from: c  reason: collision with root package name */
    private V2 f13051c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        ?? r02;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r02 = new X2();
        } else {
            r02 = new X2((int) j);
        }
        this.f13051c = r02;
    }

    @Override // j$.util.stream.AbstractC1273j2, j$.util.stream.InterfaceC1298o2
    public final void k() {
        long[] jArr = (long[]) this.f13051c.d();
        Arrays.sort(jArr);
        InterfaceC1298o2 interfaceC1298o2 = this.f13287a;
        interfaceC1298o2.l(jArr.length);
        int i7 = 0;
        if (!this.f13022b) {
            int length = jArr.length;
            while (i7 < length) {
                interfaceC1298o2.accept(jArr[i7]);
                i7++;
            }
        } else {
            int length2 = jArr.length;
            while (i7 < length2) {
                long j = jArr[i7];
                if (interfaceC1298o2.n()) {
                    break;
                }
                interfaceC1298o2.accept(j);
                i7++;
            }
        }
        interfaceC1298o2.k();
    }

    @Override // j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.f13051c.accept(j);
    }
}
