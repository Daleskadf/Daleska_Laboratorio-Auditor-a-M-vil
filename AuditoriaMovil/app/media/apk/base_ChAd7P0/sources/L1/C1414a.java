package l1;

import D.AbstractC0059i;
import H0.r;
import K0.q;
import M0.x;
import N0.f;
import O0.AbstractC0243e;
import O0.F;
import java.nio.ByteBuffer;
import org.apache.tika.pipes.PipesConfigBase;
/* renamed from: l1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1414a extends AbstractC0243e {

    /* renamed from: m0  reason: collision with root package name */
    public final f f13808m0;

    /* renamed from: n0  reason: collision with root package name */
    public final q f13809n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f13810o0;

    /* renamed from: p0  reason: collision with root package name */
    public F f13811p0;
    public long q0;

    public C1414a() {
        super(6);
        this.f13808m0 = new f(1);
        this.f13809n0 = new q();
    }

    @Override // O0.AbstractC0243e, O0.g0
    public final void b(int i7, Object obj) {
        if (i7 == 8) {
            this.f13811p0 = (F) obj;
        }
    }

    @Override // O0.AbstractC0243e
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override // O0.AbstractC0243e
    public final boolean k() {
        return j();
    }

    @Override // O0.AbstractC0243e
    public final boolean l() {
        return true;
    }

    @Override // O0.AbstractC0243e
    public final void m() {
        F f = this.f13811p0;
        if (f != null) {
            f.c();
        }
    }

    @Override // O0.AbstractC0243e
    public final void o(long j, boolean z7) {
        this.q0 = Long.MIN_VALUE;
        F f = this.f13811p0;
        if (f != null) {
            f.c();
        }
    }

    @Override // O0.AbstractC0243e
    public final void t(r[] rVarArr, long j, long j8) {
        this.f13810o0 = j8;
    }

    @Override // O0.AbstractC0243e
    public final void v(long j, long j8) {
        boolean z7;
        float[] fArr;
        while (!j() && this.q0 < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + j) {
            f fVar = this.f13808m0;
            fVar.e();
            x xVar = this.f3701c;
            xVar.t();
            if (u(xVar, fVar, 0) == -4 && !fVar.c(4)) {
                long j9 = fVar.f3345X;
                this.q0 = j9;
                if (j9 < this.f3706g0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (this.f13811p0 != null && !z7) {
                    fVar.i();
                    ByteBuffer byteBuffer = fVar.f3350e;
                    int i7 = K0.x.f2529a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        q qVar = this.f13809n0;
                        qVar.E(array, limit);
                        qVar.G(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i8 = 0; i8 < 3; i8++) {
                            fArr2[i8] = Float.intBitsToFloat(qVar.j());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f13811p0.a(this.q0 - this.f13810o0, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // O0.AbstractC0243e
    public final int z(r rVar) {
        if ("application/x-camera-motion".equals(rVar.f1886m)) {
            return AbstractC0059i.s(4, 0, 0, 0);
        }
        return AbstractC0059i.s(0, 0, 0, 0);
    }
}
