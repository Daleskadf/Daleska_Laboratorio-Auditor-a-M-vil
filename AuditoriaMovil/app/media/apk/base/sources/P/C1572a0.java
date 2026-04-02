package p;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
/* renamed from: p.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1572a0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14780a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14781b;

    public /* synthetic */ C1572a0(Object obj, int i7) {
        this.f14780a = i7;
        this.f14781b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j) {
        C1594l0 c1594l0;
        switch (this.f14780a) {
            case 0:
                if (i7 != -1 && (c1594l0 = ((AbstractC1584g0) this.f14781b).f14801c) != null) {
                    c1594l0.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f14781b).m(i7);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i7 = this.f14780a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
