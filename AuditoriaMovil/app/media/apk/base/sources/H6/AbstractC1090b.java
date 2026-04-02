package h6;

import H4.W;
import a6.C0475d;
import java.util.logging.Logger;
/* renamed from: h6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1090b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0475d f11344a;

    static {
        Logger.getLogger(AbstractC1090b.class.getName());
        if (!W.x(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f11344a = new C0475d("internal-stub-type", 0);
    }
}
