package p;

import android.view.View;
import androidx.appcompat.widget.SearchView;
/* renamed from: p.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnFocusChangeListenerC1613v0 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f14885a;

    public View$OnFocusChangeListenerC1613v0(SearchView searchView) {
        this.f14885a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z7) {
        SearchView searchView = this.f14885a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f7365I0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z7);
        }
    }
}
