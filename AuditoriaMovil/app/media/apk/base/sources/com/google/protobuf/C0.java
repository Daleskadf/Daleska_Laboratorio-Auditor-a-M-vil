package com.google.protobuf;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class C0 extends AbstractC0844i {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.firebase.firestore.i0 f9993a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC0844i f9994b = b();

    public C0(D0 d02) {
        this.f9993a = new com.google.firebase.firestore.i0(d02);
    }

    @Override // com.google.protobuf.AbstractC0844i
    public final byte a() {
        AbstractC0844i abstractC0844i = this.f9994b;
        if (abstractC0844i != null) {
            byte a7 = abstractC0844i.a();
            if (!this.f9994b.hasNext()) {
                this.f9994b = b();
            }
            return a7;
        }
        throw new NoSuchElementException();
    }

    public final C0842h b() {
        com.google.firebase.firestore.i0 i0Var = this.f9993a;
        if (i0Var.hasNext()) {
            return new C0842h(i0Var.a());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9994b != null) {
            return true;
        }
        return false;
    }
}
