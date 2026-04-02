package j$.time;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b  reason: collision with root package name */
    private final int f12588b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f12589c;

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap f12585d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap f12586e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = c0(0);
    public static final ZoneOffset f = c0(-64800);

    /* renamed from: g  reason: collision with root package name */
    public static final ZoneOffset f12587g = c0(64800);

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.ZoneOffset a0(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.requireNonNull(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.ZoneOffset.f12586e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r6, r2)
            int r2 = d0(r7, r5, r2)
            goto L85
        L37:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r1, r3)
            int r2 = d0(r7, r4, r3)
            goto L85
        L50:
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = d0(r7, r2, r3)
            int r1 = d0(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = d0(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = b0(r7, r0, r1)
            return r7
        La8:
            j$.time.ZoneOffset r7 = b0(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.a0(java.lang.String):j$.time.ZoneOffset");
    }

    private static int d0(String str, int i7, boolean z7) {
        if (z7 && str.charAt(i7 - 1) != ':') {
            throw new RuntimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char charAt = str.charAt(i7);
        char charAt2 = str.charAt(i7 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new RuntimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static ZoneOffset Y(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.B(j$.time.temporal.l.h());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        String name = temporal.getClass().getName();
        throw new RuntimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + temporal + " of type " + name);
    }

    public static ZoneOffset b0(int i7, int i8, int i9) {
        if (i7 < -18 || i7 > 18) {
            throw new RuntimeException("Zone offset hours not in valid range: value " + i7 + " is not in the range -18 to 18");
        }
        if (i7 > 0) {
            if (i8 < 0 || i9 < 0) {
                throw new RuntimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i7 < 0) {
            if (i8 > 0 || i9 > 0) {
                throw new RuntimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i8 > 0 && i9 < 0) || (i8 < 0 && i9 > 0)) {
            throw new RuntimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i8 < -59 || i8 > 59) {
            throw new RuntimeException("Zone offset minutes not in valid range: value " + i8 + " is not in the range -59 to 59");
        } else if (i9 < -59 || i9 > 59) {
            throw new RuntimeException("Zone offset seconds not in valid range: value " + i9 + " is not in the range -59 to 59");
        } else if (Math.abs(i7) != 18 || (i8 | i9) == 0) {
            return c0((i8 * 60) + (i7 * 3600) + i9);
        } else {
            throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static ZoneOffset c0(int i7) {
        if (i7 < -64800 || i7 > 64800) {
            throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i7 % 900 == 0) {
            Integer valueOf = Integer.valueOf(i7);
            ConcurrentHashMap concurrentHashMap = f12585d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset == null) {
                concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i7));
                ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
                f12586e.putIfAbsent(zoneOffset2.f12589c, zoneOffset2);
                return zoneOffset2;
            }
            return zoneOffset;
        }
        return new ZoneOffset(i7);
    }

    private ZoneOffset(int i7) {
        String sb;
        this.f12588b = i7;
        if (i7 == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i7);
            StringBuilder sb2 = new StringBuilder();
            int i8 = abs / 3600;
            int i9 = (abs / 60) % 60;
            sb2.append(i7 < 0 ? "-" : "+");
            sb2.append(i8 < 10 ? "0" : StringUtils.EMPTY);
            sb2.append(i8);
            String str = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
            sb2.append(i9 < 10 ? ":0" : TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb2.append(i9);
            int i10 = abs % 60;
            if (i10 != 0) {
                sb2.append(i10 < 10 ? ":0" : str);
                sb2.append(i10);
            }
            sb = sb2.toString();
        }
        this.f12589c = sb;
    }

    public final int Z() {
        return this.f12588b;
    }

    @Override // j$.time.ZoneId
    public final String n() {
        return this.f12589c;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f S() {
        return j$.time.zone.f.h(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f12588b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", qVar));
        }
        return j$.time.temporal.l.d(this, qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f12588b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", qVar));
        }
        return qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        return (rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.j()) ? this : j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(this.f12588b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* renamed from: X */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f12588b - this.f12588b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f12588b == ((ZoneOffset) obj).f12588b;
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f12588b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f12589c;
    }

    private Object writeReplace() {
        return new u((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.ZoneId
    public final void W(ObjectOutput objectOutput) {
        objectOutput.writeByte(8);
        f0(objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f0(DataOutput dataOutput) {
        int i7 = this.f12588b;
        int i8 = i7 % 900 == 0 ? i7 / 900 : 127;
        dataOutput.writeByte(i8);
        if (i8 == 127) {
            dataOutput.writeInt(i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset e0(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? c0(objectInput.readInt()) : c0(readByte * 900);
    }
}
