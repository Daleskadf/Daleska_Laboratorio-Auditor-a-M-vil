package O;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3449a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3450b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3451c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3452d;

    public a(String str, String str2, String str3, String str4) {
        this.f3449a = str;
        this.f3450b = str2;
        this.f3451c = str3;
        this.f3452d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3449a.equals(aVar.f3449a) && this.f3450b.equals(aVar.f3450b) && this.f3451c.equals(aVar.f3451c) && this.f3452d.equals(aVar.f3452d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3449a.hashCode() ^ 1000003) * 1000003) ^ this.f3450b.hashCode()) * 1000003) ^ this.f3451c.hashCode()) * 1000003) ^ this.f3452d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.f3449a);
        sb.append(", eglVersion=");
        sb.append(this.f3450b);
        sb.append(", glExtensions=");
        sb.append(this.f3451c);
        sb.append(", eglExtensions=");
        return AbstractC0059i.D(sb, this.f3452d, "}");
    }
}
