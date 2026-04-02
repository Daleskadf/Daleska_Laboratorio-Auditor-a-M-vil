package B5;

import android.media.metrics.PlaybackMetrics;
import android.view.textservice.TextServicesManager;
import java.util.List;
/* renamed from: B5.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0048v {
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder k(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* bridge */ /* synthetic */ List m(TextServicesManager textServicesManager) {
        return textServicesManager.getEnabledSpellCheckerInfos();
    }

    public static /* bridge */ /* synthetic */ boolean u(TextServicesManager textServicesManager) {
        return textServicesManager.isSpellCheckerEnabled();
    }
}
