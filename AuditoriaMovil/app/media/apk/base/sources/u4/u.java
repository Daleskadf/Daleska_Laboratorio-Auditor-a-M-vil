package u4;

import a6.o0;
import a6.p0;
import com.google.firebase.firestore.I;
import com.google.firebase.firestore.J;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.C0850l;
import com.google.protobuf.V;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Iterator;
import l4.C1418b;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final C1418b f16019a;

    static {
        new SecureRandom();
        f16019a = new C1418b(6);
    }

    public static Object a(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i7 = 0; i7 < min; i7++) {
            int i8 = bArr[i7] & ForkServer.ERROR;
            int i9 = bArr2[i7] & ForkServer.ERROR;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
        }
        return d(bArr.length, bArr2.length);
    }

    public static int c(AbstractC0852m abstractC0852m, AbstractC0852m abstractC0852m2) {
        int min = Math.min(abstractC0852m.size(), abstractC0852m2.size());
        for (int i7 = 0; i7 < min; i7++) {
            int h8 = abstractC0852m.h(i7) & ForkServer.ERROR;
            int h9 = abstractC0852m2.h(i7) & ForkServer.ERROR;
            if (h8 < h9) {
                return -1;
            }
            if (h8 > h9) {
                return 1;
            }
        }
        return d(abstractC0852m.size(), abstractC0852m2.size());
    }

    public static int d(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        if (i7 > i8) {
            return 1;
        }
        return 0;
    }

    public static int e(double d7, long j) {
        if (Double.isNaN(d7) || d7 < -9.223372036854776E18d) {
            return -1;
        }
        if (d7 >= 9.223372036854776E18d) {
            return 1;
        }
        int compare = Long.compare((long) d7, j);
        if (compare == 0) {
            return android.support.v4.media.session.a.m(d7, j);
        }
        return compare;
    }

    public static int f(String str, String str2) {
        int i7 = 0;
        while (i7 < str.length() && i7 < str2.length()) {
            int codePointAt = str.codePointAt(i7);
            int codePointAt2 = str2.codePointAt(i7);
            if (codePointAt != codePointAt2) {
                if (codePointAt < 128 && codePointAt2 < 128) {
                    return Integer.compare(codePointAt, codePointAt2);
                }
                String substring = str.substring(i7, Character.charCount(str.codePointAt(i7)) + i7);
                C0850l c0850l = AbstractC0852m.f10085b;
                Charset charset = V.f10033a;
                int c8 = c(new C0850l(substring.getBytes(charset)), new C0850l(str2.substring(i7, Character.charCount(str2.codePointAt(i7)) + i7).getBytes(charset)));
                if (c8 != 0) {
                    return c8;
                }
                return Integer.compare(codePointAt, codePointAt2);
            }
            i7 += Character.charCount(codePointAt);
        }
        return Integer.compare(str.length(), str2.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (r0 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.util.Iterator r6, java.util.Iterator r7, java.util.Comparator r8, u4.g r9, u4.g r10) {
        /*
            java.lang.Object r0 = a(r6)
            java.lang.Object r1 = a(r7)
        L8:
            if (r0 != 0) goto Le
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L20
            if (r1 == 0) goto L20
            int r4 = r8.compare(r0, r1)
            if (r4 >= 0) goto L1b
            goto L26
        L1b:
            if (r4 <= 0) goto L1e
            goto L23
        L1e:
            r3 = r2
            goto L26
        L20:
            if (r0 == 0) goto L23
            goto L26
        L23:
            r5 = r3
            r3 = r2
            r2 = r5
        L26:
            if (r2 == 0) goto L30
            r9.accept(r1)
            java.lang.Object r1 = a(r7)
            goto L8
        L30:
            if (r3 == 0) goto L3a
            r10.accept(r0)
            java.lang.Object r0 = a(r6)
            goto L8
        L3a:
            java.lang.Object r0 = a(r6)
            java.lang.Object r1 = a(r7)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.u.g(java.util.Iterator, java.util.Iterator, java.util.Comparator, u4.g, u4.g):void");
    }

    public static J h(o0 o0Var) {
        o0Var.getClass();
        p0 p0Var = new p0(o0Var);
        return new J(p0Var.getMessage(), I.a(o0Var.f7183a.c()), p0Var);
    }

    public static StringBuilder i(int i7, CharSequence charSequence, String str) {
        StringBuilder sb = new StringBuilder();
        if (i7 != 0) {
            sb.append(charSequence);
            for (int i8 = 1; i8 < i7; i8++) {
                sb.append((CharSequence) str);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String j(AbstractC0852m abstractC0852m) {
        int size = abstractC0852m.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i7 = 0; i7 < size; i7++) {
            byte h8 = abstractC0852m.h(i7);
            sb.append(Character.forDigit((h8 & ForkServer.ERROR) >>> 4, 16));
            sb.append(Character.forDigit(h8 & 15, 16));
        }
        return sb.toString();
    }
}
