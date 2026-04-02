package h1;

import H4.t1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import b3.C0585f;
import b4.C0597e;
import c1.RunnableC0626c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.I;
import com.google.firebase.firestore.J;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.C0850l;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import h0.AbstractC1059s;
import h0.AbstractC1066z;
import i.AbstractC1091a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p.C1597n;
import p.C1608t;
import p.O;
import p4.InterfaceC1677g;
import p4.InterfaceC1693x;
import p4.L;
import p4.P;
import p4.Q;
/* loaded from: classes.dex */
public final class t implements InterfaceC1693x {

    /* renamed from: a  reason: collision with root package name */
    public int f11317a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Object f11318b;

    /* renamed from: c  reason: collision with root package name */
    public Object f11319c;

    /* renamed from: d  reason: collision with root package name */
    public Object f11320d;

    /* renamed from: e  reason: collision with root package name */
    public Object f11321e;
    public Object f;

    public t(View view) {
        C1597n c1597n;
        this.f11318b = view;
        PorterDuff.Mode mode = C1597n.f14852b;
        synchronized (C1597n.class) {
            try {
                if (C1597n.f14853c == null) {
                    C1597n.b();
                }
                c1597n = C1597n.f14853c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11319c = c1597n;
    }

    @Override // p4.InterfaceC1693x
    public r4.i a(U3.p pVar, ArrayList arrayList, List list) {
        int i7 = this.f11317a;
        this.f11317a = i7 + 1;
        r4.i iVar = new r4.i(i7, pVar, arrayList, list);
        C0585f c0585f = (C0585f) this.f11319c;
        c0585f.getClass();
        s4.p F7 = s4.q.F();
        F7.d();
        s4.q.v((s4.q) F7.f10006b, iVar.f15499a);
        C1608t c1608t = (C1608t) c0585f.f8171b;
        N0 Z6 = C1608t.Z(iVar.f15500b);
        F7.d();
        s4.q.y((s4.q) F7.f10006b, Z6);
        Iterator it = iVar.f15501c.iterator();
        while (it.hasNext()) {
            t1 W7 = c1608t.W((r4.h) it.next());
            F7.d();
            s4.q.w((s4.q) F7.f10006b, W7);
        }
        for (r4.h hVar : iVar.f15502d) {
            t1 W8 = c1608t.W(hVar);
            F7.d();
            s4.q.x((s4.q) F7.f10006b, W8);
        }
        Integer valueOf = Integer.valueOf(i7);
        byte[] d7 = ((s4.q) F7.b()).d();
        String str = (String) this.f11321e;
        Object[] objArr = {str, valueOf, d7};
        Q q2 = (Q) this.f11318b;
        q2.Q("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", objArr);
        HashSet hashSet = new HashSet();
        SQLiteStatement compileStatement = q2.f15219n.compileStatement("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            q4.h hVar2 = ((r4.h) it2.next()).f15496a;
            if (hashSet.add(hVar2)) {
                compileStatement.clearBindings();
                Q.N(compileStatement, new Object[]{str, G.i.x(hVar2.f15357a), Integer.valueOf(i7)});
                compileStatement.executeUpdateDelete();
                ((InterfaceC1677g) this.f11320d).o(hVar2.d());
            }
        }
        return iVar;
    }

    @Override // p4.InterfaceC1693x
    public void b() {
        Q q2 = (Q) this.f11318b;
        P R7 = q2.R("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1");
        String str = (String) this.f11321e;
        R7.a(str);
        Cursor s7 = R7.s();
        try {
            boolean moveToFirst = s7.moveToFirst();
            s7.close();
            if (moveToFirst) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            P R8 = q2.R("SELECT path FROM document_mutations WHERE uid = ?");
            R8.a(str);
            s7 = R8.s();
            while (s7.moveToNext()) {
                try {
                    arrayList.add(G.i.v(s7.getString(0)));
                } finally {
                }
            }
            s7.close();
            m5.d.i("Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList.isEmpty(), arrayList);
        } finally {
        }
    }

    @Override // p4.InterfaceC1693x
    public void c(r4.i iVar, AbstractC0852m abstractC0852m) {
        abstractC0852m.getClass();
        this.f = abstractC0852m;
        u();
    }

    @Override // p4.InterfaceC1693x
    public r4.i d(int i7) {
        P R7 = ((Q) this.f11318b).R("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1");
        R7.a(1000000, (String) this.f11321e, Integer.valueOf(i7 + 1));
        Cursor s7 = R7.s();
        try {
            if (s7.moveToFirst()) {
                r4.i m7 = m(s7.getBlob(1), s7.getInt(0));
                s7.close();
                return m7;
            }
            s7.close();
            return null;
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

    @Override // p4.InterfaceC1693x
    public int e() {
        Integer num;
        P R7 = ((Q) this.f11318b).R("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?");
        R7.a(-1, (String) this.f11321e);
        Cursor s7 = R7.s();
        try {
            if (s7.moveToFirst()) {
                num = Integer.valueOf(s7.getInt(0));
                s7.close();
            } else {
                s7.close();
                num = null;
            }
            return num.intValue();
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

    @Override // p4.InterfaceC1693x
    public r4.i f(int i7) {
        P R7 = ((Q) this.f11318b).R("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
        R7.a(1000000, (String) this.f11321e, Integer.valueOf(i7));
        Cursor s7 = R7.s();
        try {
            if (s7.moveToFirst()) {
                r4.i m7 = m(s7.getBlob(0), i7);
                s7.close();
                return m7;
            }
            s7.close();
            return null;
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

    @Override // p4.InterfaceC1693x
    public AbstractC0852m g() {
        return (AbstractC0852m) this.f;
    }

    @Override // p4.InterfaceC1693x
    public void h(AbstractC0852m abstractC0852m) {
        abstractC0852m.getClass();
        this.f = abstractC0852m;
        u();
    }

    @Override // p4.InterfaceC1693x
    public void i(r4.i iVar) {
        boolean z7;
        Q q2 = (Q) this.f11318b;
        SQLiteStatement compileStatement = q2.f15219n.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement compileStatement2 = q2.f15219n.compileStatement("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int i7 = iVar.f15499a;
        Integer valueOf = Integer.valueOf(i7);
        String str = (String) this.f11321e;
        compileStatement.clearBindings();
        Q.N(compileStatement, new Object[]{str, valueOf});
        if (compileStatement.executeUpdateDelete() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Mutation batch (%s, %d) did not exist", z7, str, Integer.valueOf(iVar.f15499a));
        for (r4.h hVar : iVar.f15502d) {
            q4.h hVar2 = hVar.f15496a;
            compileStatement2.clearBindings();
            Q.N(compileStatement2, new Object[]{str, G.i.x(hVar2.f15357a), Integer.valueOf(i7)});
            compileStatement2.executeUpdateDelete();
            q2.f15217l.a(hVar2);
        }
    }

    @Override // p4.InterfaceC1693x
    public List j() {
        ArrayList arrayList = new ArrayList();
        P R7 = ((Q) this.f11318b).R("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC");
        R7.a(1000000, (String) this.f11321e);
        Cursor s7 = R7.s();
        while (s7.moveToNext()) {
            try {
                arrayList.add(m(s7.getBlob(1), s7.getInt(0)));
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
        return arrayList;
    }

    @Override // p4.InterfaceC1693x
    public ArrayList k(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(G.i.x(((q4.h) it.next()).f15357a));
        }
        t tVar = new t((Q) this.f11318b, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, (String) this.f11321e), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (((Iterator) tVar.f).hasNext()) {
            tVar.q().e(new L(this, hashSet, arrayList2, 0));
        }
        if (tVar.f11317a > 1) {
            Collections.sort(arrayList2, new K1.d(24));
        }
        return arrayList2;
    }

    public void l() {
        View view = (View) this.f11318b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0597e) this.f11320d) != null) {
                if (((C0597e) this.f) == null) {
                    this.f = new Object();
                }
                C0597e c0597e = (C0597e) this.f;
                c0597e.f8248c = null;
                c0597e.f8247b = false;
                c0597e.f8249d = null;
                c0597e.f8246a = false;
                Field field = AbstractC1066z.f11214a;
                ColorStateList b5 = AbstractC1059s.b(view);
                if (b5 != null) {
                    c0597e.f8247b = true;
                    c0597e.f8248c = b5;
                }
                PorterDuff.Mode c8 = AbstractC1059s.c(view);
                if (c8 != null) {
                    c0597e.f8246a = true;
                    c0597e.f8249d = c8;
                }
                if (c0597e.f8247b || c0597e.f8246a) {
                    C1597n.c(background, c0597e, view.getDrawableState());
                    return;
                }
            }
            C0597e c0597e2 = (C0597e) this.f11321e;
            if (c0597e2 != null) {
                C1597n.c(background, c0597e2, view.getDrawableState());
                return;
            }
            C0597e c0597e3 = (C0597e) this.f11320d;
            if (c0597e3 != null) {
                C1597n.c(background, c0597e3, view.getDrawableState());
            }
        }
    }

    public r4.i m(byte[] bArr, int i7) {
        AbstractC0852m f;
        try {
            int length = bArr.length;
            C0585f c0585f = (C0585f) this.f11319c;
            if (length < 1000000) {
                return c0585f.F(s4.q.H(bArr));
            }
            ArrayList arrayList = new ArrayList();
            C0850l c0850l = AbstractC0852m.f10085b;
            arrayList.add(AbstractC0852m.l(bArr, 0, bArr.length));
            boolean z7 = true;
            while (z7) {
                P R7 = ((Q) this.f11318b).R("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
                R7.a(Integer.valueOf((arrayList.size() * 1000000) + 1), 1000000, (String) this.f11321e, Integer.valueOf(i7));
                Cursor s7 = R7.s();
                if (s7.moveToFirst()) {
                    byte[] blob = s7.getBlob(0);
                    C0850l c0850l2 = AbstractC0852m.f10085b;
                    arrayList.add(AbstractC0852m.l(blob, 0, blob.length));
                    if (blob.length < 1000000) {
                        z7 = false;
                    }
                }
                s7.close();
            }
            int size = arrayList.size();
            if (size == 0) {
                f = AbstractC0852m.f10085b;
            } else {
                f = AbstractC0852m.f(arrayList.iterator(), size);
            }
            return c0585f.F(s4.q.G(f));
        } catch (X e7) {
            m5.d.g("MutationBatch failed to parse: %s", e7);
            throw null;
        }
    }

    public void n(Task task) {
        I i7;
        if (this.f11317a > 0) {
            Exception exception = task.getException();
            if ((exception instanceof J) && ((i7 = ((J) exception).f9763a) == I.ABORTED || i7 == I.ALREADY_EXISTS || i7 == I.FAILED_PRECONDITION || !t4.i.a(i7))) {
                this.f11317a--;
                ((u4.l) this.f11321e).a(new RunnableC0626c(this, 10));
                return;
            }
        }
        ((TaskCompletionSource) this.f).setException(task.getException());
    }

    public void o(AttributeSet attributeSet, int i7) {
        ColorStateList i8;
        View view = (View) this.f11318b;
        Context context = view.getContext();
        int[] iArr = AbstractC1091a.f11369u;
        R1.j J02 = R1.j.J0(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) J02.f4683c;
        View view2 = (View) this.f11318b;
        AbstractC1066z.d(view2, view2.getContext(), iArr, attributeSet, (TypedArray) J02.f4683c, i7);
        try {
            if (typedArray.hasValue(0)) {
                this.f11317a = typedArray.getResourceId(0, -1);
                C1597n c1597n = (C1597n) this.f11319c;
                Context context2 = view.getContext();
                int i9 = this.f11317a;
                synchronized (c1597n) {
                    i8 = c1597n.f14854a.i(context2, i9);
                }
                if (i8 != null) {
                    r(i8);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC1059s.d(view, J02.s0(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC1059s.e(view, O.c(typedArray.getInt(2, -1), null));
            }
        } finally {
            J02.O0();
        }
    }

    public void p(int i7) {
        ColorStateList colorStateList;
        this.f11317a = i7;
        C1597n c1597n = (C1597n) this.f11319c;
        if (c1597n != null) {
            Context context = ((View) this.f11318b).getContext();
            synchronized (c1597n) {
                colorStateList = c1597n.f14854a.i(context, i7);
            }
        } else {
            colorStateList = null;
        }
        r(colorStateList);
        l();
    }

    public P q() {
        this.f11317a++;
        List list = (List) this.f11321e;
        ArrayList arrayList = new ArrayList(list);
        int i7 = 0;
        while (true) {
            Iterator it = (Iterator) this.f;
            if (!it.hasNext() || i7 >= 900 - list.size()) {
                break;
            }
            arrayList.add(it.next());
            i7++;
        }
        Object[] array = arrayList.toArray();
        P R7 = ((Q) this.f11318b).R(((String) this.f11319c) + ((Object) u4.u.i(array.length, "?", ", ")) + ((String) this.f11320d));
        R7.a(array);
        return R7;
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0597e) this.f11320d) == null) {
                this.f11320d = new Object();
            }
            C0597e c0597e = (C0597e) this.f11320d;
            c0597e.f8248c = colorStateList;
            c0597e.f8247b = true;
        } else {
            this.f11320d = null;
        }
        l();
    }

    public void s(ColorStateList colorStateList) {
        if (((C0597e) this.f11321e) == null) {
            this.f11321e = new Object();
        }
        C0597e c0597e = (C0597e) this.f11321e;
        c0597e.f8248c = colorStateList;
        c0597e.f8247b = true;
        l();
    }

    @Override // p4.InterfaceC1693x
    public void start() {
        Cursor s7;
        ArrayList arrayList = new ArrayList();
        Q q2 = (Q) this.f11318b;
        Cursor s8 = q2.R("SELECT uid FROM mutation_queues").s();
        while (s8.moveToNext()) {
            try {
                arrayList.add(s8.getString(0));
            } finally {
                if (s8 != null) {
                    try {
                        s8.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }
        s8.close();
        this.f11317a = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            P R7 = q2.R("SELECT MAX(batch_id) FROM mutations WHERE uid = ?");
            R7.a((String) it.next());
            s7 = R7.s();
            while (s7.moveToNext()) {
                try {
                    this.f11317a = Math.max(this.f11317a, s7.getInt(0));
                } finally {
                }
            }
            s7.close();
        }
        this.f11317a++;
        P R8 = q2.R("SELECT last_stream_token FROM mutation_queues WHERE uid = ?");
        R8.a((String) this.f11321e);
        s7 = R8.s();
        try {
            if (s7.moveToFirst()) {
                byte[] blob = s7.getBlob(0);
                C0850l c0850l = AbstractC0852m.f10085b;
                this.f = AbstractC0852m.l(blob, 0, blob.length);
                s7.close();
                return;
            }
            s7.close();
            u();
        } finally {
        }
    }

    public void t(PorterDuff.Mode mode) {
        if (((C0597e) this.f11321e) == null) {
            this.f11321e = new Object();
        }
        C0597e c0597e = (C0597e) this.f11321e;
        c0597e.f8249d = mode;
        c0597e.f8246a = true;
        l();
    }

    public void u() {
        ((Q) this.f11318b).Q("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", (String) this.f11321e, -1, ((AbstractC0852m) this.f).v());
    }

    public t(Q q2, String str, List list, ArrayList arrayList, String str2) {
        this.f11318b = q2;
        this.f11319c = str;
        this.f11321e = list;
        this.f11320d = str2;
        this.f = arrayList.iterator();
    }
}
