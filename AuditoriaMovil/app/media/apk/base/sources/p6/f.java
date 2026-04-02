package P6;

import L5.r;
import M0.x;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class f extends PrintDocumentAdapter {

    /* renamed from: h  reason: collision with root package name */
    public static PrintManager f4078h;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4079a;

    /* renamed from: b  reason: collision with root package name */
    public final x f4080b;

    /* renamed from: c  reason: collision with root package name */
    public PrintJob f4081c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f4082d;

    /* renamed from: e  reason: collision with root package name */
    public String f4083e;
    public PrintDocumentAdapter.LayoutResultCallback f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4084g;

    public f(Context context, x xVar, int i7) {
        this.f4079a = context;
        this.f4080b = xVar;
        this.f4084g = i7;
        f4078h = (PrintManager) context.getSystemService("print");
    }

    public final void a(String str) {
        PrintDocumentAdapter.LayoutResultCallback layoutResultCallback = this.f;
        if (layoutResultCallback != null) {
            layoutResultCallback.onLayoutCancelled();
        }
        PrintJob printJob = this.f4081c;
        if (printJob != null) {
            printJob.cancel();
        }
        this.f4080b.E(this, false, str);
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onFinish() {
        new Thread(new C.b(this, 16)).start();
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
            return;
        }
        this.f = layoutResultCallback;
        PrintAttributes.MediaSize mediaSize = printAttributes2.getMediaSize();
        PrintAttributes.Margins minMargins = printAttributes2.getMinMargins();
        Double valueOf = Double.valueOf((mediaSize.getWidthMils() * 72.0d) / 1000.0d);
        x xVar = this.f4080b;
        xVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("width", valueOf);
        hashMap.put("height", Double.valueOf((mediaSize.getHeightMils() * 72.0d) / 1000.0d));
        hashMap.put("marginLeft", Double.valueOf((minMargins.getLeftMils() * 72.0d) / 1000.0d));
        hashMap.put("marginTop", Double.valueOf((minMargins.getTopMils() * 72.0d) / 1000.0d));
        hashMap.put("marginRight", Double.valueOf((minMargins.getRightMils() * 72.0d) / 1000.0d));
        hashMap.put("marginBottom", Double.valueOf((minMargins.getBottomMils() * 72.0d) / 1000.0d));
        hashMap.put("job", Integer.valueOf(this.f4084g));
        ((r) xVar.f3211c).a("onLayout", hashMap, new a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    @Override // android.print.PrintDocumentAdapter
    public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = 0;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                } catch (IOException e7) {
                    e7.printStackTrace();
                    return;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = this.f4082d;
            fileOutputStream.write(bArr, 0, bArr.length);
            PageRange pageRange = PageRange.ALL_PAGES;
            writeResultCallback.onWriteFinished(new PageRange[]{pageRange});
            fileOutputStream.close();
            fileOutputStream2 = pageRange;
        } catch (IOException e9) {
            e = e9;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
                fileOutputStream2 = fileOutputStream2;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            throw th;
        }
    }
}
