package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class an extends al {
    /* JADX INFO: Access modifiers changed from: package-private */
    public an(aw awVar, TaskCompletionSource taskCompletionSource) {
        super(awVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void e(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.e(bundle, bundle2);
        this.a.trySetResult((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
