package p;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.example.appecoactivate.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import n0.AbstractC1459b;
import n0.C1458a;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class G0 extends AbstractC1459b implements View.OnClickListener {

    /* renamed from: s0  reason: collision with root package name */
    public static final /* synthetic */ int f14659s0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f14660Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f14661Z;

    /* renamed from: e0  reason: collision with root package name */
    public final LayoutInflater f14662e0;

    /* renamed from: f0  reason: collision with root package name */
    public final SearchView f14663f0;

    /* renamed from: g0  reason: collision with root package name */
    public final SearchableInfo f14664g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Context f14665h0;

    /* renamed from: i0  reason: collision with root package name */
    public final WeakHashMap f14666i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f14667j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f14668k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f14669l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f14670m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f14671n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f14672o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f14673p0;
    public int q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f14674r0;

    public G0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f14131b = true;
        this.f14132c = null;
        this.f14130a = false;
        this.f14133d = -1;
        this.f14134e = new B5.y(this);
        this.f = new C1458a(this, 0);
        this.f14661Z = suggestionRowLayout;
        this.f14660Y = suggestionRowLayout;
        this.f14662e0 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f14668k0 = 1;
        this.f14670m0 = -1;
        this.f14671n0 = -1;
        this.f14672o0 = -1;
        this.f14673p0 = -1;
        this.q0 = -1;
        this.f14674r0 = -1;
        this.f14663f0 = searchView;
        this.f14664g0 = searchableInfo;
        this.f14667j0 = searchView.getSuggestionCommitIconResId();
        this.f14665h0 = context;
        this.f14666i0 = weakHashMap;
    }

    public static String h(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    @Override // n0.AbstractC1459b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.G0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // n0.AbstractC1459b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f14670m0 = cursor.getColumnIndex("suggest_text_1");
                this.f14671n0 = cursor.getColumnIndex("suggest_text_2");
                this.f14672o0 = cursor.getColumnIndex("suggest_text_2_url");
                this.f14673p0 = cursor.getColumnIndex("suggest_icon_1");
                this.q0 = cursor.getColumnIndex("suggest_icon_2");
                this.f14674r0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // n0.AbstractC1459b
    public final String c(Cursor cursor) {
        String h8;
        String h9;
        if (cursor == null) {
            return null;
        }
        String h10 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h10 != null) {
            return h10;
        }
        SearchableInfo searchableInfo = this.f14664g0;
        if (searchableInfo.shouldRewriteQueryFromData() && (h9 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h9;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h8 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h8;
    }

    @Override // n0.AbstractC1459b
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f14662e0.inflate(this.f14660Y, viewGroup, false);
        inflate.setTag(new F0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f14667j0);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f14665h0.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.G0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(StringUtils.EMPTY).fragment(StringUtils.EMPTY);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f14665h0.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // n0.AbstractC1459b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View inflate = this.f14662e0.inflate(this.f14661Z, viewGroup, false);
            if (inflate != null) {
                ((F0) inflate.getTag()).f14654a.setText(e7.toString());
            }
            return inflate;
        }
    }

    @Override // n0.AbstractC1459b, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View d7 = d(viewGroup);
            ((F0) d7.getTag()).f14654a.setText(e7.toString());
            return d7;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f14132c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f14132c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f14663f0.n((CharSequence) tag);
        }
    }
}
