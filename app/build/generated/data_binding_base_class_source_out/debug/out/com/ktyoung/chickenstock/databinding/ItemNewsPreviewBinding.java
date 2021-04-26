// Generated by data binding compiler. Do not edit!
package com.ktyoung.chickenstock.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ktyoung.chickenstock.R;
import com.ktyoung.chickenstock.api.model.NewsModel;
import com.ktyoung.chickenstock.view.adapter.NewsAdapter;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemNewsPreviewBinding extends ViewDataBinding {
  @NonNull
  public final TextView description;

  @NonNull
  public final TextView pubDate;

  @NonNull
  public final TextView title;

  @Bindable
  protected NewsModel mNewsItem;

  @Bindable
  protected NewsAdapter.ItemClickListener mItemClick;

  protected ItemNewsPreviewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView description, TextView pubDate, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.description = description;
    this.pubDate = pubDate;
    this.title = title;
  }

  public abstract void setNewsItem(@Nullable NewsModel newsItem);

  @Nullable
  public NewsModel getNewsItem() {
    return mNewsItem;
  }

  public abstract void setItemClick(@Nullable NewsAdapter.ItemClickListener itemClick);

  @Nullable
  public NewsAdapter.ItemClickListener getItemClick() {
    return mItemClick;
  }

  @NonNull
  public static ItemNewsPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_news_preview, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemNewsPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemNewsPreviewBinding>inflateInternal(inflater, R.layout.item_news_preview, root, attachToRoot, component);
  }

  @NonNull
  public static ItemNewsPreviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_news_preview, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemNewsPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemNewsPreviewBinding>inflateInternal(inflater, R.layout.item_news_preview, null, false, component);
  }

  public static ItemNewsPreviewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemNewsPreviewBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemNewsPreviewBinding)bind(component, view, R.layout.item_news_preview);
  }
}
