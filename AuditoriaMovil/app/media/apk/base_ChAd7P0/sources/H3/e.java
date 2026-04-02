package H3;

import D.AbstractC0055e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final J3.c f1983d = J3.c.ALGORITHM_NOT_FIPS;

    /* renamed from: a  reason: collision with root package name */
    public final d f1984a;

    /* renamed from: b  reason: collision with root package name */
    public final d f1985b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1986c;

    public e(byte[] bArr, int i7) {
        this.f1986c = i7;
        if (f1983d.a()) {
            this.f1984a = d(bArr, 1);
            this.f1985b = d(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        int length;
        int i7;
        if (bArr.length % 16 == 0) {
            length = bArr.length;
        } else {
            length = (bArr.length + 16) - (bArr.length % 16);
        }
        int remaining = byteBuffer.remaining();
        int i8 = remaining % 16;
        if (i8 == 0) {
            i7 = remaining;
        } else {
            i7 = (remaining + 16) - i8;
        }
        int i9 = i7 + length;
        ByteBuffer order = ByteBuffer.allocate(i9 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i9);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    public final byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.f1985b.a(bArr, 0).get(bArr4);
                if (MessageDigest.isEqual(AbstractC0055e.c(bArr4, c(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    d dVar = this.f1984a;
                    dVar.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    dVar.k(bArr, allocate, byteBuffer);
                    return allocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e7) {
                throw new AEADBadTagException(e7.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            d dVar = this.f1984a;
            dVar.getClass();
            if (byteBuffer.remaining() >= bArr2.length) {
                dVar.k(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
                byteBuffer.position(position);
                byteBuffer.limit(byteBuffer.limit() - 16);
                if (bArr3 == null) {
                    bArr3 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f1985b.a(bArr, 0).get(bArr4);
                byte[] c8 = AbstractC0055e.c(bArr4, c(bArr3, byteBuffer));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(c8);
                return;
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final d d(byte[] bArr, int i7) {
        switch (this.f1986c) {
            case 0:
                return new c(bArr, i7, 0);
            default:
                return new c(bArr, i7, 1);
        }
    }
}
