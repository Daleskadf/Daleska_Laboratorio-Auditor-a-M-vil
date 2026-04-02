package J0;

import K0.x;
import android.os.Bundle;
import android.text.Spanned;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2340a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f2341b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f2342c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f2343d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f2344e;

    static {
        int i7 = x.f2529a;
        f2340a = Integer.toString(0, 36);
        f2341b = Integer.toString(1, 36);
        f2342c = Integer.toString(2, 36);
        f2343d = Integer.toString(3, 36);
        f2344e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f2340a, spanned.getSpanStart(obj));
        bundle2.putInt(f2341b, spanned.getSpanEnd(obj));
        bundle2.putInt(f2342c, spanned.getSpanFlags(obj));
        bundle2.putInt(f2343d, i7);
        if (bundle != null) {
            bundle2.putBundle(f2344e, bundle);
        }
        return bundle2;
    }
}
