package com.example.kit;

import android.view.View;

import com.example.kit.data.Item;
import com.example.kit.database.ItemViewHolder;


/** SelectListener is an interface that is used to implement UI interactions
 * for views that are not visible to the current class. The listener must be
 * passed as an argument into the class where the view is available.
 *
 * @Author Hunter Pullishy
 * @Version "%I%, %G%"
 */
public interface SelectListener {
    void onItemClick(Item item);
    void onItemLongClick();
    void onAddTagClick(Item item);
}
