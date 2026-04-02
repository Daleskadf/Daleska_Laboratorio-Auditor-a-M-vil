package androidx.appcompat.widget;

import D.AbstractC0055e;
import R1.j;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.example.appecoactivate.R;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h0.AbstractC1066z;
import i.AbstractC1091a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n.InterfaceC1454a;
import n0.AbstractC1459b;
import o0.AbstractC1547b;
import org.apache.tika.utils.StringUtils;
import p.A0;
import p.AbstractC1595m;
import p.B0;
import p.C0;
import p.C1572a0;
import p.C1609t0;
import p.C1617x0;
import p.C1619y0;
import p.D0;
import p.E0;
import p.G0;
import p.InterfaceC1621z0;
import p.RunnableC1611u0;
import p.View$OnFocusChangeListenerC1613v0;
import p.View$OnLayoutChangeListenerC1615w0;
import p.Z;
/* loaded from: classes.dex */
public class SearchView extends Z implements InterfaceC1454a {

    /* renamed from: b1  reason: collision with root package name */
    public static final C0 f7356b1;

    /* renamed from: A0  reason: collision with root package name */
    public final int[] f7357A0;

    /* renamed from: B0  reason: collision with root package name */
    public final ImageView f7358B0;

    /* renamed from: C0  reason: collision with root package name */
    public final Drawable f7359C0;

    /* renamed from: D0  reason: collision with root package name */
    public final int f7360D0;

    /* renamed from: E0  reason: collision with root package name */
    public final int f7361E0;

    /* renamed from: F0  reason: collision with root package name */
    public final Intent f7362F0;

    /* renamed from: G0  reason: collision with root package name */
    public final Intent f7363G0;

    /* renamed from: H0  reason: collision with root package name */
    public final CharSequence f7364H0;

    /* renamed from: I0  reason: collision with root package name */
    public View.OnFocusChangeListener f7365I0;

    /* renamed from: J0  reason: collision with root package name */
    public View.OnClickListener f7366J0;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f7367K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f7368L0;

    /* renamed from: M0  reason: collision with root package name */
    public AbstractC1459b f7369M0;

    /* renamed from: N0  reason: collision with root package name */
    public boolean f7370N0;

    /* renamed from: O0  reason: collision with root package name */
    public CharSequence f7371O0;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f7372P0;

    /* renamed from: Q0  reason: collision with root package name */
    public boolean f7373Q0;

    /* renamed from: R0  reason: collision with root package name */
    public int f7374R0;

    /* renamed from: S0  reason: collision with root package name */
    public boolean f7375S0;

    /* renamed from: T0  reason: collision with root package name */
    public CharSequence f7376T0;

    /* renamed from: U0  reason: collision with root package name */
    public boolean f7377U0;

    /* renamed from: V0  reason: collision with root package name */
    public int f7378V0;

    /* renamed from: W0  reason: collision with root package name */
    public SearchableInfo f7379W0;

    /* renamed from: X0  reason: collision with root package name */
    public Bundle f7380X0;

    /* renamed from: Y0  reason: collision with root package name */
    public final RunnableC1611u0 f7381Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public final RunnableC1611u0 f7382Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final WeakHashMap f7383a1;

    /* renamed from: n0  reason: collision with root package name */
    public final SearchAutoComplete f7384n0;

    /* renamed from: o0  reason: collision with root package name */
    public final View f7385o0;

    /* renamed from: p0  reason: collision with root package name */
    public final View f7386p0;
    public final View q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ImageView f7387r0;

    /* renamed from: s0  reason: collision with root package name */
    public final ImageView f7388s0;

    /* renamed from: t0  reason: collision with root package name */
    public final ImageView f7389t0;

    /* renamed from: u0  reason: collision with root package name */
    public final ImageView f7390u0;

    /* renamed from: v0  reason: collision with root package name */
    public final View f7391v0;

    /* renamed from: w0  reason: collision with root package name */
    public E0 f7392w0;

    /* renamed from: x0  reason: collision with root package name */
    public final Rect f7393x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Rect f7394y0;

