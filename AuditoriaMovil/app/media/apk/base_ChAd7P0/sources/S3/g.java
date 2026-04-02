package S3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class g implements F3.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5238a;

    /* renamed from: b  reason: collision with root package name */
    public final H3.e f5239b;

    public g(byte[] bArr, int i7) {
        this.f5238a = i7;
        switch (i7) {
            case 1:
                this.f5239b = new H3.e(bArr, 1);
                return;
            default:
                this.f5239b = new H3.e(bArr, 0);
                return;
        }
    }

    @Override // F3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        switch (this.f5238a) {
            case 0:
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] a7 = q.a(12);
                allocate.put(a7);
                this.f5239b.b(allocate, a7, bArr, bArr2);
                return allocate.array();
            default:
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] a8 = q.a(24);
                allocate2.put(a8);
                this.f5239b.b(allocate2, a8, bArr, bArr2);
                return allocate2.array();
        }
    }

    @Override // F3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        switch (this.f5238a) {
            case 0:
                if (bArr.length >= 28) {
                    byte[] copyOf = Arrays.copyOf(bArr, 12);
                    return this.f5239b.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
            default:
                if (bArr.length >= 40) {
                    byte[] copyOf2 = Arrays.copyOf(bArr, 24);
                    return this.f5239b.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf2, bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
