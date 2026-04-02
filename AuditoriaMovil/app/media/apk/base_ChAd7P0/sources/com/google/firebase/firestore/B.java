package com.google.firebase.firestore;

import j$.util.Objects;
import java.util.List;
import n4.EnumC1518d;
/* loaded from: classes.dex */
public final class B extends D {

    /* renamed from: a  reason: collision with root package name */
    public final List f9739a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC1518d f9740b;

    public B(List list, EnumC1518d enumC1518d) {
        this.f9739a = list;
        this.f9740b = enumC1518d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        B b5 = (B) obj;
        if (this.f9740b == b5.f9740b && Objects.equals(this.f9739a, b5.f9739a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = 0;
        List list = this.f9739a;
        if (list != null) {
            i7 = list.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * 31;
        EnumC1518d enumC1518d = this.f9740b;
        if (enumC1518d != null) {
            i8 = enumC1518d.hashCode();
        }
        return i9 + i8;
    }
}
