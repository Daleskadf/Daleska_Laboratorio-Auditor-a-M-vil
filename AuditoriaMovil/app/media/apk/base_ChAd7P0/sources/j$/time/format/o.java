package j$.time.format;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.a f12694a;

    /* renamed from: b  reason: collision with root package name */
    private final A f12695b;

    /* renamed from: c  reason: collision with root package name */
    private final b f12696c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f12697d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j$.time.temporal.a aVar, A a7, b bVar) {
        this.f12694a = aVar;
        this.f12695b = a7;
        this.f12696c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb) {
        String a7;
        Long e7 = tVar.e(this.f12694a);
        if (e7 == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) tVar.d().B(j$.time.temporal.l.e());
        if (mVar == null || mVar == j$.time.chrono.t.f12641d) {
            long longValue = e7.longValue();
            A a8 = this.f12695b;
            tVar.c();
            a7 = this.f12696c.f12668a.a(longValue, a8);
        } else {
            long longValue2 = e7.longValue();
            A a9 = this.f12695b;
            tVar.c();
            a7 = this.f12696c.f12668a.a(longValue2, a9);
        }
        if (a7 != null) {
            sb.append(a7);
            return true;
        }
        if (this.f12697d == null) {
            this.f12697d = new i(this.f12694a, 1, 19, z.NORMAL);
        }
        return this.f12697d.o(tVar, sb);
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i7) {
        Iterator b5;
        int length = charSequence.length();
        if (i7 < 0 || i7 > length) {
            throw new IndexOutOfBoundsException();
        }
        A a7 = qVar.k() ? this.f12695b : null;
        j$.time.chrono.m g3 = qVar.g();
        b bVar = this.f12696c;
        j$.time.temporal.a aVar = this.f12694a;
        if (g3 == null || g3 == j$.time.chrono.t.f12641d) {
            qVar.h();
            b5 = bVar.f12668a.b(a7);
        } else {
            qVar.h();
            b5 = bVar.f12668a.b(a7);
        }
        if (b5 != null) {
            while (b5.hasNext()) {
                Map.Entry entry = (Map.Entry) b5.next();
                String str = (String) entry.getKey();
                if (qVar.r(str, 0, charSequence, i7, str.length())) {
                    return qVar.n(this.f12694a, ((Long) entry.getValue()).longValue(), i7, str.length() + i7);
                }
            }
            if (aVar == j$.time.temporal.a.ERA && !qVar.k()) {
                for (j$.time.chrono.n nVar : g3.N()) {
                    String obj = nVar.toString();
                    if (qVar.r(obj, 0, charSequence, i7, obj.length())) {
                        return qVar.n(this.f12694a, nVar.getValue(), i7, obj.length() + i7);
                    }
                }
            }
            if (qVar.k()) {
                return ~i7;
            }
        }
        if (this.f12697d == null) {
            this.f12697d = new i(this.f12694a, 1, 19, z.NORMAL);
        }
        return this.f12697d.q(qVar, charSequence, i7);
    }

    public final String toString() {
        A a7 = A.FULL;
        j$.time.temporal.a aVar = this.f12694a;
        A a8 = this.f12695b;
        if (a8 == a7) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + a8 + ")";
    }
}
