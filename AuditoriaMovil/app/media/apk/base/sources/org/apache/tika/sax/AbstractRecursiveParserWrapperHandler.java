package org.apache.tika.sax;

import io.flutter.plugins.pathprovider.b;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public abstract class AbstractRecursiveParserWrapperHandler extends DefaultHandler implements Serializable {
    public static final Property EMBEDDED_RESOURCE_LIMIT_REACHED = Property.internalBoolean("X-TIKA:EXCEPTION:embedded_resource_limit_reached");
    private static final int MAX_DEPTH = 100;
    private final ContentHandlerFactory contentHandlerFactory;
    private int embeddedDepth;
    private int embeddedResources;
    private final int maxEmbeddedResources;

    public AbstractRecursiveParserWrapperHandler(ContentHandlerFactory contentHandlerFactory) {
        this(contentHandlerFactory, -1);
    }

    public void endDocument(ContentHandler contentHandler, Metadata metadata) {
        if (hasHitMaximumEmbeddedResources()) {
            metadata.set(EMBEDDED_RESOURCE_LIMIT_REACHED, "true");
        }
        metadata.set(TikaCoreProperties.EMBEDDED_DEPTH, 0);
    }

    public void endEmbeddedDocument(ContentHandler contentHandler, Metadata metadata) {
        this.embeddedDepth--;
    }

    public ContentHandlerFactory getContentHandlerFactory() {
        return this.contentHandlerFactory;
    }

    public ContentHandler getNewContentHandler() {
        return this.contentHandlerFactory.getNewContentHandler();
    }

    public boolean hasHitMaximumEmbeddedResources() {
        int i7 = this.maxEmbeddedResources;
        if (i7 > -1 && this.embeddedResources >= i7) {
            return true;
        }
        return false;
    }

    public void startEmbeddedDocument(ContentHandler contentHandler, Metadata metadata) {
        this.embeddedResources++;
        int i7 = this.embeddedDepth + 1;
        this.embeddedDepth = i7;
        if (i7 < MAX_DEPTH) {
            metadata.set(TikaCoreProperties.EMBEDDED_DEPTH, i7);
            return;
        }
        throw new SAXException(b.e(this.embeddedDepth, "Max embedded depth reached: "));
    }

    public AbstractRecursiveParserWrapperHandler(ContentHandlerFactory contentHandlerFactory, int i7) {
        this.embeddedResources = 0;
        this.embeddedDepth = 0;
        this.contentHandlerFactory = contentHandlerFactory;
        this.maxEmbeddedResources = i7;
    }

    public ContentHandler getNewContentHandler(OutputStream outputStream, Charset charset) {
        return this.contentHandlerFactory.getNewContentHandler(outputStream, charset);
    }
}
