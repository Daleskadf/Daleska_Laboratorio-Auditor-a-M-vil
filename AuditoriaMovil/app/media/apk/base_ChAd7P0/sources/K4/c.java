package K4;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f2647a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f2648b;

    public c(Type[] typeArr, Type[] typeArr2) {
        boolean z7;
        boolean z8;
        if (typeArr2.length <= 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        d.b(z7);
        if (typeArr.length == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        d.b(z8);
        if (typeArr2.length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            d.c(typeArr2[0]);
            d.b(typeArr[0] == Object.class);
            this.f2648b = d.a(typeArr2[0]);
            this.f2647a = Object.class;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        d.c(typeArr[0]);
        this.f2648b = null;
        this.f2647a = d.a(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && d.e(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f2648b;
        return type != null ? new Type[]{type} : d.f2649a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f2647a};
    }

    public final int hashCode() {
        int i7;
        Type type = this.f2648b;
        if (type != null) {
            i7 = type.hashCode() + 31;
        } else {
            i7 = 1;
        }
        return i7 ^ (this.f2647a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f2648b;
        if (type != null) {
            return "? super " + d.l(type);
        }
        Type type2 = this.f2647a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.l(type2);
    }
}
