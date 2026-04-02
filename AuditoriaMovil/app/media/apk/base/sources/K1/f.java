package K1;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: A  reason: collision with root package name */
    public static final boolean[] f2582A;

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f2583B;

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f2584C;

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f2585D;

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f2586E;

    /* renamed from: v  reason: collision with root package name */
    public static final int f2587v = c(2, 2, 2, 0);

    /* renamed from: w  reason: collision with root package name */
    public static final int f2588w;

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f2589x;

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f2590y;

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2591z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2592a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final SpannableStringBuilder f2593b = new SpannableStringBuilder();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2594c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2595d;

    /* renamed from: e  reason: collision with root package name */
    public int f2596e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public int f2597g;

    /* renamed from: h  reason: collision with root package name */
    public int f2598h;

    /* renamed from: i  reason: collision with root package name */
    public int f2599i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f2600k;

    /* renamed from: l  reason: collision with root package name */
    public int f2601l;

    /* renamed from: m  reason: collision with root package name */
    public int f2602m;

    /* renamed from: n  reason: collision with root package name */
    public int f2603n;

    /* renamed from: o  reason: collision with root package name */
    public int f2604o;

    /* renamed from: p  reason: collision with root package name */
    public int f2605p;

    /* renamed from: q  reason: collision with root package name */
    public int f2606q;

    /* renamed from: r  reason: collision with root package name */
    public int f2607r;

    /* renamed from: s  reason: collision with root package name */
    public int f2608s;

    /* renamed from: t  reason: collision with root package name */
    public int f2609t;

    /* renamed from: u  reason: collision with root package name */
    public int f2610u;

    static {
        int c8 = c(0, 0, 0, 0);
        f2588w = c8;
        int c9 = c(0, 0, 0, 3);
        f2589x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f2590y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f2591z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f2582A = new boolean[]{false, false, false, true, true, true, false};
        f2583B = new int[]{c8, c9, c8, c8, c9, c8, c8};
        f2584C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f2585D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f2586E = new int[]{c8, c8, c8, c8, c8, c9, c9};
    }

    public f() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            K0.a.g(r4, r0)
            K0.a.g(r5, r0)
            K0.a.g(r6, r0)
            K0.a.g(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.f.c(int, int, int, int):int");
    }

    public final void a(char c8) {
        SpannableStringBuilder spannableStringBuilder = this.f2593b;
        if (c8 == '\n') {
            ArrayList arrayList = this.f2592a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f2604o != -1) {
                this.f2604o = 0;
            }
            if (this.f2605p != -1) {
                this.f2605p = 0;
            }
            if (this.f2606q != -1) {
                this.f2606q = 0;
            }
            if (this.f2608s != -1) {
                this.f2608s = 0;
            }
            while (true) {
                if (arrayList.size() < this.j && arrayList.size() < 15) {
                    this.f2610u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c8);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f2593b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f2604o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f2604o, length, 33);
            }
            if (this.f2605p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f2605p, length, 33);
            }
            if (this.f2606q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f2607r), this.f2606q, length, 33);
            }
            if (this.f2608s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f2609t), this.f2608s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f2592a.clear();
        this.f2593b.clear();
        this.f2604o = -1;
        this.f2605p = -1;
        this.f2606q = -1;
        this.f2608s = -1;
        this.f2610u = 0;
        this.f2594c = false;
        this.f2595d = false;
        this.f2596e = 4;
        this.f = false;
        this.f2597g = 0;
        this.f2598h = 0;
        this.f2599i = 0;
        this.j = 15;
        this.f2600k = 0;
        this.f2601l = 0;
        this.f2602m = 0;
        int i7 = f2588w;
        this.f2603n = i7;
        this.f2607r = f2587v;
        this.f2609t = i7;
    }

    public final void e(boolean z7, boolean z8) {
        int i7 = this.f2604o;
        SpannableStringBuilder spannableStringBuilder = this.f2593b;
        if (i7 != -1) {
            if (!z7) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f2604o, spannableStringBuilder.length(), 33);
                this.f2604o = -1;
            }
        } else if (z7) {
            this.f2604o = spannableStringBuilder.length();
        }
        if (this.f2605p != -1) {
            if (!z8) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f2605p, spannableStringBuilder.length(), 33);
                this.f2605p = -1;
            }
        } else if (z8) {
            this.f2605p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i8) {
        int i9 = this.f2606q;
        SpannableStringBuilder spannableStringBuilder = this.f2593b;
        if (i9 != -1 && this.f2607r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f2607r), this.f2606q, spannableStringBuilder.length(), 33);
        }
        if (i7 != f2587v) {
            this.f2606q = spannableStringBuilder.length();
            this.f2607r = i7;
        }
        if (this.f2608s != -1 && this.f2609t != i8) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f2609t), this.f2608s, spannableStringBuilder.length(), 33);
        }
        if (i8 != f2588w) {
            this.f2608s = spannableStringBuilder.length();
            this.f2609t = i8;
        }
    }
}
