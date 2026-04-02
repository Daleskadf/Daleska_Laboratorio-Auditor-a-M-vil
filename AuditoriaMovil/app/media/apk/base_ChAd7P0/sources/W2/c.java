package W2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.I;
/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public AlertDialog f6163a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnCancelListener f6164b;

    /* renamed from: c  reason: collision with root package name */
    public AlertDialog f6165c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6164b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f6163a;
        if (alertDialog == null) {
            setShowsDialog(false);
            if (this.f6165c == null) {
                Activity activity = getActivity();
                I.i(activity);
                this.f6165c = new AlertDialog.Builder(activity).create();
            }
            return this.f6165c;
        }
        return alertDialog;
    }
}
