package Y;

import android.content.res.Resources;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f6571a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f6572b;

    public i(Resources resources, Resources.Theme theme) {
        this.f6571a = resources;
        this.f6572b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f6571a.equals(iVar.f6571a) && Objects.equals(this.f6572b, iVar.f6572b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6571a, this.f6572b);
    }
}
