package A3;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: A3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005c implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator f127a;

    /* renamed from: b  reason: collision with root package name */
    public Object f128b = null;

    /* renamed from: c  reason: collision with root package name */
    public Collection f129c = null;

    /* renamed from: d  reason: collision with root package name */
    public Iterator f130d = S.INSTANCE;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b0 f131e;

    public C0005c(b0 b0Var) {
        this.f131e = b0Var;
        this.f127a = b0Var.f125d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f127a.hasNext() && !this.f130d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f130d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f127a.next();
            this.f128b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f129c = collection;
            this.f130d = collection.iterator();
        }
        return this.f130d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f130d.remove();
        Collection collection = this.f129c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f127a.remove();
        }
        b0 b0Var = this.f131e;
        b0Var.f126e--;
    }
}
