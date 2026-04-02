package Y1;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class m extends B0.b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(s sVar, int i7) {
        super(sVar);
        this.f6680b = i7;
    }

    @Override // B0.b
    public final int d(View view) {
        switch (this.f6680b) {
            case 0:
                ((s) this.f229a).getClass();
                return view.getRight() + ((t) view.getLayoutParams()).f6691a.right + ((ViewGroup.MarginLayoutParams) ((t) view.getLayoutParams())).rightMargin;
            default:
                ((s) this.f229a).getClass();
                return view.getBottom() + ((t) view.getLayoutParams()).f6691a.bottom + ((ViewGroup.MarginLayoutParams) ((t) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // B0.b
    public final int e(View view) {
        switch (this.f6680b) {
            case 0:
                ((s) this.f229a).getClass();
                return (view.getLeft() - ((t) view.getLayoutParams()).f6691a.left) - ((ViewGroup.MarginLayoutParams) ((t) view.getLayoutParams())).leftMargin;
            default:
                ((s) this.f229a).getClass();
                return (view.getTop() - ((t) view.getLayoutParams()).f6691a.top) - ((ViewGroup.MarginLayoutParams) ((t) view.getLayoutParams())).topMargin;
        }
    }

    @Override // B0.b
    public final int f() {
        switch (this.f6680b) {
            case 0:
                s sVar = (s) this.f229a;
                return sVar.f - sVar.t();
            default:
                s sVar2 = (s) this.f229a;
                return sVar2.f6690g - sVar2.r();
        }
    }

    @Override // B0.b
    public final int g() {
        switch (this.f6680b) {
            case 0:
                return ((s) this.f229a).s();
            default:
                return ((s) this.f229a).u();
        }
    }

    @Override // B0.b
    public final int h() {
        switch (this.f6680b) {
            case 0:
                s sVar = (s) this.f229a;
                return (sVar.f - sVar.s()) - sVar.t();
            default:
                s sVar2 = (s) this.f229a;
                return (sVar2.f6690g - sVar2.u()) - sVar2.r();
        }
    }
}
