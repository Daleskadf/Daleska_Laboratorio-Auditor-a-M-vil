package n0;

import B5.y;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p.G0;
/* renamed from: n0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1459b extends BaseAdapter implements Filterable {

    /* renamed from: X  reason: collision with root package name */
    public C1460c f14129X;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14130a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14131b;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f14132c;

    /* renamed from: d  reason: collision with root package name */
    public int f14133d;

    /* renamed from: e  reason: collision with root package name */
    public y f14134e;
    public C1458a f;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f14132c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                y yVar = this.f14134e;
                if (yVar != null) {
                    cursor2.unregisterContentObserver(yVar);
                }
                C1458a c1458a = this.f;
                if (c1458a != null) {
                    cursor2.unregisterDataSetObserver(c1458a);
                }
            }
            this.f14132c = cursor;
            if (cursor != null) {
                y yVar2 = this.f14134e;
                if (yVar2 != null) {
                    cursor.registerContentObserver(yVar2);
                }
                C1458a c1458a2 = this.f;
                if (c1458a2 != null) {
                    cursor.registerDataSetObserver(c1458a2);
                }
                this.f14133d = cursor.getColumnIndexOrThrow("_id");
                this.f14130a = true;
                notifyDataSetChanged();
            } else {
                this.f14133d = -1;
                this.f14130a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f14130a && (cursor = this.f14132c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (this.f14130a) {
            this.f14132c.moveToPosition(i7);
            if (view == null) {
                G0 g02 = (G0) this;
                view = g02.f14662e0.inflate(g02.f14661Z, viewGroup, false);
            }
            a(view, this.f14132c);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [n0.c, android.widget.Filter] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f14129X == null) {
            ?? filter = new Filter();
            filter.f14135a = this;
            this.f14129X = filter;
        }
        return this.f14129X;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        Cursor cursor;
        if (this.f14130a && (cursor = this.f14132c) != null) {
            cursor.moveToPosition(i7);
            return this.f14132c;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        Cursor cursor;
        if (!this.f14130a || (cursor = this.f14132c) == null || !cursor.moveToPosition(i7)) {
            return 0L;
        }
        return this.f14132c.getLong(this.f14133d);
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (this.f14130a) {
            if (this.f14132c.moveToPosition(i7)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f14132c);
                return view;
            }
            throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(i7, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
