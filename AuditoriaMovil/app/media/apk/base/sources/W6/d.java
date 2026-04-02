package W6;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class d extends c {
    private final Serializable tag;

    public d(InputStream inputStream) {
        super(inputStream);
        this.tag = UUID.randomUUID();
    }

    @Override // W6.c
    public void handleIOException(IOException iOException) {
        throw new S6.e(iOException, this.tag);
    }

    public boolean isCauseOf(Throwable th) {
        Serializable serializable = this.tag;
        int i7 = S6.e.f5280b;
        if (serializable != null && (th instanceof S6.e) && serializable.equals(((S6.e) th).f5281a)) {
            return true;
        }
        return false;
    }

    public void throwIfCauseOf(Throwable th) {
        Serializable serializable = this.tag;
        int i7 = S6.e.f5280b;
        if (serializable != null && (th instanceof S6.e) && serializable.equals(((S6.e) th).f5281a)) {
            throw ((S6.e) th).getCause();
        }
    }
}
