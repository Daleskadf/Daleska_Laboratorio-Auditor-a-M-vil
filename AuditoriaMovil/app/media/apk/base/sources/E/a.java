package E;

import D.t0;
import android.util.Size;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public t0 f909a;

    /* renamed from: b  reason: collision with root package name */
    public final t0 f910b = null;

    /* renamed from: c  reason: collision with root package name */
    public final Size f911c;

    /* renamed from: d  reason: collision with root package name */
    public final int f912d;

    /* renamed from: e  reason: collision with root package name */
    public final int f913e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final M.f f914g;

    /* renamed from: h  reason: collision with root package name */
    public final M.f f915h;

    public a(Size size, int i7, int i8, boolean z7, M.f fVar, M.f fVar2) {
        if (size != null) {
            this.f911c = size;
            this.f912d = i7;
            this.f913e = i8;
            this.f = z7;
            this.f914g = fVar;
            this.f915h = fVar2;
            return;
        }
        throw new NullPointerException("Null size");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f911c.equals(aVar.f911c) && this.f912d == aVar.f912d && this.f913e == aVar.f913e && this.f == aVar.f && this.f914g.equals(aVar.f914g) && this.f915h.equals(aVar.f915h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f911c.hashCode() ^ 1000003) * 1000003) ^ this.f912d) * 1000003) ^ this.f913e) * 1000003;
        if (this.f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 583896283) ^ 35) * 1000003) ^ this.f914g.hashCode()) * 1000003) ^ this.f915h.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f911c + ", inputFormat=" + this.f912d + ", outputFormat=" + this.f913e + ", virtualCamera=" + this.f + ", imageReaderProxyProvider=null, postviewSize=null, postviewImageFormat=35, requestEdge=" + this.f914g + ", errorEdge=" + this.f915h + "}";
    }
}
