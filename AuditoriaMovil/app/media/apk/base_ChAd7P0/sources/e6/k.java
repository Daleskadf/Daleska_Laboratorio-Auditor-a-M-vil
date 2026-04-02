package E6;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import w6.p;
/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.k implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1085a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1086b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, boolean z7, int i7) {
        super(2);
        this.f1085a = i7;
        this.f1087c = obj;
        this.f1086b = z7;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        l6.d dVar;
        Object obj4;
        switch (this.f1085a) {
            case 0:
                CharSequence $receiver = (CharSequence) obj;
                int intValue = ((Number) obj2).intValue();
                kotlin.jvm.internal.j.e($receiver, "$this$$receiver");
                int T7 = m.T($receiver, (char[]) this.f1087c, intValue, this.f1086b);
                if (T7 < 0) {
                    return null;
                }
                return new l6.d(Integer.valueOf(T7), 1);
            default:
                CharSequence $receiver2 = (CharSequence) obj;
                int intValue2 = ((Number) obj2).intValue();
                kotlin.jvm.internal.j.e($receiver2, "$this$$receiver");
                List list = (List) this.f1087c;
                boolean z7 = this.f1086b;
                if (!z7 && list.size() == 1) {
                    int size = list.size();
                    if (size != 0) {
                        if (size == 1) {
                            String str = (String) list.get(0);
                            int R7 = m.R(intValue2, 4, $receiver2, str, false);
                            if (R7 >= 0) {
                                dVar = new l6.d(Integer.valueOf(R7), str);
                            }
                            dVar = null;
                        } else {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                    } else {
                        throw new NoSuchElementException("List is empty.");
                    }
                } else {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    B6.d dVar2 = new B6.d(intValue2, $receiver2.length(), 1);
                    boolean z8 = $receiver2 instanceof String;
                    int i7 = dVar2.f403c;
                    int i8 = dVar2.f402b;
                    if (z8) {
                        if ((i7 > 0 && intValue2 <= i8) || (i7 < 0 && i8 <= intValue2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (m.X(0, intValue2, str2.length(), str2, (String) $receiver2, z7)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    dVar = new l6.d(Integer.valueOf(intValue2), str3);
                                } else if (intValue2 != i8) {
                                    intValue2 += i7;
                                }
                            }
                        }
                        dVar = null;
                    } else {
                        if ((i7 > 0 && intValue2 <= i8) || (i7 < 0 && i8 <= intValue2)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        if (m.Y(intValue2, str4.length(), $receiver2, str4, z7)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    dVar = new l6.d(Integer.valueOf(intValue2), str5);
                                } else if (intValue2 != i8) {
                                    intValue2 += i7;
                                }
                            }
                        }
                        dVar = null;
                    }
                }
                if (dVar == null) {
                    return null;
                }
                return new l6.d(dVar.f13865a, Integer.valueOf(((String) dVar.f13866b).length()));
        }
    }
}
