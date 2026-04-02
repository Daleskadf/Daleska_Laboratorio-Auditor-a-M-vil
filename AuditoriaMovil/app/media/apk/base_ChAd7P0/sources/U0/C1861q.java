package u0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
/* renamed from: u0.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1861q extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Class f15951a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15952b;

    public C1861q(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f15952b = new ArrayList();
        g0.c.f(cls, "watcherClass cannot be null");
        this.f15951a = cls;
    }

    public final void a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f15952b;
            if (i7 < arrayList.size()) {
                ((C1860p) arrayList.get(i7)).f15950b.incrementAndGet();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f15952b;
            if (i7 < arrayList.size()) {
                ((C1860p) arrayList.get(i7)).onTextChanged(this, 0, length(), length());
                i7++;
            } else {
                return;
            }
        }
    }

    public final C1860p c(Object obj) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f15952b;
            if (i7 < arrayList.size()) {
                C1860p c1860p = (C1860p) arrayList.get(i7);
                if (c1860p.f15949a == obj) {
                    return c1860p;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f15951a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f15952b;
            if (i7 < arrayList.size()) {
                ((C1860p) arrayList.get(i7)).f15950b.decrementAndGet();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C1860p c8;
        if (d(obj) && (c8 = c(obj)) != null) {
            obj = c8;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C1860p c8;
        if (d(obj) && (c8 = c(obj)) != null) {
            obj = c8;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C1860p c8;
        if (d(obj) && (c8 = c(obj)) != null) {
            obj = c8;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i7, int i8, Class cls) {
        if (this.f15951a == cls) {
            C1860p[] c1860pArr = (C1860p[]) super.getSpans(i7, i8, C1860p.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, c1860pArr.length);
            for (int i9 = 0; i9 < c1860pArr.length; i9++) {
                objArr[i9] = c1860pArr[i9].f15949a;
            }
            return objArr;
        }
        return super.getSpans(i7, i8, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        return super.nextSpanTransition(i7, i8, (cls == null || this.f15951a == cls) ? C1860p.class : C1860p.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C1860p c1860p;
        if (d(obj)) {
            c1860p = c(obj);
            if (c1860p != null) {
                obj = c1860p;
            }
        } else {
            c1860p = null;
        }
        super.removeSpan(obj);
        if (c1860p != null) {
            this.f15952b.remove(c1860p);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i8, CharSequence charSequence) {
        replace(i7, i8, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        if (d(obj)) {
            C1860p c1860p = new C1860p(obj);
            this.f15952b.add(c1860p);
            obj = c1860p;
        }
        super.setSpan(obj, i7, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return new C1861q(this.f15951a, this, i7, i8);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        replace(i7, i8, charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence) {
        a();
        super.replace(i7, i8, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    public C1861q(Class cls, C1861q c1861q, int i7, int i8) {
        super(c1861q, i7, i8);
        this.f15952b = new ArrayList();
        g0.c.f(cls, "watcherClass cannot be null");
        this.f15951a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        a();
        super.replace(i7, i8, charSequence, i9, i10);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }
}
