package com.fasterxml.jackson.databind.ser.std;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class c extends z {
    public c(c4.j jVar, boolean z10, w3.h hVar, k3.o oVar) {
        super(jVar, z10, hVar, oVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.z
    public z i(Object obj, boolean z10) {
        return new c(this, this.f6749b, this.f6750c, this.f6751d, this.f6752e, obj, z10);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.z
    public z j(k3.d dVar, w3.h hVar, k3.o oVar, d4.q qVar) {
        return new c(this, dVar, hVar, oVar, qVar, this.f6754g, this.f6755h);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.z
    /* renamed from: k */
    public Object e(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.z
    /* renamed from: l */
    public Object f(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.z
    /* renamed from: m */
    public boolean g(AtomicReference atomicReference) {
        if (atomicReference.get() != null) {
            return true;
        }
        return false;
    }

    public c(c cVar, k3.d dVar, w3.h hVar, k3.o oVar, d4.q qVar, Object obj, boolean z10) {
        super(cVar, dVar, hVar, oVar, qVar, obj, z10);
    }
}
