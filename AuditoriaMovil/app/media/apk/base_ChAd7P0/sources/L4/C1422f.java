package l4;

import D.AbstractC0059i;
/* renamed from: l4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422f {

    /* renamed from: b  reason: collision with root package name */
    public static final C1422f f13856b = new C1422f(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f13857a;

    public C1422f(String str) {
        this.f13857a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1422f.class != obj.getClass()) {
            return false;
        }
        String str = ((C1422f) obj).f13857a;
        String str2 = this.f13857a;
        if (str2 != null) {
            return str2.equals(str);
        }
        if (str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13857a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC0059i.D(new StringBuilder("User(uid:"), this.f13857a, ")");
    }
}
