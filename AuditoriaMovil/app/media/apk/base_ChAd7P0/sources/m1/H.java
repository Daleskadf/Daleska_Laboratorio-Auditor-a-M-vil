package m1;

import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13896a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    public boolean f13897b;

    /* renamed from: c  reason: collision with root package name */
    public int f13898c;

    /* renamed from: d  reason: collision with root package name */
    public long f13899d;

    /* renamed from: e  reason: collision with root package name */
    public int f13900e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f13901g;

    public final void a(G g3, F f) {
        if (this.f13898c > 0) {
            g3.e(this.f13899d, this.f13900e, this.f, this.f13901g, f);
            this.f13898c = 0;
        }
    }

    public final void b(G g3, long j, int i7, int i8, int i9, F f) {
        boolean z7;
        if (this.f13901g <= i8 + i9) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.i("TrueHD chunk samples must be contiguous in the sample queue.", z7);
        if (!this.f13897b) {
            return;
        }
        int i10 = this.f13898c;
        int i11 = i10 + 1;
        this.f13898c = i11;
        if (i10 == 0) {
            this.f13899d = j;
            this.f13900e = i7;
            this.f = 0;
        }
        this.f += i8;
        this.f13901g = i9;
        if (i11 >= 16) {
            a(g3, f);
        }
    }

    public final void c(p pVar) {
        char c8;
        if (this.f13897b) {
            return;
        }
        byte[] bArr = this.f13896a;
        int i7 = 0;
        pVar.v(bArr, 0, 10);
        pVar.l();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b5 = bArr[7];
            if ((b5 & 254) == 186) {
                if ((b5 & ForkServer.ERROR) == 187) {
                    c8 = '\t';
                } else {
                    c8 = '\b';
                }
                i7 = 40 << ((bArr[c8] >> 4) & 7);
            }
        }
        if (i7 == 0) {
            return;
        }
        this.f13897b = true;
    }
}
