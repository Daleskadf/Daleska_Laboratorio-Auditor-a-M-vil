package androidx.preference;

import V1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.example.appecoactivate.R;
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f5930b, i7, 0);
        Y.b.d(obtainStyledAttributes, 9, 0);
        Y.b.d(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        Y.b.d(obtainStyledAttributes, 11, 3);
        Y.b.d(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.b.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
