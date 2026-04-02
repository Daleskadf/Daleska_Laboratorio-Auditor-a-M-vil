package H3;

import java.security.InvalidKeyException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1980c;

    public c(byte[] bArr, int i7, int i8) {
        this.f1980c = i8;
        if (bArr.length == 32) {
            this.f1982b = a.c(bArr);
            this.f1981a = i7;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    @Override // H3.d
    public final int[] c(int[] iArr, int i7) {
        switch (this.f1980c) {
            case 0:
                if (iArr.length == 3) {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = a.f1975a;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                    System.arraycopy((int[]) this.f1982b, 0, iArr2, iArr3.length, 8);
                    iArr2[12] = i7;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                    return iArr2;
                }
                throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
            default:
                if (iArr.length == 6) {
                    int[] iArr4 = new int[16];
                    int[] iArr5 = a.f1975a;
                    System.arraycopy(iArr5, 0, r4, 0, iArr5.length);
                    System.arraycopy((int[]) this.f1982b, 0, r4, iArr5.length, 8);
                    int[] iArr6 = {0, 0, 0, 0, iArr6[12], iArr6[13], iArr6[14], iArr6[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
                    a.b(iArr6);
                    int[] copyOf = Arrays.copyOf(iArr6, 8);
                    System.arraycopy(iArr5, 0, iArr4, 0, iArr5.length);
                    System.arraycopy(copyOf, 0, iArr4, iArr5.length, 8);
                    iArr4[12] = i7;
                    iArr4[13] = 0;
                    iArr4[14] = iArr[4];
                    iArr4[15] = iArr[5];
                    return iArr4;
                }
                throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
    }

    @Override // H3.d
    public final int i() {
        switch (this.f1980c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
