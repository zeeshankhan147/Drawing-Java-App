package com.tomer.draw.gallery

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.mikepenz.fastadapter.items.AbstractItem
import com.tomer.draw.R
import kotlinx.android.synthetic.main.gallery_item.view.*
import java.io.File


/**
 * DrawEverywhere
 * Created by Tomer Rosenfeld on 7/29/17.
 */
class Item : AbstractItem<Item, Item.ViewHolder>() {
	override fun getType(): Int = 12
	
	override fun getLayoutRes(): Int = R.layout.gallery_item
	
	var bitmapImage: Bitmap? = null
	var file: File? = null
	
	internal fun withBitmap(bitmap: Bitmap): Item {
		this.bitmapImage = bitmap
		return this
	}
	
	internal fun withFile(file: File?): Item {
		this.file = file
		return this
	}

	override fun bindView(viewHolder: ViewHolder, payloads: List<Any>) {
		super.bindView(viewHolder, payloads)
		viewHolder.image.setImageBitmap(bitmapImage)
	}
	
	override fun unbindView(holder: ViewHolder) {
		super.unbindView(holder)
		
	}
	
	override fun getViewHolder(v: View): ViewHolder {
		return ViewHolder(v)
	}
	
	class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
		var image: ImageView = view.image
	}
}
