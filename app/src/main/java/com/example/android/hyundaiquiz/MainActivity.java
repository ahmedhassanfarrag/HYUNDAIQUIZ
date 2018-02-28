package com.example.android.hyundaiquiz;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // when the user click check Your Score button.
    public void checkYourScore(View v) {
        // when the user chose the answer form Radio button .
        RadioButton Japan = (RadioButton) findViewById(R.id.Japan);
        boolean hasJapan = Japan.isChecked();
        RadioButton China = (RadioButton) findViewById(R.id.China);
        boolean hasChina = China.isChecked();
        RadioButton southKorea = (RadioButton) findViewById(R.id.South_Korea);
        boolean hassouthKorea = southKorea.isChecked();
        RadioButton speed388 = (RadioButton) findViewById(R.id.top_speed_388);
        boolean hasSpeed388 = speed388.isChecked();
        RadioButton speed429 = (RadioButton) findViewById(R.id.top_speed_429);
        boolean hasSpeed429 = speed429.isChecked();
        RadioButton speed317 = (RadioButton) findViewById(R.id.top_speed_317);
        boolean hasSpeed317 = speed317.isChecked();
        RadioButton heundaiSlogan = (RadioButton) findViewById(R.id.New_Thinking_New_Possibilities);
        boolean hasheundaiSlogan = heundaiSlogan.isChecked();
        RadioButton ThePowerToSurprise = (RadioButton) findViewById(R.id.The_Power_to_Surprise);
        boolean hasthePowerToSurprise = ThePowerToSurprise.isChecked();
        RadioButton neverFollow = (RadioButton) findViewById(R.id.Never_Follow);
        boolean hasneverFollow = neverFollow.isChecked();
        RadioButton size18 = (RadioButton) findViewById(R.id.size_18_inch);
        boolean hasSize18 = size18.isChecked();
        RadioButton size19 = (RadioButton) findViewById(R.id.size_19_inch);
        boolean hasSize19 = size19.isChecked();
        RadioButton size20 = (RadioButton) findViewById(R.id.size_20_inch);
        boolean hasSize20 = size20.isChecked();
        RadioButton azeraLimited = (RadioButton) findViewById(R.id.Azera_Limited);
        boolean hasazeraLimited = azeraLimited.isChecked();
        RadioButton genesisCoupe = (RadioButton) findViewById(R.id.Genesis_Coupe);
        boolean hasGenesisCoupe = genesisCoupe.isChecked();
        RadioButton Genesissedan = (RadioButton) findViewById(R.id.Genesis_sedan);
        boolean hasGenesissedan = Genesissedan.isChecked();
        // when the user Edit the answer form edit text .
        EditText answerYear = (EditText) findViewById(R.id.answer_Year);
        String isAnswerYear = answerYear.getText().toString();
        // when the user chose the answer form CheckBOX .
        CheckBox q4c1 = (CheckBox) findViewById(R.id.Excel);
        boolean isq4c1 = q4c1.isChecked();
        CheckBox q4c2 = (CheckBox) findViewById(R.id.Pulsar);
        boolean isq4c2 = q4c2.isChecked();
        CheckBox q4c3 = (CheckBox) findViewById(R.id.Cerato);
        boolean isq4c3 = q4c3.isChecked();
        CheckBox q4c4 = (CheckBox) findViewById(R.id.i10);
        boolean isq4c4 = q4c4.isChecked();
        CheckBox q5c1 = (CheckBox) findViewById(R.id.Suzuki);
        boolean isq5c1 = q5c1.isChecked();
        CheckBox q5c2 = (CheckBox) findViewById(R.id.Isuzu);
        boolean isq5c2 = q5c2.isChecked();
        CheckBox q5c3 = (CheckBox) findViewById(R.id.Kia);
        boolean isq5c3 = q5c3.isChecked();
        CheckBox q5c4 = (CheckBox) findViewById(R.id.SsangYong);
        boolean isq5c4 = q5c4.isChecked();
        // Discover how many question are correct.
        int totalScore = firstCalcolateScore(hasJapan, hasChina, hassouthKorea, hasSpeed388, hasSpeed429, hasSpeed317,
                hasheundaiSlogan, hasthePowerToSurprise, hasneverFollow, hasSize18, hasSize19, hasSize20, hasazeraLimited,
                hasGenesisCoupe, hasGenesissedan, isq4c1, isq4c2, isq4c3, isq4c4, isAnswerYear, isq5c1, isq5c2, isq5c3, isq5c4);
        String orderMassege = createOrderScore(totalScore);
        if (hasJapan == false && hasChina == false && hassouthKorea == true && hasSpeed429 == true && hasSpeed317 == false && hasSpeed388 == false &&
                hasheundaiSlogan == true && hasneverFollow == false && hasthePowerToSurprise == false && isq4c1 == false && isq4c2 == true && isq4c3 == true && isq4c4 == false &&
                "1967".equalsIgnoreCase(isAnswerYear) && isq5c1 == false && isq5c2 == false && isq5c3 == true && isq5c4 == true &&
                hasSize19 == true && hasSize18 == false && hasSize20 == false && hasGenesisCoupe == true && hasazeraLimited == false && hasGenesissedan == false)
            display(orderMassege);
        else {
            String orderMessage2 = createOrderScore2(totalScore);
            display(orderMessage2);
        }
    }

    // Discover if the question are correct or wrong based on the user's answer
    // and display the Toast message if is the question answer is missing.
    private int firstCalcolateScore(boolean hasJapan, boolean hasChina, boolean hassouthKorea, boolean hasSpeed388, boolean hasSpeed429,
                                    boolean hasSpeed317, boolean hasheundaiSlogan, boolean hasthePowerToSurprise,
                                    boolean hasneverFollow, boolean hasSize18, boolean hasSize19, boolean hasSize20,
                                    boolean hasazeraLimited, boolean hasGenesisCoupe, boolean hasGenesissedan,
                                    boolean isq4c1, boolean isq4c2, boolean isq4c3, boolean isq4c4, String AnswerYear, boolean isq5c1,
                                    boolean isq5c2, boolean isq5c3, boolean isq5c4) {
        int totalScore = 0;
        if (hassouthKorea == true)
            totalScore = totalScore + 1;
        if (hasJapan == false && hasChina == false && hassouthKorea == false)
            Toast.makeText(this, (R.string.Q_1_answer_is_missing_You_must_chose_1_choice), Toast.LENGTH_SHORT).show();
        if (hasSpeed429 == true)
            totalScore = totalScore + 1;
        if (hasSpeed429 == false && hasSpeed317 == false && hasSpeed388 == false)
            Toast.makeText(this, (R.string.Q_2_answer_is_missing_You_must_chose_1_choice), Toast.LENGTH_SHORT).show();
        if ((hasheundaiSlogan == true))
            totalScore = totalScore + 1;
        if (hasheundaiSlogan == false && hasneverFollow == false && hasthePowerToSurprise == false)
            Toast.makeText(this, (R.string.Q_3_answer_is_missing_You_must_chose_1_choice), Toast.LENGTH_SHORT).show();
        if (isq4c1 == false && isq4c2 == true && isq4c3 == true && isq4c4 == false)
            totalScore = totalScore + 1;
        if (isq4c1 == false && isq4c2 == false && isq4c3 == false && isq4c4 == false)
            Toast.makeText(this, (R.string.Q_4_answer_is_missing_You_must_chose_2_Check_box_only), Toast.LENGTH_SHORT).show();
        if ("1967".equalsIgnoreCase(AnswerYear))
            totalScore = totalScore + 1;
        if ("".equalsIgnoreCase(AnswerYear))
            Toast.makeText(this, (R.string.Q_5_answer_is_missing_You_must_edit_the_correct_Year), Toast.LENGTH_SHORT).show();
        if (isq5c1 == false && isq5c2 == false && isq5c3 == true && isq5c4 == true)
            totalScore = totalScore + 1;
        if (isq5c1 == false && isq5c2 == false && isq5c3 == false && isq5c4 == false)
            Toast.makeText(this, (R.string.Q_6_answer_is_missing_You_must_chose_2_Check_box_only), Toast.LENGTH_SHORT).show();
        if ((hasSize19 == true))
            totalScore = totalScore + 1;
        if (hasSize19 == false && hasSize18 == false && hasSize20 == false)
            Toast.makeText(this, (R.string.Q_7_answer_is_missing_You_must_chose_1_choice), Toast.LENGTH_SHORT).show();
        if ((hasGenesisCoupe == true))
            totalScore = totalScore + 1;
        if (hasGenesisCoupe == false && hasazeraLimited == false && hasGenesissedan == false)
            Toast.makeText(this, (R.string.Q_8_answer_is_missing_You_must_chose_1_choice), Toast.LENGTH_SHORT).show();
        return totalScore;
    }

    // display this message if the user answer all the questions correctly .
    private String createOrderScore(int totalScore) {
        String orderMassegee = getString(R.string.your_score_of_this_Quiz) + totalScore + getString(R.string._8_congratulations);
        TextView messageVisibility = (TextView) findViewById(R.id.number_of_score);
        messageVisibility.setVisibility(View.VISIBLE);
        messageVisibility.setTextColor(Color.BLUE);
        return orderMassegee;
    }

    // display this message if the user answer all the questions but not correctly .
    private String createOrderScore2(int totalScore) {
        String orderMassegee = getString(R.string.your_score_of_this_Quiz) + totalScore + getString(R.string._8_Try_Agan);
        TextView messageVisibility = (TextView) findViewById(R.id.number_of_score);
        messageVisibility.setVisibility(View.VISIBLE);
        messageVisibility.setTextColor(Color.RED);
        return orderMassegee;
    }

    // when the user click answer button.
    public void answer(View v) {
        ScrollView topScroll = (ScrollView) findViewById(R.id.scrol);
        topScroll.fullScroll(ScrollView.FOCUS_UP);
        RadioGroup southKorea = (RadioGroup) findViewById(R.id.RGroup1);
        southKorea.check(R.id.South_Korea);
        RadioGroup speed429 = (RadioGroup) findViewById(R.id.RGroup2);
        speed429.check(R.id.top_speed_429);
        RadioGroup heundaiSlogan = (RadioGroup) findViewById(R.id.RGroup3);
        heundaiSlogan.check(R.id.New_Thinking_New_Possibilities);
        RadioGroup size19 = (RadioGroup) findViewById(R.id.RGroup4);
        size19.check(R.id.size_19_inch);
        RadioGroup genesisCoupe = (RadioGroup) findViewById(R.id.RGroup5);
        genesisCoupe.check(R.id.Genesis_Coupe);
        EditText yearOfHyundai = (EditText) findViewById(R.id.answer_Year);
        yearOfHyundai.setText(R.string._1967);
        CheckBox pulsar = (CheckBox) findViewById(R.id.Pulsar);
        pulsar.setChecked(true);
        CheckBox cerato = (CheckBox) findViewById(R.id.Cerato);
        cerato.setChecked(true);
        CheckBox kia = (CheckBox) findViewById(R.id.Kia);
        kia.setChecked(true);
        CheckBox Sang = (CheckBox) findViewById(R.id.SsangYong);
        Sang.setChecked(true);
    }

    // when the user click reset button.
    public void reset(View v) {
        ScrollView topScroll = (ScrollView) findViewById(R.id.scrol);
        topScroll.fullScroll(ScrollView.FOCUS_UP);
        topScroll.setFocusableInTouchMode(true);
        TextView invisibleMessage = (TextView) findViewById(R.id.number_of_score);
        invisibleMessage.setVisibility(View.GONE);
        EditText yearOfHyundai = (EditText) findViewById(R.id.answer_Year);
        yearOfHyundai.setText(null);
        RadioGroup gr1 = (RadioGroup) findViewById(R.id.RGroup1);
        gr1.clearCheck();
        RadioGroup gr2 = (RadioGroup) findViewById(R.id.RGroup2);
        gr2.clearCheck();
        RadioGroup gr3 = (RadioGroup) findViewById(R.id.RGroup3);
        gr3.clearCheck();
        RadioGroup gr4 = (RadioGroup) findViewById(R.id.RGroup4);
        gr4.clearCheck();
        RadioGroup gr5 = (RadioGroup) findViewById(R.id.RGroup5);
        gr5.clearCheck();
        CheckBox excel = (CheckBox) findViewById(R.id.Excel);
        excel.setChecked(false);
        CheckBox pulsar = (CheckBox) findViewById(R.id.Pulsar);
        pulsar.setChecked(false);
        CheckBox cerato = (CheckBox) findViewById(R.id.Cerato);
        cerato.setChecked(false);
        CheckBox i10 = (CheckBox) findViewById(R.id.i10);
        i10.setChecked(false);
        CheckBox suzuki = (CheckBox) findViewById(R.id.Suzuki);
        suzuki.setChecked(false);
        CheckBox isuzu = (CheckBox) findViewById(R.id.Isuzu);
        isuzu.setChecked(false);
        CheckBox kia = (CheckBox) findViewById(R.id.Kia);
        kia.setChecked(false);
        CheckBox SsangYong = (CheckBox) findViewById(R.id.SsangYong);
        SsangYong.setChecked(false);
    }

    private void display(String text) {
        TextView score = (TextView) findViewById(R.id.number_of_score);
        score.setText(text);
    }
}