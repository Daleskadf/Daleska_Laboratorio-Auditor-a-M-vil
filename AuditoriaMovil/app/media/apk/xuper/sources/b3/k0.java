package b3;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class k0 implements Serializable {

    /* loaded from: classes.dex */
    public static final class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Class f4541a;

        /* renamed from: b  reason: collision with root package name */
        public final Class f4542b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f4543c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4544d;

        public a(Class cls, Class cls2, Object obj) {
            if (obj != null) {
                this.f4541a = cls;
                this.f4542b = cls2;
                this.f4543c = obj;
                int hashCode = obj.hashCode() + cls.getName().hashCode();
                this.f4544d = cls2 != null ? hashCode ^ cls2.getName().hashCode() : hashCode;
                return;
            }
            throw new IllegalArgumentException("Can not construct IdKey for null key");
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.f4543c.equals(this.f4543c) && aVar.f4541a == this.f4541a && aVar.f4542b == this.f4542b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f4544d;
        }

        public String toString() {
            String name;
            Object[] objArr = new Object[3];
            objArr[0] = this.f4543c;
            Class cls = this.f4541a;
            String str = "NONE";
            if (cls == null) {
                name = "NONE";
            } else {
                name = cls.getName();
            }
            objArr[1] = name;
            Class cls2 = this.f4542b;
            if (cls2 != null) {
                str = cls2.getName();
            }
            objArr[2] = str;
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", objArr);
        }
    }

    public abstract boolean a(k0 k0Var);

    public abstract k0 b(Class cls);

    public abstract Object c(Object obj);

    public abstract Class d();

    public boolean e(String str, Object obj) {
        return false;
    }

    public abstract a f(Object obj);

    public boolean g() {
        return false;
    }

    public abstract k0 h(Object obj);
}
