package M0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public class u extends i {

    /* renamed from: c  reason: collision with root package name */
    public final int f3206c;

    public u() {
        super(2008);
        this.f3206c = 1;
    }

    public static int a(int i7, int i8) {
        if (i7 == 2000 && i8 == 1) {
            return 2001;
        }
        return i7;
    }

    public static u b(IOException iOException, int i7) {
        int i8;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i8 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i8 = 1004;
        } else if (message != null && AbstractC1740d.A(message).matches("cleartext.*not permitted.*")) {
            i8 = 2007;
        } else {
            i8 = 2001;
        }
        if (i8 == 2007) {
            return new u("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new u(iOException, i8, i7);
    }

    public u(String str, int i7) {
        super(str, a(i7, 1));
        this.f3206c = 1;
    }

    public u(IOException iOException, int i7, int i8) {
        super(iOException, a(i7, i8));
        this.f3206c = i8;
    }

    public u(String str, IOException iOException, int i7) {
        super(str, iOException, a(i7, 1));
        this.f3206c = 1;
    }
}
