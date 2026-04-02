package t0;

import kotlin.jvm.internal.j;
/* renamed from: t0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1805d {

    /* renamed from: a  reason: collision with root package name */
    public final String f15708a;

    public C1805d(String name) {
        j.e(name, "name");
        this.f15708a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1805d) {
            return j.a(this.f15708a, ((C1805d) obj).f15708a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15708a.hashCode();
    }

    public final String toString() {
        return this.f15708a;
    }
}
