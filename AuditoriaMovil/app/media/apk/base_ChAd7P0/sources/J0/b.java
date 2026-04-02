package J0;

import K0.x;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: A  reason: collision with root package name */
    public static final String f2304A;

    /* renamed from: B  reason: collision with root package name */
    public static final String f2305B;

    /* renamed from: C  reason: collision with root package name */
    public static final String f2306C;

    /* renamed from: D  reason: collision with root package name */
    public static final String f2307D;

    /* renamed from: E  reason: collision with root package name */
    public static final String f2308E;

    /* renamed from: F  reason: collision with root package name */
    public static final String f2309F;

    /* renamed from: G  reason: collision with root package name */
    public static final String f2310G;

    /* renamed from: H  reason: collision with root package name */
    public static final String f2311H;

    /* renamed from: I  reason: collision with root package name */
    public static final String f2312I;

    /* renamed from: J  reason: collision with root package name */
    public static final String f2313J;

    /* renamed from: r  reason: collision with root package name */
    public static final String f2314r;

    /* renamed from: s  reason: collision with root package name */
    public static final String f2315s;

    /* renamed from: t  reason: collision with root package name */
    public static final String f2316t;

    /* renamed from: u  reason: collision with root package name */
    public static final String f2317u;

    /* renamed from: v  reason: collision with root package name */
    public static final String f2318v;

    /* renamed from: w  reason: collision with root package name */
    public static final String f2319w;

    /* renamed from: x  reason: collision with root package name */
    public static final String f2320x;

    /* renamed from: y  reason: collision with root package name */
    public static final String f2321y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f2322z;

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f2323a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f2324b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f2325c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f2326d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2327e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2328g;

    /* renamed from: h  reason: collision with root package name */
    public final float f2329h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2330i;
    public final float j;

    /* renamed from: k  reason: collision with root package name */
    public final float f2331k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2332l;

    /* renamed from: m  reason: collision with root package name */
    public final int f2333m;

    /* renamed from: n  reason: collision with root package name */
    public final int f2334n;

    /* renamed from: o  reason: collision with root package name */
    public final float f2335o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2336p;

    /* renamed from: q  reason: collision with root package name */
    public final float f2337q;

    static {
        new b(StringUtils.EMPTY, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i7 = x.f2529a;
        f2314r = Integer.toString(0, 36);
        f2315s = Integer.toString(17, 36);
        f2316t = Integer.toString(1, 36);
        f2317u = Integer.toString(2, 36);
        f2318v = Integer.toString(3, 36);
        f2319w = Integer.toString(18, 36);
        f2320x = Integer.toString(4, 36);
        f2321y = Integer.toString(5, 36);
        f2322z = Integer.toString(6, 36);
        f2304A = Integer.toString(7, 36);
        f2305B = Integer.toString(8, 36);
        f2306C = Integer.toString(9, 36);
        f2307D = Integer.toString(10, 36);
        f2308E = Integer.toString(11, 36);
        f2309F = Integer.toString(12, 36);
        f2310G = Integer.toString(13, 36);
        f2311H = Integer.toString(14, 36);
        f2312I = Integer.toString(15, 36);
        f2313J = Integer.toString(16, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i7, int i8, float f4, int i9, int i10, float f8, float f9, float f10, boolean z7, int i11, int i12, float f11) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            K0.a.e(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f2323a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f2323a = charSequence.toString();
        } else {
            this.f2323a = null;
        }
        this.f2324b = alignment;
        this.f2325c = alignment2;
        this.f2326d = bitmap;
        this.f2327e = f;
        this.f = i7;
        this.f2328g = i8;
        this.f2329h = f4;
        this.f2330i = i9;
        this.j = f9;
        this.f2331k = f10;
        this.f2332l = z7;
        this.f2333m = i11;
        this.f2334n = i10;
        this.f2335o = f8;
        this.f2336p = i12;
        this.f2337q = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f2323a, bVar.f2323a) && this.f2324b == bVar.f2324b && this.f2325c == bVar.f2325c) {
            Bitmap bitmap = bVar.f2326d;
            Bitmap bitmap2 = this.f2326d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f2327e == bVar.f2327e && this.f == bVar.f && this.f2328g == bVar.f2328g && this.f2329h == bVar.f2329h && this.f2330i == bVar.f2330i && this.j == bVar.j && this.f2331k == bVar.f2331k && this.f2332l == bVar.f2332l && this.f2333m == bVar.f2333m && this.f2334n == bVar.f2334n && this.f2335o == bVar.f2335o && this.f2336p == bVar.f2336p && this.f2337q == bVar.f2337q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2323a, this.f2324b, this.f2325c, this.f2326d, Float.valueOf(this.f2327e), Integer.valueOf(this.f), Integer.valueOf(this.f2328g), Float.valueOf(this.f2329h), Integer.valueOf(this.f2330i), Float.valueOf(this.j), Float.valueOf(this.f2331k), Boolean.valueOf(this.f2332l), Integer.valueOf(this.f2333m), Integer.valueOf(this.f2334n), Float.valueOf(this.f2335o), Integer.valueOf(this.f2336p), Float.valueOf(this.f2337q)});
    }
}
