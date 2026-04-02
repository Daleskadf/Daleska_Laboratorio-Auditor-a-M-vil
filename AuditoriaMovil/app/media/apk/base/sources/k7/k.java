package k7;

import F6.D;
import F6.H;
import F6.P;
import H4.W;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import o6.EnumC1565a;
import org.apache.tika.utils.StringUtils;
import w6.p;
/* loaded from: classes.dex */
public final class k extends p6.i implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l7.d f13753a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f13754b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f13755c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f13756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l7.d dVar, l lVar, l lVar2, long j, n6.d dVar2) {
        super(2, dVar2);
        this.f13753a = dVar;
        this.f13754b = lVar;
        this.f13755c = lVar2;
        this.f13756d = j;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new k(this.f13753a, this.f13754b, this.f13755c, this.f13756d, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        l6.j jVar = l6.j.f13876a;
        ((k) create((D) obj, (n6.d) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        l7.d dVar = this.f13753a;
        boolean z7 = dVar.f13880b;
        String str = dVar.f13879a;
        if (z7) {
            if (E6.m.e0(str, "file://")) {
                str = str.substring(7);
                kotlin.jvm.internal.j.d(str, "substring(...)");
            }
        } else {
            URL url = URI.create(str).toURL();
            kotlin.jvm.internal.j.d(url, "create(url).toURL()");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream openStream = url.openStream();
            try {
                byte[] bArr = new byte[RecognitionOptions.AZTEC];
                while (true) {
                    int read = openStream.read(bArr);
                    Integer valueOf = Integer.valueOf(read);
                    if (read <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, valueOf.intValue());
                }
                W.g(openStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.j.d(byteArray, "outputStream.toByteArray()");
                File createTempFile = File.createTempFile("sound", StringUtils.EMPTY);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.write(byteArray);
                    createTempFile.deleteOnExit();
                    W.g(fileOutputStream, null);
                    str = createTempFile.getAbsolutePath();
                    kotlin.jvm.internal.j.d(str, "loadTempFileFromNetwork().absolutePath");
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    W.g(openStream, th);
                    throw th2;
                }
            }
        }
        String str2 = str;
        l lVar = this.f13754b;
        K6.e eVar = lVar.f13761c;
        M6.f fVar = P.f1237a;
        H.q(eVar, K6.o.f2797a, new j(lVar, str2, this.f13755c, this.f13753a, this.f13756d, null), 2);
        return l6.j.f13876a;
    }
}
