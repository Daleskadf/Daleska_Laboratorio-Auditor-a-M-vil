package k7;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class b extends f7.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f13736d;

    /* renamed from: e  reason: collision with root package name */
    public final o f13737e;
    public final R6.d f;

    /* renamed from: g  reason: collision with root package name */
    public final E6.l f13738g;

    /* renamed from: h  reason: collision with root package name */
    public j7.a f13739h;

    /* renamed from: i  reason: collision with root package name */
    public Object f13740i;

    public b(o player, R6.d dVar, E6.l lVar, int i7) {
        this.f13736d = i7;
        switch (i7) {
            case 1:
                kotlin.jvm.internal.j.e(player, "player");
                this.f13737e = player;
                this.f = dVar;
                this.f13738g = lVar;
                this.f13739h = player.f13770c;
                q0();
                return;
            default:
                kotlin.jvm.internal.j.e(player, "player");
                this.f13737e = player;
                this.f = dVar;
                this.f13738g = lVar;
                this.f13739h = player.f13770c;
                q0();
                return;
        }
    }

    @Override // f7.a
    public final j7.a Q() {
        switch (this.f13736d) {
            case 0:
                return this.f13739h;
            default:
                return this.f13739h;
        }
    }

    @Override // f7.a
    public final InterfaceC1959a T() {
        switch (this.f13736d) {
            case 0:
                return this.f;
            default:
                return this.f;
        }
    }

    @Override // f7.a
    public final w6.l U() {
        switch (this.f13736d) {
            case 0:
                return this.f13738g;
            default:
                return this.f13738g;
        }
    }

    @Override // f7.a
    public final o V() {
        switch (this.f13736d) {
            case 0:
                return this.f13737e;
            default:
                return this.f13737e;
        }
    }

    @Override // f7.a
    public final void Y() {
        AudioFocusRequest audioFocusRequest;
        switch (this.f13736d) {
            case 0:
                if (Z()) {
                    V().f13768a.a().abandonAudioFocus((a) this.f13740i);
                    return;
                }
                return;
            default:
                if (Z() && (audioFocusRequest = (AudioFocusRequest) this.f13740i) != null) {
                    V().f13768a.a().abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
        }
    }

    @Override // f7.a
    public final boolean Z() {
        switch (this.f13736d) {
            case 0:
                if (((a) this.f13740i) != null) {
                    return true;
                }
                return false;
            default:
                if (((AudioFocusRequest) this.f13740i) != null) {
                    return true;
                }
                return false;
        }
    }

    @Override // f7.a
    public final void k0() {
        int requestAudioFocus;
        switch (this.f13736d) {
            case 0:
                X(V().f13768a.a().requestAudioFocus((a) this.f13740i, 3, this.f13739h.f13465e));
                return;
            default:
                AudioManager a7 = V().f13768a.a();
                AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.f13740i;
                kotlin.jvm.internal.j.b(audioFocusRequest);
                requestAudioFocus = a7.requestAudioFocus(audioFocusRequest);
                X(requestAudioFocus);
                return;
        }
    }

    @Override // f7.a
    public final void m0(j7.a aVar) {
        switch (this.f13736d) {
            case 0:
                this.f13739h = aVar;
                return;
            default:
                this.f13739h = aVar;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [k7.a] */
    @Override // f7.a
    public final void q0() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest build;
        switch (this.f13736d) {
            case 0:
                if (this.f13739h.f13465e == 0) {
                    onAudioFocusChangeListener = null;
                } else {
                    onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: k7.a
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i7) {
                            switch (r2) {
                                case 0:
                                    b this$0 = (b) this;
                                    kotlin.jvm.internal.j.e(this$0, "this$0");
                                    this$0.X(i7);
                                    return;
                                default:
                                    b this$02 = (b) this;
                                    kotlin.jvm.internal.j.e(this$02, "this$0");
                                    this$02.X(i7);
                                    return;
                            }
                        }
                    };
                }
                this.f13740i = onAudioFocusChangeListener;
                return;
            default:
                if (this.f13739h.f13465e == 0) {
                    build = null;
                } else {
                    A.e.z();
                    audioAttributes = A.e.i(this.f13739h.f13465e).setAudioAttributes(this.f13739h.a());
                    onAudioFocusChangeListener2 = audioAttributes.setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: k7.a
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i7) {
                            switch (r2) {
                                case 0:
                                    b this$0 = (b) this;
                                    kotlin.jvm.internal.j.e(this$0, "this$0");
                                    this$0.X(i7);
                                    return;
                                default:
                                    b this$02 = (b) this;
                                    kotlin.jvm.internal.j.e(this$02, "this$0");
                                    this$02.X(i7);
                                    return;
                            }
                        }
                    });
                    build = onAudioFocusChangeListener2.build();
                }
                this.f13740i = build;
                return;
        }
    }
}
