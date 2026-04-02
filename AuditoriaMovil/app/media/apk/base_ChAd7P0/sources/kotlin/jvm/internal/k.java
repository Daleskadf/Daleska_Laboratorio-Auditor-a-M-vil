package kotlin.jvm.internal;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class k implements g, Serializable {
    private final int arity;

    public k(int i7) {
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        s.f13797a.getClass();
        String a7 = t.a(this);
        j.d(a7, "renderLambdaToString(...)");
        return a7;
    }
}
