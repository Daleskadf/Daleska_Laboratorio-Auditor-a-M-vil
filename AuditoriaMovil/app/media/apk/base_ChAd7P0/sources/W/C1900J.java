package w;
/* renamed from: w.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1900J implements U.j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1903M f16076a;

    public void a() {
        C1903M c1903m = this.f16076a;
        synchronized (c1903m.f16079a) {
            try {
                if (c1903m.f16086i == EnumC1901K.OPENED) {
                    c1903m.l(c1903m.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U.j
    public Object i(U.i iVar) {
        boolean z7;
        String str;
        C1903M c1903m = this.f16076a;
        synchronized (c1903m.f16079a) {
            if (c1903m.f16087k == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            g0.c.g("Release completer expected to be null", z7);
            c1903m.f16087k = iVar;
            str = "Release[session=" + c1903m + "]";
        }
        return str;
    }
}