    /* renamed from: z0  reason: collision with root package name */
    public final int[] f7395z0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AbstractC1595m {

        /* renamed from: e  reason: collision with root package name */
        public int f7396e;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f7397e0;
        public SearchView f;

        /* renamed from: f0  reason: collision with root package name */
        public final d f7398f0;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7398f0 = new d(this);
            this.f7396e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return RecognitionOptions.QR_CODE;
            }
            if (i7 < 600) {
                if (i7 < 640 || i8 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0 c02 = SearchView.f7356b1;
            c02.getClass();
            C0.a();
            Method method = c02.f14647c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f7396e > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // p.AbstractC1595m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f7397e0) {
                d dVar = this.f7398f0;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z7, int i7, Rect rect) {
            super.onFocusChanged(z7, i7, rect);
            SearchView searchView = this.f;
            searchView.u(searchView.f7368L0);
            searchView.post(searchView.f7381Y0);
            if (searchView.f7384n0.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z7) {
            super.onWindowFocusChanged(z7);
            if (z7 && this.f.hasFocus() && getVisibility() == 0) {
                this.f7397e0 = true;
                Context context = getContext();
                C0 c02 = SearchView.f7356b1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z7) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f7398f0;
            if (!z7) {
                this.f7397e0 = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f7397e0 = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f7397e0 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f7396e = i7;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.C0, java.lang.Object] */
    static {
        C0 c02 = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.f14645a = null;
            obj.f14646b = null;
            obj.f14647c = null;
            C0.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                obj.f14645a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                obj.f14646b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.f14647c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c02 = obj;
        }
        f7356b1 = c02;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.f7384n0;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f7373Q0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f7384n0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f7373Q0 = false;
    }

    public int getImeOptions() {
        return this.f7384n0.getImeOptions();
    }

    public int getInputType() {
        return this.f7384n0.getInputType();
    }

    public int getMaxWidth() {
        return this.f7374R0;
    }

    public CharSequence getQuery() {
        return this.f7384n0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f7371O0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f7379W0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f7379W0.getHintId());
            }
            return this.f7364H0;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.f7361E0;
    }

    public int getSuggestionRowLayout() {
        return this.f7360D0;
    }

    public AbstractC1459b getSuggestionsAdapter() {
        return this.f7369M0;
    }

