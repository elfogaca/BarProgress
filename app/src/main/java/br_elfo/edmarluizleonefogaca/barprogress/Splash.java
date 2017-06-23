package br_elfo.edmarluizleonefogaca.barprogress;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
//import br.elfogaca.mediaplayer2.R;

/**
 * Created by filip on 2/24/2015.
 */
public class Splash extends Activity {
	
	//private Button btStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashh);

        final ImageView iv = (ImageView) findViewById(R.id.imageView);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.fade_out);

        iv.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.startAnimation(an2);
                finish();
                Intent i = new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        
        //btStart = (Button) findViewById(R.id.btStart);
       
        
        //final MediaPlayer player = MediaPlayer.create(this, R.raw.longlive);
        //MediaPlayer player = MediaPlayer.create(this, R.raw.longlive);
        
        //btStart.setOnClickListener(new View.OnClickListener() {
			
			//@Override
			//public void onClick(View v) {
				// TODO Auto-generated method stub
			    //player.start();
			//}
		//});
        
    }
}
