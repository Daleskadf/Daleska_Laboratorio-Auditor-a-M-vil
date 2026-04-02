package r;

import java.util.Map;
/* renamed from: r.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1718c implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15399a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15400b;

    /* renamed from: c  reason: collision with root package name */
    public C1718c f15401c;

    /* renamed from: d  reason: collision with root package name */
    public C1718c f15402d;

    public C1718c(Object obj, Object obj2) {
        this.f15399a = obj;
        this.f15400b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1718c)) {
            return false;
        }
        C1718c c1718c = (C1718c) obj;
        if (this.f15399a.equals(c1718c.f15399a) && this.f15400b.equals(c1718c.f15400b)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15399a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15400b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f15399a.hashCode() ^ this.f15400b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15399a + "=" + this.f15400b;
    }
}
