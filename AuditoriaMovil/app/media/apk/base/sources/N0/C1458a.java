package n0;

import android.database.DataSetObserver;
import p.AbstractC1584g0;
import p.G0;
/* renamed from: n0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1458a extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14128b;

    public /* synthetic */ C1458a(Object obj, int i7) {
        this.f14127a = i7;
        this.f14128b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f14127a) {
            case 0:
                G0 g02 = (G0) this.f14128b;
                g02.f14130a = true;
                g02.notifyDataSetChanged();
                return;
            default:
                AbstractC1584g0 abstractC1584g0 = (AbstractC1584g0) this.f14128b;
                if (abstractC1584g0.q0.isShowing()) {
                    abstractC1584g0.b();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f14127a) {
            case 0:
                G0 g02 = (G0) this.f14128b;
                g02.f14130a = false;
                g02.notifyDataSetInvalidated();
                return;
            default:
                ((AbstractC1584g0) this.f14128b).dismiss();
                return;
        }
    }
}
