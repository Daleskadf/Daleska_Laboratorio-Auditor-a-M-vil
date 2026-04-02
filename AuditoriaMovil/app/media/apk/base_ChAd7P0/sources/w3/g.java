package w3;
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f16358c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile h f16359a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f16360b;

    /* JADX WARN: Type inference failed for: r0v1, types: [w3.g, java.lang.Object] */
    public static g b(h hVar) {
        if (hVar instanceof g) {
            return (g) hVar;
        }
        ?? obj = new Object();
        obj.f16360b = f16358c;
        obj.f16359a = hVar;
        return obj;
    }

    @Override // w3.i
    public final Object a() {
        Object obj = this.f16360b;
        Object obj2 = f16358c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f16360b;
                    if (obj == obj2) {
                        obj = this.f16359a.a();
                        Object obj3 = this.f16360b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16360b = obj;
                        this.f16359a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
