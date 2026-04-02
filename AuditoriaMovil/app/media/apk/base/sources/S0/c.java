package S0;

import H0.C0143x;
import H0.Q;
import K0.x;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public final class c implements Z0.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f4847a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4848b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4849c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4850d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4851e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4852g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4853h;

    /* renamed from: i  reason: collision with root package name */
    public final t f4854i;
    public final C0143x j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f4855k;

    /* renamed from: l  reason: collision with root package name */
    public final i f4856l;

    /* renamed from: m  reason: collision with root package name */
    public final List f4857m;

    public c(long j, long j8, long j9, boolean z7, long j10, long j11, long j12, long j13, i iVar, t tVar, C0143x c0143x, Uri uri, ArrayList arrayList) {
        this.f4847a = j;
        this.f4848b = j8;
        this.f4849c = j9;
        this.f4850d = z7;
        this.f4851e = j10;
        this.f = j11;
        this.f4852g = j12;
        this.f4853h = j13;
        this.f4856l = iVar;
        this.f4854i = tVar;
        this.f4855k = uri;
        this.j = c0143x;
        this.f4857m = arrayList;
    }

    @Override // Z0.a
    public final Object a(List list) {
        long j;
        ArrayList arrayList;
        long j8;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new Q());
        ArrayList arrayList3 = new ArrayList();
        long j9 = 0;
        int i7 = 0;
        while (i7 < this.f4857m.size()) {
            if (((Q) linkedList.peek()).f1713a != i7) {
                long c8 = c(i7);
                if (c8 != -9223372036854775807L) {
                    j9 += c8;
                }
                arrayList2 = arrayList3;
            } else {
                h b5 = b(i7);
                List list2 = b5.f4880c;
                Q q2 = (Q) linkedList.poll();
                int i8 = q2.f1713a;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i9 = q2.f1714b;
                    a aVar = (a) list2.get(i9);
                    List list3 = aVar.f4840c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((m) list3.get(q2.f1715c));
                        q2 = (Q) linkedList.poll();
                        if (q2.f1713a != i8) {
                            break;
                        }
                    } while (q2.f1714b == i9);
                    arrayList = arrayList3;
                    j8 = j9;
                    arrayList4.add(new a(aVar.f4838a, aVar.f4839b, arrayList5, aVar.f4841d, aVar.f4842e, aVar.f));
                    if (q2.f1713a != i8) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j9 = j8;
                }
                linkedList.addFirst(q2);
                arrayList2 = arrayList;
                arrayList2.add(new h(b5.f4878a, b5.f4879b - j8, arrayList4, b5.f4881d));
                j9 = j8;
            }
            i7++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList6 = arrayList3;
        long j10 = j9;
        long j11 = this.f4848b;
        if (j11 != -9223372036854775807L) {
            j = j11 - j10;
        } else {
            j = -9223372036854775807L;
        }
        return new c(this.f4847a, j, this.f4849c, this.f4850d, this.f4851e, this.f, this.f4852g, this.f4853h, this.f4856l, this.f4854i, this.j, this.f4855k, arrayList6);
    }

    public final h b(int i7) {
        return (h) this.f4857m.get(i7);
    }

    public final long c(int i7) {
        long j;
        long j8;
        List list = this.f4857m;
        if (i7 == list.size() - 1) {
            j = this.f4848b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j8 = ((h) list.get(i7)).f4879b;
        } else {
            j = ((h) list.get(i7 + 1)).f4879b;
            j8 = ((h) list.get(i7)).f4879b;
        }
        return j - j8;
    }

    public final long d(int i7) {
        return x.M(c(i7));
    }
}
