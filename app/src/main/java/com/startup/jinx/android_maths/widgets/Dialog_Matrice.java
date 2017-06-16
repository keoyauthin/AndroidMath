package com.startup.jinx.android_maths.widgets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.startup.jinx.android_maths.R;

/**
 * Created by Mégane Vilain on 14/06/2017.
 * Project Utils-Math
 */

public class Dialog_Matrice extends Activity {


    RadioButton radioButton_Row, radioButton_Col;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dialog_matrice);

        final RadioGroup radioGroup_Row = (RadioGroup) findViewById(R.id.radiogroup_row);
        final RadioGroup radioGroup_Col = (RadioGroup) findViewById(R.id.radiogroup_col);

        radioButton_Col = (RadioButton) findViewById(R.id.radio_button_col_1);
        radioButton_Row = (RadioButton) findViewById(R.id.radio_button_1);

        Button btnOk = (Button) findViewById(R.id.button_ok);
        Button btnCancel = (Button) findViewById(R.id.button_cancel);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( (radioGroup_Row.getCheckedRadioButtonId() <= 0) || (radioGroup_Col.getCheckedRadioButtonId() <= 0) )
                    if((radioGroup_Row.getCheckedRadioButtonId() <= 0)) {
                        radioButton_Row.setError(getString(R.string.matrice_erreur));
                    }
                    if ((radioGroup_Col.getCheckedRadioButtonId() <= 0)){
                        radioButton_Col.setError(getString(R.string.matrice_erreur));
                    }
                else{
                        String row = ((RadioButton) findViewById(radioGroup_Row.getCheckedRadioButtonId())).getText().toString();
                        String col = ((RadioButton) findViewById(radioGroup_Col.getCheckedRadioButtonId())).getText().toString();

                        Intent returnIntent = new Intent();
                        returnIntent.putExtra("row", row);
                        returnIntent.putExtra("col", col);

                        setResult(Activity.RESULT_OK, returnIntent);
                        finish();
                    }

            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                setResult(Activity.RESULT_CANCELED, returnIntent);
                finish();
            }
        });

    }

}