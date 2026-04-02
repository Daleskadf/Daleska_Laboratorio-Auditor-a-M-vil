package S1;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final m1.G f5058a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5059b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5060c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5061d;

    /* renamed from: e  reason: collision with root package name */
    public int f5062e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f5063g;

    /* renamed from: h  reason: collision with root package name */
    public long f5064h;

    public m(m1.G g3) {
        this.f5058a = g3;
    }

    public final void a(byte[] bArr, int i7, int i8) {
        boolean z7;
        if (this.f5060c) {
            int i9 = this.f;
            int i10 = (i7 + 1) - i9;
            if (i10 < i8) {
                if (((bArr[i10] & 192) >> 6) == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.f5061d = z7;
                this.f5060c = false;
                return;
            }
            this.f = (i8 - i7) + i9;
        }
    }

    public final void b(int i7, long j, boolean z7) {
        boolean z8;
        if (this.f5064h != -9223372036854775807L) {
            z8 = true;
        } else {
            z8 = false;
        }
        K0.a.j(z8);
        if (this.f5062e == 182 && z7 && this.f5059b) {
            boolean z9 = this.f5061d;
            long j8 = this.f5064h;
            this.f5058a.e(j8, z9 ? 1 : 0, (int) (j - this.f5063g), i7, null);
        }
        if (this.f5062e != 179) {
            this.f5063g = j;
        }
    }
}
