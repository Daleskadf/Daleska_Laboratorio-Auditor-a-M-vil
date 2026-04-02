package i2;

import D.AbstractC0059i;
import E6.m;
import java.math.BigInteger;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class l implements Comparable {
    public static final l f;

    /* renamed from: a  reason: collision with root package name */
    public final int f11468a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11469b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11470c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11471d;

    /* renamed from: e  reason: collision with root package name */
    public final l6.g f11472e = m5.d.m(new R6.d(this, 2));

    static {
        new l(0, 0, 0, StringUtils.EMPTY);
        f = new l(0, 1, 0, StringUtils.EMPTY);
        new l(1, 0, 0, StringUtils.EMPTY);
    }

    public l(int i7, int i8, int i9, String str) {
        this.f11468a = i7;
        this.f11469b = i8;
        this.f11470c = i9;
        this.f11471d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l other = (l) obj;
        kotlin.jvm.internal.j.e(other, "other");
        Object a7 = this.f11472e.a();
        kotlin.jvm.internal.j.d(a7, "<get-bigInteger>(...)");
        Object a8 = other.f11472e.a();
        kotlin.jvm.internal.j.d(a8, "<get-bigInteger>(...)");
        return ((BigInteger) a7).compareTo((BigInteger) a8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f11468a != lVar.f11468a || this.f11469b != lVar.f11469b || this.f11470c != lVar.f11470c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((527 + this.f11468a) * 31) + this.f11469b) * 31) + this.f11470c;
    }

    public final String toString() {
        String str;
        String str2 = this.f11471d;
        if (!m.U(str2)) {
            str = io.flutter.plugins.pathprovider.b.h("-", str2);
        } else {
            str = StringUtils.EMPTY;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11468a);
        sb.append('.');
        sb.append(this.f11469b);
        sb.append('.');
        return AbstractC0059i.B(sb, this.f11470c, str);
    }
}
