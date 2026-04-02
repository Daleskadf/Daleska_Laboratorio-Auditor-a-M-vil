package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;
/* loaded from: classes.dex */
public final class B implements com.google.android.gms.common.api.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f9162a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f9163b;

    public B(D d7, BasePendingResult basePendingResult) {
        this.f9163b = d7;
        this.f9162a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(Status status) {
        ((Map) this.f9163b.f9166a).remove(this.f9162a);
    }
}
