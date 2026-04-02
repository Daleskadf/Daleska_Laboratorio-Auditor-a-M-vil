package b4;

import a4.C0462k;
import a4.C0465n;
import a4.C0468q;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.internal.p002firebaseauthapi.zzafa;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import org.apache.tika.utils.StringUtils;
/* renamed from: b4.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610s implements Continuation {

    /* renamed from: c  reason: collision with root package name */
    public static final C0610s f8289c = new C0610s(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8290a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8291b;

    public /* synthetic */ C0610s(int i7) {
        this.f8290a = i7;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, A.l] */
    public static void b(FirebaseAuth firebaseAuth, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task forException;
        if (activity == null) {
            taskCompletionSource.setException(new C0462k("ERROR_MISSING_ACTIVITY", "App verification failed - a valid Activity is required to complete the Recaptcha flow"));
            return;
        }
        U3.h hVar = firebaseAuth.f9703a;
        hVar.a();
        C0587A.b(hVar.f5749a, firebaseAuth);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (A.l.f23c == null) {
            ?? obj = new Object();
            obj.f25a = false;
            A.l.f23c = obj;
        }
        A.l lVar = A.l.f23c;
        if (!lVar.f25a) {
            lVar.q(activity, new C0612u(lVar, activity, taskCompletionSource2));
            lVar.f25a = true;
            new zzafa(firebaseAuth, activity).zza();
            forException = taskCompletionSource2.getTask();
        } else {
            forException = Tasks.forException(zzadr.zza(new Status(17057, "reCAPTCHA flow already in progress", null, null)));
        }
        forException.addOnSuccessListener(new L(1, taskCompletionSource)).addOnFailureListener(new C0606n(taskCompletionSource, 1));
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, b4.b, com.google.android.gms.tasks.OnCompleteListener] */
    public Task a(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z7, boolean z8, boolean z9, RecaptchaAction recaptchaAction) {
        boolean z10;
        Task task;
        C0597e c0597e = firebaseAuth.f9708g;
        H h8 = H.f8195c;
        if (!zzafm.zza(firebaseAuth.f9703a) && !c0597e.f8246a) {
            Log.i("s", "ForceRecaptchaV2Flow from phoneAuthOptions = " + z8 + ", ForceRecaptchav2Flow from firebaseSettings = " + c0597e.f8247b);
            if (!z8 && !c0597e.f8247b) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean z11 = z10;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            C0587A c0587a = h8.f8196a;
            c0587a.getClass();
            if (System.currentTimeMillis() - c0587a.f8178b < 3600000) {
                task = c0587a.f8177a;
            } else {
                task = null;
            }
            if (task != null) {
                if (task.isSuccessful()) {
                    return Tasks.forResult(new N((String) task.getResult(), null, null));
                }
                Log.e("s", "Error in previous reCAPTCHAV2 flow: " + task.getException().getMessage());
                Log.e("s", "Continuing with application verification as normal");
            }
            if (!z11 && !z9) {
                Task c8 = firebaseAuth.c();
                ?? obj = new Object();
                obj.f8230a = this;
                obj.f8231b = taskCompletionSource;
                obj.f8232c = firebaseAuth;
                obj.f8233d = recaptchaAction;
                obj.f8234e = str;
                obj.f = activity;
                obj.f8235g = z7;
                obj.f8236h = h8;
                c8.addOnCompleteListener(obj);
            } else {
                c(firebaseAuth, str, activity, z7, z11, h8, taskCompletionSource);
            }
            return taskCompletionSource.getTask();
        }
        return Tasks.forResult(new N(null, null, null));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [b4.J, java.lang.Object, com.google.android.gms.tasks.OnCompleteListener] */
    public void c(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z7, boolean z8, H h8, TaskCompletionSource taskCompletionSource) {
        Task<zzags> zza;
        if (z7 && !z8) {
            U3.h hVar = firebaseAuth.f9703a;
            hVar.a();
            IntegrityManager create = IntegrityManagerFactory.create(hVar.f5749a);
            if (!TextUtils.isEmpty((String) this.f8291b)) {
                zza = Tasks.forResult(new zzags((String) this.f8291b));
            } else {
                zza = firebaseAuth.f9707e.zza();
            }
            Task<TContinuationResult> continueWithTask = zza.continueWithTask(firebaseAuth.f9726z, new K(this, str, create));
            ?? obj = new Object();
            obj.f8199a = this;
            obj.f8200b = taskCompletionSource;
            obj.f8201c = firebaseAuth;
            obj.f8202d = activity;
            continueWithTask.addOnCompleteListener(obj);
            return;
        }
        b(firebaseAuth, activity, taskCompletionSource);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [b4.k, java.lang.Object] */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f8290a) {
            case 1:
                if (!task.isSuccessful()) {
                    return Tasks.forException(task.getException());
                }
                String str = ((C0468q) task.getResult()).f7043a;
                com.google.android.gms.common.internal.I.e(str);
                ?? obj = new Object();
                obj.f8270a = str;
                obj.f8274e = ((C0601i) this.f8291b).f8264a;
                return Tasks.forResult(obj);
            case 2:
                a4.K k2 = ((C0602j) this.f8291b).f8268d;
                if (k2 != null) {
                    if (task.isSuccessful()) {
                        W w2 = (W) task.getResult();
                        return Tasks.forResult(new W(w2.f8227a, w2.f8228b, k2));
                    }
                    Exception exception = task.getException();
                    if (exception instanceof C0465n) {
                        ((C0465n) exception).f7040b = k2;
                    }
                    return Tasks.forException(exception);
                }
                return task;
            case 3:
                boolean isSuccessful = task.isSuccessful();
                m5.d dVar = (m5.d) this.f8291b;
                if (!isSuccessful) {
                    Exception exception2 = task.getException();
                    com.google.android.gms.common.internal.I.i(exception2);
                    String message = exception2.getMessage();
                    Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + message + "\n\n Failing open with a fake token.");
                    return dVar.I("NO_RECAPTCHA");
                }
                return dVar.I((String) task.getResult());
            default:
                if (task.isSuccessful()) {
                    return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f8291b);
                }
                Exception exception3 = task.getException();
                com.google.android.gms.common.internal.I.i(exception3);
                if (exception3 instanceof C0588B) {
                    if (Log.isLoggable("RecaptchaHandler", 4)) {
                        String message2 = exception3.getMessage();
                        Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + message2);
                    }
                    return Tasks.forResult(StringUtils.EMPTY);
                }
                return Tasks.forException(exception3);
        }
    }

    public /* synthetic */ C0610s(Object obj, int i7) {
        this.f8290a = i7;
        this.f8291b = obj;
    }
}
