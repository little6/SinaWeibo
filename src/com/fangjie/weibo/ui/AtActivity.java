package com.fangjie.weibo.ui;
import com.fangjie.weibo.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
/**
 * <a href="http://fangjie.sinaapp.com">http://fangjie.sinaapp.com</a>
 * @author Jay
 * @version 1.0
 * @describe 微博主界面中的At Tab(尚未开发完成)
 */
public class AtActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.at);
		Toast.makeText(AtActivity.this, "对不起，还没开发好！敬请期待！-by @方杰_Jay", Toast.LENGTH_LONG).show();
	}
}
