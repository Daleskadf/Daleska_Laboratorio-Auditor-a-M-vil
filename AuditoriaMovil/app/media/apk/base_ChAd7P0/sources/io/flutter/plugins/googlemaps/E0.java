package io.flutter.plugins.googlemaps;

import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import u0.C1859o;
import v0.C1879a;
/* loaded from: classes.dex */
public final class E0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public int f12048a;

    /* renamed from: b  reason: collision with root package name */
    public int f12049b;

    /* renamed from: c  reason: collision with root package name */
    public int f12050c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12051d;

    /* renamed from: e  reason: collision with root package name */
    public Object f12052e;
    public Object f;

    public E0(R1.j jVar, int i7, int i8, int i9) {
        this.f = jVar;
        this.f12051d = new CountDownLatch(1);
        this.f12048a = i7;
        this.f12049b = i8;
        this.f12050c = i9;
    }

    @Override // io.flutter.plugins.googlemaps.w0
    public void a(Object obj) {
        this.f12052e = (s0) obj;
        ((CountDownLatch) this.f12051d).countDown();
    }

    @Override // io.flutter.plugins.googlemaps.w0
    public void b(C1190x c1190x) {
        Log.e("TileProviderController", "Can't get tile: errorCode = " + c1190x.f12301a + ", errorMessage = " + c1190x.getMessage() + ", date = " + c1190x.f12302b);
        this.f12052e = null;
        ((CountDownLatch) this.f12051d).countDown();
    }

    public int c(int i7) {
        C1859o c1859o;
        SparseArray sparseArray = ((C1859o) this.f12052e).f15947a;
        if (sparseArray == null) {
            c1859o = null;
        } else {
            c1859o = (C1859o) sparseArray.get(i7);
        }
        int i8 = 1;
        int i9 = 2;
        if (this.f12048a != 2) {
            if (c1859o == null) {
                d();
            } else {
                this.f12048a = 2;
                this.f12052e = c1859o;
                this.f12050c = 1;
                i8 = i9;
            }
        } else {
            if (c1859o != null) {
                this.f12052e = c1859o;
                this.f12050c++;
            } else if (i7 == 65038) {
                d();
            } else if (i7 != 65039) {
                C1859o c1859o2 = (C1859o) this.f12052e;
                if (c1859o2.f15948b != null) {
                    i9 = 3;
                    if (this.f12050c == 1) {
                        if (e()) {
                            this.f = (C1859o) this.f12052e;
                            d();
                        } else {
                            d();
                        }
                    } else {
                        this.f = c1859o2;
                        d();
                    }
                } else {
                    d();
                }
            }
            i8 = i9;
        }
        this.f12049b = i7;
        return i8;
    }

    public void d() {
        this.f12048a = 1;
        this.f12052e = (C1859o) this.f12051d;
        this.f12050c = 0;
    }

    public boolean e() {
        C1879a c8 = ((C1859o) this.f12052e).f15948b.c();
        int a7 = c8.a(6);
        if ((a7 != 0 && ((ByteBuffer) c8.f11209d).get(a7 + c8.f11206a) != 0) || this.f12049b == 65039) {
            return true;
        }
        return false;
    }

    public E0(C1859o c1859o) {
        this.f12048a = 1;
        this.f12051d = c1859o;
        this.f12052e = c1859o;
    }
}
