package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class D2 extends AbstractC1352z2 {

    /* renamed from: c  reason: collision with root package name */
    private R2 f13034c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
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
        this.f13034c = r02;
    }

    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
    public final void k() {
        double[] dArr = (double[]) this.f13034c.d();
        Arrays.sort(dArr);
        InterfaceC1298o2 interfaceC1298o2 = this.f13277a;
        interfaceC1298o2.l(dArr.length);
        int i7 = 0;
        if (!this.f13406b) {
            int length = dArr.length;
            while (i7 < length) {
                interfaceC1298o2.accept(dArr[i7]);
                i7++;
            }
        } else {
            int length2 = dArr.length;
            while (i7 < length2) {
                double d7 = dArr[i7];
                if (interfaceC1298o2.n()) {
                    break;
                }
                interfaceC1298o2.accept(d7);
                i7++;
            }
        }
        interfaceC1298o2.k();
    }

    @Override // j$.util.stream.InterfaceC1283l2, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        this.f13034c.accept(d7);
    }
}
