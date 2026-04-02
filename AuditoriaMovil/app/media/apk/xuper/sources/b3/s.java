package b3;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface s {

    /* loaded from: classes.dex */
    public static class a implements Serializable {

        /* renamed from: b  reason: collision with root package name */
        public static final a f4577b = new a(null);

        /* renamed from: a  reason: collision with root package name */
        public final Set f4578a;

        public a(Set set) {
            this.f4578a = set;
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

        public static boolean b(Set set, Set set2) {
            if (set == null) {
                if (set2 == null) {
                    return true;
                }
                return false;
            }
            return set.equals(set2);
        }

        public static a c() {
            return f4577b;
        }

        public static a d(s sVar) {
            if (sVar == null) {
                return f4577b;
            }
            return new a(a(sVar.value()));
        }

        public Set e() {
            return this.f4578a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass() && b(this.f4578a, ((a) obj).f4578a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Set set = this.f4578a;
            if (set == null) {
                return 0;
            }
            return set.size();
        }

        public String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", this.f4578a);
        }
    }

    String[] value() default {};
}
