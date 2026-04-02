package p6;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
/* loaded from: classes.dex */
public abstract class h extends AbstractC1704g implements kotlin.jvm.internal.g {

    /* renamed from: a  reason: collision with root package name */
    public final int f15316a;

    public h(n6.d dVar) {
        super(dVar);
        this.f15316a = 2;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.f15316a;
    }

    @Override // p6.AbstractC1698a
    public final String toString() {
        if (getCompletion() == null) {
            s.f13797a.getClass();
            String a7 = t.a(this);
            j.d(a7, "renderLambdaToString(...)");
            return a7;
        }
        return super.toString();
    }
}
