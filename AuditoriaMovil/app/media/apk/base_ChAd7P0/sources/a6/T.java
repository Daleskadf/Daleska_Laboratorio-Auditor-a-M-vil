package a6;

import c6.C1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class T {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f7104c;

    /* renamed from: d  reason: collision with root package name */
    public static T f7105d;

    /* renamed from: e  reason: collision with root package name */
    public static final List f7106e;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f7107a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f7108b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(T.class.getName());
        f7104c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z7 = C1.f8433a;
            arrayList.add(C1.class);
        } catch (ClassNotFoundException e7) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e7);
        }
        try {
            arrayList.add(i6.x.class);
        } catch (ClassNotFoundException e8) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e8);
        }
        f7106e = DesugarCollections.unmodifiableList(arrayList);
    }

    public static synchronized T b() {
        T t7;
        synchronized (T.class) {
            try {
                if (f7105d == null) {
                    List<S> k2 = AbstractC0478g.k(S.class, f7106e, S.class.getClassLoader(), new C0483l(6));
                    f7105d = new T();
                    for (S s7 : k2) {
                        Logger logger = f7104c;
                        logger.fine("Service loader found " + s7);
                        f7105d.a(s7);
                    }
                    f7105d.d();
                }
                t7 = f7105d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t7;
    }

    public final synchronized void a(S s7) {
        G.i.f("isAvailable() returned false", s7.c());
        this.f7107a.add(s7);
    }

    public final synchronized S c(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f7108b;
        G.i.j(str, "policy");
        return (S) linkedHashMap.get(str);
    }

    public final synchronized void d() {
        try {
            this.f7108b.clear();
            Iterator it = this.f7107a.iterator();
            while (it.hasNext()) {
                S s7 = (S) it.next();
                String a7 = s7.a();
                S s8 = (S) this.f7108b.get(a7);
                if (s8 != null && s8.b() >= s7.b()) {
                }
                this.f7108b.put(a7, s7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
