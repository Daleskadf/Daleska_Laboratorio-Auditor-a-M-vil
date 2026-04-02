package androidx.preference;

import V1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.example.appecoactivate.R;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: Y  reason: collision with root package name */
    public final int f7992Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f7993Z;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f5936i, R.attr.seekBarPreferenceStyle, 0);
        int i7 = obtainStyledAttributes.getInt(3, 0);
        int i8 = obtainStyledAttributes.getInt(1, 100);
        i8 = i8 < i7 ? i7 : i8;
        if (i8 != this.f7992Y) {
            this.f7992Y = i8;
        }
        int i9 = obtainStyledAttributes.getInt(4, 0);
        if (i9 != this.f7993Z) {
            this.f7993Z = Math.min(this.f7992Y - i7, Math.abs(i9));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i7) {
        return Integer.valueOf(typedArray.getInt(i7, 0));
    }
}
