package org.apache.tika.exception;

import io.flutter.plugins.pathprovider.b;
import org.xml.sax.SAXException;
/* loaded from: classes.dex */
public class WriteLimitReachedException extends SAXException {
    private static final int MAX_DEPTH = 100;
    private final int writeLimit;

    public WriteLimitReachedException(int i7) {
        this.writeLimit = i7;
    }

    public static boolean isWriteLimitReached(Throwable th) {
        return isWriteLimitReached(th, 0);
    }

    public static void throwIfWriteLimitReached(Exception exc) {
        throwIfWriteLimitReached(exc, 0);
    }

    @Override // org.xml.sax.SAXException, java.lang.Throwable
    public String getMessage() {
        return b.f("Your document contained more than ", this.writeLimit, " characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).");
    }

    private static boolean isWriteLimitReached(Throwable th, int i7) {
        if (th != null && i7 <= MAX_DEPTH) {
            if (th instanceof WriteLimitReachedException) {
                return true;
            }
            return isWriteLimitReached(th.getCause(), i7 + 1);
        }
        return false;
    }

    private static void throwIfWriteLimitReached(Throwable th, int i7) {
        if (th != null && i7 <= MAX_DEPTH) {
            if (!(th instanceof WriteLimitReachedException)) {
                throwIfWriteLimitReached(th.getCause(), i7 + 1);
                return;
            }
            throw ((SAXException) th);
        }
    }
}
