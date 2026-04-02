package androidx.camera.core.impl;

import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7609a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f7610b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f7611c;

    public c0(boolean z7, HashSet hashSet, HashSet hashSet2) {
        Set hashSet3;
        Set hashSet4;
        this.f7609a = z7;
        if (hashSet == null) {
            hashSet3 = Collections.emptySet();
        } else {
            hashSet3 = new HashSet(hashSet);
        }
        this.f7610b = hashSet3;
        if (hashSet2 == null) {
            hashSet4 = Collections.emptySet();
        } else {
            hashSet4 = new HashSet(hashSet2);
        }
        this.f7611c = hashSet4;
    }

    public final boolean a(Class cls, boolean z7) {
        if (this.f7610b.contains(cls)) {
            return true;
        }
        if (this.f7611c.contains(cls)) {
            return false;
        }
        if (this.f7609a && z7) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        c0 c0Var = (c0) obj;
        if (this.f7609a != c0Var.f7609a || !Objects.equals(this.f7610b, c0Var.f7610b) || !Objects.equals(this.f7611c, c0Var.f7611c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f7609a), this.f7610b, this.f7611c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f7609a + ", forceEnabledQuirks=" + this.f7610b + ", forceDisabledQuirks=" + this.f7611c + '}';
    }
}
