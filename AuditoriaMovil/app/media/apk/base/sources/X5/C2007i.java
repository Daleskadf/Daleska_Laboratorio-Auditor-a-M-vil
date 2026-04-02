package x5;

import D.o0;
import F6.D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import androidx.camera.core.impl.h0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import o6.EnumC1565a;
/* renamed from: x5.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2007i extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Image f16521a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2010l f16522b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f16523c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o0 f16524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2007i(Image image, C2010l c2010l, ArrayList arrayList, o0 o0Var, n6.d dVar) {
        super(2, dVar);
        this.f16521a = image;
        this.f16522b = c2010l;
        this.f16523c = arrayList;
        this.f16524d = o0Var;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new C2007i(this.f16521a, this.f16522b, this.f16523c, this.f16524d, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        l6.j jVar = l6.j.f13876a;
        ((C2007i) create((D) obj, (n6.d) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        float f;
        h0 h0Var;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        Image image = this.f16521a;
        Bitmap createBitmap = Bitmap.createBitmap(image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.j.d(createBitmap, "createBitmap(mediaImage.… Bitmap.Config.ARGB_8888)");
        C2010l c2010l = this.f16522b;
        Context applicationContext = c2010l.f16531a.getApplicationContext();
        kotlin.jvm.internal.j.d(applicationContext, "activity.applicationContext");
        M3.q qVar = new M3.q(applicationContext);
        qVar.A(image, createBitmap);
        R.b bVar = c2010l.f16537h;
        if (bVar != null && (h0Var = bVar.f4508c.f2104l0) != null) {
            f = h0Var.f7558a.a();
        } else {
            f = 90.0f;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
        kotlin.jvm.internal.j.d(createBitmap2, "createBitmap(bitmap, 0, …map.height, matrix, true)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        c2010l.f16533c.a(this.f16523c, byteArrayOutputStream.toByteArray(), new Integer(createBitmap2.getWidth()), new Integer(createBitmap2.getHeight()));
        createBitmap2.recycle();
        this.f16524d.close();
        Allocation allocation = (Allocation) qVar.f;
        if (allocation != null) {
            allocation.destroy();
        }
        Allocation allocation2 = (Allocation) qVar.f3253b;
        if (allocation2 != null) {
            allocation2.destroy();
        }
        ((ScriptIntrinsicYuvToRGB) qVar.f3254c).destroy();
        ((RenderScript) qVar.f3252a).destroy();
        return l6.j.f13876a;
    }
}
