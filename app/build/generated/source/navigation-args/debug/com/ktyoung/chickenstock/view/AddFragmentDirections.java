package com.ktyoung.chickenstock.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.ktyoung.chickenstock.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AddFragmentDirections {
  private AddFragmentDirections() {
  }

  @NonNull
  public static ActionAddFragmentToAddNewsFragment actionAddFragmentToAddNewsFragment(int id,
      @Nullable String title, @Nullable String keyword1, @Nullable String keyword2,
      @Nullable String keyword3) {
    return new ActionAddFragmentToAddNewsFragment(id, title, keyword1, keyword2, keyword3);
  }

  public static class ActionAddFragmentToAddNewsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionAddFragmentToAddNewsFragment(int id, @Nullable String title,
        @Nullable String keyword1, @Nullable String keyword2, @Nullable String keyword3) {
      this.arguments.put("id", id);
      this.arguments.put("title", title);
      this.arguments.put("keyword1", keyword1);
      this.arguments.put("keyword2", keyword2);
      this.arguments.put("keyword3", keyword3);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionAddFragmentToAddNewsFragment setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionAddFragmentToAddNewsFragment setTitle(@Nullable String title) {
      this.arguments.put("title", title);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionAddFragmentToAddNewsFragment setKeyword1(@Nullable String keyword1) {
      this.arguments.put("keyword1", keyword1);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionAddFragmentToAddNewsFragment setKeyword2(@Nullable String keyword2) {
      this.arguments.put("keyword2", keyword2);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionAddFragmentToAddNewsFragment setKeyword3(@Nullable String keyword3) {
      this.arguments.put("keyword3", keyword3);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("id")) {
        int id = (int) arguments.get("id");
        __result.putInt("id", id);
      }
      if (arguments.containsKey("title")) {
        String title = (String) arguments.get("title");
        __result.putString("title", title);
      }
      if (arguments.containsKey("keyword1")) {
        String keyword1 = (String) arguments.get("keyword1");
        __result.putString("keyword1", keyword1);
      }
      if (arguments.containsKey("keyword2")) {
        String keyword2 = (String) arguments.get("keyword2");
        __result.putString("keyword2", keyword2);
      }
      if (arguments.containsKey("keyword3")) {
        String keyword3 = (String) arguments.get("keyword3");
        __result.putString("keyword3", keyword3);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_addFragment_to_addNewsFragment;
    }

    @SuppressWarnings("unchecked")
    public int getId() {
      return (int) arguments.get("id");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getTitle() {
      return (String) arguments.get("title");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getKeyword1() {
      return (String) arguments.get("keyword1");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getKeyword2() {
      return (String) arguments.get("keyword2");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getKeyword3() {
      return (String) arguments.get("keyword3");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionAddFragmentToAddNewsFragment that = (ActionAddFragmentToAddNewsFragment) object;
      if (arguments.containsKey("id") != that.arguments.containsKey("id")) {
        return false;
      }
      if (getId() != that.getId()) {
        return false;
      }
      if (arguments.containsKey("title") != that.arguments.containsKey("title")) {
        return false;
      }
      if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) {
        return false;
      }
      if (arguments.containsKey("keyword1") != that.arguments.containsKey("keyword1")) {
        return false;
      }
      if (getKeyword1() != null ? !getKeyword1().equals(that.getKeyword1()) : that.getKeyword1() != null) {
        return false;
      }
      if (arguments.containsKey("keyword2") != that.arguments.containsKey("keyword2")) {
        return false;
      }
      if (getKeyword2() != null ? !getKeyword2().equals(that.getKeyword2()) : that.getKeyword2() != null) {
        return false;
      }
      if (arguments.containsKey("keyword3") != that.arguments.containsKey("keyword3")) {
        return false;
      }
      if (getKeyword3() != null ? !getKeyword3().equals(that.getKeyword3()) : that.getKeyword3() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getId();
      result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
      result = 31 * result + (getKeyword1() != null ? getKeyword1().hashCode() : 0);
      result = 31 * result + (getKeyword2() != null ? getKeyword2().hashCode() : 0);
      result = 31 * result + (getKeyword3() != null ? getKeyword3().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionAddFragmentToAddNewsFragment(actionId=" + getActionId() + "){"
          + "id=" + getId()
          + ", title=" + getTitle()
          + ", keyword1=" + getKeyword1()
          + ", keyword2=" + getKeyword2()
          + ", keyword3=" + getKeyword3()
          + "}";
    }
  }
}
