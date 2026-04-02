package e5;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
/* renamed from: e5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965a {

    /* renamed from: a  reason: collision with root package name */
    public final ReferenceQueue f10887a = new ReferenceQueue();

    /* renamed from: b  reason: collision with root package name */
    public final Set f10888b = DesugarCollections.synchronizedSet(new HashSet());
}
