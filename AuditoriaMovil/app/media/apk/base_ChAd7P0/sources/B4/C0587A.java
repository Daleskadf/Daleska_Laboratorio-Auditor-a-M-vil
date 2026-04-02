package b4;

import a4.AbstractC0467p;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
/* renamed from: b4.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587A {

    /* renamed from: c  reason: collision with root package name */
    public static final zzaj f8175c = zzaj.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: d  reason: collision with root package name */
    public static final C0587A f8176d;

    /* renamed from: a  reason: collision with root package name */
    public Task f8177a;

    /* renamed from: b  reason: collision with root package name */
    public long f8178b;

    /* JADX WARN: Type inference failed for: r0v2, types: [b4.A, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f8178b = 0L;
        f8176d = obj;
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f9153a);
        edit.putString("statusMessage", status.f9154b);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }

    public static void b(Context context, FirebaseAuth firebaseAuth) {
        com.google.android.gms.common.internal.I.i(context);
        com.google.android.gms.common.internal.I.i(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        U3.h hVar = firebaseAuth.f9703a;
        hVar.a();
        edit.putString("firebaseAppName", hVar.f5750b);
        edit.commit();
    }

    public static void c(Context context, FirebaseAuth firebaseAuth, AbstractC0467p abstractC0467p) {
        com.google.android.gms.common.internal.I.i(context);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        U3.h hVar = firebaseAuth.f9703a;
        hVar.a();
        edit.putString("firebaseAppName", hVar.f5750b);
        edit.putString("firebaseUserUid", ((C0599g) abstractC0467p).f8254b.f8241a);
        edit.commit();
    }

    public static void d(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzaj zzajVar = f8175c;
        int size = zzajVar.size();
        int i7 = 0;
        while (i7 < size) {
            E e7 = zzajVar.get(i7);
            i7++;
            edit.remove((String) e7);
        }
        edit.commit();
    }
}
