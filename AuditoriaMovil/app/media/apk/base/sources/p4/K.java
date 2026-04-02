package p4;

import H0.C0140u;
import p.C1608t;
/* loaded from: classes.dex */
public final class K implements B {

    /* renamed from: a  reason: collision with root package name */
    public final Q f15196a;

    /* renamed from: b  reason: collision with root package name */
    public C0140u f15197b;

    /* renamed from: c  reason: collision with root package name */
    public long f15198c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final C1688s f15199d;

    /* renamed from: e  reason: collision with root package name */
    public C1608t f15200e;

    public K(Q q2, C0140u c0140u) {
        this.f15196a = q2;
        this.f15199d = new C1688s(this, c0140u);
    }

    @Override // p4.B
    public final void D(q4.h hVar) {
        a(hVar);
    }

    @Override // p4.B
    public final void H(q4.h hVar) {
        a(hVar);
    }

    @Override // p4.B
    public final void N(q4.h hVar) {
        a(hVar);
    }

    @Override // p4.B
    public final long S() {
        boolean z7;
        if (this.f15198c != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Attempting to get a sequence number outside of a transaction", z7, new Object[0]);
        return this.f15198c;
    }

    public final void a(q4.h hVar) {
        this.f15196a.Q("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", G.i.x(hVar.f15357a), Long.valueOf(S()));
    }

    @Override // p4.B
    public final void j(q4.h hVar) {
        a(hVar);
    }

    @Override // p4.B
    public final void k(Y y2) {
        this.f15196a.f15215i.j(y2.b(S()));
    }

    @Override // p4.B
    public final void s(C1608t c1608t) {
        this.f15200e = c1608t;
    }

    @Override // p4.B
    public final void w() {
        boolean z7;
        if (this.f15198c != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Committing a transaction without having started one", z7, new Object[0]);
        this.f15198c = -1L;
    }

    @Override // p4.B
    public final void y() {
        boolean z7;
        if (this.f15198c == -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Starting a transaction without committing the previous one", z7, new Object[0]);
        C0140u c0140u = this.f15197b;
        long j = c0140u.f1902a + 1;
        c0140u.f1902a = j;
        this.f15198c = j;
    }
}
