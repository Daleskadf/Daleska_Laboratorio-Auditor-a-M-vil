package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class co {
    private final Map a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized double a(String str) {
        Double d = (Double) this.a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized double b(String str, dg dgVar) {
        double d;
        d = (((ce) dgVar).f + 1.0d) / ((ce) dgVar).g;
        this.a.put(str, Double.valueOf(d));
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(String str) {
        this.a.put(str, Double.valueOf(0.0d));
    }
}
