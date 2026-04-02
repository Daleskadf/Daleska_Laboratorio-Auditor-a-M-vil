package a4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class I extends m5.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6971a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6972b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC0467p f6973c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f6974d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f6975e;
    public final /* synthetic */ FirebaseAuth f;

    public I(FirebaseAuth firebaseAuth, String str, boolean z7, AbstractC0467p abstractC0467p, String str2, String str3) {
        this.f6971a = str;
        this.f6972b = z7;
        this.f6973c = abstractC0467p;
        this.f6974d = str2;
        this.f6975e = str3;
        this.f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [a4.h, b4.F] */
    @Override // m5.d
    public final Task I(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = this.f6971a;
        if (isEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z7 = this.f6972b;
        FirebaseAuth firebaseAuth = this.f;
        if (z7) {
            zzabq zzabqVar = firebaseAuth.f9707e;
            AbstractC0467p abstractC0467p = this.f6973c;
            com.google.android.gms.common.internal.I.i(abstractC0467p);
            ?? c0459h = new C0459h(firebaseAuth, 0);
            return zzabqVar.zzb(firebaseAuth.f9703a, abstractC0467p, this.f6971a, this.f6974d, this.f6975e, str, c0459h);
        }
        zzabq zzabqVar2 = firebaseAuth.f9707e;
        C0460i c0460i = new C0460i(firebaseAuth);
        return zzabqVar2.zzb(firebaseAuth.f9703a, this.f6971a, this.f6974d, this.f6975e, str, c0460i);
    }
}
