package I0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b  reason: collision with root package name */
    public int f2159b;

    /* renamed from: c  reason: collision with root package name */
    public float f2160c;

    /* renamed from: d  reason: collision with root package name */
    public float f2161d;

    /* renamed from: e  reason: collision with root package name */
    public b f2162e;
    public b f;

    /* renamed from: g  reason: collision with root package name */
    public b f2163g;

    /* renamed from: h  reason: collision with root package name */
    public b f2164h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2165i;
    public f j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f2166k;

    /* renamed from: l  reason: collision with root package name */
    public ShortBuffer f2167l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f2168m;

    /* renamed from: n  reason: collision with root package name */
    public long f2169n;

    /* renamed from: o  reason: collision with root package name */
    public long f2170o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2171p;

    @Override // I0.d
    public final void a() {
        this.f2160c = 1.0f;
        this.f2161d = 1.0f;
        b bVar = b.f2127e;
        this.f2162e = bVar;
        this.f = bVar;
        this.f2163g = bVar;
        this.f2164h = bVar;
        ByteBuffer byteBuffer = d.f2132a;
        this.f2166k = byteBuffer;
        this.f2167l = byteBuffer.asShortBuffer();
        this.f2168m = byteBuffer;
        this.f2159b = -1;
        this.f2165i = false;
        this.j = null;
        this.f2169n = 0L;
        this.f2170o = 0L;
        this.f2171p = false;
    }

    @Override // I0.d
    public final ByteBuffer b() {
        f fVar = this.j;
        if (fVar != null) {
            int i7 = fVar.f2149m;
            int i8 = fVar.f2140b;
            int i9 = i7 * i8 * 2;
            if (i9 > 0) {
                if (this.f2166k.capacity() < i9) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
                    this.f2166k = order;
                    this.f2167l = order.asShortBuffer();
                } else {
                    this.f2166k.clear();
                    this.f2167l.clear();
                }
                ShortBuffer shortBuffer = this.f2167l;
                int min = Math.min(shortBuffer.remaining() / i8, fVar.f2149m);
                int i10 = min * i8;
                shortBuffer.put(fVar.f2148l, 0, i10);
                int i11 = fVar.f2149m - min;
                fVar.f2149m = i11;
                short[] sArr = fVar.f2148l;
                System.arraycopy(sArr, i10, sArr, 0, i11 * i8);
                this.f2170o += i9;
                this.f2166k.limit(i9);
                this.f2168m = this.f2166k;
            }
        }
        ByteBuffer byteBuffer = this.f2168m;
        this.f2168m = d.f2132a;
        return byteBuffer;
    }

    @Override // I0.d
    public final void c() {
        f fVar = this.j;
        if (fVar != null) {
            int i7 = fVar.f2147k;
            float f = fVar.f2141c;
            float f4 = fVar.f2142d;
            int i8 = fVar.f2149m + ((int) ((((i7 / (f / f4)) + fVar.f2151o) / (fVar.f2143e * f4)) + 0.5f));
            short[] sArr = fVar.j;
            int i9 = fVar.f2145h * 2;
            fVar.j = fVar.c(sArr, i7, i9 + i7);
            int i10 = 0;
            while (true) {
                int i11 = fVar.f2140b;
                if (i10 >= i9 * i11) {
                    break;
                }
                fVar.j[(i11 * i7) + i10] = 0;
                i10++;
            }
            fVar.f2147k = i9 + fVar.f2147k;
            fVar.f();
            if (fVar.f2149m > i8) {
                fVar.f2149m = i8;
            }
            fVar.f2147k = 0;
            fVar.f2154r = 0;
            fVar.f2151o = 0;
        }
        this.f2171p = true;
    }

    @Override // I0.d
    public final boolean d() {
        f fVar;
        if (this.f2171p && ((fVar = this.j) == null || fVar.f2149m * fVar.f2140b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // I0.d
    public final void e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        f fVar = this.j;
        fVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f2169n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i7 = fVar.f2140b;
        int i8 = remaining2 / i7;
        short[] c8 = fVar.c(fVar.j, fVar.f2147k, i8);
        fVar.j = c8;
        asShortBuffer.get(c8, fVar.f2147k * i7, ((i8 * i7) * 2) / 2);
        fVar.f2147k += i8;
        fVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // I0.d
    public final b f(b bVar) {
        if (bVar.f2130c == 2) {
            int i7 = this.f2159b;
            if (i7 == -1) {
                i7 = bVar.f2128a;
            }
            this.f2162e = bVar;
            b bVar2 = new b(i7, bVar.f2129b, 2);
            this.f = bVar2;
            this.f2165i = true;
            return bVar2;
        }
        throw new c(bVar);
    }

    @Override // I0.d
    public final void flush() {
        if (isActive()) {
            b bVar = this.f2162e;
            this.f2163g = bVar;
            b bVar2 = this.f;
            this.f2164h = bVar2;
            if (this.f2165i) {
                this.j = new f(bVar.f2128a, bVar.f2129b, this.f2160c, this.f2161d, bVar2.f2128a);
            } else {
                f fVar = this.j;
                if (fVar != null) {
                    fVar.f2147k = 0;
                    fVar.f2149m = 0;
                    fVar.f2151o = 0;
                    fVar.f2152p = 0;
                    fVar.f2153q = 0;
                    fVar.f2154r = 0;
                    fVar.f2155s = 0;
                    fVar.f2156t = 0;
                    fVar.f2157u = 0;
                    fVar.f2158v = 0;
                }
            }
        }
        this.f2168m = d.f2132a;
        this.f2169n = 0L;
        this.f2170o = 0L;
        this.f2171p = false;
    }

    @Override // I0.d
    public final boolean isActive() {
        if (this.f.f2128a != -1 && (Math.abs(this.f2160c - 1.0f) >= 1.0E-4f || Math.abs(this.f2161d - 1.0f) >= 1.0E-4f || this.f.f2128a != this.f2162e.f2128a)) {
            return true;
        }
        return false;
    }
}
