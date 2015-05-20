package com.nuance.nmdp.sample;

import java.util.ArrayList;
import java.util.Arrays;

import com.nuance.nmdp.speechkit.Prompt;
import com.nuance.nmdp.speechkit.SpeechKit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainView extends Activity implements OnItemSelectedListener {
    
    private static SpeechKit _speechKit;
    String language = null;
    ArrayList<String> language_code;
    // Allow other activities to access the SpeechKit instance.
    static SpeechKit getSpeechKit()
    {
        return _speechKit;
    }

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // If this Activity is being recreated due to a config change (e.g. 
        // screen rotation), check for the saved SpeechKit instance.
        _speechKit = (SpeechKit)getLastNonConfigurationInstance();
        if (_speechKit == null)
        {
            _speechKit = SpeechKit.initialize(getApplication().getApplicationContext(), AppInfo.SpeechKitAppId, AppInfo.SpeechKitServer, AppInfo.SpeechKitPort, AppInfo.SpeechKitSsl, AppInfo.SpeechKitApplicationKey);
            _speechKit.connect();
            // TODO: Keep an eye out for audio prompts not working on the Droid 2 or other 2.2 devices.
            Prompt beep = _speechKit.defineAudioPrompt(R.raw.beep);
            _speechKit.setDefaultRecognizerPrompts(beep, Prompt.vibration(100), null, null);
        }
        
        final Button dictationButton = (Button)findViewById(R.id.btn_dictation);
        //final Button ttsButton = (Button)findViewById(R.id.btn_tts);

        //spiner
        Spinner spinner = (Spinner) findViewById(R.id.languages_spinner); 
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.languages_name_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(this);
		language_code = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.languages_code_array)));
        Button.OnClickListener l = new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (v == dictationButton)
                {
                    Intent intent = new Intent(v.getContext(), DictationView.class);
                    intent.putExtra("language", language);
                    MainView.this.startActivity(intent);
                }/* else if (v == ttsButton)
                {
                    Intent intent = new Intent(v.getContext(), TtsView.class);
                    MainView.this.startActivity(intent);
                }*/
            }
        };
        
        dictationButton.setOnClickListener(l);
        //ttsButton.setOnClickListener(l);
    }
    
    @Override
	public void onItemSelected(AdapterView<?> parent, View arg1, int pos,
			long arg3) {
		language = (String) language_code.get(pos);
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		language = "en_US";
	}
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (_speechKit != null)
        {
            _speechKit.release();
            _speechKit = null;
        }
    }
    
    @Override
    public Object onRetainNonConfigurationInstance()
    {
        // Save the SpeechKit instance, because we know the Activity will be
        // immediately recreated.
        SpeechKit sk = _speechKit;
        _speechKit = null; // Prevent onDestroy() from releasing SpeechKit
        return sk;
    }
}