package S1;

import A3.K;
import A3.e0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
/* renamed from: S1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336d implements m1.o {

    /* renamed from: d  reason: collision with root package name */
    public final K0.q f4983d;

    /* renamed from: e  reason: collision with root package name */
    public final K0.p f4984e;
    public m1.q f;

    /* renamed from: g  reason: collision with root package name */
    public long f4985g;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4988k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4989l;

    /* renamed from: a  reason: collision with root package name */
    public final int f4980a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0337e f4981b = new C0337e(0, null, true);

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f4982c = new K0.q((int) RecognitionOptions.PDF417);

    /* renamed from: i  reason: collision with root package name */
    public int f4987i = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f4986h = -1;

    public C0336d() {
        K0.q qVar = new K0.q(10);
        this.f4983d = qVar;
        byte[] bArr = qVar.f2513a;
        this.f4984e = new K0.p(bArr, bArr.length);
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        this.f4988k = false;
        this.f4981b.a();
        this.f4985g = j8;
    }

    public final int b(m1.l lVar) {
        int i7 = 0;
        while (true) {
            K0.q qVar = this.f4983d;
            lVar.q(qVar.f2513a, 0, 10, false);
            qVar.G(0);
            if (qVar.x() != 4801587) {
                break;
            }
            qVar.H(3);
            int t7 = qVar.t();
            i7 += t7 + 10;
            lVar.b(t7, false);
        }
        lVar.f = 0;
        lVar.b(i7, false);
        if (this.f4986h == -1) {
            this.f4986h = i7;
        }
        return i7;
    }

    @Override // m1.o
    public final m1.o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(m1.p pVar) {
        m1.l lVar = (m1.l) pVar;
        int b5 = b(lVar);
        int i7 = b5;
        int i8 = 0;
        int i9 = 0;
        do {
            K0.q qVar = this.f4983d;
            lVar.q(qVar.f2513a, 0, 2, false);
            qVar.G(0);
            if ((qVar.A() & 65526) == 65520) {
                i8++;
                if (i8 >= 4 && i9 > 188) {
                    return true;
                }
                lVar.q(qVar.f2513a, 0, 4, false);
                K0.p pVar2 = this.f4984e;
                pVar2.q(14);
                int i10 = pVar2.i(13);
                if (i10 <= 6) {
                    i7++;
                    lVar.f = 0;
                    lVar.b(i7, false);
                } else {
                    lVar.b(i10 - 6, false);
                    i9 += i10;
                }
            } else {
                i7++;
                lVar.f = 0;
                lVar.b(i7, false);
            }
            i8 = 0;
            i9 = 0;
        } while (i7 - b5 < 8192);
        return false;
    }

    @Override // m1.o
    public final List f() {
        A3.I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        this.f = qVar;
        this.f4981b.e(qVar, new H(0, 1));
        qVar.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
        r18.j = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
        throw H0.J.a(null, "Malformed ADTS stream");
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r19, H0.C0140u r20) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.C0336d.i(m1.p, H0.u):int");
    }

    @Override // m1.o
    public final void release() {
    }
}
