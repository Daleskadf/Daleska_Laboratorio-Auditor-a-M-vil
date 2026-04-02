package P3;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4016b = new a(DesugarCollections.unmodifiableMap(new HashMap()));

    /* renamed from: a  reason: collision with root package name */
    public final Map f4017a;

    public a(Map map) {
        this.f4017a = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f4017a.equals(((a) obj).f4017a);
    }

    public final int hashCode() {
        return this.f4017a.hashCode();
    }

    public final String toString() {
        return this.f4017a.toString();
    }
}
