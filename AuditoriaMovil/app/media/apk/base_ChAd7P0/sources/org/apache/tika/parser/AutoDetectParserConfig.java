package org.apache.tika.parser;

import java.io.Serializable;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.extractor.EmbeddedDocumentExtractorFactory;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.writefilter.MetadataWriteFilterFactory;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.sax.ContentHandlerDecoratorFactory;
import org.w3c.dom.Element;
import org.xml.sax.ContentHandler;
/* loaded from: classes.dex */
public class AutoDetectParserConfig extends ConfigBase implements Serializable {
    private ContentHandlerDecoratorFactory contentHandlerDecoratorFactory;
    private DigestingParser.DigesterFactory digesterFactory;
    private EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory;
    private Long maximumCompressionRatio;
    private Integer maximumDepth;
    private Integer maximumPackageEntryDepth;
    private MetadataWriteFilterFactory metadataWriteFilterFactory;
    private Long outputThreshold;
    private Long spoolToDisk;
    private boolean throwOnZeroBytes;
    private static ContentHandlerDecoratorFactory NOOP_CONTENT_HANDLER_DECORATOR_FACTORY = new ContentHandlerDecoratorFactory() { // from class: org.apache.tika.parser.AutoDetectParserConfig.1
        @Override // org.apache.tika.sax.ContentHandlerDecoratorFactory
        public ContentHandler decorate(ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
            return contentHandler;
        }
    };
    public static AutoDetectParserConfig DEFAULT = new AutoDetectParserConfig();

    public AutoDetectParserConfig(Long l8, Long l9, Long l10, Integer num, Integer num2) {
        this.metadataWriteFilterFactory = null;
        this.embeddedDocumentExtractorFactory = null;
        this.contentHandlerDecoratorFactory = NOOP_CONTENT_HANDLER_DECORATOR_FACTORY;
        this.digesterFactory = null;
        this.throwOnZeroBytes = true;
        this.spoolToDisk = l8;
        this.outputThreshold = l9;
        this.maximumCompressionRatio = l10;
        this.maximumDepth = num;
        this.maximumPackageEntryDepth = num2;
    }

    public static AutoDetectParserConfig load(Element element) {
        return (AutoDetectParserConfig) ConfigBase.buildSingle("autoDetectParserConfig", AutoDetectParserConfig.class, element, DEFAULT);
    }

    public ContentHandlerDecoratorFactory getContentHandlerDecoratorFactory() {
        return this.contentHandlerDecoratorFactory;
    }

    public DigestingParser.DigesterFactory getDigesterFactory() {
        return this.digesterFactory;
    }

    public EmbeddedDocumentExtractorFactory getEmbeddedDocumentExtractorFactory() {
        return this.embeddedDocumentExtractorFactory;
    }

    public Long getMaximumCompressionRatio() {
        return this.maximumCompressionRatio;
    }

    public Integer getMaximumDepth() {
        return this.maximumDepth;
    }

    public Integer getMaximumPackageEntryDepth() {
        return this.maximumPackageEntryDepth;
    }

    public MetadataWriteFilterFactory getMetadataWriteFilterFactory() {
        return this.metadataWriteFilterFactory;
    }

    public Long getOutputThreshold() {
        return this.outputThreshold;
    }

    public Long getSpoolToDisk() {
        return this.spoolToDisk;
    }

    public boolean getThrowOnZeroBytes() {
        return this.throwOnZeroBytes;
    }

    public void setContentHandlerDecoratorFactory(ContentHandlerDecoratorFactory contentHandlerDecoratorFactory) {
        this.contentHandlerDecoratorFactory = contentHandlerDecoratorFactory;
    }

    public void setDigesterFactory(DigestingParser.DigesterFactory digesterFactory) {
        this.digesterFactory = digesterFactory;
    }

    public void setEmbeddedDocumentExtractorFactory(EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory) {
        this.embeddedDocumentExtractorFactory = embeddedDocumentExtractorFactory;
    }

    public void setMaximumCompressionRatio(long j) {
        this.maximumCompressionRatio = Long.valueOf(j);
    }

    public void setMaximumDepth(int i7) {
        this.maximumDepth = Integer.valueOf(i7);
    }

    public void setMaximumPackageEntryDepth(int i7) {
        this.maximumPackageEntryDepth = Integer.valueOf(i7);
    }

    public void setMetadataWriteFilterFactory(MetadataWriteFilterFactory metadataWriteFilterFactory) {
        this.metadataWriteFilterFactory = metadataWriteFilterFactory;
    }

    public void setOutputThreshold(long j) {
        this.outputThreshold = Long.valueOf(j);
    }

    public void setSpoolToDisk(long j) {
        this.spoolToDisk = Long.valueOf(j);
    }

    public void setThrowOnZeroBytes(boolean z7) {
        this.throwOnZeroBytes = z7;
    }

    public String toString() {
        Long l8 = this.spoolToDisk;
        Long l9 = this.outputThreshold;
        Long l10 = this.maximumCompressionRatio;
        Integer num = this.maximumDepth;
        Integer num2 = this.maximumPackageEntryDepth;
        MetadataWriteFilterFactory metadataWriteFilterFactory = this.metadataWriteFilterFactory;
        EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory = this.embeddedDocumentExtractorFactory;
        ContentHandlerDecoratorFactory contentHandlerDecoratorFactory = this.contentHandlerDecoratorFactory;
        DigestingParser.DigesterFactory digesterFactory = this.digesterFactory;
        boolean z7 = this.throwOnZeroBytes;
        return "AutoDetectParserConfig{spoolToDisk=" + l8 + ", outputThreshold=" + l9 + ", maximumCompressionRatio=" + l10 + ", maximumDepth=" + num + ", maximumPackageEntryDepth=" + num2 + ", metadataWriteFilterFactory=" + metadataWriteFilterFactory + ", embeddedDocumentExtractorFactory=" + embeddedDocumentExtractorFactory + ", contentHandlerDecoratorFactory=" + contentHandlerDecoratorFactory + ", digesterFactory=" + digesterFactory + ", throwOnZeroBytes=" + z7 + "}";
    }

    public AutoDetectParserConfig() {
        this.spoolToDisk = null;
        this.outputThreshold = null;
        this.maximumCompressionRatio = null;
        this.maximumDepth = null;
        this.maximumPackageEntryDepth = null;
        this.metadataWriteFilterFactory = null;
        this.embeddedDocumentExtractorFactory = null;
        this.contentHandlerDecoratorFactory = NOOP_CONTENT_HANDLER_DECORATOR_FACTORY;
        this.digesterFactory = null;
        this.throwOnZeroBytes = true;
    }
}
