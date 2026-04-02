package G1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import m1.G;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final G f1388a;

    /* renamed from: d  reason: collision with root package name */
    public x f1391d;

    /* renamed from: e  reason: collision with root package name */
    public k f1392e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f1393g;

    /* renamed from: h  reason: collision with root package name */
    public int f1394h;

    /* renamed from: i  reason: collision with root package name */
    public int f1395i;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1397l;

    /* renamed from: b  reason: collision with root package name */
    public final w f1389b = new w();

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f1390c = new K0.q();
    public final K0.q j = new K0.q(1);

    /* renamed from: k  reason: collision with root package name */
    public final K0.q f1396k = new K0.q();

    public m(G g3, x xVar, k kVar) {
        this.f1388a = g3;
        this.f1391d = xVar;
        this.f1392e = kVar;
        this.f1391d = xVar;
        this.f1392e = kVar;
        g3.c(xVar.f1504a.f);
        d();
    }

    public final v a() {
        if (!this.f1397l) {
            return null;
        }
        w wVar = this.f1389b;
        k kVar = wVar.f1489a;
        int i7 = K0.x.f2529a;
        int i8 = kVar.f1381a;
        v vVar = wVar.f1499m;
        if (vVar == null) {
            v[] vVarArr = this.f1391d.f1504a.f1483k;
            if (vVarArr == null) {
                vVar = null;
            } else {
                vVar = vVarArr[i8];
            }
        }
        if (vVar == null || !vVar.f1484a) {
            return null;
        }
        return vVar;
    }

    public final boolean b() {
        this.f++;
        if (!this.f1397l) {
            return false;
        }
        int i7 = this.f1393g + 1;
        this.f1393g = i7;
        int[] iArr = this.f1389b.f1494g;
        int i8 = this.f1394h;
        if (i7 != iArr[i8]) {
            return true;
        }
        this.f1394h = i8 + 1;
        this.f1393g = 0;
        return false;
    }

    public final int c(int i7, int i8) {
        K0.q qVar;
        boolean z7;
        boolean z8;
        int i9;
        v a7 = a();
        if (a7 == null) {
            return 0;
        }
        w wVar = this.f1389b;
        int i10 = a7.f1487d;
        if (i10 != 0) {
            qVar = wVar.f1500n;
        } else {
            int i11 = K0.x.f2529a;
            byte[] bArr = a7.f1488e;
            int length = bArr.length;
            K0.q qVar2 = this.f1396k;
            qVar2.E(bArr, length);
            i10 = bArr.length;
            qVar = qVar2;
        }
        int i12 = this.f;
        if (wVar.f1497k && wVar.f1498l[i12]) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 && i8 == 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        K0.q qVar3 = this.j;
        byte[] bArr2 = qVar3.f2513a;
        if (z8) {
            i9 = RecognitionOptions.ITF;
        } else {
            i9 = 0;
        }
        bArr2[0] = (byte) (i9 | i10);
        qVar3.G(0);
        G g3 = this.f1388a;
        g3.a(qVar3, 1, 1);
        g3.a(qVar, i10, 1);
        if (!z8) {
            return i10 + 1;
        }
        K0.q qVar4 = this.f1390c;
        if (!z7) {
            qVar4.D(8);
            byte[] bArr3 = qVar4.f2513a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i8 & 255);
            bArr3[4] = (byte) ((i7 >> 24) & 255);
            bArr3[5] = (byte) ((i7 >> 16) & 255);
            bArr3[6] = (byte) ((i7 >> 8) & 255);
            bArr3[7] = (byte) (i7 & 255);
            g3.a(qVar4, 8, 1);
            return i10 + 9;
        }
        K0.q qVar5 = wVar.f1500n;
        int A7 = qVar5.A();
        qVar5.H(-2);
        int i13 = (A7 * 6) + 2;
        if (i8 != 0) {
            qVar4.D(i13);
            byte[] bArr4 = qVar4.f2513a;
            qVar5.f(bArr4, 0, i13);
            int i14 = (((bArr4[2] & ForkServer.ERROR) << 8) | (bArr4[3] & ForkServer.ERROR)) + i8;
            bArr4[2] = (byte) ((i14 >> 8) & 255);
            bArr4[3] = (byte) (i14 & 255);
        } else {
            qVar4 = qVar5;
        }
        g3.a(qVar4, i13, 1);
        return i10 + 1 + i13;
    }

    public final void d() {
        w wVar = this.f1389b;
        wVar.f1492d = 0;
        wVar.f1502p = 0L;
        wVar.f1503q = false;
        wVar.f1497k = false;
        wVar.f1501o = false;
        wVar.f1499m = null;
        this.f = 0;
        this.f1394h = 0;
        this.f1393g = 0;
        this.f1395i = 0;
        this.f1397l = false;
    }
}
