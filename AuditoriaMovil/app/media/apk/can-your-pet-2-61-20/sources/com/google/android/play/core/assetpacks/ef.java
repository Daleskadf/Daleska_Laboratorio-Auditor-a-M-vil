package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class ef {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("PatchSliceTaskHandler");
    private final bh b;
    private final com.google.android.play.core.assetpacks.internal.aq c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ef(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar) {
        this.b = bhVar;
        this.c = aqVar;
    }

    public final void a(ee eeVar) {
        bh bhVar = this.b;
        String str = eeVar.l;
        int i = eeVar.a;
        long j = eeVar.b;
        File h = bhVar.h(str, i, j);
        File file = new File(bhVar.i(str, i, j), eeVar.f);
        try {
            InputStream inputStream = eeVar.h;
            if (eeVar.e == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            bk bkVar = new bk(h, file);
            File p = this.b.p(eeVar.l, eeVar.c, eeVar.d, eeVar.f);
            if (!p.exists()) {
                p.mkdirs();
            }
            em emVar = new em(this.b, eeVar.l, eeVar.c, eeVar.d, eeVar.f);
            com.google.android.play.core.assetpacks.internal.am.a(bkVar, inputStream, new cn(p, emVar), eeVar.g);
            emVar.i(0);
            inputStream.close();
            a.d("Patching and extraction finished for slice %s of pack %s.", eeVar.f, eeVar.l);
            ((y) this.c.a()).g(eeVar.k, eeVar.l, eeVar.f, 0);
            try {
                eeVar.h.close();
            } catch (IOException unused) {
                a.e("Could not close file for slice %s of pack %s.", eeVar.f, eeVar.l);
            }
        } catch (IOException e) {
            a.b("IOException during patching %s.", e.getMessage());
            throw new ck(String.format("Error patching slice %s of pack %s.", eeVar.f, eeVar.l), e, eeVar.k);
        }
    }
}
