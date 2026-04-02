package r4;

import H4.p1;
import j$.util.DesugarCollections;
import java.util.List;
/* renamed from: r4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1746c implements p {

    /* renamed from: a  reason: collision with root package name */
    public final List f15489a;

    public AbstractC1746c(List list) {
        this.f15489a = DesugarCollections.unmodifiableList(list);
    }

    @Override // r4.p
    public final p1 a(p1 p1Var) {
        return null;
    }

    @Override // r4.p
    public final p1 b(p1 p1Var, p1 p1Var2) {
        return d(p1Var);
    }

    @Override // r4.p
    public final p1 c(p1 p1Var, U3.p pVar) {
        return d(p1Var);
    }

    public abstract p1 d(p1 p1Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f15489a.equals(((AbstractC1746c) obj).f15489a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15489a.hashCode() + (getClass().hashCode() * 31);
    }
}
