package K1;

import android.text.Layout;
import android.text.SpannableStringBuilder;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final d f2579c = new d(0);

    /* renamed from: a  reason: collision with root package name */
    public final J0.b f2580a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2581b;

    public e(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i7, float f4, int i8, boolean z7, int i9, int i10) {
        boolean z8;
        int i11;
        if (z7) {
            i11 = i9;
            z8 = true;
        } else {
            z8 = false;
            i11 = -16777216;
        }
        this.f2580a = new J0.b(spannableStringBuilder, alignment, null, null, f, 0, i7, f4, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z8, i11, Integer.MIN_VALUE, 0.0f);
        this.f2581b = i10;
    }
}
