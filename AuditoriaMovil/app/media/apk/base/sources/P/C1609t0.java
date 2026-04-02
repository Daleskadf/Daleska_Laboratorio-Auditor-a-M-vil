package p;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
/* renamed from: p.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1609t0 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f14882a;

    public C1609t0(SearchView searchView) {
        this.f14882a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        SearchView searchView = this.f14882a;
        Editable text = searchView.f7384n0.getText();
        searchView.f7376T0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i10 = 8;
        if (searchView.f7375S0 && !searchView.f7368L0 && isEmpty) {
            searchView.f7388s0.setVisibility(8);
            i10 = 0;
        }
        searchView.f7390u0.setVisibility(i10);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
