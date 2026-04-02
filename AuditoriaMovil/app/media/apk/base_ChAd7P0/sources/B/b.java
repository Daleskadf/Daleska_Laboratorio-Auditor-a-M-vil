package b;

import A.c;
import android.content.Context;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes.dex */
public final class b extends PrintDocumentAdapter.LayoutResultCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f8084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f8085b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PrintDocumentAdapter f8086c;

    public b(Context context, c cVar, PrintDocumentAdapter printDocumentAdapter) {
        this.f8084a = context;
        this.f8085b = cVar;
        this.f8086c = printDocumentAdapter;
    }

    @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
    public final void onLayoutFinished(PrintDocumentInfo printDocumentInfo, boolean z7) {
        c cVar = this.f8085b;
        try {
            File createTempFile = File.createTempFile("printing", "pdf", this.f8084a.getCacheDir());
            try {
                this.f8086c.onWrite(new PageRange[]{PageRange.ALL_PAGES}, ParcelFileDescriptor.open(createTempFile, 805306368), new CancellationSignal(), new C0573a(this, createTempFile));
            } catch (FileNotFoundException e7) {
                if (!createTempFile.delete()) {
                    Log.e("PDF", "Unable to delete temporary file");
                }
                cVar.o(e7.getMessage());
            }
        } catch (IOException e8) {
            cVar.o(e8.getMessage());
        }
    }
}
