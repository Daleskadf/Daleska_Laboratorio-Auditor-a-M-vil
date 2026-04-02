package x5;

import B5.AbstractActivityC0032e;
/* renamed from: x5.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2016r implements H5.b, I5.a {

    /* renamed from: a  reason: collision with root package name */
    public I5.b f16568a;

    /* renamed from: b  reason: collision with root package name */
    public H5.a f16569b;

    /* renamed from: c  reason: collision with root package name */
    public C2014p f16570c;

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, A.l] */
    @Override // I5.a
    public final void onAttachedToActivity(I5.b activityPluginBinding) {
        kotlin.jvm.internal.j.e(activityPluginBinding, "activityPluginBinding");
        H5.a aVar = this.f16569b;
        kotlin.jvm.internal.j.b(aVar);
        L5.f fVar = aVar.f2030b;
        kotlin.jvm.internal.j.d(fVar, "this.flutterPluginBinding!!.binaryMessenger");
        AbstractActivityC0032e abstractActivityC0032e = ((C5.d) activityPluginBinding).f571a;
        kotlin.jvm.internal.j.d(abstractActivityC0032e, "activityPluginBinding.activity");
        j7.e eVar = new j7.e(fVar);
        ?? obj = new Object();
        C2005g c2005g = new C2005g(1, activityPluginBinding, I5.b.class, "addRequestPermissionsResultListener", "addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V", 0, 1);
        H5.a aVar2 = this.f16569b;
        kotlin.jvm.internal.j.b(aVar2);
        io.flutter.embedding.engine.renderer.m mVar = aVar2.f2031c;
        kotlin.jvm.internal.j.d(mVar, "this.flutterPluginBinding!!.textureRegistry");
        this.f16570c = new C2014p(abstractActivityC0032e, eVar, fVar, obj, c2005g, mVar);
        this.f16568a = activityPluginBinding;
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a binding) {
        kotlin.jvm.internal.j.e(binding, "binding");
        this.f16569b = binding;
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        C2014p c2014p = this.f16570c;
        if (c2014p != null) {
            I5.b bVar = this.f16568a;
            kotlin.jvm.internal.j.b(bVar);
            L5.r rVar = c2014p.f16556Y;
            if (rVar != null) {
                rVar.b(null);
            }
            c2014p.f16556Y = null;
            L5.j jVar = c2014p.f16557Z;
            if (jVar != null) {
                jVar.a(null);
            }
            c2014p.f16557Z = null;
            c2014p.f16559b.f13476c.a(null);
            C2010l c2010l = c2014p.f16563e0;
            if (c2010l != null && (c2010l.f16537h != null || c2010l.f16538i != null)) {
                c2010l.c(false);
            }
            c2014p.f16563e0 = null;
            C2015q c2015q = (C2015q) c2014p.f16560c.f26b;
            if (c2015q != null) {
                ((C5.d) bVar).f573c.remove(c2015q);
            }
        }
        this.f16570c = null;
        this.f16568a = null;
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a binding) {
        kotlin.jvm.internal.j.e(binding, "binding");
        this.f16569b = null;
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b binding) {
        kotlin.jvm.internal.j.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
