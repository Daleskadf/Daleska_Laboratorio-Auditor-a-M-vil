package X5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: X5.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392s {

    /* renamed from: a  reason: collision with root package name */
    public final F3.o f6530a;

    public C0392s(F3.o pigeonRegistrar, int i7) {
        switch (i7) {
            case 1:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f6530a = pigeonRegistrar;
                return;
            case 2:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f6530a = pigeonRegistrar;
                return;
            case 3:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f6530a = pigeonRegistrar;
                return;
            default:
                kotlin.jvm.internal.j.e(pigeonRegistrar, "pigeonRegistrar");
                this.f6530a = pigeonRegistrar;
                return;
        }
    }

    public m0 a() {
        DisplayManager displayManager = (DisplayManager) ((Context) this.f6530a.f1181e).getSystemService("display");
        ArrayList G2 = F.f.G(displayManager);
        m0 m0Var = new m0(this);
        ArrayList G7 = F.f.G(displayManager);
        G7.removeAll(G2);
        if (!G7.isEmpty()) {
            Iterator it = G7.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new C0389o(0, G7, displayManager), null);
            }
        }
        return m0Var;
    }
}
