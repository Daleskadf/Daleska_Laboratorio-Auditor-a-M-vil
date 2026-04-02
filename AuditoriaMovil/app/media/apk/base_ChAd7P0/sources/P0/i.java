package P0;

import A3.N;
import H0.C0145z;
import H0.K;
import H0.T;
import H0.U;
import H0.V;
import H0.r;
import K0.x;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import e1.C0960z;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3925A;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3926a;

    /* renamed from: b  reason: collision with root package name */
    public final f f3927b;

    /* renamed from: c  reason: collision with root package name */
    public final PlaybackSession f3928c;

    /* renamed from: i  reason: collision with root package name */
    public String f3933i;
    public PlaybackMetrics.Builder j;

    /* renamed from: k  reason: collision with root package name */
    public int f3934k;

    /* renamed from: n  reason: collision with root package name */
    public K f3937n;

    /* renamed from: o  reason: collision with root package name */
    public N f3938o;

    /* renamed from: p  reason: collision with root package name */
    public N f3939p;

    /* renamed from: q  reason: collision with root package name */
    public N f3940q;

    /* renamed from: r  reason: collision with root package name */
    public r f3941r;

    /* renamed from: s  reason: collision with root package name */
    public r f3942s;

    /* renamed from: t  reason: collision with root package name */
    public r f3943t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3944u;

    /* renamed from: v  reason: collision with root package name */
    public int f3945v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3946w;

    /* renamed from: x  reason: collision with root package name */
    public int f3947x;

    /* renamed from: y  reason: collision with root package name */
    public int f3948y;

    /* renamed from: z  reason: collision with root package name */
    public int f3949z;

    /* renamed from: e  reason: collision with root package name */
    public final U f3930e = new U();
    public final T f = new T();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f3932h = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f3931g = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final long f3929d = SystemClock.elapsedRealtime();

    /* renamed from: l  reason: collision with root package name */
    public int f3935l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f3936m = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f3926a = context.getApplicationContext();
        this.f3928c = playbackSession;
        f fVar = new f();
        this.f3927b = fVar;
        fVar.f3922d = this;
    }

    public final boolean a(N n7) {
        String str;
        if (n7 != null) {
            String str2 = (String) n7.f106d;
            f fVar = this.f3927b;
            synchronized (fVar) {
                str = fVar.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i7;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.f3925A) {
            builder.setAudioUnderrunCount(this.f3949z);
            this.j.setVideoFramesDropped(this.f3947x);
            this.j.setVideoFramesPlayed(this.f3948y);
            Long l8 = (Long) this.f3931g.get(this.f3933i);
            PlaybackMetrics.Builder builder2 = this.j;
            if (l8 == null) {
                longValue = 0;
            } else {
                longValue = l8.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l9 = (Long) this.f3932h.get(this.f3933i);
            PlaybackMetrics.Builder builder3 = this.j;
            if (l9 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l9.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.j;
            if (l9 != null && l9.longValue() > 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            builder4.setStreamSource(i7);
            PlaybackSession playbackSession = this.f3928c;
            build = this.j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.j = null;
        this.f3933i = null;
        this.f3949z = 0;
        this.f3947x = 0;
        this.f3948y = 0;
        this.f3941r = null;
        this.f3942s = null;
        this.f3943t = null;
        this.f3925A = false;
    }

    public final void c(V v6, C0960z c0960z) {
        int b5;
        PlaybackMetrics.Builder builder = this.j;
        if (c0960z == null || (b5 = v6.b(c0960z.f10852a)) == -1) {
            return;
        }
        T t7 = this.f;
        int i7 = 0;
        v6.f(b5, t7, false);
        int i8 = t7.f1718c;
        U u7 = this.f3930e;
        v6.n(i8, u7);
        C0145z c0145z = u7.f1726c.f1642b;
        int i9 = 2;
        if (c0145z != null) {
            int G2 = x.G(c0145z.f1914a, c0145z.f1915b);
            if (G2 != 0) {
                if (G2 != 1) {
                    if (G2 != 2) {
                        i7 = 1;
                    } else {
                        i7 = 4;
                    }
                } else {
                    i7 = 5;
                }
            } else {
                i7 = 3;
            }
        }
        builder.setStreamType(i7);
        if (u7.f1734m != -9223372036854775807L && !u7.f1732k && !u7.f1731i && !u7.a()) {
            builder.setMediaDurationMillis(x.Z(u7.f1734m));
        }
        if (!u7.a()) {
            i9 = 1;
        }
        builder.setPlaybackType(i9);
        this.f3925A = true;
    }

    public final void d(a aVar, String str) {
        C0960z c0960z = aVar.f3896d;
        if ((c0960z == null || !c0960z.b()) && str.equals(this.f3933i)) {
            b();
        }
        this.f3931g.remove(str);
        this.f3932h.remove(str);
    }

    public final void e(int i7, long j, r rVar, int i8) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i9;
        String str;
        timeSinceCreatedMillis = g.l(i7).setTimeSinceCreatedMillis(j - this.f3929d);
        if (rVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i8 != 1) {
                i9 = 3;
                if (i8 != 2) {
                    if (i8 != 3) {
                        i9 = 1;
                    } else {
                        i9 = 4;
                    }
                }
            } else {
                i9 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i9);
            String str2 = rVar.f1885l;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = rVar.f1886m;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = rVar.j;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i10 = rVar.f1883i;
            if (i10 != -1) {
                timeSinceCreatedMillis.setBitrate(i10);
            }
            int i11 = rVar.f1892s;
            if (i11 != -1) {
                timeSinceCreatedMillis.setWidth(i11);
            }
            int i12 = rVar.f1893t;
            if (i12 != -1) {
                timeSinceCreatedMillis.setHeight(i12);
            }
            int i13 = rVar.f1865A;
            if (i13 != -1) {
                timeSinceCreatedMillis.setChannelCount(i13);
            }
            int i14 = rVar.f1866B;
            if (i14 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i14);
            }
            String str5 = rVar.f1879d;
            if (str5 != null) {
                int i15 = x.f2529a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = rVar.f1894u;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f3925A = true;
        PlaybackSession playbackSession = this.f3928c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
