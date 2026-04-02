package i9;

import java.util.Collection;
/* loaded from: classes3.dex */
public abstract class a implements Collection, u9.a {

    /* renamed from: i9.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0233a extends t9.j implements s9.l {
        public C0233a() {
            super(1);
        }

        @Override // s9.l
        /* renamed from: b */
        public final CharSequence invoke(Object obj) {
            if (obj == a.this) {
                return "(this Collection)";
            }
            return String.valueOf(obj);
        }
    }

    public abstract int a();

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object obj2 : this) {
            if (t9.i.b(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        t9.i.g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return t9.f.a(this);
    }

    public String toString() {
        return r.y(this, ", ", "[", "]", 0, null, new C0233a(), 24, null);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        t9.i.g(objArr, "array");
        return t9.f.b(this, objArr);
    }
}
