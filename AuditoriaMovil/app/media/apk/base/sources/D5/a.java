package D5;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f864a;

    /* renamed from: b  reason: collision with root package name */
    public final String f865b;

    /* renamed from: c  reason: collision with root package name */
    public final String f866c;

    public a(String str, String str2) {
        this.f864a = str;
        this.f865b = null;
        this.f866c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f864a.equals(aVar.f864a)) {
            return false;
        }
        return this.f866c.equals(aVar.f866c);
    }

    public final int hashCode() {
        return this.f866c.hashCode() + (this.f864a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f864a);
        sb.append(", function: ");
        return AbstractC0059i.D(sb, this.f866c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f864a = str;
        this.f865b = str2;
        this.f866c = str3;
    }
}
