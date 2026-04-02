package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.List;
import org.apache.tika.metadata.Metadata;
/* loaded from: classes.dex */
public class CompositeMetadataFilter extends MetadataFilter {
    private List<MetadataFilter> filters;

    public CompositeMetadataFilter() {
        this.filters = new ArrayList();
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        for (MetadataFilter metadataFilter : this.filters) {
            metadataFilter.filter(metadata);
        }
    }

    public List<MetadataFilter> getFilters() {
        return this.filters;
    }

    public void setFilters(List<MetadataFilter> list) {
        this.filters.clear();
        this.filters.addAll(list);
    }

    public String toString() {
        List<MetadataFilter> list = this.filters;
        return "CompositeMetadataFilter{filters=" + list + "}";
    }

    public CompositeMetadataFilter(List<MetadataFilter> list) {
        this.filters = list;
    }
}
