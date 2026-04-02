package L4;
/* loaded from: classes.dex */
public class j0 extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        try {
            int v6 = aVar.v();
            if (v6 <= 255 && v6 >= -128) {
                return Byte.valueOf((byte) v6);
            }
            StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Lossy conversion from ", v6, " to byte; at path ");
            k2.append(aVar.p());
            throw new RuntimeException(k2.toString());
        } catch (NumberFormatException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.o();
        } else {
            cVar.u(number.byteValue());
        }
    }
}
