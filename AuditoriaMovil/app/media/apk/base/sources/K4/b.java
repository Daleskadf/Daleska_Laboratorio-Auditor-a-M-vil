package K4;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f2644a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f2645b;

    /* renamed from: c  reason: collision with root package name */
    public final Type[] f2646c;

    public b(Type type, Class cls, Type... typeArr) {
        Type a7;
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        if (type == null) {
            a7 = null;
        } else {
            a7 = d.a(type);
        }
        this.f2644a = a7;
        this.f2645b = d.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f2646c = typeArr2;
        int length = typeArr2.length;
        for (int i7 = 0; i7 < length; i7++) {
            Objects.requireNonNull(this.f2646c[i7]);
            d.c(this.f2646c[i7]);
            Type[] typeArr3 = this.f2646c;
            typeArr3[i7] = d.a(typeArr3[i7]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && d.e(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f2646c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f2644a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f2645b;
    }

    public final int hashCode() {
        int i7;
        int hashCode = Arrays.hashCode(this.f2646c) ^ this.f2645b.hashCode();
        Type type = this.f2644a;
        if (type != null) {
            i7 = type.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        Type[] typeArr = this.f2646c;
        int length = typeArr.length;
        Type type = this.f2645b;
        if (length == 0) {
            return d.l(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.l(type));
        sb.append("<");
        sb.append(d.l(typeArr[0]));
        for (int i7 = 1; i7 < length; i7++) {
            sb.append(", ");
            sb.append(d.l(typeArr[i7]));
        }
        sb.append(">");
        return sb.toString();
    }
}
