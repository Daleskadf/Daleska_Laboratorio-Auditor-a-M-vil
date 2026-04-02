package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public g f1187a;

    /* renamed from: b  reason: collision with root package name */
    public int f1188b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1189c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1190d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f1191e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1192f;

    public f(g gVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1190d = z10;
        this.f1191e = layoutInflater;
        this.f1187a = gVar;
        this.f1192f = i10;
        a();
    }

    public void a() {
        i expandedItem = this.f1187a.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<i> nonActionItems = this.f1187a.getNonActionItems();
            int size = nonActionItems.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (nonActionItems.get(i10) == expandedItem) {
                    this.f1188b = i10;
                    return;
                }
            }
        }
        this.f1188b = -1;
    }

    public g b() {
        return this.f1187a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public i getItem(int i10) {
        ArrayList<i> visibleItems;
        if (this.f1190d) {
            visibleItems = this.f1187a.getNonActionItems();
        } else {
            visibleItems = this.f1187a.getVisibleItems();
        }
        int i11 = this.f1188b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return visibleItems.get(i10);
    }

    public void d(boolean z10) {
        this.f1189c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> visibleItems;
        if (this.f1190d) {
            visibleItems = this.f1187a.getNonActionItems();
        } else {
            visibleItems = this.f1187a.getVisibleItems();
        }
        if (this.f1188b < 0) {
            return visibleItems.size();
        }
        return visibleItems.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10;
        if (view == null) {
            view = this.f1191e.inflate(this.f1192f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i12 = i10 - 1;
        if (i12 >= 0) {
            i11 = getItem(i12).getGroupId();
        } else {
            i11 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1187a.isGroupDividerEnabled() && groupId != i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        n.a aVar = (n.a) view;
        if (this.f1189c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
