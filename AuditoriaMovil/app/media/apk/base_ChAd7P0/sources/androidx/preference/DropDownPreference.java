package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.example.appecoactivate.R;
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: e0  reason: collision with root package name */
    public final ArrayAdapter f7983e0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.f7983e0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f7984Y;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void b() {
        ArrayAdapter arrayAdapter = this.f7983e0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
