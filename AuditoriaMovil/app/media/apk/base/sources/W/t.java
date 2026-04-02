package W;

import B5.AbstractC0039l;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.example.appecoactivate.R;
/* loaded from: classes.dex */
public final class t extends C {

    /* renamed from: e  reason: collision with root package name */
    public int f6082e;
    public O f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f6083g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f6084h;

    /* renamed from: i  reason: collision with root package name */
    public PendingIntent f6085i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f6086k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f6087l;

    /* renamed from: m  reason: collision with root package name */
    public IconCompat f6088m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f6089n;

    @Override // W.C
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.f6082e);
        bundle.putBoolean("android.callIsVideo", this.j);
        O o7 = this.f;
        if (o7 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", r.b(F.d(o7)));
            } else {
                bundle.putParcelable("android.callPersonCompat", o7.b());
            }
        }
        IconCompat iconCompat = this.f6088m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", AbstractC0374q.a(iconCompat.h(this.f5991a.f6058a)));
        }
        bundle.putCharSequence("android.verificationText", this.f6089n);
        bundle.putParcelable("android.answerIntent", this.f6083g);
        bundle.putParcelable("android.declineIntent", this.f6084h);
        bundle.putParcelable("android.hangUpIntent", this.f6085i);
        Integer num = this.f6086k;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f6087l;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // W.C
    public final void b(B.a aVar) {
        CharSequence charSequence;
        String str;
        int i7 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) aVar.f225c;
        String str2 = null;
        r5 = null;
        Notification.CallStyle a7 = null;
        if (i7 >= 31) {
            int i8 = this.f6082e;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (Log.isLoggable("NotifCompat", 3)) {
                            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f6082e));
                        }
                    } else {
                        O o7 = this.f;
                        o7.getClass();
                        a7 = s.c(F.d(o7), this.f6085i, this.f6083g);
                    }
                } else {
                    O o8 = this.f;
                    o8.getClass();
                    a7 = s.b(F.d(o8), this.f6085i);
                }
            } else {
                O o9 = this.f;
                o9.getClass();
                a7 = s.a(F.d(o9), this.f6084h, this.f6083g);
            }
            if (a7 != null) {
                a7.setBuilder(builder);
                Integer num = this.f6086k;
                if (num != null) {
                    s.d(a7, num.intValue());
                }
                Integer num2 = this.f6087l;
                if (num2 != null) {
                    s.e(a7, num2.intValue());
                }
                s.h(a7, this.f6089n);
                IconCompat iconCompat = this.f6088m;
                if (iconCompat != null) {
                    s.g(a7, iconCompat.h(this.f5991a.f6058a));
                }
                s.f(a7, this.j);
                return;
            }
            return;
        }
        O o10 = this.f;
        if (o10 != null) {
            charSequence = o10.f6016a;
        } else {
            charSequence = null;
        }
        builder.setContentTitle(charSequence);
        Bundle bundle = this.f5991a.f6080y;
        if (bundle != null && bundle.containsKey("android.text")) {
            str = this.f5991a.f6080y.getCharSequence("android.text");
        } else {
            str = null;
        }
        if (str == null) {
            int i9 = this.f6082e;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        str2 = this.f5991a.f6058a.getResources().getString(R.string.call_notification_screening_text);
                    }
                } else {
                    str2 = this.f5991a.f6058a.getResources().getString(R.string.call_notification_ongoing_text);
                }
            } else {
                str2 = this.f5991a.f6058a.getResources().getString(R.string.call_notification_incoming_text);
            }
            str = str2;
        }
        builder.setContentText(str);
        O o11 = this.f;
        if (o11 != null) {
            IconCompat iconCompat2 = o11.f6017b;
            if (iconCompat2 != null) {
                AbstractC0374q.b(builder, iconCompat2.h(this.f5991a.f6058a));
            }
            if (i7 >= 28) {
                O o12 = this.f;
                o12.getClass();
                r.a(builder, F.d(o12));
            } else {
                AbstractC0373p.a(builder, this.f.f6018c);
            }
        }
        AbstractC0373p.b(builder, "call");
    }

    @Override // W.C
    public final String c() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // W.C
    public final void g(Bundle bundle) {
        Integer num;
        super.g(bundle);
        this.f6082e = bundle.getInt("android.callType");
        this.j = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f = F.b(AbstractC0039l.d(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f = O.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.f6088m = IconCompat.b((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f6088m = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.f6089n = bundle.getCharSequence("android.verificationText");
        this.f6083g = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f6084h = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.f6085i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        Integer num2 = null;
        if (bundle.containsKey("android.answerColor")) {
            num = Integer.valueOf(bundle.getInt("android.answerColor"));
        } else {
            num = null;
        }
        this.f6086k = num;
        if (bundle.containsKey("android.declineColor")) {
            num2 = Integer.valueOf(bundle.getInt("android.declineColor"));
        }
        this.f6087l = num2;
    }

    public final C0366i h(int i7, int i8, Integer num, int i9, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(X.d.getColor(this.f5991a.f6058a, i9));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f5991a.f6058a.getResources().getString(i8));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.f5991a.f6058a;
        PorterDuff.Mode mode = IconCompat.f7705k;
        context.getClass();
        C0366i a7 = new C0365h(IconCompat.e(context.getResources(), context.getPackageName(), i7), spannableStringBuilder, pendingIntent).a();
        a7.f6037a.putBoolean("key_action_priority", true);
        return a7;
    }
}
