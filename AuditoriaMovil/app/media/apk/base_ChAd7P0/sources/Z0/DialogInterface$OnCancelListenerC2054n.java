package z0;

import android.app.Dialog;
import android.content.DialogInterface;
/* renamed from: z0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnCancelListenerC2054n implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f16781a;

    public DialogInterface$OnCancelListenerC2054n(r rVar) {
        this.f16781a = rVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        r rVar = this.f16781a;
        Dialog dialog = rVar.f16795W0;
        if (dialog != null) {
            rVar.onCancel(dialog);
        }
    }
}
