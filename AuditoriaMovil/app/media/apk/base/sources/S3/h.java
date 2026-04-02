package S3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class h implements F3.a {

    /* renamed from: a  reason: collision with root package name */
    public final l f5240a;

    /* renamed from: b  reason: collision with root package name */
    public final F3.n f5241b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5242c;

    public h(l lVar, F3.n nVar, int i7) {
        this.f5240a = lVar;
        this.f5241b = nVar;
        this.f5242c = i7;
    }

    @Override // F3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        a aVar = (a) this.f5240a;
        aVar.getClass();
        int length = bArr.length;
        int i7 = aVar.f5220b;
        int i8 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i7;
        if (length <= i8) {
            byte[] bArr3 = new byte[bArr.length + i7];
            byte[] a7 = q.a(i7);
            System.arraycopy(a7, 0, bArr3, 0, i7);
            aVar.a(bArr, 0, bArr.length, bArr3, aVar.f5220b, a7, true);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return j3.f.c(bArr3, this.f5241b.b(j3.f.c(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
        }
        throw new GeneralSecurityException(io.flutter.plugins.pathprovider.b.e(i8, "plaintext length can not exceed "));
    }

    @Override // F3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i7 = this.f5242c;
        if (length >= i7) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i7);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i7, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f5241b.a(copyOfRange2, j3.f.c(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            a aVar = (a) this.f5240a;
            aVar.getClass();
            int length2 = copyOfRange.length;
            int i8 = aVar.f5220b;
            if (length2 >= i8) {
                byte[] bArr3 = new byte[i8];
                System.arraycopy(copyOfRange, 0, bArr3, 0, i8);
                int length3 = copyOfRange.length;
                int i9 = aVar.f5220b;
                byte[] bArr4 = new byte[length3 - i9];
                aVar.a(copyOfRange, i9, copyOfRange.length - i9, bArr4, 0, bArr3, false);
                return bArr4;
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
