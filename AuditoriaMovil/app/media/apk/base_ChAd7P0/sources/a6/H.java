package a6;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLong f7079d = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final String f7080a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7081b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7082c;

    public H(String str, String str2, long j) {
        G.i.j(str, "typeName");
        G.i.f("empty type", !str.isEmpty());
        this.f7080a = str;
        this.f7081b = str2;
        this.f7082c = j;
    }

    public static H a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new H(simpleName, str, f7079d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7080a + "<" + this.f7082c + ">");
        String str = this.f7081b;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
