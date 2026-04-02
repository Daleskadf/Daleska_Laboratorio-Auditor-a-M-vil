package com.google.firebase.firestore;

import D.AbstractC0055e;
import D.AbstractC0059i;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
/* renamed from: com.google.firebase.firestore.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818u {

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f9849b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: c  reason: collision with root package name */
    public static final C0818u f9850c = new C0818u(q4.k.f15360b);

    /* renamed from: a  reason: collision with root package name */
    public final q4.k f9851a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0818u(List list) {
        this.f9851a = list.isEmpty() ? q4.k.f15361c : new q4.e(list);
    }

    public static C0818u a(String str) {
        AbstractC0055e.b(str, "Provided field path must not be null.");
        AbstractC0055e.a("Use FieldPath.of() for field names containing '~*/[]'.", !f9849b.matcher(str).find(), new Object[0]);
        try {
            return b(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(AbstractC0059i.M("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
    }

    public static C0818u b(String... strArr) {
        boolean z7;
        boolean z8;
        if (strArr.length > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0055e.a("Invalid field path. Provided path must not be empty.", z7, new Object[0]);
        int i7 = 0;
        while (i7 < strArr.length) {
            String str = strArr[i7];
            if (str != null && !str.isEmpty()) {
                z8 = true;
            } else {
                z8 = false;
            }
            StringBuilder sb = new StringBuilder("Invalid field name at argument ");
            i7++;
            sb.append(i7);
            sb.append(". Field names must not be null or empty.");
            AbstractC0055e.a(sb.toString(), z8, new Object[0]);
        }
        return new C0818u(Arrays.asList(strArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0818u.class == obj.getClass()) {
            return this.f9851a.equals(((C0818u) obj).f9851a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9851a.hashCode();
    }

    public final String toString() {
        return this.f9851a.c();
    }

    public C0818u(q4.k kVar) {
        this.f9851a = kVar;
    }
}
