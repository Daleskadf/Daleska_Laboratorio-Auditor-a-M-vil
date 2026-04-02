package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class O2 extends C2 {

    /* renamed from: d  reason: collision with root package name */
    private Object[] f13121d;

    /* renamed from: e  reason: collision with root package name */
    private int f13122e;

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f13121d = new Object[(int) j];
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public final void k() {
        int i7 = 0;
        Arrays.sort(this.f13121d, 0, this.f13122e, this.f13028b);
        InterfaceC1298o2 interfaceC1298o2 = this.f13295a;
        interfaceC1298o2.l(this.f13122e);
        if (!this.f13029c) {
            while (i7 < this.f13122e) {
                interfaceC1298o2.accept((InterfaceC1298o2) this.f13121d[i7]);
                i7++;
            }
        } else {
            while (i7 < this.f13122e && !interfaceC1298o2.n()) {
                interfaceC1298o2.accept((InterfaceC1298o2) this.f13121d[i7]);
                i7++;
            }
        }
        interfaceC1298o2.k();
        this.f13121d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f13121d;
        int i7 = this.f13122e;
        this.f13122e = i7 + 1;
        objArr[i7] = obj;
    }
}
