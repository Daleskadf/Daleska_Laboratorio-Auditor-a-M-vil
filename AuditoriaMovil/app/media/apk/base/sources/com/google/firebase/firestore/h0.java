package com.google.firebase.firestore;

import D.AbstractC0055e;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class h0 extends r {
    @Override // com.google.firebase.firestore.r
    public final HashMap a(EnumC0815q enumC0815q) {
        boolean z7;
        AbstractC0055e.b(enumC0815q, "Provided serverTimestampBehavior value must not be null.");
        HashMap a7 = super.a(enumC0815q);
        if (a7 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Data in a QueryDocumentSnapshot should be non-null", z7, new Object[0]);
        return a7;
    }

    @Override // com.google.firebase.firestore.r
    public final Map b() {
        boolean z7;
        HashMap a7 = a(EnumC0815q.DEFAULT);
        if (a7 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Data in a QueryDocumentSnapshot should be non-null", z7, new Object[0]);
        return a7;
    }
}
