package androidx.print;

import android.app.ApplicationExitInfo;
import android.app.job.JobInfo;
import android.media.AudioFocusRequest;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.os.storage.StorageVolume;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputContentInfo;
import java.util.Map;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class PrintHelper$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo m(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ JobInfo.TriggerContentUri m(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AudioFocusRequest m155m(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo m(String str, int i, int i2) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ StorageVolume m157m(Object obj) {
        return (StorageVolume) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo m(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AutofillId m160m(Object obj) {
        return (AutofillId) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m161m(Object obj) {
        return (ContentCaptureSession) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ InputContentInfo m162m(Object obj) {
        return (InputContentInfo) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ void m166m() {
    }
}
