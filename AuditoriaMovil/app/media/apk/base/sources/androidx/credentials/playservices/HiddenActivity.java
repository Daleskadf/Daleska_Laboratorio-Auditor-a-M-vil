package androidx.credentials.playservices;

import B5.M;
import R2.r;
import R2.s;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.l;
import com.google.android.gms.internal.p001authapi.zbag;
import com.google.android.gms.internal.p001authapi.zbaq;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import k3.AbstractC1393a;
import kotlin.jvm.internal.j;
import l0.C1411b;
import l0.C1413d;
import m0.AbstractC1425a;
import m3.C1436a;
import n3.C1510y;
/* loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7744c = 0;

    /* renamed from: a  reason: collision with root package name */
    public ResultReceiver f7745a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7746b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(f.API_PRIORITY_OTHER, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i7);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f7745a;
        if (resultReceiver != null) {
            resultReceiver.send(i8, bundle);
        }
        this.f7746b = false;
        finish();
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [R2.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [R2.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [R2.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, com.google.android.gms.common.api.internal.a] */
    /* JADX WARN: Type inference failed for: r6v6, types: [e0.b, java.lang.Object] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f7745a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f7746b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f7746b) {
            return;
        }
        if (stringExtra != null) {
            Task task = null;
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        R2.f fVar = (R2.f) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (fVar != null) {
                            task = new zbaq((Activity) this, (s) new Object()).beginSignIn(fVar).addOnSuccessListener(new C1411b(new C1413d(this, intExtra, 0), 3)).addOnFailureListener(new OnFailureListener(this) { // from class: l0.c

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f13804b;

                                {
                                    this.f13804b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception e7) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity this$0 = this.f13804b;
                                    switch (r2) {
                                        case 0:
                                            int i7 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = this$0.f7745a;
                                            j.b(resultReceiver2);
                                            this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e7.getMessage());
                                            return;
                                        case 1:
                                            int i8 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = this$0.f7745a;
                                            j.b(resultReceiver3);
                                            this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e7.getMessage());
                                            return;
                                        case 2:
                                            int i9 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = this$0.f7745a;
                                            j.b(resultReceiver4);
                                            this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
                                            return;
                                        default:
                                            int i10 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = this$0.f7745a;
                                            j.b(resultReceiver5);
                                            this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e7.getMessage());
                                            return;
                                    }
                                }
                            });
                        }
                        if (task == null) {
                            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        C1510y c1510y = (C1510y) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra2 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (c1510y != null) {
                            int i7 = AbstractC1393a.f13695a;
                            l lVar = new l(this, C1436a.f14021a, e.f9157U, new Object());
                            M a7 = AbstractC0751z.a();
                            ?? obj = new Object();
                            obj.f10587a = c1510y;
                            a7.f330c = obj;
                            a7.f329b = 5407;
                            task = lVar.doRead(a7.a()).addOnSuccessListener(new C1411b(new C1413d(this, intExtra2, 2), 0)).addOnFailureListener(new OnFailureListener(this) { // from class: l0.c

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f13804b;

                                {
                                    this.f13804b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception e7) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity this$0 = this.f13804b;
                                    switch (r2) {
                                        case 0:
                                            int i72 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = this$0.f7745a;
                                            j.b(resultReceiver2);
                                            this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e7.getMessage());
                                            return;
                                        case 1:
                                            int i8 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = this$0.f7745a;
                                            j.b(resultReceiver3);
                                            this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e7.getMessage());
                                            return;
                                        case 2:
                                            int i9 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = this$0.f7745a;
                                            j.b(resultReceiver4);
                                            this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
                                            return;
                                        default:
                                            int i10 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = this$0.f7745a;
                                            j.b(resultReceiver5);
                                            this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e7.getMessage());
                                            return;
                                    }
                                }
                            });
                        }
                        if (task == null) {
                            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        R2.l lVar2 = (R2.l) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra3 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (lVar2 != null) {
                            task = new zbag((Activity) this, (r) new Object()).savePassword(lVar2).addOnSuccessListener(new C1411b(new C1413d(this, intExtra3, 1), 1)).addOnFailureListener(new OnFailureListener(this) { // from class: l0.c

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f13804b;

                                {
                                    this.f13804b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception e7) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity this$0 = this.f13804b;
                                    switch (r2) {
                                        case 0:
                                            int i72 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = this$0.f7745a;
                                            j.b(resultReceiver2);
                                            this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e7.getMessage());
                                            return;
                                        case 1:
                                            int i8 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = this$0.f7745a;
                                            j.b(resultReceiver3);
                                            this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e7.getMessage());
                                            return;
                                        case 2:
                                            int i9 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = this$0.f7745a;
                                            j.b(resultReceiver4);
                                            this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
                                            return;
                                        default:
                                            int i10 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = this$0.f7745a;
                                            j.b(resultReceiver5);
                                            this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e7.getMessage());
                                            return;
                                    }
                                }
                            });
                        }
                        if (task == null) {
                            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        R2.j jVar = (R2.j) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra4 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (jVar != null) {
                            task = new zbaq((Activity) this, (s) new Object()).getSignInIntent(jVar).addOnSuccessListener(new C1411b(new C1413d(this, intExtra4, 3), 2)).addOnFailureListener(new OnFailureListener(this) { // from class: l0.c

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f13804b;

                                {
                                    this.f13804b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception e7) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity this$0 = this.f13804b;
                                    switch (r2) {
                                        case 0:
                                            int i72 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = this$0.f7745a;
                                            j.b(resultReceiver2);
                                            this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e7.getMessage());
                                            return;
                                        case 1:
                                            int i8 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = this$0.f7745a;
                                            j.b(resultReceiver3);
                                            this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e7.getMessage());
                                            return;
                                        case 2:
                                            int i9 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = this$0.f7745a;
                                            j.b(resultReceiver4);
                                            this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
                                            return;
                                        default:
                                            int i10 = HiddenActivity.f7744c;
                                            j.e(this$0, "this$0");
                                            j.e(e7, "e");
                                            if ((e7 instanceof com.google.android.gms.common.api.j) && AbstractC1425a.f13882a.contains(Integer.valueOf(((com.google.android.gms.common.api.j) e7).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = this$0.f7745a;
                                            j.b(resultReceiver5);
                                            this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e7.getMessage());
                                            return;
                                    }
                                }
                            });
                        }
                        if (task == null) {
                            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        j.e(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f7746b);
        super.onSaveInstanceState(outState);
    }
}
