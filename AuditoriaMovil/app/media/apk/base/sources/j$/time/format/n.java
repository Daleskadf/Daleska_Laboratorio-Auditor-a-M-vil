package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n implements f {

    /* renamed from: c  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f12690c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f12691d;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12692a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f12693b;

    public /* synthetic */ n(int i7, Object obj) {
        this.f12692a = i7;
        this.f12693b = obj;
    }

    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb) {
        switch (this.f12692a) {
            case 0:
                sb.append((String) this.f12693b);
                return true;
            default:
                ZoneId zoneId = (ZoneId) tVar.f((C1205a) this.f12693b);
                if (zoneId == null) {
                    return false;
                }
                sb.append(zoneId.n());
                return true;
        }
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i7) {
        int i8;
        switch (this.f12692a) {
            case 0:
                if (i7 > charSequence.length() || i7 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) this.f12693b;
                return !qVar.r(charSequence, i7, str, 0, str.length()) ? ~i7 : str.length() + i7;
            default:
                int length = charSequence.length();
                if (i7 <= length) {
                    if (i7 != length) {
                        char charAt = charSequence.charAt(i7);
                        if (charAt != '+' && charAt != '-') {
                            int i9 = i7 + 2;
                            if (length >= i9) {
                                char charAt2 = charSequence.charAt(i7 + 1);
                                if (qVar.a(charAt, 'U') && qVar.a(charAt2, 'T')) {
                                    int i10 = i7 + 3;
                                    if (length >= i10 && qVar.a(charSequence.charAt(i9), 'C')) {
                                        return a(qVar, charSequence, i7, i10, j.f);
                                    }
                                    return a(qVar, charSequence, i7, i9, j.f);
                                } else if (qVar.a(charAt, 'G') && length >= (i8 = i7 + 3) && qVar.a(charAt2, 'M') && qVar.a(charSequence.charAt(i9), 'T')) {
                                    int i11 = i7 + 4;
                                    if (length >= i11 && qVar.a(charSequence.charAt(i8), '0')) {
                                        qVar.m(ZoneId.of("GMT0"));
                                        return i11;
                                    }
                                    return a(qVar, charSequence, i7, i8, j.f);
                                }
                            }
                            Set a7 = j$.time.zone.j.a();
                            int size = a7.size();
                            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = qVar.j() ? f12690c : f12691d;
                            if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                synchronized (this) {
                                    try {
                                        simpleImmutableEntry = qVar.j() ? f12690c : f12691d;
                                        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                            simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), l.e(a7, qVar));
                                            if (qVar.j()) {
                                                f12690c = simpleImmutableEntry;
                                            } else {
                                                f12691d = simpleImmutableEntry;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            ParsePosition parsePosition = new ParsePosition(i7);
                            String c8 = ((l) simpleImmutableEntry.getValue()).c(charSequence, parsePosition);
                            if (c8 == null) {
                                if (qVar.a(charAt, 'Z')) {
                                    qVar.m(ZoneOffset.UTC);
                                    return i7 + 1;
                                }
                            } else {
                                qVar.m(ZoneId.of(c8));
                                return parsePosition.getIndex();
                            }
                        } else {
                            return a(qVar, charSequence, i7, i7, j.f12680e);
                        }
                    }
                    return ~i7;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    private static int a(q qVar, CharSequence charSequence, int i7, int i8, j jVar) {
        String upperCase = charSequence.subSequence(i7, i8).toString().toUpperCase();
        if (i8 >= charSequence.length()) {
            qVar.m(ZoneId.of(upperCase));
            return i8;
        } else if (charSequence.charAt(i8) == '0' || qVar.a(charSequence.charAt(i8), 'Z')) {
            qVar.m(ZoneId.of(upperCase));
            return i8;
        } else {
            q c8 = qVar.c();
            int q2 = jVar.q(c8, charSequence, i8);
            try {
                if (q2 < 0) {
                    if (jVar == j.f12680e) {
                        return ~i7;
                    }
                    qVar.m(ZoneId.of(upperCase));
                    return i8;
                }
                qVar.m(ZoneId.U(upperCase, ZoneOffset.c0((int) c8.i(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return q2;
            } catch (j$.time.c unused) {
                return ~i7;
            }
        }
    }

    public final String toString() {
        switch (this.f12692a) {
            case 0:
                String replace = ((String) this.f12693b).replace("'", "''");
                return "'" + replace + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
