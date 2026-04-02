package k;

import G.i;
import android.graphics.drawable.Animatable;
import d2.C0891e;
/* renamed from: k.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1373a extends i {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13477b;

    /* renamed from: c  reason: collision with root package name */
    public final Animatable f13478c;

    public /* synthetic */ C1373a(Animatable animatable, int i7) {
        this.f13477b = i7;
        this.f13478c = animatable;
    }

    @Override // G.i
    public final void G() {
        switch (this.f13477b) {
            case 0:
                this.f13478c.start();
                return;
            default:
                ((C0891e) this.f13478c).start();
                return;
        }
    }

    @Override // G.i
    public final void H() {
        switch (this.f13477b) {
            case 0:
                this.f13478c.stop();
                return;
            default:
                ((C0891e) this.f13478c).stop();
                return;
        }
    }
}
