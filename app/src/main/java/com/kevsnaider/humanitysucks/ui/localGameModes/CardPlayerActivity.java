package com.kevsnaider.humanitysucks.ui.localGameModes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kevsnaider.humanitysucks.R;

import java.util.Locale;
import java.util.Random;

public class CardPlayerActivity extends AppCompatActivity implements  View.OnClickListener {
    Random random = new Random();
    Integer card1 = -1, card2 = -1, card3 = -1, card4 = -1;
    String card_text1, card_text2, card_text3, card_text4, user_locale;
    String[] cards_en, cards_es, cards_ca;
    Button btn_change_cards;
    TextView tv_card1, tv_card2, tv_card3, tv_card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_player);

        user_locale = Locale.getDefault().getLanguage();
        initializeCardsArray();

        tv_card1 = findViewById(R.id.tv_card1);
        tv_card1.setTextSize(17);
        tv_card2 = findViewById(R.id.tv_card2);
        tv_card2.setTextSize(17);
        tv_card3 = findViewById(R.id.tv_card3);
        tv_card3.setTextSize(17);
        tv_card4 = findViewById(R.id.tv_card4);
        tv_card4.setTextSize(17);

        card_text1 = changeCard1Value();
        card_text2 = changeCard2Value();
        card_text3 = changeCard3Value();
        card_text4 = changeCard4Value();

        tv_card1.setText(card_text1);
        tv_card2.setText(card_text2);
        tv_card3.setText(card_text3);
        tv_card4.setText(card_text4);

        btn_change_cards = findViewById(R.id.btn_change_cards);
        btn_change_cards.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.btn_change_cards)) {
            card_text1 = changeCard1Value();
            card_text2 = changeCard2Value();
            card_text3 = changeCard3Value();
            card_text4 = changeCard4Value();

            tv_card1.setText(card_text1);
            tv_card2.setText(card_text2);
            tv_card3.setText(card_text3);
            tv_card4.setText(card_text4);
        }
    }

    private String changeCard1Value() {
        if (user_locale.equals("es")) {
            do {
                card1 = random.nextInt(cards_es.length);
            } while (card1 == card2 || card1 == card3 || card1 == card4);

            return cards_es[card1];
        } else if (user_locale.equals("ca")) {
            do {
                card1 = random.nextInt(cards_ca.length);
            } while (card1 == card2 || card1 == card3 || card1 == card4);

            return cards_ca[card1];
        } else {
            do {
                card1 = random.nextInt(cards_en.length);
            } while (card1 == card2 || card1 == card3 || card1 == card4);

            return cards_en[card1];
        }
    }

    private String changeCard2Value() {
        if (user_locale.equals("es")) {
            do {
                card2 = random.nextInt(cards_es.length);
            } while (card2 == card1 || card2 == card3 || card2 == card4);

            return cards_es[card2];
        } else if (user_locale.equals("ca")) {
            do {
                card2 = random.nextInt(cards_ca.length);
            } while (card2 == card1 || card2 == card3 || card2 == card4);

            return cards_ca[card2];
        } else {
            do {
                card2 = random.nextInt(cards_en.length);
            } while (card2 == card1 || card2 == card3 || card2 == card4);

            return cards_en[card2];
        }
    }

    private String changeCard3Value() {
        if (user_locale.equals("es")) {
            do {
                card3 = random.nextInt(cards_es.length);
            } while (card3 == card1 || card3 == card2 || card3 == card4);

            return cards_es[card3];
        } else if (user_locale.equals("ca")) {
            do {
                card3 = random.nextInt(cards_ca.length);
            } while (card3 == card1 || card3 == card2 || card3 == card4);

            return cards_ca[card3];
        } else {
            do {
                card3 = random.nextInt(cards_en.length);
            } while (card3 == card1 || card3 == card2 || card3 == card4);

            return cards_en[card3];
        }
    }

    private String changeCard4Value() {
        if (user_locale.equals("es")) {
            do {
                card4 = random.nextInt(cards_es.length);
            } while (card4 == card1 || card4 == card2 || card4 == card3);

            return cards_es[card4];
        } else if (user_locale.equals("ca")) {
            do {
                card4 = random.nextInt(cards_ca.length);
            } while (card4 == card1 || card4 == card2 || card4 == card3);

            return cards_ca[card4];
        } else {
            do {
                card4 = random.nextInt(cards_en.length);
            } while (card4 == card1 || card4 == card2 || card4 == card3);

            return cards_en[card4];
        }
    }

    private void initializeCardsArray() {
        cards_en = new String[]{
                "Silence.",
                "The illusion of\nchoice in\na late-stage\ncapitalist society.",
                "Many bats.",
                "Famine.",
                "Flesh-eating\nbacteria.",
                "Flying sex snakes.",
                "Not giving a\nshit about the\nThird World.",
                "Magnets.",
                "Shapeshifters.",
                "Seeing what\nhappens when\nyou lock people\nin a room with\nhungry seagulls.",
                "A crucifixion.",
                "Jennifer\nLawrence.",
                "72 virgins.",
                "A live studio\naudience.",
                "A time travel\nparadox.",
                "Authentic\nMexican cuisine.",
                "Doing crimes.",
                "Synergistic\nmanagement\nsolutions.",
                "Crippling debt.",
                "Daddy issues."
        };

        cards_es = new String[] {
                "Barack Obama.",
                "Txeroki.",
                "Esperanza\nAguirre.",
                "Correrse en una\npiscina llena de\nlagrimas de niño.",
                "Un sombrero\nmuy guay.",
                "Auschwitz.",
                "Tirarse un pedo\ne irse.",
                "Un pelo púbico\ndesviado.",
                "Pelotas.",
                "Rito de\napareamiento.",
                "Olor a viejos.",
                "Un terrorista\ngracioso.",
                "Fuego amigo.",
                "Frigo pie.",
                "Keanu Reeves.",
                "Carne de vaca\nloca.",
                "Christopher\nWalken.",
                "Sean Connery.",
                "Sean Penn.",
                "El huracán\nKatrina."
        };

        cards_ca = new String[] {
                "Barack Obama.",
                "Txeroki.",
                "Esperanza\nAguirre.",
                "Córrer-se en una\npiscina plena de\nllàgrimes de nen.",
                "Un barret\nmolt guay.",
                "Auschwitz.",
                "Tirar-se un pet\ni anar-se.",
                "Un pèl púbic\ndesviat.",
                "Pilotes.",
                "Ritual\n d'aparellament.",
                "Olor a vells.",
                "Un terrorista\ngraciós.",
                "Foc amic.",
                "Frigo pie.",
                "Keanu Reeves.",
                "Carn de vaca\nboja.",
                "Christopher\nWalken.",
                "Sean Connery.",
                "Sean Penn.",
                "L'huracà\nKatrina."
        };
    }
}
