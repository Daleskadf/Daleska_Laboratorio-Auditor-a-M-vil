package p;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
/* renamed from: p.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1617x0 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f14887a;

    public C1617x0(SearchView searchView) {
        this.f14887a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        this.f14887a.o();
        return true;
    }
}
