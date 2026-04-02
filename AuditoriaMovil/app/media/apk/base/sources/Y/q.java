package y;

import android.view.Surface;
import j$.util.Objects;
import java.util.List;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16594a;

    public q(Surface surface) {
        this.f16594a = new p(surface);
    }

    public void a(Surface surface) {
        if (e() != surface) {
            if (!f()) {
                throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
            }
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
        throw new IllegalStateException("Surface is already added!");
    }

    public void b() {
        ((p) this.f16594a).f = true;
    }

    public Object c() {
        return null;
    }

    public String d() {
        return ((p) this.f16594a).f16592e;
    }

    public Surface e() {
        List list = ((p) this.f16594a).f16588a;
        if (list.size() == 0) {
            return null;
        }
        return (Surface) list.get(0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        return Objects.equals(this.f16594a, ((q) obj).f16594a);
    }

    public boolean f() {
        return ((p) this.f16594a).f;
    }

    public void g(long j) {
        ((p) this.f16594a).f16593g = j;
    }

    public final int hashCode() {
        return this.f16594a.hashCode();
    }

    public void i(String str) {
        ((p) this.f16594a).f16592e = str;
    }

    public q(Object obj) {
        this.f16594a = obj;
    }

    public void h(int i7) {
    }

    public void j(long j) {
    }
}
