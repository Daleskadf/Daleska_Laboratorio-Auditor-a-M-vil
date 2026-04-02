package androidx.camera.core.impl;
/* renamed from: androidx.camera.core.impl.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7612a;

    public C0502d(Object obj) {
        this.f7612a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0502d) {
            return this.f7612a.equals(((C0502d) obj).f7612a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7612a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f7612a + "}";
    }
}
