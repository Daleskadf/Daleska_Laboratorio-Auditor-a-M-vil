package b4;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.util.List;
import p.C1608t;
/* renamed from: b4.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0614w implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8301a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f8302b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f8303c;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8301a) {
            case 0:
                H h8 = GenericIdpActivity.f9728u0;
                Intent intent = new Intent("android.intent.action.VIEW");
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f8303c;
                ResolveInfo resolveActivity = genericIdpActivity.getPackageManager().resolveActivity(intent, 0);
                String str = (String) this.f8302b;
                if (resolveActivity != null) {
                    List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        C1608t e7 = new K5.d(5).e();
                        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                        Intent intent2 = (Intent) e7.f14880b;
                        intent2.setData((Uri) task.getResult());
                        X.d.startActivity(genericIdpActivity, intent2, (Bundle) e7.f14881c);
                        return;
                    }
                    Intent intent3 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent3.putExtra("com.android.browser.application_id", str);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                    intent3.addFlags(1073741824);
                    intent3.addFlags(268435456);
                    genericIdpActivity.startActivity(intent3);
                    return;
                }
                Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                zzadv.zzb(genericIdpActivity, str);
                return;
            case 1:
                H h9 = RecaptchaActivity.f9731u0;
                Intent intent4 = new Intent("android.intent.action.VIEW");
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f8303c;
                ResolveInfo resolveActivity2 = recaptchaActivity.getPackageManager().resolveActivity(intent4, 0);
                String str2 = (String) this.f8302b;
                if (resolveActivity2 != null) {
                    List<ResolveInfo> queryIntentServices2 = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices2 != null && !queryIntentServices2.isEmpty()) {
                        C1608t e8 = new K5.d(5).e();
                        Intent intent5 = (Intent) e8.f14880b;
                        intent5.addFlags(1073741824);
                        intent5.addFlags(268435456);
                        intent5.setData((Uri) task.getResult());
                        X.d.startActivity(recaptchaActivity, intent5, (Bundle) e8.f14881c);
                        return;
                    }
                    Intent intent6 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent6.putExtra("com.android.browser.application_id", str2);
                    intent6.addFlags(1073741824);
                    intent6.addFlags(268435456);
                    recaptchaActivity.startActivity(intent6);
                    return;
                }
                Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                zzadv.zzb(recaptchaActivity, str2);
                return;
            default:
                w3.d dVar = (w3.d) this.f8303c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f8302b;
                synchronized (dVar.f) {
                    dVar.f16349e.remove(taskCompletionSource);
                }
                return;
        }
    }

    public /* synthetic */ C0614w(w3.d dVar, TaskCompletionSource taskCompletionSource) {
        this.f8301a = 2;
        this.f8303c = dVar;
        this.f8302b = taskCompletionSource;
    }
}
