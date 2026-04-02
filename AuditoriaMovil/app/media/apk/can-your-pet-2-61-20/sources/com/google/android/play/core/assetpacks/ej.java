package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class ej {
    private final bh a;
    private final de b;
    private final co c;
    private final com.google.android.play.core.assetpacks.internal.aq d;
    private final com.google.android.play.core.assetpacks.internal.aq e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ej(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, de deVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, co coVar) {
        this.a = bhVar;
        this.d = aqVar;
        this.b = deVar;
        this.e = aqVar2;
        this.c = coVar;
    }

    public final void a(final eh ehVar) {
        File h = this.a.h(ehVar.l, ehVar.a, ehVar.c);
        if (!h.exists()) {
            throw new ck(String.format("Cannot find pack files to promote for pack %s at %s", ehVar.l, h.getAbsolutePath()), ehVar.k);
        }
        File h2 = this.a.h(ehVar.l, ehVar.b, ehVar.c);
        h2.mkdirs();
        if (!h.renameTo(h2)) {
            throw new ck(String.format("Cannot promote pack %s from %s to %s", ehVar.l, h.getAbsolutePath(), h2.getAbsolutePath()), ehVar.k);
        }
        ((Executor) this.e.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.ei
            @Override // java.lang.Runnable
            public final void run() {
                ej.this.b(ehVar);
            }
        });
        this.b.k(ehVar.l, ehVar.b, ehVar.c);
        this.c.c(ehVar.l);
        ((y) this.d.a()).h(ehVar.k, ehVar.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(eh ehVar) {
        this.a.B(ehVar.l, ehVar.b, ehVar.c);
    }
}
