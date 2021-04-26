package com.ktyoung.chickenstock.databinding;
import com.ktyoung.chickenstock.R;
import com.ktyoung.chickenstock.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNewsPreviewBindingImpl extends ItemNewsPreviewBinding implements com.ktyoung.chickenstock.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNewsPreviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemNewsPreviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.description.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pubDate.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.ktyoung.chickenstock.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.newsItem == variableId) {
            setNewsItem((com.ktyoung.chickenstock.api.model.NewsModel) variable);
        }
        else if (BR.itemClick == variableId) {
            setItemClick((com.ktyoung.chickenstock.view.adapter.NewsAdapter.ItemClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNewsItem(@Nullable com.ktyoung.chickenstock.api.model.NewsModel NewsItem) {
        this.mNewsItem = NewsItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.newsItem);
        super.requestRebind();
    }
    public void setItemClick(@Nullable com.ktyoung.chickenstock.view.adapter.NewsAdapter.ItemClickListener ItemClick) {
        this.mItemClick = ItemClick;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.itemClick);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.text.Spanned androidTextHtmlFromHtmlNewsItemTitle = null;
        java.lang.String newsItemDescription = null;
        com.ktyoung.chickenstock.api.model.NewsModel newsItem = mNewsItem;
        java.lang.String newsItemPubDate = null;
        android.text.Spanned androidTextHtmlFromHtmlNewsItemDescription = null;
        com.ktyoung.chickenstock.view.adapter.NewsAdapter.ItemClickListener itemClick = mItemClick;
        java.lang.String newsItemTitle = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (newsItem != null) {
                    // read newsItem.description
                    newsItemDescription = newsItem.getDescription();
                    // read newsItem.pubDate
                    newsItemPubDate = newsItem.getPubDate();
                    // read newsItem.title
                    newsItemTitle = newsItem.getTitle();
                }


                // read android.text.Html.fromHtml(newsItem.description)
                androidTextHtmlFromHtmlNewsItemDescription = android.text.Html.fromHtml(newsItemDescription);
                // read android.text.Html.fromHtml(newsItem.title)
                androidTextHtmlFromHtmlNewsItemTitle = android.text.Html.fromHtml(newsItemTitle);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, androidTextHtmlFromHtmlNewsItemDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pubDate, newsItemPubDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, androidTextHtmlFromHtmlNewsItemTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // newsItem
        com.ktyoung.chickenstock.api.model.NewsModel newsItem = mNewsItem;
        // itemClick != null
        boolean itemClickJavaLangObjectNull = false;
        // itemClick
        com.ktyoung.chickenstock.view.adapter.NewsAdapter.ItemClickListener itemClick = mItemClick;



        itemClickJavaLangObjectNull = (itemClick) != (null);
        if (itemClickJavaLangObjectNull) {



            itemClick.onClick(newsItem);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): newsItem
        flag 1 (0x2L): itemClick
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}