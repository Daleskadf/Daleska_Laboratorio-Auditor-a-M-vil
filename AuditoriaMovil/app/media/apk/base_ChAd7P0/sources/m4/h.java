package m4;

import n4.EnumC1514C;
import n4.L;
/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final L f14044a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC1514C f14045b;

    public h(L l8, EnumC1514C enumC1514C) {
        this.f14044a = l8;
        this.f14045b = enumC1514C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f14044a.equals(hVar.f14044a) && this.f14045b == hVar.f14045b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14045b.hashCode() + (this.f14044a.hashCode() * 31);
    }
}
