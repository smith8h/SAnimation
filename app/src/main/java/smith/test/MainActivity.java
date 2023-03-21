package smith.test;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import smith.lib.tools.animate.SAnimType;
import smith.lib.tools.animate.SAnimation;
import smith.test.databinding.ActivityMainBinding;
import com.itsaky.androidide.logsender.LogSender;

public class MainActivity extends AppCompatActivity {

	private ActivityMainBinding binding;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		LogSender.startLogging(this);
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        
        SAnimation.setClickAnimation(binding.tv, SAnimType.ALPHA);
    }
}
