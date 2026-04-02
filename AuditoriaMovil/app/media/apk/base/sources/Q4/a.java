package Q4;

import H4.e1;
import I4.z;
import androidx.datastore.preferences.protobuf.Y;
import c5.C0639a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: Z  reason: collision with root package name */
    public long f4391Z;

    /* renamed from: a  reason: collision with root package name */
    public final Reader f4392a;

    /* renamed from: e0  reason: collision with root package name */
    public int f4397e0;

    /* renamed from: f0  reason: collision with root package name */
    public String f4398f0;

    /* renamed from: g0  reason: collision with root package name */
    public int[] f4399g0;

    /* renamed from: i0  reason: collision with root package name */
    public String[] f4401i0;

    /* renamed from: j0  reason: collision with root package name */
    public int[] f4402j0;

    /* renamed from: b  reason: collision with root package name */
    public z f4393b = z.LEGACY_STRICT;

    /* renamed from: c  reason: collision with root package name */
    public final char[] f4394c = new char[RecognitionOptions.UPC_E];

    /* renamed from: d  reason: collision with root package name */
    public int f4395d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f4396e = 0;
    public int f = 0;

    /* renamed from: X  reason: collision with root package name */
    public int f4389X = 0;

    /* renamed from: Y  reason: collision with root package name */
    public int f4390Y = 0;

    /* renamed from: h0  reason: collision with root package name */
    public int f4400h0 = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [c5.a, java.lang.Object] */
    static {
        C0639a.f8416a = new Object();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f4399g0 = iArr;
        iArr[0] = 6;
        this.f4401i0 = new String[32];
        this.f4402j0 = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f4392a = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        r11.f4395d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
        r1.append(r5, r3, r2 - r3);
        r11.f4395d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f4395d
            int r3 = r11.f4396e
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r11.f4394c
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L6c
            int r8 = r2 + 1
            char r2 = r5[r2]
            I4.z r9 = r11.f4393b
            I4.z r10 = I4.z.STRICT
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.L(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.f4395d = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L32
            java.lang.String r12 = new java.lang.String
            r12.<init>(r5, r3, r8)
            return r12
        L32:
            r1.append(r5, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L3a:
            r9 = 92
            if (r2 != r9) goto L5f
            r11.f4395d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L50
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L50:
            r1.append(r5, r3, r2)
            char r2 = r11.F()
            r1.append(r2)
            int r2 = r11.f4395d
            int r3 = r11.f4396e
            goto L6
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r11.f
            int r2 = r2 + r6
            r11.f = r2
            r11.f4389X = r8
        L6a:
            r2 = r8
            goto L8
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r11.f4395d = r2
            boolean r2 = r11.m(r6)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.L(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.a.A(char):java.lang.String");
    }

    public String B() {
        String str;
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 10) {
            str = C();
        } else if (i7 == 8) {
            str = A('\'');
        } else if (i7 == 9) {
            str = A('\"');
        } else if (i7 == 11) {
            str = this.f4398f0;
            this.f4398f0 = null;
        } else if (i7 == 15) {
            str = Long.toString(this.f4391Z);
        } else if (i7 == 16) {
            str = new String(this.f4394c, this.f4395d, this.f4397e0);
            this.f4395d += this.f4397e0;
        } else {
            throw M("a string");
        }
        this.f4390Y = 0;
        int[] iArr = this.f4402j0;
        int i8 = this.f4400h0 - 1;
        iArr[i8] = iArr[i8] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        c();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String C() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f4395d
            int r4 = r3 + r2
            int r5 = r7.f4396e
            char[] r6 = r7.f4394c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.c()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f4395d
            r0.append(r6, r3, r2)
            int r3 = r7.f4395d
            int r3 = r3 + r2
            r7.f4395d = r3
            r2 = 1
            boolean r2 = r7.m(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f4395d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f4395d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f4395d
            int r2 = r2 + r1
            r7.f4395d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.a.C():java.lang.String");
    }

    public b D() {
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        switch (i7) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void E(int i7) {
        int i8 = this.f4400h0;
        if (i8 - 1 < 255) {
            int[] iArr = this.f4399g0;
            if (i8 == iArr.length) {
                int i9 = i8 * 2;
                this.f4399g0 = Arrays.copyOf(iArr, i9);
                this.f4402j0 = Arrays.copyOf(this.f4402j0, i9);
                this.f4401i0 = (String[]) Arrays.copyOf(this.f4401i0, i9);
            }
            int[] iArr2 = this.f4399g0;
            int i10 = this.f4400h0;
            this.f4400h0 = i10 + 1;
            iArr2[i10] = i7;
            return;
        }
        throw new IOException("Nesting limit 255 reached" + s());
    }

    public final char F() {
        int i7;
        if (this.f4395d == this.f4396e && !m(1)) {
            L("Unterminated escape sequence");
            throw null;
        }
        int i8 = this.f4395d;
        int i9 = i8 + 1;
        this.f4395d = i9;
        char[] cArr = this.f4394c;
        char c8 = cArr[i8];
        if (c8 != '\n') {
            if (c8 != '\"') {
                if (c8 != '\'') {
                    if (c8 != '/' && c8 != '\\') {
                        if (c8 != 'b') {
                            if (c8 != 'f') {
                                if (c8 == 'n') {
                                    return '\n';
                                }
                                if (c8 != 'r') {
                                    if (c8 != 't') {
                                        if (c8 == 'u') {
                                            if (i8 + 5 > this.f4396e && !m(4)) {
                                                L("Unterminated escape sequence");
                                                throw null;
                                            }
                                            int i10 = this.f4395d;
                                            int i11 = i10 + 4;
                                            int i12 = 0;
                                            while (i10 < i11) {
                                                char c9 = cArr[i10];
                                                int i13 = i12 << 4;
                                                if (c9 >= '0' && c9 <= '9') {
                                                    i7 = c9 - '0';
                                                } else if (c9 >= 'a' && c9 <= 'f') {
                                                    i7 = c9 - 'W';
                                                } else if (c9 >= 'A' && c9 <= 'F') {
                                                    i7 = c9 - '7';
                                                } else {
                                                    L("Malformed Unicode escape \\u".concat(new String(cArr, this.f4395d, 4)));
                                                    throw null;
                                                }
                                                i12 = i7 + i13;
                                                i10++;
                                            }
                                            this.f4395d += 4;
                                            return (char) i12;
                                        }
                                        L("Invalid escape sequence");
                                        throw null;
                                    }
                                    return '\t';
                                }
                                return '\r';
                            }
                            return '\f';
                        }
                        return '\b';
                    }
                }
            }
            return c8;
        } else if (this.f4393b != z.STRICT) {
            this.f++;
            this.f4389X = i9;
        } else {
            L("Cannot escape a newline character in strict mode");
            throw null;
        }
        if (this.f4393b == z.STRICT) {
            L("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c8;
    }

    public final void G(z zVar) {
        Objects.requireNonNull(zVar);
        this.f4393b = zVar;
    }

    public final void H(char c8) {
        do {
            int i7 = this.f4395d;
            int i8 = this.f4396e;
            while (i7 < i8) {
                int i9 = i7 + 1;
                char c9 = this.f4394c[i7];
                if (c9 == c8) {
                    this.f4395d = i9;
                    return;
                } else if (c9 == '\\') {
                    this.f4395d = i9;
                    F();
                    i7 = this.f4395d;
                    i8 = this.f4396e;
                } else {
                    if (c9 == '\n') {
                        this.f++;
                        this.f4389X = i9;
                    }
                    i7 = i9;
                }
            }
            this.f4395d = i7;
        } while (m(1));
        L("Unterminated string");
        throw null;
    }

    public final void I() {
        char c8;
        do {
            if (this.f4395d < this.f4396e || m(1)) {
                int i7 = this.f4395d;
                int i8 = i7 + 1;
                this.f4395d = i8;
                c8 = this.f4394c[i7];
                if (c8 == '\n') {
                    this.f++;
                    this.f4389X = i8;
                    return;
                }
            } else {
                return;
            }
        } while (c8 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f4395d
            int r2 = r1 + r0
            int r3 = r4.f4396e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f4394c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.c()
        L4b:
            int r1 = r4.f4395d
            int r1 = r1 + r0
            r4.f4395d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f4395d = r1
            r0 = 1
            boolean r0 = r4.m(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.a.J():void");
    }

    public void K() {
        int i7 = 0;
        do {
            int i8 = this.f4390Y;
            if (i8 == 0) {
                i8 = d();
            }
            switch (i8) {
                case 1:
                    E(3);
                    i7++;
                    break;
                case 2:
                    if (i7 == 0) {
                        this.f4401i0[this.f4400h0 - 1] = null;
                    }
                    this.f4400h0--;
                    i7--;
                    break;
                case 3:
                    E(1);
                    i7++;
                    break;
                case 4:
                    this.f4400h0--;
                    i7--;
                    break;
                case 8:
                    H('\'');
                    break;
                case 9:
                    H('\"');
                    break;
                case 10:
                    J();
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    H('\'');
                    if (i7 == 0) {
                        this.f4401i0[this.f4400h0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    H('\"');
                    if (i7 == 0) {
                        this.f4401i0[this.f4400h0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    J();
                    if (i7 == 0) {
                        this.f4401i0[this.f4400h0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    this.f4395d += this.f4397e0;
                    break;
                case 17:
                    return;
            }
            this.f4390Y = 0;
        } while (i7 > 0);
        int[] iArr = this.f4402j0;
        int i9 = this.f4400h0 - 1;
        iArr[i9] = iArr[i9] + 1;
    }

    public final void L(String str) {
        StringBuilder l8 = Y.l(str);
        l8.append(s());
        l8.append("\nSee ");
        l8.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new IOException(l8.toString());
    }

    public final IllegalStateException M(String str) {
        String str2;
        if (D() == b.NULL) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        StringBuilder m7 = Y.m("Expected ", str, " but was ");
        m7.append(D());
        m7.append(s());
        m7.append("\nSee ");
        m7.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(m7.toString());
    }

    public void a() {
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 3) {
            E(1);
            this.f4402j0[this.f4400h0 - 1] = 0;
            this.f4390Y = 0;
            return;
        }
        throw M("BEGIN_ARRAY");
    }

    public void b() {
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 1) {
            E(3);
            this.f4390Y = 0;
            return;
        }
        throw M("BEGIN_OBJECT");
    }

    public final void c() {
        if (this.f4393b == z.LENIENT) {
            return;
        }
        L("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4390Y = 0;
        this.f4399g0[0] = 8;
        this.f4400h0 = 1;
        this.f4392a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a6, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x021d, code lost:
        if (r(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0220, code lost:
        if (r6 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0222, code lost:
        if (r11 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0228, code lost:
        if (r7 != Long.MIN_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x022a, code lost:
        if (r15 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x022d, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0231, code lost:
        if (r7 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0233, code lost:
        if (r15 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0235, code lost:
        if (r15 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0238, code lost:
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0239, code lost:
        r19.f4391Z = r7;
        r19.f4395d += r9;
        r10 = 15;
        r19.f4390Y = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0245, code lost:
        if (r6 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0248, code lost:
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x024b, code lost:
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x024d, code lost:
        r19.f4397e0 = r9;
        r10 = 16;
        r19.f4390Y = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0283 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d() {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.a.d():int");
    }

    public void g() {
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 4) {
            int i8 = this.f4400h0;
            this.f4400h0 = i8 - 1;
            int[] iArr = this.f4402j0;
            int i9 = i8 - 2;
            iArr[i9] = iArr[i9] + 1;
            this.f4390Y = 0;
            return;
        }
        throw M("END_ARRAY");
    }

    public void j() {
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 2) {
            int i8 = this.f4400h0;
            int i9 = i8 - 1;
            this.f4400h0 = i9;
            this.f4401i0[i9] = null;
            int[] iArr = this.f4402j0;
            int i10 = i8 - 2;
            iArr[i10] = iArr[i10] + 1;
            this.f4390Y = 0;
            return;
        }
        throw M("END_OBJECT");
    }

    public final boolean m(int i7) {
        int i8;
        int i9;
        int i10 = this.f4389X;
        int i11 = this.f4395d;
        this.f4389X = i10 - i11;
        int i12 = this.f4396e;
        char[] cArr = this.f4394c;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f4396e = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f4396e = 0;
        }
        this.f4395d = 0;
        do {
            int i14 = this.f4396e;
            int read = this.f4392a.read(cArr, i14, cArr.length - i14);
            if (read == -1) {
                return false;
            }
            i8 = this.f4396e + read;
            this.f4396e = i8;
            if (this.f == 0 && (i9 = this.f4389X) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f4395d++;
                this.f4389X = i9 + 1;
                i7++;
                continue;
            }
        } while (i8 < i7);
        return true;
    }

    public String n() {
        return o(false);
    }

    public final String o(boolean z7) {
        StringBuilder sb = new StringBuilder("$");
        int i7 = 0;
        while (true) {
            int i8 = this.f4400h0;
            if (i7 < i8) {
                int i9 = this.f4399g0[i7];
                switch (i9) {
                    case 1:
                    case 2:
                        int i10 = this.f4402j0[i7];
                        if (z7 && i10 > 0 && i7 == i8 - 1) {
                            i10--;
                        }
                        sb.append('[');
                        sb.append(i10);
                        sb.append(']');
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb.append('.');
                        String str = this.f4401i0[i7];
                        if (str == null) {
                            break;
                        } else {
                            sb.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(io.flutter.plugins.pathprovider.b.e(i9, "Unknown scope value: "));
                }
                i7++;
            } else {
                return sb.toString();
            }
        }
    }

    public String p() {
        return o(true);
    }

    public boolean q() {
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 != 2 && i7 != 4 && i7 != 17) {
            return true;
        }
        return false;
    }

    public final boolean r(char c8) {
        if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
            if (c8 != '#') {
                if (c8 != ',') {
                    if (c8 != '/' && c8 != '=') {
                        if (c8 != '{' && c8 != '}' && c8 != ':') {
                            if (c8 != ';') {
                                switch (c8) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            c();
            return false;
        }
        return false;
    }

    final String s() {
        return " at line " + (this.f + 1) + " column " + ((this.f4395d - this.f4389X) + 1) + " path " + n();
    }

    public boolean t() {
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 5) {
            this.f4390Y = 0;
            int[] iArr = this.f4402j0;
            int i8 = this.f4400h0 - 1;
            iArr[i8] = iArr[i8] + 1;
            return true;
        } else if (i7 == 6) {
            this.f4390Y = 0;
            int[] iArr2 = this.f4402j0;
            int i9 = this.f4400h0 - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return false;
        } else {
            throw M("a boolean");
        }
    }

    public String toString() {
        return getClass().getSimpleName() + s();
    }

    public double u() {
        char c8;
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 15) {
            this.f4390Y = 0;
            int[] iArr = this.f4402j0;
            int i8 = this.f4400h0 - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f4391Z;
        }
        if (i7 == 16) {
            this.f4398f0 = new String(this.f4394c, this.f4395d, this.f4397e0);
            this.f4395d += this.f4397e0;
        } else if (i7 != 8 && i7 != 9) {
            if (i7 == 10) {
                this.f4398f0 = C();
            } else if (i7 != 11) {
                throw M("a double");
            }
        } else {
            if (i7 == 8) {
                c8 = '\'';
            } else {
                c8 = '\"';
            }
            this.f4398f0 = A(c8);
        }
        this.f4390Y = 11;
        double parseDouble = Double.parseDouble(this.f4398f0);
        if (this.f4393b != z.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            L("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f4398f0 = null;
        this.f4390Y = 0;
        int[] iArr2 = this.f4402j0;
        int i9 = this.f4400h0 - 1;
        iArr2[i9] = iArr2[i9] + 1;
        return parseDouble;
    }

    public int v() {
        char c8;
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 15) {
            long j = this.f4391Z;
            int i8 = (int) j;
            if (j == i8) {
                this.f4390Y = 0;
                int[] iArr = this.f4402j0;
                int i9 = this.f4400h0 - 1;
                iArr[i9] = iArr[i9] + 1;
                return i8;
            }
            throw new NumberFormatException("Expected an int but was " + this.f4391Z + s());
        }
        if (i7 == 16) {
            this.f4398f0 = new String(this.f4394c, this.f4395d, this.f4397e0);
            this.f4395d += this.f4397e0;
        } else if (i7 != 8 && i7 != 9 && i7 != 10) {
            throw M("an int");
        } else {
            if (i7 == 10) {
                this.f4398f0 = C();
            } else {
                if (i7 == 8) {
                    c8 = '\'';
                } else {
                    c8 = '\"';
                }
                this.f4398f0 = A(c8);
            }
            try {
                int parseInt = Integer.parseInt(this.f4398f0);
                this.f4390Y = 0;
                int[] iArr2 = this.f4402j0;
                int i10 = this.f4400h0 - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4390Y = 11;
        double parseDouble = Double.parseDouble(this.f4398f0);
        int i11 = (int) parseDouble;
        if (i11 == parseDouble) {
            this.f4398f0 = null;
            this.f4390Y = 0;
            int[] iArr3 = this.f4402j0;
            int i12 = this.f4400h0 - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return i11;
        }
        throw new NumberFormatException("Expected an int but was " + this.f4398f0 + s());
    }

    public long w() {
        char c8;
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 15) {
            this.f4390Y = 0;
            int[] iArr = this.f4402j0;
            int i8 = this.f4400h0 - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f4391Z;
        }
        if (i7 == 16) {
            this.f4398f0 = new String(this.f4394c, this.f4395d, this.f4397e0);
            this.f4395d += this.f4397e0;
        } else if (i7 != 8 && i7 != 9 && i7 != 10) {
            throw M("a long");
        } else {
            if (i7 == 10) {
                this.f4398f0 = C();
            } else {
                if (i7 == 8) {
                    c8 = '\'';
                } else {
                    c8 = '\"';
                }
                this.f4398f0 = A(c8);
            }
            try {
                long parseLong = Long.parseLong(this.f4398f0);
                this.f4390Y = 0;
                int[] iArr2 = this.f4402j0;
                int i9 = this.f4400h0 - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4390Y = 11;
        double parseDouble = Double.parseDouble(this.f4398f0);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.f4398f0 = null;
            this.f4390Y = 0;
            int[] iArr3 = this.f4402j0;
            int i10 = this.f4400h0 - 1;
            iArr3[i10] = iArr3[i10] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f4398f0 + s());
    }

    public String x() {
        String A7;
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 14) {
            A7 = C();
        } else if (i7 == 12) {
            A7 = A('\'');
        } else if (i7 == 13) {
            A7 = A('\"');
        } else {
            throw M("a name");
        }
        this.f4390Y = 0;
        this.f4401i0[this.f4400h0 - 1] = A7;
        return A7;
    }

    public final int y(boolean z7) {
        int i7 = this.f4395d;
        int i8 = this.f4396e;
        while (true) {
            if (i7 == i8) {
                this.f4395d = i7;
                if (!m(1)) {
                    if (!z7) {
                        return -1;
                    }
                    throw new EOFException("End of input" + s());
                }
                i7 = this.f4395d;
                i8 = this.f4396e;
            }
            int i9 = i7 + 1;
            char[] cArr = this.f4394c;
            char c8 = cArr[i7];
            if (c8 == '\n') {
                this.f++;
                this.f4389X = i9;
            } else if (c8 != ' ' && c8 != '\r' && c8 != '\t') {
                if (c8 == '/') {
                    this.f4395d = i9;
                    if (i9 == i8) {
                        this.f4395d = i7;
                        boolean m7 = m(2);
                        this.f4395d++;
                        if (!m7) {
                            return c8;
                        }
                    }
                    c();
                    int i10 = this.f4395d;
                    char c9 = cArr[i10];
                    if (c9 != '*') {
                        if (c9 != '/') {
                            return c8;
                        }
                        this.f4395d = i10 + 1;
                        I();
                        i7 = this.f4395d;
                        i8 = this.f4396e;
                    } else {
                        this.f4395d = i10 + 1;
                        while (true) {
                            if (this.f4395d + 2 > this.f4396e && !m(2)) {
                                L("Unterminated comment");
                                throw null;
                            }
                            int i11 = this.f4395d;
                            if (cArr[i11] == '\n') {
                                this.f++;
                                this.f4389X = i11 + 1;
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    if (cArr[this.f4395d + i12] != "*/".charAt(i12)) {
                                        break;
                                    }
                                }
                                i7 = this.f4395d + 2;
                                i8 = this.f4396e;
                                break;
                            }
                            this.f4395d++;
                        }
                    }
                } else if (c8 == '#') {
                    this.f4395d = i9;
                    c();
                    I();
                    i7 = this.f4395d;
                    i8 = this.f4396e;
                } else {
                    this.f4395d = i9;
                    return c8;
                }
            }
            i7 = i9;
        }
    }

    public void z() {
        int i7 = this.f4390Y;
        if (i7 == 0) {
            i7 = d();
        }
        if (i7 == 7) {
            this.f4390Y = 0;
            int[] iArr = this.f4402j0;
            int i8 = this.f4400h0 - 1;
            iArr[i8] = iArr[i8] + 1;
            return;
        }
        throw M("null");
    }
}
