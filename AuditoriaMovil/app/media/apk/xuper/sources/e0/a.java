package e0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.umeng.analytics.pro.bx;
import e0.b;
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12831a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12832b;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f12833c;

    /* renamed from: d  reason: collision with root package name */
    public Context f12834d;

    /* renamed from: e  reason: collision with root package name */
    public int f12835e;

    /* renamed from: f  reason: collision with root package name */
    public C0212a f12836f;

    /* renamed from: g  reason: collision with root package name */
    public DataSetObserver f12837g;

    /* renamed from: h  reason: collision with root package name */
    public e0.b f12838h;

    /* renamed from: e0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0212a extends ContentObserver {
        public C0212a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f12831a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f12831a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        int i10;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        f(context, cursor, i10);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    public abstract CharSequence b(Cursor cursor);

    @Override // e0.b.a
    public Cursor d() {
        return this.f12833c;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i10) {
        int i11;
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f12832b = true;
        } else {
            this.f12832b = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f12833c = cursor;
        this.f12831a = z10;
        this.f12834d = context;
        if (z10) {
            i11 = cursor.getColumnIndexOrThrow(bx.f10121d);
        } else {
            i11 = -1;
        }
        this.f12835e = i11;
        if ((i10 & 2) == 2) {
            this.f12836f = new C0212a();
            this.f12837g = new b();
        } else {
            this.f12836f = null;
            this.f12837g = null;
        }
        if (z10) {
            C0212a c0212a = this.f12836f;
            if (c0212a != null) {
                cursor.registerContentObserver(c0212a);
            }
            DataSetObserver dataSetObserver = this.f12837g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (this.f12831a && (cursor = this.f12833c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f12831a) {
            this.f12833c.moveToPosition(i10);
            if (view == null) {
                view = g(this.f12834d, this.f12833c, viewGroup);
            }
            e(view, this.f12834d, this.f12833c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f12838h == null) {
            this.f12838h = new e0.b(this);
        }
        return this.f12838h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (this.f12831a && (cursor = this.f12833c) != null) {
            cursor.moveToPosition(i10);
            return this.f12833c;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f12831a || (cursor = this.f12833c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f12833c.getLong(this.f12835e);
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f12831a) {
            if (this.f12833c.moveToPosition(i10)) {
                if (view == null) {
                    view = h(this.f12834d, this.f12833c, viewGroup);
                }
                e(view, this.f12834d, this.f12833c);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (this.f12832b && (cursor = this.f12833c) != null && !cursor.isClosed()) {
            this.f12831a = this.f12833c.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f12833c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0212a c0212a = this.f12836f;
            if (c0212a != null) {
                cursor2.unregisterContentObserver(c0212a);
            }
            DataSetObserver dataSetObserver = this.f12837g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f12833c = cursor;
        if (cursor != null) {
            C0212a c0212a2 = this.f12836f;
            if (c0212a2 != null) {
                cursor.registerContentObserver(c0212a2);
            }
            DataSetObserver dataSetObserver2 = this.f12837g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f12835e = cursor.getColumnIndexOrThrow(bx.f10121d);
            this.f12831a = true;
            notifyDataSetChanged();
        } else {
            this.f12835e = -1;
            this.f12831a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
