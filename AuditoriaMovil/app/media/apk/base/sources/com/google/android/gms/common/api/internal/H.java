package com.google.android.gms.common.api.internal;

import a6.t0;
import java.util.Arrays;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final C0728b f9186a;

    /* renamed from: b  reason: collision with root package name */
    public final W2.d f9187b;

    public /* synthetic */ H(C0728b c0728b, W2.d dVar) {
        this.f9186a = c0728b;
        this.f9187b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof H)) {
            H h8 = (H) obj;
            if (com.google.android.gms.common.internal.I.m(this.f9186a, h8.f9186a) && com.google.android.gms.common.internal.I.m(this.f9187b, h8.f9187b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9186a, this.f9187b});
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(this.f9186a, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        t0Var.m(this.f9187b, "feature");
        return t0Var.toString();
    }
}
