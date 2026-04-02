package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
/* renamed from: o.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543g extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final MenuC1545i f14435a;

    /* renamed from: b  reason: collision with root package name */
    public int f14436b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14437c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14438d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f14439e;
    public final int f;

    public C1543g(MenuC1545i menuC1545i, LayoutInflater layoutInflater, boolean z7, int i7) {
        this.f14438d = z7;
        this.f14439e = layoutInflater;
        this.f14435a = menuC1545i;
        this.f = i7;
        a();
    }

    public final void a() {
        MenuC1545i menuC1545i = this.f14435a;
        j jVar = menuC1545i.f14457s;
        if (jVar != null) {
            menuC1545i.i();
            ArrayList arrayList = menuC1545i.j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((j) arrayList.get(i7)) == jVar) {
                    this.f14436b = i7;
                    return;
                }
            }
        }
        this.f14436b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final j getItem(int i7) {
        ArrayList k2;
        MenuC1545i menuC1545i = this.f14435a;
        if (this.f14438d) {
            menuC1545i.i();
            k2 = menuC1545i.j;
        } else {
            k2 = menuC1545i.k();
        }
        int i8 = this.f14436b;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (j) k2.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k2;
        MenuC1545i menuC1545i = this.f14435a;
        if (this.f14438d) {
            menuC1545i.i();
            k2 = menuC1545i.j;
        } else {
            k2 = menuC1545i.k();
        }
        if (this.f14436b < 0) {
            return k2.size();
        }
        return k2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        int i8;
        boolean z7 = false;
        if (view == null) {
            view = this.f14439e.inflate(this.f, viewGroup, false);
        }
        int i9 = getItem(i7).f14462b;
        int i10 = i7 - 1;
        if (i10 >= 0) {
            i8 = getItem(i10).f14462b;
        } else {
            i8 = i9;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f14435a.l() && i9 != i8) {
            z7 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z7);
        q qVar = (q) view;
        if (this.f14437c) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.a(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
