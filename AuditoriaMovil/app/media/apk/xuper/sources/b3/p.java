package b3;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface p {

    /* loaded from: classes.dex */
    public static class a implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public static final a f4546f = new a(Collections.emptySet(), false, false, false, true);

        /* renamed from: a  reason: collision with root package name */
        public final Set f4547a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4548b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4549c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4550d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f4551e;

        public a(Set set, boolean z10, boolean z11, boolean z12, boolean z13) {
            if (set == null) {
                this.f4547a = Collections.emptySet();
            } else {
                this.f4547a = set;
            }
            this.f4548b = z10;
            this.f4549c = z11;
            this.f4550d = z12;
            this.f4551e = z13;
        }

        public static Set a(String[] strArr) {
            if (strArr != null && strArr.length != 0) {
                HashSet hashSet = new HashSet(strArr.length);
                for (String str : strArr) {
                    hashSet.add(str);
                }
                return hashSet;
            }
            return Collections.emptySet();
        }

        public static boolean b(Set set, boolean z10, boolean z11, boolean z12, boolean z13) {
            a aVar = f4546f;
            if (z10 != aVar.f4548b || z11 != aVar.f4549c || z12 != aVar.f4550d || z13 != aVar.f4551e) {
                return false;
            }
            if (set != null && set.size() != 0) {
                return false;
            }
            return true;
        }

        public static boolean c(a aVar, a aVar2) {
            if (aVar.f4548b == aVar2.f4548b && aVar.f4551e == aVar2.f4551e && aVar.f4549c == aVar2.f4549c && aVar.f4550d == aVar2.f4550d && aVar.f4547a.equals(aVar2.f4547a)) {
                return true;
            }
            return false;
        }

        public static Set d(Set set, Set set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }

        public static a e(Set set, boolean z10, boolean z11, boolean z12, boolean z13) {
            if (b(set, z10, z11, z12, z13)) {
                return f4546f;
            }
            return new a(set, z10, z11, z12, z13);
        }

        public static a f() {
            return f4546f;
        }

        public static a i(p pVar) {
            if (pVar == null) {
                return f4546f;
            }
            return e(a(pVar.value()), pVar.ignoreUnknown(), pVar.allowGetters(), pVar.allowSetters(), false);
        }

        public static a k(a aVar, a aVar2) {
            if (aVar != null) {
                return aVar.l(aVar2);
            }
            return aVar2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass() && c(this, (a) obj)) {
                return true;
            }
            return false;
        }

        public Set g() {
            if (this.f4550d) {
                return Collections.emptySet();
            }
            return this.f4547a;
        }

        public Set h() {
            if (this.f4549c) {
                return Collections.emptySet();
            }
            return this.f4547a;
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int i13;
            int size = this.f4547a.size();
            if (this.f4548b) {
                i10 = 1;
            } else {
                i10 = -3;
            }
            int i14 = size + i10;
            if (this.f4549c) {
                i11 = 3;
            } else {
                i11 = -7;
            }
            int i15 = i14 + i11;
            if (this.f4550d) {
                i12 = 7;
            } else {
                i12 = -11;
            }
            int i16 = i15 + i12;
            if (this.f4551e) {
                i13 = 11;
            } else {
                i13 = -13;
            }
            return i16 + i13;
        }

        public boolean j() {
            return this.f4548b;
        }

        public a l(a aVar) {
            boolean z10;
            boolean z11;
            if (aVar != null && aVar != f4546f) {
                if (!aVar.f4551e) {
                    return aVar;
                }
                if (c(this, aVar)) {
                    return this;
                }
                Set d10 = d(this.f4547a, aVar.f4547a);
                boolean z12 = false;
                if (!this.f4548b && !aVar.f4548b) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!this.f4549c && !aVar.f4549c) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                return e(d10, z10, z11, (this.f4550d || aVar.f4550d) ? true : true, true);
            }
            return this;
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.f4547a, Boolean.valueOf(this.f4548b), Boolean.valueOf(this.f4549c), Boolean.valueOf(this.f4550d), Boolean.valueOf(this.f4551e));
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
