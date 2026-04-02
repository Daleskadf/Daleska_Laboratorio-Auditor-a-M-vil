package z0;

import android.app.Dialog;
import android.content.DialogInterface;
/* renamed from: z0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnDismissListenerC2055o implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f16782a;

    public DialogInterface$OnDismissListenerC2055o(r rVar) {
        this.f16782a = rVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        r rVar = this.f16782a;
        Dialog dialog = rVar.f16795W0;
        if (dialog != null) {
            rVar.onDismiss(dialog);
        }
    }
}
