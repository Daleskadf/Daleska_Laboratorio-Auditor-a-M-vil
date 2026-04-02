package A3;

import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a0 implements z3.o, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final int f124a;

    public a0() {
        AbstractC0021t.e(2, "expectedValuesPerKey");
        this.f124a = 2;
    }

    @Override // z3.o
    public final Object get() {
        return new ArrayList(this.f124a);
    }
}
