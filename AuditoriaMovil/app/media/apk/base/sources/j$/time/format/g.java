package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g extends i {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f12673g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(j$.time.temporal.q qVar, int i7, int i8, boolean z7, int i9) {
        super(qVar, i7, i8, z.NOT_NEGATIVE, i9);
        this.f12673g = z7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.time.temporal.q] */
    @Override // j$.time.format.i
    public final i c() {
        if (this.f12678e == -1) {
            return this;
        }
        return new g(this.f12674a, this.f12675b, this.f12676c, this.f12673g, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.time.temporal.q] */
    @Override // j$.time.format.i
    public final i d(int i7) {
        return new g(this.f12674a, this.f12675b, this.f12676c, this.f12673g, this.f12678e + i7);
    }

    @Override // j$.time.format.i
    final boolean b(q qVar) {
        return qVar.k() && this.f12675b == this.f12676c && !this.f12673g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.temporal.q] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb) {
        ?? r02 = this.f12674a;
        Long e7 = tVar.e(r02);
        if (e7 == null) {
            return false;
        }
        w b5 = tVar.b();
        long longValue = e7.longValue();
        j$.time.temporal.t o7 = r02.o();
        o7.b(longValue, r02);
        BigDecimal valueOf = BigDecimal.valueOf(o7.e());
        BigDecimal add = BigDecimal.valueOf(o7.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z7 = this.f12673g;
        int i7 = this.f12675b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i7), this.f12676c), roundingMode).toPlainString().substring(2);
            b5.getClass();
            if (z7) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        } else if (i7 > 0) {
            if (z7) {
                b5.getClass();
                sb.append('.');
            }
            for (int i8 = 0; i8 < i7; i8++) {
                b5.getClass();
                sb.append('0');
            }
            return true;
        } else {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, j$.time.temporal.q] */
    @Override // j$.time.format.i, j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i7) {
        int i8 = (qVar.k() || b(qVar)) ? this.f12675b : 0;
        int i9 = (qVar.k() || b(qVar)) ? this.f12676c : 9;
        int length = charSequence.length();
        if (i7 == length) {
            return i8 > 0 ? ~i7 : i7;
        }
        if (this.f12673g) {
            char charAt = charSequence.charAt(i7);
            qVar.f().getClass();
            if (charAt != '.') {
                return i8 > 0 ? ~i7 : i7;
            }
            i7++;
        }
        int i10 = i7;
        int i11 = i8 + i10;
        if (i11 > length) {
            return ~i10;
        }
        int min = Math.min(i9 + i10, length);
        int i12 = 0;
        int i13 = i10;
        while (true) {
            if (i13 >= min) {
                break;
            }
            int i14 = i13 + 1;
            int a7 = qVar.f().a(charSequence.charAt(i13));
            if (a7 >= 0) {
                i12 = (i12 * 10) + a7;
                i13 = i14;
            } else if (i14 < i11) {
                return ~i10;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i12).movePointLeft(i13 - i10);
        ?? r52 = this.f12674a;
        j$.time.temporal.t o7 = r52.o();
        BigDecimal valueOf = BigDecimal.valueOf(o7.e());
        return qVar.n(r52, movePointLeft.multiply(BigDecimal.valueOf(o7.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i10, i13);
    }

    @Override // j$.time.format.i
    public final String toString() {
        String str = this.f12673g ? ",DecimalPoint" : StringUtils.EMPTY;
        return "Fraction(" + this.f12674a + "," + this.f12675b + "," + this.f12676c + str + ")";
    }
}
