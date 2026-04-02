package androidx.preference;

import V1.a;
import V1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.example.appecoactivate.R;
import com.google.android.gms.common.api.f;
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: X  reason: collision with root package name */
    public a f7986X;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7987a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7988b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f7989c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f7990d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7991e;
    public final Object f;

    public Preference(Context context, AttributeSet attributeSet, int i7) {
        this.f7988b = f.API_PRIORITY_OTHER;
        this.f7987a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f, i7, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f7991e = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f7989c = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f7990d = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f7988b = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, f.API_PRIORITY_OTHER));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z7 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        Y.b.d(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z7));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z7));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f = c(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        a aVar = this.f7986X;
        if (aVar != null) {
            return aVar.e(this);
        }
        return this.f7990d;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i7) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i7 = preference2.f7988b;
        int i8 = this.f7988b;
        if (i8 != i7) {
            return i8 - i7;
        }
        CharSequence charSequence = preference2.f7989c;
        CharSequence charSequence2 = this.f7989c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f7989c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a7 = a();
        if (!TextUtils.isEmpty(a7)) {
            sb.append(a7);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.b.a(context, R.attr.preferenceStyle, 16842894));
    }
}
