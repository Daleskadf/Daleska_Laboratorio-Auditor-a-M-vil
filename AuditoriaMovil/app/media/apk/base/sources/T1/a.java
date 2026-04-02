package T1;

import G1.i;
import H0.C0137q;
import H0.I;
import H0.J;
import H0.r;
import K0.x;
import java.math.RoundingMode;
import m1.G;
import m1.q;
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f5293m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f5294n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a  reason: collision with root package name */
    public final q f5295a;

    /* renamed from: b  reason: collision with root package name */
    public final G f5296b;

    /* renamed from: c  reason: collision with root package name */
    public final i f5297c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5298d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f5299e;
    public final K0.q f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5300g;

    /* renamed from: h  reason: collision with root package name */
    public final r f5301h;

    /* renamed from: i  reason: collision with root package name */
    public int f5302i;
    public long j;

    /* renamed from: k  reason: collision with root package name */
    public int f5303k;

    /* renamed from: l  reason: collision with root package name */
    public long f5304l;

    public a(q qVar, G g3, i iVar) {
        this.f5295a = qVar;
        this.f5296b = g3;
        this.f5297c = iVar;
        int i7 = iVar.f1376b;
        int max = Math.max(1, i7 / 10);
        this.f5300g = max;
        K0.q qVar2 = new K0.q((byte[]) iVar.f1379e);
        qVar2.n();
        int n7 = qVar2.n();
        this.f5298d = n7;
        int i8 = iVar.f1375a;
        int i9 = iVar.f1377c;
        int i10 = (((i9 - (i8 * 4)) * 8) / (iVar.f1378d * i8)) + 1;
        if (n7 == i10) {
            int g4 = x.g(max, n7);
            this.f5299e = new byte[g4 * i9];
            this.f = new K0.q(n7 * 2 * i8 * g4);
            int i11 = ((i9 * i7) * 8) / n7;
            C0137q c0137q = new C0137q();
            c0137q.f1850l = I.l("audio/raw");
            c0137q.f1846g = i11;
            c0137q.f1847h = i11;
            c0137q.f1851m = max * 2 * i8;
            c0137q.f1864z = i8;
            c0137q.f1832A = i7;
            c0137q.f1833B = 2;
            this.f5301h = new r(c0137q);
            return;
        }
        throw J.a(null, "Expected frames per block: " + i10 + "; got: " + n7);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0045->B:14:0x0045 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please submit an issue!!! */
    @Override // T1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(m1.l r26, long r27) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.a.a(m1.l, long):boolean");
    }

    @Override // T1.b
    public final void b(int i7, long j) {
        this.f5295a.x(new f(this.f5297c, this.f5298d, i7, j));
        this.f5296b.c(this.f5301h);
    }

    @Override // T1.b
    public final void c(long j) {
        this.f5302i = 0;
        this.j = j;
        this.f5303k = 0;
        this.f5304l = 0L;
    }

    public final void d(int i7) {
        long j = this.j;
        long j8 = this.f5304l;
        i iVar = this.f5297c;
        long j9 = iVar.f1376b;
        int i8 = x.f2529a;
        long U7 = j + x.U(j8, 1000000L, j9, RoundingMode.FLOOR);
        int i9 = i7 * 2 * iVar.f1375a;
        this.f5296b.e(U7, 1, i9, this.f5303k - i9, null);
        this.f5304l += i7;
        this.f5303k -= i9;
    }
}
