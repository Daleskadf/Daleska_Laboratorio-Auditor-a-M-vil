package e1;

import android.net.Uri;
import java.util.Map;
/* renamed from: e1.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952q implements M0.h {

    /* renamed from: a  reason: collision with root package name */
    public final M0.h f10827a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10828b;

    /* renamed from: c  reason: collision with root package name */
    public final J f10829c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f10830d;

    /* renamed from: e  reason: collision with root package name */
    public int f10831e;

    public C0952q(M0.h hVar, int i7, J j) {
        boolean z7;
        if (i7 > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        this.f10827a = hVar;
        this.f10828b = i7;
        this.f10829c = j;
        this.f10830d = new byte[1];
        this.f10831e = i7;
    }

    @Override // M0.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // M0.h
    public final long e(M0.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // M0.h
    public final Map j() {
        return this.f10827a.j();
    }

    @Override // M0.h
    public final void n(M0.C c8) {
        c8.getClass();
        this.f10827a.n(c8);
    }

    @Override // M0.h
    public final Uri p() {
        return this.f10827a.p();
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        long max;
        int i9 = this.f10831e;
        M0.h hVar = this.f10827a;
        if (i9 == 0) {
            byte[] bArr2 = this.f10830d;
            int i10 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i11 = (bArr2[0] & 255) << 4;
                if (i11 != 0) {
                    byte[] bArr3 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int read = hVar.read(bArr3, i10, i12);
                        if (read != -1) {
                            i10 += read;
                            i12 -= read;
                        }
                    }
                    while (i11 > 0 && bArr3[i11 - 1] == 0) {
                        i11--;
                    }
                    if (i11 > 0) {
                        K0.q qVar = new K0.q(bArr3, i11);
                        J j = this.f10829c;
                        if (!j.f10654h0) {
                            max = j.f10651e0;
                        } else {
                            max = Math.max(j.f10655i0.g(true), j.f10651e0);
                        }
                        long j8 = max;
                        int a7 = qVar.a();
                        m1.G g3 = j.f10653g0;
                        g3.getClass();
                        g3.d(a7, qVar);
                        g3.e(j8, 1, a7, 0, null);
                        j.f10654h0 = true;
                    }
                }
                this.f10831e = this.f10828b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i7, Math.min(this.f10831e, i8));
        if (read2 != -1) {
            this.f10831e -= read2;
        }
        return read2;
    }
}
