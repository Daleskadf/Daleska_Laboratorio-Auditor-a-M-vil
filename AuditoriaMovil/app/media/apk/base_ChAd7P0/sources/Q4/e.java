package q4;

import java.util.ArrayList;
import java.util.List;
import u4.u;
/* loaded from: classes.dex */
public abstract class e implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final List f15351a;

    public e(List list) {
        this.f15351a = list;
    }

    public final e a(String str) {
        ArrayList arrayList = new ArrayList(this.f15351a);
        arrayList.add(str);
        return e(arrayList);
    }

    public final e b(e eVar) {
        ArrayList arrayList = new ArrayList(this.f15351a);
        arrayList.addAll(eVar.f15351a);
        return e(arrayList);
    }

    public abstract String c();

    @Override // java.lang.Comparable
    /* renamed from: d */
    public final int compareTo(e eVar) {
        boolean z7;
        boolean z8;
        int size = this.f15351a.size();
        int size2 = eVar.f15351a.size();
        for (int i7 = 0; i7 < size && i7 < size2; i7++) {
            String g3 = g(i7);
            String g4 = eVar.g(i7);
            int i8 = 1;
            if (g3.startsWith("__id") && g3.endsWith("__")) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (g4.startsWith("__id") && g4.endsWith("__")) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z7 && !z8) {
                i8 = -1;
            } else if (z7 || !z8) {
                if (z7 && z8) {
                    i8 = Long.compare(Long.parseLong(g3.substring(4, g3.length() - 2)), Long.parseLong(g4.substring(4, g4.length() - 2)));
                } else {
                    i8 = u.f(g3, g4);
                }
            }
            if (i8 != 0) {
                return i8;
            }
        }
        return u.d(size, size2);
    }

    public abstract e e(List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && compareTo((e) obj) == 0) {
            return true;
        }
        return false;
    }

    public final String f() {
        List list = this.f15351a;
        return (String) list.get(list.size() - 1);
    }

    public final String g(int i7) {
        return (String) this.f15351a.get(i7);
    }

    public final boolean h() {
        if (this.f15351a.size() == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15351a.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    public final boolean i(e eVar) {
        List list = this.f15351a;
        if (list.size() > eVar.f15351a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!g(i7).equals(eVar.g(i7))) {
                return false;
            }
        }
        return true;
    }

    public final e j() {
        boolean z7;
        List list = this.f15351a;
        int size = list.size();
        if (size >= 5) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Can't call popFirst with count > length() (%d > %d)", z7, 5, Integer.valueOf(size));
        return new e(list.subList(5, size));
    }

    public final e k() {
        List list = this.f15351a;
        return e(list.subList(0, list.size() - 1));
    }

    public final String toString() {
        return c();
    }
}
