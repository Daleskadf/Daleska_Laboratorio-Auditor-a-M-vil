package i6;

import a6.AbstractC0478g;
/* renamed from: i6.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11535a;

    /* renamed from: b  reason: collision with root package name */
    public final C1127n f11536b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0478g f11537c;

    public C1125l(C1127n c1127n, AbstractC0478g abstractC0478g, int i7) {
        boolean z7;
        this.f11535a = i7;
        switch (i7) {
            case 1:
                if (c1127n.f11546e != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                G.i.f("success rate ejection config is null", z7);
                this.f11536b = c1127n;
                this.f11537c = abstractC0478g;
                return;
            default:
                this.f11536b = c1127n;
                this.f11537c = abstractC0478g;
                return;
        }
    }
}
