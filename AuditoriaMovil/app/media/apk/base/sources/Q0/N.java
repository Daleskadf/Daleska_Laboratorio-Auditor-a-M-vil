package Q0;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class N extends I0.e {

    /* renamed from: n  reason: collision with root package name */
    public int f4251n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4252o;

    /* renamed from: p  reason: collision with root package name */
    public int f4253p;

    /* renamed from: q  reason: collision with root package name */
    public long f4254q;

    /* renamed from: s  reason: collision with root package name */
    public byte[] f4256s;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f4259v;

    /* renamed from: r  reason: collision with root package name */
    public int f4255r = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f4257t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f4258u = 0;

    /* renamed from: l  reason: collision with root package name */
    public final long f4249l = PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH;

    /* renamed from: i  reason: collision with root package name */
    public final float f4247i = 0.2f;

    /* renamed from: m  reason: collision with root package name */
    public final long f4250m = 2000000;

    /* renamed from: k  reason: collision with root package name */
    public final int f4248k = 10;
    public final short j = 1024;

    public N() {
        byte[] bArr = K0.x.f;
        this.f4256s = bArr;
        this.f4259v = bArr;
    }

    @Override // I0.d
    public final void e(ByteBuffer byteBuffer) {
        boolean z7;
        int limit;
        boolean z8;
        boolean z9;
        int position;
        while (byteBuffer.hasRemaining() && !this.f2137g.hasRemaining()) {
            int i7 = this.f4253p;
            short s7 = this.j;
            boolean z10 = true;
            if (i7 != 0) {
                if (i7 == 1) {
                    if (this.f4257t < this.f4256s.length) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    K0.a.j(z7);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & ForkServer.ERROR)) > s7) {
                                int i8 = this.f4251n;
                                limit = (position2 / i8) * i8;
                                break;
                            }
                            position2 += 2;
                        } else {
                            limit = byteBuffer.limit();
                            break;
                        }
                    }
                    int position3 = limit - byteBuffer.position();
                    int i9 = this.f4257t;
                    int i10 = this.f4258u;
                    int i11 = i9 + i10;
                    byte[] bArr = this.f4256s;
                    if (i11 < bArr.length) {
                        i9 = bArr.length;
                    } else {
                        i11 = i10 - (bArr.length - i9);
                    }
                    int i12 = i9 - i11;
                    if (limit < limit2) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int min = Math.min(position3, i12);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f4256s, i11, min);
                    int i13 = this.f4258u + min;
                    this.f4258u = i13;
                    if (i13 <= this.f4256s.length) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    K0.a.j(z9);
                    if (!z8 || position3 >= i12) {
                        z10 = false;
                    }
                    m(z10);
                    if (z10) {
                        this.f4253p = 0;
                        this.f4255r = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f4256s.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & ForkServer.ERROR)) > s7) {
                            int i14 = this.f4251n;
                            position = ((limit4 / i14) * i14) + i14;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f4253p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // I0.e
    public final I0.b g(I0.b bVar) {
        if (bVar.f2130c == 2) {
            if (bVar.f2128a == -1) {
                return I0.b.f2127e;
            }
            return bVar;
        }
        throw new I0.c(bVar);
    }

    @Override // I0.e
    public final void h() {
        if (isActive()) {
            I0.b bVar = this.f2133b;
            int i7 = bVar.f2129b * 2;
            this.f4251n = i7;
            int i8 = ((((int) ((this.f4249l * bVar.f2128a) / 1000000)) / 2) / i7) * i7 * 2;
            if (this.f4256s.length != i8) {
                this.f4256s = new byte[i8];
                this.f4259v = new byte[i8];
            }
        }
        this.f4253p = 0;
        this.f4254q = 0L;
        this.f4255r = 0;
        this.f4257t = 0;
        this.f4258u = 0;
    }

    @Override // I0.e
    public final void i() {
        if (this.f4258u > 0) {
            m(true);
            this.f4255r = 0;
        }
    }

    @Override // I0.e, I0.d
    public final boolean isActive() {
        if (super.isActive() && this.f4252o) {
            return true;
        }
        return false;
    }

    @Override // I0.e
    public final void j() {
        this.f4252o = false;
        byte[] bArr = K0.x.f;
        this.f4256s = bArr;
        this.f4259v = bArr;
    }

    public final int l(int i7) {
        boolean z7;
        int length = ((((int) ((this.f4250m * this.f2133b.f2128a) / 1000000)) - this.f4255r) * this.f4251n) - (this.f4256s.length / 2);
        if (length >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        int i8 = this.f4251n;
        return (((int) Math.min((i7 * this.f4247i) + 0.5f, length)) / i8) * i8;
    }

    public final void m(boolean z7) {
        int length;
        int l8;
        boolean z8;
        int i7;
        boolean z9;
        int i8 = this.f4258u;
        byte[] bArr = this.f4256s;
        if (i8 == bArr.length || z7) {
            boolean z10 = false;
            if (this.f4255r == 0) {
                if (z7) {
                    n(i8, 3);
                    length = i8;
                } else {
                    if (i8 >= bArr.length / 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    K0.a.j(z9);
                    length = this.f4256s.length / 2;
                    n(length, 0);
                }
                l8 = length;
            } else if (z7) {
                int length2 = i8 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int l9 = l(length2) + (this.f4256s.length / 2);
                n(l9, 2);
                l8 = l9;
                length = length3;
            } else {
                length = i8 - (bArr.length / 2);
                l8 = l(length);
                n(l8, 1);
            }
            if (length % this.f4251n == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            K0.a.i("bytesConsumed is not aligned to frame size: %s" + length, z8);
            if (i8 >= l8) {
                z10 = true;
            }
            K0.a.j(z10);
            this.f4258u -= length;
            int i9 = this.f4257t + length;
            this.f4257t = i9;
            this.f4257t = i9 % this.f4256s.length;
            this.f4255r = (l8 / this.f4251n) + this.f4255r;
            this.f4254q += (length - l8) / i7;
        }
    }

    public final void n(int i7, int i8) {
        boolean z7;
        boolean z8;
        boolean z9;
        if (i7 == 0) {
            return;
        }
        boolean z10 = true;
        if (this.f4258u >= i7) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        if (i8 == 2) {
            int i9 = this.f4257t;
            int i10 = this.f4258u;
            int i11 = i9 + i10;
            byte[] bArr = this.f4256s;
            if (i11 <= bArr.length) {
                System.arraycopy(bArr, i11 - i7, this.f4259v, 0, i7);
            } else {
                int length = i10 - (bArr.length - i9);
                if (length >= i7) {
                    System.arraycopy(bArr, length - i7, this.f4259v, 0, i7);
                } else {
                    int i12 = i7 - length;
                    System.arraycopy(bArr, bArr.length - i12, this.f4259v, 0, i12);
                    System.arraycopy(this.f4256s, 0, this.f4259v, i12, length);
                }
            }
        } else {
            int i13 = this.f4257t;
            int i14 = i13 + i7;
            byte[] bArr2 = this.f4256s;
            if (i14 <= bArr2.length) {
                System.arraycopy(bArr2, i13, this.f4259v, 0, i7);
            } else {
                int length2 = bArr2.length - i13;
                System.arraycopy(bArr2, i13, this.f4259v, 0, length2);
                System.arraycopy(this.f4256s, 0, this.f4259v, length2, i7 - length2);
            }
        }
        if (i7 % this.f4251n == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        K0.a.d("sizeToOutput is not aligned to frame size: " + i7, z8);
        if (this.f4257t < this.f4256s.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        K0.a.j(z9);
        byte[] bArr3 = this.f4259v;
        if (i7 % this.f4251n != 0) {
            z10 = false;
        }
        K0.a.d("byteOutput size is not aligned to frame size " + i7, z10);
        if (i8 != 3) {
            for (int i15 = 0; i15 < i7; i15 += 2) {
                int i16 = i15 + 1;
                int i17 = (bArr3[i16] << 8) | (bArr3[i15] & ForkServer.ERROR);
                int i18 = this.f4248k;
                if (i8 == 0) {
                    i18 = ((((i15 * PipesIterator.DEFAULT_QUEUE_SIZE) / (i7 - 1)) * (i18 - 100)) / PipesIterator.DEFAULT_QUEUE_SIZE) + 100;
                } else if (i8 == 2) {
                    i18 += (((i15 * PipesIterator.DEFAULT_QUEUE_SIZE) * (100 - i18)) / (i7 - 1)) / PipesIterator.DEFAULT_QUEUE_SIZE;
                }
                int i19 = (i17 * i18) / 100;
                if (i19 >= 32767) {
                    bArr3[i15] = -1;
                    bArr3[i16] = Byte.MAX_VALUE;
                } else if (i19 <= -32768) {
                    bArr3[i15] = 0;
                    bArr3[i16] = Byte.MIN_VALUE;
                } else {
                    bArr3[i15] = (byte) (i19 & 255);
                    bArr3[i16] = (byte) (i19 >> 8);
                }
            }
        }
        k(i7).put(bArr3, 0, i7).flip();
    }
}
