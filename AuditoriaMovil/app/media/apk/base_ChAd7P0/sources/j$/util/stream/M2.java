package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class M2 extends A2 {

    /* renamed from: c  reason: collision with root package name */
    private int[] f13103c;

    /* renamed from: d  reason: collision with root package name */
    private int f13104d;

    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f13103c = new int[(int) j];
    }

    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
    public final void k() {
        int i7 = 0;
        Arrays.sort(this.f13103c, 0, this.f13104d);
        InterfaceC1298o2 interfaceC1298o2 = this.f13282a;
        interfaceC1298o2.l(this.f13104d);
        if (!this.f13019b) {
            while (i7 < this.f13104d) {
                interfaceC1298o2.accept(this.f13103c[i7]);
                i7++;
            }
        } else {
            while (i7 < this.f13104d && !interfaceC1298o2.n()) {
                interfaceC1298o2.accept(this.f13103c[i7]);
                i7++;
            }
        }
        interfaceC1298o2.k();
        this.f13103c = null;
    }

    @Override // j$.util.stream.InterfaceC1288m2, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        int[] iArr = this.f13103c;
        int i8 = this.f13104d;
        this.f13104d = i8 + 1;
        iArr[i8] = i7;
    }
}
