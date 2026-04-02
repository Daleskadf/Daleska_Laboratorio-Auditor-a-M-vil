package t4;

import H4.W;
import a6.o0;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.P;
import com.google.protobuf.T;
/* renamed from: t4.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1815C extends W {

    /* renamed from: g  reason: collision with root package name */
    public final EnumC1816D f15768g;

    /* renamed from: h  reason: collision with root package name */
    public final T f15769h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC0852m f15770i;
    public final o0 j;

    public C1815C(EnumC1816D enumC1816D, T t7, AbstractC0852m abstractC0852m, o0 o0Var) {
        boolean z7;
        if (o0Var != null && enumC1816D != EnumC1816D.Removed) {
            z7 = false;
        } else {
            z7 = true;
        }
        m5.d.i("Got cause for a target change that was not a removal", z7, new Object[0]);
        this.f15768g = enumC1816D;
        this.f15769h = t7;
        this.f15770i = abstractC0852m;
        if (o0Var != null && !o0Var.e()) {
            this.j = o0Var;
        } else {
            this.j = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1815C.class != obj.getClass()) {
            return false;
        }
        C1815C c1815c = (C1815C) obj;
        if (this.f15768g != c1815c.f15768g) {
            return false;
        }
        if (!((P) this.f15769h).equals(c1815c.f15769h) || !this.f15770i.equals(c1815c.f15770i)) {
            return false;
        }
        o0 o0Var = c1815c.j;
        o0 o0Var2 = this.j;
        if (o0Var2 != null) {
            if (o0Var != null && o0Var2.f7183a.equals(o0Var.f7183a)) {
                return true;
            }
            return false;
        } else if (o0Var == null) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((P) this.f15769h).hashCode();
        int hashCode2 = (this.f15770i.hashCode() + ((hashCode + (this.f15768g.hashCode() * 31)) * 31)) * 31;
        o0 o0Var = this.j;
        if (o0Var != null) {
            i7 = o0Var.f7183a.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode2 + i7;
    }

    public final String toString() {
        return "WatchTargetChange{changeType=" + this.f15768g + ", targetIds=" + this.f15769h + '}';
    }
}
