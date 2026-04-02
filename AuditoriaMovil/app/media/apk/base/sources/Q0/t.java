package Q0;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: A  reason: collision with root package name */
    public long f4315A;

    /* renamed from: B  reason: collision with root package name */
    public long f4316B;

    /* renamed from: C  reason: collision with root package name */
    public long f4317C;

    /* renamed from: D  reason: collision with root package name */
    public long f4318D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f4319E;

    /* renamed from: F  reason: collision with root package name */
    public long f4320F;

    /* renamed from: G  reason: collision with root package name */
    public long f4321G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f4322H;

    /* renamed from: I  reason: collision with root package name */
    public long f4323I;

    /* renamed from: J  reason: collision with root package name */
    public K0.s f4324J;

    /* renamed from: a  reason: collision with root package name */
    public final C5.i f4325a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f4326b;

    /* renamed from: c  reason: collision with root package name */
    public AudioTrack f4327c;

    /* renamed from: d  reason: collision with root package name */
    public int f4328d;

    /* renamed from: e  reason: collision with root package name */
    public int f4329e;
    public s f;

    /* renamed from: g  reason: collision with root package name */
    public int f4330g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4331h;

    /* renamed from: i  reason: collision with root package name */
    public long f4332i;
    public float j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4333k;

    /* renamed from: l  reason: collision with root package name */
    public long f4334l;

    /* renamed from: m  reason: collision with root package name */
    public long f4335m;

    /* renamed from: n  reason: collision with root package name */
    public Method f4336n;

    /* renamed from: o  reason: collision with root package name */
    public long f4337o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4338p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4339q;

    /* renamed from: r  reason: collision with root package name */
    public long f4340r;

    /* renamed from: s  reason: collision with root package name */
    public long f4341s;

    /* renamed from: t  reason: collision with root package name */
    public long f4342t;

    /* renamed from: u  reason: collision with root package name */
    public long f4343u;

    /* renamed from: v  reason: collision with root package name */
    public long f4344v;

    /* renamed from: w  reason: collision with root package name */
    public int f4345w;

    /* renamed from: x  reason: collision with root package name */
    public int f4346x;

    /* renamed from: y  reason: collision with root package name */
    public long f4347y;

    /* renamed from: z  reason: collision with root package name */
    public long f4348z;

    public t(C5.i iVar) {
        this.f4325a = iVar;
        try {
            this.f4336n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f4326b = new long[10];
        this.f4324J = K0.s.f2519a;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022e A[Catch: Exception -> 0x0244, TRY_LEAVE, TryCatch #0 {Exception -> 0x0244, blocks: (B:88:0x0205, B:90:0x022e), top: B:132:0x0205 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r28) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.t.a(boolean):long");
    }

    public final long b() {
        this.f4324J.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f4347y != -9223372036854775807L) {
            AudioTrack audioTrack = this.f4327c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f4315A;
            }
            return Math.min(this.f4316B, this.f4315A + K0.x.U(K0.x.y(K0.x.M(elapsedRealtime) - this.f4347y, this.j), this.f4330g, 1000000L, RoundingMode.CEILING));
        }
        if (elapsedRealtime - this.f4341s >= 5) {
            AudioTrack audioTrack2 = this.f4327c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                if (this.f4331h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f4344v = this.f4342t;
                    }
                    playbackHeadPosition += this.f4344v;
                }
                if (K0.x.f2529a <= 29) {
                    if (playbackHeadPosition == 0 && this.f4342t > 0 && playState == 3) {
                        if (this.f4348z == -9223372036854775807L) {
                            this.f4348z = elapsedRealtime;
                        }
                    } else {
                        this.f4348z = -9223372036854775807L;
                    }
                }
                long j = this.f4342t;
                if (j > playbackHeadPosition) {
                    if (this.f4322H) {
                        this.f4323I += j;
                        this.f4322H = false;
                    } else {
                        this.f4343u++;
                    }
                }
                this.f4342t = playbackHeadPosition;
            }
            this.f4341s = elapsedRealtime;
        }
        return this.f4342t + this.f4323I + (this.f4343u << 32);
    }

    public final boolean c(long j) {
        long a7 = a(false);
        int i7 = this.f4330g;
        int i8 = K0.x.f2529a;
        if (j <= K0.x.U(a7, i7, 1000000L, RoundingMode.CEILING)) {
            if (!this.f4331h) {
                return false;
            }
            AudioTrack audioTrack = this.f4327c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f4334l = 0L;
        this.f4346x = 0;
        this.f4345w = 0;
        this.f4335m = 0L;
        this.f4318D = 0L;
        this.f4321G = 0L;
        this.f4333k = false;
    }
}
