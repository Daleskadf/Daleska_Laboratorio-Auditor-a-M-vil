package a6;

import D.AbstractC0059i;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f7139c = Logger.getLogger(e0.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final C0483l f7140d = new C0483l(8);

    /* renamed from: e  reason: collision with root package name */
    public static final B3.c f7141e;

    /* renamed from: a  reason: collision with root package name */
    public Object[] f7142a;

    /* renamed from: b  reason: collision with root package name */
    public int f7143b;

    static {
        B3.c cVar = B3.e.f266c;
        if (cVar.f268b != null) {
            cVar = new B3.c(cVar.f267a, (Character) null);
        }
        f7141e = cVar;
    }

    public final void a(b0 b0Var) {
        int i7;
        if (this.f7143b == 0) {
            return;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = this.f7143b;
            if (i8 < i10) {
                if (!Arrays.equals(b0Var.f7119b, e(i8))) {
                    byte[] e7 = e(i8);
                    Object[] objArr = this.f7142a;
                    int i11 = i9 * 2;
                    objArr[i11] = e7;
                    Object obj = objArr[(i8 * 2) + 1];
                    if (objArr instanceof byte[][]) {
                        if (objArr != null) {
                            i7 = objArr.length;
                        } else {
                            i7 = 0;
                        }
                        b(i7);
                    }
                    this.f7142a[i11 + 1] = obj;
                    i9++;
                }
                i8++;
            } else {
                Arrays.fill(this.f7142a, i9 * 2, i10 * 2, (Object) null);
                this.f7143b = i9;
                return;
            }
        }
    }

    public final void b(int i7) {
        Object[] objArr = new Object[i7];
        int i8 = this.f7143b;
        if (i8 != 0) {
            System.arraycopy(this.f7142a, 0, objArr, 0, i8 * 2);
        }
        this.f7142a = objArr;
    }

    public final Object c(b0 b0Var) {
        for (int i7 = this.f7143b - 1; i7 >= 0; i7--) {
            if (Arrays.equals(b0Var.f7119b, e(i7))) {
                Object obj = this.f7142a[(i7 * 2) + 1];
                if (obj instanceof byte[]) {
                    return b0Var.a((byte[]) obj);
                }
                obj.getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public final void d(e0 e0Var) {
        int i7;
        int i8 = e0Var.f7143b;
        if (i8 == 0) {
            return;
        }
        Object[] objArr = this.f7142a;
        if (objArr != null) {
            i7 = objArr.length;
        } else {
            i7 = 0;
        }
        int i9 = this.f7143b;
        int i10 = i7 - (i9 * 2);
        if (i9 == 0 || i10 < i8 * 2) {
            b((i8 * 2) + (i9 * 2));
        }
        System.arraycopy(e0Var.f7142a, 0, this.f7142a, this.f7143b * 2, e0Var.f7143b * 2);
        this.f7143b += e0Var.f7143b;
    }

    public final byte[] e(int i7) {
        return (byte[]) this.f7142a[i7 * 2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r1 == r2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(a6.b0 r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            G.i.j(r5, r0)
            java.lang.String r0 = "value"
            G.i.j(r6, r0)
            int r0 = r4.f7143b
            int r1 = r0 * 2
            if (r1 == 0) goto L19
            java.lang.Object[] r2 = r4.f7142a
            if (r2 == 0) goto L16
            int r2 = r2.length
            goto L17
        L16:
            r2 = 0
        L17:
            if (r1 != r2) goto L24
        L19:
            int r0 = r0 * 4
            r1 = 8
            int r0 = java.lang.Math.max(r0, r1)
            r4.b(r0)
        L24:
            int r0 = r4.f7143b
            java.lang.Object[] r1 = r4.f7142a
            int r2 = r0 * 2
            byte[] r3 = r5.f7119b
            r1[r2] = r3
            byte[] r5 = r5.b(r6)
            java.lang.Object[] r6 = r4.f7142a
            int r0 = r0 * 2
            int r0 = r0 + 1
            r6[r0] = r5
            int r5 = r4.f7143b
            int r5 = r5 + 1
            r4.f7143b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.e0.f(a6.b0, java.lang.Object):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i7 = 0; i7 < this.f7143b; i7++) {
            if (i7 != 0) {
                sb.append(',');
            }
            byte[] e7 = e(i7);
            Charset charset = z3.h.f16884a;
            String str = new String(e7, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                Object obj = this.f7142a[(i7 * 2) + 1];
                if (obj instanceof byte[]) {
                    sb.append(f7141e.c((byte[]) obj));
                } else {
                    AbstractC0059i.I(obj);
                    throw null;
                }
            } else {
                Object obj2 = this.f7142a[(i7 * 2) + 1];
                if (obj2 instanceof byte[]) {
                    sb.append(new String((byte[]) obj2, charset));
                } else {
                    AbstractC0059i.I(obj2);
                    throw null;
                }
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
