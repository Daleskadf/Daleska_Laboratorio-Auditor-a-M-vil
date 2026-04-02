package Q0;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class O extends I0.e {

    /* renamed from: i  reason: collision with root package name */
    public static final int f4260i = Float.floatToIntBits(Float.NaN);

    public static void l(int i7, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i7 * 4.656612875245797E-10d));
        if (floatToIntBits == f4260i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // I0.d
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer k2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i8 = this.f2133b.f2130c;
        if (i8 != 21) {
            if (i8 != 22) {
                if (i8 != 1342177280) {
                    if (i8 == 1610612736) {
                        k2 = k(i7);
                        while (position < limit) {
                            l((byteBuffer.get(position + 3) & ForkServer.ERROR) | ((byteBuffer.get(position + 2) & ForkServer.ERROR) << 8) | ((byteBuffer.get(position + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(position) & ForkServer.ERROR) << 24), k2);
                            position += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    k2 = k((i7 / 3) * 4);
                    while (position < limit) {
                        l(((byteBuffer.get(position + 2) & ForkServer.ERROR) << 8) | ((byteBuffer.get(position + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(position) & ForkServer.ERROR) << 24), k2);
                        position += 3;
                    }
                }
            } else {
                k2 = k(i7);
                while (position < limit) {
                    l((byteBuffer.get(position) & ForkServer.ERROR) | ((byteBuffer.get(position + 1) & ForkServer.ERROR) << 8) | ((byteBuffer.get(position + 2) & ForkServer.ERROR) << 16) | ((byteBuffer.get(position + 3) & ForkServer.ERROR) << 24), k2);
                    position += 4;
                }
            }
        } else {
            k2 = k((i7 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position) & ForkServer.ERROR) << 8) | ((byteBuffer.get(position + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(position + 2) & ForkServer.ERROR) << 24), k2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        k2.flip();
    }

    @Override // I0.e
    public final I0.b g(I0.b bVar) {
        int i7 = bVar.f2130c;
        if (i7 != 21 && i7 != 1342177280 && i7 != 22 && i7 != 1610612736 && i7 != 4) {
            throw new I0.c(bVar);
        }
        if (i7 != 4) {
            return new I0.b(bVar.f2128a, bVar.f2129b, 4);
        }
        return I0.b.f2127e;
    }
}
