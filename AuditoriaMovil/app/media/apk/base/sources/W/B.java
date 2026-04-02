package W;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import f0.C0977b;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class B extends C {

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f5987e = new ArrayList();
    public final ArrayList f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public O f5988g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f5989h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f5990i;

    public B() {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static W.B h(android.app.Notification r6) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.B.h(android.app.Notification):W.B");
    }

    @Override // W.C
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f5988g.f6016a);
        bundle.putBundle("android.messagingStyleUser", this.f5988g.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f5989h);
        if (this.f5989h != null && this.f5990i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f5989h);
        }
        ArrayList arrayList = this.f5987e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", A.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", A.a(arrayList2));
        }
        Boolean bool = this.f5990i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    @Override // W.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(B.a r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.B.b(B.a):void");
    }

    @Override // W.C
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [W.O, java.lang.Object] */
    @Override // W.C
    public final void g(Bundle bundle) {
        super.g(bundle);
        ArrayList arrayList = this.f5987e;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f5988g = O.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            ?? obj = new Object();
            obj.f6016a = string;
            obj.f6017b = null;
            obj.f6018c = null;
            obj.f6019d = null;
            obj.f6020e = false;
            obj.f = false;
            this.f5988g = obj;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f5989h = charSequence;
        if (charSequence == null) {
            this.f5989h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(A.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f.addAll(A.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f5990i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final boolean i() {
        C0372o c0372o = this.f5991a;
        if (c0372o != null && c0372o.f6058a.getApplicationInfo().targetSdkVersion < 28 && this.f5990i == null) {
            if (this.f5989h == null) {
                return false;
            }
            return true;
        }
        Boolean bool = this.f5990i;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final SpannableStringBuilder j(A a7) {
        C0977b c0977b;
        CharSequence charSequence;
        String str = C0977b.f10965b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            c0977b = C0977b.f10968e;
        } else {
            c0977b = C0977b.f10967d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        O o7 = a7.f5984c;
        CharSequence charSequence2 = StringUtils.EMPTY;
        if (o7 == null) {
            charSequence = StringUtils.EMPTY;
        } else {
            charSequence = o7.f6016a;
        }
        int i7 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f5988g.f6016a;
            int i8 = this.f5991a.f6081z;
            if (i8 != 0) {
                i7 = i8;
            }
        }
        SpannableStringBuilder c8 = c0977b.c(charSequence);
        spannableStringBuilder.append((CharSequence) c8);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i7), null), spannableStringBuilder.length() - c8.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = a7.f5982a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) c0977b.c(charSequence2));
        return spannableStringBuilder;
    }

    public B(O o7) {
        if (!TextUtils.isEmpty(o7.f6016a)) {
            this.f5988g = o7;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
