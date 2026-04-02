package n4;

import org.apache.tika.utils.StringUtils;
/* renamed from: n4.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513B {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1512A f14267a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.k f14268b;

    public C1513B(EnumC1512A enumC1512A, q4.k kVar) {
        this.f14267a = enumC1512A;
        this.f14268b = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1513B)) {
            return false;
        }
        C1513B c1513b = (C1513B) obj;
        if (this.f14267a != c1513b.f14267a || !this.f14268b.equals(c1513b.f14268b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14268b.hashCode() + ((this.f14267a.hashCode() + 899) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f14267a == EnumC1512A.ASCENDING) {
            str = StringUtils.EMPTY;
        } else {
            str = "-";
        }
        sb.append(str);
        sb.append(this.f14268b.c());
        return sb.toString();
    }
}
