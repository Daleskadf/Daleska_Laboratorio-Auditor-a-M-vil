package com.google.firebase.firestore;

import j$.util.Objects;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.firebase.firestore.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0802d {

    /* renamed from: a  reason: collision with root package name */
    public final C0818u f9800a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9801b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9802c;

    public AbstractC0802d(C0818u c0818u, String str) {
        String str2;
        this.f9800a = c0818u;
        this.f9801b = str;
        StringBuilder l8 = androidx.datastore.preferences.protobuf.Y.l(str);
        if (c0818u == null) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "_" + c0818u;
        }
        l8.append(str2);
        this.f9802c = l8.toString();
    }

    public final String a() {
        C0818u c0818u = this.f9800a;
        if (c0818u == null) {
            return StringUtils.EMPTY;
        }
        return c0818u.f9851a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0802d)) {
            return false;
        }
        AbstractC0802d abstractC0802d = (AbstractC0802d) obj;
        C0818u c0818u = this.f9800a;
        if (c0818u != null && abstractC0802d.f9800a != null) {
            if (this.f9801b.equals(abstractC0802d.f9801b) && a().equals(abstractC0802d.a())) {
                return true;
            }
            return false;
        } else if (c0818u == null && abstractC0802d.f9800a == null) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f9801b, a());
    }
}
