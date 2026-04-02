package X3;

import M0.x;
import com.google.android.gms.common.api.internal.C0735i;
import com.google.android.gms.common.api.internal.InterfaceC0729c;
import com.google.android.gms.internal.base.zau;
/* loaded from: classes.dex */
public final class i implements InterfaceC0729c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6394a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6395b;

    public i(C0735i c0735i) {
        this.f6395b = c0735i;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0729c
    public final void a(boolean z7) {
        switch (this.f6394a) {
            case 0:
                j jVar = (j) this.f6395b;
                jVar.getClass();
                if (!z7) {
                    jVar.getClass();
                    return;
                }
                return;
            default:
                zau zauVar = ((C0735i) this.f6395b).f9264i0;
                zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z7)));
                return;
        }
    }

    public i(j jVar, x xVar, t2.i iVar) {
        this.f6395b = jVar;
    }
}
