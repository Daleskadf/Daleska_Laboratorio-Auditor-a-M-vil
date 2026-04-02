package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class E {
    public static void a(Object obj, long j) {
        AbstractC0525b abstractC0525b = (AbstractC0525b) ((InterfaceC0548z) n0.f7853c.h(obj, j));
        if (abstractC0525b.f7793a) {
            abstractC0525b.f7793a = false;
        }
    }

    public static InterfaceC0548z b(Object obj, long j) {
        int i7;
        InterfaceC0548z interfaceC0548z = (InterfaceC0548z) n0.f7853c.h(obj, j);
        if (!((AbstractC0525b) interfaceC0548z).f7793a) {
            Z z7 = (Z) interfaceC0548z;
            int i8 = z7.f7788c;
            if (i8 == 0) {
                i7 = 10;
            } else {
                i7 = i8 * 2;
            }
            Z h8 = z7.h(i7);
            n0.o(obj, j, h8);
            return h8;
        }
        return interfaceC0548z;
    }
}
