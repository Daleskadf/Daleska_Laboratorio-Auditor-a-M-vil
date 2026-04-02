package F2;

import k6.InterfaceC1408a;
/* loaded from: classes.dex */
public final class a implements InterfaceC1408a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1157c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile b f1158a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f1159b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, F2.a, k6.a] */
    public static InterfaceC1408a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f1159b = f1157c;
        obj.f1158a = bVar;
        return obj;
    }

    @Override // k6.InterfaceC1408a
    public final Object get() {
        Object obj = this.f1159b;
        Object obj2 = f1157c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f1159b;
                    if (obj == obj2) {
                        obj = this.f1158a.get();
                        Object obj3 = this.f1159b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f1159b = obj;
                        this.f1158a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
