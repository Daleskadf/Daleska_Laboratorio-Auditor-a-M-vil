package Q4;

import I4.i;
import I4.z;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* renamed from: g0  reason: collision with root package name */
    public static final Pattern f4403g0 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: h0  reason: collision with root package name */
    public static final String[] f4404h0 = new String[RecognitionOptions.ITF];

    /* renamed from: i0  reason: collision with root package name */
    public static final String[] f4405i0;

    /* renamed from: X  reason: collision with root package name */
    public boolean f4406X;

    /* renamed from: Y  reason: collision with root package name */
    public z f4407Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f4408Z;

    /* renamed from: a  reason: collision with root package name */
    public final Writer f4409a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f4410b;

    /* renamed from: c  reason: collision with root package name */
    public int f4411c;

    /* renamed from: d  reason: collision with root package name */
    public i f4412d;

    /* renamed from: e  reason: collision with root package name */
    public String f4413e;

    /* renamed from: e0  reason: collision with root package name */
    public String f4414e0;
    public String f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f4415f0;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f4404h0[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f4404h0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4405i0 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f4410b = iArr;
        this.f4411c = 0;
        if (iArr.length == 0) {
            this.f4410b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f4410b;
        int i7 = this.f4411c;
        this.f4411c = i7 + 1;
        iArr2[i7] = 6;
        this.f4407Y = z.LEGACY_STRICT;
        this.f4415f0 = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4409a = writer;
        q(i.f2201d);
    }

    public final void a() {
        int p7 = p();
        if (p7 != 1) {
            Writer writer = this.f4409a;
            if (p7 != 2) {
                if (p7 != 4) {
                    if (p7 != 6) {
                        if (p7 == 7) {
                            if (this.f4407Y != z.LENIENT) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f4410b[this.f4411c - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f4413e);
                this.f4410b[this.f4411c - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.f);
            n();
            return;
        }
        this.f4410b[this.f4411c - 1] = 2;
        n();
    }

    public void b() {
        z();
        a();
        int i7 = this.f4411c;
        int[] iArr = this.f4410b;
        if (i7 == iArr.length) {
            this.f4410b = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = this.f4410b;
        int i8 = this.f4411c;
        this.f4411c = i8 + 1;
        iArr2[i8] = 1;
        this.f4409a.write(91);
    }

    public void c() {
        z();
        a();
        int i7 = this.f4411c;
        int[] iArr = this.f4410b;
        if (i7 == iArr.length) {
            this.f4410b = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = this.f4410b;
        int i8 = this.f4411c;
        this.f4411c = i8 + 1;
        iArr2[i8] = 3;
        this.f4409a.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4409a.close();
        int i7 = this.f4411c;
        if (i7 <= 1 && (i7 != 1 || this.f4410b[i7 - 1] == 7)) {
            this.f4411c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d(int i7, int i8, char c8) {
        int p7 = p();
        if (p7 != i8 && p7 != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4414e0 == null) {
            this.f4411c--;
            if (p7 == i8) {
                n();
            }
            this.f4409a.write(c8);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f4414e0);
    }

    public void flush() {
        if (this.f4411c != 0) {
            this.f4409a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g() {
        d(1, 2, ']');
    }

    public void j() {
        d(3, 5, '}');
    }

    public void m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4414e0 == null) {
            int p7 = p();
            if (p7 != 3 && p7 != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.f4414e0 = str;
            return;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void n() {
        if (this.f4406X) {
            return;
        }
        String str = this.f4412d.f2202a;
        Writer writer = this.f4409a;
        writer.write(str);
        int i7 = this.f4411c;
        for (int i8 = 1; i8 < i7; i8++) {
            writer.write(this.f4412d.f2203b);
        }
    }

    public c o() {
        if (this.f4414e0 != null) {
            if (this.f4415f0) {
                z();
            } else {
                this.f4414e0 = null;
                return this;
            }
        }
        a();
        this.f4409a.write("null");
        return this;
    }

    public final int p() {
        int i7 = this.f4411c;
        if (i7 != 0) {
            return this.f4410b[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void q(i iVar) {
        boolean z7;
        Objects.requireNonNull(iVar);
        this.f4412d = iVar;
        this.f = ",";
        if (iVar.f2204c) {
            this.f4413e = ": ";
            if (iVar.f2202a.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.f4413e = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
        }
        if (this.f4412d.f2202a.isEmpty() && this.f4412d.f2203b.isEmpty()) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f4406X = z7;
    }

    public final void r(z zVar) {
        Objects.requireNonNull(zVar);
        this.f4407Y = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f4408Z
            if (r0 == 0) goto L7
            java.lang.String[] r0 = Q4.c.f4405i0
            goto L9
        L7:
            java.lang.String[] r0 = Q4.c.f4404h0
        L9:
            java.io.Writer r1 = r8.f4409a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.794E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.c.s(java.lang.String):void");
    }

    public void t(double d7) {
        z();
        if (this.f4407Y != z.LENIENT && (Double.isNaN(d7) || Double.isInfinite(d7))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d7);
        }
        a();
        this.f4409a.append((CharSequence) Double.toString(d7));
    }

    public void u(long j) {
        z();
        a();
        this.f4409a.write(Long.toString(j));
    }

    public void v(Boolean bool) {
        String str;
        if (bool == null) {
            o();
            return;
        }
        z();
        a();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.f4409a.write(str);
    }

    public void w(Number number) {
        if (number == null) {
            o();
            return;
        }
        z();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !f4403g0.matcher(obj).matches()) {
                    throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
                }
            } else if (this.f4407Y != z.LENIENT) {
                throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
            }
        }
        a();
        this.f4409a.append((CharSequence) obj);
    }

    public void x(String str) {
        if (str == null) {
            o();
            return;
        }
        z();
        a();
        s(str);
    }

    public void y(boolean z7) {
        String str;
        z();
        a();
        if (z7) {
            str = "true";
        } else {
            str = "false";
        }
        this.f4409a.write(str);
    }

    public final void z() {
        if (this.f4414e0 != null) {
            int p7 = p();
            if (p7 == 5) {
                this.f4409a.write(this.f);
            } else if (p7 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            n();
            this.f4410b[this.f4411c - 1] = 4;
            s(this.f4414e0);
            this.f4414e0 = null;
        }
    }
}
