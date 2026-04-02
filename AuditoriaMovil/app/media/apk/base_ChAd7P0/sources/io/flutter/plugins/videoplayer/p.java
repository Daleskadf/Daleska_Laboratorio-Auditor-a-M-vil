package io.flutter.plugins.videoplayer;
/* loaded from: classes.dex */
public final class p implements L5.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12423a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12424b;

    public /* synthetic */ p(Object obj, int i7) {
        this.f12423a = i7;
        this.f12424b = obj;
    }

    @Override // L5.i
    public final void a(Object obj, L5.h hVar) {
        switch (this.f12423a) {
            case 0:
                m mVar = (m) this.f12424b;
                mVar.f12417a = hVar;
                mVar.a();
                return;
            default:
                ((r5.b) this.f12424b).f15521Y = hVar;
                return;
        }
    }

    @Override // L5.i
    public final void b() {
        switch (this.f12423a) {
            case 0:
                m mVar = (m) this.f12424b;
                mVar.f12417a = null;
                mVar.a();
                return;
            default:
                ((r5.b) this.f12424b).f15521Y = null;
                return;
        }
    }
}
