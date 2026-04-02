package com.dexterous.flutterlocalnotifications;

import L5.q;
import java.io.Serializable;
import java.util.HashMap;
import u5.InterfaceC1875c;
/* loaded from: classes.dex */
public final class c implements i, InterfaceC1875c {

    /* renamed from: a  reason: collision with root package name */
    public final q f9075a;

    @Override // com.dexterous.flutterlocalnotifications.i
    public void A() {
        this.f9075a.b(null, "permissionRequestInProgress", "Another permission request is already in progress");
    }

    @Override // u5.InterfaceC1875c
    public void f(Serializable serializable) {
        this.f9075a.a(serializable);
    }

    @Override // u5.InterfaceC1875c
    public void j(String str, HashMap hashMap) {
        this.f9075a.b(hashMap, "sqlite_error", str);
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void v(boolean z7) {
        this.f9075a.a(Boolean.valueOf(z7));
    }
}
