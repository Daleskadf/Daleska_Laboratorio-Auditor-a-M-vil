package com.google.protobuf;

import java.util.Map;
/* loaded from: classes.dex */
public final class K0 implements Map.Entry, Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final Comparable f10017a;

    /* renamed from: b  reason: collision with root package name */
    public Object f10018b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ G0 f10019c;

    public K0(G0 g02, Comparable comparable, Object obj) {
        this.f10019c = g02;
        this.f10017a = comparable;
        this.f10018b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10017a.compareTo(((K0) obj).f10017a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f10017a;
        if (comparable == null) {
            if (key == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.f10018b;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    equals2 = true;
                } else {
                    equals2 = false;
                }
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10017a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10018b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Comparable comparable = this.f10017a;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f10018b;
        if (obj != null) {
            i7 = obj.hashCode();
        }
        return i7 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f10019c.b();
        Object obj2 = this.f10018b;
        this.f10018b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f10017a + "=" + this.f10018b;
    }
}
