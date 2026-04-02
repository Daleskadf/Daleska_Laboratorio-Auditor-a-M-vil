package m5;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.C0765n;
import com.google.android.gms.common.internal.I;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import l5.C1423a;
import org.apache.tika.utils.StringUtils;
/* renamed from: m5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1439a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0765n f14049c = new C0765n("StreamingFormatChecker", StringUtils.EMPTY);

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f14050a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public long f14051b = -1;

    public final void a(C1423a c1423a) {
        if (c1423a.f != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.f14050a;
        linkedList.add(Long.valueOf(elapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l8 = (Long) linkedList.peekFirst();
            I.i(l8);
            if (elapsedRealtime - l8.longValue() < 5000) {
                long j = this.f14051b;
                if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f14051b = elapsedRealtime;
                    C0765n c0765n = f14049c;
                    if (Log.isLoggable(c0765n.f9383a, 5)) {
                        Log.w("StreamingFormatChecker", c0765n.c("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."));
                    }
                }
            }
        }
    }
}
