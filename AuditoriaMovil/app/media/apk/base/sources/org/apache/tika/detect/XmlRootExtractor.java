package org.apache.tika.detect;

import W6.c;
import W6.h;
import java.io.CharConversionException;
import java.io.InputStream;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.utils.XMLReaderUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public class XmlRootExtractor {
    private static final ParseContext EMPTY_CONTEXT = new ParseContext();

    /* loaded from: classes.dex */
    public static class ExtractorHandler extends DefaultHandler {
        private QName rootElement;

        public /* synthetic */ ExtractorHandler(int i7) {
            this();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            this.rootElement = new QName(str, str2);
            throw new SAXException("Aborting: root element received");
        }

        private ExtractorHandler() {
            this.rootElement = null;
        }
    }

    /* loaded from: classes.dex */
    public static class MalformedCharException extends RuntimeException {
        public MalformedCharException(Exception exc) {
            super(exc);
        }
    }

    public QName extractRootElement(byte[] bArr) {
        while (true) {
            try {
                return extractRootElement(new h(bArr), true);
            } catch (MalformedCharException unused) {
                int length = bArr.length / 2;
                if (length % 2 == 1) {
                    length--;
                }
                if (length <= 0) {
                    return null;
                }
                bArr = Arrays.copyOf(bArr, length);
            }
        }
    }

    public QName extractRootElement(InputStream inputStream) {
        return extractRootElement(inputStream, false);
    }

    private QName extractRootElement(InputStream inputStream, boolean z7) {
        ExtractorHandler extractorHandler = new ExtractorHandler(0);
        try {
            XMLReaderUtils.parseSAX(new c(inputStream), extractorHandler, EMPTY_CONTEXT);
        } catch (SecurityException e7) {
            throw e7;
        } catch (Exception e8) {
            if (z7 && ((e8 instanceof CharConversionException) || (e8.getCause() instanceof CharConversionException))) {
                throw new MalformedCharException(e8);
            }
        }
        return extractorHandler.rootElement;
    }
}
