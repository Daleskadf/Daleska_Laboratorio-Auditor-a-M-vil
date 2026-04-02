package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC1202i;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a  reason: collision with root package name */
    private final long f12806a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalDateTime f12807b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneOffset f12808c;

    /* renamed from: d  reason: collision with root package name */
    private final ZoneOffset f12809d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f12806a, ((b) obj).f12806a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f12806a = AbstractC1202i.o(localDateTime, zoneOffset);
        this.f12807b = localDateTime;
        this.f12808c = zoneOffset;
        this.f12809d = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f12806a = j;
        this.f12807b = LocalDateTime.g0(j, 0, zoneOffset);
        this.f12808c = zoneOffset;
        this.f12809d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        a.c(this.f12806a, objectOutput);
        a.d(this.f12808c, objectOutput);
        a.d(this.f12809d, objectOutput);
    }

    public final long Q() {
        return this.f12806a;
    }

    public final LocalDateTime q() {
        return this.f12807b;
    }

    public final ZoneOffset w() {
        return this.f12808c;
    }

    public final ZoneOffset t() {
        return this.f12809d;
    }

    public final LocalDateTime o() {
        return this.f12807b.i0(this.f12809d.Z() - this.f12808c.Z());
    }

    public final j$.time.e s() {
        return j$.time.e.w(this.f12809d.Z() - this.f12808c.Z());
    }

    public final boolean D() {
        return this.f12809d.Z() > this.f12808c.Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List B() {
        return D() ? Collections.emptyList() : j$.com.android.tools.r8.a.h(new Object[]{this.f12808c, this.f12809d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f12806a == bVar.f12806a && this.f12808c.equals(bVar.f12808c) && this.f12809d.equals(bVar.f12809d);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12807b.hashCode() ^ this.f12808c.hashCode()) ^ Integer.rotateLeft(this.f12809d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(D() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f12807b);
        sb.append(this.f12808c);
        sb.append(" to ");
        sb.append(this.f12809d);
        sb.append(']');
        return sb.toString();
    }
}
