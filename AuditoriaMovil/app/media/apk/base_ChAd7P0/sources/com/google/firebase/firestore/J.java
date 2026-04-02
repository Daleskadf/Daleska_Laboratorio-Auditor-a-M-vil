package com.google.firebase.firestore;

import D.AbstractC0055e;
/* loaded from: classes.dex */
public final class J extends U3.i {

    /* renamed from: a  reason: collision with root package name */
    public final I f9763a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(String str, I i7, Exception exc) {
        super(str, exc);
        com.google.android.gms.common.internal.I.f(str, "Detail message must not be empty");
        AbstractC0055e.b(str, "Provided message must not be null.");
        m5.d.i("A FirebaseFirestoreException should never be thrown for OK", i7 != I.OK, new Object[0]);
        AbstractC0055e.b(i7, "Provided code must not be null.");
        this.f9763a = i7;
    }

    public J(String str, I i7) {
        super(str);
        AbstractC0055e.b(str, "Provided message must not be null.");
        m5.d.i("A FirebaseFirestoreException should never be thrown for OK", i7 != I.OK, new Object[0]);
        AbstractC0055e.b(i7, "Provided code must not be null.");
        this.f9763a = i7;
    }
}
