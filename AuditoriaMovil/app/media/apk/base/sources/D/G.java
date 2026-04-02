package D;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class G implements b0 {

    /* renamed from: b  reason: collision with root package name */
    public final b0 f615b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f614a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f616c = new HashSet();

    public G(b0 b0Var) {
        this.f615b = b0Var;
    }

    public final void a(F f) {
        synchronized (this.f614a) {
            this.f616c.add(f);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.f615b.close();
        synchronized (this.f614a) {
            hashSet = new HashSet(this.f616c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((F) it.next()).a(this);
        }
    }

    @Override // D.b0
    public final int e() {
        return this.f615b.e();
    }

    @Override // D.b0
    public final C5.i[] f() {
        return this.f615b.f();
    }

    @Override // D.b0
    public int getHeight() {
        return this.f615b.getHeight();
    }

    @Override // D.b0
    public int getWidth() {
        return this.f615b.getWidth();
    }

    @Override // D.b0
    public Y h() {
        return this.f615b.h();
    }

    @Override // D.b0
    public final Image k() {
        return this.f615b.k();
    }
}
