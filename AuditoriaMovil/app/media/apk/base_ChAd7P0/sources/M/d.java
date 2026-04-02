package M;

import D.D;
import F3.o;
import H4.A0;
import H4.C0175n0;
import H4.C0177o0;
import H4.C0184s0;
import H4.C0186t0;
import H4.C0188u0;
import H4.C0190v0;
import H4.C0192w0;
import H4.C0194x0;
import H4.C0196y0;
import H4.C0198z0;
import H4.M0;
import H4.N0;
import H4.W;
import H4.X0;
import H4.d1;
import H4.e1;
import H4.p1;
import L5.r;
import M0.x;
import Q0.A;
import X5.C0388n;
import X5.C0391q;
import X5.g0;
import X5.i0;
import a.AbstractC0412a;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.pdf.PdfRenderer;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.firestore.AbstractC0802d;
import com.google.firebase.firestore.C0799a;
import com.google.firebase.firestore.C0800b;
import com.google.firebase.firestore.C0801c;
import com.google.firebase.firestore.C0803e;
import com.google.firebase.firestore.C0804f;
import com.google.firebase.firestore.C0818u;
import com.google.firebase.firestore.EnumC0805g;
import com.google.firebase.firestore.J;
import com.google.firebase.firestore.d0;
import com.google.firebase.firestore.j0;
import e1.C0960z;
import io.flutter.plugins.firebase.auth.C1154q;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.firestore.AbstractC1161f;
import io.flutter.plugins.firebase.firestore.C1162g;
import io.flutter.plugins.firebase.firestore.q;
import io.flutter.plugins.firebase.firestore.y;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m6.AbstractC1448i;
import n4.C1533t;
import n4.L;
import p.C1608t;
import p.Y0;
import q5.C1712a;
import t4.p;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3060b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3061c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3062d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3063e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f3059a = i7;
        this.f3063e = obj;
        this.f3060b = obj2;
        this.f3061c = obj3;
        this.f3062d = obj4;
    }

    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.Object, io.flutter.plugins.firebase.firestore.j] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, io.flutter.plugins.firebase.firestore.j] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, io.flutter.plugins.firebase.firestore.j] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, e1.D] */
    @Override // java.lang.Runnable
    public final void run() {
        int pageCount;
        int intValue;
        Double d7;
        Task forException;
        L l8;
        String str = null;
        switch (this.f3059a) {
            case 0:
                D d8 = (D) this.f3060b;
                Map map = (Map) this.f3061c;
                U.i iVar = (U.i) this.f3062d;
                e eVar = (e) this.f3063e;
                eVar.getClass();
                try {
                    eVar.f3067a.e(d8, map);
                    iVar.a(null);
                    return;
                } catch (RuntimeException e7) {
                    iVar.b(e7);
                    return;
                }
            case 1:
                D d9 = (D) this.f3060b;
                Map map2 = (Map) this.f3061c;
                U.i iVar2 = (U.i) this.f3062d;
                N.e eVar2 = (N.e) this.f3063e;
                eVar2.getClass();
                try {
                    eVar2.f3325a.e(d9, map2);
                    iVar2.a(null);
                    return;
                } catch (RuntimeException e8) {
                    iVar2.b(e8);
                    return;
                }
            case 2:
                P5.j jVar = (P5.j) this.f3060b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3062d;
                HashMap hashMap = P5.d.f4034c;
                P5.d dVar = (P5.d) this.f3063e;
                dVar.getClass();
                try {
                    String str2 = jVar.f4048a;
                    I.f(str2, "ApiKey must be set.");
                    String str3 = jVar.f4049b;
                    I.f(str3, "ApplicationId must be set.");
                    U3.k kVar = new U3.k(str3, str2, jVar.f, jVar.f4055i, jVar.f4050c, jVar.f4053g, jVar.f4051d);
                    try {
                        Looper.prepare();
                    } catch (Exception unused) {
                    }
                    String str4 = jVar.f4052e;
                    String str5 = (String) this.f3061c;
                    if (str4 != null) {
                        P5.d.f4034c.put(str5, str4);
                    }
                    U3.h h8 = U3.h.h(kVar, dVar.f4035a, str5);
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new A.h(dVar, h8, taskCompletionSource2, 6));
                    taskCompletionSource.setResult((P5.k) Tasks.await(taskCompletionSource2.getTask()));
                    return;
                } catch (Exception e9) {
                    taskCompletionSource.setException(e9);
                    return;
                }
            case 3:
                byte[] bArr = (byte[]) this.f3060b;
                Double d10 = (Double) this.f3062d;
                final P6.f fVar = (P6.f) this.f3063e;
                try {
                    File createTempFile = File.createTempFile("printing", null, fVar.f4079a.getCacheDir());
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.dup(fileInputStream.getFD()));
                    if (!createTempFile.delete()) {
                        Log.e("PDF", "Unable to delete temporary file");
                    }
                    ArrayList arrayList = (ArrayList) this.f3061c;
                    if (arrayList != null) {
                        pageCount = arrayList.size();
                    } else {
                        pageCount = pdfRenderer.getPageCount();
                    }
                    for (int i7 = 0; i7 < pageCount; i7++) {
                        if (arrayList == null) {
                            intValue = i7;
                        } else {
                            intValue = ((Integer) arrayList.get(i7)).intValue();
                        }
                        PdfRenderer.Page openPage = pdfRenderer.openPage(intValue);
                        final int intValue2 = Double.valueOf(openPage.getWidth() * d10.doubleValue()).intValue();
                        final int intValue3 = Double.valueOf(openPage.getHeight() * d10.doubleValue()).intValue();
                        Matrix matrix = new Matrix();
                        matrix.setScale(d10.floatValue(), d10.floatValue());
                        Bitmap createBitmap = Bitmap.createBitmap(intValue2, intValue3, Bitmap.Config.ARGB_8888);
                        openPage.render(createBitmap, null, matrix, 1);
                        openPage.close();
                        final ByteBuffer allocate = ByteBuffer.allocate(intValue2 * 4 * intValue3);
                        createBitmap.copyPixelsToBuffer(allocate);
                        createBitmap.recycle();
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: P6.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                f fVar2 = f.this;
                                fVar2.getClass();
                                byte[] array = allocate.array();
                                x xVar = fVar2.f4080b;
                                xVar.getClass();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("image", array);
                                hashMap2.put("width", Integer.valueOf(intValue2));
                                hashMap2.put("height", Integer.valueOf(intValue3));
                                hashMap2.put("job", Integer.valueOf(fVar2.f4084g));
                                ((r) xVar.f3211c).a("onPageRasterized", hashMap2, null);
                            }
                        });
                    }
                    pdfRenderer.close();
                    fileInputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                    str = e10.getMessage();
                }
                new Handler(Looper.getMainLooper()).post(new P6.d(fVar, str, 0));
                return;
            case 4:
                C0391q c0391q = new C0391q(2);
                g0 g0Var = (g0) this.f3063e;
                C0388n c0388n = g0Var.f6492b;
                c0388n.getClass();
                WebView webViewArg = (WebView) this.f3060b;
                kotlin.jvm.internal.j.e(webViewArg, "webViewArg");
                WebResourceRequest requestArg = (WebResourceRequest) this.f3061c;
                kotlin.jvm.internal.j.e(requestArg, "requestArg");
                o oVar = c0388n.f6519a;
                oVar.getClass();
                new E.e((L5.f) oVar.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat", oVar.j(), null, 4).f0(AbstractC1448i.L(g0Var, webViewArg, requestArg, (g2.h) this.f3062d), new X5.L(c0391q, 14));
                return;
            case 5:
                C0391q c0391q2 = new C0391q(2);
                g0 g0Var2 = (g0) this.f3063e;
                g0Var2.f6492b.j(g0Var2, (WebView) this.f3060b, (WebResourceRequest) this.f3061c, (WebResourceResponse) this.f3062d, c0391q2);
                return;
            case 6:
                C0391q c0391q3 = new C0391q(2);
                g0 g0Var3 = (g0) this.f3063e;
                g0Var3.f6492b.b(g0Var3, (WebView) this.f3060b, (Message) this.f3061c, (Message) this.f3062d, c0391q3);
                return;
            case 7:
                C0391q c0391q4 = new C0391q(2);
                g0 g0Var4 = (g0) this.f3063e;
                g0Var4.f6492b.l(g0Var4, (WebView) this.f3060b, (SslErrorHandler) this.f3061c, (SslError) this.f3062d, c0391q4);
                return;
            case 8:
                C0391q c0391q5 = new C0391q(3);
                i0 i0Var = (i0) this.f3063e;
                i0Var.f6501a.b(i0Var, (WebView) this.f3060b, (Message) this.f3061c, (Message) this.f3062d, c0391q5);
                return;
            case 9:
                C0391q c0391q6 = new C0391q(3);
                i0 i0Var2 = (i0) this.f3063e;
                i0Var2.f6501a.l(i0Var2, (WebView) this.f3060b, (SslErrorHandler) this.f3061c, (SslError) this.f3062d, c0391q6);
                return;
            case 10:
                C0391q c0391q7 = new C0391q(3);
                i0 i0Var3 = (i0) this.f3063e;
                C0388n c0388n2 = i0Var3.f6501a;
                c0388n2.getClass();
                WebView webViewArg2 = (WebView) this.f3060b;
                kotlin.jvm.internal.j.e(webViewArg2, "webViewArg");
                WebResourceRequest requestArg2 = (WebResourceRequest) this.f3061c;
                kotlin.jvm.internal.j.e(requestArg2, "requestArg");
                WebResourceError errorArg = (WebResourceError) this.f3062d;
                kotlin.jvm.internal.j.e(errorArg, "errorArg");
                o oVar2 = c0388n2.f6519a;
                oVar2.getClass();
                new E.e((L5.f) oVar2.f1178b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", oVar2.j(), null, 4).f0(AbstractC1448i.L(i0Var3, webViewArg2, requestArg2, errorArg), new X5.L(c0391q7, 15));
                return;
            case 11:
                C0391q c0391q8 = new C0391q(3);
                i0 i0Var4 = (i0) this.f3063e;
                i0Var4.f6501a.j(i0Var4, (WebView) this.f3060b, (WebResourceRequest) this.f3061c, (WebResourceResponse) this.f3062d, c0391q8);
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                this.f3060b.C(((T0.d) this.f3063e).f5287a, (C0960z) this.f3061c, (b1.g) this.f3062d);
                return;
            case 13:
                q qVar = (q) this.f3063e;
                String str6 = (String) this.f3060b;
                C1154q c1154q = (C1154q) this.f3061c;
                y yVar = (y) this.f3062d;
                try {
                    com.google.firebase.firestore.g0 g0Var5 = (com.google.firebase.firestore.g0) Tasks.await(C1162g.c(qVar).f(str6));
                    if (g0Var5 == null) {
                        c1154q.b(new NullPointerException("Named query has not been found. Please check it has been loaded properly via loadBundle()."));
                    } else {
                        c1154q.d(AbstractC0412a.b0((j0) Tasks.await(g0Var5.c(AbstractC0412a.O(yVar.f11963a))), AbstractC0412a.N(yVar.f11964b)));
                    }
                    return;
                } catch (Exception e11) {
                    W.H(c1154q, e11);
                    return;
                }
            case 14:
                C0803e c0803e = (C0803e) this.f3063e;
                io.flutter.plugins.firebase.firestore.k kVar2 = (io.flutter.plugins.firebase.firestore.k) this.f3060b;
                List<io.flutter.plugins.firebase.firestore.i> list = (List) this.f3061c;
                C1154q c1154q2 = (C1154q) this.f3062d;
                HashMap hashMap2 = C1162g.f11922Y;
                try {
                    if (R5.a.f4782e[kVar2.ordinal()] == 1) {
                        C0804f c0804f = (C0804f) Tasks.await(c0803e.a(EnumC0805g.SERVER));
                        ArrayList arrayList2 = new ArrayList();
                        for (io.flutter.plugins.firebase.firestore.i iVar3 : list) {
                            int i8 = AbstractC1161f.f11919a[iVar3.f11931a.ordinal()];
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    if (i8 == 3) {
                                        io.flutter.plugins.firebase.firestore.l lVar = io.flutter.plugins.firebase.firestore.l.AVERAGE;
                                        Number number = (Number) c0804f.c(new AbstractC0802d(C0818u.a(iVar3.f11932b), "average"));
                                        if (number != null) {
                                            d7 = Double.valueOf(number.doubleValue());
                                        } else {
                                            d7 = null;
                                        }
                                        String str7 = iVar3.f11932b;
                                        ?? obj = new Object();
                                        obj.a(lVar);
                                        obj.f11934b = str7;
                                        obj.f11935c = d7;
                                        arrayList2.add(obj);
                                    }
                                } else {
                                    io.flutter.plugins.firebase.firestore.l lVar2 = io.flutter.plugins.firebase.firestore.l.SUM;
                                    Object b5 = c0804f.b(new AbstractC0802d(C0818u.a(iVar3.f11932b), "sum"));
                                    Objects.requireNonNull(b5);
                                    Double valueOf = Double.valueOf(((Number) b5).doubleValue());
                                    String str8 = iVar3.f11932b;
                                    ?? obj2 = new Object();
                                    obj2.a(lVar2);
                                    obj2.f11934b = str8;
                                    obj2.f11935c = valueOf;
                                    arrayList2.add(obj2);
                                }
                            } else {
                                io.flutter.plugins.firebase.firestore.l lVar3 = io.flutter.plugins.firebase.firestore.l.COUNT;
                                Double valueOf2 = Double.valueOf(c0804f.a());
                                ?? obj3 = new Object();
                                obj3.a(lVar3);
                                obj3.f11934b = null;
                                obj3.f11935c = valueOf2;
                                arrayList2.add(obj3);
                            }
                        }
                        c1154q2.d(arrayList2);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown AggregateSource value: " + kVar2);
                } catch (Exception e12) {
                    W.H(c1154q2, e12);
                    return;
                }
            case 15:
                n4.D d11 = (n4.D) this.f3060b;
                d0 d0Var = (d0) this.f3061c;
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f3062d;
                O0.d0 d0Var2 = ((C1533t) this.f3063e).f14367i.f14292b;
                if (d0Var2.f3687b) {
                    t4.i iVar4 = (t4.i) d0Var2.f;
                    C1608t c1608t = iVar4.f15804a;
                    synchronized (d11) {
                        try {
                            if (d11.f14274d == null) {
                                d11.f14274d = d11.j(d11.f14271a);
                            }
                            l8 = d11.f14274d;
                        } finally {
                        }
                    }
                    d1 X7 = c1608t.X(l8);
                    HashMap hashMap3 = new HashMap();
                    C0198z0 x7 = A0.x();
                    X0 z7 = X7.z();
                    x7.d();
                    A0.v((A0) x7.f10006b, z7);
                    ArrayList arrayList3 = new ArrayList();
                    HashSet hashSet = new HashSet();
                    Iterator it = d0Var.iterator();
                    int i9 = 1;
                    while (it.hasNext()) {
                        AbstractC0802d abstractC0802d = (AbstractC0802d) it.next();
                        if (!hashSet.contains(abstractC0802d.f9802c)) {
                            String str9 = abstractC0802d.f9802c;
                            hashSet.add(str9);
                            StringBuilder sb = new StringBuilder("aggregate_");
                            int i10 = i9 + 1;
                            sb.append(i9);
                            String sb2 = sb.toString();
                            hashMap3.put(sb2, str9);
                            C0188u0 z8 = C0196y0.z();
                            M0 y2 = N0.y();
                            String a7 = abstractC0802d.a();
                            y2.d();
                            N0.v((N0) y2.f10006b, a7);
                            N0 n02 = (N0) y2.b();
                            if (abstractC0802d instanceof C0800b) {
                                C0190v0 v6 = C0190v0.v();
                                z8.d();
                                C0196y0.v((C0196y0) z8.f10006b, v6);
                            } else if (abstractC0802d instanceof C0801c) {
                                C0192w0 w2 = C0194x0.w();
                                w2.d();
                                C0194x0.v((C0194x0) w2.f10006b, n02);
                                z8.d();
                                C0196y0.w((C0196y0) z8.f10006b, (C0194x0) w2.b());
                            } else if (abstractC0802d instanceof C0799a) {
                                C0184s0 w7 = C0186t0.w();
                                w7.d();
                                C0186t0.v((C0186t0) w7.f10006b, n02);
                                z8.d();
                                C0196y0.x((C0196y0) z8.f10006b, (C0186t0) w7.b());
                            } else {
                                throw new RuntimeException("Unsupported aggregation");
                            }
                            z8.d();
                            C0196y0.y((C0196y0) z8.f10006b, sb2);
                            arrayList3.add((C0196y0) z8.b());
                            i9 = i10;
                        }
                    }
                    x7.d();
                    A0.w((A0) x7.f10006b, arrayList3);
                    C0175n0 y3 = C0177o0.y();
                    String y6 = X7.y();
                    y3.d();
                    C0177o0.v((C0177o0) y3.f10006b, y6);
                    y3.d();
                    C0177o0.w((C0177o0) y3.f10006b, (A0) x7.b());
                    p pVar = iVar4.f15806c;
                    A v7 = W.v();
                    pVar.getClass();
                    TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                    Y0 y02 = pVar.f15831d;
                    ((Task) y02.f14760b).continueWithTask(((u4.e) y02.f14761c).f15988a, new A4.d(25, y02, v7)).addOnCompleteListener(pVar.f15828a.f15988a, new com.google.firebase.storage.r(pVar, taskCompletionSource4, (C0177o0) y3.b()));
                    forException = taskCompletionSource4.getTask().continueWith(iVar4.f15805b.f15988a, new A4.d(24, iVar4, hashMap3));
                } else {
                    forException = Tasks.forException(new J("Failed to get result from server.", com.google.firebase.firestore.I.UNAVAILABLE));
                }
                forException.addOnSuccessListener(new com.google.firebase.storage.o(1, taskCompletionSource3)).addOnFailureListener(new com.google.firebase.storage.p(1, taskCompletionSource3));
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                ((C1712a) this.f3063e).f15388b.b(this.f3062d, (String) this.f3060b, (String) this.f3061c);
                return;
            case 17:
                C1712a this$0 = (C1712a) this.f3063e;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                String errorCode = (String) this.f3060b;
                kotlin.jvm.internal.j.e(errorCode, "$errorCode");
                this$0.f15388b.b(this.f3062d, errorCode, (String) this.f3061c);
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ((CameraCaptureSession.CaptureCallback) ((A.k) this.f3063e).f21b).onCaptureCompleted((CameraCaptureSession) this.f3060b, (CaptureRequest) this.f3061c, (TotalCaptureResult) this.f3062d);
                return;
            case 19:
                ((CameraCaptureSession.CaptureCallback) ((A.k) this.f3063e).f21b).onCaptureProgressed((CameraCaptureSession) this.f3060b, (CaptureRequest) this.f3061c, (CaptureResult) this.f3062d);
                return;
            default:
                ((CameraCaptureSession.CaptureCallback) ((A.k) this.f3063e).f21b).onCaptureFailed((CameraCaptureSession) this.f3060b, (CaptureRequest) this.f3061c, (CaptureFailure) this.f3062d);
                return;
        }
    }
}
