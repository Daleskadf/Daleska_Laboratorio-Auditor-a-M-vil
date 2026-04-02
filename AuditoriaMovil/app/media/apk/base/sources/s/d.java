package S;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public int f4816a;

    /* renamed from: b  reason: collision with root package name */
    public int f4817b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4818c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f4819d;

    public d(f fVar) {
        this.f4819d = fVar;
        this.f4816a = fVar.f4834c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f4818c) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i7 = this.f4817b;
            f fVar = this.f4819d;
            if (!kotlin.jvm.internal.j.a(key, fVar.e(i7)) || !kotlin.jvm.internal.j.a(entry.getValue(), fVar.h(this.f4817b))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f4818c) {
            return this.f4819d.e(this.f4817b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f4818c) {
            return this.f4819d.h(this.f4817b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4817b < this.f4816a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f4818c) {
            int i7 = this.f4817b;
            f fVar = this.f4819d;
            Object e7 = fVar.e(i7);
            Object h8 = fVar.h(this.f4817b);
            int i8 = 0;
            if (e7 == null) {
                hashCode = 0;
            } else {
                hashCode = e7.hashCode();
            }
            if (h8 != null) {
                i8 = h8.hashCode();
            }
            return hashCode ^ i8;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f4817b++;
            this.f4818c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f4818c) {
            this.f4819d.f(this.f4817b);
            this.f4817b--;
            this.f4816a--;
            this.f4818c = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f4818c) {
            return this.f4819d.g(this.f4817b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
