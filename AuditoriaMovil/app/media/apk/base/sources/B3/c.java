package B3;

import G.i;
import java.io.IOException;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class c extends e {
    public c(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }

    @Override // B3.e
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence f = f(charSequence);
        int length = f.length();
        a aVar = this.f267a;
        if (aVar.f264h[length % aVar.f262e]) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < f.length()) {
                int i9 = i7 + 2;
                int a7 = (aVar.a(f.charAt(i7 + 1)) << 12) | (aVar.a(f.charAt(i7)) << 18);
                int i10 = i8 + 1;
                bArr[i8] = (byte) (a7 >>> 16);
                if (i9 < f.length()) {
                    int i11 = i7 + 3;
                    int a8 = a7 | (aVar.a(f.charAt(i9)) << 6);
                    int i12 = i8 + 2;
                    bArr[i10] = (byte) ((a8 >>> 8) & 255);
                    if (i11 < f.length()) {
                        i7 += 4;
                        i8 += 3;
                        bArr[i12] = (byte) ((a8 | aVar.a(f.charAt(i11))) & 255);
                    } else {
                        i8 = i12;
                        i7 = i11;
                    }
                } else {
                    i8 = i10;
                    i7 = i9;
                }
            }
            return i8;
        }
        throw new IOException("Invalid input length " + f.length());
    }

    @Override // B3.e
    public final void e(StringBuilder sb, byte[] bArr, int i7) {
        int i8 = 0;
        i.l(0, i7, bArr.length);
        for (int i9 = i7; i9 >= 3; i9 -= 3) {
            int i10 = i8 + 2;
            int i11 = (bArr[i8 + 1] & ForkServer.ERROR) << 8;
            i8 += 3;
            int i12 = i11 | ((bArr[i8] & ForkServer.ERROR) << 16) | (bArr[i10] & ForkServer.ERROR);
            a aVar = this.f267a;
            sb.append(aVar.f259b[i12 >>> 18]);
            char[] cArr = aVar.f259b;
            sb.append(cArr[(i12 >>> 12) & 63]);
            sb.append(cArr[(i12 >>> 6) & 63]);
            sb.append(cArr[i12 & 63]);
        }
        if (i8 < i7) {
            d(sb, bArr, i8, i7 - i8);
        }
    }

    public c(a aVar, Character ch) {
        super(aVar, ch);
        i.g(aVar.f259b.length == 64);
    }
}
