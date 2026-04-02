package I0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public abstract class e implements d {

    /* renamed from: b  reason: collision with root package name */
    public b f2133b;

    /* renamed from: c  reason: collision with root package name */
    public b f2134c;

    /* renamed from: d  reason: collision with root package name */
    public b f2135d;

    /* renamed from: e  reason: collision with root package name */
    public b f2136e;
    public ByteBuffer f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f2137g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2138h;

    public e() {
        ByteBuffer byteBuffer = d.f2132a;
        this.f = byteBuffer;
        this.f2137g = byteBuffer;
        b bVar = b.f2127e;
        this.f2135d = bVar;
        this.f2136e = bVar;
        this.f2133b = bVar;
        this.f2134c = bVar;
    }

    @Override // I0.d
    public final void a() {
        flush();
        this.f = d.f2132a;
        b bVar = b.f2127e;
        this.f2135d = bVar;
        this.f2136e = bVar;
        this.f2133b = bVar;
        this.f2134c = bVar;
        j();
    }

    @Override // I0.d
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f2137g;
        this.f2137g = d.f2132a;
        return byteBuffer;
    }

    @Override // I0.d
    public final void c() {
        this.f2138h = true;
        i();
    }

    @Override // I0.d
    public boolean d() {
        if (this.f2138h && this.f2137g == d.f2132a) {
            return true;
        }
        return false;
    }

    @Override // I0.d
    public final b f(b bVar) {
        this.f2135d = bVar;
        this.f2136e = g(bVar);
        if (isActive()) {
            return this.f2136e;
        }
        return b.f2127e;
    }

    @Override // I0.d
    public final void flush() {
        this.f2137g = d.f2132a;
        this.f2138h = false;
        this.f2133b = this.f2135d;
        this.f2134c = this.f2136e;
        h();
    }

    public abstract b g(b bVar);

    @Override // I0.d
    public boolean isActive() {
        if (this.f2136e != b.f2127e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer k(int i7) {
        if (this.f.capacity() < i7) {
            this.f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.f2137g = byteBuffer;
        return byteBuffer;
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