    public final Intent h(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f7376T0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f7380X0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f7379W0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i7;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f7380X0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i7 = searchableInfo.getVoiceMaxResults();
        } else {
            i7 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i7);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int i7 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f7384n0;
        if (i7 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        C0 c02 = f7356b1;
        c02.getClass();
        C0.a();
        Method method = c02.f14645a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        c02.getClass();
        C0.a();
        Method method2 = c02.f14646b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f7384n0;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f7367K0) {
                clearFocus();
                u(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText(StringUtils.EMPTY);
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public final void l(int i7) {
        int i8;
        Uri parse;
        String h8;
        Cursor cursor = this.f7369M0.f14132c;
        if (cursor != null && cursor.moveToPosition(i7)) {
            Intent intent = null;
            try {
                int i9 = G0.f14659s0;
                String h9 = G0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h9 == null) {
                    h9 = this.f7379W0.getSuggestIntentAction();
                }
                if (h9 == null) {
                    h9 = "android.intent.action.SEARCH";
                }
                String h10 = G0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h10 == null) {
                    h10 = this.f7379W0.getSuggestIntentData();
                }
                if (h10 != null && (h8 = G0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h10 = h10 + "/" + Uri.encode(h8);
                }
                if (h10 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h10);
                }
                intent = h(parse, h9, G0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), G0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e7) {
                try {
                    i8 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i8 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i8 + " returned exception.", e7);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e8) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e8);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f7384n0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i7) {
        Editable text = this.f7384n0.getText();
        Cursor cursor = this.f7369M0.f14132c;
        if (cursor != null) {
            if (cursor.moveToPosition(i7)) {
                String c8 = this.f7369M0.c(cursor);
                if (c8 != null) {
                    setQuery(c8);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f7384n0;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f7379W0 != null) {
                getContext().startActivity(h(null, "android.intent.action.SEARCH", null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f7381Y0);
        post(this.f7382Z0);
        super.onDetachedFromWindow();
    }

    @Override // p.Z, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (z7) {
            int[] iArr = this.f7395z0;
            SearchAutoComplete searchAutoComplete = this.f7384n0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f7357A0;
            getLocationInWindow(iArr2);
            int i11 = iArr[1] - iArr2[1];
            int i12 = iArr[0] - iArr2[0];
            Rect rect = this.f7393x0;
            rect.set(i12, i11, searchAutoComplete.getWidth() + i12, searchAutoComplete.getHeight() + i11);
            int i13 = rect.left;
            int i14 = rect.right;
            int i15 = i10 - i8;
            Rect rect2 = this.f7394y0;
            rect2.set(i13, 0, i14, i15);
            E0 e02 = this.f7392w0;
            if (e02 == null) {
                E0 e03 = new E0(rect2, rect, searchAutoComplete);
                this.f7392w0 = e03;
                setTouchDelegate(e03);
                return;
            }
            e02.f14650b.set(rect2);
            Rect rect3 = e02.f14652d;
            rect3.set(rect2);
            int i16 = -e02.f14653e;
            rect3.inset(i16, i16);
            e02.f14651c.set(rect);
        }
    }

    @Override // p.Z, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        if (this.f7368L0) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i9 = this.f7374R0) > 0) {
                    size = Math.min(i9, size);
                }
            } else {
                size = this.f7374R0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i10 = this.f7374R0;
            size = i10 > 0 ? Math.min(i10, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof D0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        D0 d02 = (D0) parcelable;
        super.onRestoreInstanceState(d02.f14517a);
        u(d02.f14648c);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, o0.b, p.D0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? abstractC1547b = new AbstractC1547b(super.onSaveInstanceState());
        abstractC1547b.f14648c = this.f7368L0;
        return abstractC1547b;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        post(this.f7381Y0);
    }

    public final void p() {
        int i7;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.f7384n0.getText());
        if (isEmpty && (!this.f7367K0 || this.f7377U0)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        ImageView imageView = this.f7389t0;
        imageView.setVisibility(i7);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void q() {
        int[] iArr;
        if (this.f7384n0.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f7386p0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.q0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void r() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = StringUtils.EMPTY;
        }
        boolean z7 = this.f7367K0;
        SearchAutoComplete searchAutoComplete = this.f7384n0;
        if (z7 && (drawable = this.f7359C0) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (this.f7373Q0 || !isFocusable()) {
            return false;
        }
        if (!this.f7368L0) {
            boolean requestFocus = this.f7384n0.requestFocus(i7, rect);
            if (requestFocus) {
                u(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i7, rect);
    }

    public final void s() {
        int i7;
        if ((this.f7370N0 || this.f7375S0) && !this.f7368L0 && (this.f7388s0.getVisibility() == 0 || this.f7390u0.getVisibility() == 0)) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.q0.setVisibility(i7);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f7380X0 = bundle;
    }

    public void setIconified(boolean z7) {
        if (z7) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f7384n0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f7366J0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z7) {
        if (this.f7367K0 == z7) {
            return;
        }
        this.f7367K0 = z7;
        u(z7);
        r();
    }

    public void setImeOptions(int i7) {
        this.f7384n0.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.f7384n0.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f7374R0 = i7;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f7365I0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f7366J0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f7371O0 = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z7) {
        int i7;
        this.f7372P0 = z7;
        AbstractC1459b abstractC1459b = this.f7369M0;
        if (abstractC1459b instanceof G0) {
            G0 g02 = (G0) abstractC1459b;
            if (z7) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            g02.f14668k0 = i7;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i7;
        this.f7379W0 = searchableInfo;
        Intent intent = null;
        boolean z7 = true;
        SearchAutoComplete searchAutoComplete = this.f7384n0;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f7379W0.getImeOptions());
            int inputType = this.f7379W0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f7379W0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            AbstractC1459b abstractC1459b = this.f7369M0;
            if (abstractC1459b != null) {
                abstractC1459b.b(null);
            }
            if (this.f7379W0.getSuggestAuthority() != null) {
                G0 g02 = new G0(getContext(), this, this.f7379W0, this.f7383a1);
                this.f7369M0 = g02;
                searchAutoComplete.setAdapter(g02);
                G0 g03 = (G0) this.f7369M0;
                if (this.f7372P0) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                g03.f14668k0 = i7;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f7379W0;
        boolean z8 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f7379W0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f7362F0;
            } else if (this.f7379W0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f7363G0;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                    z7 = false;
                }
                z8 = z7;
            }
        }
        this.f7375S0 = z8;
        if (z8) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f7368L0);
    }

    public void setSubmitButtonEnabled(boolean z7) {
        this.f7370N0 = z7;
        u(this.f7368L0);
    }

    public void setSuggestionsAdapter(AbstractC1459b abstractC1459b) {
        this.f7369M0 = abstractC1459b;
        this.f7384n0.setAdapter(abstractC1459b);
    }

    public final void t(boolean z7) {
        int i7;
        boolean z8 = this.f7370N0;
        if (z8 && ((z8 || this.f7375S0) && !this.f7368L0 && hasFocus() && (z7 || !this.f7375S0))) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f7388s0.setVisibility(i7);
    }

    public final void u(boolean z7) {
        int i7;
        int i8;
        int i9;
        this.f7368L0 = z7;
        int i10 = 8;
        if (z7) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f7384n0.getText());
        this.f7387r0.setVisibility(i7);
        t(!isEmpty);
        if (z7) {
            i8 = 8;
        } else {
            i8 = 0;
        }
        this.f7385o0.setVisibility(i8);
        ImageView imageView = this.f7358B0;
        if (imageView.getDrawable() != null && !this.f7367K0) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        imageView.setVisibility(i9);
        p();
        if (this.f7375S0 && !this.f7368L0 && isEmpty) {
            this.f7388s0.setVisibility(8);
            i10 = 0;
        }
        this.f7390u0.setVisibility(i10);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f7393x0 = new Rect();
        this.f7394y0 = new Rect();
        this.f7395z0 = new int[2];
        this.f7357A0 = new int[2];
        this.f7381Y0 = new RunnableC1611u0(this, 0);
        this.f7382Z0 = new RunnableC1611u0(this, 1);
        this.f7383a1 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        C1617x0 c1617x0 = new C1617x0(this);
        C1619y0 c1619y0 = new C1619y0(this);
        C1572a0 c1572a0 = new C1572a0(this, 1);
        C1609t0 c1609t0 = new C1609t0(this);
        int[] iArr = AbstractC1091a.f11365q;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        j jVar = new j(context, obtainStyledAttributes);
        AbstractC1066z.d(this, context, iArr, attributeSet, obtainStyledAttributes, i7);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f7384n0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f7385o0 = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f7386p0 = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.q0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f7387r0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f7388s0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f7389t0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f7390u0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f7358B0 = imageView5;
        findViewById.setBackground(jVar.u0(10));
        findViewById2.setBackground(jVar.u0(14));
        imageView.setImageDrawable(jVar.u0(13));
        imageView2.setImageDrawable(jVar.u0(7));
        imageView3.setImageDrawable(jVar.u0(4));
        imageView4.setImageDrawable(jVar.u0(16));
        imageView5.setImageDrawable(jVar.u0(13));
        this.f7359C0 = jVar.u0(12);
        AbstractC0055e.z(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f7360D0 = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f7361E0 = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(c1609t0);
        searchAutoComplete.setOnEditorActionListener(c1617x0);
        searchAutoComplete.setOnItemClickListener(c1619y0);
        searchAutoComplete.setOnItemSelectedListener(c1572a0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new View$OnFocusChangeListenerC1613v0(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f7364H0 = obtainStyledAttributes.getText(6);
        this.f7371O0 = obtainStyledAttributes.getText(11);
        int i8 = obtainStyledAttributes.getInt(3, -1);
        if (i8 != -1) {
            setImeOptions(i8);
        }
        int i9 = obtainStyledAttributes.getInt(2, -1);
        if (i9 != -1) {
            setInputType(i9);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        jVar.O0();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f7362F0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f7363G0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f7391v0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC1615w0(this));
        }
        u(this.f7367K0);
        r();
    }

    public void setOnCloseListener(InterfaceC1621z0 interfaceC1621z0) {
    }

    public void setOnQueryTextListener(A0 a02) {
    }

    public void setOnSuggestionListener(B0 b0) {
    }
}
