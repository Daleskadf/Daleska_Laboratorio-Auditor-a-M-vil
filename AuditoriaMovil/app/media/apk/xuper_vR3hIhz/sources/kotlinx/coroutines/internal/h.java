package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f15748a = new h();

    public final Object a(String str, ClassLoader classLoader, Class cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final List b(Class cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return i9.r.G(ServiceLoader.load(cls, classLoader));
        }
    }

    public final List c() {
        q qVar;
        if (!i.a()) {
            return b(q.class, q.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            q qVar2 = null;
            try {
                qVar = (q) q.class.cast(Class.forName("da.a", true, q.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                qVar = null;
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
            try {
                qVar2 = (q) q.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, q.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (qVar2 != null) {
                arrayList.add(qVar2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return b(q.class, q.class.getClassLoader());
        }
    }

    public final List d(Class cls, ClassLoader classLoader) {
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        t9.i.f(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            i9.o.n(arrayList, f15748a.e(url));
        }
        Set<String> J = i9.r.J(arrayList);
        if (!J.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(i9.k.k(J, 10));
            for (String str : J) {
                arrayList2.add(f15748a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    public final List e(URL url) {
        String url2 = url.toString();
        if (ba.s.l(url2, "jar", false, 2, null)) {
            String U = ba.t.U(ba.t.P(url2, "jar:file:", null, 2, null), '!', null, 2, null);
            String P = ba.t.P(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(U, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(P)), "UTF-8"));
                List f10 = f15748a.f(bufferedReader);
                q9.a.a(bufferedReader, null);
                jarFile.close();
                return f10;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        h9.a.a(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List f11 = f15748a.f(bufferedReader2);
            q9.a.a(bufferedReader2, null);
            return f11;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                q9.a.a(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    public final List f(BufferedReader bufferedReader) {
        boolean z10;
        boolean z11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return i9.r.G(linkedHashSet);
            }
            String obj = ba.t.W(ba.t.V(readLine, "#", null, 2, null)).toString();
            boolean z12 = false;
            int i10 = 0;
            while (true) {
                if (i10 < obj.length()) {
                    char charAt = obj.charAt(i10);
                    if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                if (obj.length() > 0) {
                    z12 = true;
                }
                if (z12) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }
}
