package Q0;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class P extends I0.e {

    /* renamed from: i  reason: collision with root package name */
    public int f4261i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4262k;

    /* renamed from: l  reason: collision with root package name */
    public int f4263l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f4264m;

    /* renamed from: n  reason: collision with root package name */
    public int f4265n;

    /* renamed from: o  reason: collision with root package name */
    public long f4266o;

    @Override // I0.e, I0.d
    public final ByteBuffer b() {
        int i7;
        if (super.d() && (i7 = this.f4265n) > 0) {
            k(i7).put(this.f4264m, 0, this.f4265n).flip();
            this.f4265n = 0;
        }
        return super.b();
    }

    @Override // I0.e, I0.d
    public final boolean d() {
        if (super.d() && this.f4265n == 0) {
            return true;
        }
        return false;
    }

    @Override // I0.d
    public final void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.f4263l);
        this.f4266o += min / this.f2133b.f2131d;
        this.f4263l -= min;
        byteBuffer.position(position + min);
        if (this.f4263l > 0) {
            return;
        }
        int i8 = i7 - min;
        int length = (this.f4265n + i8) - this.f4264m.length;
        ByteBuffer k2 = k(length);
        int j = K0.x.j(length, 0, this.f4265n);
        k2.put(this.f4264m, 0, j);
        int j8 = K0.x.j(length - j, 0, i8);
        byteBuffer.limit(byteBuffer.position() + j8);
        k2.put(byteBuffer);
        byteBuffer.limit(limit);
        int i9 = i8 - j8;
        int i10 = this.f4265n - j;
        this.f4265n = i10;
        byte[] bArr = this.f4264m;
        System.arraycopy(bArr, j, bArr, 0, i10);
        byteBuffer.get(this.f4264m, this.f4265n, i9);
        this.f4265n += i9;
        k2.flip();
    }

    @Override // I0.e
    public final I0.b g(I0.b bVar) {
        if (bVar.f2130c == 2) {
            this.f4262k = true;
            if (this.f4261i == 0 && this.j == 0) {
                return I0.b.f2127e;
            }
            return bVar;
        }
        throw new I0.c(bVar);
    }

    @Override // I0.e
    public final void h() {
        if (this.f4262k) {
            this.f4262k = false;
            int i7 = this.j;
            int i8 = this.f2133b.f2131d;
            this.f4264m = new byte[i7 * i8];
            this.f4263l = this.f4261i * i8;
        }
        this.f4265n = 0;
    }

    @Override // I0.e
    public final void i() {
        int i7;
        if (this.f4262k) {
            if (this.f4265n > 0) {
                this.f4266o += i7 / this.f2133b.f2131d;
            }
            this.f4265n = 0;
        }
    }

    @Override // I0.e
    public final void j() {
        this.f4264m = K0.x.f;
    }
}
