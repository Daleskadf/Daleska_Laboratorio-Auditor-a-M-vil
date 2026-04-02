package com.google.android.gms.common.api;
/* loaded from: classes.dex */
public final class x extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    public final W2.d f9287a;

    public x(W2.d dVar) {
        this.f9287a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f9287a));
    }
}
