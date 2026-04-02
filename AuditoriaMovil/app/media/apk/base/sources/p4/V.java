package p4;

import H4.C0148a1;
import H4.C0151b1;
import H4.d1;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import b3.C0585f;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.N0;
import java.util.Iterator;
import p.C1608t;
/* loaded from: classes.dex */
public final class V implements X {

    /* renamed from: a  reason: collision with root package name */
    public final Q f15230a;

    /* renamed from: b  reason: collision with root package name */
    public final C0585f f15231b;

    /* renamed from: c  reason: collision with root package name */
    public int f15232c;

    /* renamed from: d  reason: collision with root package name */
    public long f15233d;

    /* renamed from: e  reason: collision with root package name */
    public q4.q f15234e = q4.q.f15370b;
    public long f;

    public V(Q q2, C0585f c0585f) {
        this.f15230a = q2;
        this.f15231b = c0585f;
    }

    @Override // p4.X
    public final void a(e4.e eVar, int i7) {
        Q q2 = this.f15230a;
        SQLiteStatement compileStatement = q2.f15219n.compileStatement("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        Iterator it = eVar.iterator();
        while (true) {
            e4.d dVar = (e4.d) it;
            if (((Iterator) dVar.f10875b).hasNext()) {
                q4.h hVar = (q4.h) dVar.next();
                Object[] objArr = {Integer.valueOf(i7), G.i.x(hVar.f15357a)};
                compileStatement.clearBindings();
                Q.N(compileStatement, objArr);
                compileStatement.executeUpdateDelete();
                q2.f15217l.a(hVar);
            } else {
                return;
            }
        }
    }

    @Override // p4.X
    public final e4.e b(int i7) {
        e4.e eVar = q4.h.f15356c;
        P R7 = this.f15230a.R("SELECT path FROM target_documents WHERE target_id = ?");
        R7.a(Integer.valueOf(i7));
        Cursor s7 = R7.s();
        while (s7.moveToNext()) {
            try {
                eVar = eVar.e(new q4.h(G.i.v(s7.getString(0))));
            } catch (Throwable th) {
                if (s7 != null) {
                    try {
                        s7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        s7.close();
        return eVar;
    }

    @Override // p4.X
    public final Y c(n4.L l8) {
        String b5 = l8.b();
        P R7 = this.f15230a.R("SELECT target_proto FROM targets WHERE canonical_id = ?");
        R7.a(b5);
        Cursor s7 = R7.s();
        Y y2 = null;
        while (s7.moveToNext()) {
            try {
                Y k2 = k(s7.getBlob(0));
                if (l8.equals(k2.f15235a)) {
                    y2 = k2;
                }
            } catch (Throwable th) {
                if (s7 != null) {
                    try {
                        s7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        s7.close();
        return y2;
    }

    @Override // p4.X
    public final q4.q d() {
        return this.f15234e;
    }

    @Override // p4.X
    public final void e(int i7) {
        this.f15230a.Q("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i7));
    }

    @Override // p4.X
    public final void f(q4.q qVar) {
        this.f15234e = qVar;
        m();
    }

    @Override // p4.X
    public final void g(e4.e eVar, int i7) {
        Q q2 = this.f15230a;
        SQLiteStatement compileStatement = q2.f15219n.compileStatement("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        Iterator it = eVar.iterator();
        while (true) {
            e4.d dVar = (e4.d) it;
            if (((Iterator) dVar.f10875b).hasNext()) {
                q4.h hVar = (q4.h) dVar.next();
                Object[] objArr = {Integer.valueOf(i7), G.i.x(hVar.f15357a)};
                compileStatement.clearBindings();
                Q.N(compileStatement, objArr);
                compileStatement.executeUpdateDelete();
                q2.f15217l.a(hVar);
            } else {
                return;
            }
        }
    }

    @Override // p4.X
    public final void h(Y y2) {
        l(y2);
        int i7 = this.f15232c;
        int i8 = y2.f15236b;
        if (i8 > i7) {
            this.f15232c = i8;
        }
        long j = this.f15233d;
        long j8 = y2.f15237c;
        if (j8 > j) {
            this.f15233d = j8;
        }
        this.f++;
        m();
    }

    @Override // p4.X
    public final int i() {
        return this.f15232c;
    }

    @Override // p4.X
    public final void j(Y y2) {
        boolean z7;
        l(y2);
        int i7 = this.f15232c;
        int i8 = y2.f15236b;
        boolean z8 = true;
        if (i8 > i7) {
            this.f15232c = i8;
            z7 = true;
        } else {
            z7 = false;
        }
        long j = this.f15233d;
        long j8 = y2.f15237c;
        if (j8 > j) {
            this.f15233d = j8;
        } else {
            z8 = z7;
        }
        if (z8) {
            m();
        }
    }

    public final Y k(byte[] bArr) {
        try {
            return this.f15231b.G(s4.k.M(bArr));
        } catch (com.google.protobuf.X e7) {
            m5.d.g("TargetData failed to parse: %s", e7);
            throw null;
        }
    }

    public final void l(Y y2) {
        n4.L l8 = y2.f15235a;
        String b5 = l8.b();
        q4.q qVar = y2.f15239e;
        U3.p pVar = qVar.f15371a;
        C0585f c0585f = this.f15231b;
        c0585f.getClass();
        EnumC1670A enumC1670A = EnumC1670A.LISTEN;
        EnumC1670A enumC1670A2 = y2.f15238d;
        m5.d.i("Only queries with purpose %s may be stored, got %s", enumC1670A.equals(enumC1670A2), enumC1670A, enumC1670A2);
        s4.i L6 = s4.k.L();
        L6.d();
        int i7 = y2.f15236b;
        s4.k.z((s4.k) L6.f10006b, i7);
        L6.d();
        long j = y2.f15237c;
        s4.k.C((s4.k) L6.f10006b, j);
        C1608t c1608t = (C1608t) c0585f.f8171b;
        N0 Z6 = C1608t.Z(y2.f.f15371a);
        L6.d();
        s4.k.x((s4.k) L6.f10006b, Z6);
        N0 Z7 = C1608t.Z(qVar.f15371a);
        L6.d();
        s4.k.A((s4.k) L6.f10006b, Z7);
        L6.d();
        AbstractC0852m abstractC0852m = y2.f15240g;
        s4.k.B((s4.k) L6.f10006b, abstractC0852m);
        if (l8.f()) {
            C0148a1 z7 = C0151b1.z();
            String Y3 = C1608t.Y((q4.f) c1608t.f14880b, l8.f14306d);
            z7.d();
            C0151b1.v((C0151b1) z7.f10006b, Y3);
            L6.d();
            s4.k.w((s4.k) L6.f10006b, (C0151b1) z7.b());
        } else {
            d1 X7 = c1608t.X(l8);
            L6.d();
            s4.k.v((s4.k) L6.f10006b, X7);
        }
        this.f15230a.Q("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(i7), b5, Long.valueOf(pVar.f5765a), Integer.valueOf(pVar.f5766b), abstractC0852m.v(), Long.valueOf(j), ((s4.k) L6.b()).d());
    }

    public final void m() {
        this.f15230a.Q("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f15232c), Long.valueOf(this.f15233d), Long.valueOf(this.f15234e.f15371a.f5765a), Integer.valueOf(this.f15234e.f15371a.f5766b), Long.valueOf(this.f));
    }
}
