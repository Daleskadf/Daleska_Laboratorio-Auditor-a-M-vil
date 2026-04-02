package a4;

import android.text.TextUtils;
import android.util.Log;
import b4.C0597e;
import b4.C0603k;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class L implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6985a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f6986b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f6987c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6988d;

    public /* synthetic */ L(FirebaseAuth firebaseAuth, w wVar, String str, int i7) {
        this.f6985a = i7;
        this.f6986b = wVar;
        this.f6987c = str;
        this.f6988d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [a4.M] */
    /* JADX WARN: Type inference failed for: r3v5, types: [a4.O] */
    /* JADX WARN: Type inference failed for: r6v20, types: [a4.M] */
    /* JADX WARN: Type inference failed for: r8v9, types: [a4.O] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        boolean z7;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z8;
        boolean z9;
        boolean z10;
        String str6 = "NO_RECAPTCHA";
        FirebaseAuth firebaseAuth = this.f6988d;
        String str7 = this.f6987c;
        String str8 = "Error while validating application identity: ";
        w wVar = this.f6986b;
        switch (this.f6985a) {
            case 0:
                if (!task.isSuccessful()) {
                    Exception exception = task.getException();
                    if (exception != null) {
                        str = exception.getMessage();
                    } else {
                        str = StringUtils.EMPTY;
                    }
                    Log.e("FirebaseAuth", "Error while validating application identity: " + str);
                    if (exception != null && ((exception instanceof C0463l) || ((exception instanceof C0462k) && ((C0462k) exception).f7038a.endsWith("UNAUTHORIZED_DOMAIN")))) {
                        FirebaseAuth.k((U3.i) exception, wVar, str7);
                        return;
                    }
                    Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                }
                b4.N n7 = (b4.N) task.getResult();
                firebaseAuth.getClass();
                long longValue = wVar.f7054b.longValue();
                if (longValue >= 0 && longValue <= 120) {
                    String str9 = wVar.f7057e;
                    com.google.android.gms.common.internal.I.e(str9);
                    String str10 = n7.f8210c;
                    if (!zzae.zzc(str10) || firebaseAuth.o() == null || !firebaseAuth.o().i()) {
                        str6 = str10;
                    }
                    if (wVar.f7058g != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    String str11 = firebaseAuth.f9710i;
                    String str12 = firebaseAuth.f9711k;
                    boolean s7 = firebaseAuth.s();
                    String str13 = n7.f8208a;
                    String str14 = n7.f8209b;
                    zzahk zzahkVar = new zzahk(str9, longValue, z7, str11, str12, str13, str14, str6, s7);
                    io.flutter.plugins.firebase.auth.Q q2 = wVar.f7055c;
                    C0597e c0597e = firebaseAuth.f9708g;
                    String str15 = (String) c0597e.f8248c;
                    if (str15 != null && ((String) c0597e.f8249d) != null && str9 != null && str9.equals(str15)) {
                        q2 = new M(firebaseAuth, q2);
                    }
                    if (TextUtils.isEmpty(n7.f8208a)) {
                        b4.N n8 = new b4.N(str13, str14, str6);
                        if (!wVar.j) {
                            q2 = new O(firebaseAuth, wVar, n8, q2);
                        }
                    }
                    firebaseAuth.f9707e.zza(firebaseAuth.f9703a, zzahkVar, q2, wVar.f, wVar.f7056d);
                    return;
                }
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            default:
                if (!task.isSuccessful()) {
                    Exception exception2 = task.getException();
                    if (exception2 != null) {
                        str8 = io.flutter.plugins.pathprovider.b.h("Error while validating application identity: ", exception2.getMessage());
                    }
                    Log.e("FirebaseAuth", str8);
                    if (exception2 != null && ((exception2 instanceof C0463l) || ((exception2 instanceof C0462k) && ((C0462k) exception2).f7038a.endsWith("UNAUTHORIZED_DOMAIN")))) {
                        FirebaseAuth.k((U3.i) exception2, wVar, str7);
                        return;
                    }
                    Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                    str4 = null;
                    str2 = null;
                    str3 = null;
                } else {
                    str2 = ((b4.N) task.getResult()).f8208a;
                    str3 = ((b4.N) task.getResult()).f8209b;
                    str4 = ((b4.N) task.getResult()).f8210c;
                }
                long longValue2 = wVar.f7054b.longValue();
                String str16 = wVar.f7057e;
                io.flutter.plugins.firebase.auth.Q q7 = wVar.f7055c;
                C0597e c0597e2 = firebaseAuth.f9708g;
                String str17 = (String) c0597e2.f8248c;
                if (str17 != null && ((String) c0597e2.f8249d) != null && str16 != null && str16.equals(str17)) {
                    q7 = new M(firebaseAuth, q7);
                }
                if (TextUtils.isEmpty(str2)) {
                    b4.N n9 = (b4.N) task.getResult();
                    if (!wVar.j) {
                        q7 = new O(firebaseAuth, wVar, n9, q7);
                    }
                }
                io.flutter.plugins.firebase.auth.Q q8 = q7;
                C0603k c0603k = wVar.f7059h;
                com.google.android.gms.common.internal.I.i(c0603k);
                if (zzae.zzc(str4) && firebaseAuth.o() != null && firebaseAuth.o().i()) {
                    str5 = "NO_RECAPTCHA";
                } else {
                    str5 = str4;
                }
                if (c0603k.f8270a != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    String str18 = wVar.f7057e;
                    com.google.android.gms.common.internal.I.i(str18);
                    String str19 = firebaseAuth.f9710i;
                    if (wVar.f7058g != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    firebaseAuth.f9707e.zza(c0603k, str18, str19, longValue2, z10, false, str2, str3, str5, firebaseAuth.s(), (y) q8, wVar.f7056d, wVar.f);
                    return;
                }
                C0448A c0448a = wVar.f7060i;
                com.google.android.gms.common.internal.I.i(c0448a);
                String str20 = firebaseAuth.f9710i;
                if (wVar.f7058g != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                firebaseAuth.f9707e.zza(c0603k, c0448a, str20, longValue2, z9, false, str2, str3, str5, firebaseAuth.s(), (y) q8, wVar.f7056d, wVar.f);
                return;
        }
    }
}
