package O0;

import H0.C0126f;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
/* renamed from: O0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242d {

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f3679a;

    /* renamed from: b  reason: collision with root package name */
    public final C0241c f3680b;

    /* renamed from: c  reason: collision with root package name */
    public E f3681c;

    /* renamed from: d  reason: collision with root package name */
    public C0126f f3682d;

    /* renamed from: e  reason: collision with root package name */
    public int f3683e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public float f3684g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public AudioFocusRequest f3685h;

    public C0242d(Context context, Handler handler, E e7) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f3679a = audioManager;
        this.f3681c = e7;
        this.f3680b = new C0241c(this, handler);
        this.f3683e = 0;
    }

    public final void a() {
        int i7 = this.f3683e;
        if (i7 != 1 && i7 != 0) {
            int i8 = K0.x.f2529a;
            AudioManager audioManager = this.f3679a;
            if (i8 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f3685h;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            audioManager.abandonAudioFocus(this.f3680b);
        }
    }

    public final void b(C0126f c0126f) {
        int i7;
        if (!K0.x.a(this.f3682d, c0126f)) {
            this.f3682d = c0126f;
            boolean z7 = false;
            if (c0126f == null) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            this.f = i7;
            if (i7 == 1 || i7 == 0) {
                z7 = true;
            }
            K0.a.d("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", z7);
        }
    }

    public final void c(int i7) {
        float f;
        if (this.f3683e == i7) {
            return;
        }
        this.f3683e = i7;
        if (i7 == 4) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.f3684g == f) {
            return;
        }
        this.f3684g = f;
        E e7 = this.f3681c;
        if (e7 != null) {
            H h8 = e7.f3482a;
            h8.S(1, Float.valueOf(h8.f3503Q0 * h8.f3535t0.f3684g), 2);
        }
    }

    public final int d(int i7, boolean z7) {
        int requestAudioFocus;
        AudioFocusRequest.Builder m7;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        boolean z8 = false;
        if (i7 != 1 && this.f == 1) {
            if (z7) {
                if (this.f3683e == 2) {
                    return 1;
                }
                int i8 = K0.x.f2529a;
                AudioManager audioManager = this.f3679a;
                C0241c c0241c = this.f3680b;
                if (i8 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f3685h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            A.e.z();
                            m7 = A.e.i(this.f);
                        } else {
                            A.e.z();
                            m7 = A.e.m(this.f3685h);
                        }
                        C0126f c0126f = this.f3682d;
                        if (c0126f != null && c0126f.f1798a == 1) {
                            z8 = true;
                        }
                        c0126f.getClass();
                        audioAttributes = m7.setAudioAttributes((AudioAttributes) c0126f.a().f4b);
                        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z8);
                        onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(c0241c);
                        build = onAudioFocusChangeListener.build();
                        this.f3685h = build;
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(this.f3685h);
                } else {
                    this.f3682d.getClass();
                    requestAudioFocus = audioManager.requestAudioFocus(c0241c, 3, this.f);
                }
                if (requestAudioFocus == 1) {
                    c(2);
                    return 1;
                }
                c(1);
                return -1;
            }
            int i9 = this.f3683e;
            if (i9 == 1) {
                return -1;
            }
            if (i9 != 3) {
                return 1;
            }
            return 0;
        }
        a();
        c(0);
        return 1;
    }
}
