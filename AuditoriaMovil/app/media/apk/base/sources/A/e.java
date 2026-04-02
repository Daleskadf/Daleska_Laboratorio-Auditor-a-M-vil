package A;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ AudioFocusRequest.Builder i(int i7) {
        return new AudioFocusRequest.Builder(i7);
    }

    public static /* synthetic */ AudioFocusRequest.Builder m(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* synthetic */ Locale.LanguageRange r(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void z() {
    }
}
