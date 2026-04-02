package io.flutter.plugin.editing;

import android.graphics.Bitmap;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ void D(AutofillManager autofillManager) {
        autofillManager.cancel();
    }

    public static /* bridge */ /* synthetic */ long a(Path path) {
        return Files.size(path);
    }

    public static /* bridge */ /* synthetic */ Bitmap.Config b() {
        return Bitmap.Config.HARDWARE;
    }

    public static /* bridge */ /* synthetic */ File e(Path path) {
        return path.toFile();
    }

    public static /* bridge */ /* synthetic */ void q(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setHintText(charSequence);
    }

    public static /* bridge */ /* synthetic */ void t(AutofillManager autofillManager) {
        autofillManager.commit();
    }

    public static /* bridge */ /* synthetic */ void u(Process process) {
        process.destroyForcibly();
    }
}
