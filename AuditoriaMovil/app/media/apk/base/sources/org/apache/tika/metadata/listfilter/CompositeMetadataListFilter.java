package org.apache.tika.metadata.listfilter;

import java.util.ArrayList;
import java.util.List;
import org.apache.tika.metadata.Metadata;
/* loaded from: classes.dex */
public class CompositeMetadataListFilter extends MetadataListFilter {
    private List<MetadataListFilter> filters;

    public CompositeMetadataListFilter() {
        this.filters = new ArrayList();
    }

    @Override // org.apache.tika.metadata.listfilter.MetadataListFilter
    public List<Metadata> filter(List<Metadata> list) {
        for (MetadataListFilter metadataListFilter : this.filters) {
            list = metadataListFilter.filter(list);
        }
        return list;
    }

    public List<MetadataListFilter> getFilters() {
        return this.filters;
    }

    public void setFilters(List<MetadataListFilter> list) {
        this.filters.clear();
        this.filters.addAll(list);
    }

    public String toString() {
        List<MetadataListFilter> list = this.filters;
        return "CompositeMetadataListFilter{filters=" + list + "}";
    }

    public CompositeMetadataListFilter(List<MetadataListFilter> list) {
        this.filters = list;
    }
}
