package b;

import A.c;
import L5.r;
import M0.x;
import P6.e;
import P6.f;
import android.print.PageRange;
import android.print.PrintDocumentAdapter;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
/* renamed from: b.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573a extends PrintDocumentAdapter.WriteResultCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ File f8082a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f8083b;

    public C0573a(b bVar, File file) {
        this.f8083b = bVar;
        this.f8082a = file;
    }

    @Override // android.print.PrintDocumentAdapter.WriteResultCallback
    public final void onWriteFinished(PageRange[] pageRangeArr) {
        byte[] bArr;
        FileInputStream fileInputStream;
        super.onWriteFinished(pageRangeArr);
        int length = pageRangeArr.length;
        b bVar = this.f8083b;
        File file = this.f8082a;
        if (length == 0) {
            if (!file.delete()) {
                Log.e("PDF", "Unable to delete temporary file");
            }
            bVar.f8085b.o("No page created");
        }
        c cVar = bVar.f8085b;
        cVar.getClass();
        try {
            bArr = new byte[(int) file.length()];
            fileInputStream = new FileInputStream(file);
        } catch (IOException e7) {
            cVar.o(e7.getMessage());
        }
        if (fileInputStream.read(bArr) != -1) {
            fileInputStream.close();
            f fVar = ((e) cVar.f4b).f4077d;
            x xVar = fVar.f4080b;
            xVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("doc", bArr);
            hashMap.put("job", Integer.valueOf(fVar.f4084g));
            ((r) xVar.f3211c).a("onHtmlRendered", hashMap, null);
            if (!file.delete()) {
                Log.e("PDF", "Unable to delete temporary file");
                return;
            }
            return;
        }
        throw new IOException("EOF reached while trying to read the whole file");
    }
}
