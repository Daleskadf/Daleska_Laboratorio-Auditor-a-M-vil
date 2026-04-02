package O;

import D.AbstractC0059i;
import android.opengl.EGLSurface;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final EGLSurface f3459a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3460b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3461c;

    public c(EGLSurface eGLSurface, int i7, int i8) {
        if (eGLSurface != null) {
            this.f3459a = eGLSurface;
            this.f3460b = i7;
            this.f3461c = i8;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3459a.equals(cVar.f3459a) && this.f3460b == cVar.f3460b && this.f3461c == cVar.f3461c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3459a.hashCode() ^ 1000003) * 1000003) ^ this.f3460b) * 1000003) ^ this.f3461c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.f3459a);
        sb.append(", width=");
        sb.append(this.f3460b);
        sb.append(", height=");
        return AbstractC0059i.B(sb, this.f3461c, "}");
    }
}
