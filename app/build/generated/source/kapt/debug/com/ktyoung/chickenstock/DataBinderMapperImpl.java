package com.ktyoung.chickenstock;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ktyoung.chickenstock.databinding.CustomToolbarBindingImpl;
import com.ktyoung.chickenstock.databinding.DialogSettingBindingImpl;
import com.ktyoung.chickenstock.databinding.FragmentAddBindingImpl;
import com.ktyoung.chickenstock.databinding.FragmentAddNewsBindingImpl;
import com.ktyoung.chickenstock.databinding.FragmentCompareBindingImpl;
import com.ktyoung.chickenstock.databinding.FragmentNewsBindingImpl;
import com.ktyoung.chickenstock.databinding.ItemAcntBindingImpl;
import com.ktyoung.chickenstock.databinding.ItemLoadingBindingImpl;
import com.ktyoung.chickenstock.databinding.ItemNewsPreviewBindingImpl;
import com.ktyoung.chickenstock.databinding.ItemNewsSettingBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CUSTOMTOOLBAR = 1;

  private static final int LAYOUT_DIALOGSETTING = 2;

  private static final int LAYOUT_FRAGMENTADD = 3;

  private static final int LAYOUT_FRAGMENTADDNEWS = 4;

  private static final int LAYOUT_FRAGMENTCOMPARE = 5;

  private static final int LAYOUT_FRAGMENTNEWS = 6;

  private static final int LAYOUT_ITEMACNT = 7;

  private static final int LAYOUT_ITEMLOADING = 8;

  private static final int LAYOUT_ITEMNEWSPREVIEW = 9;

  private static final int LAYOUT_ITEMNEWSSETTING = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ktyoung.chickenstock.R.layout.custom_toolbar, LAYOUT_CUSTOMTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ktyoung.chickenstock.R.layout.dialog_setting, LAYOUT_DIALOGSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ktyoung.chickenstock.R.layout.fragment_add, LAYOUT_FRAGMENTADD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ktyoung.chickenstock.R.layout.fragment_add_news, LAYOUT_FRAGMENTADDNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ktyoung.chickenstock.R.layout.fragment_compare, LAYOUT_FRAGMENTCOMPARE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ktyoung.chickenstock.R.layout.fragment_news, LAYOUT_FRAGMENTNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ktyoung.chickenstock.R.layout.item_acnt, LAYOUT_ITEMACNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ktyoung.chickenstock.R.layout.item_loading, LAYOUT_ITEMLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ktyoung.chickenstock.R.layout.item_news_preview, LAYOUT_ITEMNEWSPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ktyoung.chickenstock.R.layout.item_news_setting, LAYOUT_ITEMNEWSSETTING);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CUSTOMTOOLBAR: {
          if ("layout/custom_toolbar_0".equals(tag)) {
            return new CustomToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for custom_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGSETTING: {
          if ("layout/dialog_setting_0".equals(tag)) {
            return new DialogSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADD: {
          if ("layout/fragment_add_0".equals(tag)) {
            return new FragmentAddBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDNEWS: {
          if ("layout/fragment_add_news_0".equals(tag)) {
            return new FragmentAddNewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_news is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOMPARE: {
          if ("layout/fragment_compare_0".equals(tag)) {
            return new FragmentCompareBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_compare is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWS: {
          if ("layout/fragment_news_0".equals(tag)) {
            return new FragmentNewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_news is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMACNT: {
          if ("layout/item_acnt_0".equals(tag)) {
            return new ItemAcntBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_acnt is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLOADING: {
          if ("layout/item_loading_0".equals(tag)) {
            return new ItemLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNEWSPREVIEW: {
          if ("layout/item_news_preview_0".equals(tag)) {
            return new ItemNewsPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_news_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNEWSSETTING: {
          if ("layout/item_news_setting_0".equals(tag)) {
            return new ItemNewsSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_news_setting is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(15);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "itemClick");
      sKeys.put(2, "leftIcon");
      sKeys.put(3, "leftIconClick");
      sKeys.put(4, "leftIconTwo");
      sKeys.put(5, "leftIconTwoClick");
      sKeys.put(6, "multiAcntItem");
      sKeys.put(7, "newsItem");
      sKeys.put(8, "rightIcon");
      sKeys.put(9, "rightIconClick");
      sKeys.put(10, "rightTitle");
      sKeys.put(11, "rightTitleClick");
      sKeys.put(12, "subTitle");
      sKeys.put(13, "title");
      sKeys.put(14, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/custom_toolbar_0", com.ktyoung.chickenstock.R.layout.custom_toolbar);
      sKeys.put("layout/dialog_setting_0", com.ktyoung.chickenstock.R.layout.dialog_setting);
      sKeys.put("layout/fragment_add_0", com.ktyoung.chickenstock.R.layout.fragment_add);
      sKeys.put("layout/fragment_add_news_0", com.ktyoung.chickenstock.R.layout.fragment_add_news);
      sKeys.put("layout/fragment_compare_0", com.ktyoung.chickenstock.R.layout.fragment_compare);
      sKeys.put("layout/fragment_news_0", com.ktyoung.chickenstock.R.layout.fragment_news);
      sKeys.put("layout/item_acnt_0", com.ktyoung.chickenstock.R.layout.item_acnt);
      sKeys.put("layout/item_loading_0", com.ktyoung.chickenstock.R.layout.item_loading);
      sKeys.put("layout/item_news_preview_0", com.ktyoung.chickenstock.R.layout.item_news_preview);
      sKeys.put("layout/item_news_setting_0", com.ktyoung.chickenstock.R.layout.item_news_setting);
    }
  }
}
