package p4;

import com.google.protobuf.AbstractC0852m;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public final n4.L f15235a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15236b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15237c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC1670A f15238d;

    /* renamed from: e  reason: collision with root package name */
    public final q4.q f15239e;
    public final q4.q f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC0852m f15240g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f15241h;

    public Y(n4.L l8, int i7, long j, EnumC1670A enumC1670A, q4.q qVar, q4.q qVar2, AbstractC0852m abstractC0852m, Integer num) {
        l8.getClass();
        this.f15235a = l8;
        this.f15236b = i7;
        this.f15237c = j;
        this.f = qVar2;
        this.f15238d = enumC1670A;
        qVar.getClass();
        this.f15239e = qVar;
        abstractC0852m.getClass();
        this.f15240g = abstractC0852m;
        this.f15241h = num;
    }

    public final Y a(AbstractC0852m abstractC0852m, q4.q qVar) {
        return new Y(this.f15235a, this.f15236b, this.f15237c, this.f15238d, qVar, this.f, abstractC0852m, null);
    }

    public final Y b(long j) {
        return new Y(this.f15235a, this.f15236b, j, this.f15238d, this.f15239e, this.f, this.f15240g, this.f15241h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y.class != obj.getClass()) {
            return false;
        }
        Y y2 = (Y) obj;
        if (this.f15235a.equals(y2.f15235a) && this.f15236b == y2.f15236b && this.f15237c == y2.f15237c && this.f15238d.equals(y2.f15238d) && this.f15239e.equals(y2.f15239e) && this.f.equals(y2.f) && this.f15240g.equals(y2.f15240g) && Objects.equals(this.f15241h, y2.f15241h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f15238d.hashCode();
        int hashCode2 = this.f15239e.f15371a.hashCode();
        int hashCode3 = this.f.f15371a.hashCode();
        int hashCode4 = this.f15240g.hashCode();
        return Objects.hashCode(this.f15241h) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f15235a.hashCode() * 31) + this.f15236b) * 31) + ((int) this.f15237c)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TargetData{target=" + this.f15235a + ", targetId=" + this.f15236b + ", sequenceNumber=" + this.f15237c + ", purpose=" + this.f15238d + ", snapshotVersion=" + this.f15239e + ", lastLimboFreeSnapshotVersion=" + this.f + ", resumeToken=" + this.f15240g + ", expectedCount=" + this.f15241h + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Y(n4.L r11, int r12, long r13, p4.EnumC1670A r15) {
        /*
            r10 = this;
            q4.q r7 = q4.q.f15370b
            com.google.protobuf.l r8 = t4.C1819G.f15772t
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r6 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.Y.<init>(n4.L, int, long, p4.A):void");
    }
}
