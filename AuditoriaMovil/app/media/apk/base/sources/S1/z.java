package S1;

import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5209a;

    /* renamed from: b  reason: collision with root package name */
    public final K0.v f5210b;

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f5211c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5212d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5213e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public long f5214g;

    /* renamed from: h  reason: collision with root package name */
    public long f5215h;

    /* renamed from: i  reason: collision with root package name */
    public long f5216i;

    public z(int i7) {
        this.f5209a = i7;
        switch (i7) {
            case 1:
                this.f5210b = new K0.v(0L);
                this.f5214g = -9223372036854775807L;
                this.f5215h = -9223372036854775807L;
                this.f5216i = -9223372036854775807L;
                this.f5211c = new K0.q();
                return;
            default:
                this.f5210b = new K0.v(0L);
                this.f5214g = -9223372036854775807L;
                this.f5215h = -9223372036854775807L;
                this.f5216i = -9223372036854775807L;
                this.f5211c = new K0.q();
                return;
        }
    }

    public static int b(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & ForkServer.ERROR) | ((bArr[i7] & ForkServer.ERROR) << 24) | ((bArr[i7 + 1] & ForkServer.ERROR) << 16) | ((bArr[i7 + 2] & ForkServer.ERROR) << 8);
    }

    public static long c(K0.q qVar) {
        int i7 = qVar.f2514b;
        if (qVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        qVar.f(bArr, 0, 9);
        qVar.G(i7);
        byte b5 = bArr[0];
        if ((b5 & 196) == 68) {
            byte b7 = bArr[2];
            if ((b7 & 4) == 4) {
                byte b8 = bArr[4];
                if ((b8 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b5;
                    long j8 = b7;
                    return ((j8 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j8 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b8 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(m1.l lVar) {
        switch (this.f5209a) {
            case 0:
                byte[] bArr = K0.x.f;
                K0.q qVar = this.f5211c;
                qVar.getClass();
                qVar.E(bArr, bArr.length);
                this.f5212d = true;
                lVar.f = 0;
                return;
            default:
                byte[] bArr2 = K0.x.f;
                K0.q qVar2 = this.f5211c;
                qVar2.getClass();
                qVar2.E(bArr2, bArr2.length);
                this.f5212d = true;
                lVar.f = 0;
                return;
        }
    }
}
