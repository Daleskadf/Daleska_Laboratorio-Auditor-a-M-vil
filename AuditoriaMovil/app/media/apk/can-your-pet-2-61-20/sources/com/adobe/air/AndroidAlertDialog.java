package com.adobe.air;

import android.app.AlertDialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
/* loaded from: classes.dex */
public class AndroidAlertDialog {
    private static final String LOG_TAG = "AndroidAlertDialog";
    private AlertDialog mAlertDialog = null;
    private AlertDialog.Builder mDialogBuilder;

    public AndroidAlertDialog(Context context) {
        this.mDialogBuilder = null;
        this.mDialogBuilder = new AlertDialog.Builder(context);
    }

    public AlertDialog.Builder GetAlertDialogBuilder() {
        return this.mDialogBuilder;
    }

    public void show() {
        AlertDialog create = this.mDialogBuilder.create();
        this.mAlertDialog = create;
        create.setCanceledOnTouchOutside(false);
        this.mAlertDialog.show();
    }

    public void dismiss() {
        AlertDialog alertDialog = this.mAlertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public Window getWindow() {
        AlertDialog alertDialog = this.mAlertDialog;
        if (alertDialog != null) {
            return alertDialog.getWindow();
        }
        return null;
    }

    public void setFullScreen() {
        if (this.mAlertDialog == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = getWindow();
        if (window == null) {
            return;
        }
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        window.setAttributes(layoutParams);
    }
}
