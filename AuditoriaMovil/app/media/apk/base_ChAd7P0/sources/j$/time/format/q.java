package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private DateTimeFormatter f12703a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12704b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12705c = true;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f12706d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f12706d = arrayList;
        this.f12703a = dateTimeFormatter;
        arrayList.add(new x());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final q c() {
        q qVar = new q(this.f12703a);
        qVar.f12704b = this.f12704b;
        qVar.f12705c = this.f12705c;
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale h() {
        return this.f12703a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w f() {
        return this.f12703a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.chrono.m g() {
        j$.time.chrono.m mVar = d().f12719c;
        if (mVar == null) {
            j$.time.chrono.m a7 = this.f12703a.a();
            return a7 == null ? j$.time.chrono.t.f12641d : a7;
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(char c8, char c9) {
        if (this.f12704b) {
            return c8 == c9;
        }
        return b(c8, c9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return this.f12704b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z7) {
        this.f12704b = z7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9) {
        if (i7 + i9 > charSequence.length() || i8 + i9 > charSequence2.length()) {
            return false;
        }
        if (this.f12704b) {
            for (int i10 = 0; i10 < i9; i10++) {
                if (charSequence.charAt(i7 + i10) != charSequence2.charAt(i8 + i10)) {
                    return false;
                }
            }
            return true;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            char charAt = charSequence.charAt(i7 + i11);
            char charAt2 = charSequence2.charAt(i8 + i11);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(char c8, char c9) {
        return c8 == c9 || Character.toUpperCase(c8) == Character.toUpperCase(c9) || Character.toLowerCase(c8) == Character.toLowerCase(c9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.f12705c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(boolean z7) {
        this.f12705c = z7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        ArrayList arrayList = this.f12706d;
        x d7 = d();
        d7.getClass();
        x xVar = new x();
        xVar.f12717a.putAll(d7.f12717a);
        xVar.f12718b = d7.f12718b;
        xVar.f12719c = d7.f12719c;
        xVar.f12720d = d7.f12720d;
        arrayList.add(xVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(boolean z7) {
        ArrayList arrayList = this.f12706d;
        if (z7) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    private x d() {
        ArrayList arrayList = this.f12706d;
        return (x) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TemporalAccessor s(y yVar) {
        x d7 = d();
        d7.f12719c = g();
        ZoneId zoneId = d7.f12718b;
        if (zoneId == null) {
            this.f12703a.getClass();
            zoneId = null;
        }
        d7.f12718b = zoneId;
        d7.m(yVar);
        return d7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long i(j$.time.temporal.a aVar) {
        return (Long) d().f12717a.get(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n(j$.time.temporal.q qVar, long j, int i7, int i8) {
        Objects.requireNonNull(qVar, "field");
        Long l8 = (Long) d().f12717a.put(qVar, Long.valueOf(j));
        return (l8 == null || l8.longValue() == j) ? i8 : ~i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        d().f12718b = zoneId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        d().f12720d = true;
    }

    public final String toString() {
        return d().toString();
    }
}
