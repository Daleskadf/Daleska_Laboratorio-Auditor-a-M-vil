package b4;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class K implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f8203a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntegrityManager f8204b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0610s f8205c;

    public K(C0610s c0610s, String str, IntegrityManager integrityManager) {
        this.f8203a = str;
        this.f8204b = integrityManager;
        this.f8205c = c0610s;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            this.f8205c.f8291b = ((zzags) task.getResult()).zza();
            return this.f8204b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzags) task.getResult()).zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f8203a.getBytes("UTF-8")), 11))).build());
        }
        String message = task.getException().getMessage();
        Log.e("s", "Problem retrieving Play Integrity producer project:  " + message);
        return Tasks.forException(task.getException());
    }
}
