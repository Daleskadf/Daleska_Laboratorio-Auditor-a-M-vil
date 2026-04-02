package W2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import com.google.android.gms.common.internal.I;
import z0.AbstractActivityC2064y;
import z0.C2063x;
/* loaded from: classes.dex */
public class k extends z0.r {

    /* renamed from: b1  reason: collision with root package name */
    public AlertDialog f6182b1;

    /* renamed from: c1  reason: collision with root package name */
    public DialogInterface.OnCancelListener f6183c1;

    /* renamed from: d1  reason: collision with root package name */
    public AlertDialog f6184d1;

    @Override // z0.r
    public final Dialog I() {
        AbstractActivityC2064y abstractActivityC2064y;
        AlertDialog alertDialog = this.f6182b1;
        if (alertDialog == null) {
            this.f16791S0 = false;
            if (this.f6184d1 == null) {
                C2063x c2063x = this.f16841o0;
                if (c2063x == null) {
                    abstractActivityC2064y = null;
                } else {
                    abstractActivityC2064y = c2063x.f16857e;
                }
                I.i(abstractActivityC2064y);
                this.f6184d1 = new AlertDialog.Builder(abstractActivityC2064y).create();
            }
            return this.f6184d1;
        }
        return alertDialog;
    }

    @Override // z0.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6183c1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
