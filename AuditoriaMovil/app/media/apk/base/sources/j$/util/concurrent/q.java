package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q extends l {

    /* renamed from: h  reason: collision with root package name */
    private static final j$.sun.misc.a f12930h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f12931i;

    /* renamed from: e  reason: collision with root package name */
    r f12932e;
    volatile r f;

    /* renamed from: g  reason: collision with root package name */
    volatile Thread f12933g;
    volatile int lockState;

    static int i(Object obj, Object obj2) {
        int compareTo;
        if (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return compareTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(r rVar) {
        super(-2, null, null);
        int i7;
        this.f = rVar;
        r rVar2 = null;
        while (rVar != null) {
            r rVar3 = (r) rVar.f12918d;
            rVar.f12935g = null;
            rVar.f = null;
            if (rVar2 == null) {
                rVar.f12934e = null;
                rVar.f12937i = false;
            } else {
                Object obj = rVar.f12916b;
                int i8 = rVar.f12915a;
                r rVar4 = rVar2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = rVar4.f12916b;
                    int i9 = rVar4.f12915a;
                    if (i9 > i8) {
                        i7 = -1;
                    } else if (i9 < i8) {
                        i7 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                            int i10 = ConcurrentHashMap.f12878g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i7 = compareTo;
                            }
                        }
                        i7 = i(obj, obj2);
                    }
                    r rVar5 = i7 <= 0 ? rVar4.f : rVar4.f12935g;
                    if (rVar5 == null) {
                        break;
                    }
                    rVar4 = rVar5;
                }
                rVar.f12934e = rVar4;
                if (i7 <= 0) {
                    rVar4.f = rVar;
                } else {
                    rVar4.f12935g = rVar;
                }
                rVar = c(rVar2, rVar);
            }
            rVar2 = rVar;
            rVar = rVar3;
        }
        this.f12932e = rVar2;
    }

    private final void d() {
        if (f12930h.c(this, f12931i, 0, 1)) {
            return;
        }
        boolean z7 = false;
        while (true) {
            int i7 = this.lockState;
            if ((i7 & (-3)) == 0) {
                if (f12930h.c(this, f12931i, i7, 1)) {
                    break;
                }
            } else if ((i7 & 2) == 0) {
                if (f12930h.c(this, f12931i, i7, i7 | 2)) {
                    this.f12933g = Thread.currentThread();
                    z7 = true;
                }
            } else if (z7) {
                LockSupport.park(this);
            }
        }
        if (z7) {
            this.f12933g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i7, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        r rVar = null;
        if (obj != null) {
            l lVar = this.f;
            while (lVar != null) {
                int i8 = this.lockState;
                if ((i8 & 3) != 0) {
                    if (lVar.f12915a == i7 && ((obj2 = lVar.f12916b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return lVar;
                    }
                    lVar = lVar.f12918d;
                } else {
                    j$.sun.misc.a aVar = f12930h;
                    long j = f12931i;
                    if (aVar.c(this, j, i8, i8 + 4)) {
                        try {
                            r rVar2 = this.f12932e;
                            if (rVar2 != null) {
                                rVar = rVar2.b(i7, obj, null);
                            }
                            if (aVar.f(this, j) == 6 && (thread2 = this.f12933g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return rVar;
                        } catch (Throwable th) {
                            if (f12930h.f(this, f12931i) == 6 && (thread = this.f12933g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7 A[LOOP:0: B:3:0x000c->B:61:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.r e(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.r");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0091 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:41:0x0068, B:43:0x006e, B:44:0x0070, B:59:0x0091, B:66:0x00a2, B:62:0x0099, B:64:0x009d, B:65:0x00a0, B:67:0x00a8, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:77:0x00bd, B:81:0x00c6, B:78:0x00c0, B:80:0x00c4, B:70:0x00ad, B:47:0x007a, B:49:0x007e, B:50:0x0081, B:34:0x0055, B:36:0x005b, B:38:0x005f, B:39:0x0062, B:40:0x0064), top: B:87:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ad A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:41:0x0068, B:43:0x006e, B:44:0x0070, B:59:0x0091, B:66:0x00a2, B:62:0x0099, B:64:0x009d, B:65:0x00a0, B:67:0x00a8, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:77:0x00bd, B:81:0x00c6, B:78:0x00c0, B:80:0x00c4, B:70:0x00ad, B:47:0x007a, B:49:0x007e, B:50:0x0081, B:34:0x0055, B:36:0x005b, B:38:0x005f, B:39:0x0062, B:40:0x0064), top: B:87:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:41:0x0068, B:43:0x006e, B:44:0x0070, B:59:0x0091, B:66:0x00a2, B:62:0x0099, B:64:0x009d, B:65:0x00a0, B:67:0x00a8, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:77:0x00bd, B:81:0x00c6, B:78:0x00c0, B:80:0x00c4, B:70:0x00ad, B:47:0x007a, B:49:0x007e, B:50:0x0081, B:34:0x0055, B:36:0x005b, B:38:0x005f, B:39:0x0062, B:40:0x0064), top: B:87:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:41:0x0068, B:43:0x006e, B:44:0x0070, B:59:0x0091, B:66:0x00a2, B:62:0x0099, B:64:0x009d, B:65:0x00a0, B:67:0x00a8, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:77:0x00bd, B:81:0x00c6, B:78:0x00c0, B:80:0x00c4, B:70:0x00ad, B:47:0x007a, B:49:0x007e, B:50:0x0081, B:34:0x0055, B:36:0x005b, B:38:0x005f, B:39:0x0062, B:40:0x0064), top: B:87:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c0 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:41:0x0068, B:43:0x006e, B:44:0x0070, B:59:0x0091, B:66:0x00a2, B:62:0x0099, B:64:0x009d, B:65:0x00a0, B:67:0x00a8, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:77:0x00bd, B:81:0x00c6, B:78:0x00c0, B:80:0x00c4, B:70:0x00ad, B:47:0x007a, B:49:0x007e, B:50:0x0081, B:34:0x0055, B:36:0x005b, B:38:0x005f, B:39:0x0062, B:40:0x0064), top: B:87:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(j$.util.concurrent.r r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.f(j$.util.concurrent.r):boolean");
    }

    static r g(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f12935g) != null) {
            r rVar4 = rVar3.f;
            rVar2.f12935g = rVar4;
            if (rVar4 != null) {
                rVar4.f12934e = rVar2;
            }
            r rVar5 = rVar2.f12934e;
            rVar3.f12934e = rVar5;
            if (rVar5 == null) {
                rVar3.f12937i = false;
                rVar = rVar3;
            } else if (rVar5.f == rVar2) {
                rVar5.f = rVar3;
            } else {
                rVar5.f12935g = rVar3;
            }
            rVar3.f = rVar2;
            rVar2.f12934e = rVar3;
        }
        return rVar;
    }

    static r h(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f) != null) {
            r rVar4 = rVar3.f12935g;
            rVar2.f = rVar4;
            if (rVar4 != null) {
                rVar4.f12934e = rVar2;
            }
            r rVar5 = rVar2.f12934e;
            rVar3.f12934e = rVar5;
            if (rVar5 == null) {
                rVar3.f12937i = false;
                rVar = rVar3;
            } else if (rVar5.f12935g == rVar2) {
                rVar5.f12935g = rVar3;
            } else {
                rVar5.f = rVar3;
            }
            rVar3.f12935g = rVar2;
            rVar2.f12934e = rVar3;
        }
        return rVar;
    }

    static r c(r rVar, r rVar2) {
        r rVar3;
        rVar2.f12937i = true;
        while (true) {
            r rVar4 = rVar2.f12934e;
            if (rVar4 == null) {
                rVar2.f12937i = false;
                return rVar2;
            } else if (!rVar4.f12937i || (rVar3 = rVar4.f12934e) == null) {
                break;
            } else {
                r rVar5 = rVar3.f;
                if (rVar4 == rVar5) {
                    r rVar6 = rVar3.f12935g;
                    if (rVar6 != null && rVar6.f12937i) {
                        rVar6.f12937i = false;
                        rVar4.f12937i = false;
                        rVar3.f12937i = true;
                        rVar2 = rVar3;
                    } else {
                        if (rVar2 == rVar4.f12935g) {
                            rVar = g(rVar, rVar4);
                            r rVar7 = rVar4.f12934e;
                            rVar3 = rVar7 == null ? null : rVar7.f12934e;
                            rVar4 = rVar7;
                            rVar2 = rVar4;
                        }
                        if (rVar4 != null) {
                            rVar4.f12937i = false;
                            if (rVar3 != null) {
                                rVar3.f12937i = true;
                                rVar = h(rVar, rVar3);
                            }
                        }
                    }
                } else if (rVar5 != null && rVar5.f12937i) {
                    rVar5.f12937i = false;
                    rVar4.f12937i = false;
                    rVar3.f12937i = true;
                    rVar2 = rVar3;
                } else {
                    if (rVar2 == rVar4.f) {
                        rVar = h(rVar, rVar4);
                        r rVar8 = rVar4.f12934e;
                        rVar3 = rVar8 == null ? null : rVar8.f12934e;
                        rVar4 = rVar8;
                        rVar2 = rVar4;
                    }
                    if (rVar4 != null) {
                        rVar4.f12937i = false;
                        if (rVar3 != null) {
                            rVar3.f12937i = true;
                            rVar = g(rVar, rVar3);
                        }
                    }
                }
            }
        }
        return rVar;
    }

    static r b(r rVar, r rVar2) {
        while (rVar2 != null && rVar2 != rVar) {
            r rVar3 = rVar2.f12934e;
            if (rVar3 == null) {
                rVar2.f12937i = false;
                return rVar2;
            } else if (rVar2.f12937i) {
                rVar2.f12937i = false;
                return rVar;
            } else {
                r rVar4 = rVar3.f;
                if (rVar4 == rVar2) {
                    r rVar5 = rVar3.f12935g;
                    if (rVar5 != null && rVar5.f12937i) {
                        rVar5.f12937i = false;
                        rVar3.f12937i = true;
                        rVar = g(rVar, rVar3);
                        rVar3 = rVar2.f12934e;
                        rVar5 = rVar3 == null ? null : rVar3.f12935g;
                    }
                    if (rVar5 != null) {
                        r rVar6 = rVar5.f;
                        r rVar7 = rVar5.f12935g;
                        if ((rVar7 == null || !rVar7.f12937i) && (rVar6 == null || !rVar6.f12937i)) {
                            rVar5.f12937i = true;
                        } else {
                            if (rVar7 == null || !rVar7.f12937i) {
                                if (rVar6 != null) {
                                    rVar6.f12937i = false;
                                }
                                rVar5.f12937i = true;
                                rVar = h(rVar, rVar5);
                                rVar3 = rVar2.f12934e;
                                rVar5 = rVar3 != null ? rVar3.f12935g : null;
                            }
                            if (rVar5 != null) {
                                rVar5.f12937i = rVar3 == null ? false : rVar3.f12937i;
                                r rVar8 = rVar5.f12935g;
                                if (rVar8 != null) {
                                    rVar8.f12937i = false;
                                }
                            }
                            if (rVar3 != null) {
                                rVar3.f12937i = false;
                                rVar = g(rVar, rVar3);
                            }
                            rVar2 = rVar;
                        }
                    }
                    rVar2 = rVar3;
                } else {
                    if (rVar4 != null && rVar4.f12937i) {
                        rVar4.f12937i = false;
                        rVar3.f12937i = true;
                        rVar = h(rVar, rVar3);
                        rVar3 = rVar2.f12934e;
                        rVar4 = rVar3 == null ? null : rVar3.f;
                    }
                    if (rVar4 != null) {
                        r rVar9 = rVar4.f;
                        r rVar10 = rVar4.f12935g;
                        if ((rVar9 == null || !rVar9.f12937i) && (rVar10 == null || !rVar10.f12937i)) {
                            rVar4.f12937i = true;
                        } else {
                            if (rVar9 == null || !rVar9.f12937i) {
                                if (rVar10 != null) {
                                    rVar10.f12937i = false;
                                }
                                rVar4.f12937i = true;
                                rVar = g(rVar, rVar4);
                                rVar3 = rVar2.f12934e;
                                rVar4 = rVar3 != null ? rVar3.f : null;
                            }
                            if (rVar4 != null) {
                                rVar4.f12937i = rVar3 == null ? false : rVar3.f12937i;
                                r rVar11 = rVar4.f;
                                if (rVar11 != null) {
                                    rVar11.f12937i = false;
                                }
                            }
                            if (rVar3 != null) {
                                rVar3.f12937i = false;
                                rVar = h(rVar, rVar3);
                            }
                            rVar2 = rVar;
                        }
                    }
                    rVar2 = rVar3;
                }
            }
        }
        return rVar;
    }

    static {
        j$.sun.misc.a h8 = j$.sun.misc.a.h();
        f12930h = h8;
        f12931i = h8.j(q.class, "lockState");
    }
}
