package B5;

import F6.C0081c0;
import F6.InterfaceC0091h0;
import F6.x0;
import a6.t0;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import i2.C1102b;
import io.flutter.embedding.engine.FlutterJNI;
import j$.util.Objects;
import j2.C1363a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class B extends FrameLayout implements N5.a, O {

    /* renamed from: a  reason: collision with root package name */
    public final C0044q f289a;

    /* renamed from: b  reason: collision with root package name */
    public final C0045s f290b;

    /* renamed from: c  reason: collision with root package name */
    public C0042o f291c;

    /* renamed from: d  reason: collision with root package name */
    public View f292d;

    /* renamed from: e  reason: collision with root package name */
    public View f293e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f294e0;
    public final HashSet f;

    /* renamed from: f0  reason: collision with root package name */
    public C5.c f295f0;

    /* renamed from: g0  reason: collision with root package name */
    public final HashSet f296g0;

    /* renamed from: h0  reason: collision with root package name */
    public M0.x f297h0;

    /* renamed from: i0  reason: collision with root package name */
    public io.flutter.plugin.editing.k f298i0;

    /* renamed from: j0  reason: collision with root package name */
    public io.flutter.plugin.editing.g f299j0;

    /* renamed from: k0  reason: collision with root package name */
    public M5.a f300k0;

    /* renamed from: l0  reason: collision with root package name */
    public V2.k f301l0;

    /* renamed from: m0  reason: collision with root package name */
    public C0028a f302m0;

    /* renamed from: n0  reason: collision with root package name */
    public io.flutter.view.o f303n0;

    /* renamed from: o0  reason: collision with root package name */
    public TextServicesManager f304o0;

    /* renamed from: p0  reason: collision with root package name */
    public A.c f305p0;
    public final io.flutter.embedding.engine.renderer.l q0;

    /* renamed from: r0  reason: collision with root package name */
    public final A.m f306r0;

    /* renamed from: s0  reason: collision with root package name */
    public final y f307s0;

    /* renamed from: t0  reason: collision with root package name */
    public final C0033f f308t0;

    /* renamed from: u0  reason: collision with root package name */
    public C0050x f309u0;

    /* renamed from: v0  reason: collision with root package name */
    public D f310v0;

    /* JADX WARN: Type inference failed for: r3v7, types: [B5.D, java.lang.Object] */
    public B(AbstractActivityC0032e abstractActivityC0032e, C0044q c0044q) {
        super(abstractActivityC0032e, null);
        this.f = new HashSet();
        this.f296g0 = new HashSet();
        this.q0 = new io.flutter.embedding.engine.renderer.l();
        this.f306r0 = new A.m(this, 1);
        this.f307s0 = new y(this, new Handler(Looper.getMainLooper()));
        this.f308t0 = new C0033f(this, 2);
        this.f310v0 = new Object();
        this.f289a = c0044q;
        this.f292d = c0044q;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [android.view.View, io.flutter.embedding.engine.renderer.o] */
    public final void a() {
        SparseArray sparseArray;
        int size;
        Objects.toString(this.f295f0);
        if (!c()) {
            return;
        }
        Iterator it = this.f296g0.iterator();
        if (!it.hasNext()) {
            getContext().getContentResolver().unregisterContentObserver(this.f307s0);
            io.flutter.plugin.platform.o oVar = this.f295f0.f568r;
            int i7 = 0;
            while (true) {
                SparseArray sparseArray2 = oVar.f11727n;
                if (i7 >= sparseArray2.size()) {
                    break;
                }
                oVar.f11719d.removeView((io.flutter.plugin.platform.j) sparseArray2.valueAt(i7));
                i7++;
            }
            int i8 = 0;
            while (true) {
                SparseArray sparseArray3 = oVar.f11725l;
                if (i8 >= sparseArray3.size()) {
                    break;
                }
                oVar.f11719d.removeView((G5.b) sparseArray3.valueAt(i8));
                i8++;
            }
            oVar.c();
            if (oVar.f11719d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i9 = 0;
                while (true) {
                    sparseArray = oVar.f11726m;
                    if (i9 >= sparseArray.size()) {
                        break;
                    }
                    oVar.f11719d.removeView((View) sparseArray.valueAt(i9));
                    i9++;
                }
                sparseArray.clear();
            }
            oVar.f11719d = null;
            oVar.f11729p = false;
            int i10 = 0;
            while (true) {
                SparseArray sparseArray4 = oVar.f11724k;
                if (i10 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray4.valueAt(i10)).getClass();
                i10++;
            }
            this.f295f0.f568r.f11722h.f11685a = null;
            io.flutter.view.o oVar2 = this.f303n0;
            oVar2.f12515u = true;
            oVar2.f12501e.f11722h.f11685a = null;
            oVar2.f12513s = null;
            AccessibilityManager accessibilityManager = oVar2.f12499c;
            accessibilityManager.removeAccessibilityStateChangeListener(oVar2.f12517w);
            accessibilityManager.removeTouchExplorationStateChangeListener(oVar2.f12518x);
            oVar2.f.unregisterContentObserver(oVar2.f12519y);
            V2.k kVar = oVar2.f12498b;
            kVar.f5967d = null;
            ((FlutterJNI) kVar.f5966c).setAccessibilityDelegate(null);
            this.f303n0 = null;
            this.f298i0.f11663b.restartInput(this);
            this.f298i0.c();
            if (((HashSet) this.f301l0.f5966c).size() > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.g gVar = this.f299j0;
            if (gVar != null) {
                gVar.f11651a.f218b = null;
                SpellCheckerSession spellCheckerSession = gVar.f11653c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            M0.x xVar = this.f297h0;
            if (xVar != null) {
                ((A.c) xVar.f3211c).f4b = null;
            }
            io.flutter.embedding.engine.renderer.m mVar = this.f295f0.f554b;
            this.f294e0 = false;
            mVar.f11612a.removeIsDisplayingFlutterUiListener(this.f308t0);
            mVar.g();
            mVar.f11612a.setSemanticsEnabled(false);
            View view = this.f293e;
            if (view != null && this.f292d == this.f291c) {
                this.f292d = view;
            }
            this.f292d.d();
            C0042o c0042o = this.f291c;
            if (c0042o != null) {
                c0042o.f371a.close();
                removeView(this.f291c);
                this.f291c = null;
            }
            this.f293e = null;
            this.f295f0 = null;
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        E.e eVar;
        E.e eVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.k kVar = this.f298i0;
        if (Build.VERSION.SDK_INT < 26) {
            kVar.getClass();
            return;
        }
        K5.w wVar = kVar.f;
        if (wVar != null && kVar.f11667g != null && (eVar = wVar.j) != null) {
            HashMap hashMap = new HashMap();
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                K5.w wVar2 = (K5.w) kVar.f11667g.get(sparseArray.keyAt(i7));
                if (wVar2 != null && (eVar2 = wVar2.j) != null) {
                    textValue = com.dexterous.flutterlocalnotifications.b.g(sparseArray.valueAt(i7)).getTextValue();
                    String charSequence = textValue.toString();
                    K5.z zVar = new K5.z(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    String str = (String) eVar2.f920b;
                    if (str.equals((String) eVar.f920b)) {
                        kVar.f11668h.f(zVar);
                    } else {
                        hashMap.put(str, zVar);
                    }
                }
            }
            int i8 = kVar.f11666e.f335b;
            A.f fVar = kVar.f11665d;
            fVar.getClass();
            String.valueOf(hashMap.size());
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                K5.z zVar2 = (K5.z) entry.getValue();
                hashMap2.put((String) entry.getKey(), A.f.g(zVar2.f2758a, zVar2.f2759b, zVar2.f2760c, -1, -1));
            }
            ((L5.r) fVar.f10b).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i8), hashMap2), null);
        }
    }

    public final void b() {
        C0044q c0044q = this.f289a;
        if (c0044q != null) {
            addView(c0044q);
        } else {
            C0045s c0045s = this.f290b;
            if (c0045s != null) {
                addView(c0045s);
            } else {
                addView(this.f291c);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.o] */
    public final boolean c() {
        C5.c cVar = this.f295f0;
        if (cVar != null) {
            if (cVar.f554b == this.f292d.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        C5.c cVar = this.f295f0;
        if (cVar != null) {
            io.flutter.plugin.platform.o oVar = cVar.f568r;
            if (view == null) {
                oVar.getClass();
                return false;
            }
            HashMap hashMap = oVar.j;
            if (!hashMap.containsKey(view.getContext())) {
                return false;
            }
            View view2 = (View) hashMap.get(view.getContext());
            if (view2 == view) {
                return true;
            }
            return view2.checkInputConnectionProxy(view);
        }
        return super.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r1 != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.B.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if ((c() && this.f301l0.y(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.l lVar = this.q0;
        lVar.f11596a = f;
        lVar.f11609p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.m mVar = this.f295f0.f554b;
        mVar.getClass();
        if (lVar.f11597b > 0 && lVar.f11598c > 0 && lVar.f11596a > 0.0f) {
            ArrayList arrayList = lVar.f11610q;
            arrayList.size();
            ArrayList arrayList2 = lVar.f11611r;
            arrayList2.size();
            int size = arrayList2.size() + arrayList.size();
            int[] iArr = new int[size * 4];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i7);
                int i8 = i7 * 4;
                Rect rect = cVar.f11578a;
                iArr[i8] = rect.left;
                iArr[i8 + 1] = rect.top;
                iArr[i8 + 2] = rect.right;
                iArr[i8 + 3] = rect.bottom;
                iArr2[i7] = cVar.f11579b.encodedValue;
                iArr3[i7] = cVar.f11580c.encodedValue;
            }
            int size2 = arrayList.size() * 4;
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i9);
                int i10 = (i9 * 4) + size2;
                Rect rect2 = cVar2.f11578a;
                iArr[i10] = rect2.left;
                iArr[i10 + 1] = rect2.top;
                iArr[i10 + 2] = rect2.right;
                iArr[i10 + 3] = rect2.bottom;
                iArr2[arrayList.size() + i9] = cVar2.f11579b.encodedValue;
                iArr3[arrayList.size() + i9] = cVar2.f11580c.encodedValue;
            }
            mVar.f11612a.setViewportMetrics(lVar.f11596a, lVar.f11597b, lVar.f11598c, lVar.f11599d, lVar.f11600e, lVar.f, lVar.f11601g, lVar.f11602h, lVar.f11603i, lVar.j, lVar.f11604k, lVar.f11605l, lVar.f11606m, lVar.f11607n, lVar.f11608o, lVar.f11609p, iArr, iArr2, iArr3);
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.o oVar = this.f303n0;
        if (oVar != null && oVar.f12499c.isEnabled()) {
            return this.f303n0;
        }
        return null;
    }

    public C5.c getAttachedFlutterEngine() {
        return this.f295f0;
    }

    public L5.f getBinaryMessenger() {
        return this.f295f0.f555c;
    }

    public C0042o getCurrentImageSurface() {
        return this.f291c;
    }

    public io.flutter.embedding.engine.renderer.l getViewportMetrics() {
        return this.q0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b5, code lost:
        r14 = r14.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r14) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.B.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [I6.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        A.c cVar;
        super.onAttachedToWindow();
        try {
            l2.g gVar = l2.h.b0;
            Context context = getContext();
            gVar.getClass();
            cVar = new A.c(new t0(l2.g.a(context)), 2);
        } catch (NoClassDefFoundError unused) {
            cVar = null;
        }
        this.f305p0 = cVar;
        Activity k2 = H4.W.k(getContext());
        A.c cVar2 = this.f305p0;
        if (cVar2 != null && k2 != null) {
            this.f309u0 = new C0050x(this, 0);
            Executor executor = X.d.getMainExecutor(getContext());
            C0050x consumer = this.f309u0;
            t0 t0Var = (t0) cVar2.f4b;
            kotlin.jvm.internal.j.e(executor, "executor");
            kotlin.jvm.internal.j.e(consumer, "consumer");
            l2.b bVar = (l2.b) t0Var.f7209b;
            bVar.getClass();
            l2.j jVar = new l2.j(bVar, k2, null);
            n6.j jVar2 = n6.j.f14394a;
            I6.c cVar3 = new I6.c(jVar, jVar2, -2, H6.a.SUSPEND);
            M6.f fVar = F6.P.f1237a;
            x0 x0Var = K6.o.f2797a;
            if (x0Var.get(F6.C.f1216b) == null) {
                I6.c flow = cVar3;
                if (!x0Var.equals(jVar2)) {
                    flow = J6.l.a(cVar3, x0Var, 0, null, 6);
                }
                t0 t0Var2 = (t0) t0Var.f7210c;
                t0Var2.getClass();
                kotlin.jvm.internal.j.e(flow, "flow");
                ReentrantLock reentrantLock = (ReentrantLock) t0Var2.f7209b;
                reentrantLock.lock();
                LinkedHashMap linkedHashMap = (LinkedHashMap) t0Var2.f7210c;
                try {
                    if (linkedHashMap.get(consumer) == null) {
                        linkedHashMap.put(consumer, F6.H.q(F6.H.b(new C0081c0(executor)), null, new C1363a(flow, consumer, null), 3));
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            }
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + x0Var).toString());
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f295f0 != null) {
            this.f300k0.b(configuration);
            d();
            H4.W.b(getContext(), this.f295f0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r10) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.B.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0050x c0050x;
        A.c cVar = this.f305p0;
        if (cVar != null && (c0050x = this.f309u0) != null) {
            t0 t0Var = (t0) ((t0) cVar.f4b).f7210c;
            t0Var.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) t0Var.f7209b;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) t0Var.f7210c;
            try {
                InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) linkedHashMap.get(c0050x);
                if (interfaceC0091h0 != null) {
                    interfaceC0091h0.cancel(null);
                }
                InterfaceC0091h0 interfaceC0091h02 = (InterfaceC0091h0) linkedHashMap.remove(c0050x);
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f309u0 = null;
        this.f305p0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z7;
        if (c()) {
            C0028a c0028a = this.f302m0;
            Context context = getContext();
            c0028a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            if (motionEvent.getActionMasked() != 7 && motionEvent.getActionMasked() != 8) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (isFromSource && z7) {
                int b5 = C0028a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0028a.a(motionEvent, motionEvent.getActionIndex(), b5, 0, C0028a.f, allocateDirect, context);
                if (allocateDirect.position() % 288 == 0) {
                    c0028a.f343a.f11612a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                    return true;
                }
                throw new AssertionError("Packet position is not on field boundary.");
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f303n0.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i7);
        io.flutter.plugin.editing.k kVar = this.f298i0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (kVar.f11667g != null) {
                String str = (String) kVar.f.j.f920b;
                AutofillId autofillId = viewStructure.getAutofillId();
                for (int i8 = 0; i8 < kVar.f11667g.size(); i8++) {
                    int keyAt = kVar.f11667g.keyAt(i8);
                    E.e eVar = ((K5.w) kVar.f11667g.valueAt(i8)).j;
                    if (eVar != null) {
                        viewStructure.addChildCount(1);
                        ViewStructure newChild = viewStructure.newChild(i8);
                        newChild.setAutofillId(autofillId, keyAt);
                        String[] strArr = (String[]) eVar.f921c;
                        if (strArr.length > 0) {
                            newChild.setAutofillHints(strArr);
                        }
                        newChild.setAutofillType(1);
                        newChild.setVisibility(0);
                        String str2 = (String) eVar.f923e;
                        if (str2 != null) {
                            newChild.setHint(str2);
                        }
                        if (str.hashCode() == keyAt && (rect = kVar.f11671l) != null) {
                            newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), kVar.f11671l.height());
                            newChild.setAutofillValue(AutofillValue.forText(kVar.f11668h));
                        } else {
                            newChild.setDimens(0, 0, 0, 0, 1, 1);
                            newChild.setAutofillValue(AutofillValue.forText(((K5.z) eVar.f922d).f2758a));
                        }
                    }
                }
                return;
            }
            return;
        }
        kVar.getClass();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        io.flutter.embedding.engine.renderer.l lVar = this.q0;
        lVar.f11597b = i7;
        lVar.f11598c = i8;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f302m0.d(motionEvent, C0028a.f);
        return true;
    }

    public void setDelegate(D d7) {
        this.f310v0 = d7;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        View view = this.f292d;
        if (view instanceof C0044q) {
            ((C0044q) view).setVisibility(i7);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Object] */
    public void setWindowInfoListenerDisplayFeatures(l2.k kVar) {
        l2.b bVar;
        io.flutter.embedding.engine.renderer.e eVar;
        io.flutter.embedding.engine.renderer.d dVar;
        ?? r62 = kVar.f13840a;
        ArrayList arrayList = new ArrayList();
        for (l2.c cVar : r62) {
            cVar.f13821a.c().toString();
            C1102b c1102b = cVar.f13821a;
            int b5 = c1102b.b();
            l2.b bVar2 = l2.b.f13817d;
            if (b5 != 0 && c1102b.a() != 0) {
                bVar = bVar2;
            } else {
                bVar = l2.b.f13816c;
            }
            if (bVar == bVar2) {
                eVar = io.flutter.embedding.engine.renderer.e.HINGE;
            } else {
                eVar = io.flutter.embedding.engine.renderer.e.FOLD;
            }
            l2.b bVar3 = l2.b.f13818e;
            l2.b bVar4 = cVar.f13823c;
            if (bVar4 == bVar3) {
                dVar = io.flutter.embedding.engine.renderer.d.POSTURE_FLAT;
            } else if (bVar4 == l2.b.f) {
                dVar = io.flutter.embedding.engine.renderer.d.POSTURE_HALF_OPENED;
            } else {
                dVar = io.flutter.embedding.engine.renderer.d.UNKNOWN;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(c1102b.c(), eVar, dVar));
        }
        ArrayList arrayList2 = this.q0.f11610q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [B5.D, java.lang.Object] */
    public B(AbstractActivityC0032e abstractActivityC0032e, C0045s c0045s) {
        super(abstractActivityC0032e, null);
        this.f = new HashSet();
        this.f296g0 = new HashSet();
        this.q0 = new io.flutter.embedding.engine.renderer.l();
        this.f306r0 = new A.m(this, 1);
        this.f307s0 = new y(this, new Handler(Looper.getMainLooper()));
        this.f308t0 = new C0033f(this, 2);
        this.f310v0 = new Object();
        this.f290b = c0045s;
        this.f292d = c0045s;
        b();
    }
}
