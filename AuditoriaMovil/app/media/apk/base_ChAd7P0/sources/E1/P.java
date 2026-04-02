package e1;

import android.media.MediaCodec;
import i1.C1100a;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final i1.e f10715a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10716b;

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f10717c;

    /* renamed from: d  reason: collision with root package name */
    public G1.e f10718d;

    /* renamed from: e  reason: collision with root package name */
    public G1.e f10719e;
    public G1.e f;

    /* renamed from: g  reason: collision with root package name */
    public long f10720g;

    public P(i1.e eVar) {
        this.f10715a = eVar;
        int i7 = eVar.f11391b;
        this.f10716b = i7;
        this.f10717c = new K0.q(32);
        G1.e eVar2 = new G1.e(i7, 0L);
        this.f10718d = eVar2;
        this.f10719e = eVar2;
        this.f = eVar2;
    }

    public static G1.e d(G1.e eVar, long j, ByteBuffer byteBuffer, int i7) {
        while (j >= eVar.f1364b) {
            eVar = (G1.e) eVar.f1366d;
        }
        while (i7 > 0) {
            int min = Math.min(i7, (int) (eVar.f1364b - j));
            C1100a c1100a = (C1100a) eVar.f1365c;
            byteBuffer.put(c1100a.f11381a, ((int) (j - eVar.f1363a)) + c1100a.f11382b, min);
            i7 -= min;
            j += min;
            if (j == eVar.f1364b) {
                eVar = (G1.e) eVar.f1366d;
            }
        }
        return eVar;
    }

    public static G1.e e(G1.e eVar, long j, byte[] bArr, int i7) {
        while (j >= eVar.f1364b) {
            eVar = (G1.e) eVar.f1366d;
        }
        int i8 = i7;
        while (i8 > 0) {
            int min = Math.min(i8, (int) (eVar.f1364b - j));
            C1100a c1100a = (C1100a) eVar.f1365c;
            System.arraycopy(c1100a.f11381a, ((int) (j - eVar.f1363a)) + c1100a.f11382b, bArr, i7 - i8, min);
            i8 -= min;
            j += min;
            if (j == eVar.f1364b) {
                eVar = (G1.e) eVar.f1366d;
            }
        }
        return eVar;
    }

    public static G1.e f(G1.e eVar, N0.f fVar, B2.c cVar, K0.q qVar) {
        boolean z7;
        int i7;
        if (fVar.c(1073741824)) {
            long j = cVar.f250b;
            qVar.D(1);
            G1.e e7 = e(eVar, j, qVar.f2513a, 1);
            long j8 = j + 1;
            byte b5 = qVar.f2513a[0];
            if ((b5 & 128) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i8 = b5 & Byte.MAX_VALUE;
            N0.b bVar = fVar.f3349d;
            byte[] bArr = bVar.f3337a;
            if (bArr == null) {
                bVar.f3337a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            eVar = e(e7, j8, bVar.f3337a, i8);
            long j9 = j8 + i8;
            if (z7) {
                qVar.D(2);
                eVar = e(eVar, j9, qVar.f2513a, 2);
                j9 += 2;
                i7 = qVar.A();
            } else {
                i7 = 1;
            }
            int[] iArr = bVar.f3340d;
            if (iArr == null || iArr.length < i7) {
                iArr = new int[i7];
            }
            int[] iArr2 = bVar.f3341e;
            if (iArr2 == null || iArr2.length < i7) {
                iArr2 = new int[i7];
            }
            if (z7) {
                int i9 = i7 * 6;
                qVar.D(i9);
                eVar = e(eVar, j9, qVar.f2513a, i9);
                j9 += i9;
                qVar.G(0);
                for (int i10 = 0; i10 < i7; i10++) {
                    iArr[i10] = qVar.A();
                    iArr2[i10] = qVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cVar.f249a - ((int) (j9 - cVar.f250b));
            }
            m1.F f = (m1.F) cVar.f251c;
            int i11 = K0.x.f2529a;
            byte[] bArr2 = f.f13893b;
            byte[] bArr3 = bVar.f3337a;
            bVar.f = i7;
            bVar.f3340d = iArr;
            bVar.f3341e = iArr2;
            bVar.f3338b = bArr2;
            bVar.f3337a = bArr3;
            int i12 = f.f13892a;
            bVar.f3339c = i12;
            int i13 = f.f13894c;
            bVar.f3342g = i13;
            int i14 = f.f13895d;
            bVar.f3343h = i14;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f3344i;
            cryptoInfo.numSubSamples = i7;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i12;
            if (K0.x.f2529a >= 24) {
                M0.x xVar = bVar.j;
                xVar.getClass();
                ((MediaCodec.CryptoInfo.Pattern) xVar.f3211c).set(i13, i14);
                ((MediaCodec.CryptoInfo) xVar.f3210b).setPattern((MediaCodec.CryptoInfo.Pattern) xVar.f3211c);
            }
            long j10 = cVar.f250b;
            int i15 = (int) (j9 - j10);
            cVar.f250b = j10 + i15;
            cVar.f249a -= i15;
        }
        if (fVar.c(268435456)) {
            qVar.D(4);
            G1.e e8 = e(eVar, cVar.f250b, qVar.f2513a, 4);
            int y2 = qVar.y();
            cVar.f250b += 4;
            cVar.f249a -= 4;
            fVar.h(y2);
            G1.e d7 = d(e8, cVar.f250b, fVar.f3350e, y2);
            cVar.f250b += y2;
            int i16 = cVar.f249a - y2;
            cVar.f249a = i16;
            ByteBuffer byteBuffer = fVar.f3346Y;
            if (byteBuffer != null && byteBuffer.capacity() >= i16) {
                fVar.f3346Y.clear();
            } else {
                fVar.f3346Y = ByteBuffer.allocate(i16);
            }
            return d(d7, cVar.f250b, fVar.f3346Y, cVar.f249a);
        }
        fVar.h(cVar.f249a);
        return d(eVar, cVar.f250b, fVar.f3350e, cVar.f249a);
    }

    public final void a(G1.e eVar) {
        if (((C1100a) eVar.f1365c) == null) {
            return;
        }
        i1.e eVar2 = this.f10715a;
        synchronized (eVar2) {
            G1.e eVar3 = eVar;
            while (eVar3 != null) {
                try {
                    C1100a[] c1100aArr = eVar2.f;
                    int i7 = eVar2.f11394e;
                    eVar2.f11394e = i7 + 1;
                    C1100a c1100a = (C1100a) eVar3.f1365c;
                    c1100a.getClass();
                    c1100aArr[i7] = c1100a;
                    eVar2.f11393d--;
                    eVar3 = (G1.e) eVar3.f1366d;
                    if (eVar3 == null || ((C1100a) eVar3.f1365c) == null) {
                        eVar3 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar2.notifyAll();
        }
        eVar.f1365c = null;
        eVar.f1366d = null;
    }

    public final void b(long j) {
        G1.e eVar;
        if (j == -1) {
            return;
        }
        while (true) {
            eVar = this.f10718d;
            if (j < eVar.f1364b) {
                break;
            }
            i1.e eVar2 = this.f10715a;
            C1100a c1100a = (C1100a) eVar.f1365c;
            synchronized (eVar2) {
                C1100a[] c1100aArr = eVar2.f;
                int i7 = eVar2.f11394e;
                eVar2.f11394e = i7 + 1;
                c1100aArr[i7] = c1100a;
                eVar2.f11393d--;
                eVar2.notifyAll();
            }
            G1.e eVar3 = this.f10718d;
            eVar3.f1365c = null;
            eVar3.f1366d = null;
            this.f10718d = (G1.e) eVar3.f1366d;
        }
        if (this.f10719e.f1363a < eVar.f1363a) {
            this.f10719e = eVar;
        }
    }

    public final int c(int i7) {
        C1100a c1100a;
        G1.e eVar = this.f;
        if (((C1100a) eVar.f1365c) == null) {
            i1.e eVar2 = this.f10715a;
            synchronized (eVar2) {
                try {
                    int i8 = eVar2.f11393d + 1;
                    eVar2.f11393d = i8;
                    int i9 = eVar2.f11394e;
                    if (i9 > 0) {
                        C1100a[] c1100aArr = eVar2.f;
                        int i10 = i9 - 1;
                        eVar2.f11394e = i10;
                        c1100a = c1100aArr[i10];
                        c1100a.getClass();
                        eVar2.f[eVar2.f11394e] = null;
                    } else {
                        C1100a c1100a2 = new C1100a(new byte[eVar2.f11391b], 0);
                        C1100a[] c1100aArr2 = eVar2.f;
                        if (i8 > c1100aArr2.length) {
                            eVar2.f = (C1100a[]) Arrays.copyOf(c1100aArr2, c1100aArr2.length * 2);
                        }
                        c1100a = c1100a2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            G1.e eVar3 = new G1.e(this.f10716b, this.f.f1364b);
            eVar.f1365c = c1100a;
            eVar.f1366d = eVar3;
        }
        return Math.min(i7, (int) (this.f.f1364b - this.f10720g));
    }
}
