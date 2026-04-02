package t4;

import a6.C0483l;
import a6.Z;
import a6.b0;
import a6.e0;
import java.util.BitSet;
import l4.C1419c;
import l4.C1421e;
import p.Y0;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: g  reason: collision with root package name */
    public static final Z f15825g;

    /* renamed from: h  reason: collision with root package name */
    public static final Z f15826h;

    /* renamed from: i  reason: collision with root package name */
    public static final Z f15827i;
    public static volatile String j;

    /* renamed from: a  reason: collision with root package name */
    public final u4.e f15828a;

    /* renamed from: b  reason: collision with root package name */
    public final C1421e f15829b;

    /* renamed from: c  reason: collision with root package name */
    public final C1419c f15830c;

    /* renamed from: d  reason: collision with root package name */
    public final Y0 f15831d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15832e;
    public final j f;

    static {
        C0483l c0483l = e0.f7140d;
        BitSet bitSet = b0.f7117d;
        f15825g = new Z("x-goog-api-client", c0483l);
        f15826h = new Z("google-cloud-resource-prefix", c0483l);
        f15827i = new Z("x-goog-request-params", c0483l);
        j = "gl-java/";
    }

    public p(u4.e eVar, C1421e c1421e, C1419c c1419c, q4.f fVar, j jVar, Y0 y02) {
        this.f15828a = eVar;
        this.f = jVar;
        this.f15829b = c1421e;
        this.f15830c = c1419c;
        this.f15831d = y02;
        this.f15832e = "projects/" + fVar.f15352a + "/databases/" + fVar.f15353b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a6.e0, java.lang.Object] */
    public final e0 a() {
        v4.f fVar;
        ?? obj = new Object();
        Z z7 = f15825g;
        String str = j;
        obj.f(z7, str + " fire/25.1.4 grpc/");
        obj.f(f15826h, this.f15832e);
        obj.f(f15827i, this.f15832e);
        j jVar = this.f;
        if (jVar != null && jVar.f15809a.get() != null && jVar.f15810b.get() != null) {
            v4.c cVar = (v4.c) ((v4.g) jVar.f15809a.get());
            synchronized (cVar) {
                long currentTimeMillis = System.currentTimeMillis();
                v4.h hVar = (v4.h) cVar.f16058a.get();
                if (hVar.i(currentTimeMillis)) {
                    hVar.g();
                    fVar = v4.f.GLOBAL;
                } else {
                    fVar = v4.f.NONE;
                }
            }
            int a7 = fVar.a();
            if (a7 != 0) {
                obj.f(j.f15807d, Integer.toString(a7));
            }
            obj.f(j.f15808e, ((A4.b) jVar.f15810b.get()).a());
            U3.k kVar = jVar.f15811c;
            if (kVar != null) {
                String str2 = kVar.f5758b;
                if (str2.length() != 0) {
                    obj.f(j.f, str2);
                }
            }
        }
        return obj;
    }
}
