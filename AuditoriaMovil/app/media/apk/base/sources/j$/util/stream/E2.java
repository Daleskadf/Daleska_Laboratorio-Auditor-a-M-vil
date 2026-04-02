package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class E2 extends A2 {

    /* renamed from: c  reason: collision with root package name */
    private T2 f13040c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.T2] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
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
        this.f13040c = r02;
    }

    @Override // j$.util.stream.AbstractC1268i2, j$.util.stream.InterfaceC1298o2
    public final void k() {
        int[] iArr = (int[]) this.f13040c.d();
        Arrays.sort(iArr);
        InterfaceC1298o2 interfaceC1298o2 = this.f13282a;
        interfaceC1298o2.l(iArr.length);
        int i7 = 0;
        if (!this.f13019b) {
            int length = iArr.length;
            while (i7 < length) {
                interfaceC1298o2.accept(iArr[i7]);
                i7++;
            }
        } else {
            int length2 = iArr.length;
            while (i7 < length2) {
                int i8 = iArr[i7];
                if (interfaceC1298o2.n()) {
                    break;
                }
                interfaceC1298o2.accept(i8);
                i7++;
            }
        }
        interfaceC1298o2.k();
    }

    @Override // j$.util.stream.InterfaceC1288m2, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        this.f13040c.accept(i7);
    }
}
