package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.common.api.internal.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0748w extends AbstractBinderC0736j {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0732f f9278a;

    public BinderC0748w(InterfaceC0732f interfaceC0732f) {
        this.f9278a = interfaceC0732f;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0737k
    public final void onResult(Status status) {
        this.f9278a.setResult(status);
    }
}
