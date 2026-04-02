package L4;
/* renamed from: L4.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0217i implements I4.H {
    @Override // I4.H
    public final I4.G create(I4.n nVar, P4.a aVar) {
        Class cls = aVar.f4022a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new C0218j(cls);
        }
        return null;
    }
}
