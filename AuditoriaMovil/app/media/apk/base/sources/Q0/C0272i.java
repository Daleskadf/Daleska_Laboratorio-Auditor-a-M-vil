package Q0;

import H0.C0126f;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
/* renamed from: Q0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4280a;

    /* renamed from: b  reason: collision with root package name */
    public final A.j f4281b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f4282c;

    /* renamed from: d  reason: collision with root package name */
    public final C0270g f4283d;

    /* renamed from: e  reason: collision with root package name */
    public final K0.n f4284e;
    public final C0271h f;

    /* renamed from: g  reason: collision with root package name */
    public C0268e f4285g;

    /* renamed from: h  reason: collision with root package name */
    public C0273j f4286h;

    /* renamed from: i  reason: collision with root package name */
    public C0126f f4287i;
    public boolean j;

    public C0272i(Context context, A.j jVar, C0126f c0126f, C0273j c0273j) {
        C0270g c0270g;
        K0.n nVar;
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f4280a = applicationContext;
        this.f4281b = jVar;
        this.f4287i = c0126f;
        this.f4286h = c0273j;
        int i7 = K0.x.f2529a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f4282c = handler;
        int i8 = K0.x.f2529a;
        if (i8 >= 23) {
            c0270g = new C0270g(this);
        } else {
            c0270g = null;
        }
        this.f4283d = c0270g;
        if (i8 >= 21) {
            nVar = new K0.n(this, 1);
        } else {
            nVar = null;
        }
        this.f4284e = nVar;
        C0268e c0268e = C0268e.f4271c;
        String str = K0.x.f2531c;
        if (!"Amazon".equals(str) && !"Xiaomi".equals(str)) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f = uriFor != null ? new C0271h(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(C0268e c0268e) {
        h1.p pVar;
        String name;
        String name2;
        if (this.j && !c0268e.equals(this.f4285g)) {
            this.f4285g = c0268e;
            I i7 = (I) this.f4281b.f19b;
            i7.getClass();
            Looper myLooper = Looper.myLooper();
            Looper looper = i7.f4208i0;
            if (looper != myLooper) {
                if (looper == null) {
                    name = "null";
                } else {
                    name = looper.getThread().getName();
                }
                if (myLooper == null) {
                    name2 = "null";
                } else {
                    name2 = myLooper.getThread().getName();
                }
                throw new IllegalStateException(io.flutter.plugins.pathprovider.b.j("Current looper (", name2, ") is not the playback looper (", name, ")"));
            } else if (!c0268e.equals(i7.f4225x)) {
                i7.f4225x = c0268e;
                A.m mVar = i7.f4220s;
                if (mVar != null) {
                    L l8 = (L) mVar.f28b;
                    synchronized (l8.f3699a) {
                        pVar = l8.f3711l0;
                    }
                    if (pVar != null) {
                        pVar.g();
                    }
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        C0273j c0273j = this.f4286h;
        C0273j c0273j2 = null;
        if (c0273j == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = c0273j.f4288a;
        }
        if (K0.x.a(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            c0273j2 = new C0273j(audioDeviceInfo);
        }
        this.f4286h = c0273j2;
        a(C0268e.b(this.f4280a, this.f4287i, c0273j2));
    }
}
