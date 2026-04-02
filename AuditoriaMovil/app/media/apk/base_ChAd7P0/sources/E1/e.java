package E1;

import m1.l;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f1054d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1055a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f1056b;

    /* renamed from: c  reason: collision with root package name */
    public int f1057c;

    public static long a(byte[] bArr, int i7, boolean z7) {
        long j = bArr[0] & 255;
        if (z7) {
            j &= ~f1054d[i7 - 1];
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j = (j << 8) | (bArr[i8] & 255);
        }
        return j;
    }

    public static int b(int i7) {
        for (int i8 = 0; i8 < 8; i8++) {
            if ((f1054d[i8] & i7) != 0) {
                return i8 + 1;
            }
        }
        return -1;
    }

    public final long c(l lVar, boolean z7, boolean z8, int i7) {
        int i8 = this.f1056b;
        byte[] bArr = this.f1055a;
        if (i8 == 0) {
            if (!lVar.f(bArr, 0, 1, z7)) {
                return -1L;
            }
            int b5 = b(bArr[0] & ForkServer.ERROR);
            this.f1057c = b5;
            if (b5 != -1) {
                this.f1056b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i9 = this.f1057c;
        if (i9 > i7) {
            this.f1056b = 0;
            return -2L;
        }
        if (i9 != 1) {
            lVar.f(bArr, 1, i9 - 1, false);
        }
        this.f1056b = 0;
        return a(bArr, this.f1057c, z8);
    }
}
