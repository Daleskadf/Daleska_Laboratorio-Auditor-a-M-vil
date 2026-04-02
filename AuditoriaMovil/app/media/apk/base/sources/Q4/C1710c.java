package q4;
/* renamed from: q4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1710c {

    /* renamed from: a  reason: collision with root package name */
    public final long f15347a;

    /* renamed from: b  reason: collision with root package name */
    public final C1709b f15348b;

    public C1710c(long j, C1709b c1709b) {
        this.f15347a = j;
        if (c1709b != null) {
            this.f15348b = c1709b;
            return;
        }
        throw new NullPointerException("Null offset");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1710c)) {
            return false;
        }
        C1710c c1710c = (C1710c) obj;
        if (this.f15347a == c1710c.f15347a && this.f15348b.equals(c1710c.f15348b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15347a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f15348b.hashCode();
    }

    public final String toString() {
        return "IndexState{sequenceNumber=" + this.f15347a + ", offset=" + this.f15348b + "}";
    }
}
