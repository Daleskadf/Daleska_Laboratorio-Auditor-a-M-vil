package S;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class j {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final T.b lock;
    private final T.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    /* JADX WARN: Type inference failed for: r2v3, types: [T.b, java.lang.Object] */
    public j(int i7) {
        this.maxSize = i7;
        if (i7 > 0) {
            this.map = new T.c();
            this.lock = new Object();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public Object create(Object key) {
        kotlin.jvm.internal.j.e(key, "key");
        return null;
    }

    public final int createCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.createCount;
        }
        return i7;
    }

    public void entryRemoved(boolean z7, Object key, Object oldValue, Object obj) {
        kotlin.jvm.internal.j.e(key, "key");
        kotlin.jvm.internal.j.e(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.evictionCount;
        }
        return i7;
    }

    public final Object get(Object key) {
        Object put;
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.lock) {
            T.c cVar = this.map;
            cVar.getClass();
            Object obj = cVar.f5284a.get(key);
            if (obj != null) {
                this.hitCount++;
                return obj;
            }
            this.missCount++;
            Object create = create(key);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    T.c cVar2 = this.map;
                    cVar2.getClass();
                    put = cVar2.f5284a.put(key, create);
                    if (put != null) {
                        T.c cVar3 = this.map;
                        cVar3.getClass();
                        cVar3.f5284a.put(key, put);
                    } else {
                        this.size += a(key, create);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                entryRemoved(false, key, create, put);
                return put;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.hitCount;
        }
        return i7;
    }

    public final int maxSize() {
        int i7;
        synchronized (this.lock) {
            i7 = this.maxSize;
        }
        return i7;
    }

    public final int missCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.missCount;
        }
        return i7;
    }

    public final Object put(Object key, Object value) {
        Object put;
        kotlin.jvm.internal.j.e(key, "key");
        kotlin.jvm.internal.j.e(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(key, value);
            T.c cVar = this.map;
            cVar.getClass();
            put = cVar.f5284a.put(key, value);
            if (put != null) {
                this.size -= a(key, put);
            }
        }
        if (put != null) {
            entryRemoved(false, key, put, value);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.putCount;
        }
        return i7;
    }

    public final Object remove(Object key) {
        Object remove;
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.lock) {
            T.c cVar = this.map;
            cVar.getClass();
            remove = cVar.f5284a.remove(key);
            if (remove != null) {
                this.size -= a(key, remove);
            }
        }
        if (remove != null) {
            entryRemoved(false, key, remove, null);
        }
        return remove;
    }

    public void resize(int i7) {
        if (i7 > 0) {
            synchronized (this.lock) {
                this.maxSize = i7;
            }
            trimToSize(i7);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final int size() {
        int i7;
        synchronized (this.lock) {
            i7 = this.size;
        }
        return i7;
    }

    public int sizeOf(Object key, Object value) {
        kotlin.jvm.internal.j.e(key, "key");
        kotlin.jvm.internal.j.e(value, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Set<Map.Entry> entrySet = this.map.f5284a.entrySet();
            kotlin.jvm.internal.j.d(entrySet, "map.entries");
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        int i7;
        String str;
        synchronized (this.lock) {
            try {
                int i8 = this.hitCount;
                int i9 = this.missCount + i8;
                if (i9 != 0) {
                    i7 = (i8 * 100) / i9;
                } else {
                    i7 = 0;
                }
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i7 + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:13:0x0019, B:15:0x001d, B:18:0x0028, B:20:0x003a, B:28:0x0059, B:32:0x005f, B:23:0x0044, B:24:0x004a, B:27:0x0055, B:37:0x008d, B:38:0x0094), top: B:41:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            T.b r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L8d
            T.c r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f5284a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L19
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L8d
            goto L19
        L16:
            r7 = move-exception
            goto L95
        L19:
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 <= r7) goto L8b
            T.c r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f5284a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L28
            goto L8b
        L28:
            T.c r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f5284a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "map.entries"
            kotlin.jvm.internal.j.d(r1, r2)     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L16
            r3 = 0
            if (r2 == 0) goto L4a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L44
        L42:
            r1 = r3
            goto L59
        L44:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L16
            goto L59
        L4a:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L55
            goto L42
        L55:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L16
        L59:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L5f
            monitor-exit(r0)
            return
        L5f:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            T.c r4 = r6.map     // Catch: java.lang.Throwable -> L16
            r4.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = "key"
            kotlin.jvm.internal.j.e(r2, r5)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r4 = r4.f5284a     // Catch: java.lang.Throwable -> L16
            r4.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r4 = r6.size     // Catch: java.lang.Throwable -> L16
            int r5 = r6.a(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L16
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L16
            r5 = 1
            int r4 = r4 + r5
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r6.entryRemoved(r5, r2, r1, r3)
            goto L0
        L8b:
            monitor-exit(r0)
            return
        L8d:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L95:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: S.j.trimToSize(int):void");
    }
}
