package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
/* loaded from: classes.dex */
public class k extends androidx.fragment.app.d {
    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        return new j(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.d
    public void setupDialog(Dialog dialog, int i10) {
        if (dialog instanceof j) {
            j jVar = (j) dialog;
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            jVar.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i10);
    }
}
