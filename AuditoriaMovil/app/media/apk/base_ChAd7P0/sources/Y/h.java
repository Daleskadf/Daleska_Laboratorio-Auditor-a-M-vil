package Y;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f6568a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f6569b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6570c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f6568a = colorStateList;
        this.f6569b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f6570c = hashCode;
    }
}
