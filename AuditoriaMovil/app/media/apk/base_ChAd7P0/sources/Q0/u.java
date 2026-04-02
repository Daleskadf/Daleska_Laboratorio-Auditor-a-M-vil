package Q0;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class u extends I0.e {

    /* renamed from: i  reason: collision with root package name */
    public int[] f4349i;
    public int[] j;

    @Override // I0.d
    public final void e(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k2 = k(((limit - position) / this.f2133b.f2131d) * this.f2134c.f2131d);
        while (position < limit) {
            for (int i7 : iArr) {
                k2.putShort(byteBuffer.getShort((i7 * 2) + position));
            }
            position += this.f2133b.f2131d;
        }
        byteBuffer.position(limit);
        k2.flip();
    }

    @Override // I0.e
    public final I0.b g(I0.b bVar) {
        boolean z7;
        boolean z8;
        int[] iArr = this.f4349i;
        if (iArr == null) {
            return I0.b.f2127e;
        }
        if (bVar.f2130c == 2) {
            int length = iArr.length;
            int i7 = bVar.f2129b;
            if (i7 != length) {
                z7 = true;
            } else {
                z7 = false;
            }
            for (int i8 = 0; i8 < iArr.length; i8++) {
                int i9 = iArr[i8];
                if (i9 < i7) {
                    if (i9 != i8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z7 |= z8;
                } else {
                    throw new I0.c(bVar);
                }
            }
            if (z7) {
                return new I0.b(bVar.f2128a, iArr.length, 2);
            }
            return I0.b.f2127e;
        }
        throw new I0.c(bVar);
    }

    @Override // I0.e
    public final void h() {
        this.j = this.f4349i;
    }

    @Override // I0.e
    public final void j() {
        this.j = null;
        this.f4349i = null;
    }
}
