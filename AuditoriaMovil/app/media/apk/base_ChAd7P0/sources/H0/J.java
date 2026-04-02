package H0;

import D.AbstractC0059i;
import java.io.IOException;
/* loaded from: classes.dex */
public class J extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1696a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1697b;

    public J(String str, Exception exc, boolean z7, int i7) {
        super(str, exc);
        this.f1696a = z7;
        this.f1697b = i7;
    }

    public static J a(RuntimeException runtimeException, String str) {
        return new J(str, runtimeException, true, 1);
    }

    public static J b(String str, Exception exc) {
        return new J(str, exc, true, 4);
    }

    public static J c(String str) {
        return new J(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.f1696a);
        sb.append(", dataType=");
        return AbstractC0059i.B(sb, this.f1697b, "}");
    }
}
