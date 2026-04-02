package c6;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class G1 extends AbstractC0658d {

    /* renamed from: a  reason: collision with root package name */
    public int f8464a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8465b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f8466c;

    /* renamed from: d  reason: collision with root package name */
    public int f8467d = -1;

    public G1(byte[] bArr, int i7, int i8) {
        boolean z7;
        boolean z8;
        if (i7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.f("offset must be >= 0", z7);
        if (i8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        G.i.f("length must be >= 0", z8);
        int i9 = i8 + i7;
        G.i.f("offset + length exceeds array boundary", i9 <= bArr.length);
        this.f8466c = bArr;
        this.f8464a = i7;
        this.f8465b = i9;
    }

    @Override // c6.AbstractC0658d
    public final void b() {
        this.f8467d = this.f8464a;
    }

    @Override // c6.AbstractC0658d
    public final AbstractC0658d d(int i7) {
        a(i7);
        int i8 = this.f8464a;
        this.f8464a = i8 + i7;
        return new G1(this.f8466c, i8, i7);
    }

    @Override // c6.AbstractC0658d
    public final void g(OutputStream outputStream, int i7) {
        a(i7);
        outputStream.write(this.f8466c, this.f8464a, i7);
        this.f8464a += i7;
    }

    @Override // c6.AbstractC0658d
    public final void j(ByteBuffer byteBuffer) {
        G.i.j(byteBuffer, "dest");
        int remaining = byteBuffer.remaining();
        a(remaining);
        byteBuffer.put(this.f8466c, this.f8464a, remaining);
        this.f8464a += remaining;
    }

    @Override // c6.AbstractC0658d
    public final void m(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f8466c, this.f8464a, bArr, i7, i8);
        this.f8464a += i8;
    }

    @Override // c6.AbstractC0658d
    public final int n() {
        a(1);
        int i7 = this.f8464a;
        this.f8464a = i7 + 1;
        return this.f8466c[i7] & ForkServer.ERROR;
    }

    @Override // c6.AbstractC0658d
    public final int o() {
        return this.f8465b - this.f8464a;
    }

    @Override // c6.AbstractC0658d
    public final void p() {
        int i7 = this.f8467d;
        if (i7 != -1) {
            this.f8464a = i7;
            return;
        }
        throw new InvalidMarkException();
    }

    @Override // c6.AbstractC0658d
    public final void q(int i7) {
        a(i7);
        this.f8464a += i7;
    }
}
