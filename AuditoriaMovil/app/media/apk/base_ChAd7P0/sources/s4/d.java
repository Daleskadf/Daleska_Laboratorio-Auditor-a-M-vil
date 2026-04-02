package S4;

import S.j;
import io.flutter.plugins.googlemaps.C1186t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public final class d extends B0.b {

    /* renamed from: b  reason: collision with root package name */
    public final b f5269b;

    /* renamed from: c  reason: collision with root package name */
    public final j f5270c;

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantReadWriteLock f5271d;

    /* renamed from: e  reason: collision with root package name */
    public final ExecutorService f5272e;

    public d(b bVar) {
        super(3);
        this.f5270c = new j(5);
        this.f5271d = new ReentrantReadWriteLock();
        this.f5272e = Executors.newCachedThreadPool();
        this.f5269b = bVar;
    }

    public final Set A(int i7) {
        HashSet hashSet;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f5271d;
        reentrantReadWriteLock.readLock().lock();
        j jVar = this.f5270c;
        Set set = (Set) jVar.get(Integer.valueOf(i7));
        reentrantReadWriteLock.readLock().unlock();
        if (set == null) {
            reentrantReadWriteLock.writeLock().lock();
            set = (Set) jVar.get(Integer.valueOf(i7));
            if (set == null) {
                b bVar = this.f5269b;
                double d7 = 2.0d;
                double pow = (bVar.f5263b / Math.pow(2.0d, i7)) / 256.0d;
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                synchronized (bVar.f5265d) {
                    try {
                        Iterator it = bVar.f5264c.iterator();
                        while (it.hasNext()) {
                            a aVar = (a) it.next();
                            if (!hashSet2.contains(aVar)) {
                                X4.a aVar2 = aVar.f5260b;
                                double d8 = pow / d7;
                                double d9 = pow;
                                double d10 = aVar2.f6398a;
                                double d11 = d10 - d8;
                                double d12 = d10 + d8;
                                double d13 = aVar2.f6399b;
                                V4.a aVar3 = new V4.a(d11, d12, d13 - d8, d13 + d8);
                                Y4.b bVar2 = bVar.f5265d;
                                bVar2.getClass();
                                ArrayList arrayList = new ArrayList();
                                bVar2.c(aVar3, arrayList);
                                if (arrayList.size() == 1) {
                                    hashSet3.add(aVar);
                                    hashSet2.add(aVar);
                                    hashMap.put(aVar, Double.valueOf(0.0d));
                                } else {
                                    f fVar = new f(aVar.f5259a.f12275a.f15629a);
                                    hashSet3.add(fVar);
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        a aVar4 = (a) it2.next();
                                        Double d14 = (Double) hashMap.get(aVar4);
                                        b bVar3 = bVar;
                                        X4.a aVar5 = aVar4.f5260b;
                                        X4.a aVar6 = aVar.f5260b;
                                        Iterator it3 = it;
                                        a aVar7 = aVar;
                                        Iterator it4 = it2;
                                        HashSet hashSet4 = hashSet3;
                                        double d15 = aVar5.f6398a - aVar6.f6398a;
                                        double d16 = aVar5.f6399b - aVar6.f6399b;
                                        double d17 = (d16 * d16) + (d15 * d15);
                                        if (d14 != null) {
                                            if (d14.doubleValue() < d17) {
                                                bVar = bVar3;
                                                it = it3;
                                                aVar = aVar7;
                                                hashSet3 = hashSet4;
                                                it2 = it4;
                                            } else {
                                                ((f) hashMap2.get(aVar4)).f5275b.remove(aVar4.f5259a);
                                            }
                                        }
                                        hashMap.put(aVar4, Double.valueOf(d17));
                                        fVar.f5275b.add(aVar4.f5259a);
                                        hashMap2.put(aVar4, fVar);
                                        bVar = bVar3;
                                        it = it3;
                                        aVar = aVar7;
                                        hashSet3 = hashSet4;
                                        it2 = it4;
                                    }
                                    hashSet2.addAll(arrayList);
                                    bVar = bVar;
                                    it = it;
                                    hashSet3 = hashSet3;
                                }
                                pow = d9;
                                d7 = 2.0d;
                            }
                        }
                        hashSet = hashSet3;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                set = hashSet;
                jVar.put(Integer.valueOf(i7), set);
            }
            reentrantReadWriteLock.writeLock().unlock();
        }
        return set;
    }

    public final boolean C(C1186t c1186t) {
        boolean remove;
        b bVar = this.f5269b;
        bVar.getClass();
        a aVar = new a(c1186t);
        synchronized (bVar.f5265d) {
            try {
                remove = bVar.f5264c.remove(aVar);
                if (remove) {
                    Y4.b bVar2 = bVar.f5265d;
                    bVar2.getClass();
                    X4.a aVar2 = aVar.f5260b;
                    if (bVar2.f6703a.a(aVar2.f6398a, aVar2.f6399b)) {
                        bVar2.b(aVar2.f6398a, aVar2.f6399b, aVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove) {
            this.f5270c.evictAll();
        }
        return remove;
    }

    public final boolean x(C1186t c1186t) {
        boolean add;
        b bVar = this.f5269b;
        bVar.getClass();
        a aVar = new a(c1186t);
        synchronized (bVar.f5265d) {
            try {
                add = bVar.f5264c.add(aVar);
                if (add) {
                    Y4.b bVar2 = bVar.f5265d;
                    bVar2.getClass();
                    X4.a b5 = aVar.b();
                    if (bVar2.f6703a.a(b5.f6398a, b5.f6399b)) {
                        bVar2.a(b5.f6398a, b5.f6399b, aVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (add) {
            this.f5270c.evictAll();
        }
        return add;
    }

    public final Set y(float f) {
        int i7 = (int) f;
        Set A7 = A(i7);
        j jVar = this.f5270c;
        int i8 = i7 + 1;
        Object obj = jVar.get(Integer.valueOf(i8));
        ExecutorService executorService = this.f5272e;
        if (obj == null) {
            executorService.execute(new c(this, i8, 0));
        }
        int i9 = i7 - 1;
        if (jVar.get(Integer.valueOf(i9)) == null) {
            executorService.execute(new c(this, i9, 0));
        }
        return A7;
    }
}
