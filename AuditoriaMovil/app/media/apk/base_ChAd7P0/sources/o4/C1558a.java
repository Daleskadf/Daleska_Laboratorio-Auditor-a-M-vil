package o4;

import java.util.Arrays;
import q4.h;
import u4.u;
/* renamed from: o4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1558a implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final int f14587a;

    /* renamed from: b  reason: collision with root package name */
    public final h f14588b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14589c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f14590d;

    public C1558a(int i7, h hVar, byte[] bArr, byte[] bArr2) {
        this.f14587a = i7;
        if (hVar != null) {
            this.f14588b = hVar;
            if (bArr != null) {
                this.f14589c = bArr;
                if (bArr2 != null) {
                    this.f14590d = bArr2;
                    return;
                }
                throw new NullPointerException("Null directionalValue");
            }
            throw new NullPointerException("Null arrayValue");
        }
        throw new NullPointerException("Null documentKey");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1558a c1558a = (C1558a) obj;
        int compare = Integer.compare(this.f14587a, c1558a.f14587a);
        if (compare == 0) {
            int compareTo = this.f14588b.compareTo(c1558a.f14588b);
            if (compareTo == 0) {
                int b5 = u.b(this.f14589c, c1558a.f14589c);
                if (b5 == 0) {
                    return u.b(this.f14590d, c1558a.f14590d);
                }
                return b5;
            }
            return compareTo;
        }
        return compare;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1558a)) {
            return false;
        }
        C1558a c1558a = (C1558a) obj;
        if (this.f14587a == c1558a.f14587a && this.f14588b.equals(c1558a.f14588b) && Arrays.equals(this.f14589c, c1558a.f14589c) && Arrays.equals(this.f14590d, c1558a.f14590d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14587a ^ 1000003) * 1000003) ^ this.f14588b.f15357a.hashCode()) * 1000003) ^ Arrays.hashCode(this.f14589c)) * 1000003) ^ Arrays.hashCode(this.f14590d);
    }

    public final String toString() {
        return "IndexEntry{indexId=" + this.f14587a + ", documentKey=" + this.f14588b + ", arrayValue=" + Arrays.toString(this.f14589c) + ", directionalValue=" + Arrays.toString(this.f14590d) + "}";
    }
}
