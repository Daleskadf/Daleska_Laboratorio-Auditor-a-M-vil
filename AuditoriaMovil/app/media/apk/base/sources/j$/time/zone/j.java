package j$.time.zone;

import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList f12832a;

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f12833b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Set f12834c;

    protected abstract f c(String str);

    protected abstract Set d();

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f12832a = copyOnWriteArrayList;
        f12833b = new ConcurrentHashMap(RecognitionOptions.UPC_A, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static Set a() {
        return f12834c;
    }

    public static f b(String str, boolean z7) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f12833b;
        j jVar = (j) concurrentHashMap.get(str);
        if (jVar != null) {
            return jVar.c(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new RuntimeException("No time-zone data files registered");
        }
        throw new RuntimeException("Unknown time-zone ID: " + str);
    }

    public static void e(j jVar) {
        Objects.requireNonNull(jVar, "provider");
        synchronized (j.class) {
            try {
                for (String str : jVar.d()) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((j) f12833b.putIfAbsent(str, jVar)) != null) {
                        throw new RuntimeException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + jVar);
                    }
                }
                f12834c = Collections.unmodifiableSet(new HashSet(f12833b.keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        f12832a.add(jVar);
    }
}
