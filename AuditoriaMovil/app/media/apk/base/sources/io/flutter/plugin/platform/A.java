package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;
/* loaded from: classes.dex */
public final class A {

    /* renamed from: i  reason: collision with root package name */
    public static final w f11675i = new VirtualDisplay.Callback();

    /* renamed from: a  reason: collision with root package name */
    public SingleViewPresentation f11676a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f11677b;

    /* renamed from: c  reason: collision with root package name */
    public final C1136a f11678c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11679d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11680e;
    public final i f;

    /* renamed from: g  reason: collision with root package name */
    public final l f11681g;

    /* renamed from: h  reason: collision with root package name */
    public VirtualDisplay f11682h;

    public A(Activity activity, C1136a c1136a, VirtualDisplay virtualDisplay, g gVar, i iVar, l lVar, int i7) {
        this.f11677b = activity;
        this.f11678c = c1136a;
        this.f = iVar;
        this.f11681g = lVar;
        this.f11680e = i7;
        this.f11682h = virtualDisplay;
        this.f11679d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f11682h.getDisplay(), gVar, c1136a, i7, lVar);
        this.f11676a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f11676a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
