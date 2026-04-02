package p;

import android.util.Property;
import androidx.appcompat.widget.SwitchCompat;
/* loaded from: classes.dex */
public final class H0 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).f7439x0);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
    }
}
