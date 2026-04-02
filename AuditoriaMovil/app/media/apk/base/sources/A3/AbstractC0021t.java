package A3;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import org.apache.tika.fork.ForkServer;
import r3.AbstractC1740d;
/* renamed from: A3.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0021t {
    public static int b(int i7) {
        if (i7 < 3) {
            e(i7, "expectedSize");
            return i7 + 1;
        } else if (i7 < 1073741824) {
            return (int) Math.ceil(i7 / 0.75d);
        } else {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
    }

    public static void c(int i7, Object[] objArr) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (objArr[i8] == null) {
                throw new NullPointerException(io.flutter.plugins.pathprovider.b.e(i8, "at index "));
            }
        }
    }

    public static void d(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public static void e(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }

    public static Object g(int i7) {
        if (i7 >= 2 && i7 <= 1073741824 && Integer.highestOneBit(i7) == i7) {
            if (i7 <= 256) {
                return new byte[i7];
            }
            if (i7 <= 65536) {
                return new short[i7];
            }
            return new int[i7];
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static boolean h(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean i(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static o0 j(Set set, z3.k kVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof o0) {
                o0 o0Var = (o0) sortedSet;
                z3.k kVar2 = o0Var.f182b;
                kVar2.getClass();
                return new o0((SortedSet) o0Var.f181a, new z3.l(Arrays.asList(kVar2, kVar)));
            }
            sortedSet.getClass();
            return new o0(sortedSet, kVar);
        } else if (set instanceof o0) {
            o0 o0Var2 = (o0) set;
            z3.k kVar3 = o0Var2.f182b;
            kVar3.getClass();
            return new o0(o0Var2.f181a, new z3.l(Arrays.asList(kVar3, kVar)));
        } else {
            set.getClass();
            return new o0(set, kVar);
        }
    }

    public static Object k(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int m(Set set) {
        int i7;
        int i8 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i8 = ~(~(i8 + i7));
        }
        return i8;
    }

    public static n0 n(P p7, P p8) {
        G.i.j(p7, "set1");
        G.i.j(p8, "set2");
        return new n0(p7, p8);
    }

    public static int o(int i7, int i8, int i9) {
        return (i7 & (~i9)) | (i8 & i9);
    }

    public static ArrayList p(Object... objArr) {
        int length = objArr.length;
        e(length, "arraySize");
        ArrayList arrayList = new ArrayList(AbstractC1740d.u(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r5 != (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        v(r1, r12, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r13[r5] = o(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int q(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = t(r9)
            r1 = r0 & r11
            int r2 = u(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = F.f.l(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = F.f.l(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            v(r1, r12, r9)
            goto L3b
        L33:
            r10 = r13[r5]
            int r9 = o(r10, r9, r11)
            r13[r5] = r9
        L3b:
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.AbstractC0021t.q(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void r(List list, z3.k kVar, int i7, int i8) {
        for (int size = list.size() - 1; size > i8; size--) {
            if (kVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            list.remove(i9);
        }
    }

    public static int s(int i7) {
        return (int) (Integer.rotateLeft((int) (i7 * (-862048943)), 15) * 461845907);
    }

    public static int t(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return s(hashCode);
    }

    public static int u(int i7, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i7] & ForkServer.ERROR;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i7] & 65535;
        }
        return ((int[]) obj)[i7];
    }

    public static void v(int i7, Object obj, int i8) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i8;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i8;
        } else {
            ((int[]) obj)[i7] = i8;
        }
    }

    public static AbstractList w(List list, z3.i iVar) {
        if (list instanceof RandomAccess) {
            return new V(list, iVar);
        }
        return new W(list, iVar);
    }

    public A4.c a() {
        e(2, "expectedValuesPerKey");
        return new A4.c(this, 3);
    }

    public abstract Map f();
}
