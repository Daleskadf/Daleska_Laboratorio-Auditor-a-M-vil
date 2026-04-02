package K4;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f2643a;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f2643a = d.a(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && d.e(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f2643a;
    }

    public final int hashCode() {
        return this.f2643a.hashCode();
    }

    public final String toString() {
        return d.l(this.f2643a) + "[]";
    }
}
