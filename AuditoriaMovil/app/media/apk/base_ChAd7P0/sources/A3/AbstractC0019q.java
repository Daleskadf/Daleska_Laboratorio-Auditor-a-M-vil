package A3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: A3.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0019q {

    /* renamed from: a  reason: collision with root package name */
    public transient Set f185a;

    /* renamed from: b  reason: collision with root package name */
    public transient Collection f186b;

    /* renamed from: c  reason: collision with root package name */
    public transient Map f187c;

    public abstract Map a();

    public boolean b(Object obj) {
        for (Collection collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0019q) {
            return a().equals(((AbstractC0019q) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
