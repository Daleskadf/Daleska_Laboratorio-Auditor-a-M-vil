package x5;

import B5.AbstractActivityC0032e;
import B5.S;
import D.C0060j;
import D.C0070u;
import D.C0075z;
import D.J;
import D.j0;
import D.y0;
import W.AbstractC0359b;
import X5.C0389o;
import X5.E;
import a.AbstractC0412a;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Trace;
import android.util.Size;
import androidx.camera.core.impl.C0498a0;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.impl.M;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.g0;
import androidx.camera.core.impl.h0;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import b3.C0585f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g5.C1010b;
import g5.C1011c;
import g5.InterfaceC1009a;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import k5.C1401d;
import l0.C1411b;
import l5.C1423a;
import m6.AbstractC1447h;
import p.C1608t;
import t2.C1810a;
import y5.EnumC2037b;
/* renamed from: x5.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2014p implements L5.p {

    /* renamed from: X  reason: collision with root package name */
    public K5.r f16555X;

    /* renamed from: Y  reason: collision with root package name */
    public L5.r f16556Y;

    /* renamed from: Z  reason: collision with root package name */
    public L5.j f16557Z;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractActivityC0032e f16558a;

    /* renamed from: b  reason: collision with root package name */
    public final j7.e f16559b;

    /* renamed from: c  reason: collision with root package name */
    public final A.l f16560c;

    /* renamed from: d  reason: collision with root package name */
    public final C2005g f16561d;

    /* renamed from: e  reason: collision with root package name */
    public final C2011m f16562e;

    /* renamed from: e0  reason: collision with root package name */
    public C2010l f16563e0;
    public final C2011m f;

    /* renamed from: f0  reason: collision with root package name */
    public final C2011m f16564f0;

    /* renamed from: g0  reason: collision with root package name */
    public final C2011m f16565g0;

    public C2014p(AbstractActivityC0032e activity, j7.e eVar, L5.f binaryMessenger, A.l lVar, C2005g c2005g, io.flutter.embedding.engine.renderer.m textureRegistry) {
        kotlin.jvm.internal.j.e(activity, "activity");
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        kotlin.jvm.internal.j.e(textureRegistry, "textureRegistry");
        this.f16558a = activity;
        this.f16559b = eVar;
        this.f16560c = lVar;
        this.f16561d = c2005g;
        this.f16562e = new C2011m(this, 0);
        this.f = new C2011m(this, 1);
        C2012n c2012n = new C2012n(this);
        C2011m c2011m = new C2011m(this, 2);
        this.f16564f0 = new C2011m(this, 3);
        this.f16565g0 = new C2011m(this, 4);
        L5.r rVar = new L5.r(binaryMessenger, "dev.steenbakker.mobile_scanner/scanner/method");
        this.f16556Y = rVar;
        rVar.b(this);
        C2003e c2003e = new C2003e(activity);
        L5.j jVar = new L5.j(binaryMessenger, "dev.steenbakker.mobile_scanner/scanner/deviceOrientation");
        this.f16557Z = jVar;
        jVar.a(c2003e);
        this.f16563e0 = new C2010l(activity, textureRegistry, c2012n, c2011m, c2003e);
    }

    public final C1010b a(List list, boolean z7) {
        S s7;
        EnumC2037b enumC2037b;
        if (list == null) {
            s7 = new S(8, (byte) 0);
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                EnumC2037b.Companion.getClass();
                if (intValue != -1) {
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                switch (intValue) {
                                    case 4:
                                        enumC2037b = EnumC2037b.CODE_93;
                                        continue;
                                    case 8:
                                        enumC2037b = EnumC2037b.CODABAR;
                                        continue;
                                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                                        enumC2037b = EnumC2037b.DATA_MATRIX;
                                        continue;
                                    case RecognitionOptions.EAN_13 /* 32 */:
                                        enumC2037b = EnumC2037b.EAN_13;
                                        continue;
                                    case RecognitionOptions.EAN_8 /* 64 */:
                                        enumC2037b = EnumC2037b.EAN_8;
                                        continue;
                                    case RecognitionOptions.ITF /* 128 */:
                                        enumC2037b = EnumC2037b.ITF;
                                        continue;
                                    case RecognitionOptions.QR_CODE /* 256 */:
                                        enumC2037b = EnumC2037b.QR_CODE;
                                        continue;
                                    case RecognitionOptions.UPC_A /* 512 */:
                                        enumC2037b = EnumC2037b.UPC_A;
                                        continue;
                                    case RecognitionOptions.UPC_E /* 1024 */:
                                        enumC2037b = EnumC2037b.UPC_E;
                                        continue;
                                    case RecognitionOptions.PDF417 /* 2048 */:
                                        enumC2037b = EnumC2037b.PDF417;
                                        continue;
                                    case RecognitionOptions.AZTEC /* 4096 */:
                                        enumC2037b = EnumC2037b.AZTEC;
                                        continue;
                                    default:
                                        enumC2037b = EnumC2037b.UNKNOWN;
                                        continue;
                                }
                            } else {
                                enumC2037b = EnumC2037b.CODE_39;
                            }
                        } else {
                            enumC2037b = EnumC2037b.CODE_128;
                        }
                    } else {
                        enumC2037b = EnumC2037b.ALL_FORMATS;
                    }
                } else {
                    enumC2037b = EnumC2037b.UNKNOWN;
                }
                arrayList.add(Integer.valueOf(enumC2037b.a()));
            }
            if (arrayList.size() == 1) {
                s7 = new S(8, (byte) 0);
                s7.f335b = ((Number) AbstractC1447h.O(arrayList)).intValue();
            } else {
                s7 = new S(8, (byte) 0);
                int intValue2 = ((Number) AbstractC1447h.O(arrayList)).intValue();
                int[] X7 = AbstractC1447h.X(arrayList.subList(1, arrayList.size()));
                int[] copyOf = Arrays.copyOf(X7, X7.length);
                s7.f335b = intValue2;
                if (copyOf != null) {
                    for (int i7 : copyOf) {
                        s7.f335b = i7 | s7.f335b;
                    }
                }
            }
        }
        if (z7) {
            E e7 = new E(this, 28);
            Object systemService = this.f16558a.getSystemService("camera");
            kotlin.jvm.internal.j.c(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) systemService;
            float f = 1.0f;
            try {
                String[] cameraIdList = cameraManager.getCameraIdList();
                kotlin.jvm.internal.j.d(cameraIdList, "cameraManager.cameraIdList");
                for (String str : cameraIdList) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    kotlin.jvm.internal.j.d(cameraCharacteristics, "cameraManager.getCameraCharacteristics(cameraId)");
                    Float f4 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
                    if (f4 != null && f4.floatValue() > f) {
                        f = f4.floatValue();
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            s7.f336c = new C1011c(e7, f);
        }
        return new C1010b(s7.f335b, (C1011c) s7.f336c);
    }

    @Override // L5.p
    public final void onMethodCall(L5.o call, L5.q qVar) {
        R.b bVar;
        Object obj;
        boolean booleanValue;
        boolean z7;
        final boolean booleanValue2;
        int intValue;
        boolean booleanValue3;
        int intValue2;
        int intValue3;
        boolean booleanValue4;
        final Size size;
        boolean booleanValue5;
        C0070u c0070u;
        y5.c detectionSpeed;
        h0 h0Var;
        U.l lVar;
        int i7 = 2;
        boolean z8 = false;
        boolean z9 = true;
        kotlin.jvm.internal.j.e(call, "call");
        String str = call.f3038a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1688013509:
                    if (str.equals("resetScale")) {
                        try {
                            C2010l c2010l = this.f16563e0;
                            kotlin.jvm.internal.j.b(c2010l);
                            R.b bVar2 = c2010l.f16537h;
                            if (bVar2 != null) {
                                g0 g0Var = bVar2.f4508c.f2103k0;
                                if (g0Var != null) {
                                    g0Var.m(1.0f);
                                }
                                ((K5.r) qVar).a(null);
                                return;
                            }
                            throw new Exception();
                        } catch (C2019u unused) {
                            ((K5.r) qVar).b(null, "MOBILE_SCANNER_SET_SCALE_WHEN_STOPPED_ERROR", "The zoom scale cannot be changed when the camera is stopped.");
                            return;
                        }
                    }
                    break;
                case -655811320:
                    if (str.equals("toggleTorch")) {
                        C2010l c2010l2 = this.f16563e0;
                        if (c2010l2 != null && (bVar = c2010l2.f16537h) != null) {
                            I.g gVar = bVar.f4508c;
                            if (gVar.f2104l0.f7630b.f()) {
                                Integer num = (Integer) gVar.f2104l0.f7630b.d().d();
                                g0 g0Var2 = gVar.f2103k0;
                                if (num != null && num.intValue() == 0) {
                                    g0Var2.B(true);
                                } else if (num != null && num.intValue() == 1) {
                                    g0Var2.B(false);
                                }
                            }
                        }
                        ((K5.r) qVar).a(null);
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        Boolean bool = (Boolean) call.a("force");
                        if (bool != null) {
                            z8 = bool.booleanValue();
                        }
                        try {
                            C2010l c2010l3 = this.f16563e0;
                            kotlin.jvm.internal.j.b(c2010l3);
                            c2010l3.c(z8);
                            obj = null;
                        } catch (C2001c unused2) {
                            obj = null;
                        }
                        try {
                            ((K5.r) qVar).a(null);
                            return;
                        } catch (C2001c unused3) {
                            ((K5.r) qVar).a(obj);
                            return;
                        }
                    }
                    break;
                case 16698223:
                    if (str.equals("analyzeImage")) {
                        this.f16555X = (K5.r) qVar;
                        Object a7 = call.a("filePath");
                        kotlin.jvm.internal.j.b(a7);
                        C2010l c2010l4 = this.f16563e0;
                        kotlin.jvm.internal.j.b(c2010l4);
                        Uri fromFile = Uri.fromFile(new File((String) a7));
                        kotlin.jvm.internal.j.d(fromFile, "fromFile(File(filePath))");
                        C1010b a8 = a((List) call.a("formats"), false);
                        C2011m c2011m = this.f;
                        C2011m c2011m2 = this.f16562e;
                        try {
                            C1423a a9 = C1423a.a(c2010l4.f16531a, fromFile);
                            C1401d c1401d = (C1401d) ((InterfaceC1009a) c2010l4.f.invoke(a8));
                            c1401d.b(a9).addOnSuccessListener(new C1411b(new E6.l(c2011m, 9), 7)).addOnFailureListener(new t2.c(c2011m2, 2)).addOnCompleteListener(new C1810a(c1401d, 1));
                            return;
                        } catch (IOException unused4) {
                            c2011m2.invoke("The provided file is not an image.");
                            return;
                        }
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        Boolean bool2 = (Boolean) call.a("force");
                        if (bool2 == null) {
                            booleanValue = false;
                        } else {
                            booleanValue = bool2.booleanValue();
                        }
                        try {
                            C2010l c2010l5 = this.f16563e0;
                            kotlin.jvm.internal.j.b(c2010l5);
                            if (!booleanValue) {
                                if (!c2010l5.f16548t) {
                                    if (c2010l5.f16537h == null && c2010l5.f16538i == null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        throw new Exception();
                                    }
                                } else {
                                    throw new Exception();
                                }
                            }
                            C2003e c2003e = c2010l5.f16535e;
                            if (c2003e.f16510d) {
                                c2003e.f16507a.unregisterReceiver(c2003e);
                                c2003e.f16510d = false;
                            }
                            R.e eVar = c2010l5.f16536g;
                            if (eVar != null) {
                                eVar.g();
                            }
                            c2010l5.f16548t = true;
                            ((K5.r) qVar).a(null);
                            return;
                        } catch (Exception e7) {
                            if (!(e7 instanceof C1999a)) {
                                z9 = e7 instanceof C2001c;
                            }
                            if (z9) {
                                ((K5.r) qVar).a(null);
                                return;
                            }
                            throw e7;
                        }
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        Boolean bool3 = (Boolean) call.a("torch");
                        if (bool3 == null) {
                            booleanValue2 = false;
                        } else {
                            booleanValue2 = bool3.booleanValue();
                        }
                        Integer num2 = (Integer) call.a("facing");
                        if (num2 == null) {
                            intValue = 0;
                        } else {
                            intValue = num2.intValue();
                        }
                        List list = (List) call.a("formats");
                        Boolean bool4 = (Boolean) call.a("returnImage");
                        if (bool4 == null) {
                            booleanValue3 = false;
                        } else {
                            booleanValue3 = bool4.booleanValue();
                        }
                        Integer num3 = (Integer) call.a("speed");
                        if (num3 == null) {
                            intValue2 = 1;
                        } else {
                            intValue2 = num3.intValue();
                        }
                        Integer num4 = (Integer) call.a("timeout");
                        if (num4 == null) {
                            intValue3 = 250;
                        } else {
                            intValue3 = num4.intValue();
                        }
                        List list2 = (List) call.a("cameraResolution");
                        Boolean bool5 = (Boolean) call.a("autoZoom");
                        if (bool5 == null) {
                            booleanValue4 = false;
                        } else {
                            booleanValue4 = bool5.booleanValue();
                        }
                        if (list2 != null) {
                            size = new Size(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
                        } else {
                            size = null;
                        }
                        Boolean bool6 = (Boolean) call.a("invertImage");
                        if (bool6 == null) {
                            booleanValue5 = false;
                        } else {
                            booleanValue5 = bool6.booleanValue();
                        }
                        C1010b a10 = a(list, booleanValue4);
                        if (intValue == 0) {
                            c0070u = C0070u.f779b;
                        } else {
                            c0070u = C0070u.f780c;
                        }
                        final C0070u c0070u2 = c0070u;
                        kotlin.jvm.internal.j.d(c0070u2, "if (facing == 0) CameraS…ector.DEFAULT_BACK_CAMERA");
                        if (intValue2 != 0) {
                            if (intValue2 != 1) {
                                detectionSpeed = y5.c.UNRESTRICTED;
                            } else {
                                detectionSpeed = y5.c.NORMAL;
                            }
                        } else {
                            detectionSpeed = y5.c.NO_DUPLICATES;
                        }
                        final C2010l c2010l6 = this.f16563e0;
                        kotlin.jvm.internal.j.b(c2010l6);
                        final C2011m c2011m3 = this.f16564f0;
                        final C2011m c2011m4 = this.f16565g0;
                        K5.r rVar = (K5.r) qVar;
                        final C2013o c2013o = new C2013o(rVar, 0);
                        final C2013o c2013o2 = new C2013o(rVar, 1);
                        kotlin.jvm.internal.j.e(detectionSpeed, "detectionSpeed");
                        c2010l6.f16545q = detectionSpeed;
                        c2010l6.f16546r = intValue3;
                        c2010l6.f16547s = booleanValue3;
                        c2010l6.f16544p = booleanValue5;
                        R.b bVar3 = c2010l6.f16537h;
                        if (bVar3 != null) {
                            h0Var = bVar3.f4508c.f2104l0;
                        } else {
                            h0Var = null;
                        }
                        if (h0Var != null && c2010l6.f16538i != null && c2010l6.j != null && !c2010l6.f16548t) {
                            c2013o2.invoke(new Exception());
                            return;
                        }
                        c2010l6.f16540l = null;
                        c2010l6.f16539k = (InterfaceC1009a) c2010l6.f.invoke(a10);
                        R.e eVar2 = R.e.f4513h;
                        AbstractActivityC0032e context = c2010l6.f16531a;
                        kotlin.jvm.internal.j.e(context, "context");
                        R.e eVar3 = R.e.f4513h;
                        synchronized (eVar3.f4514a) {
                            lVar = eVar3.f4516c;
                            if (lVar == null) {
                                lVar = AbstractC0412a.s(new A4.d(11, eVar3, new C0075z(context, eVar3.f4515b)));
                                eVar3.f4516c = lVar;
                            }
                        }
                        final H.b f = H.i.f(lVar, new A4.c(new A.j(new E6.l(context, 3), 25), 10), j3.f.r());
                        final Executor mainExecutor = X.d.getMainExecutor(c2010l6.f16531a);
                        kotlin.jvm.internal.j.d(mainExecutor, "getMainExecutor(activity)");
                        f.a(new Runnable() { // from class: x5.f
                            /* JADX WARN: Type inference failed for: r5v9, types: [D.y0, D.j0] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                Integer num5;
                                R.b bVar4;
                                Size size2;
                                A4.c cVar;
                                int i8;
                                boolean z10;
                                Integer num6;
                                int i9;
                                int i10;
                                Integer num7;
                                double d7;
                                double d8;
                                int i11;
                                h0 h0Var2;
                                Integer num8;
                                h0 h0Var3;
                                h0 h0Var4;
                                boolean z11;
                                C2010l this$0 = C2010l.this;
                                H.b bVar5 = f;
                                C2013o c2013o3 = c2013o2;
                                Size size3 = size;
                                C0070u c0070u3 = c0070u2;
                                C2013o c2013o4 = c2013o;
                                Executor executor = mainExecutor;
                                boolean z12 = booleanValue2;
                                C2011m c2011m5 = c2011m3;
                                C2011m c2011m6 = c2011m4;
                                kotlin.jvm.internal.j.e(this$0, "this$0");
                                R.e eVar4 = (R.e) bVar5.get();
                                this$0.f16536g = eVar4;
                                if (eVar4 != null) {
                                    Trace.beginSection(F.f.D("CX:getAvailableCameraInfos"));
                                    try {
                                        ArrayList arrayList = new ArrayList();
                                        C0075z c0075z = eVar4.f4518e;
                                        kotlin.jvm.internal.j.b(c0075z);
                                        for (InterfaceC0521x interfaceC0521x : c0075z.f813a.E()) {
                                            InterfaceC0519v a11 = interfaceC0521x.a();
                                            kotlin.jvm.internal.j.d(a11, "camera.cameraInfo");
                                            arrayList.add(a11);
                                        }
                                        Trace.endSection();
                                        num5 = Integer.valueOf(arrayList.size());
                                    } catch (Throwable th) {
                                        Trace.endSection();
                                        throw th;
                                    }
                                } else {
                                    num5 = null;
                                }
                                R.e eVar5 = this$0.f16536g;
                                if (eVar5 == null) {
                                    c2013o3.invoke(new Exception());
                                    return;
                                }
                                eVar5.g();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = this$0.j;
                                if (textureRegistry$SurfaceProducer == null) {
                                    textureRegistry$SurfaceProducer = this$0.f16532b.c();
                                }
                                this$0.j = textureRegistry$SurfaceProducer;
                                A4.d dVar = new A4.d(28, this$0, textureRegistry$SurfaceProducer);
                                C0498a0 c0498a0 = new C0498a0(Z.a(new J(1).f620b));
                                P.e(c0498a0);
                                ?? y0Var = new y0(c0498a0);
                                y0Var.f725p = j0.f723w;
                                y0Var.C(dVar);
                                this$0.f16538i = y0Var;
                                J j = new J(0);
                                j.f620b.j(M.f7560b, 0);
                                Object systemService = this$0.f16531a.getApplicationContext().getSystemService("display");
                                kotlin.jvm.internal.j.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
                                DisplayManager displayManager = (DisplayManager) systemService;
                                if (size3 == null) {
                                    size3 = new Size(1920, 1080);
                                }
                                j.f620b.j(Q.f7583G, new P.b(P.a.f3887a, new P.c(size3), null));
                                M m7 = new M(Z.a(j.f620b));
                                P.e(m7);
                                new D.M(m7);
                                if (this$0.f16542n == null) {
                                    C0389o c0389o = new C0389o(3, size3, j);
                                    this$0.f16542n = c0389o;
                                    displayManager.registerDisplayListener(c0389o, null);
                                }
                                M m8 = new M(Z.a(j.f620b));
                                P.e(m8);
                                D.M m9 = new D.M(m8);
                                E e8 = this$0.f16549u;
                                synchronized (m9.f624p) {
                                    try {
                                        m9.f623o.i(executor, new A.j(e8, 2));
                                        if (m9.f625q == null) {
                                            m9.m();
                                        }
                                        m9.f625q = e8;
                                    } finally {
                                    }
                                }
                                try {
                                    R.e eVar6 = this$0.f16536g;
                                    if (eVar6 != null) {
                                        AbstractActivityC0032e abstractActivityC0032e = this$0.f16531a;
                                        kotlin.jvm.internal.j.c(abstractActivityC0032e, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                                        bVar4 = eVar6.d(abstractActivityC0032e, c0070u3, this$0.f16538i, m9);
                                    } else {
                                        bVar4 = null;
                                    }
                                    this$0.f16537h = bVar4;
                                    if (bVar4 != null) {
                                        C d9 = bVar4.f4508c.f2104l0.f7630b.d();
                                        AbstractActivityC0032e abstractActivityC0032e2 = this$0.f16531a;
                                        kotlin.jvm.internal.j.c(abstractActivityC0032e2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                                        d9.e(abstractActivityC0032e2, new D(new E6.l(c2011m5, 10)) { // from class: x5.k

                                            /* renamed from: a  reason: collision with root package name */
                                            public final /* synthetic */ kotlin.jvm.internal.k f16529a;

                                            {
                                                this.f16529a = (kotlin.jvm.internal.k) r1;
                                            }

                                            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.k, w6.l] */
                                            @Override // androidx.lifecycle.D
                                            public final /* synthetic */ void a(Object obj2) {
                                                this.f16529a.invoke(obj2);
                                            }

                                            public final boolean equals(Object obj2) {
                                                if (!(obj2 instanceof D) || !(obj2 instanceof C2009k)) {
                                                    return false;
                                                }
                                                return this.f16529a.equals(((C2009k) obj2).f16529a);
                                            }

                                            public final int hashCode() {
                                                return this.f16529a.hashCode();
                                            }
                                        });
                                        bVar4.f4508c.f2104l0.f7630b.j().e(this$0.f16531a, new D(new E6.l(c2011m6, 11)) { // from class: x5.k

                                            /* renamed from: a  reason: collision with root package name */
                                            public final /* synthetic */ kotlin.jvm.internal.k f16529a;

                                            {
                                                this.f16529a = (kotlin.jvm.internal.k) r1;
                                            }

                                            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.k, w6.l] */
                                            @Override // androidx.lifecycle.D
                                            public final /* synthetic */ void a(Object obj2) {
                                                this.f16529a.invoke(obj2);
                                            }

                                            public final boolean equals(Object obj2) {
                                                if (!(obj2 instanceof D) || !(obj2 instanceof C2009k)) {
                                                    return false;
                                                }
                                                return this.f16529a.equals(((C2009k) obj2).f16529a);
                                            }

                                            public final int hashCode() {
                                                return this.f16529a.hashCode();
                                            }
                                        });
                                        if (bVar4.f4508c.f2104l0.f7630b.f()) {
                                            bVar4.f4508c.f2103k0.B(z12);
                                        }
                                    }
                                    InterfaceC0521x b5 = m9.b();
                                    C0505g c0505g = m9.f804g;
                                    if (c0505g != null) {
                                        size2 = c0505g.f7621a;
                                    } else {
                                        size2 = null;
                                    }
                                    if (b5 != null && size2 != null) {
                                        Rect rect = m9.f806i;
                                        if (rect == null) {
                                            z11 = false;
                                            rect = new Rect(0, 0, size2.getWidth(), size2.getHeight());
                                        } else {
                                            z11 = false;
                                        }
                                        cVar = new A4.c(size2, rect, m9.g(b5, z11));
                                    } else {
                                        cVar = null;
                                    }
                                    kotlin.jvm.internal.j.b(cVar);
                                    Size size4 = ((C0060j) cVar.f218b).f719a;
                                    double width = size4.getWidth();
                                    double height = size4.getHeight();
                                    R.b bVar6 = this$0.f16537h;
                                    if (bVar6 != null && (h0Var4 = bVar6.f4508c.f2104l0) != null) {
                                        i8 = h0Var4.a();
                                    } else {
                                        i8 = 0;
                                    }
                                    if (i8 % 180 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    R.b bVar7 = this$0.f16537h;
                                    if (bVar7 != null && (h0Var3 = bVar7.f4508c.f2104l0) != null) {
                                        num6 = Integer.valueOf(h0Var3.f7558a.b());
                                    } else {
                                        num6 = null;
                                    }
                                    int i12 = -1;
                                    if (num6 != null && num6.intValue() == 1) {
                                        num7 = 1;
                                        i9 = 0;
                                    } else {
                                        if (num6 == null || num6.intValue() != 0) {
                                            i9 = 0;
                                            if (num6 != null && num6.intValue() == 2) {
                                                i10 = 2;
                                            } else {
                                                if (num6 != null) {
                                                    num6.intValue();
                                                }
                                                num7 = null;
                                            }
                                        } else {
                                            i9 = 0;
                                            i10 = 0;
                                        }
                                        num7 = i10;
                                    }
                                    R.b bVar8 = this$0.f16537h;
                                    if (bVar8 != null && (h0Var2 = bVar8.f4508c.f2104l0) != null && h0Var2.f7630b.f() && (num8 = (Integer) h0Var2.f7630b.d().d()) != null) {
                                        i12 = num8.intValue();
                                    }
                                    int i13 = i12;
                                    C2003e c2003e2 = this$0.f16535e;
                                    if (!c2003e2.f16510d) {
                                        c2003e2.f16510d = true;
                                        IntentFilter intentFilter = C2003e.f16506e;
                                        AbstractActivityC0032e abstractActivityC0032e3 = c2003e2.f16507a;
                                        abstractActivityC0032e3.registerReceiver(c2003e2, intentFilter);
                                        c2003e2.onReceive(abstractActivityC0032e3, null);
                                    }
                                    if (z10) {
                                        d7 = width;
                                    } else {
                                        d7 = height;
                                    }
                                    if (z10) {
                                        d8 = height;
                                    } else {
                                        d8 = width;
                                    }
                                    String v6 = android.support.v4.media.session.a.v(this$0.f16535e.c());
                                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2 = this$0.j;
                                    kotlin.jvm.internal.j.b(textureRegistry$SurfaceProducer2);
                                    boolean handlesCropAndRotation = textureRegistry$SurfaceProducer2.handlesCropAndRotation();
                                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer3 = this$0.j;
                                    kotlin.jvm.internal.j.b(textureRegistry$SurfaceProducer3);
                                    long id = textureRegistry$SurfaceProducer3.id();
                                    if (num5 != null) {
                                        i11 = num5.intValue();
                                    } else {
                                        i11 = i9;
                                    }
                                    c2013o4.invoke(new y5.d(d7, d8, v6, i8, handlesCropAndRotation, i13, id, i11, num7));
                                } catch (Exception unused5) {
                                    c2013o3.invoke(new Exception());
                                }
                            }
                        }, mainExecutor);
                        return;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        AbstractActivityC0032e activity = this.f16558a;
                        kotlin.jvm.internal.j.e(activity, "activity");
                        if (X.d.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
                            i7 = 1;
                        }
                        ((K5.r) qVar).a(Integer.valueOf(i7));
                        return;
                    }
                    break;
                case 1095692943:
                    if (str.equals("request")) {
                        A.l lVar2 = this.f16560c;
                        AbstractActivityC0032e activity2 = this.f16558a;
                        C2005g c2005g = this.f16561d;
                        C0585f c0585f = new C0585f((K5.r) qVar, 21);
                        kotlin.jvm.internal.j.e(activity2, "activity");
                        if (lVar2.f25a) {
                            c0585f.K("MOBILE_SCANNER_CAMERA_PERMISSION_REQUEST_PENDING");
                            return;
                        } else if (X.d.checkSelfPermission(activity2, "android.permission.CAMERA") == 0) {
                            c0585f.K(null);
                            return;
                        } else {
                            if (((C2015q) lVar2.f26b) == null) {
                                C2015q c2015q = new C2015q(new C1608t(25, lVar2, c0585f));
                                lVar2.f26b = c2015q;
                                c2005g.invoke(c2015q);
                            }
                            lVar2.f25a = true;
                            AbstractC0359b.a(activity2, new String[]{"android.permission.CAMERA"}, 1926);
                            return;
                        }
                    }
                    break;
                case 1403963912:
                    if (str.equals("setScale")) {
                        try {
                            C2010l c2010l7 = this.f16563e0;
                            kotlin.jvm.internal.j.b(c2010l7);
                            Object obj2 = call.f3039b;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Double");
                            c2010l7.b(((Double) obj2).doubleValue());
                            ((K5.r) qVar).a(null);
                            return;
                        } catch (C2018t unused5) {
                            ((K5.r) qVar).b(null, "MOBILE_SCANNER_GENERIC_ERROR", "The zoom scale should be between 0 and 1 (both inclusive)");
                            return;
                        } catch (C2019u unused6) {
                            ((K5.r) qVar).b(null, "MOBILE_SCANNER_SET_SCALE_WHEN_STOPPED_ERROR", "The zoom scale cannot be changed when the camera is stopped.");
                            return;
                        }
                    }
                    break;
                case 2023844470:
                    if (str.equals("updateScanWindow")) {
                        C2010l c2010l8 = this.f16563e0;
                        if (c2010l8 != null) {
                            c2010l8.f16543o = (List) call.a("rect");
                        }
                        ((K5.r) qVar).a(null);
                        return;
                    }
                    break;
            }
        }
        ((K5.r) qVar).c();
    }
}
