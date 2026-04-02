package d0;

import android.os.Build;
import java.util.Locale;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final e f10165b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final g f10166a;

    public e(g gVar) {
        this.f10166a = gVar;
    }

    public static e a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new e(new h(X.a.b(localeArr)));
        }
        return new e(new f(localeArr));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f10166a.equals(((e) obj).f10166a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10166a.hashCode();
    }

    public final String toString() {
        return this.f10166a.toString();
    }
}
