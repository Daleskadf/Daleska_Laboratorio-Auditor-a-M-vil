package A;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.InterfaceC0500b0;
import java.util.ArrayList;
import java.util.Iterator;
import z.AbstractC2038a;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f0a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1b;

    public a(m mVar, int i7) {
        boolean z7;
        boolean z8;
        switch (i7) {
            case 1:
                mVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) mVar.f28b).iterator();
                while (it.hasNext()) {
                    InterfaceC0500b0 interfaceC0500b0 = (InterfaceC0500b0) it.next();
                    if (CaptureIntentPreviewQuirk.class.isAssignableFrom(interfaceC0500b0.getClass())) {
                        arrayList.add(interfaceC0500b0);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        z7 = ((CaptureIntentPreviewQuirk) it2.next()).a();
                    }
                }
                this.f0a = z7;
                this.f1b = mVar.T(ImageCaptureFailedForVideoSnapshotQuirk.class);
                return;
            default:
                this.f0a = mVar.T(ImageCaptureFailWithAutoFlashQuirk.class);
                if (AbstractC2038a.f16621a.a0(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f1b = z8;
                return;
        }
    }
}
