package com.fasterxml.jackson.databind.deser.std;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class d extends e0 {
    public d() {
        super(AtomicLong.class);
    }

    @Override // k3.k
    /* renamed from: a */
    public AtomicLong deserialize(c3.k kVar, k3.g gVar) {
        if (kVar.m0()) {
            return new AtomicLong(kVar.Q());
        }
        Long _parseLong = _parseLong(kVar, gVar, AtomicLong.class);
        if (_parseLong == null) {
            return null;
        }
        return new AtomicLong(_parseLong.intValue());
    }

    @Override // k3.k
    public Object getEmptyValue(k3.g gVar) {
        return new AtomicLong();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.e0, k3.k
    public c4.f logicalType() {
        return c4.f.Integer;
    }
}
