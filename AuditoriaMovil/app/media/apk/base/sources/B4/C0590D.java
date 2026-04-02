package b4;

import com.google.android.gms.common.api.internal.InterfaceC0729c;
/* renamed from: b4.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590D implements InterfaceC0729c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0591E f8185a;

    public C0590D(C0591E c0591e) {
        this.f8185a = c0591e;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0729c
    public final void a(boolean z7) {
        if (z7) {
            this.f8185a.f8188c = true;
            C0604l c0604l = this.f8185a.f8187b;
            c0604l.f8278d.removeCallbacks(c0604l.f8279e);
            return;
        }
        this.f8185a.f8188c = false;
        C0591E c0591e = this.f8185a;
        if (c0591e.f8186a > 0 && !c0591e.f8188c) {
            this.f8185a.f8187b.a();
        }
    }
}
