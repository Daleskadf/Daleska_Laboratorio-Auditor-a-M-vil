package com.google.android.play.core.assetpacks;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class cf {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("ExtractChunkTaskHandler");
    private final byte[] b = new byte[8192];
    private final bh c;
    private final co d;
    private final ea e;
    private final com.google.android.play.core.assetpacks.internal.aq f;
    private final com.google.android.play.core.assetpacks.internal.aq g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cf(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, co coVar, ea eaVar) {
        this.c = bhVar;
        this.f = aqVar;
        this.g = aqVar2;
        this.d = coVar;
        this.e = eaVar;
    }

    private final File b(ce ceVar) {
        File p = this.c.p(ceVar.l, ceVar.a, ceVar.b, ceVar.d);
        if (!p.exists()) {
            p.mkdirs();
        }
        return p;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)|4|5|6|(1:8)(2:127|128)|9|10|11|(2:13|(14:15|16|17|(1:(1:(2:21|(1:23)(2:87|88))(2:89|90))(2:91|(10:93|(7:26|(4:27|(2:31|(1:40)(4:35|(1:37)|38|39))|41|(1:43)(1:67))|45|46|(1:48)|49|(2:51|(1:53)(2:54|(1:56)(3:57|(2:59|(1:61)(2:63|64))(1:66)|62))))|68|69|(2:81|82)|71|72|73|74|(2:76|77)(1:78))(2:94|95)))(2:96|(4:98|(4:99|(1:101)|102|(1:1)(1:105))|107|(3:109|110|111))(2:114|115))|24|(0)|68|69|(0)|71|72|73|74|(0)(0))(2:120|121))|122|(0)|68|69|(0)|71|72|73|74|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ff, code lost:
        com.google.android.play.core.assetpacks.cf.a.e("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r23.f), r23.d, r23.l);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b A[Catch: all -> 0x0297, TryCatch #3 {all -> 0x0297, blocks: (B:57:0x018b, B:58:0x0194, B:60:0x019e, B:62:0x01a4, B:64:0x01aa, B:66:0x01b0, B:68:0x01d4, B:69:0x01e0, B:70:0x01e4, B:71:0x01eb, B:73:0x01f1, B:75:0x01f7, B:77:0x01fd, B:78:0x020d, B:80:0x0213, B:82:0x0219, B:83:0x022c, B:85:0x0232, B:86:0x0241, B:88:0x0247, B:94:0x0288, B:91:0x026f, B:92:0x0276, B:93:0x0277, B:50:0x0156, B:51:0x015b, B:52:0x0165, B:53:0x0166, B:54:0x0186), top: B:129:0x0041 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.play.core.assetpacks.em] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.play.core.assetpacks.ce r23) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.cf.a(com.google.android.play.core.assetpacks.ce):void");
    }
}
