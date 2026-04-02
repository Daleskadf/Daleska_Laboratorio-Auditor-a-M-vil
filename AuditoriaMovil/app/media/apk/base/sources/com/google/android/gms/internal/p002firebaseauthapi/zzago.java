package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzago  reason: invalid package */
/* loaded from: classes.dex */
public final class zzago {
    private List<zzagl> zza;

    public zzago() {
        this.zza = new ArrayList();
    }

    public final List<zzagl> zza() {
        return this.zza;
    }

    public zzago(List<zzagl> list) {
        this.zza = DesugarCollections.unmodifiableList(list);
    }
}
