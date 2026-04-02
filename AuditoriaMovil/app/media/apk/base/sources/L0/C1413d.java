package l0;

import R2.g;
import R2.m;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import w6.l;
/* renamed from: l0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1413d extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13805a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f13806b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1413d(HiddenActivity hiddenActivity, int i7, int i8) {
        super(1);
        this.f13805a = i8;
        this.f13806b = hiddenActivity;
        this.f13807c = i7;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        switch (this.f13805a) {
            case 0:
                HiddenActivity hiddenActivity = this.f13806b;
                g gVar = (g) obj;
                try {
                    hiddenActivity.f7746b = true;
                    hiddenActivity.startIntentSenderForResult(gVar.f4708a.getIntentSender(), this.f13807c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e7) {
                    ResultReceiver resultReceiver = hiddenActivity.f7745a;
                    j.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e7.getMessage());
                }
                return l6.j.f13876a;
            case 1:
                HiddenActivity hiddenActivity2 = this.f13806b;
                m mVar = (m) obj;
                try {
                    hiddenActivity2.f7746b = true;
                    hiddenActivity2.startIntentSenderForResult(mVar.f4719a.getIntentSender(), this.f13807c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e8) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f7745a;
                    j.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e8.getMessage());
                }
                return l6.j.f13876a;
            case 2:
                HiddenActivity hiddenActivity3 = this.f13806b;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                try {
                    hiddenActivity3.f7746b = true;
                    hiddenActivity3.startIntentSenderForResult(result.getIntentSender(), this.f13807c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e9) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f7745a;
                    j.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e9.getMessage());
                }
                return l6.j.f13876a;
            default:
                HiddenActivity hiddenActivity4 = this.f13806b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                try {
                    hiddenActivity4.f7746b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f13807c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e10) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f7745a;
                    j.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e10.getMessage());
                }
                return l6.j.f13876a;
        }
    }
}
