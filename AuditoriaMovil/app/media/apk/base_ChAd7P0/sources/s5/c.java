package s5;

import A.h;
import D.AbstractC0059i;
import L5.o;
import L5.p;
import L5.q;
import L5.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class c implements H5.b, p {

    /* renamed from: a  reason: collision with root package name */
    public r f15697a;

    /* renamed from: b  reason: collision with root package name */
    public Context f15698b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f15699c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f15700d;

    public static PdfRenderer a(ParcelFileDescriptor parcelFileDescriptor, String str) {
        Class<?> cls = Class.forName("android.graphics.pdf.LoadParams$Builder");
        Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
        cls.getMethod("setPassword", String.class).invoke(newInstance, str);
        Object invoke = cls.getMethod("build", null).invoke(newInstance, null);
        return (PdfRenderer) PdfRenderer.class.getDeclaredConstructor(ParcelFileDescriptor.class, invoke.getClass()).newInstance(parcelFileDescriptor, invoke);
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        r rVar = new r(aVar.f2030b, "syncfusion_flutter_pdfviewer");
        this.f15697a = rVar;
        rVar.b(this);
        this.f15698b = aVar.f2029a;
        this.f15700d = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        this.f15697a.b(null);
        this.f15700d.shutdown();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // L5.p
    public final void onMethodCall(o oVar, q qVar) {
        char c8;
        String str = oVar.f3038a;
        str.getClass();
        HashMap hashMap = this.f15699c;
        Object obj = oVar.f3039b;
        switch (str.hashCode()) {
            case -880978793:
                if (str.equals("getTileImage")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -619952603:
                if (str.equals("initializePdfRenderer")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -75248891:
                if (str.equals("getPage")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 1878474840:
                if (str.equals("getPagesWidth")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 1965150421:
                if (str.equals("getPagesHeight")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 2113641267:
                if (str.equals("closeDocument")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                int intValue = ((Integer) oVar.a("pageNumber")).intValue();
                double doubleValue = ((Double) oVar.a("scale")).doubleValue();
                double doubleValue2 = ((Double) oVar.a("x")).doubleValue();
                double doubleValue3 = ((Double) oVar.a("y")).doubleValue();
                double doubleValue4 = ((Double) oVar.a("width")).doubleValue();
                double doubleValue5 = ((Double) oVar.a("height")).doubleValue();
                try {
                    C1797a c1797a = (C1797a) hashMap.get((String) oVar.a("documentID"));
                    Objects.requireNonNull(c1797a);
                    PdfRenderer.Page openPage = c1797a.f15692a.openPage(intValue - 1);
                    int i7 = (int) doubleValue4;
                    int i8 = (int) doubleValue5;
                    Bitmap createBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                    createBitmap.eraseColor(-1);
                    Matrix matrix = new Matrix();
                    matrix.postTranslate((float) (-doubleValue2), (float) (-doubleValue3));
                    float f = (float) doubleValue;
                    matrix.postScale(f, f);
                    openPage.render(createBitmap, new Rect(0, 0, i7, i8), matrix, 1);
                    openPage.close();
                    ByteBuffer allocate = ByteBuffer.allocate(createBitmap.getByteCount());
                    createBitmap.copyPixelsToBuffer(allocate);
                    createBitmap.recycle();
                    byte[] array = allocate.array();
                    allocate.clear();
                    ((K5.r) qVar).a(array);
                    return;
                } catch (Exception e7) {
                    ((K5.r) qVar).b(e7.getMessage(), e7.getMessage(), e7.getLocalizedMessage());
                    return;
                }
            case 1:
                this.f15700d.execute(new h(this, oVar, (K5.r) qVar, 27));
                return;
            case 2:
                int intValue2 = ((Integer) oVar.a("index")).intValue();
                int intValue3 = ((Integer) oVar.a("width")).intValue();
                int intValue4 = ((Integer) oVar.a("height")).intValue();
                try {
                    C1797a c1797a2 = (C1797a) hashMap.get((String) oVar.a("documentID"));
                    Objects.requireNonNull(c1797a2);
                    PdfRenderer.Page openPage2 = c1797a2.f15692a.openPage(intValue2 - 1);
                    Bitmap createBitmap2 = Bitmap.createBitmap(intValue3, intValue4, Bitmap.Config.ARGB_8888);
                    createBitmap2.eraseColor(-1);
                    openPage2.render(createBitmap2, new Rect(0, 0, intValue3, intValue4), null, 1);
                    openPage2.close();
                    ByteBuffer allocate2 = ByteBuffer.allocate(createBitmap2.getByteCount());
                    createBitmap2.copyPixelsToBuffer(allocate2);
                    createBitmap2.recycle();
                    byte[] array2 = allocate2.array();
                    allocate2.clear();
                    ((K5.r) qVar).a(array2);
                    return;
                } catch (Exception e8) {
                    ((K5.r) qVar).b(e8.getMessage(), e8.getMessage(), e8.getLocalizedMessage());
                    return;
                }
            case 3:
                String str2 = (String) obj;
                final C1797a c1797a3 = (C1797a) hashMap.get(str2);
                if (c1797a3 == null) {
                    ((K5.r) qVar).b(null, "DOCUMENT_NOT_FOUND", AbstractC0059i.M("Document with ID ", str2, " not found"));
                    return;
                }
                final K5.r rVar = (K5.r) qVar;
                this.f15700d.execute(new Runnable() { // from class: s5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                C1797a c1797a4 = c1797a3;
                                K5.r rVar2 = rVar;
                                try {
                                    int pageCount = c1797a4.f15692a.getPageCount();
                                    double[] dArr = new double[pageCount];
                                    for (int i9 = 0; i9 < pageCount; i9++) {
                                        PdfRenderer.Page openPage3 = c1797a4.f15692a.openPage(i9);
                                        dArr[i9] = openPage3.getWidth();
                                        openPage3.close();
                                    }
                                    rVar2.a(dArr);
                                    return;
                                } catch (Exception e9) {
                                    rVar2.b(null, "PAGE_WIDTH_ERROR", e9.getMessage());
                                    return;
                                }
                            default:
                                C1797a c1797a5 = c1797a3;
                                K5.r rVar3 = rVar;
                                try {
                                    int pageCount2 = c1797a5.f15692a.getPageCount();
                                    double[] dArr2 = new double[pageCount2];
                                    for (int i10 = 0; i10 < pageCount2; i10++) {
                                        PdfRenderer.Page openPage4 = c1797a5.f15692a.openPage(i10);
                                        dArr2[i10] = openPage4.getHeight();
                                        openPage4.close();
                                    }
                                    rVar3.a(dArr2);
                                    return;
                                } catch (Exception e10) {
                                    rVar3.b(null, "PAGE_HEIGHT_ERROR", e10.getMessage());
                                    return;
                                }
                        }
                    }
                });
                return;
            case 4:
                String str3 = (String) obj;
                final C1797a c1797a4 = (C1797a) hashMap.get(str3);
                if (c1797a4 == null) {
                    ((K5.r) qVar).b(null, "DOCUMENT_NOT_FOUND", AbstractC0059i.M("Document with ID ", str3, " not found"));
                    return;
                }
                final K5.r rVar2 = (K5.r) qVar;
                this.f15700d.execute(new Runnable() { // from class: s5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                C1797a c1797a42 = c1797a4;
                                K5.r rVar22 = rVar2;
                                try {
                                    int pageCount = c1797a42.f15692a.getPageCount();
                                    double[] dArr = new double[pageCount];
                                    for (int i9 = 0; i9 < pageCount; i9++) {
                                        PdfRenderer.Page openPage3 = c1797a42.f15692a.openPage(i9);
                                        dArr[i9] = openPage3.getWidth();
                                        openPage3.close();
                                    }
                                    rVar22.a(dArr);
                                    return;
                                } catch (Exception e9) {
                                    rVar22.b(null, "PAGE_WIDTH_ERROR", e9.getMessage());
                                    return;
                                }
                            default:
                                C1797a c1797a5 = c1797a4;
                                K5.r rVar3 = rVar2;
                                try {
                                    int pageCount2 = c1797a5.f15692a.getPageCount();
                                    double[] dArr2 = new double[pageCount2];
                                    for (int i10 = 0; i10 < pageCount2; i10++) {
                                        PdfRenderer.Page openPage4 = c1797a5.f15692a.openPage(i10);
                                        dArr2[i10] = openPage4.getHeight();
                                        openPage4.close();
                                    }
                                    rVar3.a(dArr2);
                                    return;
                                } catch (Exception e10) {
                                    rVar3.b(null, "PAGE_HEIGHT_ERROR", e10.getMessage());
                                    return;
                                }
                        }
                    }
                });
                return;
            case 5:
                C1797a c1797a5 = (C1797a) hashMap.remove((String) obj);
                if (c1797a5 != null) {
                    try {
                        c1797a5.f15692a.close();
                        c1797a5.f15693b.close();
                        ((K5.r) qVar).a(Boolean.TRUE);
                        return;
                    } catch (IOException e9) {
                        ((K5.r) qVar).b(null, "CLOSE_ERROR", e9.getMessage());
                        return;
                    }
                }
                ((K5.r) qVar).a(Boolean.FALSE);
                return;
            default:
                ((K5.r) qVar).c();
                return;
        }
    }
}
