package p0;

import java.io.Serializable;
import java.util.Iterator;
import p6.AbstractC1700c;
/* renamed from: p0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1637e extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public Serializable f15002a;

    /* renamed from: b  reason: collision with root package name */
    public Iterator f15003b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f15004c;

    /* renamed from: d  reason: collision with root package name */
    public int f15005d;

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15004c = obj;
        this.f15005d |= Integer.MIN_VALUE;
        return F.f.c(null, null, this);
    }
}
