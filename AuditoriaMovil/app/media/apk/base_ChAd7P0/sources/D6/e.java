package D6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o6.EnumC1565a;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public final class e implements Iterator, n6.d, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public int f901a;

    /* renamed from: b  reason: collision with root package name */
    public Object f902b;

    /* renamed from: c  reason: collision with root package name */
    public n6.d f903c;

    public final RuntimeException a() {
        int i7 = this.f901a;
        if (i7 != 4) {
            if (i7 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f901a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final EnumC1565a c(Object obj, p6.h hVar) {
        this.f902b = obj;
        this.f901a = 3;
        this.f903c = hVar;
        return EnumC1565a.COROUTINE_SUSPENDED;
    }

    @Override // n6.d
    public final n6.i getContext() {
        return n6.j.f14394a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        while (true) {
            i7 = this.f901a;
            if (i7 != 0) {
                break;
            }
            this.f901a = 5;
            n6.d dVar = this.f903c;
            kotlin.jvm.internal.j.b(dVar);
            this.f903c = null;
            dVar.resumeWith(l6.j.f13876a);
        }
        if (i7 != 1) {
            if (i7 == 2 || i7 == 3) {
                return true;
            }
            if (i7 == 4) {
                return false;
            }
            throw a();
        }
        kotlin.jvm.internal.j.b(null);
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f901a;
        if (i7 != 0 && i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    this.f901a = 0;
                    Object obj = this.f902b;
                    this.f902b = null;
                    return obj;
                }
                throw a();
            }
            this.f901a = 1;
            kotlin.jvm.internal.j.b(null);
            throw null;
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // n6.d
    public final void resumeWith(Object obj) {
        org.slf4j.helpers.i.M(obj);
        this.f901a = 4;
    }
}
