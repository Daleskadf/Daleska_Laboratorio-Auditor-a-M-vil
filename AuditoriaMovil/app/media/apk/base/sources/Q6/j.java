package Q6;

import com.google.firebase.firestore.Z;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final l f4473a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Q6.l] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        f4473a = r02;
        String str = o.f4480b;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.j.d(property, "getProperty(\"java.io.tmpdir\")");
        Z.s(property, false);
        ClassLoader classLoader = R6.e.class.getClassLoader();
        kotlin.jvm.internal.j.d(classLoader, "ResourceFileSystem::class.java.classLoader");
        new R6.e(classLoader);
    }

    public final boolean a(o path) {
        kotlin.jvm.internal.j.e(path, "path");
        if (b(path) != null) {
            return true;
        }
        return false;
    }

    public abstract C.e b(o oVar);
}
