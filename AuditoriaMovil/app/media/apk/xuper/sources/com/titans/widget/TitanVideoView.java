package com.titans.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ba.s;
import ba.t;
import com.hpplay.component.protocol.PlistBuilder;
import com.hpplay.sdk.source.common.global.Constant;
import com.titan.ranger.Status;
import com.titan.ranger.bean.Program;
import com.titans.bean.AudioTrack;
import com.umeng.analytics.pro.f;
import d8.c;
import j8.a;
import j8.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l8.h;
import n8.d;
import n8.e;
import o8.k;
import t9.i;
/* loaded from: classes3.dex */
public class TitanVideoView extends FrameLayout implements a, b {

    /* renamed from: a  reason: collision with root package name */
    public final String f9541a;

    /* renamed from: b  reason: collision with root package name */
    public int f9542b;

    /* renamed from: c  reason: collision with root package name */
    public n8.a f9543c;

    /* renamed from: d  reason: collision with root package name */
    public n8.b f9544d;

    /* renamed from: e  reason: collision with root package name */
    public o8.a f9545e;

    /* renamed from: f  reason: collision with root package name */
    public p8.a f9546f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9547g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9548h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f9549i;

    /* renamed from: j  reason: collision with root package name */
    public String f9550j;

    /* renamed from: k  reason: collision with root package name */
    public Map f9551k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitanVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.g(context, f.X);
        i.g(attributeSet, "attrs");
        this.f9551k = new LinkedHashMap();
        this.f9541a = "TitanVideoView";
        this.f9550j = "";
        r();
    }

    public static /* synthetic */ void A(TitanVideoView titanVideoView, i8.b bVar, Integer num, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            titanVideoView.z(bVar, num, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPlayerType");
    }

    public void B(Program program, String str, String str2) {
        String e10;
        i.g(program, "program");
        i.g(str, "programCode");
        i.g(str2, "extra");
        n8.b bVar = this.f9544d;
        if (bVar != null && (e10 = bVar.e()) != null) {
            h.f16357m.a().K(this.f9542b, e10);
            n8.b bVar2 = this.f9544d;
            if (bVar2 != null) {
                bVar2.c();
            }
        }
        n(program.getBuss(), str);
        n8.b bVar3 = this.f9544d;
        if (bVar3 != null) {
            i.d(bVar3);
            bVar3.f(program);
            n8.b bVar4 = this.f9544d;
            i.d(bVar4);
            bVar4.g(str);
        }
        n8.a aVar = this.f9543c;
        if (aVar != null) {
            Context context = getContext();
            i.f(context, f.X);
            aVar.e(context, d.f17322a.a());
        }
        this.f9547g = false;
        h.f16357m.a().z(this.f9542b, str, program, str2);
    }

    public final void C() {
        Program a10;
        n8.b bVar = this.f9544d;
        if (bVar != null && (a10 = bVar.a()) != null) {
            h.f16357m.a().J(this.f9542b, a10.getName());
        }
        n8.b bVar2 = this.f9544d;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    public final void D() {
        String e10;
        this.f9547g = false;
        n8.b bVar = this.f9544d;
        if (bVar != null && (e10 = bVar.e()) != null) {
            h.f16357m.a().K(this.f9542b, e10);
        }
        n8.b bVar2 = this.f9544d;
        if (bVar2 != null) {
            bVar2.c();
        }
        if (i.b(this.f9549i, Boolean.TRUE)) {
            this.f9549i = Boolean.FALSE;
        }
    }

    public void a(int i10, String str, String str2) {
        String str3;
        o8.a aVar;
        i.g(str, "type");
        i.g(str2, "name");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            str3 = bVar.e();
        } else {
            str3 = null;
        }
        if (!i.b(str2, str3)) {
            return;
        }
        if (i.b(str, "media")) {
            o8.a aVar2 = this.f9545e;
            if (aVar2 != null) {
                aVar2.onCompletion();
            }
        } else if (i.b(str, "ad") && (aVar = this.f9545e) != null) {
            aVar.O1();
        }
    }

    public void b(int i10, long j10, String str) {
        String str2;
        o8.a aVar;
        i.g(str, "name");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            str2 = bVar.e();
        } else {
            str2 = null;
        }
        if (i.b(str, str2) && s() && !this.f9548h && (aVar = this.f9545e) != null) {
            aVar.G0(j10);
        }
    }

    @Override // j8.a
    public void c(int i10, String str, String str2, int i11, String str3) {
        String str4;
        i.g(str, "obj");
        i.g(str2, "action");
        i.g(str3, "name");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            str4 = bVar.e();
        } else {
            str4 = null;
        }
        if (!i.b(str3, str4)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1123989362) {
            boolean z10 = true;
            if (hashCode != 61512610) {
                if (hashCode == 96784904 && str.equals("error")) {
                    if (i.b(str2, "show")) {
                        if (i11 == 13) {
                            o8.a aVar = this.f9545e;
                            if ((aVar == null || !aVar.w1()) ? false : false) {
                                return;
                            }
                        }
                        o8.a aVar2 = this.f9545e;
                        if (aVar2 != null) {
                            aVar2.u(i11);
                            return;
                        }
                        return;
                    }
                    o8.a aVar3 = this.f9545e;
                    if (aVar3 != null) {
                        aVar3.p1();
                    }
                }
            } else if (str.equals("buffering")) {
                if (i.b(str2, "show")) {
                    this.f9548h = true;
                    o8.a aVar4 = this.f9545e;
                    if (aVar4 != null) {
                        aVar4.n2();
                        return;
                    }
                    return;
                }
                this.f9548h = false;
                o8.a aVar5 = this.f9545e;
                if (aVar5 != null) {
                    aVar5.m2();
                }
            }
        } else if (str.equals("probe_net")) {
            if (i.b(str2, "show")) {
                o8.a aVar6 = this.f9545e;
                if (aVar6 != null) {
                    aVar6.H2();
                    return;
                }
                return;
            }
            o8.a aVar7 = this.f9545e;
            if (aVar7 != null) {
                aVar7.l0();
            }
        }
    }

    @Override // j8.a
    public void d(int i10, long j10, String str) {
        String str2;
        o8.a aVar;
        i.g(str, "name");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            str2 = bVar.e();
        } else {
            str2 = null;
        }
        if (i.b(str, str2) && (aVar = this.f9545e) != null) {
            aVar.r1(j10);
        }
    }

    @Override // j8.a
    public void e(boolean z10, Bitmap bitmap, String str) {
        String str2;
        i.g(str, "name");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            str2 = bVar.e();
        } else {
            str2 = null;
        }
        if (!i.b(str, str2)) {
            return;
        }
        if (z10 && bitmap != null) {
            o8.a aVar = this.f9545e;
            if (aVar != null) {
                aVar.I1(bitmap);
                return;
            }
            return;
        }
        o8.a aVar2 = this.f9545e;
        if (aVar2 != null) {
            aVar2.Z();
        }
    }

    @Override // j8.a
    public d8.d f(c cVar, String str) {
        String str2;
        o8.a aVar;
        i.g(cVar, "playStatus");
        i.g(str, "name");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            str2 = bVar.e();
        } else {
            str2 = null;
        }
        if (!i.b(str, str2) || (aVar = this.f9545e) == null) {
            return null;
        }
        return aVar.g1(getAudioTracks());
    }

    @Override // j8.a
    public void g(boolean z10, String str) {
        String str2;
        i.g(str, "name");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            str2 = bVar.e();
        } else {
            str2 = null;
        }
        if (!i.b(str, str2)) {
            return;
        }
        if (z10) {
            o8.a aVar = this.f9545e;
            if (aVar != null) {
                aVar.t0();
                return;
            }
            return;
        }
        o8.a aVar2 = this.f9545e;
        if (aVar2 != null) {
            aVar2.K0();
        }
    }

    public final List<AudioTrack> getAudioTracks() {
        ArrayList<d8.b> arrayList;
        boolean z10;
        c p10 = h.f16357m.a().p(this.f9542b);
        if (p10 != null) {
            arrayList = p10.f();
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (d8.b bVar : arrayList) {
                if (i.b(bVar.d(), "audio")) {
                    arrayList2.add(new AudioTrack(bVar.b(), bVar.c()));
                }
            }
        }
        return arrayList2;
    }

    public final long getCurrentProgress() {
        return h.f16357m.a().o(this.f9542b);
    }

    public final long getDuration() {
        c p10 = h.f16357m.a().p(this.f9542b);
        if (p10 != null) {
            return p10.c();
        }
        return 0L;
    }

    public final n8.a getMPlayer() {
        return this.f9543c;
    }

    public final c getPlayStatus() {
        return h.f16357m.a().p(this.f9542b);
    }

    public final n8.b getTitanContext() {
        return this.f9544d;
    }

    public void h(int i10, int i11, int i12, String str, String str2) {
        String str3;
        o8.a aVar;
        i.g(str, "type");
        i.g(str2, "name");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            str3 = bVar.e();
        } else {
            str3 = null;
        }
        if (!i.b(str2, str3)) {
            return;
        }
        n8.a aVar2 = this.f9543c;
        if (aVar2 != null) {
            aVar2.c(i11, i12);
        }
        if (i.b(str, "media")) {
            this.f9547g = true;
            o8.a aVar3 = this.f9545e;
            if (aVar3 != null) {
                aVar3.z();
            }
            if (i.b(this.f9549i, Boolean.TRUE)) {
                this.f9549i = Boolean.FALSE;
                q8.c cVar = q8.c.f18248a;
                c playStatus = getPlayStatus();
                cVar.f((playStatus == null || (r2 = playStatus.b()) == null) ? "" : "", str2);
            }
        } else if (i.b(str, "ad") && (aVar = this.f9545e) != null) {
            aVar.H1();
        }
    }

    @Override // j8.b
    public void i(int i10, String str, Status status, long j10) {
        String str2;
        o8.a aVar;
        o8.a aVar2;
        o8.a aVar3;
        o8.a aVar4;
        i.g(str, "event");
        i.g(status, Constant.KEY_STATUS);
        n8.b bVar = this.f9544d;
        Program program = null;
        if (bVar != null) {
            str2 = bVar.e();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            n8.b bVar2 = this.f9544d;
            if (bVar2 != null) {
                program = bVar2.a();
            }
            if (program == null) {
                return;
            }
        }
        switch (str.hashCode()) {
            case -1689439142:
                str.equals("license_expiring");
                return;
            case -843230256:
                if (str.equals("cast_prepare_error") && (aVar = this.f9545e) != null) {
                    aVar.d1(j10);
                    return;
                }
                return;
            case 730889939:
                if (str.equals("auth_expiring") && (aVar2 = this.f9545e) != null) {
                    aVar2.b1();
                    return;
                }
                return;
            case 1601094581:
                if (str.equals("media_prepare_error") && (aVar3 = this.f9545e) != null) {
                    aVar3.F1();
                    return;
                }
                return;
            case 1948221757:
                if (str.equals("cast_prepared") && (aVar4 = this.f9545e) != null) {
                    aVar4.q0(status);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // j8.b
    public void j(int i10, String str, Object obj, String str2) {
        i.g(str, "event");
        i.g(obj, "data");
        i.g(str2, "app_ctx");
    }

    @Override // j8.a
    public void k(int i10, String str) {
        String str2;
        o8.a aVar;
        i.g(str, "name");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            str2 = bVar.e();
        } else {
            str2 = null;
        }
        if (i.b(str, str2) && (aVar = this.f9545e) != null) {
            aVar.C1();
        }
    }

    @Override // j8.a
    public void l(int i10, int i11, String str, String str2) {
        String str3;
        i.g(str, "player");
        i.g(str2, "name");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            str3 = bVar.e();
        } else {
            str3 = null;
        }
        if (!i.b(str2, str3)) {
            return;
        }
        switch (i11) {
            case 1101:
            case 1102:
            case 1103:
                if (d.f17322a.c() && this.f9549i == null && !i.b(this.f9550j, str2)) {
                    i8.b bVar2 = i8.b.IJK;
                    if (i.b(str, bVar2.a())) {
                        bVar2 = i8.b.NATIVE;
                    }
                    this.f9550j = str2;
                    A(this, bVar2, Integer.valueOf(i11), false, 4, null);
                    q8.c cVar = q8.c.f18248a;
                    c playStatus = getPlayStatus();
                    cVar.h((playStatus == null || (r9 = playStatus.b()) == null) ? "" : "", str2, bVar2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // j8.b
    public void m(String str, String str2, long j10) {
        i.g(str, "adName");
        i.g(str2, "path");
        o8.a aVar = this.f9545e;
        if (aVar != null) {
            aVar.m(str, str2, j10);
        }
    }

    public final void n(String str, String str2) {
        q8.c cVar;
        i8.b c10;
        i.g(str, "buss");
        i.g(str2, "programCode");
        if (d.f17322a.c() && cVar.b() != (c10 = (cVar = q8.c.f18248a).c(str, str2))) {
            A(this, c10, null, false, 6, null);
        }
    }

    public final n8.b o() {
        return new e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n8.a aVar = this.f9543c;
        if (aVar != null) {
            aVar.a(this);
        }
        k.f17660a.e(this, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        n8.a aVar = this.f9543c;
        if (aVar != null) {
            aVar.f();
        }
        k.f17660a.h(this, this);
        super.onDetachedFromWindow();
    }

    public final n8.a p() {
        n8.c cVar = new n8.c();
        cVar.d(this.f9542b);
        return cVar;
    }

    public final d8.d q(String str, int i10) {
        i.g(str, "lang");
        List<AudioTrack> audioTracks = getAudioTracks();
        if (audioTracks.isEmpty()) {
            return null;
        }
        if (!i.b(audioTracks.get(0).getLang(), "") && !t.n(audioTracks.get(0).getLang(), "und", true) && !t.n(audioTracks.get(0).getLang(), "unknown", true) && !t.n(audioTracks.get(0).getLang(), "undefined", true)) {
            if (i10 < audioTracks.size() && s.l(audioTracks.get(i10).getLang(), str, false, 2, null)) {
                return new d8.d(0, audioTracks.get(i10).getTrackId(), 0, 5, null);
            }
            for (AudioTrack audioTrack : audioTracks) {
                if (s.l(audioTrack.getLang(), str, false, 2, null)) {
                    return new d8.d(0, audioTrack.getTrackId(), 0, 5, null);
                }
            }
            return null;
        } else if (i10 >= audioTracks.size()) {
            return null;
        } else {
            return new d8.d(0, audioTracks.get(i10).getTrackId(), 0, 5, null);
        }
    }

    public final void r() {
        this.f9543c = p();
        this.f9544d = o();
        d dVar = d.f17322a;
        if (!dVar.c()) {
            A(this, i8.b.IJK, null, false, 6, null);
        }
        setPollingPeriod(dVar.b());
    }

    public final boolean s() {
        return h.f16357m.a().t(this.f9542b);
    }

    public final void setAspectRatio(int i10) {
        n8.a aVar = this.f9543c;
        if (aVar != null) {
            aVar.setAspectRatio(i10);
        }
    }

    public final void setAudio(int i10) {
        d8.a a10;
        c playStatus = getPlayStatus();
        boolean z10 = false;
        if (playStatus != null && (a10 = playStatus.a()) != null && a10.a() == i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        h.f16357m.a().G(this.f9542b, "audio", i10);
    }

    public final void setIsPip(boolean z10) {
        this.f9542b = z10 ? 1 : 0;
        n8.a aVar = this.f9543c;
        if (aVar != null) {
            aVar.d(z10 ? 1 : 0);
        }
    }

    public final void setMPlayer(n8.a aVar) {
        this.f9543c = aVar;
    }

    public final void setMedia(String str) {
        String e10;
        i.g(str, "mediaCode");
        this.f9547g = false;
        n8.b bVar = this.f9544d;
        if (bVar != null && (e10 = bVar.e()) != null) {
            h.f16357m.a().F(this.f9542b, e10, str);
        }
    }

    public final void setMediaCast(String str) {
        Program a10;
        i.g(str, "mediaCode");
        this.f9547g = false;
        n8.b bVar = this.f9544d;
        if (bVar != null && (a10 = bVar.a()) != null) {
            h.f16357m.a().F(this.f9542b, a10.getName(), str);
        }
    }

    public final void setPlayerListener(o8.a aVar) {
        i.g(aVar, "playerListener");
        this.f9545e = aVar;
    }

    public final void setPlayerStateChangeListener(p8.a aVar) {
        i.g(aVar, "stateChangeListener");
        this.f9546f = aVar;
    }

    public final void setPollingPeriod(int i10) {
        h.f16357m.a().G(this.f9542b, "polling_period", i10);
    }

    public final void setThumbnail(int i10) {
        h.f16357m.a().G(this.f9542b, "thumbnail", i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        View view;
        super.setVisibility(i10);
        n8.a aVar = this.f9543c;
        if (aVar != null) {
            view = aVar.getRenderView();
        } else {
            view = null;
        }
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public final void setVolume(int i10) {
        h.f16357m.a().G(this.f9542b, PlistBuilder.VALUE_TYPE_VOLUME, i10);
    }

    public final boolean t() {
        return this.f9547g;
    }

    public final void u() {
        String e10;
        n8.b bVar = this.f9544d;
        if (bVar != null && (e10 = bVar.e()) != null) {
            h.f16357m.a().w(this.f9542b, e10);
        }
        p8.a aVar = this.f9546f;
        if (aVar != null) {
            aVar.c(3);
        }
    }

    public final void v(Program program, String str) {
        i.g(program, "program");
        i.g(str, "extra");
        n8.b bVar = this.f9544d;
        if (bVar != null) {
            i.d(bVar);
            bVar.d(program);
        }
        h.f16357m.a().y(this.f9542b, program.getName(), program, str);
    }

    public final void w() {
        String e10;
        n8.b bVar = this.f9544d;
        if (bVar != null && (e10 = bVar.e()) != null) {
            h.f16357m.a().A(this.f9542b, e10);
        }
        p8.a aVar = this.f9546f;
        if (aVar != null) {
            aVar.c(2);
        }
    }

    public final void x(long j10) {
        String e10;
        n8.b bVar = this.f9544d;
        if (bVar != null && (e10 = bVar.e()) != null) {
            h.f16357m.a().B(this.f9542b, e10, j10);
        }
    }

    public final boolean y(String str, int i10) {
        i.g(str, "lang");
        List<AudioTrack> audioTracks = getAudioTracks();
        if (!audioTracks.isEmpty()) {
            if (!i.b(audioTracks.get(0).getLang(), "") && !t.n(audioTracks.get(0).getLang(), "und", true) && !t.n(audioTracks.get(0).getLang(), "unknown", true) && !t.n(audioTracks.get(0).getLang(), "undefined", true)) {
                if (i10 < audioTracks.size() && s.l(audioTracks.get(i10).getLang(), str, false, 2, null)) {
                    new d8.d(0, audioTracks.get(i10).getTrackId(), 0, 5, null);
                    h.f16357m.a().G(this.f9542b, "audio", audioTracks.get(i10).getTrackId());
                    return true;
                }
                for (AudioTrack audioTrack : audioTracks) {
                    if (s.l(audioTrack.getLang(), str, false, 2, null)) {
                        h.f16357m.a().G(this.f9542b, "audio", audioTrack.getTrackId());
                        return true;
                    }
                }
            } else if (i10 < audioTracks.size()) {
                h.f16357m.a().G(this.f9542b, "audio", audioTracks.get(i10).getTrackId());
                return true;
            }
        }
        return false;
    }

    public final void z(i8.b bVar, Integer num, boolean z10) {
        Context context;
        i.g(bVar, "type");
        q8.c.f18248a.g(bVar);
        if (z10) {
            this.f9549i = Boolean.TRUE;
        }
        if (bVar == i8.b.EXO) {
            context = getContext().getApplicationContext();
        } else {
            context = null;
        }
        n8.a aVar = this.f9543c;
        if (aVar != null) {
            aVar.b(this.f9542b, bVar.a(), context, num);
        }
    }
}
