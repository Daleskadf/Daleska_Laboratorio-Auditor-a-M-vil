package B3;

import G.i;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    public static final c f266c = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: a  reason: collision with root package name */
    public final a f267a;

    /* renamed from: b  reason: collision with root package name */
    public final Character f268b;

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public e(a aVar, Character ch) {
        boolean z7;
        aVar.getClass();
        this.f267a = aVar;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = aVar.f263g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z7 = false;
                i.e(ch, "Padding character %s was already in alphabet", z7);
                this.f268b = ch;
            }
        }
        z7 = true;
        i.e(ch, "Padding character %s was already in alphabet", z7);
        this.f268b = ch;
    }

    public final byte[] a(String str) {
        try {
            CharSequence f = f(str);
            int length = (int) (((this.f267a.f261d * f.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b5 = b(bArr, f);
            if (b5 != length) {
                byte[] bArr2 = new byte[b5];
                System.arraycopy(bArr, 0, bArr2, 0, b5);
                return bArr2;
            }
            return bArr;
        } catch (d e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        int i7;
        int i8;
        CharSequence f = f(charSequence);
        int length = f.length();
        a aVar = this.f267a;
        if (aVar.f264h[length % aVar.f262e]) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < f.length()) {
                long j = 0;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i7 = aVar.f261d;
                    i8 = aVar.f262e;
                    if (i11 >= i8) {
                        break;
                    }
                    j <<= i7;
                    if (i9 + i11 < f.length()) {
                        j |= aVar.a(f.charAt(i12 + i9));
                        i12++;
                    }
                    i11++;
                }
                int i13 = aVar.f;
                int i14 = (i13 * 8) - (i12 * i7);
                int i15 = (i13 - 1) * 8;
                while (i15 >= i14) {
                    bArr[i10] = (byte) ((j >>> i15) & 255);
                    i15 -= 8;
                    i10++;
                }
                i9 += i8;
            }
            return i10;
        }
        throw new IOException("Invalid input length " + f.length());
    }

    public final String c(byte[] bArr) {
        int length = bArr.length;
        i.l(0, length, bArr.length);
        a aVar = this.f267a;
        StringBuilder sb = new StringBuilder(f7.a.P(length, aVar.f, RoundingMode.CEILING) * aVar.f262e);
        try {
            e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final void d(StringBuilder sb, byte[] bArr, int i7, int i8) {
        boolean z7;
        i.l(i7, i7 + i8, bArr.length);
        a aVar = this.f267a;
        int i9 = 0;
        if (i8 <= aVar.f) {
            z7 = true;
        } else {
            z7 = false;
        }
        i.g(z7);
        long j = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            j = (j | (bArr[i7 + i10] & ForkServer.ERROR)) << 8;
        }
        int i11 = aVar.f261d;
        int i12 = ((i8 + 1) * 8) - i11;
        while (i9 < i8 * 8) {
            sb.append(aVar.f259b[((int) (j >>> (i12 - i9))) & aVar.f260c]);
            i9 += i11;
        }
        Character ch = this.f268b;
        if (ch != null) {
            while (i9 < aVar.f * 8) {
                sb.append(ch.charValue());
                i9 += i11;
            }
        }
    }

    public void e(StringBuilder sb, byte[] bArr, int i7) {
        int i8 = 0;
        i.l(0, i7, bArr.length);
        while (i8 < i7) {
            a aVar = this.f267a;
            d(sb, bArr, i8, Math.min(aVar.f, i7 - i8));
            i8 += aVar.f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f267a.equals(eVar.f267a) || !Objects.equals(this.f268b, eVar.f268b)) {
            return false;
        }
        return true;
    }

    public final CharSequence f(CharSequence charSequence) {
        Character ch = this.f268b;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return this.f267a.hashCode() ^ Objects.hashCode(this.f268b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        a aVar = this.f267a;
        sb.append(aVar);
        if (8 % aVar.f261d != 0) {
            Character ch = this.f268b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public e(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }
}
