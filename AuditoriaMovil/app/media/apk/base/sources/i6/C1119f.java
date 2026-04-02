package i6;

import a6.C0487p;
import a6.P;
/* renamed from: i6.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1119f implements P {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11515a;

    /* renamed from: b  reason: collision with root package name */
    public final P f11516b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC1115b f11517c;

    public /* synthetic */ C1119f(AbstractC1115b abstractC1115b, P p7, int i7) {
        this.f11515a = i7;
        this.f11517c = abstractC1115b;
        this.f11516b = p7;
    }

    @Override // a6.P
    public final void a(C0487p c0487p) {
        switch (this.f11515a) {
            case 0:
                this.f11516b.a(c0487p);
                ((C1120g) this.f11517c).f11519b.a(c0487p);
                return;
            default:
                C1131r c1131r = (C1131r) this.f11517c;
                c1131r.f11556d = c0487p;
                if (!c1131r.f11555c) {
                    this.f11516b.a(c0487p);
                    return;
                }
                return;
        }
    }
}
