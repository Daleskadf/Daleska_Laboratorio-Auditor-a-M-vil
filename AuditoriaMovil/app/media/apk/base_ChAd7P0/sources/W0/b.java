package W0;

import J1.i;
import J1.l;
import N0.h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class b implements J1.e, N0.c {

    /* renamed from: a  reason: collision with root package name */
    public final h f6091a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6092b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f6093c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f6094d;

    /* renamed from: e  reason: collision with root package name */
    public final N0.f[] f6095e;
    public final N0.g[] f;

    /* renamed from: g  reason: collision with root package name */
    public int f6096g;

    /* renamed from: h  reason: collision with root package name */
    public int f6097h;

    /* renamed from: i  reason: collision with root package name */
    public N0.f f6098i;
    public N0.d j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6099k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6100l;

    /* renamed from: m  reason: collision with root package name */
    public long f6101m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f6102n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f6103o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(l lVar) {
        this(new i[2], new J1.c[2]);
        this.f6102n = 1;
        int i7 = this.f6096g;
        N0.f[] fVarArr = this.f6095e;
        K0.a.j(i7 == fVarArr.length);
        for (N0.f fVar : fVarArr) {
            fVar.h(RecognitionOptions.UPC_E);
        }
        this.f6103o = lVar;
    }

    @Override // N0.c
    public final void a(long j) {
        boolean z7;
        synchronized (this.f6092b) {
            try {
                if (this.f6096g != this.f6095e.length && !this.f6099k) {
                    z7 = false;
                    K0.a.j(z7);
                    this.f6101m = j;
                }
                z7 = true;
                K0.a.j(z7);
                this.f6101m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N0.c
    public final Object d() {
        boolean z7;
        N0.f fVar;
        synchronized (this.f6092b) {
            try {
                N0.d dVar = this.j;
                if (dVar == null) {
                    if (this.f6098i == null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    K0.a.j(z7);
                    int i7 = this.f6096g;
                    if (i7 == 0) {
                        fVar = null;
                    } else {
                        N0.f[] fVarArr = this.f6095e;
                        int i8 = i7 - 1;
                        this.f6096g = i8;
                        fVar = fVarArr[i8];
                    }
                    this.f6098i = fVar;
                } else {
                    throw dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [N0.d, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v2, types: [N0.d, java.lang.Exception] */
    public final N0.d f(Throwable th) {
        switch (this.f6102n) {
            case 0:
                return new Exception("Unexpected decode error", th);
            default:
                return new Exception("Unexpected decode error", th);
        }
    }

    @Override // N0.c
    public final void flush() {
        synchronized (this.f6092b) {
            try {
                this.f6099k = true;
                N0.f fVar = this.f6098i;
                if (fVar != null) {
                    fVar.e();
                    int i7 = this.f6096g;
                    this.f6096g = i7 + 1;
                    this.f6095e[i7] = fVar;
                    this.f6098i = null;
                }
                while (!this.f6093c.isEmpty()) {
                    N0.f fVar2 = (N0.f) this.f6093c.removeFirst();
                    fVar2.e();
                    int i8 = this.f6096g;
                    this.f6096g = i8 + 1;
                    this.f6095e[i8] = fVar2;
                }
                while (!this.f6094d.isEmpty()) {
                    ((N0.g) this.f6094d.removeFirst()).f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final N0.d g(N0.f fVar, N0.g gVar, boolean z7) {
        boolean z8;
        switch (this.f6102n) {
            case 0:
                a aVar = (a) gVar;
                try {
                    ByteBuffer byteBuffer = fVar.f3350e;
                    byteBuffer.getClass();
                    K0.a.j(byteBuffer.hasArray());
                    if (byteBuffer.arrayOffset() == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    K0.a.e(z8);
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    ((P0.b) this.f6103o).getClass();
                    aVar.f6090e = P0.b.a(array, remaining);
                    aVar.f3351c = fVar.f3345X;
                    return null;
                } catch (d e7) {
                    return e7;
                }
            default:
                i iVar = (i) fVar;
                J1.c cVar = (J1.c) gVar;
                try {
                    ByteBuffer byteBuffer2 = iVar.f3350e;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    l lVar = (l) this.f6103o;
                    if (z7) {
                        lVar.a();
                    }
                    J1.d g3 = lVar.g(array2, 0, limit);
                    long j = iVar.f3345X;
                    long j8 = iVar.f2374e0;
                    cVar.f3351c = j;
                    cVar.f2363e = g3;
                    if (j8 != Long.MAX_VALUE) {
                        j = j8;
                    }
                    cVar.f = j;
                    cVar.f3352d = false;
                    return null;
                } catch (J1.f e8) {
                    return e8;
                }
        }
    }

    public final boolean h() {
        N0.d f;
        boolean z7;
        synchronized (this.f6092b) {
            while (!this.f6100l) {
                try {
                    if (!this.f6093c.isEmpty() && this.f6097h > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        break;
                    }
                    this.f6092b.wait();
                } finally {
                }
            }
            if (this.f6100l) {
                return false;
            }
            N0.f fVar = (N0.f) this.f6093c.removeFirst();
            N0.g[] gVarArr = this.f;
            int i7 = this.f6097h - 1;
            this.f6097h = i7;
            N0.g gVar = gVarArr[i7];
            boolean z8 = this.f6099k;
            this.f6099k = false;
            if (fVar.c(4)) {
                gVar.a(4);
            } else {
                gVar.f3351c = fVar.f3345X;
                if (fVar.c(134217728)) {
                    gVar.a(134217728);
                }
                if (!j(fVar.f3345X)) {
                    gVar.f3352d = true;
                }
                try {
                    f = g(fVar, gVar, z8);
                } catch (OutOfMemoryError e7) {
                    f = f(e7);
                } catch (RuntimeException e8) {
                    f = f(e8);
                }
                if (f != null) {
                    synchronized (this.f6092b) {
                        this.j = f;
                    }
                    return false;
                }
            }
            synchronized (this.f6092b) {
                try {
                    if (this.f6099k) {
                        gVar.f();
                    } else if (gVar.f3352d) {
                        gVar.f();
                    } else {
                        this.f6094d.addLast(gVar);
                    }
                    fVar.e();
                    int i8 = this.f6096g;
                    this.f6096g = i8 + 1;
                    this.f6095e[i8] = fVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // N0.c
    /* renamed from: i */
    public final N0.g c() {
        synchronized (this.f6092b) {
            try {
                N0.d dVar = this.j;
                if (dVar == null) {
                    if (this.f6094d.isEmpty()) {
                        return null;
                    }
                    return (N0.g) this.f6094d.removeFirst();
                }
                throw dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(long j) {
        boolean z7;
        synchronized (this.f6092b) {
            long j8 = this.f6101m;
            if (j8 != -9223372036854775807L && j < j8) {
                z7 = false;
            }
            z7 = true;
        }
        return z7;
    }

    @Override // N0.c
    /* renamed from: k */
    public final void e(N0.f fVar) {
        boolean z7;
        synchronized (this.f6092b) {
            try {
                N0.d dVar = this.j;
                if (dVar == null) {
                    if (fVar == this.f6098i) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    K0.a.e(z7);
                    this.f6093c.addLast(fVar);
                    if (!this.f6093c.isEmpty() && this.f6097h > 0) {
                        this.f6092b.notify();
                    }
                    this.f6098i = null;
                } else {
                    throw dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(N0.g gVar) {
        synchronized (this.f6092b) {
            gVar.e();
            int i7 = this.f6097h;
            this.f6097h = i7 + 1;
            this.f[i7] = gVar;
            if (!this.f6093c.isEmpty() && this.f6097h > 0) {
                this.f6092b.notify();
            }
        }
    }

    @Override // N0.c
    public final void release() {
        synchronized (this.f6092b) {
            this.f6100l = true;
            this.f6092b.notify();
        }
        try {
            this.f6091a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public b(N0.f[] fVarArr, N0.g[] gVarArr) {
        N0.g aVar;
        N0.f fVar;
        this.f6092b = new Object();
        this.f6101m = -9223372036854775807L;
        this.f6093c = new ArrayDeque();
        this.f6094d = new ArrayDeque();
        this.f6095e = fVarArr;
        this.f6096g = fVarArr.length;
        for (int i7 = 0; i7 < this.f6096g; i7++) {
            N0.f[] fVarArr2 = this.f6095e;
            switch (this.f6102n) {
                case 0:
                    fVar = new N0.f(1);
                    break;
                default:
                    fVar = new N0.f(1);
                    break;
            }
            fVarArr2[i7] = fVar;
        }
        this.f = gVarArr;
        this.f6097h = gVarArr.length;
        for (int i8 = 0; i8 < this.f6097h; i8++) {
            N0.g[] gVarArr2 = this.f;
            switch (this.f6102n) {
                case 0:
                    aVar = new a(this);
                    break;
                default:
                    aVar = new J1.c(this);
                    break;
            }
            gVarArr2[i8] = aVar;
        }
        h hVar = new h(this);
        this.f6091a = hVar;
        hVar.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(P0.b bVar) {
        this(new N0.f[1], new a[1]);
        this.f6102n = 0;
        this.f6103o = bVar;
    }

    @Override // J1.e
    public void b(long j) {
    }
}
