package org.apache.tika.mime;

import D.AbstractC0059i;
import g7.b;
import g7.d;
import j$.util.Collection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import org.w3c.dom.Document;
/* loaded from: classes.dex */
public class MimeTypesFactory {
    public static final String CUSTOM_MIMES_SYS_PROP = "tika.custom-mimetypes";
    private static final b LOG = d.b(MimeTypesFactory.class);

    public static MimeTypes create() {
        return new MimeTypes();
    }

    public static /* synthetic */ void lambda$create$0(URL url) {
        LOG.q(url, "Loaded custom mimes file: {}");
    }

    public static MimeTypes create(Document document) {
        MimeTypes mimeTypes = new MimeTypes();
        new MimeTypesReader(mimeTypes).read(document);
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream... inputStreamArr) {
        MimeTypes mimeTypes = new MimeTypes();
        MimeTypesReader mimeTypesReader = new MimeTypesReader(mimeTypes);
        for (InputStream inputStream : inputStreamArr) {
            mimeTypesReader.read(inputStream);
        }
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream inputStream) {
        return create(inputStream);
    }

    public static MimeTypes create(URL... urlArr) {
        int length = urlArr.length;
        InputStream[] inputStreamArr = new InputStream[length];
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            inputStreamArr[i8] = urlArr[i8].openStream();
        }
        try {
            return create(inputStreamArr);
        } finally {
            while (i7 < length) {
                inputStreamArr[i7].close();
                i7++;
            }
        }
    }

    public static MimeTypes create(URL url) {
        return create(url);
    }

    public static MimeTypes create(String str) {
        return create(MimeTypesReader.class.getResource(str));
    }

    public static MimeTypes create(String str, String str2) {
        return create(str, str2, null);
    }

    public static MimeTypes create(String str, String str2, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = MimeTypesReader.class.getClassLoader();
        }
        String z7 = AbstractC0059i.z(MimeTypesReader.class.getPackage().getName().replace('.', '/'), "/");
        URL resource = classLoader.getResource(z7 + str);
        ArrayList list = Collections.list(classLoader.getResources(str2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(resource);
        arrayList.addAll(list);
        b bVar = LOG;
        if (bVar.d()) {
            Collection.EL.stream(arrayList).forEach(new a(0));
        }
        String property = System.getProperty(CUSTOM_MIMES_SYS_PROP);
        if (property != null) {
            File file = new File(property);
            if (file.exists()) {
                arrayList.add(file.toURI().toURL());
                if (bVar.d()) {
                    bVar.q(file.getAbsolutePath(), "Loaded external custom mimetypes file: {}");
                }
            } else {
                throw new IOException("Specified custom mimetypes file not found: ".concat(property));
            }
        }
        return create((URL[]) arrayList.toArray(new URL[0]));
    }
}
