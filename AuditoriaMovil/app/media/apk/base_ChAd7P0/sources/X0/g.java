package X0;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class g extends N0.f {

    /* renamed from: e0  reason: collision with root package name */
    public long f6277e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f6278f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f6279g0;

    @Override // N0.f
    public final void e() {
        super.e();
        this.f6278f0 = 0;
    }

    public final boolean j(N0.f fVar) {
        ByteBuffer byteBuffer;
        K0.a.e(!fVar.c(1073741824));
        K0.a.e(!fVar.c(268435456));
        K0.a.e(!fVar.c(4));
        if (k()) {
            if (this.f6278f0 < this.f6279g0) {
                ByteBuffer byteBuffer2 = fVar.f3350e;
                if (byteBuffer2 != null && (byteBuffer = this.f3350e) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i7 = this.f6278f0;
        this.f6278f0 = i7 + 1;
        if (i7 == 0) {
            this.f3345X = fVar.f3345X;
            if (fVar.c(1)) {
                this.f1354b = 1;
            }
        }
        ByteBuffer byteBuffer3 = fVar.f3350e;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.f3350e.put(byteBuffer3);
        }
        this.f6277e0 = fVar.f3345X;
        return true;
    }

    public final boolean k() {
        if (this.f6278f0 > 0) {
            return true;
        }
        return false;
    }
}
