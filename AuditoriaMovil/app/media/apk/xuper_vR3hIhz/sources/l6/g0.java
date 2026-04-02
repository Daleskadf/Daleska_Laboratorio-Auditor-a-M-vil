package l6;

import android.content.Context;
import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
import com.mobile.brasiltv.activity.MainAty;
import com.msandroid.mobile.R;
import com.titan.ranger.bean.Media;
import com.titan.ranger.bean.Program;
import com.titans.entity.RangerPlayTag;
import com.umeng.analytics.pro.bd;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import mobile.com.requestframe.utils.response.Channel;
import mobile.com.requestframe.utils.response.Favorite;
import mobile.com.requestframe.utils.response.LiveAddress;
import org.android.agoo.common.AgooConstants;
/* loaded from: classes3.dex */
public final class g0 implements j6.f {

    /* renamed from: a  reason: collision with root package name */
    public final b6.f f15998a;

    /* renamed from: b  reason: collision with root package name */
    public final j6.g f15999b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16000c;

    /* renamed from: d  reason: collision with root package name */
    public o6.a f16001d;

    /* renamed from: e  reason: collision with root package name */
    public List f16002e;

    /* renamed from: f  reason: collision with root package name */
    public Disposable f16003f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f16004g;

    /* loaded from: classes3.dex */
    public static final class a extends t9.j implements s9.l {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List f16006b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Channel f16007c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, Channel channel) {
            super(1);
            this.f16006b = list;
            this.f16007c = channel;
        }

        @Override // s9.l
        /* renamed from: b */
        public final Media invoke(o6.a aVar) {
            t9.i.g(aVar, "it");
            Object obj = aVar.e().get(0);
            t9.i.f(obj, "it.liveAddressList[0]");
            LiveAddress liveAddress = (LiveAddress) obj;
            g0 g0Var = g0.this;
            List list = this.f16006b;
            t9.i.d(list);
            String c10 = aVar.c();
            String supportVideoType = this.f16007c.getSupportVideoType();
            if (supportVideoType == null) {
                supportVideoType = "";
            }
            return g0Var.p(list, liveAddress, c10, supportVideoType);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends t9.j implements s9.p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16008a = new b();

        public b() {
            super(2);
        }

        public final void b(ArrayList arrayList, Media media) {
            if (media != null) {
                arrayList.add(media);
            }
        }

        @Override // s9.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((ArrayList) obj, (Media) obj2);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends t9.j implements s9.l {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Channel f16010b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Channel channel) {
            super(1);
            this.f16010b = channel;
        }

        @Override // s9.l
        /* renamed from: b */
        public final Program invoke(ArrayList arrayList) {
            t9.i.g(arrayList, "it");
            k7.f.e("media size: " + arrayList.size(), new Object[0]);
            return g0.this.q(this.f16010b, arrayList);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends t9.j implements s9.l {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Channel f16012b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Channel channel) {
            super(1);
            this.f16012b = channel;
        }

        public final void b(Program program) {
            g0 g0Var = g0.this;
            com.mobile.brasiltv.utils.b0.U(g0Var, "program info is " + program);
            j6.g x10 = g0.this.x();
            Channel channel = this.f16012b;
            t9.i.f(program, "it");
            x10.C0(channel, program);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Program) obj);
            return h9.t.f14242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends t9.j implements s9.l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f16013a = new e();

        public e() {
            super(1);
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return h9.t.f14242a;
        }

