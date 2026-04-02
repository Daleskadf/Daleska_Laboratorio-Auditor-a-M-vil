package S3;

import com.google.firebase.firestore.Z;
import f5.C0993a;
import j6.C1372c;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final j f5243b = new j(new Z(9));

    /* renamed from: c  reason: collision with root package name */
    public static final j f5244c = new j(new t2.i(9));

    /* renamed from: a  reason: collision with root package name */
    public final i f5245a;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, S3.k] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, S3.k] */
    static {
        new j(new Object());
        new j(new Object());
        new j(new e5.b(9));
        new j(new C1372c(9));
        new j(new C0993a(9));
    }

    public j(k kVar) {
        if (J3.d.f2423b.get()) {
            this.f5245a = new A4.c(kVar, 22);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f5245a = new A.m(kVar, 16);
        } else {
            this.f5245a = new A.c(kVar, 14);
        }
    }
}
