package br.com.globalcode.android;

import br.com.globalcode.android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clearEditTextValues();
        
    }

	private void clearEditTextValues() {
		
		final EditText eT1 = (EditText)this.findViewById(R.id.eTName);
        final EditText eT2 = (EditText)this.findViewById(R.id.eTPass);
        
        Button bClear = (Button)this.findViewById(R.id.button2);
        
        bClear.setOnClickListener(new Button.OnClickListener() {
			
			public void onClick(View v) {
		        eT1.setText("");
		        eT2.setText("");    
		        eT1.requestFocus();
			}
		});
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