        public final void invoke(Throwable th) {
            th.printStackTrace();
        }
    }

    public g0(b6.f fVar, j6.g gVar) {
        t9.i.g(fVar, "frag");
        t9.i.g(gVar, "view");
        this.f15998a = fVar;
        this.f15999b = gVar;
        this.f16002e = new ArrayList();
        this.f16004g = new ArrayList();
    }

    public static final ArrayList A() {
        return new ArrayList();
    }

    public static final void B(s9.p pVar, Object obj, Object obj2) {
        t9.i.g(pVar, "$tmp0");
        pVar.invoke(obj, obj2);
    }

    public static final Program C(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        return (Program) lVar.invoke(obj);
    }

    public static final void D(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void E(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final Media z(s9.l lVar, Object obj) {
        t9.i.g(lVar, "$tmp0");
        return (Media) lVar.invoke(obj);
    }

    public void F(boolean z10) {
        this.f16000c = z10;
    }

    public void G(Channel channel) {
        List<LiveAddress> liveAddressList;
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        if (channel != null && (liveAddressList = channel.getLiveAddressList()) != null && liveAddressList.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            this.f16002e = arrayList;
            return;
        }
        o6.a aVar = new o6.a(o6.c.c().a(), o6.c.c().c(), o6.c.c().d(), new ArrayList());
        o6.a aVar2 = new o6.a(o6.c.b().a(), o6.c.b().c(), o6.c.b().d(), new ArrayList());
        o6.a aVar3 = new o6.a(o6.c.a().a(), o6.c.a().c(), o6.c.a().d(), new ArrayList());
        t9.i.d(channel);
        List<LiveAddress> liveAddressList2 = channel.getLiveAddressList();
        if (liveAddressList2 != null) {
            for (LiveAddress liveAddress : liveAddressList2) {
                if (!com.mobile.brasiltv.utils.b0.J(liveAddress.getQuality()) && !t9.i.b(liveAddress.getQuality(), "1")) {
                    if (t9.i.b(liveAddress.getQuality(), "2")) {
                        aVar2.e().add(liveAddress);
                    } else if (t9.i.b(liveAddress.getQuality(), "3")) {
                        aVar3.e().add(liveAddress);
                    }
                } else {
                    aVar.e().add(liveAddress);
                }
            }
        }
        if (!aVar3.e().isEmpty()) {
            arrayList.add(aVar3);
        }
        if (!aVar2.e().isEmpty()) {
            arrayList.add(aVar2);
        }
        if (!aVar.e().isEmpty()) {
            arrayList.add(aVar);
        }
        this.f16002e = arrayList;
    }

    @Override // j6.f
    public void b(Channel channel, String str) {
        boolean z10;
        String str2;
        String str3;
        String str4;
        boolean z11;
        t9.i.g(str, "slbHost");
        t();
        if (channel == null) {
            return;
        }
        com.mobile.brasiltv.utils.b0.U(this, "channel: " + channel);
        r5.i iVar = r5.i.f18523a;
        List x10 = iVar.x(r5.k.LIVE);
        boolean z12 = false;
        if (x10 != null && !x10.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            str2 = "";
            str3 = str2;
        } else {
            com.mobile.brasiltv.utils.b0.U(this, "live cdn list");
            str2 = iVar.z();
            if (str2.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str2 = "20900";
            }
            str3 = com.mobile.brasiltv.utils.y.f8771a.c(str2);
        }
        List<LiveAddress> liveAddressList = channel.getLiveAddressList();
        if ((liveAddressList == null || liveAddressList.isEmpty()) ? true : true) {
            com.mobile.brasiltv.utils.b0.U(this, "live address list is empty");
            str3 = "EC21";
            str2 = AgooConstants.REPORT_MESSAGE_NULL;
        }
        String str5 = str2;
        String str6 = str3;
        if (!t9.i.b(str6, "")) {
            c2.d.f5311a.g(channel.getChannelCode(), channel.getName(), str, com.mobile.brasiltv.utils.y.f8771a.h(), "", str6, str5, "apk");
            j6.g gVar = this.f15999b;
            StringBuilder sb = new StringBuilder();
            sb.append(str6);
            sb.append(ASCIIPropertyListParser.DATE_DATE_FIELD_DELIMITER);
            Context context = this.f15998a.getContext();
            if (context != null) {
                str4 = com.mobile.brasiltv.utils.x.f8754a.y(context, R.string.failed_ec5);
            } else {
                str4 = null;
            }
            sb.append(str4);
            gVar.z0(sb.toString());
            return;
        }
        com.mobile.brasiltv.utils.b0.U(this, "live cdn tag list: " + x10);
        Observable fromIterable = Observable.fromIterable(this.f16002e);
        final a aVar = new a(x10, channel);
        Observable map = fromIterable.map(new Function() { // from class: l6.a0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Media z13;
                z13 = g0.z(s9.l.this, obj);
                return z13;
            }
        });
        Callable callable = new Callable() { // from class: l6.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList A;
                A = g0.A();
                return A;
            }
        };
        final b bVar = b.f16008a;
        Single collect = map.collect(callable, new BiConsumer() { // from class: l6.c0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                g0.B(s9.p.this, obj, obj2);
            }
        });
        final c cVar = new c(channel);
        Single compose = collect.map(new Function() { // from class: l6.d0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Program C;
                C = g0.C(s9.l.this, obj);
                return C;
            }
        }).compose(ma.q.c()).compose(this.f15998a.O2());
        final d dVar = new d(channel);
        Consumer consumer = new Consumer() { // from class: l6.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                g0.D(s9.l.this, obj);
            }
        };
        final e eVar = e.f16013a;
        this.f16003f = compose.subscribe(consumer, new Consumer() { // from class: l6.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                g0.E(s9.l.this, obj);
            }
        });
    }

    @Override // l5.a
    public void e() {
    }

    @Override // l5.a
    public void g() {
    }

    public final Media p(List list, LiveAddress liveAddress, String str, String str2) {
        boolean z10;
        String str3;
        String playCode = liveAddress.getPlayCode();
        if (playCode != null && playCode.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && list.contains(liveAddress.getTag())) {
            String playCode2 = liveAddress.getPlayCode();
            t9.i.d(playCode2);
            String license = liveAddress.getLicense();
            if (com.mobile.brasiltv.utils.b0.K(liveAddress.getAVFormat())) {
                str3 = liveAddress.getAVFormat();
            } else {
                str3 = "";
            }
            return new Media(playCode2, license, "", str, str2, str3);
        }
        return null;
    }

    public final Program q(Channel channel, List list) {
        return new Program(channel.getChannelCode(), RangerPlayTag.LIVE.getValue(), channel.getName(), "-1", this.f15999b.Z0(), bd.f9986m, list, "", 0L);
    }

    public void r() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object obj = null;
        if (this.f16002e.isEmpty()) {
            this.f16001d = null;
            return;
        }
        List<o6.a> list = this.f16002e;
        boolean z16 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (o6.a aVar : list) {
                if (aVar.b() == MainAty.A.d()) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (z11) {
            Iterator it = this.f16002e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((o6.a) next).b() == MainAty.A.d()) {
                    z15 = true;
                    continue;
                } else {
                    z15 = false;
                    continue;
                }
                if (z15) {
                    obj = next;
                    break;
                }
            }
            this.f16001d = (o6.a) obj;
            return;
        }
        int d10 = MainAty.A.d();
        if (d10 != 1) {
            if (d10 != 2) {
                if (d10 == 3) {
                    List<o6.a> list2 = this.f16002e;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (o6.a aVar2 : list2) {
                            if (t9.i.b(aVar2.c(), "720p")) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    z14 = false;
                    if (z14) {
                        Iterator it2 = this.f16002e.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            if (t9.i.b(((o6.a) next2).c(), "720p")) {
                                obj = next2;
                                break;
                            }
                        }
                        o6.a aVar3 = (o6.a) obj;
                        this.f16001d = aVar3;
                        MainAty.a aVar4 = MainAty.A;
                        t9.i.d(aVar3);
                        aVar4.m(aVar3.b());
                        return;
                    }
                    List<o6.a> list3 = this.f16002e;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        for (o6.a aVar5 : list3) {
                            if (t9.i.b(aVar5.c(), "480p")) {
                                break;
                            }
                        }
                    }
                    z16 = false;
                    if (z16) {
                        Iterator it3 = this.f16002e.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next3 = it3.next();
                            if (t9.i.b(((o6.a) next3).c(), "480p")) {
                                obj = next3;
                                break;
                            }
                        }
                        o6.a aVar6 = (o6.a) obj;
                        this.f16001d = aVar6;
                        MainAty.a aVar7 = MainAty.A;
                        t9.i.d(aVar6);
                        aVar7.m(aVar6.b());
                        return;
                    }
                    return;
                }
                return;
            }
            List<o6.a> list4 = this.f16002e;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                for (o6.a aVar8 : list4) {
                    if (t9.i.b(aVar8.c(), "480p")) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            if (z13) {
                Iterator it4 = this.f16002e.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next4 = it4.next();
                    if (t9.i.b(((o6.a) next4).c(), "480p")) {
                        obj = next4;
                        break;
                    }
                }
                o6.a aVar9 = (o6.a) obj;
                this.f16001d = aVar9;
                MainAty.a aVar10 = MainAty.A;
                t9.i.d(aVar9);
                aVar10.m(aVar9.b());
                return;
            }
            List<o6.a> list5 = this.f16002e;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                for (o6.a aVar11 : list5) {
                    if (t9.i.b(aVar11.c(), "1080p")) {
                        break;
                    }
                }
            }
            z16 = false;
            if (z16) {
                Iterator it5 = this.f16002e.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next5 = it5.next();
                    if (t9.i.b(((o6.a) next5).c(), "1080p")) {
                        obj = next5;
                        break;
                    }
                }
                o6.a aVar12 = (o6.a) obj;
                this.f16001d = aVar12;
                MainAty.a aVar13 = MainAty.A;
                t9.i.d(aVar12);
                aVar13.m(aVar12.b());
                return;
            }
            return;
        }
        List<o6.a> list6 = this.f16002e;
        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
            for (o6.a aVar14 : list6) {
                if (t9.i.b(aVar14.c(), "720p")) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (z12) {
            Iterator it6 = this.f16002e.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next6 = it6.next();
                if (t9.i.b(((o6.a) next6).c(), "720p")) {
                    obj = next6;
                    break;
                }
            }
            o6.a aVar15 = (o6.a) obj;
            this.f16001d = aVar15;
            MainAty.a aVar16 = MainAty.A;
            t9.i.d(aVar15);
            aVar16.m(aVar15.b());
            return;
        }
        List<o6.a> list7 = this.f16002e;
        if (!(list7 instanceof Collection) || !list7.isEmpty()) {
            for (o6.a aVar17 : list7) {
                if (t9.i.b(aVar17.c(), "1080p")) {
                    break;
                }
            }
        }
        z16 = false;
        if (z16) {
            Iterator it7 = this.f16002e.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                Object next7 = it7.next();
                if (t9.i.b(((o6.a) next7).c(), "1080p")) {
                    obj = next7;
                    break;
                }
            }
            o6.a aVar18 = (o6.a) obj;
            this.f16001d = aVar18;
            MainAty.a aVar19 = MainAty.A;
            t9.i.d(aVar18);
            aVar19.m(aVar18.b());
        }
    }

    public void s() {
        this.f16001d = null;
        MainAty.A.m(1);
    }

    public final void t() {
        Disposable disposable = this.f16003f;
        boolean z10 = false;
        if (disposable != null && disposable.isDisposed()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        Disposable disposable2 = this.f16003f;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        this.f16003f = null;
    }

    public final ArrayList u() {
        if (this.f16004g == null) {
            this.f16004g = new ArrayList();
        }
        this.f16004g.clear();
        d6.a aVar = d6.a.f12650a;
        if (aVar.j() == 3 && aVar.i().size() > 0) {
            for (Iterator it = aVar.i().iterator(); it.hasNext(); it = it) {
                Favorite favorite = (Favorite) it.next();
                ArrayList arrayList = this.f16004g;
                String contentId = favorite.getContentId();
                t9.i.d(contentId);
                String name = favorite.getName();
                t9.i.d(name);
                arrayList.add(new Channel(contentId, name, favorite.getAlias(), 0, favorite.getPosterUrl(), null, "0", null, null, null, null));
            }
        }
        return this.f16004g;
    }

    public o6.a v() {
        return this.f16001d;
    }

    public final ArrayList w() {
        return this.f16004g;
    }

    public final j6.g x() {
        return this.f15999b;
    }

    public boolean y() {
        return this.f16000c;
    }
}
