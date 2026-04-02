package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import z0.a;
/* loaded from: classes2.dex */
public final class TabLayoutMediator {
    private RecyclerView.g adapter;
    private boolean attached;
    private final boolean autoRefresh;
    private TabLayoutOnPageChangeCallback onPageChangeCallback;
    private TabLayout.OnTabSelectedListener onTabSelectedListener;
    private RecyclerView.i pagerAdapterObserver;
    private final TabConfigurationStrategy tabConfigurationStrategy;
    private final TabLayout tabLayout;
    private final a viewPager;

    /* loaded from: classes2.dex */
    public class PagerAdapterObserver extends RecyclerView.i {
        public PagerAdapterObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        public void onItemRangeChanged(int i10, int i11) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i10, int i11) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i10, int i11, int i12) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i10, int i11) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }
    }

    /* loaded from: classes2.dex */
    public interface TabConfigurationStrategy {
        void onConfigureTab(TabLayout.Tab tab, int i10);
    }

    /* loaded from: classes2.dex */
    public static class TabLayoutOnPageChangeCallback extends a.AbstractC0350a {
        private int previousScrollState;
        private int scrollState;
        private final WeakReference<TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
            reset();
        }

        public void onPageScrollStateChanged(int i10) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i10;
        }

        public void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i12 = this.scrollState;
                boolean z11 = false;
                if (i12 == 2 && this.previousScrollState != 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.setScrollPosition(i10, f10, z10, (i12 == 2 && this.previousScrollState == 0) ? true : true);
            }
        }

        public void onPageSelected(int i10) {
            boolean z10;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.scrollState;
                if (i11 != 0 && (i11 != 2 || this.previousScrollState != 0)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i10), z10);
            }
        }

        public void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    /* loaded from: classes2.dex */
    public static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
        private final a viewPager;

        public ViewPagerOnTabSelectedListener(a aVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getPosition();
            throw null;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public TabLayoutMediator(TabLayout tabLayout, a aVar, TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, aVar, true, tabConfigurationStrategy);
    }

    public void attach() {
        if (this.attached) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        throw null;
    }

    public void detach() {
        RecyclerView.g gVar;
        if (this.autoRefresh && (gVar = this.adapter) != null) {
            gVar.unregisterAdapterDataObserver(this.pagerAdapterObserver);
            this.pagerAdapterObserver = null;
        }
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        throw null;
    }

    public void populateTabsFromPagerAdapter() {
        this.tabLayout.removeAllTabs();
        RecyclerView.g gVar = this.adapter;
        if (gVar != null) {
            int itemCount = gVar.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.Tab newTab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(newTab, i10);
                this.tabLayout.addTab(newTab, false);
            }
            if (itemCount > 0) {
                this.tabLayout.getTabCount();
                throw null;
            }
        }
    }

    public TabLayoutMediator(TabLayout tabLayout, a aVar, boolean z10, TabConfigurationStrategy tabConfigurationStrategy) {
        this.tabLayout = tabLayout;
        this.autoRefresh = z10;
        this.tabConfigurationStrategy = tabConfigurationStrategy;
    }
}
