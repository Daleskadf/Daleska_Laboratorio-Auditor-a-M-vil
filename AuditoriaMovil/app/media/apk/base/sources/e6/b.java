package E6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC2020a {

    /* renamed from: a  reason: collision with root package name */
    public int f1075a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f1076b;

    /* renamed from: c  reason: collision with root package name */
    public int f1077c;

    /* renamed from: d  reason: collision with root package name */
    public B6.f f1078d;

    /* renamed from: e  reason: collision with root package name */
    public int f1079e;
    public final /* synthetic */ c f;

    public b(c cVar) {
        this.f = cVar;
        int i7 = cVar.f1081b;
        int length = cVar.f1080a.length();
        if (length >= 0) {
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > length) {
                i7 = length;
            }
            this.f1076b = i7;
            this.f1077c = i7;
            return;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r7 < r3) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [w6.p, kotlin.jvm.internal.k] */
    /* JADX WARN: Type inference failed for: r0v7, types: [B6.f, B6.d] */
    /* JADX WARN: Type inference failed for: r0v8, types: [B6.f, B6.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            int r0 = r8.f1077c
            r1 = 0
            if (r0 >= 0) goto Lb
            r8.f1075a = r1
            r0 = 0
            r8.f1078d = r0
            goto L75
        Lb:
            E6.c r2 = r8.f
            int r3 = r2.f1082c
            java.lang.String r4 = r2.f1080a
            r5 = -1
            r6 = 1
            if (r3 <= 0) goto L1c
            int r7 = r8.f1079e
            int r7 = r7 + r6
            r8.f1079e = r7
            if (r7 >= r3) goto L22
        L1c:
            int r3 = r4.length()
            if (r0 <= r3) goto L32
        L22:
            B6.f r0 = new B6.f
            int r1 = r8.f1076b
            int r2 = E6.m.P(r4)
            r0.<init>(r1, r2, r6)
            r8.f1078d = r0
            r8.f1077c = r5
            goto L73
        L32:
            kotlin.jvm.internal.k r0 = r2.f1083d
            int r2 = r8.f1077c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r4, r2)
            l6.d r0 = (l6.d) r0
            if (r0 != 0) goto L52
            B6.f r0 = new B6.f
            int r1 = r8.f1076b
            int r2 = E6.m.P(r4)
            r0.<init>(r1, r2, r6)
            r8.f1078d = r0
            r8.f1077c = r5
            goto L73
        L52:
            java.lang.Object r2 = r0.f13865a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f13866b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.f1076b
            B6.f r3 = android.support.v4.media.session.a.E(r3, r2)
            r8.f1078d = r3
            int r2 = r2 + r0
            r8.f1076b = r2
            if (r0 != 0) goto L70
            r1 = r6
        L70:
            int r2 = r2 + r1
            r8.f1077c = r2
        L73:
            r8.f1075a = r6
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E6.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1075a == -1) {
            a();
        }
        if (this.f1075a == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1075a == -1) {
            a();
        }
        if (this.f1075a != 0) {
            B6.f fVar = this.f1078d;
            kotlin.jvm.internal.j.c(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f1078d = null;
            this.f1075a = -1;
            return fVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
