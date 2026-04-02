package p;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.example.appecoactivate.R;
/* renamed from: p.w0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnLayoutChangeListenerC1615w0 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f14886a;

    public View$OnLayoutChangeListenerC1615w0(SearchView searchView) {
        this.f14886a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        SearchView searchView = this.f14886a;
        View view2 = searchView.f7391v0;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f7386p0.getPaddingLeft();
            Rect rect = new Rect();
            boolean a7 = b1.a(searchView);
            if (searchView.f7367K0) {
                i15 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            } else {
                i15 = 0;
            }
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f7384n0;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            if (a7) {
                i16 = -rect.left;
            } else {
                i16 = paddingLeft - (rect.left + i15);
            }
            searchAutoComplete.setDropDownHorizontalOffset(i16);
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i15) - paddingLeft);
        }
    }
}
