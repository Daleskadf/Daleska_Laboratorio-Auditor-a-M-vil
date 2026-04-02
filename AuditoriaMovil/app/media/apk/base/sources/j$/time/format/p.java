package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class p {
    private static final C1205a f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private p f12698a;

    /* renamed from: b  reason: collision with root package name */
    private final p f12699b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f12700c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12701d;

    /* renamed from: e  reason: collision with root package name */
    private int f12702e;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a, java.lang.Object] */
    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.q qVar = j$.time.temporal.i.f12769a;
        hashMap.put('Q', qVar);
        hashMap.put('q', qVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.k.f12776a);
    }

    public p() {
        this.f12698a = this;
        this.f12700c = new ArrayList();
        this.f12702e = -1;
        this.f12699b = null;
        this.f12701d = false;
    }

    private p(p pVar) {
        this.f12698a = this;
        this.f12700c = new ArrayList();
        this.f12702e = -1;
        this.f12699b = pVar;
        this.f12701d = true;
    }

    public final void q() {
        d(m.SENSITIVE);
    }

    public final void p() {
        d(m.INSENSITIVE);
    }

    public final void s() {
        d(m.STRICT);
    }

    public final void r() {
        d(m.LENIENT);
    }

    public final void k(j$.time.temporal.q qVar, int i7) {
        Objects.requireNonNull(qVar, "field");
        if (i7 < 1 || i7 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i7);
        }
        j(new i(qVar, i7, i7, z.NOT_NEGATIVE));
    }

    public final void l(j$.time.temporal.q qVar, int i7, int i8, z zVar) {
        if (i7 == i8 && zVar == z.NOT_NEGATIVE) {
            k(qVar, i8);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(zVar, "signStyle");
        if (i7 < 1 || i7 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i7);
        } else if (i8 < 1 || i8 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i8);
        } else if (i8 < i7) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i8 + " < " + i7);
        } else {
            j(new i(qVar, i7, i8, zVar));
        }
    }

    private void j(i iVar) {
        i c8;
        z zVar;
        p pVar = this.f12698a;
        int i7 = pVar.f12702e;
        if (i7 >= 0) {
            i iVar2 = (i) pVar.f12700c.get(i7);
            int i8 = iVar.f12675b;
            int i9 = iVar.f12676c;
            if (i8 == i9) {
                zVar = iVar.f12677d;
                if (zVar == z.NOT_NEGATIVE) {
                    c8 = iVar2.d(i9);
                    d(iVar.c());
                    this.f12698a.f12702e = i7;
                    this.f12698a.f12700c.set(i7, c8);
                    return;
                }
            }
            c8 = iVar2.c();
            this.f12698a.f12702e = d(iVar);
            this.f12698a.f12700c.set(i7, c8);
            return;
        }
        pVar.f12702e = d(iVar);
    }

    public final void b(j$.time.temporal.a aVar) {
        g gVar = new g(aVar, 0, 9, true, 0);
        Objects.requireNonNull(aVar, "field");
        if (aVar.o().g()) {
            d(gVar);
            return;
        }
        throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
    }

    public final void i(j$.time.temporal.a aVar, HashMap hashMap) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(hashMap, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        A a7 = A.FULL;
        d(new o(aVar, a7, new b(new v(Collections.singletonMap(a7, linkedHashMap)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.f, java.lang.Object] */
    public final void c() {
        d(new Object());
    }

    public final void h() {
        d(j.f12680e);
    }

    public final void g(String str, String str2) {
        d(new j(str, str2));
    }

    public final void m() {
        d(new n(1, f));
    }

    public final void e(char c8) {
        d(new d(c8));
    }

    public final void f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new d(str.charAt(0)));
        } else {
            d(new n(0, str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.f());
    }

    public final void o() {
        p pVar = this.f12698a;
        pVar.f12702e = -1;
        this.f12698a = new p(pVar);
    }

    public final void n() {
        p pVar = this.f12698a;
        if (pVar.f12699b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (pVar.f12700c.size() > 0) {
            p pVar2 = this.f12698a;
            e eVar = new e(pVar2.f12700c, pVar2.f12701d);
            this.f12698a = this.f12698a.f12699b;
            d(eVar);
            return;
        }
        this.f12698a = this.f12698a.f12699b;
    }

    private int d(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        p pVar = this.f12698a;
        pVar.getClass();
        pVar.f12700c.add(fVar);
        p pVar2 = this.f12698a;
        pVar2.f12702e = -1;
        return pVar2.f12700c.size() - 1;
    }

    public final DateTimeFormatter t() {
        return v(Locale.getDefault(), y.SMART, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final DateTimeFormatter u(y yVar, j$.time.chrono.t tVar) {
        return v(Locale.getDefault(), yVar, tVar);
    }

    private DateTimeFormatter v(Locale locale, y yVar, j$.time.chrono.t tVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f12698a.f12699b != null) {
            n();
        }
        e eVar = new e(this.f12700c, false);
        w wVar = w.f12716a;
        return new DateTimeFormatter(eVar, locale, yVar, tVar);
    }
}
