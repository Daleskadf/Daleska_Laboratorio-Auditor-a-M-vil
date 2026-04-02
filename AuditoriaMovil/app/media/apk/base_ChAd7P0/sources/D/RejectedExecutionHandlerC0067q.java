package D;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
/* renamed from: D.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RejectedExecutionHandlerC0067q implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        org.slf4j.helpers.i.t("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
