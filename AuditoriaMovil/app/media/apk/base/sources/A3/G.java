package A3;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class G extends AbstractC0017o implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f90a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f91b;

    public G(Object obj, Object obj2) {
        this.f90a = obj;
        this.f91b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f90a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f91b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
