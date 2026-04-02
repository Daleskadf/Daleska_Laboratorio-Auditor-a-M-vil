package a6;
/* loaded from: classes.dex */
public final class c0 extends b0 {

    /* renamed from: e  reason: collision with root package name */
    public final d0 f7128e;

    public c0(String str, boolean z7, d0 d0Var) {
        super(d0Var, str, z7);
        if (!str.endsWith("-bin")) {
            this.f7128e = d0Var;
            return;
        }
        throw new IllegalArgumentException(H4.W.z("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
    }

    @Override // a6.b0
    public final Object a(byte[] bArr) {
        return this.f7128e.d(bArr);
    }

    @Override // a6.b0
    public final byte[] b(Object obj) {
        byte[] mo0a = this.f7128e.mo0a(obj);
        G.i.j(mo0a, "null marshaller.toAsciiString()");
        return mo0a;
    }
}
