package B3;

import G.i;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: d  reason: collision with root package name */
    public final char[] f265d;

    public b(a aVar) {
        super(aVar, (Character) null);
        boolean z7;
        this.f265d = new char[RecognitionOptions.UPC_A];
        char[] cArr = aVar.f259b;
        if (cArr.length == 16) {
            z7 = true;
        } else {
            z7 = false;
        }
        i.g(z7);
        for (int i7 = 0; i7 < 256; i7++) {
            char[] cArr2 = this.f265d;
            cArr2[i7] = cArr[i7 >>> 4];
            cArr2[i7 | RecognitionOptions.QR_CODE] = cArr[i7 & 15];
        }
    }

    @Override // B3.e
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < charSequence.length()) {
                char charAt = charSequence.charAt(i7);
                a aVar = this.f267a;
                bArr[i8] = (byte) ((aVar.a(charAt) << 4) | aVar.a(charSequence.charAt(i7 + 1)));
                i7 += 2;
                i8++;
            }
            return i8;
        }
        throw new IOException("Invalid input length " + charSequence.length());
    }

    @Override // B3.e
    public final void e(StringBuilder sb, byte[] bArr, int i7) {
        i.l(0, i7, bArr.length);
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = bArr[i8] & ForkServer.ERROR;
            char[] cArr = this.f265d;
            sb.append(cArr[i9]);
            sb.append(cArr[i9 | RecognitionOptions.QR_CODE]);
        }
    }
}
