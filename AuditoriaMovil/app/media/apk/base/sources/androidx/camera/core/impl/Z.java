package androidx.camera.core.impl;

import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class Z implements G {

    /* renamed from: b  reason: collision with root package name */
    public static final K1.d f7594b;

    /* renamed from: c  reason: collision with root package name */
    public static final Z f7595c;

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap f7596a;

    static {
        K1.d dVar = new K1.d(6);
        f7594b = dVar;
        f7595c = new Z(new TreeMap(dVar));
    }

    public Z(TreeMap treeMap) {
        this.f7596a = treeMap;
    }

    public static Z a(G g3) {
        if (Z.class.equals(g3.getClass())) {
            return (Z) g3;
        }
        TreeMap treeMap = new TreeMap(f7594b);
        for (C0501c c0501c : g3.H()) {
            Set<F> U7 = g3.U(c0501c);
            ArrayMap arrayMap = new ArrayMap();
            for (F f : U7) {
                arrayMap.put(f, g3.n(c0501c, f));
            }
            treeMap.put(c0501c, arrayMap);
        }
        return new Z(treeMap);
    }

    @Override // androidx.camera.core.impl.G
    public final Object G(C0501c c0501c) {
        Map map = (Map) this.f7596a.get(c0501c);
        if (map != null) {
            return map.get((F) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public final Set H() {
        return DesugarCollections.unmodifiableSet(this.f7596a.keySet());
    }

    @Override // androidx.camera.core.impl.G
    public final Set U(C0501c c0501c) {
        Map map = (Map) this.f7596a.get(c0501c);
        if (map == null) {
            return Collections.emptySet();
        }
        return DesugarCollections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.G
    public final F e0(C0501c c0501c) {
        Map map = (Map) this.f7596a.get(c0501c);
        if (map != null) {
            return (F) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public final Object f0(C0501c c0501c, Object obj) {
        try {
            return G(c0501c);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // androidx.camera.core.impl.G
    public final boolean h(C0501c c0501c) {
        return this.f7596a.containsKey(c0501c);
    }

    @Override // androidx.camera.core.impl.G
    public final void m(A4.d dVar) {
        for (Map.Entry entry : this.f7596a.tailMap(new C0501c("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (((C0501c) entry.getKey()).f7606a.startsWith("camera2.captureRequest.option.")) {
                C0501c c0501c = (C0501c) entry.getKey();
                G g3 = (G) dVar.f221c;
                ((W) ((C5.i) dVar.f220b).f593b).i(c0501c, g3.e0(c0501c), g3.G(c0501c));
            } else {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.G
    public final Object n(C0501c c0501c, F f) {
        Map map = (Map) this.f7596a.get(c0501c);
        if (map != null) {
            if (map.containsKey(f)) {
                return map.get(f);
            }
            throw new IllegalArgumentException("Option does not exist: " + c0501c + " with priority=" + f);
        }
        throw new IllegalArgumentException("Option does not exist: " + c0501c);
    }
}
