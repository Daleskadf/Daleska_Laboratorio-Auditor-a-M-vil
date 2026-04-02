package p;

import android.text.StaticLayout;
import android.widget.TextView;
/* loaded from: classes.dex */
public abstract class I {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) J.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
