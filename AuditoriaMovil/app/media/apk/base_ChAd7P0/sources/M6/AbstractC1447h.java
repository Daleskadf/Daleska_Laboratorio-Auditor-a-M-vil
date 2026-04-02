package m6;

import H4.W;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
/* renamed from: m6.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1447h extends AbstractC1453n {
    public static Object O(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object P(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void Q(Iterable iterable, StringBuilder sb, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, w6.l lVar) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        kotlin.jvm.internal.j.e(separator, "separator");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        kotlin.jvm.internal.j.e(postfix, "postfix");
        kotlin.jvm.internal.j.e(truncated, "truncated");
        sb.append(prefix);
        int i8 = 0;
        for (Object obj : iterable) {
            i8++;
            if (i8 > 1) {
                sb.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            W.a(sb, obj, lVar);
        }
        if (i7 >= 0 && i8 > i7) {
            sb.append(truncated);
        }
        sb.append(postfix);
    }

    public static String R(Iterable iterable, String str, String str2, String str3, w6.l lVar, int i7) {
        String prefix;
        String postfix;
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        if ((i7 & 2) != 0) {
            prefix = StringUtils.EMPTY;
        } else {
            prefix = str2;
        }
        if ((i7 & 4) != 0) {
            postfix = StringUtils.EMPTY;
        } else {
            postfix = str3;
        }
        if ((i7 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.j.e(iterable, "<this>");
        kotlin.jvm.internal.j.e(separator, "separator");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        kotlin.jvm.internal.j.e(postfix, "postfix");
        StringBuilder sb = new StringBuilder();
        Q(iterable, sb, separator, prefix, postfix, -1, "...", lVar);
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static Object S(List list) {
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static ArrayList T(List list, Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List U(int i7, List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        if (i7 >= 0) {
            p pVar = p.f14074a;
            if (i7 == 0) {
                return pVar;
            }
            if (i7 >= list.size()) {
                return Y(list);
            }
            if (i7 == 1) {
                return G.i.A(O(list));
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (Object obj : list) {
                arrayList.add(obj);
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                if (size != 1) {
                    return arrayList;
                }
                return G.i.A(arrayList.get(0));
            }
            return pVar;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Requested element count ", i7, " is less than zero.").toString());
    }

    public static byte[] V(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            bArr[i7] = ((Number) it.next()).byteValue();
            i7++;
        }
        return bArr;
    }

    public static final void W(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static int[] X(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    public static List Y(Iterable iterable) {
        ArrayList arrayList;
        Object next;
        kotlin.jvm.internal.j.e(iterable, "<this>");
        boolean z7 = iterable instanceof Collection;
        p pVar = p.f14074a;
        if (z7) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return a0(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return G.i.A(next);
            }
            return pVar;
        }
        if (z7) {
            arrayList = a0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            W(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return arrayList;
            }
            return G.i.A(arrayList.get(0));
        }
        return pVar;
    }

    public static long[] Z(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            jArr[i7] = ((Number) it.next()).longValue();
            i7++;
        }
        return jArr;
    }

    public static ArrayList a0(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set b0(Collection collection) {
        Object next;
        kotlin.jvm.internal.j.e(collection, "<this>");
        r rVar = r.f14076a;
        int size = collection.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(s.O(collection.size()));
                W(collection, linkedHashSet);
                return linkedHashSet;
            }
            if (collection instanceof List) {
                next = ((List) collection).get(0);
            } else {
                next = collection.iterator().next();
            }
            Set singleton = Collections.singleton(next);
            kotlin.jvm.internal.j.d(singleton, "singleton(...)");
            return singleton;
        }
        return rVar;
    }
}
