package F6;

import java.util.concurrent.CancellationException;
/* renamed from: F6.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107u {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1308a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0096k f1309b;

    /* renamed from: c  reason: collision with root package name */
    public final w6.l f1310c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1311d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f1312e;

    public C0107u(Object obj, AbstractC0096k abstractC0096k, w6.l lVar, Object obj2, Throwable th) {
        this.f1308a = obj;
        this.f1309b = abstractC0096k;
        this.f1310c = lVar;
        this.f1311d = obj2;
        this.f1312e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0107u a(C0107u c0107u, AbstractC0096k abstractC0096k, CancellationException cancellationException, int i7) {
        Object obj = c0107u.f1308a;
        if ((i7 & 2) != 0) {
            abstractC0096k = c0107u.f1309b;
        }
        AbstractC0096k abstractC0096k2 = abstractC0096k;
        w6.l lVar = c0107u.f1310c;
        Object obj2 = c0107u.f1311d;
        CancellationException cancellationException2 = cancellationException;
        if ((i7 & 16) != 0) {
            cancellationException2 = c0107u.f1312e;
        }
        c0107u.getClass();
        return new C0107u(obj, abstractC0096k2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0107u)) {
            return false;
        }
        C0107u c0107u = (C0107u) obj;
        if (kotlin.jvm.internal.j.a(this.f1308a, c0107u.f1308a) && kotlin.jvm.internal.j.a(this.f1309b, c0107u.f1309b) && kotlin.jvm.internal.j.a(this.f1310c, c0107u.f1310c) && kotlin.jvm.internal.j.a(this.f1311d, c0107u.f1311d) && kotlin.jvm.internal.j.a(this.f1312e, c0107u.f1312e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i7 = 0;
        Object obj = this.f1308a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        AbstractC0096k abstractC0096k = this.f1309b;
        if (abstractC0096k == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC0096k.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        w6.l lVar = this.f1310c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Object obj2 = this.f1311d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        Throwable th = this.f1312e;
        if (th != null) {
            i7 = th.hashCode();
        }
        return i11 + i7;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1308a + ", cancelHandler=" + this.f1309b + ", onCancellation=" + this.f1310c + ", idempotentResume=" + this.f1311d + ", cancelCause=" + this.f1312e + ')';
    }

    public /* synthetic */ C0107u(Object obj, AbstractC0096k abstractC0096k, w6.l lVar, CancellationException cancellationException, int i7) {
        this(obj, (i7 & 2) != 0 ? null : abstractC0096k, (i7 & 4) != 0 ? null : lVar, (Object) null, (i7 & 16) != 0 ? null : cancellationException);
    }
}
