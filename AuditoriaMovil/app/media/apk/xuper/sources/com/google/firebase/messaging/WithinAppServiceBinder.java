package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    /* loaded from: classes2.dex */
    public interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public void send(final WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable(Constants.TAG, 3);
            this.intentHandler.handle(bindRequest.intent).addOnCompleteListener(new c(), new OnCompleteListener() { // from class: com.google.firebase.messaging.g0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    WithinAppServiceConnection.BindRequest.this.finish();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
