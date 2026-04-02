package p4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.tika.utils.StringUtils;
/* renamed from: p4.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689t implements InterfaceC1672b {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap f15291a = new TreeMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f15292b = new HashMap();

    @Override // p4.InterfaceC1672b
    public final void I(int i7) {
        HashMap hashMap = this.f15292b;
        if (hashMap.containsKey(Integer.valueOf(i7))) {
            hashMap.remove(Integer.valueOf(i7));
            for (q4.h hVar : (Set) hashMap.get(Integer.valueOf(i7))) {
                this.f15291a.remove(hVar);
            }
        }
    }

    @Override // p4.InterfaceC1672b
    public final r4.d L(q4.h hVar) {
        return (r4.d) this.f15291a.get(hVar);
    }

    @Override // p4.InterfaceC1672b
    public final HashMap h(q4.p pVar, int i7) {
        HashMap hashMap = new HashMap();
        int size = pVar.f15351a.size() + 1;
        for (r4.d dVar : this.f15291a.tailMap(new q4.h((q4.p) pVar.a(StringUtils.EMPTY))).values()) {
            q4.h hVar = dVar.f15491b.f15496a;
            if (!pVar.i(hVar.f15357a)) {
                break;
            } else if (hVar.f15357a.f15351a.size() == size && dVar.f15490a > i7) {
                hashMap.put(dVar.f15491b.f15496a, dVar);
            }
        }
        return hashMap;
    }

    @Override // p4.InterfaceC1672b
    public final void i(int i7, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            r4.h hVar = (r4.h) entry.getValue();
            Object[] objArr = {entry.getKey()};
            if (hVar != null) {
                TreeMap treeMap = this.f15291a;
                q4.h hVar2 = hVar.f15496a;
                r4.d dVar = (r4.d) treeMap.get(hVar2);
                HashMap hashMap2 = this.f15292b;
                if (dVar != null) {
                    ((Set) hashMap2.get(Integer.valueOf(dVar.f15490a))).remove(hVar2);
                }
                treeMap.put(hVar2, new r4.d(i7, hVar));
                if (hashMap2.get(Integer.valueOf(i7)) == null) {
                    hashMap2.put(Integer.valueOf(i7), new HashSet());
                }
                ((Set) hashMap2.get(Integer.valueOf(i7))).add(hVar2);
            } else {
                throw new NullPointerException(String.format(Locale.US, "null value for key: %s", objArr));
            }
        }
    }

    @Override // p4.InterfaceC1672b
    public final HashMap t(TreeSet treeSet) {
        HashMap hashMap = new HashMap();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            q4.h hVar = (q4.h) it.next();
            r4.d dVar = (r4.d) this.f15291a.get(hVar);
            if (dVar != null) {
                hashMap.put(hVar, dVar);
            }
        }
        return hashMap;
    }

    @Override // p4.InterfaceC1672b
    public final HashMap v(int i7, int i8, String str) {
        int i9;
        TreeMap treeMap = new TreeMap();
        for (r4.d dVar : this.f15291a.values()) {
            q4.p pVar = dVar.f15491b.f15496a.f15357a;
            if (pVar.g(pVar.f15351a.size() - 2).equals(str) && (i9 = dVar.f15490a) > i7) {
                Map map = (Map) treeMap.get(Integer.valueOf(i9));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(i9), map);
                }
                map.put(dVar.f15491b.f15496a, dVar);
            }
        }
        HashMap hashMap = new HashMap();
        for (Map map2 : treeMap.values()) {
            hashMap.putAll(map2);
            if (hashMap.size() >= i8) {
                break;
            }
        }
        return hashMap;
    }
}
