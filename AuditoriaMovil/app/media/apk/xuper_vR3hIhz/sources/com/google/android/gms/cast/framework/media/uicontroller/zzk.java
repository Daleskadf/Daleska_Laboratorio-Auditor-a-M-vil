package com.google.android.gms.cast.framework.media.uicontroller;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzk implements View.OnClickListener {
    final /* synthetic */ UIMediaController zza;

    public zzk(UIMediaController uIMediaController) {
        this.zza = uIMediaController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.onClosedCaptionClicked(view);
    }
}
