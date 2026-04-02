package p;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
/* renamed from: p.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1619y0 implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f14888a;

    public C1619y0(SearchView searchView) {
        this.f14888a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        this.f14888a.l(i7);
    }
}
