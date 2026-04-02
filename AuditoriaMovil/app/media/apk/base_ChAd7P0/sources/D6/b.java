package D6;

import g.C0999d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public Object f896a;

    /* renamed from: b  reason: collision with root package name */
    public int f897b = -2;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f898c;

    public b(c cVar) {
        this.f898c = cVar;
    }

    public final void a() {
        Object invoke;
        int i7;
        int i8 = this.f897b;
        c cVar = this.f898c;
        if (i8 == -2) {
            cVar.getClass();
            invoke = C0999d.f11079a.invoke();
        } else {
            Object obj = this.f896a;
            kotlin.jvm.internal.j.b(obj);
            invoke = ((h) cVar.f900b).invoke(obj);
        }
        this.f896a = invoke;
        if (invoke == null) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f897b = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f897b < 0) {
            a();
        }
        if (this.f897b == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f897b < 0) {
            a();
        }
        if (this.f897b != 0) {
            Object obj = this.f896a;
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f897b = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
