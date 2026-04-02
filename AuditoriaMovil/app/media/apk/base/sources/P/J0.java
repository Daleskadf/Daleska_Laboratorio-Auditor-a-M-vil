package p;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
import u0.AbstractC1850f;
/* loaded from: classes.dex */
public final class J0 extends AbstractC1850f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14686a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f14687b;

    public J0(SwitchCompat switchCompat) {
        this.f14687b = new WeakReference(switchCompat);
    }

    @Override // u0.AbstractC1850f
    public void a() {
        switch (this.f14686a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f14687b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // u0.AbstractC1850f
    public final void b() {
        switch (this.f14686a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f14687b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
            default:
                w0.h.a((EditText) this.f14687b.get(), 1);
                return;
        }
    }

    public J0(AbstractC1595m abstractC1595m) {
        this.f14687b = new WeakReference(abstractC1595m);
    }
}
