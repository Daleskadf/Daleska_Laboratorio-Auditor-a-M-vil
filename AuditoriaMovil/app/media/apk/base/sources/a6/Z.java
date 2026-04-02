package a6;
/* loaded from: classes.dex */
public final class Z extends b0 {

    /* renamed from: e  reason: collision with root package name */
    public final a0 f7113e;

    public Z(String str, a0 a0Var) {
        super(a0Var, str, false);
        if (!str.endsWith("-bin")) {
            G.i.j(a0Var, "marshaller");
            this.f7113e = a0Var;
            return;
        }
        throw new IllegalArgumentException(H4.W.z("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
    }

    @Override // a6.b0
    public final Object a(byte[] bArr) {
        return this.f7113e.h(new String(bArr, z3.h.f16884a));
    }

    @Override // a6.b0
    public final byte[] b(Object obj) {
        String a7 = this.f7113e.a(obj);
        G.i.j(a7, "null marshaller.toAsciiString()");
        return a7.getBytes(z3.h.f16884a);
    }
}
