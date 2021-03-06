/*
 * Copyright 2017 Riyaz Ahamed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ahamed.multiviewadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ahamed.multiviewadapter.testconfig.DummyOne;
import com.ahamed.multiviewadapter.util.ItemDecorator;

public class DummyOneBinder extends ItemBinder<DummyOne, DummyOneBinder.ViewHolder> {

  public DummyOneBinder() {
  }

  public DummyOneBinder(ItemDecorator itemDecorator) {
    super(itemDecorator);
  }

  @Override public ViewHolder create(LayoutInflater inflater, ViewGroup parent) {
    return null;
  }

  @Override public void bind(ViewHolder holder, DummyOne item) {

  }

  @Override public boolean canBindData(Object item) {
    return item instanceof DummyOne;
  }

  static class ViewHolder extends BaseViewHolder<DummyOne> {

    public ViewHolder(View itemView) {
      super(itemView);
    }
  }
}
