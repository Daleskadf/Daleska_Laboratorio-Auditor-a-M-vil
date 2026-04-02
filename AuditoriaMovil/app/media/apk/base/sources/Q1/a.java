package Q1;

import A3.I;
import A3.K;
import A3.e0;
import D.AbstractC0059i;
import J1.d;
import J1.k;
import J1.l;
import K0.c;
import K0.q;
import K0.x;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import io.flutter.plugins.pathprovider.b;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import z3.h;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: X  reason: collision with root package name */
    public final int f4355X;

    /* renamed from: a  reason: collision with root package name */
    public final q f4356a = new q();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4357b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4358c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4359d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4360e;
    public final float f;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f4358c = bArr[24];
            this.f4359d = ((bArr[26] & ForkServer.ERROR) << 24) | ((bArr[27] & ForkServer.ERROR) << 16) | ((bArr[28] & ForkServer.ERROR) << 8) | (bArr[29] & ForkServer.ERROR);
            this.f4360e = "Serif".equals(new String(bArr, 43, bArr.length - 43, h.f16886c)) ? "serif" : "sans-serif";
            int i7 = bArr[25] * 20;
            this.f4355X = i7;
            boolean z7 = (bArr[0] & 32) != 0;
            this.f4357b = z7;
            if (z7) {
                this.f = x.i(((bArr[11] & ForkServer.ERROR) | ((bArr[10] & ForkServer.ERROR) << 8)) / i7, 0.0f, 0.95f);
                return;
            } else {
                this.f = 0.85f;
                return;
            }
        }
        this.f4358c = 0;
        this.f4359d = -1;
        this.f4360e = "sans-serif";
        this.f4357b = false;
        this.f = 0.85f;
        this.f4355X = -1;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        boolean z7;
        boolean z8;
        if (i7 != i8) {
            int i12 = i11 | 33;
            boolean z9 = true;
            if ((i7 & 1) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i7 & 2) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z7) {
                if (z8) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                }
            } else if (z8) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
            }
            if ((i7 & 4) == 0) {
                z9 = false;
            }
            if (z9) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            }
            if (!z9 && !z7 && !z8) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
            }
        }
    }

    @Override // J1.l
    public final /* synthetic */ void a() {
    }

    @Override // J1.l
    public final /* synthetic */ d g(byte[] bArr, int i7, int i8) {
        return AbstractC0059i.o(this, bArr, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // J1.l
    public final void l(byte[] bArr, int i7, int i8, k kVar, c cVar) {
        boolean z7;
        String s7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i9 = 1;
        q qVar = this.f4356a;
        qVar.E(bArr, i7 + i8);
        qVar.G(i7);
        int i10 = 2;
        int i11 = 0;
        if (qVar.a() >= 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        int A7 = qVar.A();
        if (A7 == 0) {
            s7 = StringUtils.EMPTY;
        } else {
            int i12 = qVar.f2514b;
            Charset C7 = qVar.C();
            int i13 = A7 - (qVar.f2514b - i12);
            if (C7 == null) {
                C7 = h.f16886c;
            }
            s7 = qVar.s(i13, C7);
        }
        if (s7.isEmpty()) {
            I i14 = K.f98b;
            cVar.accept(new J1.a(e0.f138e, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s7);
        c(spannableStringBuilder, this.f4358c, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.f4359d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f4360e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        while (qVar.a() >= 8) {
            int i15 = qVar.f2514b;
            int h8 = qVar.h();
            int h9 = qVar.h();
            if (h9 == 1937013100) {
                if (qVar.a() >= i10) {
                    z9 = i9;
                } else {
                    z9 = i11;
                }
                K0.a.e(z9);
                int A8 = qVar.A();
                int i16 = i11;
                while (i16 < A8) {
                    if (qVar.a() >= 12) {
                        z10 = i9;
                    } else {
                        z10 = i11;
                    }
                    K0.a.e(z10);
                    int A9 = qVar.A();
                    int A10 = qVar.A();
                    qVar.H(i10);
                    int u7 = qVar.u();
                    qVar.H(i9);
                    int h10 = qVar.h();
                    if (A10 > spannableStringBuilder.length()) {
                        StringBuilder k2 = b.k("Truncating styl end (", A10, ") to cueText.length() (");
                        k2.append(spannableStringBuilder.length());
                        k2.append(").");
                        K0.a.A("Tx3gParser", k2.toString());
                        A10 = spannableStringBuilder.length();
                    }
                    if (A9 >= A10) {
                        K0.a.A("Tx3gParser", AbstractC0059i.y("Ignoring styl with start (", A9, ") >= end (", A10, ")."));
                    } else {
                        int i17 = A10;
                        c(spannableStringBuilder, u7, this.f4358c, A9, i17, 0);
                        b(spannableStringBuilder, h10, this.f4359d, A9, i17, 0);
                    }
                    i9 = 1;
                    i16++;
                    i10 = 2;
                    i11 = 0;
                }
            } else if (h9 == 1952608120 && this.f4357b) {
                i10 = 2;
                if (qVar.a() >= 2) {
                    z8 = i9;
                } else {
                    z8 = 0;
                }
                K0.a.e(z8);
                f = x.i(qVar.A() / this.f4355X, 0.0f, 0.95f);
            } else {
                i10 = 2;
            }
            qVar.G(i15 + h8);
            i11 = 0;
        }
        cVar.accept(new J1.a(K.u(new J0.b(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // J1.l
    public final int m() {
        return 2;
    }
}
