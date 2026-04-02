package c4;

import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class n implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f5562e;

    /* renamed from: f  reason: collision with root package name */
    public static final k3.j[] f5563f;

    /* renamed from: g  reason: collision with root package name */
    public static final n f5564g;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f5565a;

    /* renamed from: b  reason: collision with root package name */
    public final k3.j[] f5566b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f5567c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5568d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Class f5569a;

        /* renamed from: b  reason: collision with root package name */
        public final k3.j[] f5570b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5571c;

        public a(Class cls, k3.j[] jVarArr, int i10) {
            this.f5569a = cls;
            this.f5570b = jVarArr;
            this.f5571c = i10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f5571c == aVar.f5571c && this.f5569a == aVar.f5569a) {
                k3.j[] jVarArr = aVar.f5570b;
                int length = this.f5570b.length;
                if (length == jVarArr.length) {
                    for (int i10 = 0; i10 < length; i10++) {
                        if (!this.f5570b[i10].equals(jVarArr[i10])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f5571c;
        }

        public String toString() {
            return this.f5569a.getName() + "<>";
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final TypeVariable[] f5572a = AbstractList.class.getTypeParameters();

        /* renamed from: b  reason: collision with root package name */
        public static final TypeVariable[] f5573b = Collection.class.getTypeParameters();

        /* renamed from: c  reason: collision with root package name */
        public static final TypeVariable[] f5574c = Iterable.class.getTypeParameters();

        /* renamed from: d  reason: collision with root package name */
        public static final TypeVariable[] f5575d = List.class.getTypeParameters();

        /* renamed from: e  reason: collision with root package name */
        public static final TypeVariable[] f5576e = ArrayList.class.getTypeParameters();

        /* renamed from: f  reason: collision with root package name */
        public static final TypeVariable[] f5577f = Map.class.getTypeParameters();

        /* renamed from: g  reason: collision with root package name */
        public static final TypeVariable[] f5578g = HashMap.class.getTypeParameters();

        /* renamed from: h  reason: collision with root package name */
        public static final TypeVariable[] f5579h = LinkedHashMap.class.getTypeParameters();

        public static TypeVariable[] a(Class cls) {
            if (cls == Collection.class) {
                return f5573b;
            }
            if (cls == List.class) {
                return f5575d;
            }
            if (cls == ArrayList.class) {
                return f5576e;
            }
            if (cls == AbstractList.class) {
                return f5572a;
            }
            if (cls == Iterable.class) {
                return f5574c;
            }
            return cls.getTypeParameters();
        }

        public static TypeVariable[] b(Class cls) {
            if (cls == Map.class) {
                return f5577f;
            }
            if (cls == HashMap.class) {
                return f5578g;
            }
            if (cls == LinkedHashMap.class) {
                return f5579h;
            }
            return cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        f5562e = strArr;
        k3.j[] jVarArr = new k3.j[0];
        f5563f = jVarArr;
        f5564g = new n(strArr, jVarArr, null);
    }

    public n(String[] strArr, k3.j[] jVarArr, String[] strArr2) {
        strArr = strArr == null ? f5562e : strArr;
        this.f5565a = strArr;
        jVarArr = jVarArr == null ? f5563f : jVarArr;
        this.f5566b = jVarArr;
        if (strArr.length == jVarArr.length) {
            int length = jVarArr.length;
            int i10 = 1;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.f5566b[i11].hashCode();
            }
            this.f5567c = strArr2;
            this.f5568d = i10;
            return;
        }
        throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + jVarArr.length + ")");
    }

    public static n b(Class cls, List list) {
        k3.j[] jVarArr;
        if (list != null && !list.isEmpty()) {
            jVarArr = (k3.j[]) list.toArray(f5563f);
        } else {
            jVarArr = f5563f;
        }
        return e(cls, jVarArr);
    }

    public static n c(Class cls, k3.j jVar) {
        int length;
        TypeVariable[] a10 = b.a(cls);
        if (a10 == null) {
            length = 0;
        } else {
            length = a10.length;
        }
        if (length == 1) {
            return new n(new String[]{a10[0].getName()}, new k3.j[]{jVar}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static n d(Class cls, k3.j jVar, k3.j jVar2) {
        int length;
        TypeVariable[] b10 = b.b(cls);
        if (b10 == null) {
            length = 0;
        } else {
            length = b10.length;
        }
        if (length == 2) {
            return new n(new String[]{b10[0].getName(), b10[1].getName()}, new k3.j[]{jVar, jVar2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static n e(Class cls, k3.j[] jVarArr) {
        String[] strArr;
        String str;
        if (jVarArr == null) {
            jVarArr = f5563f;
        } else {
            int length = jVarArr.length;
            if (length != 1) {
                if (length == 2) {
                    return d(cls, jVarArr[0], jVarArr[1]);
                }
            } else {
                return c(cls, jVarArr[0]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                strArr[i10] = typeParameters[i10].getName();
            }
        } else {
            strArr = f5562e;
        }
        if (strArr.length != jVarArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(jVarArr.length);
            sb.append(" type parameter");
            if (jVarArr.length == 1) {
                str = "";
            } else {
                str = "s";
            }
            sb.append(str);
            sb.append(": class expects ");
            sb.append(strArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new n(strArr, jVarArr, null);
    }

    public static n f(List list, List list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            return new n((String[]) list.toArray(f5562e), (k3.j[]) list2.toArray(f5563f), null);
        }
        return f5564g;
    }

    public static n g(Class cls, k3.j jVar) {
        int length;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null) {
            length = 0;
        } else {
            length = typeParameters.length;
        }
        if (length == 0) {
            return f5564g;
        }
        if (length == 1) {
            return new n(new String[]{typeParameters[0].getName()}, new k3.j[]{jVar}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static n h(Class cls, k3.j[] jVarArr) {
        String str;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            if (jVarArr == null) {
                jVarArr = f5563f;
            }
            int length = typeParameters.length;
            String[] strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = typeParameters[i10].getName();
            }
            if (length != jVarArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot create TypeBindings for class ");
                sb.append(cls.getName());
                sb.append(" with ");
                sb.append(jVarArr.length);
                sb.append(" type parameter");
                if (jVarArr.length == 1) {
                    str = "";
                } else {
                    str = "s";
                }
                sb.append(str);
                sb.append(": class expects ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            return new n(strArr, jVarArr, null);
        }
        return f5564g;
    }

    public static n i() {
        return f5564g;
    }

    public Object a(Class cls) {
        return new a(cls, this.f5566b, this.f5568d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!d4.h.H(obj, getClass())) {
            return false;
        }
        n nVar = (n) obj;
        int length = this.f5566b.length;
        if (length != nVar.o()) {
            return false;
        }
        k3.j[] jVarArr = nVar.f5566b;
        for (int i10 = 0; i10 < length; i10++) {
            if (!jVarArr[i10].equals(this.f5566b[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f5568d;
    }

    public k3.j j(String str) {
        k3.j b02;
        int length = this.f5565a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(this.f5565a[i10])) {
                k3.j jVar = this.f5566b[i10];
                if ((jVar instanceof k) && (b02 = ((k) jVar).b0()) != null) {
                    return b02;
                }
                return jVar;
            }
        }
        return null;
    }

    public k3.j k(int i10) {
        if (i10 >= 0) {
            k3.j[] jVarArr = this.f5566b;
            if (i10 < jVarArr.length) {
                return jVarArr[i10];
            }
            return null;
        }
        return null;
    }

    public List l() {
        k3.j[] jVarArr = this.f5566b;
        if (jVarArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(jVarArr);
    }

    public boolean m(String str) {
        String[] strArr = this.f5567c;
        if (strArr != null) {
            int length = strArr.length;
            do {
                length--;
                if (length < 0) {
                    return false;
                }
            } while (!str.equals(this.f5567c[length]));
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.f5566b.length == 0) {
            return true;
        }
        return false;
    }

    public int o() {
        return this.f5566b.length;
    }

    public k3.j[] p() {
        return this.f5566b;
    }

    public n q(String str) {
        int length;
        String[] strArr;
        String[] strArr2 = this.f5567c;
        if (strArr2 == null) {
            length = 0;
        } else {
            length = strArr2.length;
        }
        if (length == 0) {
            strArr = new String[1];
        } else {
            strArr = (String[]) Arrays.copyOf(strArr2, length + 1);
        }
        strArr[length] = str;
        return new n(this.f5565a, this.f5566b, strArr);
    }

    public String toString() {
        if (this.f5566b.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ASCIIPropertyListParser.DATA_BEGIN_TOKEN);
        int length = this.f5566b.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                sb.append(ASCIIPropertyListParser.ARRAY_ITEM_DELIMITER_TOKEN);
            }
            sb.append(this.f5566b[i10].m());
        }
        sb.append(ASCIIPropertyListParser.DATA_END_TOKEN);
        return sb.toString();
    }
}
