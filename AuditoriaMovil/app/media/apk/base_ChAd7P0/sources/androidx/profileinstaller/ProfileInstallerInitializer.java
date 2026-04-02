package androidx.profileinstaller;

import D.RunnableC0053c;
import W1.h;
import android.content.Context;
import android.os.Build;
import b2.InterfaceC0579b;
import f5.C0993a;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0579b {
    @Override // b2.InterfaceC0579b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // b2.InterfaceC0579b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C0993a(11);
        }
        h.a(new RunnableC0053c(19, this, context.getApplicationContext()));
        return new C0993a(11);
    }
}
