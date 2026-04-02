package androidx.preference;

import V1.a;
import V1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import c5.C0639a;
import com.example.appecoactivate.R;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: Y  reason: collision with root package name */
    public final CharSequence[] f7984Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f7985Z;

    /* JADX WARN: Type inference failed for: r2v9, types: [c5.a, java.lang.Object] */
    public ListPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f5932d, i7, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f7984Y = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C0639a.f8417b == null) {
                C0639a.f8417b = new Object();
            }
            this.f7986X = C0639a.f8417b;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.f, i7, 0);
        this.f7985Z = Y.b.d(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        a aVar = this.f7986X;
        if (aVar != null) {
            return aVar.e(this);
        }
        CharSequence a7 = super.a();
        String str = this.f7985Z;
        if (str == null) {
            return a7;
        }
        String format = String.format(str, StringUtils.EMPTY);
        if (TextUtils.equals(format, a7)) {
            return a7;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i7) {
        return typedArray.getString(i7);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.b.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
