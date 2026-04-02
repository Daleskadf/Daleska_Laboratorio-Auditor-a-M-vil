package b4;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
/* renamed from: b4.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0613v implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8299a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Uri f8300b;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f8299a) {
            case 0:
                H h8 = GenericIdpActivity.f9728u0;
                Uri.Builder buildUpon = this.f8300b.buildUpon();
                if (task.isSuccessful()) {
                    X3.b bVar = (X3.b) task.getResult();
                    U3.i iVar = bVar.f6377b;
                    if (iVar != null) {
                        Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(iVar)));
                    }
                    buildUpon.fragment("fac=" + bVar.f6376a);
                } else {
                    String message = task.getException().getMessage();
                    Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + message);
                }
                return buildUpon.build();
            default:
                H h9 = RecaptchaActivity.f9731u0;
                Uri.Builder buildUpon2 = this.f8300b.buildUpon();
                if (task.isSuccessful()) {
                    X3.b bVar2 = (X3.b) task.getResult();
                    U3.i iVar2 = bVar2.f6377b;
                    if (iVar2 != null) {
                        Log.w("RecaptchaActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(iVar2)));
                    }
                    buildUpon2.fragment("fac=" + bVar2.f6376a);
                } else {
                    String message2 = task.getException().getMessage();
                    Log.e("RecaptchaActivity", "Unexpected error getting App Check token: " + message2);
                }
                return buildUpon2.build();
        }
    }
}
