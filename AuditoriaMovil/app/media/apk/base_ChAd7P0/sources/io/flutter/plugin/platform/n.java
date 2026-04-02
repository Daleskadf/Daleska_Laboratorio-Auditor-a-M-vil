package io.flutter.plugin.platform;

import B5.AbstractActivityC0032e;
import D.AbstractC0059i;
import H4.W;
import X5.E;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class n implements i {

    /* renamed from: a  reason: collision with root package name */
    public Object f11714a;

    public /* synthetic */ n(Object obj) {
        this.f11714a = obj;
    }

    @Override // io.flutter.plugin.platform.i
    public void a(int i7, int i8) {
        ((TextureRegistry$SurfaceProducer) this.f11714a).setSize(i7, i8);
    }

    @Override // io.flutter.plugin.platform.i
    public long b() {
        return ((TextureRegistry$SurfaceProducer) this.f11714a).id();
    }

    public void c(int i7) {
        View view;
        o oVar = (o) this.f11714a;
        if (oVar.m(i7)) {
            view = ((A) oVar.f11723i.get(Integer.valueOf(i7))).a();
        } else {
            g gVar = (g) oVar.f11724k.get(i7);
            if (gVar == null) {
                Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i7);
                return;
            }
            view = gVar.getView();
        }
        if (view == null) {
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i7);
            return;
        }
        view.clearFocus();
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [io.flutter.plugin.platform.l] */
    public long d(final K5.o oVar) {
        j jVar;
        long j;
        final o oVar2 = (o) this.f11714a;
        o.a(oVar2, oVar);
        SparseArray sparseArray = oVar2.f11727n;
        int i7 = oVar.f2707a;
        if (sparseArray.get(i7) == null) {
            if (oVar2.f11720e != null) {
                if (oVar2.f11719d != null) {
                    g b5 = oVar2.b(oVar, true);
                    View view = b5.getView();
                    if (view.getParent() == null) {
                        boolean L6 = W.L(view, new E(o.f11715w, 4));
                        double d7 = oVar.f2710d;
                        double d8 = oVar.f2709c;
                        if (L6) {
                            if (oVar.f2713h == K5.n.TEXTURE_WITH_HYBRID_FALLBACK) {
                                o.d(19);
                                return -2L;
                            } else if (!oVar2.f11734u) {
                                o.d(20);
                                i i8 = o.i(oVar2.f11720e);
                                int l8 = oVar2.l(d8);
                                int l9 = oVar2.l(d7);
                                Activity activity = oVar2.f11718c;
                                ?? r13 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
                                    @Override // android.view.View.OnFocusChangeListener
                                    public final void onFocusChange(View view2, boolean z7) {
                                        switch (r3) {
                                            case 0:
                                                K5.o oVar3 = oVar;
                                                o oVar4 = oVar2;
                                                int i9 = oVar3.f2707a;
                                                if (z7) {
                                                    L5.r rVar = (L5.r) oVar4.f11721g.f10b;
                                                    if (rVar != null) {
                                                        rVar.a("viewFocused", Integer.valueOf(i9), null);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                io.flutter.plugin.editing.k kVar = oVar4.f;
                                                if (kVar != null) {
                                                    kVar.b(i9);
                                                    return;
                                                }
                                                return;
                                            default:
                                                o oVar5 = oVar2;
                                                if (z7) {
                                                    A.f fVar = oVar5.f11721g;
                                                    K5.o oVar6 = oVar;
                                                    L5.r rVar2 = (L5.r) fVar.f10b;
                                                    if (rVar2 != null) {
                                                        rVar2.a("viewFocused", Integer.valueOf(oVar6.f2707a), null);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                oVar5.getClass();
                                                return;
                                        }
                                    }
                                };
                                w wVar = A.f11675i;
                                A a7 = null;
                                if (l8 != 0 && l9 != 0) {
                                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                                    i8.a(l8, l9);
                                    StringBuilder sb = new StringBuilder("flutter-vd#");
                                    int i9 = oVar.f2707a;
                                    sb.append(i9);
                                    VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), l8, l9, displayMetrics.densityDpi, i8.getSurface(), 0, A.f11675i, null);
                                    if (createVirtualDisplay != null) {
                                        a7 = new A(activity, oVar2.f11722h, createVirtualDisplay, b5, i8, r13, i9);
                                    }
                                }
                                if (a7 != null) {
                                    oVar2.f11723i.put(Integer.valueOf(i7), a7);
                                    View view2 = b5.getView();
                                    oVar2.j.put(view2.getContext(), view2);
                                    return i8.b();
                                }
                                throw new IllegalStateException("Failed creating virtual display for a " + oVar.f2708b + " with id: " + i7);
                            }
                        }
                        o.d(23);
                        int l10 = oVar2.l(d8);
                        int l11 = oVar2.l(d7);
                        if (oVar2.f11734u) {
                            jVar = new j(oVar2.f11718c);
                            j = -1;
                        } else {
                            i i10 = o.i(oVar2.f11720e);
                            j jVar2 = new j(oVar2.f11718c);
                            jVar2.f = i10;
                            Surface surface = i10.getSurface();
                            if (surface != null) {
                                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                                try {
                                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                } finally {
                                    surface.unlockCanvasAndPost(lockHardwareCanvas);
                                }
                            }
                            long b7 = i10.b();
                            jVar = jVar2;
                            j = b7;
                        }
                        jVar.setTouchProcessor(oVar2.f11717b);
                        i iVar = jVar.f;
                        if (iVar != null) {
                            iVar.a(l10, l11);
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l10, l11);
                        int l12 = oVar2.l(oVar.f2711e);
                        int l13 = oVar2.l(oVar.f);
                        layoutParams.topMargin = l12;
                        layoutParams.leftMargin = l13;
                        jVar.setLayoutParams(layoutParams);
                        View view3 = b5.getView();
                        view3.setLayoutParams(new FrameLayout.LayoutParams(l10, l11));
                        view3.setImportantForAccessibility(4);
                        jVar.addView(view3);
                        jVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view22, boolean z7) {
                                switch (r3) {
                                    case 0:
                                        K5.o oVar3 = oVar;
                                        o oVar4 = oVar2;
                                        int i92 = oVar3.f2707a;
                                        if (z7) {
                                            L5.r rVar = (L5.r) oVar4.f11721g.f10b;
                                            if (rVar != null) {
                                                rVar.a("viewFocused", Integer.valueOf(i92), null);
                                                return;
                                            }
                                            return;
                                        }
                                        io.flutter.plugin.editing.k kVar = oVar4.f;
                                        if (kVar != null) {
                                            kVar.b(i92);
                                            return;
                                        }
                                        return;
                                    default:
                                        o oVar5 = oVar2;
                                        if (z7) {
                                            A.f fVar = oVar5.f11721g;
                                            K5.o oVar6 = oVar;
                                            L5.r rVar2 = (L5.r) fVar.f10b;
                                            if (rVar2 != null) {
                                                rVar2.a("viewFocused", Integer.valueOf(oVar6.f2707a), null);
                                                return;
                                            }
                                            return;
                                        }
                                        oVar5.getClass();
                                        return;
                                }
                            }
                        });
                        oVar2.f11719d.addView(jVar);
                        sparseArray.append(i7, jVar);
                        return j;
                    }
                    throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                }
                throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(i7, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
            }
            throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(i7, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(i7, "Trying to create an already created platform view, view id: "));
    }

    public void e(int i7) {
        G5.a aVar;
        G5.a aVar2;
        o oVar = (o) this.f11714a;
        g gVar = (g) oVar.f11724k.get(i7);
        if (gVar == null) {
            Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i7);
            return;
        }
        if (gVar.getView() != null) {
            View view = gVar.getView();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        oVar.f11724k.remove(i7);
        try {
            gVar.a();
        } catch (RuntimeException e7) {
            Log.e("PlatformViewsController", "Disposing platform view threw an exception", e7);
        }
        if (oVar.m(i7)) {
            HashMap hashMap = oVar.f11723i;
            A a7 = (A) hashMap.get(Integer.valueOf(i7));
            View a8 = a7.a();
            if (a8 != null) {
                oVar.j.remove(a8.getContext());
            }
            a7.f11676a.cancel();
            a7.f11676a.detachState();
            a7.f11682h.release();
            a7.f.release();
            hashMap.remove(Integer.valueOf(i7));
            return;
        }
        SparseArray sparseArray = oVar.f11727n;
        j jVar = (j) sparseArray.get(i7);
        if (jVar != null) {
            jVar.removeAllViews();
            i iVar = jVar.f;
            if (iVar != null) {
                iVar.release();
                jVar.f = null;
            }
            ViewTreeObserver viewTreeObserver = jVar.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (aVar2 = jVar.f11704e0) != null) {
                jVar.f11704e0 = null;
                viewTreeObserver.removeOnGlobalFocusChangeListener(aVar2);
            }
            ViewGroup viewGroup2 = (ViewGroup) jVar.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(jVar);
            }
            sparseArray.remove(i7);
            return;
        }
        SparseArray sparseArray2 = oVar.f11725l;
        G5.b bVar = (G5.b) sparseArray2.get(i7);
        if (bVar != null) {
            bVar.removeAllViews();
            ViewTreeObserver viewTreeObserver2 = bVar.getViewTreeObserver();
            if (viewTreeObserver2.isAlive() && (aVar = bVar.f1602f0) != null) {
                bVar.f1602f0 = null;
                viewTreeObserver2.removeOnGlobalFocusChangeListener(aVar);
            }
            ViewGroup viewGroup3 = (ViewGroup) bVar.getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(bVar);
            }
            sparseArray2.remove(i7);
        }
    }

    public CharSequence f(K5.g gVar) {
        AbstractActivityC0032e abstractActivityC0032e = (AbstractActivityC0032e) ((B.a) this.f11714a).f224b;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0032e.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (gVar != null && gVar != K5.g.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        Uri uri = itemAt.getUri();
                        if (uri == null) {
                            Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                        } else {
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            } else {
                                AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0032e.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                                CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0032e);
                                if (openTypedAssetFileDescriptor != null) {
                                    try {
                                        openTypedAssetFileDescriptor.close();
                                    } catch (IOException e7) {
                                        charSequence = coerceToText;
                                        e = e7;
                                        Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                        return charSequence;
                                    }
                                }
                                charSequence = coerceToText;
                            }
                        }
                        return charSequence;
                    } catch (IOException e8) {
                        e = e8;
                        charSequence = text;
                    }
                } else {
                    return text;
                }
            } catch (IOException e9) {
                e = e9;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e10) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e10);
            return null;
        }
    }

    public void g(int i7, double d7, double d8) {
        o oVar = (o) this.f11714a;
        if (oVar.m(i7)) {
            return;
        }
        j jVar = (j) oVar.f11727n.get(i7);
        if (jVar == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i7);
            return;
        }
        int l8 = oVar.l(d7);
        int l9 = oVar.l(d8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
        layoutParams.topMargin = l8;
        layoutParams.leftMargin = l9;
        jVar.setLayoutParams(layoutParams);
    }

    @Override // io.flutter.plugin.platform.i
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f11714a).getHeight();
    }

    @Override // io.flutter.plugin.platform.i
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f11714a).getSurface();
    }

    @Override // io.flutter.plugin.platform.i
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f11714a).getWidth();
    }

    public void h(K5.q qVar) {
        o oVar = (o) this.f11714a;
        float f = oVar.f11718c.getResources().getDisplayMetrics().density;
        int i7 = qVar.f2718a;
        if (oVar.m(i7)) {
            MotionEvent k2 = oVar.k(f, qVar, true);
            SingleViewPresentation singleViewPresentation = ((A) oVar.f11723i.get(Integer.valueOf(i7))).f11676a;
            if (singleViewPresentation != null) {
                singleViewPresentation.dispatchTouchEvent(k2);
                return;
            }
            return;
        }
        g gVar = (g) oVar.f11724k.get(i7);
        if (gVar == null) {
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i7);
            return;
        }
        View view = gVar.getView();
        if (view == null) {
            Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i7);
            return;
        }
        view.dispatchTouchEvent(oVar.k(f, qVar, false));
    }

    public void i(String str, h hVar) {
        HashMap hashMap = (HashMap) this.f11714a;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, hVar);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.m, java.lang.Runnable] */
    public void j(K5.p pVar, final K5.m mVar) {
        i iVar;
        o oVar = (o) this.f11714a;
        int l8 = oVar.l(pVar.f2716b);
        int l9 = oVar.l(pVar.f2717c);
        int i7 = pVar.f2715a;
        if (oVar.m(i7)) {
            final float f = oVar.f();
            final A a7 = (A) oVar.f11723i.get(Integer.valueOf(i7));
            io.flutter.plugin.editing.k kVar = oVar.f;
            if (kVar != null) {
                if (((io.flutter.plugin.editing.j) kVar.f11666e.f336c) == io.flutter.plugin.editing.j.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                    kVar.f11674o = true;
                }
                SingleViewPresentation singleViewPresentation = a7.f11676a;
                if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                    a7.f11676a.getView().getClass();
                }
            }
            ?? r32 = new Runnable() { // from class: io.flutter.plugin.platform.m
                @Override // java.lang.Runnable
                public final void run() {
                    float f4;
                    o oVar2 = (o) n.this.f11714a;
                    io.flutter.plugin.editing.k kVar2 = oVar2.f;
                    A a8 = a7;
                    if (kVar2 != null) {
                        if (((io.flutter.plugin.editing.j) kVar2.f11666e.f336c) == io.flutter.plugin.editing.j.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                            kVar2.f11674o = false;
                        }
                        SingleViewPresentation singleViewPresentation2 = a8.f11676a;
                        if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                            a8.f11676a.getView().getClass();
                        }
                    }
                    if (oVar2.f11718c == null) {
                        f4 = f;
                    } else {
                        f4 = oVar2.f();
                    }
                    double d7 = f4;
                    K5.r rVar = mVar.f2706b;
                    HashMap hashMap = new HashMap();
                    hashMap.put("width", Double.valueOf((int) Math.round(a8.f.getWidth() / d7)));
                    hashMap.put("height", Double.valueOf((int) Math.round(a8.f.getHeight() / d7)));
                    rVar.a(hashMap);
                }
            };
            int width = a7.f.getWidth();
            i iVar2 = a7.f;
            if (l8 == width && l9 == iVar2.getHeight()) {
                a7.a().postDelayed(r32, 0L);
                return;
            } else if (Build.VERSION.SDK_INT >= 31) {
                View a8 = a7.a();
                iVar2.a(l8, l9);
                a7.f11682h.resize(l8, l9, a7.f11679d);
                a7.f11682h.setSurface(iVar2.getSurface());
                a8.postDelayed(r32, 0L);
                return;
            } else {
                boolean isFocused = a7.a().isFocused();
                t detachState = a7.f11676a.detachState();
                a7.f11682h.setSurface(null);
                a7.f11682h.release();
                DisplayManager displayManager = (DisplayManager) a7.f11677b.getSystemService("display");
                iVar2.a(l8, l9);
                a7.f11682h = displayManager.createVirtualDisplay("flutter-vd#" + a7.f11680e, l8, l9, a7.f11679d, iVar2.getSurface(), 0, A.f11675i, null);
                View a9 = a7.a();
                a9.addOnAttachStateChangeListener(new y(a9, (m) r32));
                SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(a7.f11677b, a7.f11682h.getDisplay(), a7.f11678c, detachState, a7.f11681g, isFocused);
                singleViewPresentation2.show();
                a7.f11676a.cancel();
                a7.f11676a = singleViewPresentation2;
                return;
            }
        }
        g gVar = (g) oVar.f11724k.get(i7);
        j jVar = (j) oVar.f11727n.get(i7);
        if (gVar != null && jVar != null) {
            if ((l8 > jVar.getRenderTargetWidth() || l9 > jVar.getRenderTargetHeight()) && (iVar = jVar.f) != null) {
                iVar.a(l8, l9);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = l8;
            layoutParams.height = l9;
            jVar.setLayoutParams(layoutParams);
            View view = gVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = l8;
                layoutParams2.height = l9;
                view.setLayoutParams(layoutParams2);
            }
            int round = (int) Math.round(jVar.getRenderTargetWidth() / oVar.f());
            K5.r rVar = mVar.f2706b;
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(round));
            hashMap.put("height", Double.valueOf((int) Math.round(jVar.getRenderTargetHeight() / oVar.f())));
            rVar.a(hashMap);
            return;
        }
        Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i7);
    }

    public void k(int i7, int i8) {
        View view;
        if (i8 != 0 && i8 != 1) {
            throw new IllegalStateException(AbstractC0059i.y("Trying to set unknown direction value: ", i8, "(view id: ", i7, ")"));
        }
        o oVar = (o) this.f11714a;
        if (oVar.m(i7)) {
            view = ((A) oVar.f11723i.get(Integer.valueOf(i7))).a();
        } else {
            g gVar = (g) oVar.f11724k.get(i7);
            if (gVar == null) {
                Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i7);
                return;
            }
            view = gVar.getView();
        }
        if (view == null) {
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i7);
            return;
        }
        view.setLayoutDirection(i8);
    }

    public void l(ArrayList arrayList) {
        int i7;
        B.a aVar = (B.a) this.f11714a;
        aVar.getClass();
        if (arrayList.size() == 0) {
            i7 = 5894;
        } else {
            i7 = 1798;
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            int i9 = f.f11696b[((K5.l) arrayList.get(i8)).ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    i7 &= -515;
                }
            } else {
                i7 &= -5;
            }
        }
        aVar.f223a = i7;
        aVar.i();
    }

    public void m(K5.k kVar) {
        int i7;
        B.a aVar = (B.a) this.f11714a;
        aVar.getClass();
        if (kVar == K5.k.LEAN_BACK) {
            i7 = 1798;
        } else if (kVar == K5.k.IMMERSIVE) {
            i7 = 3846;
        } else if (kVar == K5.k.IMMERSIVE_STICKY) {
            i7 = 5894;
        } else if (kVar == K5.k.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
            i7 = 1792;
        } else {
            return;
        }
        aVar.f223a = i7;
        aVar.i();
    }

    public void n(K5.i iVar) {
        View decorView = ((AbstractActivityC0032e) ((B.a) this.f11714a).f224b).getWindow().getDecorView();
        int i7 = f.f11695a[iVar.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 == 5) {
                            decorView.performHapticFeedback(4);
                            return;
                        }
                        return;
                    }
                    decorView.performHapticFeedback(6);
                    return;
                }
                decorView.performHapticFeedback(3);
                return;
            }
            decorView.performHapticFeedback(1);
            return;
        }
        decorView.performHapticFeedback(0);
    }

    @Override // io.flutter.plugin.platform.i
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f11714a).release();
        this.f11714a = null;
    }

    @Override // io.flutter.plugin.platform.i
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f11714a).scheduleFrame();
    }
}
