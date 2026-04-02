package S3;

import java.nio.charset.Charset;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f5237a = Charset.forName("UTF-8");

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
        if (r7 != 4) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.f.a(java.lang.String):byte[]");
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = e.f5236e;
        int i7 = (length / 3) * 4;
        if (length % 3 > 0) {
            i7 += 4;
        }
        byte[] bArr3 = new byte[i7];
        int i8 = 0;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            int i11 = i8 + 3;
            if (i11 > length) {
                break;
            }
            int i12 = (bArr[i8 + 2] & ForkServer.ERROR) | ((bArr[i8] & ForkServer.ERROR) << 16) | ((bArr[i8 + 1] & ForkServer.ERROR) << 8);
            bArr3[i10] = bArr2[(i12 >> 18) & 63];
            bArr3[i10 + 1] = bArr2[(i12 >> 12) & 63];
            bArr3[i10 + 2] = bArr2[(i12 >> 6) & 63];
            bArr3[i10 + 3] = bArr2[i12 & 63];
            int i13 = i10 + 4;
            i9--;
            if (i9 == 0) {
                i10 += 5;
                bArr3[i13] = 10;
                i9 = 19;
            } else {
                i10 = i13;
            }
            i8 = i11;
        }
        if (i8 == length - 1) {
            int i14 = (bArr[i8] & ForkServer.ERROR) << 4;
            bArr3[i10] = bArr2[(i14 >> 6) & 63];
            bArr3[i10 + 1] = bArr2[i14 & 63];
            bArr3[i10 + 2] = 61;
            bArr3[i10 + 3] = 61;
        } else if (i8 == length - 2) {
            int i15 = ((bArr[i8 + 1] & ForkServer.ERROR) << 2) | ((bArr[i8] & ForkServer.ERROR) << 10);
            bArr3[i10] = bArr2[(i15 >> 12) & 63];
            bArr3[i10 + 1] = bArr2[(i15 >> 6) & 63];
            bArr3[i10 + 2] = bArr2[i15 & 63];
            bArr3[i10 + 3] = 61;
        }
        return bArr3;
    }
}
