package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class L2 extends AbstractC1352z2 {

    /* renamed from: c  reason: collision with root package name */
    private double[] f13094c;

    /* renamed from: d  reason: collision with root package name */
    private int f13095d;

    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f13094c = new double[(int) j];
    }

    @Override // j$.util.stream.AbstractC1263h2, j$.util.stream.InterfaceC1298o2
    public final void k() {
        int i7 = 0;
        Arrays.sort(this.f13094c, 0, this.f13095d);
        InterfaceC1298o2 interfaceC1298o2 = this.f13277a;
        interfaceC1298o2.l(this.f13095d);
        if (!this.f13406b) {
            while (i7 < this.f13095d) {
                interfaceC1298o2.accept(this.f13094c[i7]);
                i7++;
            }
        } else {
            while (i7 < this.f13095d && !interfaceC1298o2.n()) {
                interfaceC1298o2.accept(this.f13094c[i7]);
                i7++;
            }
        }
        interfaceC1298o2.k();
        this.f13094c = null;
    }

    @Override // j$.util.stream.InterfaceC1283l2, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        double[] dArr = this.f13094c;
        int i7 = this.f13095d;
        this.f13095d = i7 + 1;
        dArr[i7] = d7;
    }
}
