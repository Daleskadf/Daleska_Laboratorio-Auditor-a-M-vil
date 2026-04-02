package androidx.camera.core.impl;
/* renamed from: androidx.camera.core.impl.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523z implements D.m0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7694b;

    /* renamed from: c  reason: collision with root package name */
    public final D.m0 f7695c;

    public C0523z(int i7, long j) {
        this.f7694b = i7;
        switch (i7) {
            case 1:
                this.f7695c = new v0(j, new C0522y(j));
                return;
            default:
                this.f7695c = new C0523z(1, j);
                return;
        }
    }

    @Override // D.m0
    public final long a() {
        switch (this.f7694b) {
            case 0:
                return ((v0) ((C0523z) this.f7695c).f7695c).f7675b;
            default:
                return ((v0) this.f7695c).f7675b;
        }
    }

    @Override // D.m0
    public final D.l0 b(B2.c cVar) {
        switch (this.f7694b) {
            case 0:
                if (!((v0) ((C0523z) this.f7695c).f7695c).b(cVar).f741b) {
                    Throwable th = (Throwable) cVar.f251c;
                    if (th instanceof C) {
                        org.slf4j.helpers.i.t("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                        if (((C) th).f7531a > 0) {
                            return D.l0.f;
                        }
                    }
                    return D.l0.f738d;
                }
                return D.l0.f739e;
            default:
                return ((v0) this.f7695c).b(cVar);
        }
    }
}
