package U0;

import A3.K;
import A3.e0;
import D.AbstractC0059i;
import H0.C0137q;
import H0.C0140u;
import H0.I;
import H0.J;
import K0.v;
import android.text.TextUtils;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f5.C0993a;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m1.G;
/* loaded from: classes.dex */
public final class u implements m1.o {

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f5706i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    public final String f5707a;

    /* renamed from: b  reason: collision with root package name */
    public final v f5708b;

    /* renamed from: d  reason: collision with root package name */
    public final C0993a f5710d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5711e;
    public m1.q f;

    /* renamed from: h  reason: collision with root package name */
    public int f5713h;

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f5709c = new K0.q();

    /* renamed from: g  reason: collision with root package name */
    public byte[] f5712g = new byte[RecognitionOptions.UPC_E];

    public u(String str, v vVar, C0993a c0993a, boolean z7) {
        this.f5707a = str;
        this.f5708b = vVar;
        this.f5710d = c0993a;
        this.f5711e = z7;
    }

    @Override // m1.o
    public final void a(long j8, long j9) {
        throw new IllegalStateException();
    }

    public final G b(long j8) {
        G s7 = this.f.s(0, 3);
        C0137q c0137q = new C0137q();
        c0137q.f1850l = I.l("text/vtt");
        c0137q.f1844d = this.f5707a;
        c0137q.f1855q = j8;
        AbstractC0059i.H(c0137q, s7);
        this.f.h();
        return s7;
    }

    @Override // m1.o
    public final m1.o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(m1.p pVar) {
        m1.l lVar = (m1.l) pVar;
        lVar.q(this.f5712g, 0, 6, false);
        byte[] bArr = this.f5712g;
        K0.q qVar = this.f5709c;
        qVar.E(bArr, 6);
        if (R1.i.a(qVar)) {
            return true;
        }
        lVar.q(this.f5712g, 6, 3, false);
        qVar.E(this.f5712g, 9);
        return R1.i.a(qVar);
    }

    @Override // m1.o
    public final List f() {
        A3.I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        m1.q qVar2;
        if (this.f5711e) {
            qVar2 = new V2.k(qVar, this.f5710d);
        } else {
            qVar2 = qVar;
        }
        this.f = qVar2;
        qVar.x(new m1.s(-9223372036854775807L));
    }

    @Override // m1.o
    public final int i(m1.p pVar, C0140u c0140u) {
        String i7;
        int length;
        this.f.getClass();
        int i8 = (int) ((m1.l) pVar).f13973c;
        int i9 = this.f5713h;
        byte[] bArr = this.f5712g;
        if (i9 == bArr.length) {
            if (i8 != -1) {
                length = i8;
            } else {
                length = bArr.length;
            }
            this.f5712g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f5712g;
        int i10 = this.f5713h;
        int read = ((m1.l) pVar).read(bArr2, i10, bArr2.length - i10);
        if (read != -1) {
            int i11 = this.f5713h + read;
            this.f5713h = i11;
            if (i8 == -1 || i11 != i8) {
                return 0;
            }
        }
        K0.q qVar = new K0.q(this.f5712g);
        R1.i.d(qVar);
        String i12 = qVar.i(z3.h.f16886c);
        long j8 = 0;
        long j9 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(i12)) {
                if (i12.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f5706i.matcher(i12);
                    if (matcher2.find()) {
                        Matcher matcher3 = j.matcher(i12);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j9 = R1.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j8 = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw J.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(i12));
                        }
                    } else {
                        throw J.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(i12));
                    }
                }
                i12 = qVar.i(z3.h.f16886c);
            } else {
                while (true) {
                    String i13 = qVar.i(z3.h.f16886c);
                    if (i13 == null) {
                        break;
                    } else if (R1.i.f4680a.matcher(i13).matches()) {
                        do {
                            i7 = qVar.i(z3.h.f16886c);
                            if (i7 != null) {
                            }
                        } while (!i7.isEmpty());
                    } else {
                        Matcher matcher4 = R1.h.f4676a.matcher(i13);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c8 = R1.i.c(group3);
                long b5 = this.f5708b.b(((((j8 + c8) - j9) * 90000) / 1000000) % 8589934592L);
                G b7 = b(b5 - c8);
                byte[] bArr3 = this.f5712g;
                int i14 = this.f5713h;
                K0.q qVar2 = this.f5709c;
                qVar2.E(bArr3, i14);
                b7.d(this.f5713h, qVar2);
                b7.e(b5, 1, this.f5713h, 0, null);
                return -1;
            }
        }
    }

    @Override // m1.o
    public final void release() {
    }
}
