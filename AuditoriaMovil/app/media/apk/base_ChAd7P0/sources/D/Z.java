package D;

import androidx.camera.core.ImageProcessingUtil;
/* loaded from: classes.dex */
public final /* synthetic */ class Z implements F {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f678b;

    public /* synthetic */ Z(b0 b0Var, b0 b0Var2, int i7) {
        this.f677a = i7;
        this.f678b = b0Var2;
    }

    @Override // D.F
    public final void a(G g3) {
        b0 b0Var = this.f678b;
        switch (this.f677a) {
            case 0:
                int i7 = ImageProcessingUtil.f7520a;
                b0Var.close();
                return;
            default:
                int i8 = ImageProcessingUtil.f7520a;
                if (b0Var != null) {
                    b0Var.close();
                    return;
                }
                return;
        }
    }
}
