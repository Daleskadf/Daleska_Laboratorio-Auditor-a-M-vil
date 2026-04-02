package L4;
/* loaded from: classes.dex */
public class N extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        String B7 = aVar.B();
        if (B7.length() == 1) {
            return Character.valueOf(B7.charAt(0));
        }
        StringBuilder m7 = androidx.datastore.preferences.protobuf.Y.m("Expecting character, got: ", B7, "; at ");
        m7.append(aVar.p());
        throw new RuntimeException(m7.toString());
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String valueOf;
        Character ch = (Character) obj;
        if (ch == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(ch);
        }
        cVar.x(valueOf);
    }
}
