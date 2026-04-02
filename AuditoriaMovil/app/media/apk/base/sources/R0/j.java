package R0;

import f1.C0982d;
import java.io.IOException;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final C0982d f4596a;

    /* renamed from: b  reason: collision with root package name */
    public final S0.m f4597b;

    /* renamed from: c  reason: collision with root package name */
    public final S0.b f4598c;

    /* renamed from: d  reason: collision with root package name */
    public final i f4599d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4600e;
    public final long f;

    public j(long j, S0.m mVar, S0.b bVar, C0982d c0982d, long j8, i iVar) {
        this.f4600e = j;
        this.f4597b = mVar;
        this.f4598c = bVar;
        this.f = j8;
        this.f4596a = c0982d;
        this.f4599d = iVar;
    }

    public final j a(long j, S0.m mVar) {
        long c8;
        i d7 = this.f4597b.d();
        i d8 = mVar.d();
        if (d7 == null) {
            return new j(j, mVar, this.f4598c, this.f4596a, this.f, d7);
        } else if (!d7.I()) {
            return new j(j, mVar, this.f4598c, this.f4596a, this.f, d8);
        } else {
            long b0 = d7.b0(j);
            if (b0 == 0) {
                return new j(j, mVar, this.f4598c, this.f4596a, this.f, d8);
            }
            K0.a.k(d8);
            long R7 = d7.R();
            long b5 = d7.b(R7);
            long j8 = b0 + R7;
            long j9 = j8 - 1;
            long b7 = d7.b(j9);
            long R8 = d8.R();
            long b8 = d8.b(R8);
            int i7 = ((d7.k(j9, j) + b7) > b8 ? 1 : ((d7.k(j9, j) + b7) == b8 ? 0 : -1));
            long j10 = this.f;
            if (i7 != 0) {
                if (i7 >= 0) {
                    if (b8 < b5) {
                        c8 = j10 - (d8.c(b5, j) - R7);
                        return new j(j, mVar, this.f4598c, this.f4596a, c8, d8);
                    }
                    j8 = d7.c(b8, j);
                } else {
                    throw new IOException();
                }
            }
            c8 = (j8 - R8) + j10;
            return new j(j, mVar, this.f4598c, this.f4596a, c8, d8);
        }
    }

    public final long b(long j) {
        i iVar = this.f4599d;
        K0.a.k(iVar);
        return iVar.r(this.f4600e, j) + this.f;
    }

    public final long c(long j) {
        long b5 = b(j);
        i iVar = this.f4599d;
        K0.a.k(iVar);
        return (iVar.c0(this.f4600e, j) + b5) - 1;
    }

    public final long d() {
        i iVar = this.f4599d;
        K0.a.k(iVar);
        return iVar.b0(this.f4600e);
    }

    public final long e(long j) {
        long f = f(j);
        i iVar = this.f4599d;
        K0.a.k(iVar);
        return iVar.k(j - this.f, this.f4600e) + f;
    }

    public final long f(long j) {
        i iVar = this.f4599d;
        K0.a.k(iVar);
        return iVar.b(j - this.f);
    }

    public final boolean g(long j, long j8) {
        i iVar = this.f4599d;
        K0.a.k(iVar);
        if (iVar.I() || j8 == -9223372036854775807L || e(j) <= j8) {
            return true;
        }
        return false;
    }
}
