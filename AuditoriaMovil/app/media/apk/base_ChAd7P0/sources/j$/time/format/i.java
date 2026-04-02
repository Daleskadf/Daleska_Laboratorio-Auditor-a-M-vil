package j$.time.format;

import org.apache.tika.pipes.PipesConfigBase;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i implements f {
    static final long[] f = {0, 10, 100, 1000, 10000, PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a  reason: collision with root package name */
    final Enum f12674a;

    /* renamed from: b  reason: collision with root package name */
    final int f12675b;

    /* renamed from: c  reason: collision with root package name */
    final int f12676c;

    /* renamed from: d  reason: collision with root package name */
    private final z f12677d;

    /* renamed from: e  reason: collision with root package name */
    final int f12678e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j$.time.temporal.q qVar, int i7, int i8, z zVar) {
        this.f12674a = (Enum) qVar;
        this.f12675b = i7;
        this.f12676c = i8;
        this.f12677d = zVar;
        this.f12678e = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i(j$.time.temporal.q qVar, int i7, int i8, z zVar, int i9) {
        this.f12674a = (Enum) qVar;
        this.f12675b = i7;
        this.f12676c = i8;
        this.f12677d = zVar;
        this.f12678e = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.time.temporal.q] */
    public i c() {
        return this.f12678e == -1 ? this : new i(this.f12674a, this.f12675b, this.f12676c, this.f12677d, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.time.temporal.q] */
    public i d(int i7) {
        ?? r12 = this.f12674a;
        int i8 = this.f12676c;
        z zVar = this.f12677d;
        return new i(r12, this.f12675b, i8, zVar, this.f12678e + i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.temporal.q, java.lang.Object] */
    @Override // j$.time.format.f
    public boolean o(t tVar, StringBuilder sb) {
        ?? r02 = this.f12674a;
        Long e7 = tVar.e(r02);
        if (e7 == null) {
            return false;
        }
        long longValue = e7.longValue();
        w b5 = tVar.b();
        String l8 = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l8.length();
        int i7 = this.f12676c;
        if (length > i7) {
            throw new RuntimeException("Field " + ((Object) r02) + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i7);
        }
        b5.getClass();
        int i8 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
        int i9 = this.f12675b;
        z zVar = this.f12677d;
        if (i8 >= 0) {
            int i10 = c.f12669a[zVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    sb.append('+');
                }
            } else if (i9 < 19 && longValue >= f[i9]) {
                sb.append('+');
            }
        } else {
            int i11 = c.f12669a[zVar.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                sb.append('-');
            } else if (i11 == 4) {
                throw new RuntimeException("Field " + ((Object) r02) + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i12 = 0; i12 < i9 - l8.length(); i12++) {
            sb.append('0');
        }
        sb.append(l8);
        return true;
    }

    boolean b(q qVar) {
        int i7 = this.f12678e;
        return i7 == -1 || (i7 > 0 && this.f12675b == this.f12676c && this.f12677d == z.NOT_NEGATIVE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f2, code lost:
        r2 = r16;
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0137, code lost:
        if (r3 <= r8) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015f  */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Enum, j$.time.temporal.q] */
    @Override // j$.time.format.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int q(j$.time.format.q r21, java.lang.CharSequence r22, int r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.i.q(j$.time.format.q, java.lang.CharSequence, int):int");
    }

    public String toString() {
        Enum r02 = this.f12674a;
        int i7 = this.f12676c;
        z zVar = this.f12677d;
        int i8 = this.f12675b;
        if (i8 == 1 && i7 == 19 && zVar == z.NORMAL) {
            return "Value(" + r02 + ")";
        } else if (i8 == i7 && zVar == z.NOT_NEGATIVE) {
            return "Value(" + r02 + "," + i8 + ")";
        } else {
            return "Value(" + r02 + "," + i8 + "," + i7 + "," + zVar + ")";
        }
    }
}
