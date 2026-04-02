package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends l {

    /* renamed from: e  reason: collision with root package name */
    r f12934e;
    r f;

    /* renamed from: g  reason: collision with root package name */
    r f12935g;

    /* renamed from: h  reason: collision with root package name */
    r f12936h;

    /* renamed from: i  reason: collision with root package name */
    boolean f12937i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(int i7, Object obj, Object obj2, l lVar, r rVar) {
        super(i7, obj, obj2, lVar);
        this.f12934e = rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i7, Object obj) {
        return b(i7, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(int i7, Object obj, Class cls) {
        if (obj != null) {
            r rVar = this;
            do {
                r rVar2 = rVar.f;
                r rVar3 = rVar.f12935g;
                int i8 = rVar.f12915a;
                if (i8 <= i7) {
                    if (i8 >= i7) {
                        Object obj2 = rVar.f12916b;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return rVar;
                        }
                        if (rVar2 != null) {
                            if (rVar3 != null) {
                                if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                    int i9 = ConcurrentHashMap.f12878g;
                                    int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                    if (compareTo != 0) {
                                        if (compareTo >= 0) {
                                            rVar2 = rVar3;
                                        }
                                    }
                                }
                                r b5 = rVar3.b(i7, obj, cls);
                                if (b5 != null) {
                                    return b5;
                                }
                            }
                        }
                    }
                    rVar = rVar3;
                    continue;
                }
                rVar = rVar2;
                continue;
            } while (rVar != null);
            return null;
        }
        return null;
    }
}
