package N0;

import D.AbstractC0059i;
import H0.D;
import H0.r;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class f extends G1.c {

    /* renamed from: X  reason: collision with root package name */
    public long f3345X;

    /* renamed from: Y  reason: collision with root package name */
    public ByteBuffer f3346Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f3347Z;

    /* renamed from: c  reason: collision with root package name */
    public r f3348c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3349d = new b();

    /* renamed from: e  reason: collision with root package name */
    public ByteBuffer f3350e;
    public boolean f;

    static {
        D.a("media3.decoder");
    }

    public f(int i7) {
        this.f3347Z = i7;
    }

    public void e() {
        this.f1354b = 0;
        ByteBuffer byteBuffer = this.f3350e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f3346Y;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f = false;
    }

    public final ByteBuffer f(int i7) {
        int capacity;
        int i8 = this.f3347Z;
        if (i8 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i8 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f3350e;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException(AbstractC0059i.y("Buffer too small (", capacity, " < ", i7, ")"));
    }

    public final void h(int i7) {
        ByteBuffer byteBuffer = this.f3350e;
        if (byteBuffer == null) {
            this.f3350e = f(i7);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i8 = i7 + position;
        if (capacity >= i8) {
            this.f3350e = byteBuffer;
            return;
        }
        ByteBuffer f = f(i8);
        f.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            f.put(byteBuffer);
        }
        this.f3350e = f;
    }

    public final void i() {
        ByteBuffer byteBuffer = this.f3350e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f3346Y;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
