package K1;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2546a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2547b;

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f2548c;

    /* renamed from: d  reason: collision with root package name */
    public int f2549d;

    /* renamed from: e  reason: collision with root package name */
    public int f2550e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f2551g;

    /* renamed from: h  reason: collision with root package name */
    public int f2552h;

    public b(int i7, int i8) {
        ArrayList arrayList = new ArrayList();
        this.f2546a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2547b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f2548c = sb;
        this.f2551g = i7;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f2549d = 15;
        this.f2550e = 0;
        this.f = 0;
        this.f2552h = i8;
    }

    public final void a(char c8) {
        StringBuilder sb = this.f2548c;
        if (sb.length() < 32) {
            sb.append(c8);
        }
    }

    public final void b() {
        StringBuilder sb = this.f2548c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f2546a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i7 = aVar.f2545c;
                if (i7 == length) {
                    aVar.f2545c = i7 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final J0.b c(int i7) {
        int i8;
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f2547b;
            if (i9 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i9));
            spannableStringBuilder.append('\n');
            i9++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i10 = this.f2550e + this.f;
        int length = (32 - i10) - spannableStringBuilder.length();
        int i11 = i10 - length;
        if (i7 != Integer.MIN_VALUE) {
            i8 = i7;
        } else if (this.f2551g == 2 && (Math.abs(i11) < 3 || length < 0)) {
            i8 = 1;
        } else if (this.f2551g == 2 && i11 > 0) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                i10 = 32 - length;
            }
            f = ((i10 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i12 = this.f2549d;
        if (i12 > 7) {
            i12 -= 17;
        } else if (this.f2551g == 1) {
            i12 -= this.f2552h - 1;
        }
        return new J0.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i12, 1, Integer.MIN_VALUE, f, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        int i7;
        boolean z7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f2548c);
        int length = spannableStringBuilder.length();
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.f2546a;
            if (i12 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i12);
            boolean z9 = aVar.f2544b;
            int i14 = aVar.f2543a;
            if (i14 != 8) {
                if (i14 == 7) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i14 != 7) {
                    i11 = c.f2554B[i14];
                }
                z8 = z7;
            }
            int i15 = aVar.f2545c;
            i12++;
            if (i12 < arrayList.size()) {
                i7 = ((a) arrayList.get(i12)).f2545c;
            } else {
                i7 = length;
            }
            if (i15 != i7) {
                if (i8 != -1 && !z9) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i8, i15, 33);
                    i8 = -1;
                } else if (i8 == -1 && z9) {
                    i8 = i15;
                }
                if (i9 != -1 && !z8) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i9, i15, 33);
                    i9 = -1;
                } else if (i9 == -1 && z8) {
                    i9 = i15;
                }
                if (i11 != i10) {
                    if (i10 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i10), i13, i15, 33);
                    }
                    i10 = i11;
                    i13 = i15;
                }
            }
        }
        if (i8 != -1 && i8 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i8, length, 33);
        }
        if (i9 != -1 && i9 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i9, length, 33);
        }
        if (i13 != length && i10 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i10), i13, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.f2546a.isEmpty() && this.f2547b.isEmpty() && this.f2548c.length() == 0) {
            return true;
        }
        return false;
    }
}
