package N;

import M.m;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final m f3312a;

    /* renamed from: b  reason: collision with root package name */
    public final m f3313b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3314c;

    public b(m mVar, m mVar2, ArrayList arrayList) {
        if (mVar != null) {
            this.f3312a = mVar;
            if (mVar2 != null) {
                this.f3313b = mVar2;
                this.f3314c = arrayList;
                return;
            }
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        throw new NullPointerException("Null primarySurfaceEdge");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3312a.equals(bVar.f3312a) && this.f3313b.equals(bVar.f3313b) && this.f3314c.equals(bVar.f3314c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3312a.hashCode() ^ 1000003) * 1000003) ^ this.f3313b.hashCode()) * 1000003) ^ this.f3314c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f3312a + ", secondarySurfaceEdge=" + this.f3313b + ", outConfigs=" + this.f3314c + "}";
    }
}
