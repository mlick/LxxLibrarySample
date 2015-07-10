/**
 * 
 */
package com.lxx.testdemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

/**
 * @author lixx
 * 
 */
public class ThreeCircleColor extends Activity {
	Bitmap tempBmp = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
	Canvas c = new Canvas();
	Paint paint = new Paint();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		class VennView extends View {
			public VennView(Context context) {
				super(context);

			}

			protected void onDraw(Canvas canvas) {
				super.onDraw(canvas);
				if (tempBmp.isRecycled()
						|| tempBmp.getWidth() != canvas.getWidth()
						|| tempBmp.getHeight() != canvas.getHeight()) {
					tempBmp.recycle();
					tempBmp = Bitmap.createBitmap(canvas.getWidth(),
							canvas.getHeight(), Config.ARGB_8888);
					c.setBitmap(tempBmp);
				}

				// clear previous drawings
				c.drawColor(Color.TRANSPARENT, Mode.CLEAR);

				int alpha = 255, val = 255;
				int ar = Color.argb(alpha, val, 0, 0);
				int ag = Color.argb(alpha, 0, val, 0);
				int ab = Color.argb(alpha, 0, 0, val);
				float w = canvas.getWidth();
				float h = canvas.getHeight();
				float cx = w / 2f;
				float cy = h / 2;
				float r = w / 5;
				float tx = (float) (r * Math.cos(30 * Math.PI / 180));
				float ty = (float) (r * Math.sin(30 * Math.PI / 180));
				float expand = 1.5f;
				paint.setAntiAlias(true);
				paint.setXfermode(new PorterDuffXfermode(Mode.ADD));
				paint.setColor(ar);
				c.drawCircle(cx, cy - r, expand * r, paint);
				paint.setColor(ag);
				c.drawCircle(cx - tx, cy + ty, expand * r, paint);
				paint.setColor(ab);
				c.drawCircle(cx + tx, cy + ty, expand * r, paint);
				canvas.drawBitmap(tempBmp, 0, 0, null);
			}
		}
		this.setContentView(new VennView(this));
	}

}
