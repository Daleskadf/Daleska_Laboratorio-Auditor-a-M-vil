package u0;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: u0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1860p implements TextWatcher, SpanWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15949a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f15950b = new AtomicInteger(0);

    public C1860p(Object obj) {
        this.f15949a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f15949a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        ((TextWatcher) this.f15949a).beforeTextChanged(charSequence, i7, i8, i9);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i7, int i8) {
        if (this.f15950b.get() > 0 && (obj instanceof C1862r)) {
            return;
        }
        ((SpanWatcher) this.f15949a).onSpanAdded(spannable, obj, i7, i8);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        if (this.f15950b.get() > 0 && (obj instanceof C1862r)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i7 > i8) {
                i7 = 0;
            }
            if (i9 > i10) {
                i11 = i7;
                i12 = 0;
                ((SpanWatcher) this.f15949a).onSpanChanged(spannable, obj, i11, i8, i12, i10);
            }
        }
        i11 = i7;
        i12 = i9;
        ((SpanWatcher) this.f15949a).onSpanChanged(spannable, obj, i11, i8, i12, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i7, int i8) {
        if (this.f15950b.get() > 0 && (obj instanceof C1862r)) {
            return;
        }
        ((SpanWatcher) this.f15949a).onSpanRemoved(spannable, obj, i7, i8);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        ((TextWatcher) this.f15949a).onTextChanged(charSequence, i7, i8, i9);
    }
}
