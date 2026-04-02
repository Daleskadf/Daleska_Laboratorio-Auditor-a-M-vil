package S6;

import java.io.IOException;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class e extends IOException {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f5280b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Serializable f5281a;

    public e(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f5281a = serializable;
    }

    @Override // java.lang.Throwable
    /* renamed from: a */
    public final synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}
