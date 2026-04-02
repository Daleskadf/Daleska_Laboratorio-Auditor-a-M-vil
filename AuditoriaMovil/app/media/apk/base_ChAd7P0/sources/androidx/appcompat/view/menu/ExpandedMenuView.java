package androidx.appcompat.view.menu;

import R1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import o.InterfaceC1544h;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1544h, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f7278a = {16842964, 16843049};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        j J02 = j.J0(context, attributeSet, f7278a, 16842868);
        TypedArray typedArray = (TypedArray) J02.f4683c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(J02.u0(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(J02.u0(1));
        }
        J02.O0();
    }

    @Override // o.InterfaceC1544h
    public final boolean a(o.j jVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        o.j jVar = (o.j) getAdapter().getItem(i7);
        throw null;
    }
}
