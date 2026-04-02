package p6;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
/* loaded from: classes.dex */
public abstract class i extends AbstractC1700c implements kotlin.jvm.internal.g {
    private final int arity;

    public i(int i7, n6.d dVar) {
        super(dVar);
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    @Override // p6.AbstractC1698a
    public String toString() {
        if (getCompletion() == null) {
            s.f13797a.getClass();
            String a7 = t.a(this);
            j.d(a7, "renderLambdaToString(...)");
            return a7;
        }
        return super.toString();
    }
}
