package com.ktyoung.chickenstock.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AddNewsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private AddNewsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private AddNewsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static AddNewsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    AddNewsFragmentArgs __result = new AddNewsFragmentArgs();
    bundle.setClassLoader(AddNewsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("id")) {
      int id;
      id = bundle.getInt("id");
      __result.arguments.put("id", id);
    } else {
      throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("title")) {
      String title;
      title = bundle.getString("title");
      __result.arguments.put("title", title);
    } else {
      throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("keyword1")) {
      String keyword1;
      keyword1 = bundle.getString("keyword1");
      __result.arguments.put("keyword1", keyword1);
    } else {
      throw new IllegalArgumentException("Required argument \"keyword1\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("keyword2")) {
      String keyword2;
      keyword2 = bundle.getString("keyword2");
      __result.arguments.put("keyword2", keyword2);
    } else {
      throw new IllegalArgumentException("Required argument \"keyword2\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("keyword3")) {
      String keyword3;
      keyword3 = bundle.getString("keyword3");
      __result.arguments.put("keyword3", keyword3);
    } else {
      throw new IllegalArgumentException("Required argument \"keyword3\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    AddNewsFragmentArgs that = (AddNewsFragmentArgs) object;
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
    return result;
  }

  @Override
  public String toString() {
    return "AddNewsFragmentArgs{"
        + "id=" + getId()
        + ", title=" + getTitle()
        + ", keyword1=" + getKeyword1()
        + ", keyword2=" + getKeyword2()
        + ", keyword3=" + getKeyword3()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(AddNewsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int id, @Nullable String title, @Nullable String keyword1,
        @Nullable String keyword2, @Nullable String keyword3) {
      this.arguments.put("id", id);
      this.arguments.put("title", title);
      this.arguments.put("keyword1", keyword1);
      this.arguments.put("keyword2", keyword2);
      this.arguments.put("keyword3", keyword3);
    }

    @NonNull
    public AddNewsFragmentArgs build() {
      AddNewsFragmentArgs result = new AddNewsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setTitle(@Nullable String title) {
      this.arguments.put("title", title);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setKeyword1(@Nullable String keyword1) {
      this.arguments.put("keyword1", keyword1);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setKeyword2(@Nullable String keyword2) {
      this.arguments.put("keyword2", keyword2);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setKeyword3(@Nullable String keyword3) {
      this.arguments.put("keyword3", keyword3);
      return this;
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
  }
}
