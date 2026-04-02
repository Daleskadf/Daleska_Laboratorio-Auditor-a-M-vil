package com.google.firebase.firestore;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public Executor f9784a;

    /* renamed from: b  reason: collision with root package name */
    public Q5.c f9785b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && T.class == obj.getClass()) {
            return this.f9785b.equals(((T) obj).f9785b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9785b.hashCode();
    }
}
