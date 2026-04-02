package m4;

import q4.q;
/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f14046a;

    /* renamed from: b  reason: collision with root package name */
    public final h f14047b;

    /* renamed from: c  reason: collision with root package name */
    public final q f14048c;

    public i(String str, h hVar, q qVar) {
        this.f14046a = str;
        this.f14047b = hVar;
        this.f14048c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f14046a.equals(iVar.f14046a) || !this.f14047b.equals(iVar.f14047b)) {
            return false;
        }
        return this.f14048c.equals(iVar.f14048c);
    }

    public final int hashCode() {
        int hashCode = this.f14047b.hashCode();
        return this.f14048c.f15371a.hashCode() + ((hashCode + (this.f14046a.hashCode() * 31)) * 31);
    }
}
