package A4;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f212a;

    /* renamed from: b  reason: collision with root package name */
    public final String f213b;

    public a(String str, String str2) {
        this.f212a = str;
        if (str2 != null) {
            this.f213b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f212a.equals(aVar.f212a) && this.f213b.equals(aVar.f213b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f212a.hashCode() ^ 1000003) * 1000003) ^ this.f213b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f212a);
        sb.append(", version=");
        return AbstractC0059i.D(sb, this.f213b, "}");
    }
}
