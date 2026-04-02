package j7;

import E6.m;
import L5.o;
import L5.q;
import a6.t0;
import android.media.AudioManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileNotFoundException;
import java.util.Collection;
import k7.h;
import kotlin.jvm.internal.i;
import l6.j;
import m6.AbstractC1447h;
import w6.p;
/* loaded from: classes.dex */
public final /* synthetic */ class c extends i implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(i7, obj, cls, str, str2, i8);
        this.f13468a = i9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        h hVar;
        f valueOf;
        h hVar2;
        h hVar3;
        h hVar4;
        Integer num2;
        h hVar5;
        h hVar6;
        L5.i iVar;
        g valueOf2;
        h hVar7;
        boolean z7;
        j jVar = j.f13876a;
        switch (this.f13468a) {
            case 0:
                o p02 = (o) obj;
                q p1 = (q) obj2;
                kotlin.jvm.internal.j.e(p02, "p0");
                kotlin.jvm.internal.j.e(p1, "p1");
                d dVar = (d) this.receiver;
                dVar.getClass();
                String str = (String) p02.a("playerId");
                if (str != null) {
                    String str2 = p02.f3038a;
                    boolean a7 = kotlin.jvm.internal.j.a(str2, "create");
                    ConcurrentHashMap concurrentHashMap = dVar.f13473e;
                    if (a7) {
                        L5.f fVar = dVar.f13471c;
                        if (fVar != null) {
                            e eVar = new e(new L5.j(fVar, "xyz.luan/audioplayers/events/".concat(str)));
                            a b5 = a.b(dVar.f);
                            t0 t0Var = dVar.f13472d;
                            if (t0Var != null) {
                                concurrentHashMap.put(str, new k7.o(dVar, eVar, b5, t0Var));
                                p1.a(1);
                            } else {
                                kotlin.jvm.internal.j.g("soundPoolManager");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.j.g("binaryMessenger");
                            throw null;
                        }
                    } else {
                        k7.o oVar = (k7.o) concurrentHashMap.get(str);
                        if (oVar != null) {
                            if (str2 != null) {
                                try {
                                    int hashCode = str2.hashCode();
                                    e eVar2 = oVar.f13769b;
                                    switch (hashCode) {
                                        case -1757019252:
                                            if (str2.equals("getCurrentPosition")) {
                                                if (oVar.f13778m && (hVar = oVar.f13772e) != null) {
                                                    num = hVar.l();
                                                } else {
                                                    num = null;
                                                }
                                                p1.a(num);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -1722943962:
                                            if (!str2.equals("setPlayerMode")) {
                                                break;
                                            } else {
                                                String str3 = (String) p02.a("playerMode");
                                                if (str3 == null) {
                                                    valueOf = null;
                                                } else {
                                                    valueOf = f.valueOf(F.f.A((String) AbstractC1447h.S(m.c0(str3, new char[]{'.'}))));
                                                }
                                                if (valueOf != null) {
                                                    oVar.g(valueOf);
                                                    p1.a(1);
                                                    break;
                                                } else {
                                                    throw new IllegalStateException("playerMode is required");
                                                }
                                            }
                                        case -1660487654:
                                            if (!str2.equals("setBalance")) {
                                                break;
                                            } else {
                                                Double d7 = (Double) p02.a("balance");
                                                if (d7 != null) {
                                                    float doubleValue = (float) d7.doubleValue();
                                                    if (oVar.f13774h != doubleValue) {
                                                        oVar.f13774h = doubleValue;
                                                        if (!oVar.f13777l && (hVar2 = oVar.f13772e) != null) {
                                                            k7.o.j(hVar2, oVar.f13773g, doubleValue);
                                                        }
                                                    }
                                                    p1.a(1);
                                                    break;
                                                } else {
                                                    throw new IllegalStateException("balance is required");
                                                }
                                            }
                                            break;
                                        case -1630329231:
                                            if (!str2.equals("emitLog")) {
                                                break;
                                            } else {
                                                String str4 = (String) p02.a("message");
                                                if (str4 != null) {
                                                    oVar.c(str4);
                                                    p1.a(1);
                                                    break;
                                                } else {
                                                    throw new IllegalStateException("message is required");
                                                }
                                            }
                                        case -934426579:
                                            if (str2.equals("resume")) {
                                                if (!oVar.f13779n && !oVar.f13777l) {
                                                    oVar.f13779n = true;
                                                    if (oVar.f13772e == null) {
                                                        h b7 = oVar.b();
                                                        oVar.f13772e = b7;
                                                        l7.c cVar = oVar.f;
                                                        if (cVar != null) {
                                                            b7.e(cVar);
                                                            oVar.a(b7);
                                                        }
                                                    } else if (oVar.f13778m) {
                                                        oVar.f();
                                                    }
                                                }
                                                p1.a(1);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -402284771:
                                            if (!str2.equals("setPlaybackRate")) {
                                                break;
                                            } else {
                                                Double d8 = (Double) p02.a("playbackRate");
                                                if (d8 != null) {
                                                    float doubleValue2 = (float) d8.doubleValue();
                                                    if (oVar.f13775i != doubleValue2) {
                                                        oVar.f13775i = doubleValue2;
                                                        if (oVar.f13779n && (hVar3 = oVar.f13772e) != null) {
                                                            hVar3.h(doubleValue2);
                                                        }
                                                    }
                                                    p1.a(1);
                                                    break;
                                                } else {
                                                    throw new IllegalStateException("playbackRate is required");
                                                }
                                            }
                                        case -159032046:
                                            if (!str2.equals("setSourceUrl")) {
                                                break;
                                            } else {
                                                String str5 = (String) p02.a("url");
                                                if (str5 != null) {
                                                    Boolean bool = (Boolean) p02.a("isLocal");
                                                    if (bool == null) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                    try {
                                                        oVar.i(new l7.d(str5, bool.booleanValue()));
                                                        p1.a(1);
                                                        break;
                                                    } catch (FileNotFoundException e7) {
                                                        p1.b(e7, "AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md");
                                                        break;
                                                    }
                                                } else {
                                                    throw new IllegalStateException("url is required");
                                                }
                                            }
                                        case 3526264:
                                            if (!str2.equals("seek")) {
                                                break;
                                            } else {
                                                Integer num3 = (Integer) p02.a("position");
                                                if (num3 != null) {
                                                    int intValue = num3.intValue();
                                                    if (oVar.f13778m && ((hVar4 = oVar.f13772e) == null || !hVar4.g())) {
                                                        h hVar8 = oVar.f13772e;
                                                        if (hVar8 != null) {
                                                            hVar8.i(intValue);
                                                        }
                                                        intValue = -1;
                                                    }
                                                    oVar.f13780o = intValue;
                                                    p1.a(1);
                                                    break;
                                                } else {
                                                    throw new IllegalStateException("position is required");
                                                }
                                            }
                                        case 3540994:
                                            if (str2.equals("stop")) {
                                                oVar.k();
                                                p1.a(1);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 85887754:
                                            if (str2.equals("getDuration")) {
                                                if (oVar.f13778m && (hVar5 = oVar.f13772e) != null) {
                                                    num2 = hVar5.f();
                                                } else {
                                                    num2 = null;
                                                }
                                                p1.a(num2);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 106440182:
                                            if (str2.equals("pause")) {
                                                oVar.d();
                                                p1.a(1);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 670514716:
                                            if (!str2.equals("setVolume")) {
                                                break;
                                            } else {
                                                Double d9 = (Double) p02.a("volume");
                                                if (d9 != null) {
                                                    float doubleValue3 = (float) d9.doubleValue();
                                                    if (oVar.f13773g != doubleValue3) {
                                                        oVar.f13773g = doubleValue3;
                                                        if (!oVar.f13777l && (hVar6 = oVar.f13772e) != null) {
                                                            k7.o.j(hVar6, doubleValue3, oVar.f13774h);
                                                        }
                                                    }
                                                    p1.a(1);
                                                    break;
                                                } else {
                                                    throw new IllegalStateException("volume is required");
                                                }
                                            }
                                            break;
                                        case 910310901:
                                            if (!str2.equals("emitError")) {
                                                break;
                                            } else {
                                                String str6 = (String) p02.a("code");
                                                if (str6 != null) {
                                                    String str7 = (String) p02.a("message");
                                                    if (str7 != null) {
                                                        oVar.f13768a.getClass();
                                                        L5.h hVar9 = eVar2.f13475b;
                                                        if (hVar9 != null) {
                                                            hVar9.b(str6, str7, null);
                                                        }
                                                        p1.a(1);
                                                        break;
                                                    } else {
                                                        throw new IllegalStateException("message is required");
                                                    }
                                                } else {
                                                    throw new IllegalStateException("code is required");
                                                }
                                            }
                                        case 1090594823:
                                            if (str2.equals("release")) {
                                                oVar.e();
                                                p1.a(1);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1671767583:
                                            if (str2.equals("dispose")) {
                                                oVar.e();
                                                L5.h hVar10 = eVar2.f13475b;
                                                if (hVar10 != null) {
                                                    hVar10.a();
                                                    iVar = null;
                                                    eVar2.f13475b = null;
                                                } else {
                                                    iVar = null;
                                                }
                                                eVar2.f13476c.a(iVar);
                                                concurrentHashMap.remove(str);
                                                p1.a(1);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1771699022:
                                            if (!str2.equals("setSourceBytes")) {
                                                break;
                                            } else {
                                                byte[] bArr = (byte[]) p02.a("bytes");
                                                if (bArr != null) {
                                                    oVar.i(new l7.b(bArr));
                                                    p1.a(1);
                                                    break;
                                                } else {
                                                    throw new IllegalStateException("bytes are required");
                                                }
                                            }
                                        case 1902436987:
                                            if (str2.equals("setAudioContext")) {
                                                oVar.l(F.f.b(p02));
                                                p1.a(1);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 2096116872:
                                            if (!str2.equals("setReleaseMode")) {
                                                break;
                                            } else {
                                                String str8 = (String) p02.a("releaseMode");
                                                if (str8 == null) {
                                                    valueOf2 = null;
                                                } else {
                                                    valueOf2 = g.valueOf(F.f.A((String) AbstractC1447h.S(m.c0(str8, new char[]{'.'}))));
                                                }
                                                if (valueOf2 != null) {
                                                    if (oVar.j != valueOf2) {
                                                        oVar.j = valueOf2;
                                                        if (!oVar.f13777l && (hVar7 = oVar.f13772e) != null) {
                                                            if (valueOf2 == g.LOOP) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            hVar7.d(z7);
                                                        }
                                                    }
                                                    p1.a(1);
                                                    break;
                                                } else {
                                                    throw new IllegalStateException("releaseMode is required");
                                                }
                                            }
                                    }
                                } catch (Exception e8) {
                                    p1.b(e8, "AndroidAudioError", e8.getMessage());
                                }
                            }
                            p1.c();
                        } else {
                            throw new IllegalStateException("Player has not yet been created or has already been disposed.");
                        }
                    }
                }
                return jVar;
            default:
                o p03 = (o) obj;
                q p12 = (q) obj2;
                kotlin.jvm.internal.j.e(p03, "p0");
                kotlin.jvm.internal.j.e(p12, "p1");
                d dVar2 = (d) this.receiver;
                dVar2.getClass();
                String str9 = p03.f3038a;
                if (str9 != null) {
                    switch (str9.hashCode()) {
                        case -1630329231:
                            if (str9.equals("emitLog")) {
                                String str10 = (String) p03.a("message");
                                if (str10 != null) {
                                    dVar2.b(str10);
                                    p12.a(1);
                                    break;
                                } else {
                                    throw new IllegalStateException("message is required");
                                }
                            }
                            break;
                        case 3237136:
                            if (str9.equals("init")) {
                                ConcurrentHashMap concurrentHashMap2 = dVar2.f13473e;
                                Collection<k7.o> values = concurrentHashMap2.values();
                                kotlin.jvm.internal.j.d(values, "players.values");
                                for (k7.o oVar2 : values) {
                                    oVar2.e();
                                    e eVar3 = oVar2.f13769b;
                                    L5.h hVar11 = eVar3.f13475b;
                                    if (hVar11 != null) {
                                        hVar11.a();
                                        eVar3.f13475b = null;
                                    }
                                    eVar3.f13476c.a(null);
                                }
                                concurrentHashMap2.clear();
                                p12.a(1);
                                break;
                            }
                            break;
                        case 910310901:
                            if (str9.equals("emitError")) {
                                String str11 = (String) p03.a("code");
                                if (str11 != null) {
                                    String str12 = (String) p03.a("message");
                                    if (str12 != null) {
                                        e eVar4 = dVar2.f13469a;
                                        if (eVar4 != null) {
                                            L5.h hVar12 = eVar4.f13475b;
                                            if (hVar12 != null) {
                                                hVar12.b(str11, str12, null);
                                            }
                                            p12.a(1);
                                            break;
                                        } else {
                                            kotlin.jvm.internal.j.g("globalEvents");
                                            throw null;
                                        }
                                    } else {
                                        throw new IllegalStateException("message is required");
                                    }
                                } else {
                                    throw new IllegalStateException("code is required");
                                }
                            }
                            break;
                        case 1902436987:
                            if (str9.equals("setAudioContext")) {
                                AudioManager a8 = dVar2.a();
                                a8.setMode(dVar2.f.f);
                                a8.setSpeakerphoneOn(dVar2.f.f13461a);
                                dVar2.f = F.f.b(p03);
                                p12.a(1);
                                break;
                            }
                            break;
                    }
                    return jVar;
                }
                p12.c();
                return jVar;
        }
    }
}
