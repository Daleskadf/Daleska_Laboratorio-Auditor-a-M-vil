package l6;

import android.util.Size;
import android.view.Surface;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Surface f13872a;

    /* renamed from: b  reason: collision with root package name */
    public final Size f13873b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f13874c;

    public h(Surface surface, Size size, Object obj) {
        this.f13872a = surface;
        this.f13873b = size;
        this.f13874c = (float[]) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.j.a(this.f13872a, hVar.f13872a) && kotlin.jvm.internal.j.a(this.f13873b, hVar.f13873b) && this.f13874c.equals(hVar.f13874c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Surface surface = this.f13872a;
        if (surface == null) {
            hashCode = 0;
        } else {
            hashCode = surface.hashCode();
        }
        int i8 = hashCode * 31;
        Size size = this.f13873b;
        if (size != null) {
            i7 = size.hashCode();
        }
        return this.f13874c.hashCode() + ((i8 + i7) * 31);
    }

    public final String toString() {
        return "(" + this.f13872a + ", " + this.f13873b + ", " + this.f13874c + ')';
    }
}
