package U0;

import f1.AbstractC0983e;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class e extends AbstractC0983e {

    /* renamed from: e0  reason: collision with root package name */
    public byte[] f5548e0;

    /* renamed from: f0  reason: collision with root package name */
    public volatile boolean f5549f0;

    /* renamed from: g0  reason: collision with root package name */
    public byte[] f5550g0;

    @Override // i1.k
    public final void b() {
        try {
            this.f11002Z.e(this.f11004b);
            int i7 = 0;
            int i8 = 0;
            while (i7 != -1 && !this.f5549f0) {
                byte[] bArr = this.f5548e0;
                if (bArr.length < i8 + 16384) {
                    this.f5548e0 = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f11002Z.read(this.f5548e0, i8, 16384);
                if (i7 != -1) {
                    i8 += i7;
                }
            }
            if (!this.f5549f0) {
                this.f5550g0 = Arrays.copyOf(this.f5548e0, i8);
            }
            m5.d.a(this.f11002Z);
        } catch (Throwable th) {
            m5.d.a(this.f11002Z);
            throw th;
        }
    }

    @Override // i1.k
    public final void k() {
        this.f5549f0 = true;
    }
}
