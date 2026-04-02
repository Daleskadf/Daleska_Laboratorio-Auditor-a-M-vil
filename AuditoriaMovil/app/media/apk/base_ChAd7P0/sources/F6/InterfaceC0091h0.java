package F6;

import java.util.concurrent.CancellationException;
/* renamed from: F6.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0091h0 extends n6.g {
    InterfaceC0103p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    D6.d getChildren();

    InterfaceC0091h0 getParent();

    S invokeOnCompletion(w6.l lVar);

    S invokeOnCompletion(boolean z7, boolean z8, w6.l lVar);

    boolean isActive();

    Object join(n6.d dVar);

    boolean start();
}
