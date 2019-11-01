package org.pltw.examples.synthesizer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.NumberPicker;

public class SynthesizerActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private static final String TAG =
            SynthesizerActivity.class.getName();
    CheckBox cb;
    private Button maButton;
    private Button mbButton;
    private Button mbbButton;
    private Button mcButton;
    private Button mcsButton;
    private Button mdButton;
    private Button mdsButton;
    private Button meButton;
    private Button mfButton;
    private Button mfsButton;
    private Button mgButton;
    private Button mgsButton;
    private Button mhigheButton;
    private Button mhighfButton;
    private Button mhighfsButton;
    private Button mhighgButton;
    private MediaPlayer mpa;
    private MediaPlayer mpb;
    private MediaPlayer mpbb;
    private MediaPlayer mpc;
    private MediaPlayer mpcs;
    private MediaPlayer mpd;
    private MediaPlayer mpds;
    private MediaPlayer mpe;
    private MediaPlayer mpf;
    private MediaPlayer mpfs;
    private MediaPlayer mpg;
    private MediaPlayer mpgs;
    private MediaPlayer mphighe;
    private MediaPlayer mphighf;
    private MediaPlayer mphighfs;
    private MediaPlayer mphighg;
    private NumberPicker numberPickerNote;
    private NumberPicker numberPickerAmount;
    private NumberPicker twinklePickerAmount;
    private int timesPlayed = 1;
    private MediaPlayer selectedNote = mpa;
    private MediaPlayer[] mediaFiles;
    private CheckBox checkBox;
    private int linetwo;
    //private MediaPlayer[] mediaFiles = {mpa, mpb, mpbb, mpc, mpcs, mpd, mpds, mpe, mpf, mpfs, mpg, mpgs, mphighe, mphighf, mphighfs, mphighg};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        maButton = (Button) findViewById(R.id.aButton);
        mbButton = (Button) findViewById(R.id.bButton);
        mbbButton = (Button) findViewById(R.id.bbButton);
        mcButton = (Button) findViewById(R.id.cButton);
        mcsButton = (Button) findViewById(R.id.csButton);
        mdButton = (Button) findViewById(R.id.dButton);
        mdsButton = (Button) findViewById(R.id.dsButton);
        meButton = (Button) findViewById(R.id.eButton);
        mfButton = (Button) findViewById(R.id.fButton);
        mfsButton = (Button) findViewById(R.id.fsButton);
        mgButton = (Button) findViewById(R.id.gButton);
        mgsButton = (Button) findViewById(R.id.gsButton);
        mhigheButton = (Button) findViewById(R.id.higheButton);
        mhighfButton = (Button) findViewById(R.id.highfButton);
        mhighfsButton = (Button) findViewById(R.id.highfsButton);
        mhighgButton = (Button) findViewById(R.id.highgButton);
        mpa = MediaPlayer.create(this, R.raw.scalea);
        mpb = MediaPlayer.create(this, R.raw.scaleb);
        mpbb = MediaPlayer.create(this, R.raw.scalebb);
        mpc = MediaPlayer.create(this, R.raw.scalec);
        mpcs = MediaPlayer.create(this, R.raw.scalecs);
        mpd = MediaPlayer.create(this, R.raw.scaled);
        mpds = MediaPlayer.create(this, R.raw.scaleds);
        mpe = MediaPlayer.create(this, R.raw.scalee);
        mpf = MediaPlayer.create(this, R.raw.scalef);
        mpfs = MediaPlayer.create(this, R.raw.scalefs);
        mpg = MediaPlayer.create(this, R.raw.scaleg);
        mpgs = MediaPlayer.create(this, R.raw.scalegs);
        mphighe = MediaPlayer.create(this, R.raw.scalehighe);
        mphighf = MediaPlayer.create(this, R.raw.scalehighf);
        mphighfs = MediaPlayer.create(this, R.raw.scalehighfs);
        mphighg = MediaPlayer.create(this, R.raw.scalehighg);
        mediaFiles = new MediaPlayer[]{mpa, mpb, mpbb, mpc, mpcs, mpd, mpds, mpe, mpf, mpfs, mpg, mpgs, mphighe, mphighf, mphighfs, mphighg};
        numberPickerNote = (NumberPicker) findViewById(R.id.numberPicker);
        numberPickerAmount = (NumberPicker) findViewById(R.id.numberPicker2);
        twinklePickerAmount = (NumberPicker) findViewById(R.id.numberPicker3);
        numberPickerNote.setMinValue(1);
        numberPickerNote.setMaxValue(16);
        numberPickerAmount.setMinValue(1);
        numberPickerAmount.setMaxValue(10);
        twinklePickerAmount.setValue(2);
        twinklePickerAmount.setMinValue(0);
        twinklePickerAmount.setMaxValue(10);
        cb = (CheckBox) findViewById(R.id.checkBox);
        numberPickerNote.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
               selectedNote = mediaFiles[numberPickerNote.getValue() - 1];
            }
        });

        numberPickerAmount.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                timesPlayed = numberPickerAmount.getValue();
            }
        });

    }

    public void checkone (View v) {
        if (cb.isChecked()) {
            linetwo = twinklePickerAmount.getValue();
        }
        else
        {
            linetwo = -1;
        }
    }


    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }

    public void onClickaButton(View v) {
        mpa.seekTo(0);
        Log.i(TAG, "A Button clicked");
        mpa.start();
    }


    public void onClickbButton(View v) {
        mpb.seekTo(0);
        Log.i(TAG, "B Button clicked");
        mpb.start();
    }

    public void onClickbbButton(View v) {
        mpbb.seekTo(0);
        Log.i(TAG, "Bb Button clicked");
        mpbb.start();
    }

    public void onClickcButton(View v) {
        mpc.seekTo(0);
        Log.i(TAG, "C Button clicked");
        mpc.start();
    }

    public void onClickcsButton(View v) {
        mpcs.seekTo(0);
        Log.i(TAG, "C# Button clicked");
        mpcs.start();
    }

    public void onClickdButton(View v) {
        mpd.seekTo(0);
        Log.i(TAG, "D Button clicked");
        mpd.start();
    }

    public void onClickdsButton(View v) {
        mpds.seekTo(0);
        Log.i(TAG, "D# Button clicked");
        mpds.start();
    }

    public void onClickeButton(View v) {
        mpe.seekTo(0);
        Log.i(TAG, "E Button clicked");
        mpe.start();
    }

    public void onClickfButton(View v) {
        mpf.seekTo(0);
        Log.i(TAG, "F Button clicked");
        mpf.start();
    }

    public void onClickfsButton(View v) {
        mpfs.seekTo(0);
        Log.i(TAG, "F# Button clicked");
        mpfs.start();
    }

    public void onClickgButton(View v) {
        mpg.seekTo(0);
        Log.i(TAG, "G Button clicked");
        mpg.start();
    }

    public void onClickgsButton(View v) {
        mpgs.seekTo(0);
        Log.i(TAG, "G# Button clicked");
        mpgs.start();
    }

    public void onClickhigheButton(View v) {
        mphighe.seekTo(0);
        Log.i(TAG, "High E Button clicked");
        mphighe.start();
    }

    public void onClickhighfButton(View v) {
        mphighf.seekTo(0);
        Log.i(TAG, "High F Button clicked");
        mphighf.start();
    }

    public void onClickhighfsButton(View v) {
        mphighfs.seekTo(0);
        Log.i(TAG, "High F# Button clicked");
        mphighfs.start();
    }

    public void onClickhighgButton(View v) {
        mphighg.seekTo(0);
        Log.i(TAG, "High G Button clicked");
        mphighg.start();
    }

    public void onClickchallengeOneButton(View v) {
        try {
            mpe.seekTo(0);
            mpe.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpfs.seekTo(0);
            mpfs.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpg.seekTo(0);
            mpg.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpa.seekTo(0);
            mpa.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpb.seekTo(0);
            mpb.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpcs.seekTo(0);
            mpcs.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpd.seekTo(0);
            mpd.start();
            delayPlaying(WHOLE_NOTE / 2);
            mphighe.seekTo(0);
            mphighe.start();
            delayPlaying(WHOLE_NOTE / 2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void onSelectedNoteClick(View v) {
        for (int i = numberPickerAmount.getValue(); i > 0; i--) {
            try {
                //mpa.seekTo(0);
                mediaFiles[(numberPickerNote.getValue() - 1)].seekTo(0);
              // mpa.start();
                mediaFiles[(numberPickerNote.getValue() - 1)].start();
                delayPlaying(WHOLE_NOTE / 2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void onTwinkleClick(View v) {
        try {
            mediaFiles[0].seekTo(0);
            mediaFiles[0].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[0].seekTo(0);
            mediaFiles[0].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[12].seekTo(0);
            mediaFiles[12].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[12].seekTo(0);
            mediaFiles[12].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[14].seekTo(0);
            mediaFiles[14].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[14].seekTo(0);
            mediaFiles[14].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[12].seekTo(0);
            mediaFiles[12].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[4].seekTo(0);
            mediaFiles[4].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[4].seekTo(0);
            mediaFiles[4].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[1].seekTo(0);
            mediaFiles[1].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[1].seekTo(0);
            mediaFiles[1].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[0].seekTo(0);
            mediaFiles[0].start();

            for(int i = linetwo; i > 0;) {

                    delayPlaying(WHOLE_NOTE);
                    mediaFiles[12].seekTo(0);
                    mediaFiles[12].start();
                    delayPlaying(WHOLE_NOTE);
                    mediaFiles[12].seekTo(0);
                    mediaFiles[12].start();
                    delayPlaying(WHOLE_NOTE);
                    mediaFiles[5].seekTo(0);
                    mediaFiles[5].start();
                    delayPlaying(WHOLE_NOTE);
                    mediaFiles[5].seekTo(0);
                    mediaFiles[5].start();
                    delayPlaying(WHOLE_NOTE);
                    mediaFiles[4].seekTo(0);
                    mediaFiles[4].start();
                    delayPlaying(WHOLE_NOTE);
                    mediaFiles[4].seekTo(0);
                    mediaFiles[4].start();
                    delayPlaying(WHOLE_NOTE);
                    mediaFiles[1].seekTo(0);
                    mediaFiles[1].start();
                    i=i-1;
            }
            delayPlaying(WHOLE_NOTE);
            mediaFiles[0].seekTo(0);
            mediaFiles[0].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[0].seekTo(0);
            mediaFiles[0].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[12].seekTo(0);
            mediaFiles[12].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[12].seekTo(0);
            mediaFiles[12].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[14].seekTo(0);
            mediaFiles[14].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[14].seekTo(0);
            mediaFiles[14].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[12].seekTo(0);
            mediaFiles[12].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[4].seekTo(0);
            mediaFiles[4].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[4].seekTo(0);
            mediaFiles[4].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[1].seekTo(0);
            mediaFiles[1].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[1].seekTo(0);
            mediaFiles[1].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[0].seekTo(0);
            mediaFiles[0].start();
            delayPlaying(WHOLE_NOTE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onFavoriteClick(View v) {
        try {
            mediaFiles[7].seekTo(0);
            mediaFiles[7].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[7].seekTo(0);
            mediaFiles[7].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[8].seekTo(0);
            mediaFiles[8].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[10].seekTo(0);
            mediaFiles[10].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[10].seekTo(0);
            mediaFiles[10].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[8].seekTo(0);
            mediaFiles[8].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[7].seekTo(0);
            mediaFiles[7].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[3].seekTo(0);
            mediaFiles[3].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[3].seekTo(0);
            mediaFiles[3].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[7].seekTo(0);
            mediaFiles[7].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[7].seekTo(0);
            mediaFiles[7].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            mediaFiles[7].seekTo(0);
            mediaFiles[7].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[7].seekTo(0);
            mediaFiles[7].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[8].seekTo(0);
            mediaFiles[8].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[10].seekTo(0);
            mediaFiles[10].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[10].seekTo(0);
            mediaFiles[10].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[8].seekTo(0);
            mediaFiles[8].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[7].seekTo(0);
            mediaFiles[7].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[3].seekTo(0);
            mediaFiles[3].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[3].seekTo(0);
            mediaFiles[3].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[7].seekTo(0);
            mediaFiles[7].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[7].seekTo(0);
            mediaFiles[7].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();
            delayPlaying(WHOLE_NOTE);
            mediaFiles[5].seekTo(0);
            mediaFiles[5].start();


        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

