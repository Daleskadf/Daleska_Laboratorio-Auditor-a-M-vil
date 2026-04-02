package L4;

import java.lang.reflect.Array;
import java.util.ArrayList;
/* renamed from: L4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210b extends I4.G {

    /* renamed from: c  reason: collision with root package name */
    public static final C0209a f2938c = new C0209a();

    /* renamed from: a  reason: collision with root package name */
    public final Class f2939a;

    /* renamed from: b  reason: collision with root package name */
    public final I f2940b;

    public C0210b(I4.n nVar, I4.G g3, Class cls) {
        this.f2940b = new I(nVar, g3, cls);
        this.f2939a = cls;
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.q()) {
            arrayList.add(((I4.G) this.f2940b.f2936c).b(aVar));
        }
        aVar.g();
        int size = arrayList.size();
        Class cls = this.f2939a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, size);
            for (int i7 = 0; i7 < size; i7++) {
                Array.set(newInstance, i7, arrayList.get(i7));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, size));
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        if (obj == null) {
            cVar.o();
            return;
        }
        cVar.b();
        int length = Array.getLength(obj);
        for (int i7 = 0; i7 < length; i7++) {
            this.f2940b.c(cVar, Array.get(obj, i7));
        }
        cVar.g();
    }
}
