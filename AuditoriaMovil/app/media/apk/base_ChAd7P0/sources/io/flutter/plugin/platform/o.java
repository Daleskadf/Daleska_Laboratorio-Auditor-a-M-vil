package io.flutter.plugin.platform;

import B5.C0028a;
import B5.C0042o;
import B5.EnumC0041n;
import B5.V;
import D.AbstractC0059i;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: w  reason: collision with root package name */
    public static final Class[] f11715w = {SurfaceView.class};

    /* renamed from: a  reason: collision with root package name */
    public final n f11716a;

    /* renamed from: b  reason: collision with root package name */
    public C0028a f11717b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f11718c;

    /* renamed from: d  reason: collision with root package name */
    public B5.B f11719d;

    /* renamed from: e  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.m f11720e;
    public io.flutter.plugin.editing.k f;

    /* renamed from: g  reason: collision with root package name */
    public A.f f11721g;

    /* renamed from: h  reason: collision with root package name */
    public final C1136a f11722h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f11723i;
    public final HashMap j;

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray f11724k;

    /* renamed from: l  reason: collision with root package name */
    public final SparseArray f11725l;

    /* renamed from: m  reason: collision with root package name */
    public final SparseArray f11726m;

    /* renamed from: n  reason: collision with root package name */
    public final SparseArray f11727n;

    /* renamed from: r  reason: collision with root package name */
    public final HashSet f11731r;

    /* renamed from: s  reason: collision with root package name */
    public final HashSet f11732s;

    /* renamed from: t  reason: collision with root package name */
    public final A.f f11733t;

    /* renamed from: o  reason: collision with root package name */
    public int f11728o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11729p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11730q = true;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11734u = false;

    /* renamed from: v  reason: collision with root package name */
    public final n f11735v = new n(this);

    /* JADX WARN: Type inference failed for: r0v2, types: [io.flutter.plugin.platform.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public o() {
        ?? obj = new Object();
        obj.f11714a = new HashMap();
        this.f11716a = obj;
        this.f11723i = new HashMap();
        this.f11722h = new Object();
        this.j = new HashMap();
        this.f11726m = new SparseArray();
        this.f11731r = new HashSet();
        this.f11732s = new HashSet();
        this.f11727n = new SparseArray();
        this.f11724k = new SparseArray();
        this.f11725l = new SparseArray();
        if (A.f.f8d == null) {
            A.f.f8d = new A.f();
        }
        this.f11733t = A.f.f8d;
    }

    public static void a(o oVar, K5.o oVar2) {
        oVar.getClass();
        int i7 = oVar2.f2712g;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalStateException(AbstractC0059i.B(io.flutter.plugins.pathprovider.b.k("Trying to create a view with unknown direction value: ", i7, "(view id: "), oVar2.f2707a, ")"));
        }
    }

    public static void d(int i7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= i7) {
            return;
        }
        throw new IllegalStateException(AbstractC0059i.x("Trying to use platform views with API ", i8, i7, ", required API level is: "));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [io.flutter.plugin.platform.n, io.flutter.plugin.platform.i, java.lang.Object] */
    public static i i(io.flutter.embedding.engine.renderer.m mVar) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            TextureRegistry$SurfaceProducer c8 = mVar.c();
            ?? obj = new Object();
            obj.f11714a = c8;
            return obj;
        } else if (i7 >= 29) {
            return new c(mVar.b());
        } else {
            return new v(mVar.d());
        }
    }

    public final g b(K5.o oVar, boolean z7) {
        Object obj;
        Context context;
        String str = oVar.f2708b;
        h hVar = (h) ((HashMap) this.f11716a.f11714a).get(str);
        if (hVar != null) {
            ByteBuffer byteBuffer = oVar.f2714i;
            if (byteBuffer != null) {
                obj = hVar.f11698a.b(byteBuffer);
            } else {
                obj = null;
            }
            if (z7) {
                context = new MutableContextWrapper(this.f11718c);
            } else {
                context = this.f11718c;
            }
            int i7 = oVar.f2707a;
            g a7 = hVar.a(context, i7, obj);
            View view = a7.getView();
            if (view != null) {
                view.setLayoutDirection(oVar.f2712g);
                this.f11724k.put(i7, a7);
                return a7;
            }
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    public final void c() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f11726m;
            if (i7 < sparseArray.size()) {
                d dVar = (d) sparseArray.valueAt(i7);
                dVar.d();
                dVar.f371a.close();
                i7++;
            } else {
                return;
            }
        }
    }

    public final void e(boolean z7) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f11726m;
            if (i7 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i7);
            d dVar = (d) sparseArray.valueAt(i7);
            if (this.f11731r.contains(Integer.valueOf(keyAt))) {
                C5.c cVar = this.f11719d.f295f0;
                if (cVar != null) {
                    dVar.f(cVar.f554b);
                }
                z7 &= dVar.a();
            } else {
                if (!this.f11729p) {
                    dVar.d();
                }
                dVar.setVisibility(8);
                this.f11719d.removeView(dVar);
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f11725l;
            if (i8 < sparseArray2.size()) {
                int keyAt2 = sparseArray2.keyAt(i8);
                View view = (View) sparseArray2.get(keyAt2);
                if (this.f11732s.contains(Integer.valueOf(keyAt2)) && (z7 || !this.f11730q)) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public final float f() {
        return this.f11718c.getResources().getDisplayMetrics().density;
    }

    public final View g(int i7) {
        if (m(i7)) {
            return ((A) this.f11723i.get(Integer.valueOf(i7))).a();
        }
        g gVar = (g) this.f11724k.get(i7);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.o] */
    public final void h() {
        if (this.f11730q && !this.f11729p) {
            B5.B b5 = this.f11719d;
            b5.f292d.c();
            C0042o c0042o = b5.f291c;
            if (c0042o == null) {
                C0042o c0042o2 = new C0042o(b5.getContext(), b5.getWidth(), b5.getHeight(), EnumC0041n.background);
                b5.f291c = c0042o2;
                b5.addView(c0042o2);
            } else {
                c0042o.g(b5.getWidth(), b5.getHeight());
            }
            b5.f293e = b5.f292d;
            C0042o c0042o3 = b5.f291c;
            b5.f292d = c0042o3;
            C5.c cVar = b5.f295f0;
            if (cVar != null) {
                c0042o3.f(cVar.f554b);
            }
            this.f11729p = true;
        }
    }

    public final void j() {
        for (A a7 : this.f11723i.values()) {
            int width = a7.f.getWidth();
            i iVar = a7.f;
            int height = iVar.getHeight();
            boolean isFocused = a7.a().isFocused();
            t detachState = a7.f11676a.detachState();
            a7.f11682h.setSurface(null);
            a7.f11682h.release();
            a7.f11682h = ((DisplayManager) a7.f11677b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + a7.f11680e, width, height, a7.f11679d, iVar.getSurface(), 0, A.f11675i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(a7.f11677b, a7.f11682h.getDisplay(), a7.f11678c, detachState, a7.f11681g, isFocused);
            singleViewPresentation.show();
            a7.f11676a.cancel();
            a7.f11676a = singleViewPresentation;
        }
    }

    public final MotionEvent k(float f, K5.q qVar, boolean z7) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j;
        V v6 = new V(qVar.f2731p);
        while (true) {
            A.f fVar = this.f11733t;
            priorityQueue = (PriorityQueue) fVar.f11c;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) fVar.f10b;
            j = v6.f342a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j);
        longSparseArray.remove(j);
        ArrayList arrayList = new ArrayList();
        for (List list : (List) qVar.f2723g) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
            double d7 = f;
            pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d7);
            pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d7);
            pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d7);
            pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d7);
            pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d7);
            pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d7);
            arrayList.add(pointerCoords);
        }
        int i7 = qVar.f2722e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i7]);
        if (!z7 && motionEvent != null) {
            if (pointerCoordsArr.length >= 1) {
                motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
            }
            return motionEvent;
        }
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : (List) qVar.f) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list2.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list2.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(qVar.f2719b.longValue(), qVar.f2720c.longValue(), qVar.f2721d, qVar.f2722e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i7]), pointerCoordsArr, qVar.f2724h, qVar.f2725i, qVar.j, qVar.f2726k, qVar.f2727l, qVar.f2728m, qVar.f2729n, qVar.f2730o);
    }

    public final int l(double d7) {
        return (int) Math.round(d7 * f());
    }

    public final boolean m(int i7) {
        return this.f11723i.containsKey(Integer.valueOf(i7));
    }
}
