package j$.time.zone;

import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.l;
import j$.time.n;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a  reason: collision with root package name */
    private final n f12812a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f12813b;

    /* renamed from: c  reason: collision with root package name */
    private final DayOfWeek f12814c;

    /* renamed from: d  reason: collision with root package name */
    private final l f12815d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12816e;
    private final d f;

    /* renamed from: g  reason: collision with root package name */
    private final ZoneOffset f12817g;

    /* renamed from: h  reason: collision with root package name */
    private final ZoneOffset f12818h;

    /* renamed from: i  reason: collision with root package name */
    private final ZoneOffset f12819i;

    e(n nVar, int i7, DayOfWeek dayOfWeek, l lVar, boolean z7, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f12812a = nVar;
        this.f12813b = (byte) i7;
        this.f12814c = dayOfWeek;
        this.f12815d = lVar;
        this.f12816e = z7;
        this.f = dVar;
        this.f12817g = zoneOffset;
        this.f12818h = zoneOffset2;
        this.f12819i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        l lVar = this.f12815d;
        boolean z7 = this.f12816e;
        int k02 = z7 ? 86400 : lVar.k0();
        int Z6 = this.f12817g.Z();
        ZoneOffset zoneOffset = this.f12818h;
        int Z7 = zoneOffset.Z() - Z6;
        ZoneOffset zoneOffset2 = this.f12819i;
        int Z8 = zoneOffset2.Z() - Z6;
        int V7 = k02 % 3600 == 0 ? z7 ? 24 : lVar.V() : 31;
        int i7 = Z6 % 900 == 0 ? (Z6 / 900) + RecognitionOptions.ITF : 255;
        int i8 = (Z7 == 0 || Z7 == 1800 || Z7 == 3600) ? Z7 / 1800 : 3;
        int i9 = (Z8 == 0 || Z8 == 1800 || Z8 == 3600) ? Z8 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f12814c;
        objectOutput.writeInt((this.f12812a.getValue() << 28) + ((this.f12813b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (V7 << 14) + (this.f.ordinal() << 12) + (i7 << 4) + (i8 << 2) + i9);
        if (V7 == 31) {
            objectOutput.writeInt(k02);
        }
        if (i7 == 255) {
            objectOutput.writeInt(Z6);
        }
        if (i8 == 3) {
            objectOutput.writeInt(zoneOffset.Z());
        }
        if (i9 == 3) {
            objectOutput.writeInt(zoneOffset2.Z());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e b(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        n U7 = n.U(readInt >>> 28);
        int i7 = ((264241152 & readInt) >>> 22) - 32;
        int i8 = (3670016 & readInt) >>> 19;
        DayOfWeek R7 = i8 == 0 ? null : DayOfWeek.R(i8);
        int i9 = (507904 & readInt) >>> 14;
        d dVar = d.values()[(readInt & 12288) >>> 12];
        int i10 = (readInt & 4080) >>> 4;
        int i11 = (readInt & 12) >>> 2;
        int i12 = readInt & 3;
        l c02 = i9 == 31 ? l.c0(objectInput.readInt()) : l.Z(i9 % 24);
        ZoneOffset c03 = ZoneOffset.c0(i10 == 255 ? objectInput.readInt() : (i10 - 128) * 900);
        ZoneOffset c04 = i11 == 3 ? ZoneOffset.c0(objectInput.readInt()) : ZoneOffset.c0((i11 * 1800) + c03.Z());
        ZoneOffset c05 = i12 == 3 ? ZoneOffset.c0(objectInput.readInt()) : ZoneOffset.c0((i12 * 1800) + c03.Z());
        boolean z7 = i9 == 24;
        Objects.requireNonNull(U7, "month");
        Objects.requireNonNull(c02, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(c03, "standardOffset");
        Objects.requireNonNull(c04, "offsetBefore");
        Objects.requireNonNull(c05, "offsetAfter");
        if (i7 < -28 || i7 > 31 || i7 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z7 && !c02.equals(l.f12737g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (c02.X() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(U7, i7, R7, c02, z7, dVar, c03, c04, c05);
    }

    public final b a(int i7) {
        j$.time.h h02;
        DayOfWeek dayOfWeek = this.f12814c;
        n nVar = this.f12812a;
        byte b5 = this.f12813b;
        if (b5 < 0) {
            t.f12641d.getClass();
            h02 = j$.time.h.h0(i7, nVar, nVar.S(t.S(i7)) + 1 + b5);
            if (dayOfWeek != null) {
                h02 = h02.s(new j$.time.temporal.n(dayOfWeek.getValue(), 1));
            }
        } else {
            h02 = j$.time.h.h0(i7, nVar, b5);
            if (dayOfWeek != null) {
                h02 = h02.s(new j$.time.temporal.n(dayOfWeek.getValue(), 0));
            }
        }
        if (this.f12816e) {
            h02 = h02.l0(1L);
        }
        LocalDateTime f02 = LocalDateTime.f0(h02, this.f12815d);
        d dVar = this.f;
        dVar.getClass();
        int i8 = c.f12810a[dVar.ordinal()];
        ZoneOffset zoneOffset = this.f12818h;
        if (i8 == 1) {
            f02 = f02.i0(zoneOffset.Z() - ZoneOffset.UTC.Z());
        } else if (i8 == 2) {
            f02 = f02.i0(zoneOffset.Z() - this.f12817g.Z());
        }
        return new b(f02, zoneOffset, this.f12819i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f12812a == eVar.f12812a && this.f12813b == eVar.f12813b && this.f12814c == eVar.f12814c && this.f == eVar.f && this.f12815d.equals(eVar.f12815d) && this.f12816e == eVar.f12816e && this.f12817g.equals(eVar.f12817g) && this.f12818h.equals(eVar.f12818h) && this.f12819i.equals(eVar.f12819i);
        }
        return false;
    }

    public final int hashCode() {
        int k02 = ((this.f12815d.k0() + (this.f12816e ? 1 : 0)) << 15) + (this.f12812a.ordinal() << 11) + ((this.f12813b + 32) << 5);
        DayOfWeek dayOfWeek = this.f12814c;
        return ((this.f12817g.hashCode() ^ (this.f.ordinal() + (k02 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f12818h.hashCode()) ^ this.f12819i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f12818h;
        ZoneOffset zoneOffset2 = this.f12819i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        n nVar = this.f12812a;
        byte b5 = this.f12813b;
        DayOfWeek dayOfWeek = this.f12814c;
        if (dayOfWeek == null) {
            sb.append(nVar.name());
            sb.append(' ');
            sb.append((int) b5);
        } else if (b5 == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(nVar.name());
        } else if (b5 < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b5) - 1);
            sb.append(" of ");
            sb.append(nVar.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(nVar.name());
            sb.append(' ');
            sb.append((int) b5);
        }
        sb.append(" at ");
        sb.append(this.f12816e ? "24:00" : this.f12815d.toString());
        sb.append(StringUtils.SPACE);
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.f12817g);
        sb.append(']');
        return sb.toString();
    }
}
