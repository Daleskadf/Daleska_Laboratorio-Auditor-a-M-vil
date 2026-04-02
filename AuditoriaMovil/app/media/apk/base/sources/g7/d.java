package g7;

import c6.Q;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.firestore.Z;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.f;
import org.slf4j.helpers.g;
import org.slf4j.helpers.h;
import org.slf4j.helpers.i;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f11141a;

    /* renamed from: b  reason: collision with root package name */
    public static final org.slf4j.helpers.c f11142b = new org.slf4j.helpers.c(1);

    /* renamed from: c  reason: collision with root package name */
    public static final org.slf4j.helpers.c f11143c = new org.slf4j.helpers.c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f11144d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile org.slf4j.helpers.c f11145e;
    public static final String[] f;

    static {
        String str;
        boolean equalsIgnoreCase;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = str.equalsIgnoreCase("true");
        }
        f11144d = equalsIgnoreCase;
        f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ServiceLoader serviceLoader;
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        org.slf4j.helpers.c cVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                if (f.c(org.slf4j.helpers.d.INFO)) {
                    f.b().println("SLF4J(I): " + str);
                }
                cVar = (org.slf4j.helpers.c) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e7) {
                f.a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e7);
            } catch (ClassNotFoundException e8) {
                e = e8;
                f.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e9) {
                e = e9;
                f.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e10) {
                e = e10;
                f.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e11) {
                e = e11;
                f.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e12) {
                e = e12;
                f.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (cVar != null) {
            arrayList.add(cVar);
            return arrayList;
        }
        if (System.getSecurityManager() == null) {
            serviceLoader = ServiceLoader.load(org.slf4j.helpers.c.class, classLoader);
        } else {
            serviceLoader = (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: g7.c
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    return ServiceLoader.load(org.slf4j.helpers.c.class, classLoader);
                }
            });
        }
        Iterator it = serviceLoader.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((org.slf4j.helpers.c) it.next());
            } catch (ServiceConfigurationError e13) {
                PrintStream b5 = f.b();
                b5.println("SLF4J(E): " + ("A service provider failed to instantiate:\n" + e13.getMessage()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.SecurityManager] */
    public static b b(Class cls) {
        int i7;
        h hVar;
        b c8 = c(cls.getName());
        if (f11144d) {
            h hVar2 = i.f14635a;
            Class cls2 = null;
            h hVar3 = hVar2;
            if (hVar2 == null) {
                if (i.f14636b) {
                    hVar3 = null;
                } else {
                    try {
                        hVar = new SecurityManager();
                    } catch (SecurityException unused) {
                        hVar = null;
                    }
                    i.f14635a = hVar;
                    i.f14636b = true;
                    hVar3 = hVar;
                }
            }
            if (hVar3 != null) {
                Class[] classContext = hVar3.getClassContext();
                String name = i.class.getName();
                int i8 = 0;
                while (i8 < classContext.length && !name.equals(classContext[i8].getName())) {
                    i8++;
                }
                if (i8 < classContext.length && (i7 = i8 + 2) < classContext.length) {
                    cls2 = classContext[i7];
                } else {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                f.d("Detected logger name mismatch. Given name: \"" + c8.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                f.d("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return c8;
    }

    public static b c(String str) {
        org.slf4j.helpers.c cVar;
        a aVar;
        if (f11141a == 0) {
            synchronized (d.class) {
                try {
                    if (f11141a == 0) {
                        f11141a = 1;
                        d();
                    }
                } finally {
                }
            }
        }
        int i7 = f11141a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        cVar = f11143c;
                    } else {
                        throw new IllegalStateException("Unreachable code");
                    }
                } else {
                    cVar = f11145e;
                }
            } else {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
        } else {
            cVar = f11142b;
        }
        switch (cVar.f14625a) {
            case 0:
                aVar = (Z) cVar.f14626b;
                break;
            default:
                aVar = (Q) cVar.f14626b;
                break;
        }
        return aVar.a(str);
    }

    public static final void d() {
        Enumeration<URL> resources;
        try {
            ArrayList a7 = a();
            h(a7);
            if (!a7.isEmpty()) {
                f11145e = (org.slf4j.helpers.c) a7.get(0);
                f11145e.getClass();
                f11145e.getClass();
                f11141a = 3;
                f(a7);
            } else {
                f11141a = 4;
                f.d("No SLF4J providers were found.");
                f.d("Defaulting to no-operation (NOP) logger implementation");
                f.d("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = d.class.getClassLoader();
                    if (classLoader == null) {
                        resources = ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
                    } else {
                        resources = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    }
                    while (resources.hasMoreElements()) {
                        linkedHashSet.add(resources.nextElement());
                    }
                } catch (IOException e7) {
                    f.a("Error getting resources from path", e7);
                }
                g(linkedHashSet);
            }
            e();
            if (f11141a == 3) {
                try {
                    switch (f11145e.f14625a) {
                        case 0:
                            boolean z7 = false;
                            for (String str : f) {
                                if ("2.0.99".startsWith(str)) {
                                    z7 = true;
                                }
                            }
                            if (!z7) {
                                f.d("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f).toString());
                                f.d("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                                return;
                            }
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    f.a("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e8) {
            f11141a = 2;
            f.a("Failed to instantiate SLF4J LoggerFactory", e8);
            throw new IllegalStateException("Unexpected initialization failure", e8);
        }
    }

    public static void e() {
        org.slf4j.helpers.c cVar = f11142b;
        synchronized (cVar) {
            try {
                ((Q) cVar.f14626b).f8564a = true;
                Q q2 = (Q) cVar.f14626b;
                q2.getClass();
                Iterator it = new ArrayList(((ConcurrentHashMap) q2.f8565b).values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    gVar.f14631b = c(gVar.f14630a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) ((Q) f11142b.f14626b).f8566c;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList((int) RecognitionOptions.ITF);
        int i7 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, RecognitionOptions.ITF) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                h7.c cVar2 = (h7.c) it2.next();
                if (cVar2 != null) {
                    g gVar2 = cVar2.f11349b;
                    String str = gVar2.f14630a;
                    if (gVar2.f14631b != null) {
                        if (!(gVar2.f14631b instanceof org.slf4j.helpers.b)) {
                            if (gVar2.B()) {
                                if (gVar2.s(cVar2.f11348a) && gVar2.B()) {
                                    try {
                                        gVar2.f14633d.invoke(gVar2.f14631b, cVar2);
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                                    }
                                }
                            } else {
                                f.d(str);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                }
                int i8 = i7 + 1;
                if (i7 == 0) {
                    if (cVar2.f11349b.B()) {
                        f.d("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        f.d("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        f.d("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(cVar2.f11349b.f14631b instanceof org.slf4j.helpers.b)) {
                        f.d("The following set of substitute loggers may have been accessed");
                        f.d("during the initialization phase. Logging calls during this");
                        f.d("phase were not honored. However, subsequent logging calls to these");
                        f.d("loggers will work as normally expected.");
                        f.d("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i7 = i8;
            }
            arrayList.clear();
        }
        Q q7 = (Q) f11142b.f14626b;
        ((ConcurrentHashMap) q7.f8565b).clear();
        ((LinkedBlockingQueue) q7.f8566c).clear();
    }

    public static void f(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                String str = "Actual provider is of type [" + arrayList.get(0) + "]";
                if (f.c(org.slf4j.helpers.d.INFO)) {
                    f.b().println("SLF4J(I): " + str);
                    return;
                }
                return;
            }
            String str2 = "Connected with provider of type [" + ((org.slf4j.helpers.c) arrayList.get(0)).getClass().getName() + "]";
            if (f.c(org.slf4j.helpers.d.DEBUG)) {
                f.b().println("SLF4J(D): " + str2);
                return;
            }
            return;
        }
        throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
    }

    public static void g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        f.d("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            f.d("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        f.d("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void h(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            f.d("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.d("Found provider [" + ((org.slf4j.helpers.c) it.next()) + "]");
            }
            f.d("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
