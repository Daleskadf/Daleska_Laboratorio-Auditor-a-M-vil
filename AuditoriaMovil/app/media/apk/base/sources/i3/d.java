package i3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
/* loaded from: classes.dex */
public final class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f11476a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f11477b;

    public d(Context context, Intent intent) {
        this.f11476a = context;
        this.f11477b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f11476a.startActivity(this.f11477b);
        } catch (ActivityNotFoundException e7) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e7);
        }
    }
}
