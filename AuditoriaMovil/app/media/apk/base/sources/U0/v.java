package u0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;
/* loaded from: classes.dex */
public final class v implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15956a = false;

    /* renamed from: b  reason: collision with root package name */
    public Spannable f15957b;

    public v(Spannable spannable) {
        this.f15957b = spannable;
    }

    public final void a() {
        t2.i iVar;
        Spannable spannable = this.f15957b;
        if (!this.f15956a) {
            if (Build.VERSION.SDK_INT < 28) {
                iVar = new t2.i(22);
            } else {
                iVar = new t2.i(22);
            }
            if (iVar.E(spannable)) {
                this.f15957b = new SpannableString(spannable);
            }
        }
        this.f15956a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f15957b.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return IntStream.Wrapper.convert(AbstractC1864t.a(this.f15957b));
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(AbstractC1863s.a(this.f15957b));
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f15957b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f15957b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f15957b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i8, Class cls) {
        return this.f15957b.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f15957b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f15957b.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f15957b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        a();
        this.f15957b.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return this.f15957b.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f15957b.toString();
    }

    public v(CharSequence charSequence) {
        this.f15957b = new SpannableString(charSequence);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return AbstractC1864t.a(this.f15957b);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return AbstractC1863s.a(this.f15957b);
    }
}
