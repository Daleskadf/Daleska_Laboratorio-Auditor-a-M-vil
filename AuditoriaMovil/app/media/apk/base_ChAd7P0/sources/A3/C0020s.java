package A3;

import java.io.Serializable;
import java.util.Arrays;
/* renamed from: A3.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020s extends d0 implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final z3.i f189a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f190b;

    public C0020s(z3.i iVar, d0 d0Var) {
        iVar.getClass();
        this.f189a = iVar;
        d0Var.getClass();
        this.f190b = d0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        z3.i iVar = this.f189a;
        return this.f190b.compare(iVar.apply(obj), iVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0020s)) {
            return false;
        }
        C0020s c0020s = (C0020s) obj;
        if (this.f189a.equals(c0020s.f189a) && this.f190b.equals(c0020s.f190b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189a, this.f190b});
    }

    public final String toString() {
        return this.f190b + ".onResultOf(" + this.f189a + ")";
    }
}
